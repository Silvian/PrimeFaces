package com.silvian.basic.view;

import javax.faces.bean.ManagedBean;

/**
 * Created by silvian on 04/06/2014.
 */

@ManagedBean
public class BasicView {

    private String text;

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
