package com.global.mm;

import org.hibernate.validator.constraints.NotEmpty;

import javax.xml.bind.annotation.XmlAttribute;

public class Category {

    @NotEmpty
    private String text;

    @XmlAttribute(name = "text")
    public String getText() {
        return text;
    }

    public Category(String text) {
        this.text = text;
    }
}
