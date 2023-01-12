
package lab10.l10q1;

public abstract class EmployeeSalary {

    protected final String NAME;

    public EmployeeSalary(String name) {
        this.NAME = name;
    }
    public abstract void displayDetails();
}