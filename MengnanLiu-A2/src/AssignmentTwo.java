public class AssignmentTwo {
    public static void main(String[] args) {
        // partThree();
        // partFourA();
        partFourB();
    }

    public static void partThree() {
        Employee employee1 = new Employee("James", 32, "male", "Security Officer", "5 years");
        Ride storm = new Ride("Storm", 3, true, employee1);
        Visitor visitor1 = new Visitor("John", 25, "male", "VIP", "v12");
        Visitor visitor2 = new Visitor("David", 28, "male", "Normal", "n23");
        Visitor visitor3 = new Visitor("Michael", 31, "male", "SVIP", "s46");
        Visitor visitor4 = new Visitor("Mary", 29, "female", "VIP", "v6");
        Visitor visitor5 = new Visitor("Linda", 23, "female", "Normal", "v22");
        storm.addVisitorToQueue(visitor1);
        storm.addVisitorToQueue(visitor2);
        storm.addVisitorToQueue(visitor3);
        storm.addVisitorToQueue(visitor4);
        storm.addVisitorToQueue(visitor5);
        System.out.println("------------------------------");
        storm.removeVisitorFromQueue(visitor5);
        System.out.println("------------------------------");
        storm.printQueue();
        System.out.println("------------------------------");
    }

    public static void partFourA() {
        Employee employee1 = new Employee("James", 32, "male", "Security Officer", "5 years");
        Ride storm = new Ride("Storm", 3, true, employee1);
        Visitor visitor1 = new Visitor("John", 25, "male", "VIP", "v12");
        Visitor visitor2 = new Visitor("David", 28, "male", "Normal", "n23");
        Visitor visitor3 = new Visitor("Michael", 31, "male", "SVIP", "s46");
        Visitor visitor4 = new Visitor("Mary", 29, "female", "VIP", "v6");
        Visitor visitor5 = new Visitor("Linda", 23, "female", "Normal", "v22");
        storm.addVisitorToHistory(visitor1);
        storm.addVisitorToHistory(visitor2);
        storm.addVisitorToHistory(visitor3);
        storm.addVisitorToHistory(visitor4);
        storm.addVisitorToHistory(visitor5);
        boolean isVisitorInHistory = storm.checkVisitorFromHistory(visitor1);
        System.out.println("Is john in rideHistory? " + isVisitorInHistory);
        System.out.println("Number of visitor in rideHistory: " + storm.numberOfVisitors());
        storm.printRideHistory();
    }

    public static void partFourB() {
        Employee employee1 = new Employee("James", 32, "male", "Security Officer", "5 years");
        Ride storm = new Ride("Storm", 3, true, employee1);
        Visitor visitor1 = new Visitor("John", 25, "male", "VIP", "v12");
        Visitor visitor2 = new Visitor("David", 28, "male", "Normal", "n23");
        Visitor visitor3 = new Visitor("Michael", 31, "male", "SVIP", "s46");
        Visitor visitor4 = new Visitor("Mary", 29, "female", "VIP", "v6");
        Visitor visitor5 = new Visitor("Linda", 23, "female", "Normal", "v22");
        storm.addVisitorToHistory(visitor1);
        storm.addVisitorToHistory(visitor2);
        storm.addVisitorToHistory(visitor3);
        storm.addVisitorToHistory(visitor4);
        storm.addVisitorToHistory(visitor5);
        System.out.println("rideHistory berfore sort");
        storm.printRideHistory();
        storm.SortRideHistory();
        System.out.println("rideHistory after sort");
        storm.printRideHistory();
    }

    public void partFive() {
    }

    public void partSix() {
    }

    public void partSeven() {
    }
}
