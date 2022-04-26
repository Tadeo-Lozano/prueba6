package edu.uaslp.objetos.taskslist;

import java.time.LocalDateTime;

public class Task {
    private String title;
    private String desc;
    private LocalDateTime date;
    private boolean tf;
    private TaskList task;

    public Task(String title, String desc, LocalDateTime date, boolean b) {
        this.title = title;
        this.desc = desc;
        this.date = date;
        tf = b;
    }

    public Task() {

    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.desc;
    }

    public LocalDateTime getDueDate() {
        return this.date;
    }

    public boolean isDone() {
        return false;
    }

    public void setTitle(String task) {
        this.title = task;
    }

    public void setDescription(String desc) {
        this.desc = desc;
    }

    public void setDueDate(LocalDateTime dateLocal) {
        this.date = dateLocal;
    }

    public void setDone(boolean b) {
        b=true;
    }
}
