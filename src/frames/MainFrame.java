package frames;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import menu.Menu;




public class MainFrame extends JFrame implements KeyListener, ActionListener, Runnable {

//    ArrayList<Meteorites> ball
    Rectangle rectangleWhite = new Rectangle();
    Rectangle rectangleRed = new Rectangle();
    JLabel redball;
    JLabel whiteball;
    Meteorites meteorites = new Meteorites();
    boolean exit;
    int pixelPerSec = 5;
    private int ballX = 0;
    private int ballY = 0;
    private static final long serialVersionUID = 1L;
    menu.Menu menu;
    private JPanel avionPanel;
    private final int WIDTH = 400;
    private final int HEIGHT = 800;
    private int score = 0;

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

            setContentPane(new JLabel(new ImageIcon(ImageIO.read(MainFrame.class.getResource("/img/background-space.gif")))));

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
        avionPanel.setBounds(positionAvionDepartX, positionAvionDepartY, 80, 80);

        getContentPane().add(avionPanel);
        setJMenuBar(menu.getjMenuBar());
        menu.getNewGame().addActionListener(this);
        menu.getPause().addActionListener(this);
        menu.getExit().addActionListener(this);
        menu.getShowHistory().addActionListener(this);
        menu.getInstructions().addActionListener(this);
        menu.getAboutUS().addActionListener(this);






        redball = meteorites.create("redball", "/img/red-rock.jpg", 30, 30, true);
        add(redball);

        whiteball = meteorites.create("whiteball", "/img/red-rock.jpg", 30, 30, true);
        add(whiteball);
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


    @Override
    public void run() {
        int randomRed = new Random().nextInt(this.WIDTH -100);
        int randomWhite = new Random().nextInt(this.WIDTH -100);
        while (!exit) {
            try {
                this.pixelPerSec+=5;
                if ((this.redball.getY() - this.redball.getHeight()) <getHEIGHT()){
                    this.redball.setLocation(randomRed, this.ballY + this.pixelPerSec);
                    this.whiteball.setLocation(randomWhite, this.ballY + this.pixelPerSec);
                } else {
                    // les impacts
                    System.out.println("je sors de boocle");
                    this.exit = true;
            }


//                if ((this.redball.getY() - 100) > MainFrame.this.getHeight()) {
//                    this.redball.setVisible(false);
//                    System.out.println("je suis ivisable");
//                }
            Thread.sleep(50);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}

    public int getPixelPerSec() {
        return pixelPerSec;
    }

    public int getBallX() {
        return ballX;
    }

    public void setBallX(int ballX) {
        this.ballX = ballX;
    }

    public int getBallY() {
        return ballY;
    }

    public void setBallY(int ballY) {
        this.ballY = ballY;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
