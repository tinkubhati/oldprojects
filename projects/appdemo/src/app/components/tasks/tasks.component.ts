import { Component, OnInit } from '@angular/core';
import { Tasks } from 'src/app/data';
import { Task } from '../../task';


@Component({
  selector: 'app-tasks',
  templateUrl: './tasks.component.html',
  styleUrls: ['./tasks.component.css']
})
export class TasksComponent implements OnInit {
tasks:Task[] = Tasks;
  constructor() { }

  ngOnInit(): void {
  }

}
