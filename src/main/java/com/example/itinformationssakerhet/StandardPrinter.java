package com.example.itinformationssakerhet;

public class StandardPrinter implements MessagePrinter{
    @Override
    public void print(String message) {
        System.out.println("Standard: " +message);
    }
}
