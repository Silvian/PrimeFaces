package com.silvian.user.data;

/**
 * Created by silvian on 04/06/2014.
 */

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserDataBean implements Serializable {

    private static final long serialVersionUID= 1L;
    private String name;

    public UserDataBean() {
        name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWelcomeMessage(){
        return "Hello " + name;
    }
}
