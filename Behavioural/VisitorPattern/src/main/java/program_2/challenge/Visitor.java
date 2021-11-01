package program_2.challenge;

public interface Visitor {
    void visit(SalesPerson salesPerson);
    void visit(Manager manager);
    void visit(StaffList staffList);
}
