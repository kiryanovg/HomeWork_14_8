package com.demoqa.page_object;

import com.demoqa.page_object.utils.Utils;
import com.github.javafaker.Faker;

public class DataFaker {
    public static Faker faker = new Faker();
    public static String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            gender = faker.demographic().sex(),
            number = faker.numerify("##########"),
            addres = faker.address().fullAddress(),
            day = faker.number().numberBetween(1, 30) + "",
            year = faker.number().numberBetween(1900, 2023) + "",
            month = Utils.month(),
            hobbies = Utils.hobbies(),
            subject = Utils.Subjects(),
            state = "Haryana",
            city = "Karnal";

}

