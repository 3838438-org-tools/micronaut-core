package io.micronaut.inject.visitor;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class TestBean {

    private String name;
    private int age;
    private String[] stringArray;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getStringArray() {
        return stringArray;
    }

    public void setStringArray(String[] stringArray) {
        this.stringArray = stringArray;
    }
}
