public class HealthProfessional {
    // Store details
    private int id; //私有属性
    private String name;
    private String doctorInformation;

    // Initializing fields
    public HealthProfessional() {
        this.id = 0;
        this.name = "";
        this.doctorInformation = "";
    }

    // Initialize fields with specified values
    public HealthProfessional(int id, String name, String doctorInformation) {
        this.id = id;
        this.name = name;
        this.doctorInformation = doctorInformation;
    }

    // Print details
    public void printDetails() {
        System.out.println("id: " +id);
        System.out.println("name: " +name);
        System.out.println("doctorInformation: " +doctorInformation);
        System.out.println("------------------------------"); 
    }

    // Getter and Setter for name, id and doctorInformation
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDoctorInformation() {
        return doctorInformation;
    }
    public void setDoctorInformation(String doctorInformation) {
        this.doctorInformation = doctorInformation;
    }
}

