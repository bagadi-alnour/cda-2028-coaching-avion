package menu;

import javax.swing.*;
import java.awt.*;

public class Menu {
        private JMenuBar jMenuBar;
        private  JMenu gameMenu;
        private  JMenuItem newGame;
        private  JMenuItem pause;
        private  JMenuItem exit;

        private  JMenu history;
        private  JMenuItem showHistory;

        private  JMenu about;
        private  JMenuItem showAbout;


    public Menu() {
        jMenuBar = new JMenuBar();

        gameMenu = new JMenu();
        newGame = new JMenuItem("new Game");
        pause = new JMenuItem("Pause");
        exit = new JMenuItem("Exit");

        history = new JMenu();
        showHistory = new JMenuItem("Show history");

        about = new JMenu();
        showAbout = new JMenuItem("Show About");

        gameMenu.add(newGame);
        gameMenu.add(pause);
        gameMenu.add(exit);

        history.add(showHistory);

        about.add(showAbout);

        jMenuBar.add(gameMenu);
        jMenuBar.add(history);
        jMenuBar.add(about);







    }


    public JMenuBar getjMenuBar() {
        return jMenuBar;
    }

    public JMenu getGameMenu() {
        return gameMenu;
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

    public JMenu getAbout() {
        return about;
    }

    public JMenuItem getShowAbout() {
        return showAbout;
    }
}
