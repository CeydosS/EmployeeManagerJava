package Application.Functions;

import Application.Employee.Employee;

public class EmployeeManager extends Employee implements EmployeeInterface{

    Employee[] employees;

    public void createArr(int n){

        employees = new Employee[n];

    }

    public void create(String name,String surname,String gen,int id){

//            employees[id].setName(name);
//            employees[id].setSurname(surname);



    }

    public void update(){




    }

    public void delete(){




    }

    public void show(int n){
        for(int i = 0;i<n;i++){

            employees[i].getName();
            employees[i].getSurname();

        }



    }



}
