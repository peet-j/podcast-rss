package com.global.mm;

import com.global.mm.xml.DateAdapter;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;
import java.util.UUID;

public class Item {

    @Valid
    private Guid guid;
    private String author;
    private String title;
    private String description;
    private Date pubDate;
    @Valid
    private Enclosure enclosure;
    private String subtitle;
    private String iAuthor;
    private Image image;
    private Boolean explicit;
    private String summary;
    private String duration;

    public Item(UUID guid) {
        this.guid = new Guid(guid);
    }

    @XmlElement(name = "guid")
    public Guid getGuid() {
        return guid;
    }

    @XmlElement(name = "author")
    public String getAuthor() {
        return author;
    }

    public Item setAuthor(String author) {
        this.author = author;
        return this;
    }

    @XmlElement(name = "title")
    public String getTitle() {
        return title;
    }

    public Item setTitle(String title) {
        this.title = title;
        return this;
    }

    @XmlElement(name = "description")
    public String getDescription() {
        return description;
    }

    public Item setDescription(String description) {
        this.description = description;
        return this;
    }

    @XmlElement(name = "pubDate")
    @XmlJavaTypeAdapter(DateAdapter.class)
    public Date getPubDate() {
        return pubDate;
    }

    public Item setPubDate(Date pubDate) {
        this.pubDate = pubDate;
        return this;
    }

    @XmlElement(name = "enclosure")
    public Enclosure getEnclosure() {
        return enclosure;
    }

    public Item setEnclosure(Enclosure enclosure) {
        this.enclosure = enclosure;
        return this;
    }

    @XmlElement(name = "itunes:subtitle")
    public String getSubTitle() {
        return subtitle;
    }

    @XmlElement(name = "itunes:author")
    public String getiAuthor() {
        return iAuthor;
    }

    @XmlElement(name = "itunes:image")
    public Image getImage() {
        return image;
    }

    public Item setImage(Image image) {
        this.image = image;
        return this;
    }

    @XmlElement(name = "itunes:explicit")
    public Boolean getExplicit() {
        return explicit;
    }

    public Item setExplicit(Boolean explicit) {
        this.explicit = explicit;
        return this;
    }

    @XmlElement(name = "itunes:summary")
    public String getSummary() {
        return summary;
    }

    public Item setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    @XmlElement(name = "itunes:duration")
    public String getDuration() {
        return duration;
    }

    public Item setDuration(String duration) {
        this.duration = duration;
        return this;
    }

    public Item setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public Item setIAuthor(String iAuthor) {
        this.iAuthor = iAuthor;
        return this;
    }
}
