package com.teaminternational;

public class HelloWorldGeneratorImpl implements HelloWorldGenerator {

    private String hello = "Hello visitor";

    public String sayHello() {
        return hello;
    }
}
