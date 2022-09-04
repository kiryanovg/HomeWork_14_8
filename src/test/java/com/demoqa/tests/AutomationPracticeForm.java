package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.page_object.DataFaker;
import com.demoqa.page_object.RegistrationFormPage;
import com.demoqa.page_object.utils.Utils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.demoqa.page_object.DataFaker.*;

public class AutomationPracticeForm {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    DataFaker dataFaker = new DataFaker();
    Utils utils = new  Utils();

    @BeforeAll
    static void config() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browser = "chrome";
 //       Configuration.holdBrowserOpen = true;
 //       Configuration.timeout = 10000;
        Configuration.browserSize = "760x840";

    }

    @Test
    void fillFormTests() {
        registrationFormPage
                .openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .clickGender(gender)
                .userNumber(number)
                .setBirthDate(day, month, year)
                .setSubjects(subject)
                .clickCheckboxHobbies(hobbies)
                .uploadImage("src/test/resources/111.jpg")
                .setAddress(addres)
                .setState(state)
                .setCity(city)
                .clickSubmit("submit");

        registrationFormPage.checkResultsTableVisible()
                .checkResult("Date of Birth", day + " " + month + "," + year)
                .checkResult("Student Name", firstName + " " + lastName)
                .checkResult("Student Email", userEmail)
                .checkResult("gender", gender)
                .checkResult("Mobile", number)
                .checkResult("Subjects", subject)
                .checkResult("Hobbies", hobbies)
                .checkResult("Address", addres)
                .checkResult("State and City", state + city);

    }
}
