package com.global.mm;

import javax.xml.bind.annotation.XmlAttribute;

public class Category {

    private String text;

    @XmlAttribute(name = "text")
    public String getText() {
        return text;
    }

    public Category(String text) {
        this.text = text;
    }
}
