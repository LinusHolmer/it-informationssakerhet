package com.example.itinformationssakerhet;

import jakarta.validation.constraints.NotBlank;

public class Person {
    // name (String)
    //age (int)
    //email (String)

    @NotBlank(message = "namn krävs")
    private String name;

    @NotBlank(message = "måste vara minst 18 år")
    private int age;

    @NotBlank(message = "ogiltig email")
    private String email;

    public @NotBlank(message = "namn krävs") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "namn krävs") String name) {
        this.name = name;
    }

    @NotBlank(message = "måste vara minst 18 år")
    public int getAge() {
        return age;
    }

    public void setAge(@NotBlank(message = "måste vara minst 18 år") int age) {
        this.age = age;
    }

    public @NotBlank(message = "ogiltig email") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "ogiltig email") String email) {
        this.email = email;
    }
}
