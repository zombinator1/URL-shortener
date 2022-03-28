package com.example.urlshortener.url.model;

public class UrlCreated {

    private String shortUrl;

    public UrlCreated() {
    }

    public UrlCreated(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }
}
