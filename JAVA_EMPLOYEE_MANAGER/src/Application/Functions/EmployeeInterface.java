package Application.Functions;

public  interface EmployeeInterface {

    public void create(String name,String surname,String gen,int id);
    public void show(int n);
    public void delete(int id);
    public void update(String name,String surname,String gen,int id);

}
