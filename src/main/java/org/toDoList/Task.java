package org.toDoList;

public class Task {
    private final int idTask;
    private final String nameTask;

    public Task(int idTask, String nameTask) {
        this.idTask = idTask;
        this.nameTask = nameTask;
    }

    public int getIdTask() {
        return idTask;
    }

    public String getNameTask() {
        return nameTask;
    }
}
