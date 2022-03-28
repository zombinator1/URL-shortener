package com.example.urlshortener.url;

import com.example.urlshortener.url.model.CreateUrl;
import com.example.urlshortener.url.model.UrlCreated;
import com.example.urlshortener.url.model.UrlResponse;
import com.example.urlshortener.url.repository.UrlRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
class UrlService {

    private final UrlRepository urlRepository;

    UrlService(UrlRepository urlsRepository) {
        this.urlRepository = urlsRepository;
    }

    UrlCreated shortenUrl(CreateUrl createUrl) {
        String longUrl = createUrl.getLongUrl();
        String shortUrl = HashUtil.hash(longUrl);
        UUID id = UUID.randomUUID();
        Url newUrl = new Url(id, shortUrl, longUrl);
        Url save = urlRepository.save(newUrl);
        return new UrlCreated(save.getShortUrl());
    }

    UrlResponse getFullUrl(String shortUrl) {
        Url url = urlRepository.getByShortUrl(shortUrl);
        return new UrlResponse(url.getShortUrl(), url.getLongUrl());
    }
}
