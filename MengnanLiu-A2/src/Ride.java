import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {
  private String rideName;
  private int maxCapacity;
  private boolean isOpen;
  private Employee rideOperator;
  private Queue<Visitor> rideQueue;

  // 缺省构造函数
  public Ride() {
    this.rideName = "";
    this.maxCapacity = 0;
    this.isOpen = false;
    this.rideOperator = null;
    this.rideQueue = new LinkedList<>();
  }

  // 带有参数的构造函数
  public Ride(String rideName, int maxCapacity, boolean isOpen, Employee rideOperator) {
    this.rideName = rideName;
    this.maxCapacity = maxCapacity;
    this.isOpen = isOpen;
    this.rideOperator = rideOperator;
    this.rideQueue = new LinkedList<>();
  }

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

  public void setOpen(boolean isOpen) {
    this.isOpen = isOpen;
  }

  public Employee getRideOperator() {
    return rideOperator;
  }

  public void setRideOperator(Employee rideOperator) {
    this.rideOperator = rideOperator;
  }

  @Override
  public void addVisitorToQueue(Visitor visitor) {
    // TODO Auto-generated method stub
    if (visitor != null) {
      rideQueue.offer(visitor);
      System.out.println(visitor.getName() + " added to the queue");
    } else {
      System.out.println("visitor is null");
    }
  }

  @Override
  public void removeVisitorFromQueue(Visitor visitor) {
    // TODO Auto-generated method stub
    if (rideQueue.contains(visitor)) {
      rideQueue.remove(visitor);
      System.out.println(visitor.getName() + " already removed");
    } else {
      System.out.println("vistor is not in the queue");
    }
  }

  @Override
  public void printQueue() {
    // TODO Auto-generated method stub
    for (Visitor visitor : rideQueue) {
      System.out.println(visitor.getName());
    }
  }

}