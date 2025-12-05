
import java.util.Scanner;

public class Date {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your date of birth (dd mm yyyy): ");
        int dob = sc.nextInt();
        int mob = sc.nextInt();
        int yob = sc.nextInt();

        System.out.println("Enter current date(dd mm yyyy) : ");
        int doc = sc.nextInt();
        int moc = sc.nextInt();
        int yoc = sc.nextInt();

        int totaldays = 0;

        totaldays += ((yoc - 1) - (yob - 1)) * 365;

        int days_in_Month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        for (int i = ((mob == 12) ? 1 : mob + 1); i < 12; i++) {
            totaldays += days_in_Month[i];
        }

        totaldays += doc + (days_in_Month[mob - 1] - dob);

        for (int i = (mob <= 2) ? yob : yob + 1; i < yoc; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                totaldays++;
            }
        }

        System.out.println(" days you alive : " + totaldays);

    }

}
