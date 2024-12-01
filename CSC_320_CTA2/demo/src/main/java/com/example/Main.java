package com.example;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    double IncomeUnder500TaxRate = 0.10;
    double IncomeAt1500TaxRate = 0.15;
    double IncomeAt2500TaxRate = 0.20;
    double IncomeOver2500TaxRate = 0.30;
    double Tax = 0;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Weekly Income: ");
    double income = scanner.nextDouble();
    scanner.close();

    if (income < 500){
        Tax = IncomeUnder500TaxRate;
    }
    else if(income >= 500 && income < 1500){
        Tax = IncomeAt1500TaxRate;
    }
    else if(income >= 1500 && income < 2500){
        Tax = IncomeAt2500TaxRate;
    }
    else if(income >= 2500){
        Tax = IncomeOver2500TaxRate;
    }

    System.out.print("You Tax Rate is " + Tax);

    }
}