package com.example.promotion_engine.service.order;

import com.example.promotion_engine.expression.Expression;
import com.example.promotion_engine.expression.ExpressionParser;
import com.example.promotion_engine.model.Campaign;
import com.example.promotion_engine.model.Order;
import com.example.promotion_engine.repository.CampaignRepository;
import com.example.promotion_engine.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class OrderService implements IOrderService {
    private final CampaignRepository campaignRepository;
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(CampaignRepository campaignRepository, OrderRepository orderRepository) {
        this.campaignRepository = campaignRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public Order applyCampaignToOrder(Order order) {
        log.info("Applying campaign to order...");

        List<Campaign> activeCampaigns = campaignRepository.findByActiveTrue();

        for (Campaign campaign : activeCampaigns) {
            Expression ruleExpression = ExpressionParser.parse(campaign.getRule());
            if (ruleExpression.interpret(order)) {
                log.info("Campaign '{}' applied to order ID: {}", campaign.getName(), order.getId());
                order.setAppliedCampaign(campaign.getName());
                break;
            }
        }

        return orderRepository.save(order);
    }
}