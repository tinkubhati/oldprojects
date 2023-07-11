import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  title ='TinkuBhati';

  constructor() { }

  ngOnInit(): void {
  }
  toggleTask(){
    console.log("Tinku")
  }
  tinkuB(){
    console.log("Hey There!!")
  }
}
