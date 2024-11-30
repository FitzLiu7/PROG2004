public class AssignmentTwo {
    public static void main(String[] args) {
        // partThree();
        // partFourA();
        // partFourB();
    }

    public static void partThree() {
        Employee employee1 = new Employee("James", 32, "male", "Security Officer", "5 years");
        Ride storm = new Ride("Storm", "Large", true, employee1);
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
        Employee employee2 = new Employee("Fizz", 29, "male", "Security Officer", "3 years");
        Ride pirateShip = new Ride("PirateShip", "Medium", true, employee2);
        Visitor visitor6 = new Visitor("Robert", 32, "male", "SVIP", "s8");
        Visitor visitor7 = new Visitor("Emma", 26, "female", "VIP", "v45");
        Visitor visitor8 = new Visitor("Sophia", 30, "female", "Normal", "v21");
        Visitor visitor9 = new Visitor("William", 33, "male", "VIP", "v9");
        Visitor visitor10 = new Visitor("Olivia", 24, "female", "SVIP", "s12");
        pirateShip.addVisitorToHistory(visitor6);
        pirateShip.addVisitorToHistory(visitor7);
        pirateShip.addVisitorToHistory(visitor8);
        pirateShip.addVisitorToHistory(visitor9);
        pirateShip.addVisitorToHistory(visitor10);
        System.out.println("------------------------------");
        System.out.println("Is Sophia in rideHistory? " + pirateShip.checkVisitorFromHistory(visitor8));
        System.out.println("------------------------------");
        System.out.println("Number of visitor in rideHistory: " + pirateShip.numberOfVisitors());
        System.out.println("------------------------------");
        pirateShip.printRideHistory();
        System.out.println("------------------------------");
    }

    public static void partFourB() {
        Employee employee3 = new Employee("Voli", 37, "male", "Security Officer", "8 years");
        Ride bumperCars = new Ride("BumperCars", "Small", true, employee3);
        Visitor visitor11 = new Visitor("Michael", 29, "male", "Normal", "n6");
        Visitor visitor12 = new Visitor("Daniel", 22, "male", "VIP", "v17");
        Visitor visitor13 = new Visitor("Isabella", 28, "female", "SVIP", "s28");
        Visitor visitor14 = new Visitor("Abucas", 27, "male", "Normal", "n31");
        Visitor visitor15 = new Visitor("Liam", 27, "male", "VIP", "v50");
        bumperCars.addVisitorToHistory(visitor11);
        bumperCars.addVisitorToHistory(visitor12);
        bumperCars.addVisitorToHistory(visitor13);
        bumperCars.addVisitorToHistory(visitor14);
        bumperCars.addVisitorToHistory(visitor15);
        System.out.println("------------------------------");
        bumperCars.printRideHistory();
        System.out.println("------------------------------");
        bumperCars.SortRideHistory();
        System.out.println("------------------------------");
        bumperCars.printRideHistory();
    }

    public void partFive() {
    }

    public void partSix() {
    }

    public void partSeven() {
    }
}
