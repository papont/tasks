import {Component, OnInit} from '@angular/core';

import {Task} from '../task.model';
import {TaskService} from "../task.service";


@Component({
    selector: 'app-tasks-list',
    templateUrl: './tasks-list.component.html',
    styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

    tasks: Task[] = [];

    constructor(private taskService: TaskService) {
    }

    getDueDateLabel(task: Task) {
        return task.completed ? 'label-success' : 'label-primary';
    }

    onTaskChange(event, task) {
        this.taskService.saveTask(task, event.target.checked).subscribe();
        //console.log('Task has changed');
    }

    ngOnInit() {
        this.taskService.getTasks()
            .subscribe(
                (tasks: any[]) => {
                    this.tasks = tasks;
                },
                (error) => console.log(error)
            );

        this.taskService.onTaskAdded.subscribe(
            (task: Task) => this.tasks.push(task)
        );

        // this.tasks.push(new Task(1, "Task 1", true, "01.01.2018"));
        // this.tasks.push(new Task(2, "Task 2", false, "01.02.2018"));
        // this.tasks.push(new Task(3, "Task 3", false, "01.02.2018"));
    }

}
