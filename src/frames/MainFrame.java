package frames;


import menu.Menu;

import javax.imageio.ImageIO;
import javax.swing.*;

import entite.MeteoriteRed;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class MainFrame extends JFrame implements KeyListener, ActionListener {
    menu.Menu menu;

    private JPanel avionPanel;
    private final int WIDTH = 400;
    private final int HEIGHT = 800;
    private int positionAvionDebutX = this.getWidth()/2- 60;
    private int positionAvionDebutY = this.getHeight()/2 +220;


    public MainFrame() throws IOException {
        menu = new Menu();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setResizable(true);
        setLocationRelativeTo(null);
        addKeyListener(this);

        setTitle("Main frame");
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/img/skyTile.jpg")))));
        } catch (IOException e) {
        	System.out.println("Erreur lors du chargement Background image dans la MainFrame");
            
        }
        // Add plane to jframe
        this.avionPanel = new JPanel() {
            BufferedImage image = ImageIO.read(MainFrame.class.getResource("/img/f15.png"));
            
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(this.image, 0, 0, this.getWidth(), this.getHeight(), null);
            }
        };

        int positionAvionDepartX = MainFrame.this.getWidth()/2 -60;
        int positionAvionDepartY =  MainFrame.this.getHeight()- 220;
        avionPanel.setBounds(positionAvionDepartX, positionAvionDepartY, 110, 110);

        getContentPane().add(avionPanel);
        setJMenuBar(menu.getjMenuBar());
        menu.getNewGame().addActionListener(this);
        menu.getPause().addActionListener(this);
        menu.getExit().addActionListener(this);
        menu.getShowHistory().addActionListener(this);
        menu.getInstructions().addActionListener(this);
        menu.getAboutUS().addActionListener(this);

//      setLayout(null);
        MeteoriteRed redBall = new MeteoriteRed(0, 0, 0, 0);
        redBall.setBounds(0, 0, 110, 220);
        redBall.setForeground(new Color(255,0,128));
        add(redBall);
        setVisible(true);
    }



  
    
    private void defilementBackground() {
    	
    }
    
    //Listener Clavier

    @Override
    public void keyTyped(KeyEvent e) {

    }
    // control the image of plane
    @Override
    public void keyPressed(KeyEvent e) {
        int pixelPerPress = 10;
        int keycode = e.getKeyCode();
        int xDirection = 0;
        int yDirection = 0;
        if (keycode == KeyEvent.VK_RIGHT) {
            xDirection += pixelPerPress;
        } else if (keycode == KeyEvent.VK_UP) {
            yDirection -= pixelPerPress;
        } else if (keycode == KeyEvent.VK_LEFT) {
            xDirection -= pixelPerPress;
        } else if (keycode == KeyEvent.VK_DOWN) {
            yDirection += pixelPerPress;
        }
        if ((xDirection != 0 || yDirection != 0) &&
                (avionPanel.getX() + xDirection > 0) &&
                (avionPanel.getY() + yDirection > 0) &&
                (avionPanel.getX() + xDirection < avionPanel.getParent().getWidth() - avionPanel.getWidth()) &&
                (avionPanel.getY() + yDirection < avionPanel.getParent().getHeight() - avionPanel.getHeight())) {
            avionPanel.setLocation(avionPanel.getX() + xDirection, avionPanel.getY() + yDirection);
        }

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menu.getNewGame()) {
            System.out.println("new game started..");
        } else if (e.getSource() == menu.getExit()) {
            System.exit(0);
        } else if (e.getSource() == menu.getShowHistory()) {
            JOptionPane.showMessageDialog(null,
                    "Afficher l'historique du jeu ici" +
                    JOptionPane.PLAIN_MESSAGE);
        }  else if (e.getSource() == menu.getInstructions()) {
            JOptionPane.showMessageDialog(null,
                    "Expliquer comment on peut jeuer ici" +
                    JOptionPane.INFORMATION_MESSAGE);

        }  else if (e.getSource() == menu.getAboutUS()) {
            JOptionPane.showMessageDialog(null,
                    " qui sommes nous ici" +
                    JOptionPane.PLAIN_MESSAGE);
        }
    }
}
