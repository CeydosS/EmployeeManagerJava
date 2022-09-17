package Application;

import Application.Employee.Employee;
import Application.Functions.EmployeeManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean control = true;
        int n = 0;
        int choice = 0;
        EmployeeManager manager = new EmployeeManager();



        System.out.println("************* Welcome to Employee Manager *************");
        System.out.println("1. Add employees");
        System.out.println("2. Show employees");
        System.out.println("3. Edit employees");
        System.out.println("4. Delete employees");
        System.out.println("5. Exit");
        System.out.println("Choose action :: ");

        do{
            try{
                control = false;
                choice= sc.nextInt();

            }catch(Exception e){
                sc.next();
                System.out.println("Error wrong data type");
                control = true;
            }
        }while(control);
        control = true;

    while(true){
        switch(choice){
            case 1:{

                do{
                    System.out.println("Enter the number of employees that you want to add :: ");
                    try{
                        control = false;
                        n= sc.nextInt();

                    }catch(Exception e){
                        sc.next();
                        System.out.println("Error wrong data type");
                        control = true;
                    }
                }while(control);
                manager.createArr(n);
                for(int i = 0;i<n;i++){
                    System.out.println("Employee number  "+(i+1));
                    System.out.println("Enter name ::");
                    String name = sc.nextLine();
                    sc.next();
                    System.out.println("Enter surname ::");
                    String surname = sc.nextLine();
                    sc.next();
                    System.out.println("Enter gender ::");
                    String gen = sc.nextLine();
                    sc.next();
                    manager.create(name,surname,gen,i);




                }



                    break;
            }
            case 2:{



                break;
            }
            case 3:{



                    break;
            }
            case 4:{




            }

            case 5:{
                return;
            }





        }}


//        do{
//            try{
//                control = false;
//                n= sc.nextInt();
//
//            }catch(Exception e){
//                sc.next();
//                System.out.println("Error wrong data type");
//                control = true;
//            }
//        }while(control);










    }
}