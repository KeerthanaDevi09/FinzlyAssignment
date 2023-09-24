import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';
import { TransactionHistory } from '../model/Transaction';

@Component({
  selector: 'app-transaction',
  templateUrl: './transaction.component.html',
  styleUrls: ['./transaction.component.css']
})
export class TransactionComponent implements OnInit {

  transactions!: TransactionHistory[];
  customerId!: number;
  isTableVisible = false;
  constructor(private service: HttpService) {}

  ngOnInit(): void {
    this.loadTransactions();
  }

  loadTransactions(): void {
    this.service.getAllTransactions().subscribe(
      (data:any) => {
        this.transactions = data;
      },
      (error) => {
        console.error('Error loading transactions:', error);
      }
    );
  }

    loadTransactions1(): void {
      if (this.customerId === null) {
        alert('Please enter a valid customer ID.');
        return;
      }
  
      this.service.getTransactionsByCustomerId(this.customerId).subscribe(
        (data:any) => {
          this.transactions = data;
          this.isTableVisible = true;
        },
        (error) => {
          console.error('Error loading transactions:', error);
        }
      );
    }
  }
  


