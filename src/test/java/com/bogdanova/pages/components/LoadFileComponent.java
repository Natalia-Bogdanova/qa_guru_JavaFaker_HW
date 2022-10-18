package com.bogdanova.pages.components;

    import java.io.File;

import static com.codeborne.selenide.Selenide.$;

    public class LoadFileComponent {

        public LoadFileComponent uploadFile(String path) {
            $("#uploadPicture").uploadFile(new File(path));
            return this;
        }
    }
