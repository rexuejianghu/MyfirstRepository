package com.jd.shop.pruserapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.jd.shop"})
public class PrUserAppApplication {

    public static void main(String[] args) {
        System.out.println("***************8088*******************");
        SpringApplication.run(PrUserAppApplication.class, args);
    }

}
