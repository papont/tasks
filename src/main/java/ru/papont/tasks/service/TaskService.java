package ru.papont.tasks.service;

import ru.papont.tasks.domain.Task;

public interface TaskService {
    Iterable<Task> list();

    Task save(Task task);
}
