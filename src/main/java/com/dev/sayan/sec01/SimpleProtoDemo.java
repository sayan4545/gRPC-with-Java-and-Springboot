package com.dev.sayan.sec01;

import com.dev.sayan.models.sec01.PersonOuterClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleProtoDemo {
    private static final Logger log = LoggerFactory.getLogger(SimpleProtoDemo.class);

    public static void main(String[] args) {
        var person = PersonOuterClass.Person.newBuilder()
                .setName("Chandrika")
                .setAge(27)
                .build();

        log.info("{}",person);
    }
}
