package program_2.challenge;

public class Client {

  public static void main(String[] args) {
    StaffList staffList = new StaffList();
    System.out.println("Total amount paid to staff: " + staffList.getSalary());
    staffList.accept(new SalaryVisitor());
    System.out.println("New total amount paid to staff: " + staffList.getSalary());
  }
}