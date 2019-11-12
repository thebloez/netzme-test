package com.netzme.test.service;

import com.netzme.test.model.ParseResponse;
import com.netzme.test.model.random.ResponseRetrofit;
import com.netzme.test.repository.RepositoryInterface;
import com.netzme.test.util.APIConfig;
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

    public ParseResponse getRandom() {
        Call<ResponseRetrofit> retrofitCall = repositoryInterface.getResult();
        Response<ResponseRetrofit> response = null;
        try {
            response = retrofitCall.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ParseResponse(response.body());
    }
}
