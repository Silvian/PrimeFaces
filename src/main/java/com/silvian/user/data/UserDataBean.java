package com.silvian.user.data;

/**
 * Created by silvian on 04/06/2014.
 */

import com.silvian.user.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userDataBean", eager = true)
@SessionScoped
public class UserDataBean implements Serializable {

    private static final long serialVersionUID= 1L;

    private List<User> userList;

    @PostConstruct
    public void init() {
        userList = new ArrayList<User>();
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;

    }

    public void addUser(User user) {
        userList.add(user);
    }

    public boolean deleteUser(User user) {
        return userList.remove(user);
    }

    public boolean userExists(User user) {
        return userList.contains(user);
    }


}
