package com.dmoreira.fintech.ui.containers;

import com.dmoreira.fintech.cache.SimpleQuotesCache;
import com.dmoreira.fintech.domains.Bond;
import com.dmoreira.fintech.domains.Stock;
import com.dmoreira.fintech.listeners.QuotesUpdateListener;
import com.vaadin.data.util.BeanItemContainer;

import java.util.List;

/**
 * Created by diego.moreira on 11/11/2016.
 */
public class QuotesContainer<T> extends BeanItemContainer<T> implements QuotesUpdateListener<T> {

    private Class<T> entityType;

    public QuotesContainer(Class<T> type) throws IllegalArgumentException {
        super(type);
        this.entityType = type;
        if (type == Stock.class) {
            SimpleQuotesCache.addStockQuotesUpdateListener(this);
        } else if (type == Bond.class) {
            SimpleQuotesCache.addBondQuotesUpdateListener(this);
        }
    }

    @Override
    public void handleQuotesUpdate(List<T> quotes) {
        this.removeAllItems();
        this.addAll(quotes);
    }

    @Override
    protected void finalize() throws Throwable {
        if (entityType == Stock.class) {
            SimpleQuotesCache.removeStockQuotesUpdateListener(this);
        }
        if (entityType == Bond.class) {
            SimpleQuotesCache.removeBondQuotesUpdateListener(this);
        }
        super.finalize();
    }
}
