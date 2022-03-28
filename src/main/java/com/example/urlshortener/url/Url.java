package com.example.urlshortener.url;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity(name = "urls")
public class Url {

    @Id
    private UUID id;
    private String shortUrl;
    private String longUrl;

    public Url() {
    }

    public Url(UUID id, String shortUrl, String longUrl) {
        this.id = id;
        this.shortUrl = shortUrl;
        this.longUrl = longUrl;
    }

    public UUID getId() {
        return id;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public String getLongUrl() {
        return longUrl;
    }
}
