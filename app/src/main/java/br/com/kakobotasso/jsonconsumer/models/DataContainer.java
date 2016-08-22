package br.com.kakobotasso.jsonconsumer.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kakobotasso on 8/22/16.
 */
public class DataContainer {
    @SerializedName("data")
    private List<DataModel> dataModelList = new ArrayList<>();

    public List<DataModel> getDataModelList() {
        return dataModelList;
    }

    public void setDataModelList(List<DataModel> dataModelList) {
        this.dataModelList = dataModelList;
    }
}
