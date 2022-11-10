public class SpanishLearner {
    //the username that will be reported
    private String user;
    //Used to determine
    private String practice;
    //Used for level scaling to track the user's progress
    private int level;

    public SpanishLearner (String username, String practiceForm, int userLevel)
    {
        user = username;
        practice = practiceForm;
        level = userLevel;
    }
    public SpanishLearner (String username, String practiceForm)
    {
        user = username;
        practice = practiceForm;
        level = -1;
    }
    public void updatePractice()
    {
        if (practice.equals("StE"))
            practice = "EtS";
        else
            practice = "StE";
    }
    public int getLevel()
    {
        return level;
    }

}
