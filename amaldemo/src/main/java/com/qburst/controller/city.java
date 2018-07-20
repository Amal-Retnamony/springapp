package com.qburst.controller;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="city")
public class city {


    private String name;

    @Id
    @GeneratedValue
    private int id;

    public city() {
    }

    public city(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        city city = (city) o;
        return id == city.id &&
                Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "city{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
