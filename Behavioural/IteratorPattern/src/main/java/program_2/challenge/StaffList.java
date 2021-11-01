package program_2.challenge;

public class StaffList implements Iterable {

    private Employee[] employees;

    public StaffList(Employee... employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return this.employees;
    }

    public StaffListIterator iterator() {
        return new StaffListIterator(this);
    }
}