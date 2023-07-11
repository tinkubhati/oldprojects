import { Component, OnInit, Input } from '@angular/core';
import { Task } from '../../Task';
import { faCoffee,faAddressBook  } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-task-item',
  templateUrl: './task-item.component.html',
  styleUrls: ['./task-item.component.css']
})
export class TaskItemComponent implements OnInit {
  faTimes = faAddressBook ;
  @Input() task?: Task;

  constructor() { }

  ngOnInit(): void {
  }

}
