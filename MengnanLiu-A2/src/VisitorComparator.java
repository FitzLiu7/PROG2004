import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {

  @Override
  public int compare(Visitor v1, Visitor v2) {
    // TODO Auto-generated method stub
    int ageComparator = Integer.compare(v1.getAge(), v2.getAge());
    if (ageComparator != 0) {
      return ageComparator;
    }
    return v1.getName().compareTo(v2.getName());
  }
}
