import { Injectable } from '@angular/core';
//dependencies injection is a design pattern in which a class requests for dependencies from external sources rather than creating them 
//Angular Injections increses flexibility and modularity in our applications
@Injectable({
  providedIn: 'root'
})
export class TaskObject {

  constructor() { }
}
