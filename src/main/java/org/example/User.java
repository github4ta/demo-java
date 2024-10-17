package org.example;

import java.util.Objects;

public class User {
    char ch;

    public User(char ch) {
        this.ch = ch;
    }

    @Override
    public String toString() {
        return "User{" +
                "ch=" + ch +
                '}';
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
