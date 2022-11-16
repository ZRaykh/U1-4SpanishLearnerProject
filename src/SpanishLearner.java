import  java.text.DecimalFormat;
public class SpanishLearner {
    //Decimal format set up
    DecimalFormat df = new DecimalFormat("0.00");
    //the username that will be reported
    private String user;
    //Used to determine
    private boolean isEnglishToSpanish;
    //Used for level scaling to track the user's progress
    private int level;

   //class that tracks the user level
    public SpanishLearner (String username, boolean spanishToEnglish, int userLevel)
    {
        user = username;
        isEnglishToSpanish = spanishToEnglish;
        level = userLevel;
    }

    //user level is disabled
    public SpanishLearner (String username, boolean spanishToEnglish)
    {
        user = username;
        isEnglishToSpanish = spanishToEnglish;
        level = -1;
    }

    //swaps the practice modes around
    public void updatePractice()
    {
        isEnglishToSpanish = !isEnglishToSpanish;
    }

    //returns the level of the user
    public boolean isEnglishToSpanish()
    {
        return isEnglishToSpanish;
    }

    //answer sheet for days of the week
    public String daysOfWeek(String monday, String tuesday, String wednesday, String thursday, String friday, String saturday, String sunday)
    {
        String answerSheet;
        int count = 0;
        if (isEnglishToSpanish)
        {
            if (monday.equals("lunes"))
            {
                answerSheet = "Monday: lunes is correct!";
                count ++;
            }
            else
                answerSheet = "Monday: Incorrect! The correct answer is lunes!";

            if (tuesday.equals("martes"))
            {
                answerSheet += "\nTuesday: martes is correct!";
                count ++;
            }
            else
                answerSheet += "\nTuesday: incorrect! The correct answer is martes!";

            if (wednesday.equals("mie'rcoles"))
            {
                answerSheet += "\nWednesday: mie'rcoles is correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nWednesday: incorrect! The correct answer is mi\u00e9rcoles! Written as: \"mie'rcoles\" on your end";
            }

            if (thursday.equals("jueves"))
            {
                answerSheet += "\nThursday: jueves is correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nThursday: incorrect! The correct answer is jueves!";
            }

            if (friday.equals("viernes"))
            {
                answerSheet += "\nFriday: viernes is correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nFriday: incorrect! The correct answer is viernes!";
            }

            if (saturday.equals("sa'bado"))
            {
                answerSheet += "\nSaturday: sa'bado is Correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nSaturday: incorrect! The correct answer is sábado (S\u00e9bado on your end)!";
            }

            if (sunday.equals("domingo"))
            {
                answerSheet += "\nSunday: domingo is orrect!";
                count ++;
            }
            else
            {
                answerSheet += "\nSunday: incorrect! The correct answer is domingo!";
            }
        }
        else
        {
            if (monday.equals("monday"))
            {
                answerSheet = "Lunes: Correct!";
                count ++;
            }
            else
                answerSheet = "Lunes: Incorrect! Lunes is Monday in English!";

            if (tuesday.equals("tuesday"))
            {
                answerSheet += "\nMartes: Correct!";
                count ++;
            }
            else
                answerSheet += "\nMartes: incorrect! Martes is Tuesday in English!";

            if (wednesday.equals("wednesday"))
            {
                answerSheet += "\nMi\u00e9rcoles: Correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nMiércoles: incorrect! Miércoles is Wednesday in English!";
            }

            if (thursday.equals("thursday"))
            {
                answerSheet += "\nJueves: Correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nJueves: incorrect! Jueves is Thursday in English!";
            }

            if (friday.equals("friday"))
            {
                answerSheet += "\nViernes: Correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nViernes: incorrect! Viernes is Friday in English!";
            }

            if (saturday.equals("saturday"))
            {
                answerSheet += "\nS\u00e9bado: Correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nS\u00e9bado: incorrect! S\u00e9bado is saturday in English!";
            }

            if (sunday.equals("sunday"))
            {
                answerSheet += "\nDomingo: Correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nDomingo: incorrect! Domingo is Sunday in English!!";
            }
        }
        double score = count/7.0;
        answerSheet += "\n You got a score of" + count + "/7 or " + df.format(score) + " correct!";
        return answerSheet;
    }
    //answer sheet for the seasons
    public String seasons(String summer, String winter, String spring, String fall)
    {
        String answerSheet;
        int count = 0;
        if (isEnglishToSpanish)
        {
            if (summer.equals("verano"))
            {
                answerSheet = "Summer: verano is correct!";
                count ++;
            }
            else
                answerSheet = "Summer: Incorrect! The correct answer is verano!";

            if (winter.equals("invierno"))
            {
                answerSheet += "\nWinter: invierno is correct!";
                count ++;
            }
            else
                answerSheet += "\nWinter: Incorrect! The correct answer is invierno!";

            if (spring.equals("primavera"))
            {
                answerSheet += "\nSpring: primavera is correct!";
                count ++;
            }
            else
                answerSheet += "\nSpring: Incorrect! The correct answer is primavera!";

            if (fall.equals("oton'o"))
            {
                answerSheet += "\nFall: oto\u00f1o is correct!";
                count ++;
            }
            else
                answerSheet += "\nFall: Incorrect! The correct answer is oto\u00f1o!";
        }
        else
        {
            if (summer.equals("summer"))
            {
                answerSheet = "Verano: summer is correct!";
                count ++;
            }
            else
                answerSheet = "Verano: Incorrect! The correct answer is summer!";

            if (winter.equals("winter"))
            {
                answerSheet += "\nInvierno: winter is correct!";
                count ++;
            }
            else
                answerSheet += "\nInvierno: Incorrect! The correct answer is winter!";

            if (spring.equals("spring"))
            {
                answerSheet += "\nPrimavera: spring is correct!";
                count ++;
            }
            else
                answerSheet += "\nPrimavera: Incorrect! The correct answer is spring!";

            if (fall.equals("fall"))
            {
                answerSheet += "\nOto\u00f1o: fall is correct!";
                count ++;
            }
            else
                answerSheet += "\nOto\u00f1o: Incorrect! The correct answer is fall!";
        }
        double score = count/4.0;
        answerSheet += "\n You got a score of " + count + "/4 or " + df.format(score) + " correct!";
        return answerSheet;
    }
    //answer sheet for the months
    public String months(String jan, String feb, String wed, String thurs)
    {
        return "Blank";
    }
}
