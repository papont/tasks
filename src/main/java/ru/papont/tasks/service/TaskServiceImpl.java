package ru.papont.tasks.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.papont.tasks.domain.Task;
import ru.papont.tasks.repository.TaskRepository;

public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return this.taskRepository.save(task);
    }
}
