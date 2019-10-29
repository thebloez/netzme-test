package com.netzme.test.service;

import com.netzme.test.APIConfig;
import com.netzme.test.model.ResponseRetrofit;
import com.netzme.test.model.Result;
import com.netzme.test.repository.RepositoryInterface;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@Service
public class RandomService implements APIConfig {
    private RepositoryInterface repositoryInterface;

    public RandomService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        repositoryInterface = retrofit.create(RepositoryInterface.class);
    }

    public ResponseRetrofit randomUser() throws IOException {
        Call<ResponseRetrofit> retrofitCall = repositoryInterface.getResult();

        Response<ResponseRetrofit> response = retrofitCall.execute();

        if (!response.isSuccessful())
            throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown Eroor");

        return response.body();
    }
}
