import { Component, Input, OnInit } from '@angular/core';
import { Task } from 'src/app/task';

@Component({
  selector: 'app-task-item',
  templateUrl: './task-item.component.html',
  styleUrls: ['./task-item.component.css']
})
export class TaskItemComponent implements OnInit {
  @Input() task?: Task;

  constructor() { }

  ngOnInit(): void {
  }

}
