package com.example.simple_mvvm.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Login implements Serializable {

    @SerializedName("username")
    public String userName;
}
