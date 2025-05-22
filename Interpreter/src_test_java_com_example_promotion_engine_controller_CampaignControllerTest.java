package com.example.promotion_engine.controller;

import com.example.promotion_engine.dto.CampaignDTO;
import com.example.promotion_engine.service.campaign.ICampaignService;
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

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CampaignController.class)
@ExtendWith(SpringExtension.class)
@Import(CampaignControllerTest.Config.class)
class CampaignControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ICampaignService campaignService;

    @BeforeEach
    void setUp() {
        when(campaignService.getActiveCampaigns()).thenReturn(List.of(
                new CampaignDTO(1L, "VIP Discount", "VIP AND TOTAL > 1000", true)
        ));
    }

    @Test
    void testGetAllCampaigns() throws Exception {
        mockMvc.perform(get("/api/campaigns"))
                .andExpect(status().isOk())
                .andExpect(content().json("""
                    [
                        {"id":1, "name":"VIP Discount", "rule":"VIP AND TOTAL > 1000", "active":true}
                    ]
                """));
    }

    @Test
    void testAddCampaign() throws Exception {
        String campaignJson = """
            {
                "id": 2,
                "name": "Bulk Discount",
                "rule": "ITEM_COUNT >= 5",
                "active": true
            }
        """;

        when(campaignService.addCampaign(Mockito.any(CampaignDTO.class)))
                .thenReturn(new CampaignDTO(2L, "Bulk Discount", "ITEM_COUNT >= 5", true));

        mockMvc.perform(post("/api/campaigns")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(campaignJson))
                .andExpect(status().isOk())
                .andExpect(content().json(campaignJson));
    }

    static class Config {
        @Bean
        public ICampaignService campaignService() {
            return Mockito.mock(ICampaignService.class);
        }
    }
}