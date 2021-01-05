package entite;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MeteoriteRock extends Meteorite{

	private JLabel labelMeteorRock;
	private ImageIcon icoMeteoriteRock;

	public MeteoriteRock(int x, int y, int heightPicture, int weightPicture) {
		super(x, y, heightPicture, weightPicture);
		this.icoMeteoriteRock = new ImageIcon("/img/f15.png");
	//	this.imgMeteoriteRock = this.icoMeteoriteRock.getImage();
		labelMeteorRock.setIcon(icoMeteoriteRock);
		this.add(labelMeteorRock);
		setVisible(true);
		
		
	}

//	public Image getImgMeteoriteRock() {return imgMeteoriteRock;}
	

	

}
