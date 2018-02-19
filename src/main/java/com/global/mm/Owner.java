package com.global.mm;

import org.hibernate.validator.constraints.Email;

import javax.xml.bind.annotation.XmlElement;

public class Owner {

    private String name;
    private String email;

    public Owner(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @XmlElement(name = "itunes:name")
    public String getName() {
        return name;
    }

    @Email
    @XmlElement(name = "itunes:email")
    public String getEmail() {
        return email;
    }
}
