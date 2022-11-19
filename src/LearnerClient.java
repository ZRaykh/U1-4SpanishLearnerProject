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
        if (input.equals("B")) {
            practice = false;
        } else if (!(input.equals("A")))
            System.out.println("User input incorrect, resorting to default settings.");

        //creates the object "sp" which stands for Spanish Practice.
        SpanishLearner sp = new SpanishLearner(user, practice);
        System.out.println("All set up! Ready to go!");

        input = "";
        //spanish practice starts here
        while (!input.equals("END"))
        {
            System.out.println("Current practice modes include: \"A\" days of the week, \"B\" seasons, \"C\" months." +
                    " Or enter \"end\" to exit, or \"edit\" to change your practice mode.\nPlease select your choice:");
            input = s.nextLine().toUpperCase();

            //days of the week practice
            if (input.equals("A"))
            {
                System.out.println("Days of the week selected. Please use \" ' \" after a letter to indicate accent marks. Example: \u00ED would be i'" +
                        "| For ~ accent marks, input ' instead.");
                if (sp.isEnglishToSpanish())
                {
                    System.out.println("What is Monday in Spanish?");
                    String monday = s.nextLine().toLowerCase();
                    System.out.println("What is Tuesday in Spanish?");
                    String tuesday = s.nextLine().toLowerCase();
                    System.out.println("What is Wednesday in Spanish?");
                    String wednesday = s.nextLine().toLowerCase();
                    System.out.println("What is Thursday in Spanish?");
                    String thursday = s.nextLine().toLowerCase();
                    System.out.println("What is Friday in Spanish?");
                    String friday = s.nextLine().toLowerCase();
                    System.out.println("What is Saturday in Spanish?");
                    String saturday = s.nextLine().toLowerCase();
                    System.out.println("What is Sunday in Spanish?");
                    String sunday = s.nextLine().toLowerCase();
                    System.out.println(sp.daysOfWeek(monday, tuesday, wednesday, thursday, friday, saturday, sunday));
                }
                else
                {
                    System.out.println("What is Lunes in English?");
                    String monday = s.nextLine().toLowerCase();
                    System.out.println("What is Martes in English?");
                    String tuesday = s.nextLine().toLowerCase();
                    System.out.println("What is Mi\u00e9rcoles in English?");
                    String wednesday = s.nextLine().toLowerCase();
                    System.out.println("What is Jueves in English?");
                    String thursday = s.nextLine().toLowerCase();
                    System.out.println("What is Viernes in English?");
                    String friday = s.nextLine().toLowerCase();
                    System.out.println("What is S\u00E1bado in English?");
                    String saturday = s.nextLine().toLowerCase();
                    System.out.println("What is Domingo in English?");
                    String sunday = s.nextLine().toLowerCase();
                    System.out.println(sp.daysOfWeek(monday, tuesday, wednesday, thursday, friday, saturday, sunday));
                }
            }

            //seasons practice
            else if (input.equals("B")) {
                System.out.println("Seasons selected. Please use \" ' \" after a letter to indicate accent marks. Example: \u00ED would be i' " +
                        "| For ~ accent marks, input ' instead.");
                String summer = "";
                String winter = "";
                String spring = "";
                String fall = "";
                int asked;
                boolean summerAsked = false;
                boolean winterAsked = false;
                boolean springAsked = false;
                boolean fallAsked = false;
                if (sp.isEnglishToSpanish()) {
                    asked = 1;
                    while (asked < 5) {
                        int question = (int) (Math.random() * 4 + 1);
                        if (question == 1 && !summerAsked) {
                            System.out.println("What is Summer in Spanish?");
                            summer = s.nextLine().toLowerCase();
                            asked++;
                            summerAsked = true;
                        }
                        if (question == 2 && !winterAsked) {
                            System.out.println("What is Winter in Spanish?");
                            winter = s.nextLine().toLowerCase();
                            asked++;
                            winterAsked = true;

                        }
                        if (question == 3 && !springAsked) {
                            System.out.println("What is Spring in Spanish?");
                            spring = s.nextLine().toLowerCase();
                            asked++;
                            springAsked = true;

                        }
                        if (question == 4 && !fallAsked) {
                            System.out.println("What is Fall in Spanish?");
                            fall = s.nextLine().toLowerCase();
                            asked++;
                            fallAsked = true;
                        }
                    }
                    System.out.println(sp.seasons(summer, winter, spring, fall));
                } else {
                    asked = 1;
                    while (asked < 5) {
                        int question = (int) (Math.random() * 4 + 1);
                        if (question == 1 && !summerAsked) {
                            System.out.println("What is verano in English?");
                            summer = s.nextLine().toLowerCase();
                            asked++;
                            summerAsked = true;
                        }
                        if (question == 2 && !winterAsked) {
                            System.out.println("What is invierno in English?");
                            winter = s.nextLine().toLowerCase();
                            asked++;
                            winterAsked = true;

                        }
                        if (question == 3 && !springAsked) {
                            System.out.println("What is primavera in English?");
                            spring = s.nextLine().toLowerCase();
                            asked++;
                            springAsked = true;

                        }
                        if (question == 4 && !fallAsked) {
                            System.out.println("What is Oto\u00f1o in English?");
                            fall = s.nextLine().toLowerCase();
                            asked++;
                            fallAsked = true;
                        }
                    }
                    System.out.println(sp.seasons(summer, winter, spring, fall));
                }
            }
                // months practice
            else if (input.equals("C"))
            {
                System.out.println("Months selected. Please use \" ' \" after a letter to indicate accent marks. Example: \u00ED would be i' " +
                        "| For ~ accent marks, input ' instead.");
                if (sp.isEnglishToSpanish())
                {
                    System.out.println("What is January in Spanish?");
                    String jan = s.nextLine().toLowerCase();
                    System.out.println("What is February in Spanish?");
                    String feb = s.nextLine().toLowerCase();
                    System.out.println("What is March in Spanish?");
                    String mar = s.nextLine().toLowerCase();
                    System.out.println("What is April in Spanish?");
                    String apr = s.nextLine().toLowerCase();
                    System.out.println("What is May in Spanish?");
                    String may = s.nextLine().toLowerCase();
                    System.out.println("What is June in Spanish?");
                    String june = s.nextLine().toLowerCase();
                    System.out.println("What is July in Spanish?");
                    String july = s.nextLine().toLowerCase();
                    System.out.println("What is August in Spanish?");
                    String aug = s.nextLine().toLowerCase();
                    System.out.println("What is September in Spanish?");
                    String sep = s.nextLine().toLowerCase();
                    System.out.println("What is October in Spanish?");
                    String oct = s.nextLine().toLowerCase();
                    System.out.println("What is November in Spanish?");
                    String nov = s.nextLine().toLowerCase();
                    System.out.println("What is December in Spanish?");
                    String dec = s.nextLine().toLowerCase();
                    System.out.println(sp.months(jan, feb, mar, apr, may, june, july, aug, sep, oct, nov, dec));
                }
                else
                {
                    System.out.println("What is enero in English?");
                    String jan = s.nextLine().toLowerCase();
                    System.out.println("What is febrero in English?");
                    String feb = s.nextLine().toLowerCase();
                    System.out.println("What is marzo in English?");
                    String mar = s.nextLine().toLowerCase();
                    System.out.println("What is abril in English?");
                    String apr = s.nextLine().toLowerCase();
                    System.out.println("What is mayo in English?");
                    String may = s.nextLine().toLowerCase();
                    System.out.println("What is junio in English?");
                    String june = s.nextLine().toLowerCase();
                    System.out.println("What is julio in English?");
                    String july = s.nextLine().toLowerCase();
                    System.out.println("What is agosto in English?");
                    String aug = s.nextLine().toLowerCase();
                    System.out.println("What is septiembre in English?");
                    String sep = s.nextLine().toLowerCase();
                    System.out.println("What is octubre in English?");
                    String oct = s.nextLine().toLowerCase();
                    System.out.println("What is noviembre in English?");
                    String nov = s.nextLine().toLowerCase();
                    System.out.println("What is diciembre in English?");
                    String dec = s.nextLine().toLowerCase();
                    System.out.println(sp.months(jan, feb, mar, apr, may, june, july, aug, sep, oct, nov, dec));
                }
            }

            //edit mode to change practice modes
            else if (input.equals("EDIT"))
            {
                sp.updatePractice();
                System.out.println("Practice mode swapped.");
            }

            //mode to end the program, used so that Invalid input. isn't returned when end is entered
            else if (input.equals("END")){
                System.out.println("Exiting.");
            }

            //Returns invalid input if the user enters something other than the specified options.
            else
            {
                System.out.println("Invalid input.");
            }
        }
        System.out.println(sp);
    }
}
