import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HttpService {

  url1:string=environment.baseUrl1;
  url2:string=environment.baseUrl2;
  url3:string=environment.baseUrl3;
  url4:string=environment.baseUrl4;
  constructor(private http:HttpClient) { }

  login(obj:any){
    return (this.http.post(`${this.url1}employee-login`,obj,{responseType:'text'}));
  }

  getAllRecord(){
    return (this.http.get(`${this.url2}getall-customer`));
  }

  addCustomerRecord(obj:any){
    return ( this.http.post(`${this.url2}add-customer`,obj,{responseType:'text'}));
  }

  getAllTransactions() {
    return this.http.get(`${this.url4}/getall-transaction`);
  }

  getTransactionsByCustomerId(customerId: number) {
    return this.http.get(`${this.url4}/getByCustomerId/${customerId}`);
  }

  getInvoice(){
    return this.http.get(`${this.url3}/getall-bill`);
  }
}
