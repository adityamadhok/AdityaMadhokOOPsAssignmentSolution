package com.GL.driver;
import com.GL.service.*;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
/* Driver class Main will be used to create objects of HrDepartment,
 *  TechDepartment, AdminDepartment
   Each department will display all its functionalities.
   Each department  will display whether today is a holiday or not with
    the help of the Super Department. 
   (SuperDepartment will act as a super class for all the departments)
*/
		
		//Variables
		
		boolean choice;
		char c='y';
		Scanner sc=new Scanner(System.in);
		byte input;
		
		
		do {
			choice=false;
			
	    //Objects
			
		SuperDepartment obj_SupDep= new SuperDepartment();	
		AdminDepartment obj_AdminDep= new AdminDepartment();
		HrDpartment obj_HrDep= new HrDpartment();
		TechDepartment obj_TecDep=new TechDepartment();
		
		
		System.out.println("Welcome please choose a department below to start!");
		System.out.println("1.Super Department");
		System.out.println("2.Admin Department");
		System.out.println("3.Hr Department");
		System.out.println("4.Tech Department");
		System.out.println("----------------------------------------------");
		input =sc.nextByte();
		switch(input) {
		
		case 1:
            System.out.println("Welcome to the "+obj_SupDep.departmentName());
			System.out.println(obj_SupDep.getTodaysWork());
			System.out.println(obj_SupDep.getWorkDeadline());
			System.out.println(obj_SupDep.isTodayAHoliday());
		
		break;
		
		
		case 2:
            System.out.println("Welcome to the "+obj_AdminDep.departmentName());
			System.out.println(obj_AdminDep.getTodaysWork());
			System.out.println(obj_AdminDep.getWorkDeadline());
			System.out.println(obj_AdminDep.isTodayAHoliday());
			
			
			break;
			
		case 3:
			System.out.println("Welcome to the "+obj_HrDep.departmentName());
			System.out.println(obj_HrDep.doActivity());
			System.out.println(obj_HrDep.getTodaysWork());
			System.out.println(obj_HrDep.getWorkDeadline());
			System.out.println(obj_HrDep.isTodayAHoliday());
			
			break;
			
		case 4:
			System.out.println("Welcome to the "+obj_TecDep.departmentName());
			System.out.println(obj_TecDep.getTodaysWork());
			System.out.println(obj_TecDep.getWorkDeadline());
			System.out.println(obj_TecDep.getTechStackInformation());
			System.out.println(obj_TecDep.isTodayAHoliday());
			
			
			break;
			
		
			default:
				throw new IllegalArgumentException("wrong input !"+input);
		}
		System.out.println("----------------------------------------------");
        System.out.println("do you wish to explore other departments(y/n)?");
        c=sc.next().charAt(0);
        if (c=='y') {
        	choice =true;
               }
        	
        }while(choice);
	}

}
