package com.dmoreira.fintech.services.tasks;

import com.dmoreira.fintech.cache.SimpleQuotesCache;
import com.dmoreira.fintech.domains.Stock;
import com.dmoreira.fintech.services.StockQuotesService;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.external.org.slf4j.LoggerFactory;
import com.vaadin.external.org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by diego.moreira on 11/9/2016.
 */

public class StockQuotesRefresher implements Runnable {

    final Logger logger = LoggerFactory.getLogger(StockQuotesRefresher.class);

    @Autowired
    StockQuotesService stockQuotesService;

    @Override
    public void run() {
        logger.info("[Refreshing Quote]");
        SimpleQuotesCache.setStockQuotes(stockQuotesService.listTopStockQuotes());
    }
}
