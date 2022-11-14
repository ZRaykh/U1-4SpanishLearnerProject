import java.util.Scanner;
public class LearnerClient {
    //program outputs
    public static void main(String[] args) {

        //greeting program and setting up username
        System.out.println("Hello user! Welcome to Spanish Learner, a program that is aimed to help you study spanish" +
                " at a basic skill level! Please enter a username:");
        Scanner s = new Scanner(System.in);
        String user = s.nextLine();

       //checking if the user wants english to spanish practice or spanish to english. Only checks for B because that is the only setting that sets Spanish to English.
        System.out.println("Well then " + user + " do you want to practice converting \"A\" English words to Spanish or \"B\" Spanish words to English?");
        String input = s.nextLine().toUpperCase();
        boolean practice = true;
        if (input.equals("B"))
        {
            practice = false;
        }
        else if (!(input.equals("A")))
            System.out.println("User input incorrect, resorting to default settings.");

        //creates the object "sp" which stands for Spanish Practice.
        SpanishLearner sp = new SpanishLearner(user, practice);
        System.out.println("All set up! Ready to go!");

        input = "";
        //spanish practice starts here
        while (!input.equals("END"))
        {
            System.out.println("Current practice modes include: \"A\" days of the week, \"B\" seasons, \"C\" months \"D\" numbers. " +
                    "Or enter \"end\" to exit, or \"edit\" to change your practice mode.\nPlease select your choice:");
            input = s.nextLine().toUpperCase();

            //days of the week practice
            if (input.equals("A"))
            {
                System.out.println("Days of the week selected. Please use \" ' \" after a letter to indicate accent marks. Example: í would be i'");
                if (sp.isEnglishToSpanish())
                {
                    System.out.println("What is Monday in spanish");
                    String monday = s.nextLine().toLowerCase();
                    System.out.println("What is Tuesday in spanish");
                    String tuesday = s.nextLine().toLowerCase();
                    System.out.println("What is Wednesday in spanish");
                    String wednesday = s.nextLine().toLowerCase();
                    System.out.println("What is Thursday in spanish");
                    String thursday = s.nextLine().toLowerCase();
                    System.out.println("What is Friday in spanish");
                    String friday = s.nextLine().toLowerCase();
                    System.out.println("What is Saturday in spanish");
                    String saturday = s.nextLine().toLowerCase();
                    System.out.println("What is Sunday in spanish");
                    String sunday = s.nextLine().toLowerCase();
                    System.out.println(sp.daysOfWeek(monday, tuesday, wednesday, thursday, friday, saturday, sunday));
                }
            }
        }
        //while loop ends here
    }
}