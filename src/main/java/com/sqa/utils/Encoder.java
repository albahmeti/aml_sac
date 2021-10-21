package com.sqa.utils;

import java.util.Base64;

public class Encoder {

    public String  encoder(String value){
        return  Base64.getEncoder().encodeToString(value.getBytes());
    }
    public String  decoder(String value){
        byte[] decodedBytes = Base64.getDecoder().decode(value);
        return  new String(decodedBytes);
    }

    public static void main(String[] args) {
        Encoder e = new Encoder();
        System.out.println(e.encoder("your password to encode"));
    }
}
