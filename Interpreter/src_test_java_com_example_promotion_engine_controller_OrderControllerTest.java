package com.example.promotion_engine.controller;

import com.example.promotion_engine.model.Order;
import com.example.promotion_engine.service.order.IOrderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(OrderController.class)
@ExtendWith(SpringExtension.class)
@Import(OrderControllerTest.Config.class) // Mock servisi test context'e ekliyoruz
class OrderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private IOrderService orderService;

    private Order sampleOrder;

    @BeforeEach
    void setUp() {
        sampleOrder = new Order(1L, true, 1200, 3, "VIP Discount");

        when(orderService.applyCampaignToOrder(Mockito.any(Order.class))).thenReturn(sampleOrder);
    }

    @Test
    void testApplyCampaign() throws Exception {
        String orderJson = """
            {
                "id": 1,
                "isVIP": true,
                "totalAmount": 1200,
                "itemCount": 3
            }
        """;

        mockMvc.perform(post("/api/orders/apply-campaign")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(orderJson))
                .andExpect(status().isOk())
                .andExpect(content().json("""
                    {
                        "id": 1,
                        "isVIP": true,
                        "totalAmount": 1200,
                        "itemCount": 3,
                        "appliedCampaign": "VIP Discount"
                    }
                """));
    }

    static class Config {
        @Bean
        public IOrderService orderService() {
            return Mockito.mock(IOrderService.class);
        }
    }
}