package com.example.recyclerview2;

public class ModalClass {

    private int image;
    private String name;
    private String message;
    private String time;

    public ModalClass(int image, String name, String message, String time) {
        this.image = image;
        this.name = name;
        this.message = message;
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }
}
