package frames;

import menu.Menu;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class MainFrame extends JFrame implements KeyListener {
    Menu menu;
    private JPanel avionPanel;
    private final int WIDTH = 400;
    private final int HEIGHT = 800;


    public MainFrame() throws IOException {
        menu = new Menu();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        addKeyListener(this);


        setTitle("Main frame");
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/img/bg.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Add plane to jframe
        this.avionPanel = new JPanel() {
            BufferedImage image = ImageIO.read(MainFrame.class.getResource("/img/f15.png"));

            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(this.image, 0, 0, this.getWidth(), this.getHeight(), null);
            }
        };

        avionPanel.setBounds(90, 90, 110, 110);
        getContentPane().add(avionPanel);
        setJMenuBar(this.menu.getjMenuBar());

        setVisible(true);



    }
    @Override
    public void keyTyped(KeyEvent e) {

    }
    // control the image of plane
    @Override
    public void keyPressed(KeyEvent e) {
        int pixelPerPress = 5;
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
}
