package com.dev.sayan.sec02;

import com.dev.sayan.models.sec02.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProtoMultipleFilesDemo {
    private static final Logger log
            = LoggerFactory.getLogger(ProtoMultipleFilesDemo.class);

    public static Person createPerson(){
        return Person.newBuilder()
                .setName("Sayan").setAge(31)
                .build();
    }

    public static void main(String[] args) {


        var person1 = createPerson();
        var person2 = createPerson();
        log.info("comparing with person1.equals(person2) {}",person1.equals(person2));
        log.info("comparing person1==person2 {}",person1==person2);

//        var person = Person.newBuilder()
//                .setName("Sayan")
//                .setAge(27)
//                .build();
//
//        log.info("{}",person);

    }
}
