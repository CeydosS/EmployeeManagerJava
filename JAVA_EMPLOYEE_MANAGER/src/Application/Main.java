package Application;


import java.util.Scanner;

import Application.RunMethod.RunArrayList;
import Application.RunMethod.RunArray;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = -1;
        boolean control = true;
        System.out.println("1.Work with array (1)\n2.Work with ArrayList(2)");
     do {
         try {
             do {
                 choice = sc.nextInt();
                 control = false;
             } while (choice != 1 && choice != 2);
         } catch (Exception e) {
             System.out.println("Data type error please enter 1/2");
             control = true;
             sc.next();

         }
     }while(control);
     if(choice == 1){
         RunArray managerArray = new RunArray();
         managerArray.Run();

     }
     else if(choice == 2){
         RunArrayList managerArrayList = new RunArrayList();
         managerArrayList.Run();
     }



    }
}