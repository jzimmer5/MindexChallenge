public class Compensation {
    private Employee employee;
    private int salary;
    private Date effectiveDate;

    public Compensation(){

    }

    public void setCompensation(Employee newEmployee,int sal, Date effective){
        this.employee = newEmployee;
        this.salary = sal;
        this.effectiveDate = effective;

    }
}
