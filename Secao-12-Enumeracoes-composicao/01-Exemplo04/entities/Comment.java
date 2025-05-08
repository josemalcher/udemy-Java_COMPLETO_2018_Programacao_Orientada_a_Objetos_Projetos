package entities;

import java.util.Date;

public class Comment {
    private int id;
    private String comment;
    private String name;
    private Date data;

    public Comment(int id, String comment, String name, Date data) {
        this.id = id;
        this.comment = comment;
        this.name = name;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
