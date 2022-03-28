package com.example.urlshortener.url.repository;

import com.example.urlshortener.url.Url;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

interface UrlSpringDataRepository extends JpaRepository<Url, UUID> {

    Url getByShortUrl(String shortUrl);

}
