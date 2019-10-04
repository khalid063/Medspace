package com.example.medspace.Model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ForgetPasswordResponse implements Serializable
{

    @SerializedName("api_status")
    @Expose
    private Integer apiStatus;
    private final static long serialVersionUID = 3405038994799522713L;

    public Integer getApiStatus() {
        return apiStatus;
    }

    public void setApiStatus(Integer apiStatus) {
        this.apiStatus = apiStatus;
    }

}
