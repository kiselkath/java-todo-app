package com.example.todo;

public class Task {
    private String title;
    private boolean isDone;
    private String priority;

    public Task(String title) {
        this.title = title;
        this.isDone = false;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public boolean isDone() {
        return isDone;
    }

    public String getPriority() {
        return priority;
    }

    public void markDone() {
        this.isDone = true;
    }

    @Override
    public String toString() {
        return (isDone ? "[X] " : "[ ] ") + title;
    }
}
