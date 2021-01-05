package entite;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MeteoriteRed extends Meteorite {
	private Image imgMeteoriteRed;
	private ImageIcon icoMeteoriteRed;
	private JLabel imageMeteoriteRed = new JLabel();

	public MeteoriteRed(int x, int y, int heightPicture, int weightPicture) {
		super(x, y, heightPicture, weightPicture);
		this.icoMeteoriteRed = new ImageIcon(getClass().getResource("/img/red-rock.jpg"));
		imageMeteoriteRed.setIcon(icoMeteoriteRed);
		this.add(imageMeteoriteRed);
		setVisible(true);
	}

	public Image getImgMeteoriteRed() {
		return imgMeteoriteRed;
	}

}
