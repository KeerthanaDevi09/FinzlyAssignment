import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeLoginComponent } from './employee-login/employee-login.component';
import { HomeComponent } from './home/home.component';
import { CustomerComponent } from './customer/customer.component';
import { AddcustomerComponent } from './addcustomer/addcustomer.component';
import { FileUploadComponent } from './file-upload/file-upload.component';
import { TransactionComponent } from './transaction/transaction.component';
import { InvoiceComponent } from './invoice/invoice.component';

const routes: Routes = [
  {
    path:"",redirectTo:"/employee-login",pathMatch:"full"
  },
  {
    path:"employee-login",component:EmployeeLoginComponent
  },
  {
    path:"home",component:HomeComponent
  },
  {
    path:"customer",component:CustomerComponent
  },
  {
    path:'addcustomer',component:AddcustomerComponent
  },
  {
    path:'file-upload',component:FileUploadComponent
  },
  {
    path:'transaction',component:TransactionComponent
  },
  {
    path:'invoice',component:InvoiceComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
