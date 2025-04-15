
public class Staff extends Person {
    private  String department;
    public Staff(String name, int id, String department) {
        super(name, id);
}
public String getDepartment() {
    return department;
}
public void displayInfo() {
    System.out.println("Department: " + department);
}
}
