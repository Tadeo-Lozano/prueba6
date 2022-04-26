package edu.uaslp.objetos.taskslist;

import edu.uaslp.objetos.taskslist.exception.TaskNotFoundException;

import java.util.List;

public interface TaskListInterface {

    public int getSize();

    public void add(Task tarea);

    public void remove(Task tarea);

    public Task find(String find) throws TaskNotFoundException;

    public boolean markAsDone(String taskDn);

    public boolean markAsNotDone(String taskDn2);

    public Task getNextTask();

    public List<Task> getNextTasks();
}
