public class Employee {
    private int ID;
    private String name;
    private int salary;


    Employee(int ID, String name, int salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void getAnnualSalary() {
        int annualSalary = 0;
         annualSalary += salary * 12;
        System.out.println(annualSalary);
    }
    public int raisedSalary(int percent) {
       return salary += salary * percent / 100;

    }




}
