package com.global.mm;

import org.hibernate.validator.constraints.URL;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;


public class Channel {

    @URL
    private String feedHref;
    @NotNull
    private String title;
    @NotNull
    private String link;
    @NotNull
    private String description;

    private String language;
    private String copyright;

    @Size(max = 255)
    private String subtitle;
    private String author;
    private String summary;

    private Image image;
    private Owner owner;

    private Boolean explicit;

    @Pattern(regexp = "episodic|serial", flags = Pattern.Flag.CASE_INSENSITIVE)
    private String type;

    @Valid
    private List<Item> items;
    private List<Category> categories;

    public Channel(String title, String link) {
        this.title = title;
        this.link = link;
    }

    @XmlElement(name = "atom:link")
    public AtomLink getAtomLink() {
        return new AtomLink(this.feedHref);
    }

    @XmlElement(name = "itunes:summary")
    public String getSummary() {
        return summary;
    }

    public Channel setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    @XmlElement(name = "itunes:image")
    public Image getImage() {
        return image;
    }

    public Channel setImage(Image image) {
        this.image = image;
        return this;
    }

    @XmlElement(name = "itunes:author")
    public String getAuthor() {
        return author;
    }

    public Channel setAuthor(String author) {
        this.author = author;
        return this;
    }

    @XmlElement(name = "copyright")
    public String getCopyright() {
        return copyright;
    }

    public Channel setCopyright(String copyright) {
        this.copyright = copyright;
        return this;
    }

    @XmlElement(name = "language")
    public String getLanguage() {
        return language;
    }

    public Channel setLanguage(String language) {
        this.language = language;
        return this;
    }

    @XmlElement(name = "description")
    public String getDescription() {
        return description;
    }

    public Channel setDescription(String description) {
        this.description = description;
        return this;
    }

    @XmlElement(name = "link")
    public String getLink() {
        return link;
    }

    @XmlElement(name = "title")
    public String getTitle() {
        return title;
    }

    @XmlElement(name = "itunes:subtitle")
    public String getSubtitle() {
        return subtitle;
    }

    public Channel setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    @XmlElement(name = "itunes:type")
    public String getType() {
        return type;
    }

    @XmlElement(name = "itunes:owner")
    public Owner getOwner() {
        return owner;
    }

    public Channel setOwner(Owner owner) {
        this.owner = owner;
        return this;
    }

    @XmlElement(name = "itunes:category")
    public List<Category> getCategories() {
        return categories;
    }

    public Channel setCategories(List<Category> categories) {
        this.categories = categories;
        return this;
    }

    @XmlElement(name = "itunes:explicit")
    public Boolean getExplicit() {
        return explicit;
    }

    public Channel setExplicit(Boolean explicit) {
        this.explicit = explicit;
        return this;
    }

    @XmlElement(name = "item")
    public List<Item> getItems() {
        return items;
    }

    public Channel setItems(List<Item> items) {
        this.items = items;
        return this;
    }

    public Channel setFeedHref(String feedHref) {
        this.feedHref = feedHref;
        return this;
    }

    public Channel setType(String type) {
        this.type = type;
        return this;
    }
}
