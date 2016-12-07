package com.dmoreira.fintech.spring.configuration;

import com.dmoreira.fintech.domains.mappers.HtmlBondMapper;
import com.dmoreira.fintech.domains.mappers.HtmlStockMapper;
import com.dmoreira.fintech.domains.Stock;
import com.dmoreira.fintech.repositories.rest.MervalRestRepository;
import com.dmoreira.fintech.services.tasks.BondQuotesRefresher;
import com.dmoreira.fintech.services.tasks.StockQuotesRefresher;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.spring.annotation.EnableVaadin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/**
 * Created by diego.moreira on 11/7/2016.
 */

@Configuration
@EnableVaadin
public class MainConfiguration {

    String token = "aXZhbGRlcGFibG9BRjBCMjczN0M3ODQ0OEJDNzFCNEYyMDE5N0U1N0VDODEx";

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public HtmlStockMapper htmlStockMapper() {
        return new HtmlStockMapper();
    }

    @Bean
    public HtmlBondMapper htmlBondMapper() {
        return new HtmlBondMapper();
    }

    @Bean
    public MervalRestRepository mervalRestRepository() {
        return new MervalRestRepository("https://wq.bolsar.com",
                "/BWQ/WQLogin.aspx",
                "/BWQ/WQAccionesLideres.aspx",
                "/BWQ/WQTitulosPublicos.aspx",
                token,
                restTemplate());
    }

    @Bean
    public StockQuotesRefresher stockQuotesRefresher(){
        return new StockQuotesRefresher();
    }
    @Bean
    public BondQuotesRefresher bondQuotesRefresher(){
        return new BondQuotesRefresher();
    }

    @Bean
    public TaskScheduler taskScheduler() {
        TaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
        return taskScheduler;
    }

    @Bean
    public ScheduledFuture stockQuotesRefreshSchedule() {
        return taskScheduler().scheduleWithFixedDelay(stockQuotesRefresher(), 45000);
    }
    @Bean
    public ScheduledFuture bondQuotesRefreshSchedule() {
        return taskScheduler().scheduleWithFixedDelay(bondQuotesRefresher(), 45000);
    }
}
