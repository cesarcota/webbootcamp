package org.academiadecodigo.bootcamp.model;


public class Bootcamp {
    private int id;
    private String location;

    public Bootcamp() {
    }

    public Bootcamp(int id, String location) {
        this.id = id;
        this.location = location;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
