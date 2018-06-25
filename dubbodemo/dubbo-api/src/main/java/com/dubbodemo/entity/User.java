package com.dubbodemo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by shq on 2018/6/21.
 */
@Data
public class User  implements Serializable{

    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private Integer gender;
}
