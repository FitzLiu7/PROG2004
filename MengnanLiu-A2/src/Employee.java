public class Employee extends Person {
  private String position;
  private String workingExperience;

  // 缺省构造函数
  public Employee() {
    super();
    this.position = "";
    this.workingExperience = "";
  }

  // 带有参数的构造函数
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
