package com.task75;

import java.util.Objects;

public class Entity {

    private String str;
    private int value;


    Entity(String str, int value) {
        this.str = str;
        this.value = value;
    }


    public String getStr() {
        return str;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Entity entity = (Entity) o;
        return value == entity.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(str, value);
    }
}
