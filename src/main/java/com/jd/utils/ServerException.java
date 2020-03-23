package com.jd.utils;

import java.io.IOException;

public class ServerException extends IOException {
    public ServerException(String message) {
        super(message);
    }
}
