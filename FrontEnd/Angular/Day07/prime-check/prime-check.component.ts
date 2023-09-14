import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-prime-check',
  templateUrl: './prime-check.component.html',
  styleUrls: ['./prime-check.component.css']
})
export class PrimeCheckComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  userInput: number = 1;
  result: boolean | null = null;

  checkPrime() {
    if (this.userInput <= 1) {
      this.result = false;
    } else if (this.userInput <= 3) {
      this.result = true;
    } else if (this.userInput % 2 === 0 || this.userInput % 3 === 0) {
      this.result = false;
    } else {
      let i = 5;
      while (i * i <= this.userInput) {
        if (this.userInput % i === 0 || this.userInput % (i + 2) === 0) {
          this.result = false;
          return;
        }
        i += 6;
      }
      this.result = true;
    }
  }

}
