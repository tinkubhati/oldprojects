import { Component, Input, OnInit, EventEmitter, Output } from '@angular/core';
import { CheckboxRequiredValidator } from '@angular/forms';
import { Subscription } from 'rxjs';
import { TASKS } from 'src/app/mock-data';
import { Task } from 'src/app/Task';


@Component({
  selector: 'app-add-task',
  templateUrl: './add-task.component.html',
  styleUrls: ['./add-task.component.css']
})
export class AddTaskComponent implements OnInit {

  @Output() onAddTask: EventEmitter<Task> = new EventEmitter();
  name: string = '';
  text: string = '';
  dis: string = '';
  price: number=0;
  reminder: boolean= false;
  

  constructor() { }

  ngOnInit(): void {
  }
  onSubmit(){
    if(!this.text){
      alert("please add a task");
      return;
    }
    const newTask = {
      name: this.name,
      text: this.text,
      dis: this.dis,
      price: this.price,
      reminder: this.reminder
    }
    this.onAddTask.emit(newTask)
    this.name ='';
    this.text = '';
    this.dis = '';
    this.price = 0;
    this.reminder = false;
    
  }

}
