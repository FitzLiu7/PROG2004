import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ride implements RideInterface {
  private String rideName;
  private String attractionsSize;
  private boolean isOpen;
  private Employee rideOperator;
  private Queue<Visitor> rideQueue;
  private List<Visitor> rideHistory;

  // 缺省构造函数
  public Ride() {
    this.rideName = "";
    this.attractionsSize = "";
    this.isOpen = false;
    this.rideOperator = null;
    this.rideQueue = new LinkedList<>();
    this.rideHistory = new ArrayList<>();
  }

  // 带有参数的构造函数
  public Ride(String rideName, String AttractionsSize, boolean isOpen, Employee rideOperator) {
    this.rideName = rideName;
    this.attractionsSize = attractionsSize;
    this.isOpen = isOpen;
    this.rideOperator = rideOperator;
    this.rideQueue = new LinkedList<>();
    this.rideHistory = new ArrayList<>();
  }


  //getter and setter rideName, attractionsSize, isOpen and rideOperator
  public String getRideName() {
    return rideName;
  }

  public void setRideName(String rideName) {
    this.rideName = rideName;
  }

  public String getAttractionsSize() {
    return attractionsSize;
  }

  public void setAttractionsSize(String attractionsSize) {
    attractionsSize = attractionsSize;
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
  // 将游客添加到队列
  public void addVisitorToQueue(Visitor visitor) {
    // TODO Auto-generated method stub
    if (visitor != null) {
      rideQueue.offer(visitor);
      System.out.println(visitor.getName() + " added to the queue");
    } else {
      System.out.println("visitor is null");
    }
  }

  // 在队列中移除游客
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

  // 打印队列
  @Override
  public void printQueue() {
    // TODO Auto-generated method stub
    for (Visitor visitor : rideQueue) {
      System.out.println(visitor.getName());
    }
  }

  // 将游客添加到历史记录中
  @Override
  public void addVisitorToHistory(Visitor visitor) {
    // TODO Auto-generated method stub
    if (!rideHistory.contains(visitor)) {
      rideHistory.add(visitor);
      System.out.println(visitor.getName() + " added to the rideHistory");
    } else {
      System.out.println(visitor.getName() + " already in rideHistory");
    }
  }

  // 检查历史纪录中的游客
  @Override
  public boolean checkVisitorFromHistory(Visitor visitor) {
    // TODO Auto-generated method stub
    return rideHistory.contains(visitor);
  }

  // 检查历史纪录中游客的数量
  @Override
  public int numberOfVisitors() {
    // TODO Auto-generated method stub
    return rideHistory.size();
  }

  // 打印使用过设施的游客的详细信息
  @Override
  public void printRideHistory() {
    // TODO Auto-generated method stub
    if (rideHistory.isEmpty()) {
      System.out.println("rideHistory is empty");
    } else {
      System.out.println("rideHistroy: ");
      for (Visitor visitor : rideHistory) {
      System.out.println(visitor.getName() + ", age: " + visitor.getAge() + ", gender: " + visitor.getGender() + ", membershipType: " + visitor.getMembershipType() + ", ticketNumber: " + visitor.getTicketNumber());
      }
    }
  }

  // 将游客按年龄大小进行排序
  public void SortRideHistory() {
    Collections.sort(rideHistory, new VisitorComparator());
    System.out.println("RideHistory has been sorted by age");
  }
}