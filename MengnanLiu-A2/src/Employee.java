public class Employee extends Person {
  private String employeeName;
  private String workingExperience;

  // 缺省构造函数
  public Employee() {
    super();
    this.employeeName = "";
    this.workingExperience = "";
  }

  // 带有参数的构造函数
  public Employee(String name, int age, String gender, String employeeName, String workingExperience) {
    super(name, age, gender);
    this.employeeName = employeeName;
    this.workingExperience = workingExperience;
  }

  // Getters and Setters for role and workingExperience
  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public String getWorkingExperience() {
    return workingExperience;
  }

  public void setWorkingExperience(String workingExperience) {
    this.workingExperience = workingExperience;
  }
}
