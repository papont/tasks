package ru.papont.tasks.repository;

import org.springframework.data.repository.CrudRepository;
import ru.papont.tasks.domain.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
