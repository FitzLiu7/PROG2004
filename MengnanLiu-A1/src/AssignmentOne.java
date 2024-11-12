import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        HealthProfessional gp1 = new GeneralPractitioner(1,"Tom","With 10 years of professional experience","QLD");
        HealthProfessional gp2 = new GeneralPractitioner(2,"Peter","With 13 years of professional experience","QLD");
        HealthProfessional gp3 = new GeneralPractitioner(3,"Bob","With 12 years of professional experience","NSW");
        HealthProfessional s1 = new Specialist(4,"Jack","With 20 years of professional experience","Pediatrics");
        HealthProfessional s2 = new Specialist(5,"Jim","With 15 years of professional experience","Dentistry");    
        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        s1.printDetails();
        s2.printDetails();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        ArrayList<Appointment> appointmentList = new ArrayList<>();

        // Create appointments
        createAppointment(appointmentList, "Kris", "0430000001", "8:00", gp1);
        createAppointment(appointmentList, "James", "0430000002", "10:00", gp2);
        createAppointment(appointmentList, "John", "0430000003", "12:00", s1);
        createAppointment(appointmentList, "Michael", "0430000004", "14:00", s2);
        printExistingAppointments(appointmentList);
        cancelBooking(appointmentList, "0430000001");
    }
    public static void createAppointment(ArrayList<Appointment> appointmentList, String name, String phoneNumber, String timeSlot, HealthProfessional doctor){
        if (name.isEmpty() ||phoneNumber.isEmpty() || timeSlot.isEmpty() || !(doctor instanceof HealthProfessional)) {
            System.out.println("Error: Missing required information");
            System.out.println("------------------------------");
            return;
        }
        Appointment newAppointment = new Appointment(name, phoneNumber, timeSlot, doctor);
        appointmentList.add(newAppointment);
        System.out.println("Creat appoment successful");
        System.out.println("------------------------------");
    }
    public static void printExistingAppointments(ArrayList<Appointment> appointmentList){
        if(appointmentList.isEmpty()){
            System.out.println("No existing");
            System.out.println("------------------------------");
        }else{
            for(Appointment appointment: appointmentList){
                appointment.displayAppointmentDetails();
            }
        }
    }
    public static void cancelBooking(ArrayList<Appointment> appointmentList,String phoneNumber){
        boolean appointmentFound = false;
        for(Appointment appointment: appointmentList){
            if(appointment.getPhoneNumber().equals(phoneNumber)){
                appointmentList.remove(appointment);
                System.out.println("PhoneNumber for appointment "+ phoneNumber +" has been cancelled");
                System.out.println("------------------------------");
                appointmentFound = true;
                break;
            }
        }
        if (!appointmentFound) {
            System.out.println("Error: Phone number not found");
            System.out.println("------------------------------");
        }
        printExistingAppointments(appointmentList);
    }
}


