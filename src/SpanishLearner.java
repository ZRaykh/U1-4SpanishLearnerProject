
public class SpanishLearner {
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

    //answer sheet for days of the week, each boolean value stands for if the answer is right or wrong.
    public String daysOfWeek(String monday, String tuesday, String wednesday, String thursday, String friday, String saturday, String sunday)
    {
        String answerSheet;
        int count = 0;
        if (isEnglishToSpanish)
        {
            if (monday.equals("lunes"))
            {
                answerSheet = "Monday: Correct!";
                count ++;
            }
            else
                answerSheet = "Monday: Incorrect! The correct answer is lunes!";

            if (tuesday.equals("martes"))
            {
                answerSheet += "\nTuesday: Correct!";
                count ++;
            }
            else
                answerSheet += "\nTuesday: incorrect! The correct answer is martes!";

            if (wednesday.equals("mie'rcoles"))
            {
                answerSheet += "\nWednesday: Correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nWednesday: incorrect! The correct answer is miércoles! Written as: \"mie'rcoles\" on your end";
            }

            if (thursday.equals("jueves"))
            {
                answerSheet += "\nThursday: Correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nThursday: incorrect! The correct answer is jueves!";
            }

            if (friday.equals("viernes"))
            {
                answerSheet += "\nFriday: Correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nFriday: incorrect! The correct answer is viernes!";
            }

            if (saturday.equals("sa'bado"))
            {
                answerSheet += "\nSaturday: Correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nSaturday: incorrect! The correct answer is sábado!";
            }

            if (sunday.equals("domingo"))
            {
                answerSheet += "\nSunday: Correct!";
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
                answerSheet += "\nMiércoles: Correct!";
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
                answerSheet += "\nSábado: Correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nSábado: incorrect! Sábado is saturday in English!";
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
        answerSheet += "\n You got" + count / 7.0 + " correct!";
        return answerSheet;
    }
}
