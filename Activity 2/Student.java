public class Student extends Person{
  private String gradeLevel;
  public Student(String name, int id, String gradeLevel) {
    super(name, id);
      this.gradeLevel = gradeLevel;
  }
  public String getgrade() {
      return gradeLevel;
  }
  public void displayInfo() {
      System.out.println("grade: " + gradeLevel);
  }
}
    
