package com.netzme.test;

import com.netzme.test.model.ParseResponse;
import com.netzme.test.service.RandomService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@Slf4j
class TestApplicationTests {

    @InjectMocks
    private RandomService randomService;

    @InjectMocks
    private ParseResponse response = new ParseResponse();

    @BeforeEach
    void init() {
        response = randomService.getRandom();
        log.info("start-up {}", response.toString());
    }


    @Test
    void nullTest() {
        Assert.assertNotNull(response.getAddress());
        Assert.assertNotNull(response.getFullname());
        Assert.assertNotNull(response.getPicture());
        Assert.assertNotNull(response.getGender());
    }

    @Test
    void pictureTest() {
        Assert.assertTrue(response.getPicture().contains(".jpg"));
    }

    @Test
    void genderTest() {
        Assert.assertTrue(response.getGender(),
                response.getGender().contains("male") || response.getGender().contains("female"));
    }

    @Test
    void fullnameTest() {
        Assert.assertTrue(response.getFullname(),
                response.getFullname().contains("Mr") || response.getFullname().contains("Ms"));
    }
}
