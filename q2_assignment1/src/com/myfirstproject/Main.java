package com.myfirstproject;
import java.util.Scanner;
class Employee{
public int id;
public String EmployeeName;
}
class SalaryEmployee implements IPayrollCalculator{

    public void calculate_payroll(){
        int number;
        System.out.println("Employee name is : ");
        System.out.println(this.EmployeeName);
        System.out.println("Id number is : ");
        System.out.println(this.id);
        Scanner sc=new Scanner (System.in);
        number=sc.nextInt();
        System.out.println("The pay is ");
        System.out.print(number);
}
}
class HourlyEmployee implements IPayrollCalculator{
    public void calculate_payroll(){
        System.out.println("Employee name is : ");
        System.out.println(this.EmployeeName);
        System.out.println("Id number is : ");
        System.out.println(this.id);
        Scanner sc=new Scanner (System.in);
        int number=sc.nextInt();
        System.out.println("The pay is ");
        System.out.print(number*8);
    }
}
class CommissionEmployee implements IPayrollCalculator {
    public void calculate_payroll(){
        System.out.println("Employee name is : ");
        System.out.println(this.EmployeeName);
        System.out.println("Id number is : ");
        System.out.println(this.id);
        Scanner sc=new Scanner (System.in);
        int number=sc.nextInt();
        System.out.println("The pay is ");
        System.out.print(number+100);
    }
}
interface IPayrollCalculator{
    int id=0;
    String EmployeeName=" ";
    public void calculate_payroll();
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Salary Employee");
        SalaryEmployee se=new  SalaryEmployee();
        se.calculate_payroll();
        System.out.println("Hourly Employee");
        HourlyEmployee he=new  HourlyEmployee();
        he.calculate_payroll();
        System.out.println("Commission Employee");
        CommissionEmployee ce=new CommissionEmployee();
        ce.calculate_payroll();
    }
}
