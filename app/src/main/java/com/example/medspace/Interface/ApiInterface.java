package com.example.medspace.Interface;

import com.example.medspace.Model.LoginSuccessResponse;
import com.google.gson.annotations.SerializedName;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {


    @FormUrlEncoded
    @POST("login")
    Call<LoginSuccessResponse> userLogin(
            @Field("username") String email,
            @Field("password") String password,
            @Field("client_id") int clientId,
            @Field("client_secret") String clientSecret
    );

    @FormUrlEncoded
    @POST("create-account")
    Call<ResponseBody> creatUser(
            @Field("username") String userName,
            @Field("password") String password,
            @Field("email") String email,
            @Field("confirm_password") String confirmPassword
    );
}
