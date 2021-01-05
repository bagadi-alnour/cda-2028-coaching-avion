package entite;

import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;

public class MeteoriteWhite extends Meteorite implements Runnable{

	private static final long serialVersionUID = -2567450332401331581L;
	private Image imgMeteoriteWhite;
	private ImageIcon icoMeteoriteWhite;
	Random r = new Random();
	int nbRandom = r.nextInt(300);
	
	
	public MeteoriteWhite(int x, int y, int heightPicture, int weightPicture) {
		super(x, y, heightPicture, weightPicture);
		this.icoMeteoriteWhite = new ImageIcon(getClass().getResource("/img/red-rock.jpg"));
		this.imgMeteoriteWhite = this.icoMeteoriteWhite.getImage();
	}

	public Image getImgMeteoriteWhite() {return imgMeteoriteWhite;}

	@Override
	public void run() {
		
		
	}
	
	public void position() {
		
	}
	
	

}
