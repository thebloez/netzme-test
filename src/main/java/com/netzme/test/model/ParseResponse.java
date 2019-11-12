package com.netzme.test.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ParseResponse {
    private String gender;
    private String fullname;
    private String address;
    private String picture;

}
