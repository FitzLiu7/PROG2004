// Child class representing GeneralPractitioner
public class GeneralPractitioner extends HealthProfessional{
    private String location;

    // Initializing fields
    public GeneralPractitioner() {
        super();
        this.location = "";
    }

    // Initialize all fields, including those in base class
    public GeneralPractitioner(int id, String name, String doctorInformation, String location){
        super(id, name, doctorInformation);
        this.location = location;
    }

    @Override
    // print details specific
    public void printDetails() {
        // TODO Auto-generated method stub
        super.printDetails();
        System.out.println("location: "+location);
        System.out.println("------------------------------"); 
    }
    
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

}


