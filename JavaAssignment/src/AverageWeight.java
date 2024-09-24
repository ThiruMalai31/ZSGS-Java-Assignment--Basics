import java.util.Scanner;

public class AverageWeight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double weightPerPerson,totalWeight=0;
        for (int person = 1; person <= 10; person++) {
            System.out.println("Enter Weight for Person "+person);
            weightPerPerson=scanner.nextDouble();
            totalWeight+=weightPerPerson;
        }
        System.out.println("Average Weight for 10 Person " + totalWeight/10);
    }
}
