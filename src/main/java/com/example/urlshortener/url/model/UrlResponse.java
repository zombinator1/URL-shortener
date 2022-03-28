package com.example.urlshortener.url.model;

public class UrlResponse {

    private final String shortUrl;
    private final String longUrl;

    public UrlResponse(String shortUrl, String longUrl) {
        this.shortUrl = shortUrl;
        this.longUrl = longUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public String getLongUrl() {
        return longUrl;
    }
}
