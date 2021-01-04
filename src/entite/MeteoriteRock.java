package entite;

import java.awt.Image;

import javax.swing.ImageIcon;

public class MeteoriteRock extends Meteorite{

	private Image imgMeteoriteRock;
	private ImageIcon icoMeteoriteRock;

	public MeteoriteRock(int x, int y, int heightPicture, int weightPicture) {
		super(x, y, heightPicture, weightPicture);
		this.icoMeteoriteRock = new ImageIcon(getClass().getResource("/img/red-rock.jpg"));
		this.imgMeteoriteRock = this.icoMeteoriteRock.getImage();
	}

	public Image getImgMeteoriteRock() {return imgMeteoriteRock;}
	

	

}
