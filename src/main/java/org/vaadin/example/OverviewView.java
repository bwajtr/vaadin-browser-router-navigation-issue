package org.vaadin.example;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;


@Route(OverviewView.ROUTE)
public class OverviewView extends VerticalLayout {
    public static final String ROUTE = "overview";
    public OverviewView() {
        add(new Paragraph("Overview"));
        add(new Button("Go to detail", event -> UI.getCurrent().navigate(EntityDetailView.ROUTE)));
    }

}
