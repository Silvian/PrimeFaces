package com.silvian.user;

/**
 * Created by silvian on 04/06/2014.
 */
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.silvian.user.data.UserDataBean;
import org.primefaces.event.FlowEvent;

@ManagedBean(name = "userWizard")
@ViewScoped
public class UserWizard implements Serializable {

    private User user = new User();

    @ManagedProperty(value = "#{userDataBean}")
    private UserDataBean userDataBean;

    private boolean skip;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserDataBean getUserDataBean() {
        return userDataBean;
    }

    public void setUserDataBean(UserDataBean userDataBean) {
        this.userDataBean = userDataBean;
    }

    public void save() {

        userDataBean.addUser(user);

        FacesMessage msg = new FacesMessage("Successful", "Welcome : " + user.getFirstname() + " " + user.getLastname() +
                                            " You are: " + user.getAge() + " years old.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public boolean isSkip() {
        return skip;
    }

    public void setSkip(boolean skip) {
        this.skip = skip;
    }

    public String onFlowProcess(FlowEvent event) {
        if(skip) {
            skip = false;   //reset in case user goes back
            return "confirm";
        }
        else {
            return event.getNewStep();
        }
    }

}
