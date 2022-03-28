package com.example.urlshortener.url;

import com.example.urlshortener.url.model.CreateUrl;
import com.example.urlshortener.url.model.UrlCreated;
import com.example.urlshortener.url.model.UrlResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/urls")
public class UrlController {

    private final UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    @PostMapping(path = "shorten")
    public ResponseEntity<UrlCreated> shortenUrl(@RequestBody CreateUrl createUrl) {
        UrlCreated urlCreated = urlService.shortenUrl(createUrl);
        return ResponseEntity.status(HttpStatus.CREATED).body(urlCreated);
    }

    @GetMapping(path = "{shortUrl}")
    public ResponseEntity<UrlResponse> getFullUrl(@PathVariable String shortUrl) {
        UrlResponse fullUrl = urlService.getFullUrl(shortUrl);
        return ResponseEntity.ok(fullUrl);
    }

}
