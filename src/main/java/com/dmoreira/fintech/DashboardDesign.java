package com.dmoreira.fintech;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Grid;
import com.vaadin.ui.declarative.Design;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.ComboBox;

/**
 * !! DO NOT EDIT THIS FILE !!
 * <p>
 * This class is generated by Vaadin Designer and will be overwritten.
 * <p>
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
//@AutoGenerated
@SuppressWarnings("serial")
public class DashboardDesign extends VerticalLayout {
    protected ComboBox dueCombo;
    protected Grid quotesGrid;

    public DashboardDesign() {
        quotesGrid = new Grid();
        dueCombo = new ComboBox();

        VerticalLayout verticalLayout = new VerticalLayout(dueCombo, quotesGrid );
//        verticalLayout.addComponent(dueCombo);
//        verticalLayout.addComponent(quotesGrid);
//        Panel panel = new Panel(prices);
//        GridLayout gridLayout = new GridLayout(2,2,panel);
//        Design.read(this);
    }
}