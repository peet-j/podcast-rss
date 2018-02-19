package com.global.mm;

import javax.xml.bind.annotation.XmlAttribute;

public class AtomLink {

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
