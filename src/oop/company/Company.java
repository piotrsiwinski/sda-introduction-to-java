package oop.company;


public class Company {

    private String name;
    private Employee[] employees;
    private int numberOfEmployees;

    public Company() {
        employees = new Employee[10];
        numberOfEmployees = 0;
    }


    //napisac metode ktora wyswietli wszystkich pracownikow
    public void printEmployees() {
        for (Employee emp : employees) {
            emp.describeEmployee();
        }
    }

    //Metoda do dodawania pracownika do tablica pracownikow
    public void addEmployee(Employee nextEmployee) {


        employees[numberOfEmployees] = nextEmployee;
        numberOfEmployees++;

    }
}
