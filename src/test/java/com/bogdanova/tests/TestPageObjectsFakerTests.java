package com.bogdanova.tests;

import com.bogdanova.pages.RegistrationFormPage;
import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.bogdanova.utils.InfoUsersForFakerTests.*;

public class TestPageObjectsFakerTests {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest() {
        registrationFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setNumber(number)
                .setBirthDate(day, month, year)
                .setSubject(subject)
                .setHobby(hobby)
                .uploadFile(path)
                .setAddress(address)
                .setStateAndCity(state, city)
                .submit();

        registrationFormPage.checkResultTableVisibility()
                .checkResultTableData(firstName, lastName, email, number, date, gender,
                        pic, address, subject, hobby, state, city);
    }
}