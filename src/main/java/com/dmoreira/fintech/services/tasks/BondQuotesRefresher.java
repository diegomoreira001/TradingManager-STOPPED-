package com.dmoreira.fintech.services.tasks;

import com.dmoreira.fintech.cache.SimpleQuotesCache;
import com.dmoreira.fintech.services.BondQuotesService;
import com.vaadin.external.org.slf4j.Logger;
import com.vaadin.external.org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by diego.moreira on 11/9/2016.
 */

public class BondQuotesRefresher implements Runnable {

    final Logger logger = LoggerFactory.getLogger(BondQuotesRefresher.class);

    @Autowired
    BondQuotesService bondQuotesService;

    @Override
    public void run() {
        logger.info("[Refreshing Quote]");
        SimpleQuotesCache.setBondQuotes(bondQuotesService.listTopBondQuotes());
    }
}
