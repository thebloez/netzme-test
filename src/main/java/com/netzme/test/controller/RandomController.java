package com.netzme.test.controller;

import com.netzme.test.model.ParseResponse;
import com.netzme.test.model.ResponseRetrofit;
import com.netzme.test.model.Result;
import com.netzme.test.service.RandomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class RandomController {

    private RandomService randomService;

    public RandomController(RandomService randomService) {
        this.randomService = randomService;
    }

    @GetMapping("api/person")
    public ParseResponse getParseRandom() throws IOException {
        ResponseRetrofit responseRetrofit = randomService.randomUser();
        Result result = responseRetrofit.getResults().get(0);

        return new ParseResponse(result.getGender(),
                result.getName().toString(),
                result.getLocation().getStreet().toString() + result.getLocation().getCity(),
                result.getPicture().getLarge());
    }
}
