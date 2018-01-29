package ru.papont.tasks.controller;

import org.springframework.web.bind.annotation.*;
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
    public Iterable<Task> list() {
        return this.taskService.list();
    }

    @PostMapping("/save")
    public Task save(@RequestBody Task task) {
        return this.taskService.save(task);
    }

}
