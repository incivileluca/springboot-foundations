package com.example.toyproject.domain.data;

//record class hold immutable variables, generates construcor, getter, equals, toString, toHash methods
public record Greeting(long id, String context) {
}
