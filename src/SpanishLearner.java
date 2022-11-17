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
                answerSheet += "\nSaturday: sa'bado is correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nSaturday: incorrect! The correct answer is S\u00E1bado (Sa'bado on your end)!";
            }

            if (sunday.equals("domingo"))
            {
                answerSheet += "\nSunday: domingo is correct!";
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
                answerSheet += "\nS\u00E19bado: Correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nS\u00E1bado: incorrect! S\u00E1bado is saturday in English!";
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
        answerSheet += "\nYou got a score of " + count + "/7 or " + df.format(score) + " correct!";
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

            if (fall.equals("fall") || fall.equals("autumn"))
            {
                answerSheet += "\nOto\u00f1o: fall is correct!";
                count ++;
            }
            else
                answerSheet += "\nOto\u00f1o: Incorrect! The correct answer is fall!";
        }
        double score = count/4.0;
        answerSheet += "\nYou got a score of " + count + "/4 or " + df.format(score) + " correct!";
        return answerSheet;
    }
    //answer sheet for the months
    public String months(String jan, String feb, String mar, String apr, String may, String june, String july, String aug, String sept, String oct, String nov, String dec)
    {
        String answerSheet;
        int count = 0;
        if (isEnglishToSpanish)
        {
            if (jan.equals("enero"))
            {
                answerSheet = "January: enero is correct!";
                count ++;
            }
            else
                answerSheet = "January: incorrect! The correct answer is enero!";

            if (feb.equals("febrero"))
            {
                answerSheet += "\nFebuary: febrero is correct!";
                count ++;
            }
            else
                answerSheet += "\nFebuary: incorrect! The correct answer is febrero!";

            if (mar.equals("marzo"))
            {
                answerSheet += "\nWednesday: marzo is correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nWednesday: incorrect! The correct answer is marzo!";
            }

            if (apr.equals("abril"))
            {
                    answerSheet += "\nApril: abril is correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nApril: incorrect! The correct answer is abril!";
            }

            if (may.equals("mayo"))
            {
                answerSheet += "\nMarch: mayo is correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nMarch: incorrect! The correct answer is mayo!";
            }

            if (june.equals("junio"))
            {
                answerSheet += "\nJune: junio is correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nJune: incorrect! The correct answer is junio!";
            }

            if (july.equals("julio"))
            {
                answerSheet += "\nJuly: julio is correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nJuly: incorrect! The correct answer is julio!";
            }

            if (aug.equals("agosto"))
            {
                answerSheet += "\nAugust: agosto is correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nAugust: incorrect! The correct answer is agosto!";
            }

            if (sept.equals("septiembre"))
            {
                answerSheet += "\nSeptember: septiembre is correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nSeptember: incorrect! The correct answer is septiembre!";
            }

            if (oct.equals("octubre"))
            {
                answerSheet += "\nOctober: octubre is correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nOctober: incorrect! The correct answer is octubre!";
            }

            if (nov.equals("noviembre"))
            {
                answerSheet += "\nNovember: noviembre is correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nNovember: incorrect! The correct answer is noviembre!";
            }

            if (dec.equals("diciembre"))
            {
                answerSheet += "\nDecember: diciembre is correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nDecember: incorrect! The correct answer is diciembre!";
            }
        }
        else
        {
            if (jan.equals("january"))
            {
                answerSheet = "Enero: Correct!";
                count ++;
            }
            else
                answerSheet = "Enero: Incorrect! Enero is January in English!";

            if (feb.equals("febuary"))
            {
                answerSheet += "\nFebrero: Correct!";
                count ++;
            }
            else
                answerSheet += "\nFebrero: incorrect! Febrero is Febuary in English!";

            if (mar.equals("march"))
            {
                answerSheet += "\nMarzo: Correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nMarzo: incorrect! Marzo is March in English!";
            }

            if (apr.equals("april"))
            {
                answerSheet += "\nAbril: Correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nAbril: incorrect! Abril is April in English!";
            }

            if (may.equals("may"))
            {
                answerSheet += "\nMayo: Correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nMayo: incorrect! Mayo is May in English!";
            }

            if (june.equals("june"))
            {
                answerSheet += "\nJunio: Correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nJunio: incorrect! Junio is June in English!";
            }

            if (july.equals("july"))
            {
                answerSheet += "\nJulio: Correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nJulio: incorrect! Julio is July in English!!";
            }

            if (aug.equals("august"))
            {
                answerSheet += "\nAgosto: Correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nAgosto: incorrect! Agosto is August in English!!";
            }

            if (sept.equals("september"))
            {
                answerSheet += "\nSeptiembre: Correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nSeptiembre: incorrect! Septiembre is September in English!!";
            }

            if (oct.equals("october"))
            {
                answerSheet += "\nOctubre: Correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nOctubre: incorrect! Octubre is October in English!!";
            }

            if (nov.equals("november"))
            {
                answerSheet += "\nNoviembre: Correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nnoviembre: incorrect! Noviembre is November in English!!";
            }

            if (dec.equals("december"))
            {
                answerSheet += "\nDiciembre: Correct!";
                count ++;
            }
            else
            {
                answerSheet += "\nDiciembre: incorrect! Diciembre is December in English!!";
            }
        }
        double score = count/12.0;
        answerSheet += "\nYou got a score of " + count + "/12 or " + df.format(score) + " correct!";
        return answerSheet;
    }
    public String toString()
    {
        String goodbye = "Thank you for using Spanish learner " + user;
        if (level != - 1)
        {
            goodbye += "\nFinishing skill level: " + level;
        }
        return goodbye;
    }
}
