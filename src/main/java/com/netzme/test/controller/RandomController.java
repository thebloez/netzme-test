package com.netzme.test.controller;

import com.netzme.test.model.ParseResponse;
import com.netzme.test.model.ResponseRetrofit;
import com.netzme.test.model.Result;
import com.netzme.test.service.RandomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class RandomController {

    @Autowired
    private RandomService randomService;

    @GetMapping("api")
    public ResponseRetrofit getRandom() throws IOException {
        return randomService.randomUser();
    }

    @GetMapping("api/person")
    public ParseResponse getParseRandom() throws IOException {
        ResponseRetrofit responseRetrofit = randomService.randomUser();
        Result result = responseRetrofit.getResults().get(0);

        ParseResponse parseResponse = new ParseResponse(result.getGender(),
                result.getName().toString(),
                result.getLocation().getStreet().toString() + result.getLocation().getCity(),
                result.getPicture().getLarge());

        return parseResponse;
    }
}
