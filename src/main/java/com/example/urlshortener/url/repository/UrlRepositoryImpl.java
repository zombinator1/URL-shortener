package com.example.urlshortener.url.repository;

import com.example.urlshortener.url.Url;
import org.springframework.stereotype.Repository;

@Repository
public class UrlRepositoryImpl implements UrlRepository {

    private final UrlSpringDataRepository urlSpringDataRepository;

    public UrlRepositoryImpl(UrlSpringDataRepository urlSpringDataRepository) {
        this.urlSpringDataRepository = urlSpringDataRepository;
    }

    @Override
    public Url save(Url urlToSave) {
        return urlSpringDataRepository.save(urlToSave);
    }

    @Override
    public Url getByShortUrl(String shortUrl) {
        return urlSpringDataRepository.getByShortUrl(shortUrl);
    }
}
