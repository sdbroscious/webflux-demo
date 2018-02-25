package sdb.webfluxdemo;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class GreetingWebClient {

    private WebClient client = WebClient.create("http://localhost:8080");

    private Mono<ClientResponse> result = client.get()
            .uri("/hello")
            .accept(MediaType.TEXT_PLAIN)
            .exchange();

    private Mono<ClientResponse> resultbob = client.get()
            .uri("/bob")
            .accept(MediaType.APPLICATION_JSON)
            .exchange();

    public String getResult() {
        return ">> result = " + result.flatMap(res -> res.bodyToMono(String.class)).block();
    }

    public String getResultBob() {
        return ">> resultBob = " + resultbob.flatMap(res -> res.bodyToMono(String.class)).block();
    }
}
