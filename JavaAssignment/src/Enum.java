import java.util.Scanner;

public class Enum {
    enum Day{
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
        public static Day getDay(int dayIndex){
                return Day.values()[dayIndex];
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Any Index from (1-7)");
        Scanner scanner=new Scanner(System.in);
        int dayIndex=scanner.nextInt();
        dayIndex-=1;
        if(dayIndex>0 && dayIndex<8) {
            Day day = Day.getDay(dayIndex);
            System.out.println(day);
        }
        else{
            System.out.println("Enter Valid Date Index");
        }
    }

}
