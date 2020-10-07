package com.beyki.service.common;

import java.util.ResourceBundle;

public class ResourceMessageBundle {

    private static ResourceBundle getBundle() {
        return ResourceBundle.getBundle("msg");
    }

    private static String showMessage(String message) {
        return getBundle().getString(message);
    }
}
