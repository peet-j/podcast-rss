package com.global.mm;

import org.hibernate.validator.constraints.URL;

import javax.xml.bind.annotation.XmlAttribute;

public class AtomLink {

    @URL
    private String href;
    public AtomLink(String feedHref) {
        this.href = feedHref;
    }

    @XmlAttribute(name = "href")
    public String getHref() {
        return href;
    }

    @XmlAttribute(name = "rel")
    public String getRel() {
        return "self";
    }

    @XmlAttribute(name = "type")
    public String getType() {
        return "application/rss+xml";
    }
}
