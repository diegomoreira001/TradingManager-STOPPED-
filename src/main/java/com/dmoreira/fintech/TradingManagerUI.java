package com.dmoreira.fintech;

import com.dmoreira.fintech.domains.Stock;
import com.dmoreira.fintech.services.StockQuotesService;
import com.dmoreira.fintech.services.tasks.StockQuotesRefresher;
import com.dmoreira.fintech.ui.windows.BondQuotesWindow;
import com.dmoreira.fintech.ui.windows.StockQuotesWindow;
import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.data.Container;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.util.filter.SimpleStringFilter;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;

/**
 *
 */
//@Widgetset("com.dmoreira.fintech.MyAppWidgetset") //enables custom widget set
@Theme("valo")
@SpringUI
@Push
public class TradingManagerUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.setMargin(true);

        MenuBar menuBar = new MenuBar();
        menuBar.addItem("Awesome Menu Bar", null);
        verticalLayout.addComponent(menuBar);
        setContent(verticalLayout);

        StockQuotesWindow stockQuotesDashboardWindow = new StockQuotesWindow();
        BondQuotesWindow bondQuotesDashboardWindow = new BondQuotesWindow();
//        Layout layout = new AbsoluteLayout();
//        layout.addComponent(dashboard);
//        setContent(layout);
        addWindow(bondQuotesDashboardWindow);
        addWindow(stockQuotesDashboardWindow);

//        final VerticalLayout layout = new VerticalLayout();
//        layout.setMargin(true);
//        setContent(layout);
//
//        Button button = new Button("Click Me");
//        button.addClickListener(new Button.ClickListener() {
//            @Override
//            public void buttonClick(ClickEvent event) {
//                layout.addComponent(new Label("Thank you for clicking"));
//            }
//        });
//        layout.addComponent(button);

    }
}
