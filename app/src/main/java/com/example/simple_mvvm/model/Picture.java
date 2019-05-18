package com.example.simple_mvvm.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Picture implements Serializable {

    @SerializedName("large")
    public String large;

    @SerializedName("mediaum")
    public String medium;

    @SerializedName("thumbnail")
    public String thumbnail;
}
