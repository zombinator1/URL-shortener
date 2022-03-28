package com.example.urlshortener.url.repository;

import com.example.urlshortener.url.Url;

public interface UrlRepository {

    Url save(Url urlToSave);

    Url getByShortUrl(String shortUrl);
}
