package com.dmoreira.fintech.repositories.rest;

import com.dmoreira.fintech.domains.Stock;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by diego.moreira on 11/7/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MervalRestRepositoryTest.TestConfiguration.class)
public class MervalRestRepositoryTest {

    @Autowired
    MervalRestRepository mervalRestRepository;
    String token = "aXZhbGRlcGFibG9BRjBCMjczN0M3ODQ0OEJDNzFCNEYyMDE5N0U1N0VDODEx";

    @Ignore
    @Test
    public void testLogin() throws Exception {
        MervalConnection connection = mervalRestRepository.login(token);
    }

    @Test
    public void testGetTopStockPrices() throws Exception {
        List<Stock> prices = mervalRestRepository.getTopStockQuotes();
    }

    @Configuration
    public static class TestConfiguration {
        @Bean
        public RestTemplate restTemplate() {
            return new RestTemplate();
        }

        @Bean
        public MervalRestRepository mervalRestRepository() {
            String token = "aXZhbGRlcGFibG9BRjBCMjczN0M3ODQ0OEJDNzFCNEYyMDE5N0U1N0VDODEx";
            MervalRestRepository mervalRestRepository = new MervalRestRepository("https://wq.bolsar.com",
                    "/BWQ/WQLogin.aspx",
                    "/BWQ/WQAccionesLideres.aspx",
                    "",
                    token,
                    restTemplate());
            assertTrue("ACTIVE".equals(mervalRestRepository.getMervalConnection().getState()));
            return mervalRestRepository;
        }
    }

}