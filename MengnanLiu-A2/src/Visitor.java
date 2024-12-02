public class Visitor extends Person {
  private String membershipType;
  private String ticketNumber;

  public Visitor() {
    super();
    this.membershipType = "";
    this.ticketNumber = "";
  }

  public Visitor(String name, int age, String gender, String membershipType, String ticketNumber) {
    super(name, age, gender);
    this.membershipType = membershipType;
    this.ticketNumber = ticketNumber;
  }

  // Getters and Setters for membershipType and ticketNumber

  public String getMembershipType() {
    return membershipType;
  }

  public void setMembershipType(String membershipType) {
    this.membershipType = membershipType;
  }

  public String getTicketNumber() {
    return ticketNumber;
  }

  public void setTicketNumber(String ticketNumber) {
    this.ticketNumber = ticketNumber;
  }

  @Override
  public String toString() {
    return getName() + ", " + getAge() + ", " + getGender() + ", " + getMembershipType() + ", " + getTicketNumber();
  }
}
