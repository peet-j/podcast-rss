package com.global.mm;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import java.util.UUID;

public class Guid {

    @NotNull
    private UUID value;

    @XmlValue
    public UUID getValue() {
        return value;
    }

    @XmlAttribute(name = "isPermaLink")
    public Boolean getPermaLink() {
        return false;
    }

    public Guid(UUID value) {
        this.value = value;
    }
}
