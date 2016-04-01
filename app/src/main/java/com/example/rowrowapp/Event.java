package com.example.rowrowapp;

public class Event {
    private final int id;
    private final String title;
    private final String description;

    public Event(int id, String name, String description){
        this.id = id;
        this.title = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
