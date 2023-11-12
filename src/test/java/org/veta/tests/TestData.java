package org.veta.tests;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestData {
    private static final Faker faker = new Faker(new Locale("en"));
    public static String
            fullName = faker.name().fullName(),
            email = faker.internet().emailAddress(),
            currentAddress = faker.address().fullAddress(),
            permanentAddress = faker.address().fullAddress(),
            testName = "Test name";
}
