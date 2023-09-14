import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-eventbinding',
  templateUrl: './eventbinding.component.html',
  styleUrls: ['./eventbinding.component.css']
})
export class EventbindingComponent implements OnInit {
  constructor() { }
  ngOnInit(): void {
  }
  onClick(myevent:any){
      console.log("Click event occured");
      console.log(myevent);
      console.log(myevent.target.value);
  }
}
