public class AssignmentTwo {
    public static void main(String[] args) {
        // partThree();
        // partFourA();
        // partFourB();
        // partFive();
        // partSix();
        // partSeven();
    }

    public static void partThree() {
        Employee employee1 = new Employee("James", 32, "male", "Security Officer", "5 years");
        Ride storm = new Ride("Storm", "Large", true, employee1, 1, 1);
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
        Ride pirateShip = new Ride("PirateShip", "Medium", true, employee2, 1, 0);
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
        Ride bumperCars = new Ride("BumperCars", "Small", true, employee3, 1, 0);
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

    public static void partFive() {
        Employee employee4 = new Employee("Lance", 30, "male", "Security Officer", "4 years");
        Ride carousel = new Ride("Carousel", "Small", true, employee4, 6, 0);
        Visitor visitor16 = new Visitor("Ava", 26, "female", "VIP", "v30");
        Visitor visitor17 = new Visitor("Henry", 31, "male", "Normal", "n11");
        Visitor visitor18 = new Visitor("Charlotte", 23, "female", "SVIP", "s37");
        Visitor visitor19 = new Visitor("Jackson", 32, "male", "VIP", "v3");
        Visitor visitor20 = new Visitor("Amelia", 27, "female", "Normal", "v19");
        Visitor visitor21 = new Visitor("Sebastian", 30, "male", "VIP", "v29");
        Visitor visitor22 = new Visitor("Lily", 24, "female", "SVIP", "s5");
        Visitor visitor23 = new Visitor("Benjamin", 26, "male", "Normal", "n8");
        Visitor visitor24 = new Visitor("Harper", 29, "female", "VIP", "v10");
        Visitor visitor25 = new Visitor("Jacob", 32, "male", "SVIP", "s40");
        carousel.addVisitorToQueue(visitor16);
        carousel.addVisitorToQueue(visitor17);
        carousel.addVisitorToQueue(visitor18);
        carousel.addVisitorToQueue(visitor19);
        carousel.addVisitorToQueue(visitor20);
        carousel.addVisitorToQueue(visitor21);
        carousel.addVisitorToQueue(visitor22);
        carousel.addVisitorToQueue(visitor23);
        carousel.addVisitorToQueue(visitor24);
        carousel.addVisitorToQueue(visitor25);

        System.out.println("------------------------------");
        carousel.printQueue();
        System.out.println("------------------------------");
        carousel.runOneCycle();
        System.out.println("------------------------------");
        carousel.printQueue();
        System.out.println("------------------------------");
        carousel.printRideHistory();
    }

    public static void partSix() {
        Employee employee5 = new Employee("Leon", 34, "male", "Security Officer", "7 years");
        Ride ferrisWheel = new Ride("FerrisWheel", "Large", true, employee5, 6, 0);
        Visitor visitor26 = new Visitor("Zoe", 31, "female", "Normal", "v38");
        Visitor visitor27 = new Visitor("Jack", 25, "male", "VIP", "v13");
        Visitor visitor28 = new Visitor("Ella", 24, "female", "SVIP", "s11");
        Visitor visitor29 = new Visitor("Matthew", 29, "male", "Normal", "n25");
        Visitor visitor30 = new Visitor("Aiden", 27, "male", "VIP", "v41");
        ferrisWheel.addVisitorToQueue(visitor26);
        ferrisWheel.addVisitorToQueue(visitor27);
        ferrisWheel.addVisitorToQueue(visitor28);
        ferrisWheel.addVisitorToQueue(visitor29);
        ferrisWheel.addVisitorToQueue(visitor30);
        System.out.println("------------------------------");
        ferrisWheel.runOneCycle();
        System.out.println("------------------------------");
        ferrisWheel.exportRideHistory();
        System.out.println("------------------------------");
    }

    public static void partSeven() {
        Employee employee6 = new Employee("Chenny", 33, "male", "Security Officer", "4years");
        Ride goKart = new Ride("GoKart", "Large", true, employee6, 6, 0);
        goKart.importRideHistory();
    }
}
