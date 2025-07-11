package org.koreait.tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.pokemon.api.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@SpringBootTest
public class Ex02 {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ObjectMapper om;

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

    @Test
    void test3() throws Exception {
        RequestJoin form = new RequestJoin();
        form.setName("사용자01");
        form.setEmail("user01@test.org");
        form.setPassword("12345678");
        String body = om.writeValueAsString(form);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> request = new HttpEntity<>(body, headers);

        String url = "http://localhost:3000/api/v1/member/join";
        ResponseEntity<Void> response = restTemplate.exchange(URI.create(url), HttpMethod.POST, request, Void.class);
        System.out.println(response);
    }

    @Test
    void test4() {
        String url = "http://localhost:3000/api/v1/member/join2";

        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("name", "사용자01");
        params.add("email", "user01@test.org");
        params.add("password", "12345678");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(params, headers);

        ResponseEntity<Void> response = restTemplate.exchange(URI.create(url), HttpMethod.POST, request, Void.class);

        System.out.println(response);
    }

    @Test
    void test5() {
        String url = "http://localhost:3000/api/v1/member/join3";

        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("name", "사용자01");
        params.add("email", "user01@test.org");
        params.add("password", "12345678");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(params, headers);

        ResponseEntity<Void> response = restTemplate.exchange(URI.create(url), HttpMethod.PATCH, request, Void.class);

        System.out.println(response);
    }
}
