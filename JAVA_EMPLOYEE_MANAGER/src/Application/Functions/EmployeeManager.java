package Application.Functions;

import Application.Employee.Employee;

public class EmployeeManager extends Employee implements EmployeeInterface{

    private Employee[] employees;

    public void createArr(int n){

        this.employees = new Employee[n];

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

    public void delete(int id){
        Employee[] arrNew = new Employee[this.employees.length-1];

        for(int i=0, k=0;i<employees.length;i++){
            if(this.employees[i].getId()!=id){
                arrNew[k]=this.employees[i];
                k++;
            }
        }
        for(int i = 0;i<this.employees.length-1;i++){
            this.employees[i] = arrNew[i];
        }




    }

    public void show(int id){
        for(int i = 0;i<id;i++){
            System.out.println("Employee Id :: "+(employees[i].getId() + 1));
            System.out.println("Name :: "+employees[i].getName());
            System.out.println("Surname :: "+employees[i].getSurname());
            System.out.println("Surname :: "+employees[i].getGender());
        }

    }





}
