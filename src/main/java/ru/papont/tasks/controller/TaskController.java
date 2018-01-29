package ru.papont.tasks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.papont.tasks.domain.Task;
import ru.papont.tasks.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value={"", "/"})
    Iterable<Task> list() {
        return this.taskService.list();
    }
}
