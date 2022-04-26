package edu.uaslp.objetos.taskslist;

import edu.uaslp.objetos.taskslist.exception.TaskNotFoundException;

import java.util.LinkedList;
import java.util.List;

public class TaskList implements TaskListInterface{
    private Task[] tarea;
    private int size;
    private int itemsCount;


    public TaskList(){
        List<Task> figureList = new LinkedList<>();
    }

    public int getSize() {
        return 0;
    }

    public void add(Task tarea) {
        itemsCount++;
    }

    public void remove(Task tarea) {
    }

    public Task find(String find) throws TaskNotFoundException {
        return null;
    }

    public boolean markAsDone(String taskDn) {
        return true;
    }

    public boolean markAsNotDone(String taskDn2) {
        return false;
    }

    public Task getNextTask() {
        return null;
    }

    public List<Task> getNextTasks() {
        return null;
    }
}
