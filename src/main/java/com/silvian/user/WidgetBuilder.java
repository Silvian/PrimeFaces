package com.silvian.user;


import org.metawidget.faces.component.html.widgetbuilder.primefaces.PrimeFacesWidgetBuilder;
import org.metawidget.faces.component.UIMetawidget;

import java.util.HashMap;

/**
 * Created by silvian on 05/06/2014.
 */
public class WidgetBuilder {

    WidgetBuilder() {
        PrimeFacesWidgetBuilder primeFacesWidgetBuilder = new PrimeFacesWidgetBuilder();

        primeFacesWidgetBuilder.buildWidget("user",new HashMap<String, String>(), new UIMetawidget() {
            @Override
            public String getComponentType() {
                return "component";
            }

            @Override
            protected String getDefaultConfiguration() {
                return "configuration";
            }
        });


    }



}
