import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mouse-event',
  templateUrl: './mouse-event.component.html',
  styleUrls: ['./mouse-event.component.css']
})
export class MouseEventComponent implements OnInit {


  opacity:number=1;
  imgUrl:string='../../assets/img1.jpg';
  constructor() { }

  ngOnInit(): void {
  }

  onMouseOver()
  {
    this.opacity=0.5;
  }

  onMouseOut()
  {
    this.opacity=1;
  }

}
