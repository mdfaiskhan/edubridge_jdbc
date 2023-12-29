package com.edu.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sf= new Configuration().configure().buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        
       employee ob=new employee();
//        Scanner sc=new Scanner(System.in);
//        System.out.println("**************Enter Employee Details*****************");
//        System.out.println("Enter Employee Id :");
//        ob.setId(sc.nextInt());
//        sc.nextLine();
//        System.out.println("Enter Employee Name :");
//        ob.setName(sc.nextLine());
//        System.out.println("Enter Employee Department : ");
//        ob.setDepartment(sc.nextLine());
//        System.out.println("Enter Employee Salary : ");
//        ob.setSalary(sc.nextFloat());
//        System.out.println("Record the Details ");
        ob.setId(103);
        ob.setName("madhu");
        ob.setDepartment("bca");
        ob.setSalary(18000);
        System.out.println("Record inserted");
//       ob=(employee) s.get(employee.class,101);
//       System.out.println("Employee ID : "+ob.getId());
//       System.out.println("Employee Name : "+ob.getName());
//      System.out.println("Employee Deparment : "+ob.getDepartment());
//     System.out.println("EMployee Salary : "+ob.getSalary());
//       
        s.save(ob);
        t.commit();
        s.close();
    }
}
