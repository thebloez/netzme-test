package com.netzme.test.repository;

import com.netzme.test.model.ResponseRetrofit;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RepositoryInterface {

    @GET("/api")
    Call<ResponseRetrofit> getResult();
}
