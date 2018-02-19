package com.global.mm;

import org.hibernate.validator.constraints.URL;

import javax.xml.bind.annotation.XmlAttribute;

public class Image {

    @URL
    private String href;

    @XmlAttribute(name="href")
    public String getHref() {
        return href;
    }

    public Image(String href) {
        this.href = href;
    }
}
