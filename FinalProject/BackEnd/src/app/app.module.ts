import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeLoginComponent } from './employee-login/employee-login.component';
import { FormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MaterialModule } from './shared/material.module';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { CustomerComponent } from './customer/customer.component';
import { AddcustomerComponent } from './addcustomer/addcustomer.component';
import { DatePipe } from '@angular/common';
import { FileUploadComponent } from './file-upload/file-upload.component';
import { InvoiceComponent } from './invoice/invoice.component';
import { TransactionComponent } from './transaction/transaction.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeLoginComponent,
    HomeComponent,
    HeaderComponent,
    CustomerComponent,
    AddcustomerComponent,
    FileUploadComponent,
    InvoiceComponent,
    TransactionComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MaterialModule
  ],
  providers: [DatePipe],
  bootstrap: [AppComponent]
  
})
export class AppModule { }
