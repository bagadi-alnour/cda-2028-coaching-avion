package frames;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import entite.MeteoriteRed;
import entite.MeteoriteWhite;
import menu.Menu;

public class MainFrame extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	menu.Menu menu;
    private JPanel avionPanel;
    private final int WIDTH = 400;
    private final int HEIGHT = 800;
    public MainFrame() throws IOException {
        menu = new Menu();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setResizable(true);
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

			private static final long serialVersionUID = 1L;
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
//      setLayout(null);
        MeteoriteRed redBall = new MeteoriteRed(0, 0, 0, 0);
        redBall.setBounds(0, 0, 110, 220);
        redBall.setForeground(new Color(255,0,128));
        add(redBall);
        setVisible(true);
        // *****************
        MeteoriteWhite whiteBall = new MeteoriteWhite(0, 0, 0, 0);
        whiteBall.setBounds(400, 0, 110, 220);
        whiteBall.setForeground(new Color(255,0,128));
        add(whiteBall);
        setVisible(true);
    }
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
}
