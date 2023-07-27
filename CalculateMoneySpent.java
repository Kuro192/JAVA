import java.util.Scanner;

public class CalculateMoneySpent {
    public static void main(String[] args) {
        String Name;
        int moneySpent;
        Double average;
        int total;
        int totalDay = 7;

        Scanner input = new Scanner(System.in);

        System.out.println("What is your Name ?");
        Name = input.nextLine();

        System.out.println("How much do you spend money on vituber at Monday?");
        moneySpent = input.nextInt();
        total = moneySpent;

        System.out.println("How much do you spend money on vituber at Tuesday?");
        moneySpent = input.nextInt();
        total = total + moneySpent;

        System.out.println("How much do you spend money on vituber at Wednesday?");
        moneySpent = input.nextInt();
        total = total + moneySpent;

        System.out.println("How much do you spend money on vituber at Thursday?");
        moneySpent = input.nextInt();
        total = total + moneySpent;

        System.out.println("How much do you spend money on vituber at Friday?");
        moneySpent = input.nextInt();
        total = total + moneySpent;

        System.out.println("How much do you spend money on vituber at Saturday?");
        moneySpent = input.nextInt();
        total = total + moneySpent;

        System.out.println("How much do you spend money on vituber at Sunday?");
        moneySpent = input.nextInt();
        ;
        total = total + moneySpent;
        average = (double) total / totalDay;

        System.out.println("The Calculation Result:");

        System.out.println("Hi " + Name);

        System.out.println("Your total expenditure at the club this week is $ " + total);

        System.out.println("With an Average daily expenditure of $ " + average);

    }
}
