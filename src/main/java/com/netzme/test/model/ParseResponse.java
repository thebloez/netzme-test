package com.netzme.test.model;

import com.netzme.test.model.random.ResponseRetrofit;
import com.netzme.test.util.Parser;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ParseResponse {
    private String gender;
    private String fullname;
    private String address;
    private String picture;

    public ParseResponse(ResponseRetrofit result) {
        gender = Parser.getGender(result);
        fullname = Parser.getFullname(result);
        address = Parser.getAddress(result);
        picture = Parser.getPicture(result);
    }
}
