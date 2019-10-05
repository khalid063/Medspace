package com.example.medspace.Model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetUserDataResponse implements Serializable
{

    @SerializedName("api_status")
    @Expose
    private Integer apiStatus;
    @SerializedName("user_data")
    @Expose
    private UserData userData;
    private final static long serialVersionUID = -8394983225569597379L;

    public Integer getApiStatus() {
        return apiStatus;
    }

    public void setApiStatus(Integer apiStatus) {
        this.apiStatus = apiStatus;
    }

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

}