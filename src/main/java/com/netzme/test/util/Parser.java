package com.netzme.test.util;

import com.netzme.test.model.random.ResponseRetrofit;
import com.netzme.test.model.random.Result;

public class Parser {

    public static String getPicture(ResponseRetrofit resp){
        return getResult(resp).getPicture().getLarge();
    }

    public static String getAddress(ResponseRetrofit resp){
        return getResult(resp).getLocation().getStreet().toString() + getResult(resp).getLocation().getCity();
    }

    public static String getFullname(ResponseRetrofit resp){
        return getResult(resp).getName().toString();
    }

    public static String getGender(ResponseRetrofit resp){
        return getResult(resp).getGender();
    }

    private static Result getResult(ResponseRetrofit resp){
        return resp.getResults().get(0);
    }
}
