package com.demoqa.page_object.utils;

import static com.demoqa.page_object.DataFaker.faker;

public class Utils {
    public static String month() {
        String month = "";
        int num = faker.number().numberBetween(0, 12);
        switch (num) {
            case 0: month = "January"; break;
            case 1: month = "February"; break;
            case 2: month = "March"; break;
            case 3: month = "April"; break;
            case 4: month = "May"; break;
            case 5: month = "June"; break;
            case 6: month = "July"; break;
            case 7: month = "August" ;break;
            case 8: month = "September"; break;
            case 9: month = "October"; break;
            case 10: month = "November"; break;
            case 11: month = "December"; break;
        }
        return month;
    }

    public static String hobbies() {
        String hobbies = "";
        int num = faker.number().numberBetween(0, 3);
        switch (num) {
            case 0: hobbies = "Sports"; break;
            case 1: hobbies = "Music"; break;
            case 2: hobbies = "Reading"; break;
        }
        return hobbies;
    }

    public static String Subjects() {
        String subject = "";
        int num = faker.number().numberBetween(0, 5);
        switch (num) {
            case 0: subject = "Arts"; break;
            case 1: subject = "Biology"; break;
            case 2: subject = "Maths"; break;
            case 3: subject = "Accounting"; break;
            case 4: subject = "Chemistry"; break;
        }
        return subject;
    }
}

