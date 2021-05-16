
/**
 * Write a description of class ExpressionSimplifierGam here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExpressionSimplifierGame
{ 
    // the person that is going to type in the input formula
    private User[] player;
    private ExpressionWindow expression;
    private User user;
    private int x;
    private int y;
    
    /**
     * Constructor
     * 
     */
    public ExpressionSimplifierGame() {
        this.user = user;
        this.expression = expression;
        this.player = player;
        this.x = x;
        this.y = y;
    }
    
    /**
     * This method closes the game.
     * @param userAction the thing that the user will do
     * aka press the key q.
     */
    public static void quitGame(final String userAction) { 
       // Given a key press, close the game.
       // use q for Quit.
       if ("q".equals(userAction)) { 
           System.exit(0);
        }       
    }
    
    /**
     * This method closes the game.
     * @param userAction the thing that the user will do
     * aka press the key q.
     */
    public static void restartGame(final String userAction) { 
       // Given a key press, close the game.
       // use q for Quit.
       if ("r".equals(userAction)) { 
           System.exit(0);
        }       
    }
}
