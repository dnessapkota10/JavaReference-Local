package com.home.custom.annotation;

public @interface CustomAnnotation {
    String   id() default "0";
    String   name();
    int      age();
    String[] depts();
}