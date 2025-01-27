package SignimusTechnologyTask;

import java.util.Scanner;

interface PaymentInterface{

    abstract void pay(double amount);
    abstract void refund(double amount);

}

class CreditCardPayment implements PaymentInterface{

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount +"using Credit Card.");
    }

    @Override
    public void refund(double amount) {
     System.out.println("Refunding " + amount +"to Credit Card.");
    }
    
}

class PaypalPayment implements PaymentInterface{

    @Override
    public void pay(double amount) {
        System.out.println("Paying :"+amount +"using Paypal.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding :"+amount+"to Paypal");
    }
    
}

public class BankDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome , Select Payment Mehtod : ");
        System.out.println("1. Credit Card Payment ");
        System.out.println("2. Paypal Payment ");
        System.err.println("Enter your choice (1 or 2):");

        int choice  =sc.nextInt();
        System.out.println("Enter the Amount :");

        double amount = sc.nextDouble();

        PaymentInterface payment = null;


        PaymentInterface paymentMethod;

        switch(choice){
            case 1:
            payment = new CreditCardPayment();
            break;

            case 2 :
            payment = new PaypalPayment();
            break;

            default :
            System.out.println("Invalid choice . Please Restart the program .");
            System.exit(0);
        }

        payment.pay(amount);

        System.out.println("Do you want a refund ? (yes/no):");
        String refundChoice = sc.next();



        if(refundChoice.equalsIgnoreCase("yes")){  
           payment.refund(amount);
            
        }
        else{
            System.out.println("Payment completed successfully .");
            
        }
        sc.close();
    }
}

