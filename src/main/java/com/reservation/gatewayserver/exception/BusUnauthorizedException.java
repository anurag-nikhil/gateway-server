package com.reservation.gatewayserver.exception;

public class BusUnauthorizedException extends RuntimeException {

    public BusUnauthorizedException(String message) {
        super(message);
    }
}
