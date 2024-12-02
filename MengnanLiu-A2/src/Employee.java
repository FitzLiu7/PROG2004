public class Employee extends Person {
  private String position;
  private String workingExperience;

  public Employee() {
    super();
    this.position = "";
    this.workingExperience = "";
  }

  public Employee(String name, int age, String gender, String position, String workingExperience) {
    super(name, age, gender);
    this.position = position;
    this.workingExperience = workingExperience;
  }

  // Getters and Setters for position and workingExperience
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getWorkingExperience() {
    return workingExperience;
  }

  public void setWorkingExperience(String workingExperience) {
    this.workingExperience = workingExperience;
  }

}
