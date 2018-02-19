package com.global.mm;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * See spec https://validator.w3.org/feed/docs/rss2.html
 */
@XmlRootElement(name = "rss")
public class Rss {

    @Valid
    private Channel channel;

    @XmlAttribute(name = "version")
    public String getVersion() {
        return "2.0";
    }

    @XmlElement(name = "channel")
    public Channel getChannel() {
        return channel;
    }

    @XmlAttribute(name = "xmlns:atom")
    public String getNamespace1() {
        return "http://www.w3.org/2005/Atom";
    }

    @XmlAttribute(name = "xmlns:itunes")
    public String getNamespace2() {
        return "http://www.itunes.com/dtds/podcast-1.0.dtd";
    }

    public Rss(Channel channel) {
        this.channel = channel;
    }

    public Rss() {
    }
}
