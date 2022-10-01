package Application.Functions;

import Application.Employee.Employee;

public class EmployeeManager extends Employee implements EmployeeInterface{

    private Employee[] employees;

    public void createArr(int n){

        this.employees = new Employee[n];

    }
    public void addArr(int n){
        Employee[] employeesCopy = new Employee[this.employees.length];

        for(int i = 0;i<this.employees.length;i++){
            employeesCopy[i] = employees[i];
        }
       this.employees = new Employee[n+1];

        for(int i = 0;i<employeesCopy.length;i++){
            employees[i] = employeesCopy[i];
        }

   }

    public void create(String name,String surname,String gen,int id){
        this.employees[id] = new Employee();
        this.employees[id].setName(name);
        this.employees[id].setSurname(surname);
        this.employees[id].setGender(gen);
        this.employees[id].setId(id);
    }

    public void update(String name,String surname,String gen,int id){
        this.employees[id].setName(name);
        this.employees[id].setSurname(surname);
        this.employees[id].setGender(gen);
        this.employees[id].setId(id);


    }

    public void delete(int id,int n){
            if(id==n-1){
                return;
            }
           for(int i = id;i<n;i++){

               this.employees[id].setName(this.employees[id+1].getName());
               this.employees[id].setSurname(this.employees[id+1].getSurname());
               this.employees[id].setGender(this.employees[id+1].getGender());
               this.employees[id].setId(this.employees[id+1].getId());

           }
    }

    public void show(int n){
        System.out.println("\n****************Employees****************");
        for(int i = 0;i<n;i++){

            System.out.println("Employee Id :: "+(employees[i].getId() + 1));
            System.out.println("Name :: "+employees[i].getName());
            System.out.println("Surname :: "+employees[i].getSurname());
            System.out.println("Surname :: "+employees[i].getGender());
            System.out.println("\n");
        }
        System.out.println("*****************************************");
    }





}
