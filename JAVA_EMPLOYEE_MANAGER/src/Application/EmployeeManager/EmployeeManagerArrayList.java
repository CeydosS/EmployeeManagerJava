package Application.EmployeeManager;

import Application.Employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagerArrayList extends Employee implements EmployeeInterface {

        private List<Employee> employees = new ArrayList<>();

        public void create(String name,String surname,String gen,int id){


                this.employees.add(new Employee(name,surname,gen,id));
        }
        public void show(int n){
                System.out.println("\n****************Employees****************");

                for(Employee employee: employees){
                        System.out.println("Employee Id :: "+(employee.getId()+1));
                        System.out.println("Name :: "+employee.getName());
                        System.out.println("Surname :: "+employee.getSurname());
                        System.out.println("Surname :: "+employee.getGender());
                        System.out.println("\n");
                }

                System.out.println("*****************************************");

        }
        public void update(String name,String surname,String gen,int id){
                this.employees.remove(id);
                this.employees.add(id,new Employee(name,surname,gen,id));

        }
        public void delete(int id,int n){
                this.employees.remove(id);
        }



}
