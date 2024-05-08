package HomeWork6;



public class Employee {


    // All employees have this fields
    private String name;

    public String getName() {
        return name;
    }

    private String dateOfBirth;

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getHireDate() {
        return hireDate;
    }

    private String hireDate;

    public Employee(String hireDate) {
        this.hireDate = hireDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public void setSalaryPerHour(Double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    private Double salaryPerHour;

    public Double getSalaryPerHour() {
        return salaryPerHour;
    }



                    //Constructor of new Object - instance of class Employee
    public Employee(String employeeName, String employeeHireDate, Double employeeSalaryPerHour) {
        name = employeeName;
        hireDate = employeeHireDate;
        salaryPerHour = employeeSalaryPerHour;
                    }

                    public void calculateSalaryPerMonth () {
                        double salaryPerMonth = salaryPerHour * 8 * 20;
                        System.out.println("The month salary of an employee " + name + " with a hire date " + hireDate + " is " + salaryPerMonth);

                    }

    }