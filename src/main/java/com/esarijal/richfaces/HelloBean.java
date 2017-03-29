package com.esarijal.richfaces;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class HelloBean implements Serializable {

    private static final long serialVersionUID = -6239437588285327644L;

    private String name;

    @PostConstruct
    public void postContruct() {
        name = "Esa";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSayHello(){
        return "Ajax message : welcome " + name;
    }
}