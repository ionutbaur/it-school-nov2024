package com.itschool.session24;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        String name = "ionutz";
        Optional<String> optionalString = Optional.ofNullable(name);
        String alternative = optionalString.orElse("baur");

        System.out.println(alternative);

        String text = null;
        int textLength = Optional.ofNullable(text)
                .map((String string) -> string.length())
                .orElseThrow(() -> new RuntimeException("Nu am valoare"));

        System.out.println(textLength);
    }
}
