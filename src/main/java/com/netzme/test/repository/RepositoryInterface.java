package com.netzme.test.repository;

import com.netzme.test.model.random.ResponseRetrofit;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.http.GET;

@Repository
public interface RepositoryInterface {

    @GET("/api")
    Call<ResponseRetrofit> getResult();
}
