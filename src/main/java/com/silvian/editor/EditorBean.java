package com.silvian.editor;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "editor")
public class EditorBean {

	private String value = "WTF BBQ LOL!";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}