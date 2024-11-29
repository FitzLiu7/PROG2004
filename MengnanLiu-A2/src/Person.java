public abstract class Person {
  // Store details
  private String name;
  private int age;
  private String gender;

  // 缺省构造函数
  public Person() {
    this.name = "";
    this.age = 0;
    this.gender = "";
  }

  // 带有参数的构造函数
  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  // getter and setter name,age and gender
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
}
