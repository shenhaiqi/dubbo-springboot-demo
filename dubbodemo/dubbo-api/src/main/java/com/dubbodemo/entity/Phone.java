package com.dubbodemo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by 123 on 2018/6/25.
 */
@Data
public class Phone implements Serializable{

    private double price;
    private String logo;
    private String origin;  //产地

    public Phone(double price, String logo, String origin) {
        this.price = price;
        this.logo = logo;
        this.origin = origin;
    }

    public Phone() {


    }
}
