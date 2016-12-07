package com.dmoreira.fintech.cache;

import com.dmoreira.fintech.domains.Bond;
import com.dmoreira.fintech.domains.Stock;
import com.dmoreira.fintech.listeners.QuotesUpdateListener;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by diego.moreira on 11/10/2016.
 */
public class SimpleQuotesCache {

    private static List<Stock> stockQuotes = new ArrayList<>();
    private static List<Bond> bondQuotes = new ArrayList<>();

    private static List<QuotesUpdateListener<Stock>> stockQuotesUpdateListener = new CopyOnWriteArrayList<>();
    private static List<QuotesUpdateListener<Bond>> bondQuotesUpdateListener = new CopyOnWriteArrayList<>();

    public static void addStockQuotesUpdateListener(QuotesUpdateListener listener) {
        stockQuotesUpdateListener.add(listener);
    }

    public static void addBondQuotesUpdateListener(QuotesUpdateListener listener) {
        bondQuotesUpdateListener.add(listener);
    }

    public static void removeStockQuotesUpdateListener(QuotesUpdateListener listener) {
        stockQuotesUpdateListener.remove(listener);
    }

    public static void removeBondQuotesUpdateListener(QuotesUpdateListener listener) {
        bondQuotesUpdateListener.remove(listener);
    }

    public static void notifyStockQuotesListeners() {
        for (QuotesUpdateListener listener : stockQuotesUpdateListener) {
            listener.handleQuotesUpdate(stockQuotes);
        }
    }

    public static void notifyBondQuotesListeners() {
        for (QuotesUpdateListener listener : bondQuotesUpdateListener) {
            listener.handleQuotesUpdate(bondQuotes);
        }
    }

    public static List<Stock> getStockQuotes() {
        return stockQuotes;
    }

    public static void setStockQuotes(List<Stock> stockQuotes) {
        SimpleQuotesCache.stockQuotes = stockQuotes;
        notifyStockQuotesListeners();
    }

    public static List<Bond> getBondQuotes() {
        return bondQuotes;
    }

    public static void setBondQuotes(List<Bond> bondQuotes) {
        SimpleQuotesCache.bondQuotes = bondQuotes;
        notifyBondQuotesListeners();
    }
}
