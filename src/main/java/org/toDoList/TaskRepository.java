package org.toDoList;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    private final List<Task> tasksList = new ArrayList<>();
    private int idTask = 0;

    public void addTask(String taskName) {
        idTask++;
        Task task = new Task(idTask, taskName);
        tasksList.add(task);
    }

    public void removeTask(int taskId) {
        if (!tasksList.isEmpty() && tasksList.contains(tasksList.get(taskId - 1))) {
            tasksList.remove(taskId - 1);
            System.out.println("Задача удалена");
        } else {
            System.out.printf("Задачи с номером %s не существует", taskId);
        }
    }

    public int getIdTask() {
        return idTask;
    }

    public List<Task> getTasksList() {
        return tasksList;
    }
}
