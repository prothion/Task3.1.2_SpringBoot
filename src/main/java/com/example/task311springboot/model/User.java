package com.example.task311springboot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    private long id;

    @Column(name="name")
    @NotEmpty(message = "Поле не должно быть пустым.")
    @Size(min = 1, max = 32, message = "Количество допустимых символов от 1 до 32.")
    private String name;

    @Column(name="lastname")
    @NotEmpty(message = "Поле не должно быть пустым.")
    @Size(min = 1, max = 32, message = "Количество допустимых символов от 1 до 32.")
    private String lastname;

    @Column(name="age")
    @Min(value = 0, message = "Поле не должно быть пустым.")
    @Max(value = 100, message = "Возраст превышает допустимое значение(<100)")
    private byte age;

    @Column(name="car")
    @NotEmpty(message = "Поле не должно быть пустым.")
    @Size(min = 1, max = 32, message = "Количество допустимых символов от 1 до 32.")
    private String car;

    @Column(name="timeRegistration")
    private LocalDateTime timeRegistration;

    public User() {
    }

    public User(String name, String lastname, byte age, String car) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.car = car;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public LocalDateTime getTimeRegistration() {
        return LocalDateTime.now();
    }

    public LocalDateTime setTimeRegistration() {
        return timeRegistration;
    }

    @Override
    public String toString() {
        return String.format("User {id = '%s', name = '%s', lastName = '%s', age = '%d', car = '%s', timeRegistration = '%s'}", getId(), getName(), getLastname(), getAge(), getCar(), getTimeRegistration().toString());
    }
}