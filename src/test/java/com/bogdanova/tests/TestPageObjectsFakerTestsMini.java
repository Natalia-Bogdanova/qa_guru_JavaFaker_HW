package com.bogdanova.tests;

import com.bogdanova.pages.RegistrationFormPage;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.bogdanova.utils.InfoUsersForFakerTests.*;

public class TestPageObjectsFakerTestsMini {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @BeforeAll
    static void configure(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormWithMinimumTest() {
        registrationFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setGender(gender)
                .setNumber(number)
                .submit();
        registrationFormPage.checkResultTableVisibility()
                .checkResultTableData(firstName, lastName, number, gender);
    }
}
