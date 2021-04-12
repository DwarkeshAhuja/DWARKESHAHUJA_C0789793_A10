package com.DWARKESHAHUJA_C0789793_A10;

import java.util.ArrayList;
import java.util.Scanner;

public class Sales extends SalesPerson{

    public Sales(double sales, double advance) {
        super(sales, advance);
    }

    public static void main(String[] args) {
        ArrayList<Sales> array = new ArrayList();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter total number of salesperson ");
        double sale = 0.00;
        double advc;
        int num = sc.nextInt();
        for(int i = 0; i<num; i++){
            System.out.println("Enter the "+(i+1)+ " salesperson’s monthly sales");
            sale = sc.nextDouble();
            System.out.println("Enter the amount of advanced pay");
            advc = sc.nextDouble();
            array.add(new Sales(sale,advc));
        }
        for (Sales Sale : array){
            Sale.display();
        }
    }

    @Override
    void display() {
        System.out.println("The total sales of the person " + this.sales);
        System.out.println("The total advance of the person " + this.advance);
        double payment=0.00;
        double totalPayment = 0.00;
        if(this.sales < 10000)
            payment = this.sales*0.5;
        else if(this.sales>=10000 && this.sales<15000)
            payment=this.sales*0.10;
        else if(this.sales>=15000 && this.sales<18000)
            payment=this.sales*0.12;
        else if(this.sales>=18000 && this.sales<22000)
            payment=this.sales*0.15;
        else if(this.sales >=22000)
            payment = this.sales*0.16;
        totalPayment =payment-this.advance;
        System.out.println("The total commission is " + totalPayment);
    }
}