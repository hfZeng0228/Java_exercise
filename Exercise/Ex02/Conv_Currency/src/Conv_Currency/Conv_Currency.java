package Conv_Currency;

import java.util.Scanner;

public class Conv_Currency {
public static void main(String[] args) {
	System.out.println("Enter the exchange rate from dollars to RMB:");
	Scanner input1=new Scanner(System.in);
	double Rate=input1.nextDouble();
	System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa:");
	Scanner input2=new Scanner(System.in);
	int Choice=input2.nextInt();
	System.out.println("Enter the dollar amount:");
	Scanner input3=new Scanner(System.in);
	double pri_currency=input3.nextDouble();
	double trans_currency=0;
	if(Choice==0) {
		trans_currency=pri_currency*Rate;
		System.out.println("$"+pri_currency+" is "+trans_currency+" yuan.");
	}
	else if(Choice==1) {
		trans_currency=pri_currency/Rate;
		System.out.println(pri_currency+" yuan is "+"$"+trans_currency);
	}
	else {
		System.out.println("Methods number is wrong!");
	}
}
}
