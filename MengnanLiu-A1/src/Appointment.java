// Class representing an appointment
public class Appointment {
    private String name;
    private String phoneNumber;
    private String timeSlot;
    private HealthProfessional doctor;

    // Initializing fields
    public Appointment() {
        this.name = "";
        this.phoneNumber = "";
        this.timeSlot = "";
        this.doctor = null; 
    }

    // Initialize fields with specified values
    public Appointment(String name, String phoneNumber, String timeSlot, HealthProfessional doctor){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // display appointment details
    public void displayAppointmentDetails(){
        System.out.println("patient name: " +name);
        System.out.println("patient phoneNumber: " +phoneNumber);
        System.out.println("patient timeSlot: " +timeSlot);
        System.out.println("doctor: " + doctor.getName());
        System.out.println("------------------------------");
    }

    // Getter and Setter for phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
