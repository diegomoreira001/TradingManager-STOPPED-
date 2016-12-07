package com.dmoreira.fintech.ui.windows;

import com.dmoreira.fintech.domains.Bond;
import com.dmoreira.fintech.ui.containers.QuotesContainer;
import com.vaadin.data.Container;
import com.vaadin.data.Property;
import com.vaadin.data.util.filter.SimpleStringFilter;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;


/**
 * Created by diego.moreira on 11/10/2016.
 */
public class BondQuotesWindow extends Window {

    private ComboBox dueCombo;
    private Grid quotesGrid;
    private QuotesContainer<Bond> beanItemContainer;


    public BondQuotesWindow() {

        super("Awesome Bond Quotes");
        beanItemContainer = new QuotesContainer<>(Bond.class);

        quotesGrid = new Grid();
        quotesGrid.setEditorEnabled(false);
        quotesGrid.setSizeFull();
        quotesGrid.setSelectionMode(Grid.SelectionMode.NONE);
        quotesGrid.setContainerDataSource(beanItemContainer);
        quotesGrid.setColumnOrder("ticker", "due", "trend","change", "bid", "bidQty", "ask", "askQty", "lastPrice");

        dueCombo = new ComboBox();
        dueCombo.addItems("Cdo","24","72");
        dueCombo.addValueChangeListener(new Property.ValueChangeListener() {
                @Override
                public void valueChange (Property.ValueChangeEvent valueChangeEvent){
                Container.Filter dueFilter = new SimpleStringFilter("due", dueCombo.getValue().toString(), false, false);
                beanItemContainer.removeAllContainerFilters();
                beanItemContainer.addContainerFilter(dueFilter);
            }
        });

        VerticalLayout verticalLayout = new VerticalLayout(dueCombo, quotesGrid);

        this.setContent(verticalLayout);
        this.center();
    }
}
