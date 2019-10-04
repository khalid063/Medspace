package com.example.medspace.Interface;

import com.example.medspace.Model.CreatUserResponse;
import com.example.medspace.Model.ForgetPasswordResponse;
import com.example.medspace.Model.SignInResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {


    @FormUrlEncoded
    @POST("auth")
    Call<SignInResponse> userLogin(
            @Field("server_key") String serverKey,
            @Field("username") String userName,
            @Field("password") String password
    );

    @FormUrlEncoded
    @POST("create-account")
    Call<CreatUserResponse> creatUser(
            @Field("server_key") String serverKey,
            @Field("username") String userName,
            @Field("password") String password,
            @Field("email") String email,
            @Field("confirm_password") String confirmPassword
    );

    @FormUrlEncoded
    @POST("send-reset-password-email")
    Call<ForgetPasswordResponse> forgetPassword(
            @Field("server_key") String serverKey,
            @Field("email") String email

    );

    @FormUrlEncoded
    @POST("get_news_feed")
    Call<ResponseBody> getNewsFeed(
            @Field("user_id") int userId,
            @Field("page_id") int pageId,
            @Field("group_id") int groupId
    );




}
