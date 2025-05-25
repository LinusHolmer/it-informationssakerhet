package com.example.itinformationssakerhet;

public class Movie {
    private String title;
    private int productionYear;
    private String director;
    private String description;
    private String id;

// test
    public Movie(){
    }

    public Movie(String title, int productionYear, String director, String description) {
        this.title = title;
        this.productionYear = productionYear;
        this.director = director;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
