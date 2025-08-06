package com.dev.sayan.sec02;

import com.dev.sayan.models.sec02.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProtoMultipleFilesDemo {
    private static final Logger log
            = LoggerFactory.getLogger(ProtoMultipleFilesDemo.class);

    public static void main(String[] args) {

        var person = Person.newBuilder()
                .setName("Sayan")
                .setAge(27)
                .build();

        log.info("{}",person);

    }
}
