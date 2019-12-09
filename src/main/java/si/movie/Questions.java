package si.movie;

public enum Questions {
    CLASSIC("Classic or modern?"),
    BLACK("Black and white?"),
    COMEDY("Comedy or drama?"),
    NOVEL("Based on a novel?"),
    FRIENDS("A tale of friends or strangers?"),
    ACTION("What kind of action?"),
    NEW("New or old?"),
    TOGETHER("Do they get together in the end?"),
    US("Based in U.S or Mexico?"),
    COUPLE_COUNT("One couple or multiple?"),
    TIME("Your thoughts on the '90s?"),
    ADVENTURES("Like adventures?"),
    AUTHOR("Author Bronte or Austen?"),
    BIOGRAPHY("Ah, period piece it is. Biography?"),
    QUEST("Quest for love?"),
    LOVE_TRIANGLES("Like love triangles?"),
    FISH("Fish out of water?"),
    ART("Art or Film?"),
    TROPICAL("Tropical paradise?"),
    QUEENS("\"Take me to Queens\""),
    INNOCENT("Deep passion or innocent love?"),
    CHEATERS("Are the character dating someone?"),
    GHOSTS("Do you like ghosts?"),
    CHRISTMAS("Planning for Christmas already?"),
    NOTE("Sparked by a note?"),
    JENN("Pick a Jennifer"),
    CITY("Small town or big city?"),
    SINGLE("Single and ready to mingle?"),
    PROPOSE("Will he propose?"),
    LASTS("A love that lasts decades?"),
    GROUNDHOG("Groundhog Day theme?"),
    BEER("Do you like beer?")


    ;
    private String value;

    Questions(String s) {
        value = s;
    }
    public String getValue(){
        return value;
    }
}
