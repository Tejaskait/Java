import java.util.ArrayList;

public class Main { 
  public static void main(String[] args) { 
    ArrayList<int> myNumbers = new ArrayList<int>();
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
    for (int i : myNumbers) {
      System.out.println(i);
    }
  } 
}
