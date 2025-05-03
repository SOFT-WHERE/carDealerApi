package com.carDealer;

import org.springframework.stereotype.Component;

@Component("cybertruck")
public class Cybertruck implements Car {

    @Override
    public void showDetails(){
        System.out.println("this is cybertruck...");
    }

}
