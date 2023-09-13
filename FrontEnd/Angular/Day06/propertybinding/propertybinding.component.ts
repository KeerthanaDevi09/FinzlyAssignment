import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-propertybinding',
  templateUrl: './propertybinding.component.html',
  styleUrls: ['./propertybinding.component.css']
})
export class PropertybindingComponent implements OnInit {

  name:string='Keerthi E';

  imgUrl:string='../../assets/img1.jpg';
  constructor() { }

  ngOnInit(): void {
  }

}
