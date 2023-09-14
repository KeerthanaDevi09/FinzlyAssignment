import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-classbinding',
  templateUrl: './classbinding.component.html',
  styleUrls: ['./classbinding.component.css']
})
export class ClassbindingComponent implements OnInit {

  isItalic:boolean=false;
  isChange:boolean=false;

  constructor() { }

  onClick()
  {
    this.isItalic=!this.isItalic;
    this.isChange=!this.isChange;
  }


  ngOnInit(): void {
  }

}
