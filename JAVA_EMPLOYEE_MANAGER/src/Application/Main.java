package Application;

import Application.Employee.Employee;
import Application.Functions.EmployeeManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean control = true;
        int n = 0;
        int choice = 6;
        int id = 0;
        int editId = 0;
        int deleteId = 0;
        int nCopy = 0;
        EmployeeManager manager = new EmployeeManager();







    while(true){
        switch(choice) {
            case 1: {

                do {
                    System.out.println("Enter the number of employees that you want to add :: ");
                    try {
                        if(n==0){
                            control = false;
                            n = sc.nextInt();
                            manager.createArr(n);
                            nCopy = n;

                        }
                        else {
                            nCopy =  sc.nextInt();
                            n += nCopy;
                            manager.addArr(n);

                        }


                    } catch (Exception e) {
                        sc.next();
                        System.out.println("Error wrong data type");

                        control = true;
                    }
                } while (control);



                for (int i = n-nCopy;i<n;i++) {

                    System.out.println("Employee number  " + (i+1));
                    System.out.println("Enter name ::");

                    String name = sc.next();

                    System.out.println("Enter surname ::");
                    String surname = sc.next();

                    System.out.println("Enter gender ::");
                    String gen = sc.next();


                    manager.create(name, surname, gen, i);


                }


                choice = 6;
                break;
            }
            case 2: {


                 manager.show(n);

                choice = 6;
                break;
            }
            case 3: {
                manager.show(n);

                do{
                    System.out.println("Enter the id of the employee that you want to edit :: ");
                    try {
                        control = false;
                        editId = sc.nextInt();

                    } catch (Exception e) {
                        sc.next();
                        System.out.println("Error wrong data type");

                        control = true;
                    }
            } while (control);

                System.out.println("Employee number  " + editId);
                System.out.println("Enter name ::");

                String name = sc.next();

                System.out.println("Enter surname ::");
                String surname = sc.next();

                System.out.println("Enter gender ::");
                String gen = sc.next();


                manager.update(name, surname, gen, editId-1);



                choice = 6;
            break;

            }
            case 4:{
                manager.show(n);
                do{
                    System.out.println("Enter the id of the employee that you want to delete :: ");
                    try {
                        control = false;
                        id = sc.nextInt();

                    } catch (Exception e) {
                        sc.next();
                        System.out.println("Error wrong data type");

                        control = true;
                    }
                } while (control);

                    manager.delete(id-1,n);
                    n--;


                choice = 6;
                break;
            }


            case 5:{
               return;

            }
            case 6:{

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
                        System.out.println("Choose action :: ");
                        control = true;
                    }
                }while(control);


            }



        }}

    }
}