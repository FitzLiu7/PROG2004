public class Ride {
  private String rideName;
  private int maxCapacity;
  private boolean isOpen;

  // 缺省构造函数
  public Ride() {
    this.rideName = "";
    this.maxCapacity = 0;
    this.isOpen = false;
  }

  // 带有参数的构造函数
  public Ride(String rideName, int maxCapacity, boolean isOpen) {
    this.rideName = rideName;
    this.maxCapacity = maxCapacity;
    this.isOpen = isOpen;
  }

  // getter and setter rideName , maxCapacity and isOpen
  public String getRideName() {
    return rideName;
  }

  public void setRideName(String rideName) {
    this.rideName = rideName;
  }

  public int getMaxCapacity() {
    return maxCapacity;
  }

  public void setMaxCapacity(int maxCapacity) {
    this.maxCapacity = maxCapacity;
  }

  public boolean isOpen() {
    return isOpen;
  }
}
