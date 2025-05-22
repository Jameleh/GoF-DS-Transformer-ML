package com.example.promotion_engine.service;

import com.example.promotion_engine.expression.ExpressionParser;
import com.example.promotion_engine.model.Campaign;
import com.example.promotion_engine.model.Order;
import com.example.promotion_engine.repository.CampaignRepository;
import com.example.promotion_engine.repository.OrderRepository;
import com.example.promotion_engine.service.order.IOrderService;
import com.example.promotion_engine.service.order.OrderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class OrderServiceTest {

    @Mock
    private CampaignRepository campaignRepository;

    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testApplyCampaignToOrder() {
        Order order = new Order(1L, true, 1200, 3, null);
        Campaign campaign = new Campaign(1L, "VIP Discount", "VIP AND TOTAL > 1000", true);

        when(campaignRepository.findByActiveTrue()).thenReturn(List.of(campaign));
        when(orderRepository.save(any(Order.class))).thenReturn(order);

        Order result = orderService.applyCampaignToOrder(order);

        assertEquals("VIP Discount", result.getAppliedCampaign());
        verify(orderRepository, times(1)).save(order);
    }

    @Test
    void testNoMatchingCampaign() {
        Order order = new Order(1L, false, 500, 2, null);
        Campaign campaign = new Campaign(1L, "VIP Discount", "VIP AND TOTAL > 1000", true);

        when(campaignRepository.findByActiveTrue()).thenReturn(List.of(campaign));
        when(orderRepository.save(any(Order.class))).thenReturn(order);

        Order result = orderService.applyCampaignToOrder(order);

        assertNull(result.getAppliedCampaign());
        verify(orderRepository, times(1)).save(order);
    }
}