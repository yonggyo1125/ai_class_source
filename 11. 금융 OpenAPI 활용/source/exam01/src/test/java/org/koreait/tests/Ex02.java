package org.koreait.tests;

import org.junit.jupiter.api.Test;
import org.koreait.pokemon.api.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@SpringBootTest
public class Ex02 {
    @Autowired
    private RestTemplate restTemplate;

    @Test
    void test1() {
        String url = "https://pokeapi.co/api/v2/pokemon";
        ApiResponse response = restTemplate.getForObject(URI.create(url), ApiResponse.class);
        System.out.println(response);
    }

    @Test
    void test2() {
        String url = "https://pokeapi.co/api/v2/pokemon";
        ResponseEntity<String> response = restTemplate.getForEntity(URI.create(url), String.class);
        System.out.println("------ 응답 헤더 ------");
        HttpHeaders headers = response.getHeaders();
        headers.forEach( (k, v) -> System.out.printf("%s:%s%n", k, v));

        System.out.println("------ 응답 바디 ------");
        String body = response.getBody();
        System.out.println(body) ;

    }
}
