package com.global.mm;

import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;

public class RssSerializeAndValidate {

    @Test
    public void checkDeserialize() throws Exception {

        Item item = new Item(UUID.fromString("98c3614e-ba11-4be0-be28-80e247cb3af0"))
                .setAuthor("contactus@radiox.co.uk")
                .setDescription("The week we've got, animal attacks, Mexican handbags with a twist, the renaming of art, a nostalgia quiz, nicknames and guide animals. Enjoy! Hear Johnny on Radio X every weekday at 4pm across the UK on digital radio, 104.9 FM in London, 97.7 FM in Manchester, on your mobile or via www.radiox.co.uk")
                .setDuration("1:01:31")
                .setEnclosure(new Enclosure("http://fs.geronimo.thisisglobal.com/audio/7e00f11b4ce14bd3b051366543713a62.mp3?referredby=rss", "audio/mpeg", 89551542L))
                .setExplicit(false)
                .setIAuthor("Radio X")
                .setImage(new Image("http://fs.geronimo.thisisglobal.com/image/bb925d9d635c47549eec5ce1fd42f0d4.jpg"))
                .setPubDate(new SimpleDateFormat("EEE, d MMM yyyy kk:mm:ss z").parse("Fri, 09 Feb 2018 00:00:00 GMT"))
                .setSubtitle("The week we've got, animal attacks, Mexican handbags with a twist, the renaming of art, a nostalgia quiz, nicknames and guide animals. Enjoy! Hear Johnny on Radio X every weekday at 4pm across the UK on digital radio, 104.9 FM in London, 97.7 FM in Manchester, on your mobile or via www.radiox.co.uk")
                .setSummary("The week we've got, animal attacks, Mexican handbags with a twist, the renaming of art, a nostalgia quiz, nicknames and guide animals. Enjoy! Hear Johnny on Radio X every weekday at 4pm across the UK on digital radio, 104.9 FM in London, 97.7 FM in Manchester, on your mobile or via www.radiox.co.uk")
                .setTitle("Johnny Vaughan on Radio X: Podcast 119");

        UUID uuid2 = UUID.fromString("2bf2a735-fdba-4dab-9c70-e9bb5ae61d25");

        Rss rss = new Rss(
                new Channel("Johnny Vaughan On Radio X Podcast",
                        "http://www.radiox.co.uk/")
                        .setAuthor("Radio X")
                        .setCopyright("Global Radio")
                        .setDescription("He's been the face and the voice of breakfast... Now he's forcing himself into your ear-hole at a different time. Let Johnny and his team finish off the working day with topical chat and marvellous music. It'll get you home - and make you think. Hear Johnny on Radio X every weekday at 4pm across the UK on digital radio, 104.9 FM in London, 97.7 FM in Manchester, on your mobile or via www.radiox.co.uk.")
                        .setImage(new Image("http://fs.geronimo.thisisglobal.com/image/bb925d9d635c47549eec5ce1fd42f0d4.jpg"))
                        .setLanguage("en")
                        .setSubtitle("Get the best of Johnny Vaughan on Radio X every week.")
                        .setSummary("He's been the face and the voice of breakfast... Now he's forcing himself into your ear-hole at a different time. Let Johnny and his team finish off the working day with topical chat and marvellous music. It'll get you home - and make you think. Hear Johnny on Radio X every weekday at 4pm across the UK on digital radio, 104.9 FM in London, 97.7 FM in Manchester, on your mobile or via www.radiox.co.uk.")
                        .setOwner(new Owner("Radio X", "contactus@radiox.co.uk"))
                        .setCategories(Arrays.asList(new Category("Comedy"), new Category("Music")))
                        .setExplicit(true)
                        .setFeedHref("http://dallas.example.com/rss.xml")
                        .setItems(Arrays.asList(item)));

        try {
            JAXBContext context = JAXBContext.newInstance(Rss.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(rss, System.out);
        } catch (PropertyException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testValidation() {

        Channel channel = new Channel("", "");
        channel.setExplicit(true);
        channel.setSubtitle("12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        Rss rss = new Rss(channel);
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        javax.validation.Validator validator = factory.getValidator();
        Set<ConstraintViolation<Rss>> violations = validator.validate(rss);

        System.out.println(violations);


    }

}