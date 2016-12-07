package com.dmoreira.fintech.listeners;

import java.util.List;

/**
 * Created by diego.moreira on 11/11/2016.
 */
public interface QuotesUpdateListener<T> {

    public void handleQuotesUpdate(List<T> quotes);

}
