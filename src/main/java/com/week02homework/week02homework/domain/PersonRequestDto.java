//json 내용
package com.week02homework.week02homework.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class PersonRequestDto {
    private String name;
    private String address;
    private int age;

    public PersonRequestDto(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
}
