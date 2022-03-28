package com.example.urlshortener;

import com.example.urlshortener.url.model.CreateUrl;
import com.example.urlshortener.url.model.UrlCreated;
import com.example.urlshortener.url.model.UrlResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SimpleE2ETest {

    @Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    private int port;

    @Test
    void simpleE2ETest() {
        String longUrl = "https://dzone.com/articles/contention-coherency-and-math-behind-software";
        CreateUrl requestBody = new CreateUrl(longUrl);
        String shortenUrl = "http://localhost:" + port + "/api/v1/urls/shorten";
        UrlCreated urlCreated = this.restTemplate.postForObject(shortenUrl, requestBody, UrlCreated.class);
        String shortUrl = urlCreated.getShortUrl();
        String getUrl = "http://localhost:%d/api/v1/urls/%s".formatted(port, shortUrl);
        UrlResponse url = this.restTemplate.getForObject(getUrl, UrlResponse.class);
        assertThat(url.getLongUrl()).isEqualTo(longUrl);
        assertThat(url.getShortUrl()).isEqualTo(shortUrl);
    }
}
