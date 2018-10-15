package com.rikkirun.flappy;

public class Event {
    //all data from an event
    private String title;
    private String address;
    private String description;

    //constructor
    public Event(String title, String address, String description) {
        this.title = title;
        this.address = address;
        this.description = description;
    }

    //getters for private attributes of event class
    public String getTitle(){
        return this.title;
    }

    public String getAddress() {
        return this.address;
    }

    public String getDescription() {
        return this.description;
    }
}
