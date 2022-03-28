package com.example.urlshortener.url;

import java.util.zip.CRC32C;

public class HashUtil {

    private HashUtil() {
    }

    static String hash(String str) {
        CRC32C hasher = new CRC32C();
        hasher.update(str.getBytes());
        return String.valueOf(hasher.getValue());
    }
}
