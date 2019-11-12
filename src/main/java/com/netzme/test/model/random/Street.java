package com.netzme.test.model.random;

import lombok.Getter;

@Getter
public class Street {
    private String number;
    private String name;

    @Override
    public String toString() {
        return  number +
                " " + name + ' ';
    }
}