package com.global.mm;

import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlAttribute;

public class Enclosure {

    @URL
    private String url;
    @Pattern(regexp = "audio/x-m4a|audio/mpeg|video/quicktime|video/mp4|video/x-m4v|application/pdf", flags = Pattern.Flag.CASE_INSENSITIVE)
    private String type;

    private Long length;

    public Enclosure(String url, String type, Long length) {
        this.url = url;
        this.type = type;
        this.length = length;
    }

    @XmlAttribute(name = "url")
    public String getUrl() {
        return url;
    }

    @XmlAttribute(name = "type")
    public String getType() {
        return type;
    }

    @XmlAttribute(name = "length")
    public String getLength() {
        return String.valueOf(length);
    }
}
