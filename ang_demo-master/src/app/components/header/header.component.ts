import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { UiService } from '../../services/ui.service';
import { Router} from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  
  title = 'PRODUCTS';
  showAddTask: boolean = false;
  subscription?: Subscription;

  constructor(private uiService: UiService,
    private router:Router) {
    this.subscription = this.uiService.ontoggle()
    .subscribe(
      (value) => (this.showAddTask = value)
    )
   }

  ngOnInit(): void {
  }

  toggleTask(){
    console.log("toggle");
    this.uiService.toggleAddTask();
  }

  hasRoute(route:string){
    return this.router.url ===route;
  }
}
