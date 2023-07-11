import { Component, Input, OnInit } from '@angular/core';
import { CheckboxRequiredValidator } from '@angular/forms';

@Component({
  selector: 'app-add-task',
  templateUrl: './add-task.component.html',
  styleUrls: ['./add-task.component.css']
})
export class AddTaskComponent implements OnInit {
  
  text : string = '';
  day : string = '';
  reminder: boolean = false ;

  constructor() { }

  ngOnInit(): void {
  }
  onSubmit(){
    if(!this.text){
      alert("please add a task");
      return;
    }

    const newTask = {
      text: this.text,
      day: this.day,
      reminder: this.reminder
    }
  }

}
