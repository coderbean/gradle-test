package com.manning.gia.todo.model;

/**
 * Created by zhangbo54 on 2018/8/17.
 */
public class ToDoItem {
    private long id;
    private String name;
    private boolean completed;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "{\"ToDoItem\":{"
                + "\"id\":\"" + id + "\""
                + ", \"name\":\"" + name + "\""
                + ", \"completed\":\"" + completed + "\""
                + "}}";
    }
}
