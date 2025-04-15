public class Teacher extends Person{
private  String subject;
  public Teacher(String name, int id, String subject) {
    super(name, id);
      this.subject = subject;
  }
  public String getsubject() {
      return subject;
  }
  public void displayInfo() {
      System.out.println("subject: " + subject);
  }
}