import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
  private int maxRider;
  private int numberOfCycles;

  public Ride() {
    this.rideName = "";
    this.attractionsSize = "";
    this.isOpen = false;
    this.rideOperator = null;
    this.rideQueue = new LinkedList<>();
    this.rideHistory = new ArrayList<>();
    this.maxRider = 1;
    this.numberOfCycles = 0;
  }

  public Ride(String rideName, String attractionsSize, boolean isOpen, Employee rideOperator, int maxRider,
      int numberOfCycles) {
    this.rideName = rideName;
    this.attractionsSize = attractionsSize;
    this.isOpen = isOpen;
    this.rideOperator = rideOperator;
    this.rideQueue = new LinkedList<>();
    this.rideHistory = new ArrayList<>();
    this.maxRider = maxRider;
    this.numberOfCycles = numberOfCycles;
  }

  // getter and setter rideName, attractionsSize, isOpen and rideOperator
  // ,maxRider and numberOfCycles

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
    this.attractionsSize = attractionsSize;
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

  public int getMaxRider() {
    return maxRider;
  }

  public void setMaxRider(int maxRider) {
    this.maxRider = maxRider;
  }

  public int getNumberOfCycles() {
    return numberOfCycles;
  }

  public void setNumberOfCycles(int numberOfCycles) {
    this.numberOfCycles = numberOfCycles;
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

  @Override
  public boolean checkVisitorFromHistory(Visitor visitor) {
    // TODO Auto-generated method stub
    return rideHistory.contains(visitor);
  }

  @Override
  public int numberOfVisitors() {
    // TODO Auto-generated method stub
    return rideHistory.size();
  }

  @Override
  public void printRideHistory() {
    // TODO Auto-generated method stub
    if (rideHistory.isEmpty()) {
      System.out.println("rideHistory is empty");
    } else {
      System.out.println("rideHistroy: ");
      for (Visitor visitor : rideHistory) {
        System.out.println(visitor.getName() + ", age: " + visitor.getAge() + ", gender: " + visitor.getGender()
            + ", membershipType: " + visitor.getMembershipType() + ", ticketNumber: " + visitor.getTicketNumber());
      }
    }
  }

  public void SortRideHistory() {
    Collections.sort(rideHistory, new VisitorComparator());
    System.out.println("RideHistory has been sorted by age");
  }

  @Override
  public void runOneCycle() {
    // TODO Auto-generated method stub
    if (rideOperator == null) {
      System.out.println("Operation prohibited, no operator available.");
      return;
    }
    if (rideQueue.isEmpty()) {
      System.out.println("Operation prohibited, no visitor in the queue.");
      return;
    }
    System.out.println("running ride cycle for " + rideName);
    int ridersThisCycle = 0;
    while (ridersThisCycle < maxRider && !rideQueue.isEmpty()) {
      // remove from the queue
      Visitor visitor = rideQueue.poll();
      rideHistory.add(visitor);
      ridersThisCycle++;
      System.out.println(visitor.getName() + " has taken the ride.");
    }
    numberOfCycles++;
    System.out.println("ride cycle completed. Total cycles: " + numberOfCycles);
  }

  public void exportRideHistory() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("rideHistory"))) {
      if (rideHistory.isEmpty()) {
        System.out.println("rideHistory is empty");
        return;
      }
      for (Visitor visitor : rideHistory) {
        writer.write(visitor.toString());
        writer.newLine();
      }
      System.out.println("Import successful");
    } catch (IOException e) {
      // TODO: handle exception
      System.out.println(e.getMessage());
    }
  }

  public void importRideHistory() {
    try (BufferedReader reader = new BufferedReader(new FileReader("rideHistory"))) {
      String line;
      while ((line = reader.readLine()) != null) {
        String[] parts = line.split(", ");
        if (parts.length == 5) {
          String name = parts[0];
          int age = Integer.parseInt(parts[1]);
          String gender = parts[2];
          String type = parts[3];
          String id = parts[4];
          rideHistory.add(new Visitor(name, age, gender, type, id));
        } else {
          System.out.println(line);
        }
      }
      System.out.println("Import successful. Ride history details:");
      for (Visitor visitor : rideHistory) {
        System.out.println(visitor);
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}