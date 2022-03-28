package com.example.urlshortener.url.model;

public class CreateUrl {
    private String longUrl;

    public CreateUrl() {
    }

    public CreateUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public String getLongUrl() {
        return longUrl;
    }
}
