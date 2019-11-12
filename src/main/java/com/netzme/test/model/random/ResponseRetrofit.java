package com.netzme.test.model.random;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class ResponseRetrofit {
    @SerializedName("results")
    @Expose
    private List<Result> results = null;

}
