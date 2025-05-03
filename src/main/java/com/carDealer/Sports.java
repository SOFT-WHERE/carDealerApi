package com.carDealer;

import org.springframework.stereotype.Component;

@Component("sports")
public class Sports implements Car{

    @Override
    public void showDetails(){
        System.out.println("this is sports car...");
    }

}
