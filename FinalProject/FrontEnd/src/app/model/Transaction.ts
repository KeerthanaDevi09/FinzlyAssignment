export interface TransactionHistory {
    transactionId: number;
    customerId: number;
    customerName: string;
    unitConsumption: number;
    dueDate: string;
    billPaidDate: string; 
    paidAmount: number;
    paymentMode: string;
  }
  