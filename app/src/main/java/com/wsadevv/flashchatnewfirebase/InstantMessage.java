package com.wsadevv.flashchatnewfirebase;

/**
 * Created by wsadevv on 7/17/17.
 */

public class InstantMessage {
    private String message;
    private String author;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public InstantMessage() {
    }

    public InstantMessage(String message, String author) {
        this.message = message;
        this.author = author;
    }
}
