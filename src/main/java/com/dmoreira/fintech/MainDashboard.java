package com.dmoreira.fintech;

import com.vaadin.navigator.View;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Grid;
import org.springframework.stereotype.Component;

/**
 * Created by diego.moreira on 11/6/2016.
 */
public class MainDashboard extends DashboardDesign {

    public Grid getQuotesGrid() {
        return this.quotesGrid;
    }

    public void setQuotesGrid(Grid quotesgrid) {
        this.quotesGrid = quotesgrid;
    }

    public ComboBox getDueCombo() {
        return this.dueCombo;
    }

    public void setDueCombo(ComboBox dueCombo) { this.dueCombo = dueCombo; }
}
