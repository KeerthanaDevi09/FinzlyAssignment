import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-inputbox-width-change',
  templateUrl: './inputbox-width-change.component.html',
  styleUrls: ['./inputbox-width-change.component.css']
})
export class InputboxWidthChangeComponent implements OnInit {

  number1!:number;
  width:number=50;
  constructor() { }

  ngOnInit(): void {
  }

  onChange()
  {
    this.width=this.number1?this.number1*10:50;
  }

}
