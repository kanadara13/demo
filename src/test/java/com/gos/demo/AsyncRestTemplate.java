package com.gos.demo;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsAsyncClientHttpRequestFactory;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.client.AsyncRestTemplate;

class AsyncRestTemplateTest {

    @Test
    public void shouldBeRun(){
        AsyncRestTemplate restTemplate = new AsyncRestTemplate(new HttpComponentsAsyncClientHttpRequestFactory());
        for (int i=0; i< 100; i++) {
            //HttpCoponentsAsyncClientHttpRequestFactory
            ListenableFuture<ResponseEntity<String>> response = restTemplate.getForEntity("https://www.naver.com", String.class);
        }
    }
}
