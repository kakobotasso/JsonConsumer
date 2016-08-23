package br.com.kakobotasso.jsonconsumer.models;

import com.google.gson.annotations.SerializedName;
/**
 * Created by kakobotasso on 8/22/16.
 */
public class DataModel {
    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("pwd")
    private String pwd;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }
}
