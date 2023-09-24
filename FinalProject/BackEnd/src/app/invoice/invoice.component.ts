import { Component, OnInit } from '@angular/core';
import { Bill } from '../model/Bill';
import { HttpService } from '../http.service';

const DEFAULT_BILL_STATUS = 'Un-Paid';

@Component({
  selector: 'app-invoice',
  templateUrl: './invoice.component.html',
  styleUrls: ['./invoice.component.css']
})


export class InvoiceComponent implements OnInit {

  bills: Bill[] = [];
  constructor(private service:HttpService) { }

  ngOnInit(): void {
    this.loadBillDetails();
  }

  loadBillDetails(): void {
    this.service.getInvoice().subscribe(
      (bills:any) => {
        this.bills = bills.map((bill:any) => ({
          ...bill,
          billStatus: DEFAULT_BILL_STATUS,
        }));
      },
      (error) => {
        console.error('Error loading bill details:', error);
      }
    );
  }

}
