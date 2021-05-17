/**
 * ...
 */
public class Main {
    
    /**
     * Run the application (from the command line).
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Model model = new Model();
        final TextUserInterface TUI = new TextUserInterface(model);
        TUI.run();
        // also print a welcome message of the game
        
        // also print a good bye message of the game.
    }
}