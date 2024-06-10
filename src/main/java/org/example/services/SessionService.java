package org.example.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.ws.rs.Path;

import java.io.Serializable;

@SessionScoped
public class SessionService implements Serializable {

    private int count;

    public int getCount() {
        return ++count;
    }
    @PostConstruct
    public void init(){
        System.out.println("session object will be created");

    }
    @PreDestroy
    public void kill(){
        System.out.println("session object will be killed");

    }
}