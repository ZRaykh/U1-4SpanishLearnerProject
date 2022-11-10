import java.util.Scanner;
public class LearnerClient {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //greeting program and setting up username
        System.out.println("Hello user! Welcome to Spanish Learner, a program that is aimed to help you study spanish" +
                "at a basic skill level! Please enter a username:");
        String user = s.nextLine();
        System.out.println("Well then " + user + " do you want to practice converting \"A\" English words to Spanish or \"B\" Spanish words to English?");
        String practice = s.nextLine().toUpperCase();
        if (!(practice.equals("A") || practice.equals("B"))) {
            System.out.println("User input incorrect, resorting to default settings.");
            practice = "A";
        }
        System.out.println("Last question: Do you want skill leveling active? If yes please enter \"Y\", enter anything else for no.");
        String input = s.nextLine().toUpperCase();
        if (input.equals("Y"))
        {
            System.out.println("Please enter a number 1 through 3 for the skill leve. 1 is easiest difficulty, 3 is hardest.");
            int skill = s.nextInt();
            if (skill == 1)
            {
                System.out.println("Easy skill level selected.");
            }
            if (skill == 2)
            {
                System.out.println("Medium skill level selected.");
            }
            if (skill == 3)
            {
                System.out.println("Hard skill level selected.");
            }
            else
            {
                System.out.println("No valid input detected, default easy option entered.");
                skill = 1;
            }
            SpanishLearner spanishPractice = new SpanishLearner(user, practice, skill);
        }
        else
        {
            SpanishLearner spanishPractice = new SpanishLearner(user, practice);
        }
        System.out.println("All set up! Ready to go!");
        while (!input.equals("END"))
        {
            System.out.println("Current practice modes include: \"A\" days of the week, \"B\" seasons, \"C\" months \"D\" numbers. " +
                    "Or enter \"end\" to exit, or \"edit\" to change your practice mode.\nPlease select your choice:");
            input = s.nextLine().toUpperCase();
        }

    }
}