import { Injectable } from '@angular/core';
import { Observable,Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UiService {
  private ShowAddTask : boolean = false;
  private subject = new Subject<any>();

  constructor() { }

  toggleAddTask(): void{
    console.log("this is from server")
    this.ShowAddTask = !this.ShowAddTask;
    this.subject.next(this.ShowAddTask);
  }
  ontoggle():Observable<any>{
    return this.subject.asObservable();
  }
}
