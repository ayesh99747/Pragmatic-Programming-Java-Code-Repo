package lk.pragmatic.programming;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    private final String name;
    private final int age;
    private final String gender;

    Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender;
    }
}

