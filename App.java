
import java.util.Arrays;

class App {
  public static void main(String args[]) {

    int[] grades = { 72, 95, 91, 85, 87, 51, 65, 72, 75, 89 };
    int highest = Arrays.stream(grades).max().getAsInt();
    int lowest = Arrays.stream(grades).min().getAsInt();
    System.out.println("Highest Grade: " + highest);
    System.out.println("Lowest Grade: " + lowest);

    for (int i = 0; i < grades.length; i++) {
      Arrays.sort(grades);
    }

    double median = 0;
    double pos1 = Math.floor((grades.length - 1.0) / 2.0);
    double pos2 = Math.ceil((grades.length - 1.0) / 2.0);
    if (pos1 == pos2) {
      median = grades[(int) pos1];
    } else {
      median = (grades[(int) pos1] + grades[(int) pos2]) / 2.0;
    }
    System.out.println("Median of grades is: " + median);

    int numberInArray = 0;
    for (int i = 0; i < grades.length; i++) {
      numberInArray++;
    }
    int sumArray = 0;
    for (int value : grades) {
      sumArray += value;
    }
    System.out.println("Mean of grades is: " + sumArray / numberInArray);
  }

}
