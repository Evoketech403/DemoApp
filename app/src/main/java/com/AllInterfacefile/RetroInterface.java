package com.AllInterfacefile;

import com.Model.Modeldemo;
import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface RetroInterface {
    @GET("marvel")
    Call<List<Modeldemo>> getVideoLink();
}
