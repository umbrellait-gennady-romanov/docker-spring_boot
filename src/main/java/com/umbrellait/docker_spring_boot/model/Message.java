package com.umbrellait.docker_spring_boot.model;


import javax.persistence.*;

@Entity
@Table(name = "Message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "method")
    private String mеthod;

    @Column(name = "text")
    private String text;

    public Message() {}

    public Message(String mеthod, String text) {
        this.mеthod = mеthod;
        this.text = text;
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

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", mеthod='" + mеthod + '\'' +
                ", text='" + text + '\'' +
                '}';
    }




}
