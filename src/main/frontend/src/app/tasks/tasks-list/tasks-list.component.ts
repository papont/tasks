import {Component, OnInit} from '@angular/core';
import {Task} from './task.model';

@Component({
    selector: 'app-tasks-list',
    templateUrl: './tasks-list.component.html',
    styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

    tasks: Task[] = [];
    // taskService: TaskService;

    constructor() {
    }

    getDueDateLabel(task: Task) {
        return task.completed ? 'label-success' : 'label-primary';
    }

    onTaskChange(event, task){
        //this.taskService.saveTask(task, event.target.checked).subscribe()
        console.log('Task has changed');
    }

    ngOnInit() {
        this.tasks.push(new Task(1, "Task 1", true, "01.01.2018"));
        this.tasks.push(new Task(2, "Task 2", false, "01.02.2018"));
        this.tasks.push(new Task(3, "Task 3", false, "01.02.2018"));
    }

}