package menu;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class Menu  {

    private JMenuBar jMenuBar;
    private JMenu game;
    private JMenuItem newGame;
    private JMenuItem pause;
    private JMenuItem exit;
    private JMenu history;
    private JMenuItem showHistory;
    private JMenu help;
    private JMenuItem Instructions;
    private JMenu about;
    private JMenuItem aboutUS;

    public Menu() {
        this.jMenuBar = new JMenuBar();
        this.game = new JMenu("Game");
        this.newGame = new JMenuItem("New Game");
        this.pause = new JMenuItem("Pause");
        this.exit= new JMenuItem("Exit");
        this.history = new JMenu("History");
        this.showHistory= new JMenuItem("Show history");
        this.help  = new JMenu("Help");
        this.Instructions= new JMenuItem("Instructions");
        this.about  = new JMenu("About");
        this.aboutUS= new JMenuItem("About as");

        newGame.setMnemonic(KeyEvent.VK_N);
        pause.setMnemonic(KeyEvent.VK_P);
        exit.setMnemonic(KeyEvent.VK_X);
        help.setMnemonic(KeyEvent.VK_H);

        game.add(newGame);
        game.add(pause);
        game.add(exit);

        history.add(showHistory);
        help.add(Instructions);
        about.add(aboutUS);


        jMenuBar.add(game);
        jMenuBar.add(history);
        jMenuBar.add(help);
        jMenuBar.add(about);
    }

    public JMenuBar getjMenuBar() {
        return jMenuBar;
    }

    public JMenu getGame() {
        return game;
    }

    public JMenuItem getNewGame() {
        return newGame;
    }

    public JMenuItem getPause() {
        return pause;
    }

    public JMenuItem getExit() {
        return exit;
    }

    public JMenu getHistory() {
        return history;
    }

    public JMenuItem getShowHistory() {
        return showHistory;
    }

    public JMenu getHelp() {
        return help;
    }

    public JMenuItem getInstructions() {
        return Instructions;
    }

    public JMenu getAbout() {
        return about;
    }

    public JMenuItem getAboutUS() {
        return aboutUS;
    }
}
