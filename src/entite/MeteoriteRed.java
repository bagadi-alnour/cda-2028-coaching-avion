package entite;

import java.awt.Image;

import javax.swing.ImageIcon;

public class MeteoriteRed extends Meteorite {
	
	private Image imgMeteoriteRed;
	private ImageIcon icoMeteoriteRed;

	public MeteoriteRed(int x, int y, int heightPicture, int weightPicture) {
		super(x, y, heightPicture, weightPicture);
		this.icoMeteoriteRed = new ImageIcon(getClass().getResource("/img/red-rock.jpg"));
		this.imgMeteoriteRed = this.icoMeteoriteRed.getImage();
	}

	public Image getImgMeteoriteRed() {return imgMeteoriteRed;}
	
	

}
