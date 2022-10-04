package Application.RunMethod;

import Application.EmployeeManager.EmployeeManagerArrayList;

import java.util.Scanner;

public class RunArrayList {
    Scanner sc = new Scanner(System.in);
    private boolean control = true;
    private int n = 0;
    private int choice = 6;
    private int id = 0;
    private int editId = 0;
    private int nCopy = 0;
    EmployeeManagerArrayList manager = new EmployeeManagerArrayList();


    public void Run() {
        while (true) {
            switch (this.choice) {
                case 1: {

                    do {
                        System.out.println("Enter the number of employees that you want to add :: ");
                        try {
                            if (this.n == 0) {
                                control = false;
                                this.n = sc.nextInt();
                                this.nCopy = this.n;

                            } else {
                                this.nCopy = sc.nextInt();
                                this.n += this.nCopy;


                            }





                        } catch (Exception e) {
                            sc.next();
                            System.out.println("Error wrong data type");

                            this.control = true;
                        }
                    } while (this.control);


                    for (int i = this.n - this.nCopy; i < this.n; i++) {

                        System.out.println("Employee number  " + (i + 1));
                        System.out.println("Enter name ::");

                        String name = sc.next();

                        System.out.println("Enter surname ::");
                        String surname = sc.next();

                        System.out.println("Enter gender ::");
                        String gen = sc.next();


                        manager.create(name, surname, gen, i);


                    }


                    this.choice = 6;
                    break;
                }
                case 2: {


                    manager.show(this.n);

                    this.choice = 6;
                    break;
                }
                case 3: {
                    manager.show(this.n);

                    do {
                        System.out.println("Enter the id of the employee that you want to edit :: ");
                        try {
                            this.control = false;
                            this.editId = sc.nextInt();

                        } catch (Exception e) {
                            sc.next();
                            System.out.println("Error wrong data type");

                            this.control = true;
                        }
                    } while (this.control);

                    System.out.println("Employee number  " + this.editId);
                    System.out.println("Enter name ::");

                    String name = sc.next();

                    System.out.println("Enter surname ::");
                    String surname = sc.next();

                    System.out.println("Enter gender ::");
                    String gen = sc.next();


                    manager.update(name, surname, gen, editId - 1);


                    this.choice = 6;
                    break;

                }
                case 4: {
                    manager.show(this.n);
                    do {
                        System.out.println("Enter the id of the employee that you want to delete :: ");
                        try {
                            this.control = false;
                            this.id = sc.nextInt();

                        } catch (Exception e) {
                            sc.next();
                            System.out.println("Error wrong data type");

                            this.control = true;
                        }
                    } while (this.control);

                    manager.delete(this.id - 1, this.n);
                    this.n--;


                    this.choice = 6;
                    break;
                }


                case 5: {
                    System.exit(0);

                }
                case 6: {

                    System.out.println("************* Welcome to Employee Manager *************");
                    System.out.println("1. Add employees");
                    System.out.println("2. Show employees");
                    System.out.println("3. Edit employees");
                    System.out.println("4. Delete employees");
                    System.out.println("5. Exit");
                    System.out.println("Choose action :: ");

                    do {
                        try {
                            this.control = false;
                            this.choice = sc.nextInt();

                        } catch (Exception e) {
                            sc.next();
                            System.out.println("Error wrong data type");
                            System.out.println("Choose action :: ");
                            this.control = true;
                        }
                    } while (this.control);


                }


            }
        }

    }



}
