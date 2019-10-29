package com.netzme.test.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.junit.platform.commons.util.ToStringBuilder;

import java.util.List;

public class ResponseRetrofit {
    @SerializedName("results")
    @Expose
    private List<Result> results = null;
    @SerializedName("info")
    @Expose
    private Info info;

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}
