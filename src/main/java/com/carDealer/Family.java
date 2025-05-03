package com.carDealer;

import org.springframework.stereotype.Component;

@Component("family")
public class Family implements Car{

    @Override
    public void showDetails() {
        System.out.println("this is family car...");
    }

}
