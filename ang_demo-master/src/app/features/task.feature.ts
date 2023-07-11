import { Injectable } from '@angular/core';
//It is a design pattern in which a class request dependencies from external sources rather than creating them.
//Angular's DI framework provides dependencies to a class upon instantiation. Use Angular DI to increase flexibility and modularity in your applications.
@Injectable({
  providedIn: 'root'
})
export class TaskService {

  constructor() { }
}

