package entite;

import java.awt.Image;

import javax.swing.ImageIcon;

public class MeteoriteWhite extends Meteorite{

	private Image imgMeteoriteWhite;
	private ImageIcon icoMeteoriteWhite;

	public MeteoriteWhite(int x, int y, int heightPicture, int weightPicture) {
		super(x, y, heightPicture, weightPicture);
		this.icoMeteoriteWhite = new ImageIcon(getClass().getResource("/img/red-rock.jpg"));
		this.imgMeteoriteWhite = this.icoMeteoriteWhite.getImage();
	}

	public Image getImgMeteoriteWhite() {return imgMeteoriteWhite;}
	

}
