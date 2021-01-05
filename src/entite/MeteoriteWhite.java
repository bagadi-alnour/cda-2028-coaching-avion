package entite;

import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MeteoriteWhite extends Meteorite implements Runnable{
	private static final long serialVersionUID = -2567450332401331581L;
	private Image imgMeteoriteWhite;
	private ImageIcon icoMeteoriteWhite;
	Random r = new Random();
	int nbRandom = r.nextInt(300);
	int deplacementY = 0;
	private JLabel labelImage;
	public MeteoriteWhite(int x, int y, int heightPicture, int weightPicture) {
		super(x, y, heightPicture, weightPicture);
		this.icoMeteoriteWhite = new ImageIcon(getClass().getResource("/img/red-rock.jpg"));

		labelImage.setIcon(icoMeteoriteWhite);
		labelImage.setBounds(0,0,50,50);
	}
	public Image getImgMeteoriteWhite() {return imgMeteoriteWhite;}
	@Override
	public void run() {
		while (true) {
			move();
//			if (getY()<this.getHeight()) {
//				
//			}
		}
	}
	int deplacementY1=0;
	public void move() {
		deplacementY1++;
		while (true) {
			move();
			if (getY()<this.getHeight()) {
				labelImage.move(0 , 0+deplacementY1);
			}else {
				deplacementY1 =0;
			}
		}

	}
}