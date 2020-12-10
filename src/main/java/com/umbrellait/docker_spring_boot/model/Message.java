package com.umbrellait.docker_spring_boot.model;


import javax.persistence.*;

@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "method")
    private String mеthod;

    @Column(name = "text")
    private String text;

    @Column(name = "date")
    private String date;

    public Message() {}

    public Message(String mеthod, String text, String date) {
        this.mеthod = mеthod;
        this.text = text;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMеthod() {
        return mеthod;
    }

    public void setMеthod(String mеthod) {
        this.mеthod = mеthod;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", mеthod='" + mеthod + '\'' +
                ", text='" + text + '\'' +
                '}';
    }




}
