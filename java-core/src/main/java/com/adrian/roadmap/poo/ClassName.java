package com.adrian.roadmap.poo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClassName {

    //Attributes
    private String name;
    private String lastName;
    private Integer age;
    private String taxPrayerId;

    //Methods
    public void getFullName(String name, String lastName) {
        System.out.println("Hello " + name + " " + lastName);
    }
}

