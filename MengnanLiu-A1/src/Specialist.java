// Child class representing Specialist
public class Specialist extends HealthProfessional {
    private String specialtyField;

    // Initializing fields
    public Specialist() {
        super();
        this.specialtyField = "";
    }

    // Initialize all fields, including those in base class
    public Specialist(int id, String name, String doctorInformation, String specialtyField){
        super(id, name, doctorInformation);
        this.specialtyField = specialtyField;
    }

    @Override
    // print details specific
    public void printDetails() {
        // TODO Auto-generated method stub
        super.printDetails();
        System.out.println("specialtyField:"+specialtyField);
    }
    public String getSpecialtyField() {
        return specialtyField;
    }
    public void setSpecialtyField(String specialtyField) {
        this.specialtyField = specialtyField;
    }
}