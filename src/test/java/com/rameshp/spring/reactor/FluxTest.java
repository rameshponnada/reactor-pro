package com.rameshp.spring.reactor;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class FluxTest {

    @Test
    public void fluxTest(){
        Flux<String> flux = Flux.just("One", "Two", "Threee")
               // .concatWith(Flux.error(new RuntimeException("THrow Exception!!")))
                .log();

        flux.subscribe(System.out::println);

    }
}
