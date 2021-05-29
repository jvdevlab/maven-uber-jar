package com.jvdevlab.app;

import org.apache.commons.lang3.StringUtils;

public class App {

    public static void main(String args[]) {
        String greetings = "Hello World!";
        if (StringUtils.isNotBlank(greetings)) {
            System.out.println(greetings);
        }
    }
}
