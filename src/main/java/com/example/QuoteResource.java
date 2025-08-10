package com.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import java.util.Random;

@Path("/quote")
public class QuoteResource {
    private static final List<String> QUOTES = List.of(
        "Push yourself, because no one else is going to do it for you.",
        "Success is not in what you have, but who you are.",
        "Hard work beats talent when talent doesn't work hard.",
        "Great things never come from comfort zones.",
        "Dream it. Wish it. Do it."
    );
    private static final Random RANDOM = new Random();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getQuote() {
        String randomQuote = QUOTES.get(RANDOM.nextInt(QUOTES.size()));
        return "{\"quote\":\"" + randomQuote + "\"}";
    }
}
