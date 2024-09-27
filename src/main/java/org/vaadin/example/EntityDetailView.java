package org.vaadin.example;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route(EntityDetailView.ROUTE)
public class EntityDetailView extends VerticalLayout {
    public static final String ROUTE = "detail";

    public EntityDetailView() {
        add(new Paragraph("Detail"));
        add(new Button("Go back to overview",
                event -> UI.getCurrent().navigate(OverviewView.ROUTE))
        );
    }

}
