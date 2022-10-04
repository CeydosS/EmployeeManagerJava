package Application.Employee;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private String gen;

    public Employee(){}
    public Employee(String name,String surname,String gen,int id){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gen = gen;
    }

    public void setName(String name){

        this.name = name;

    }
    public String getName(){

        return this.name;

    }
    public void setSurname(String surname){

        this.surname = surname;

    }
    public String getSurname(){

        return this.surname;

    }

    public void setGender(String gen){
        this.gen = gen;
    }

    public String getGender(){
        return this.gen;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){

        return this.id;

    }


}
