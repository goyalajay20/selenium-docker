package com.ajay.util;

import org.testng.IConfigurable;

public class DemoProp {
    public static void main(String[] args) {
        System.setProperty("browser","firefox"); //it will reset the properties files.
        Config.initialize();
        System.out.println(Config.get("selenium.grid.hubHost"));
    }
}
