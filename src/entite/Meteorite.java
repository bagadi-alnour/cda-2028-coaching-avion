package entite;

import javax.swing.JPanel;

public abstract class Meteorite extends JPanel {
	
	private int heightPicture, weightPicture;   // dimension de l'objet
	private int x, y;							// position de l'objet
	
	
	public Meteorite(int x, int y, int heightPicture, int weightPicture) {
		
		this.x = x;
		this.y = y;
		this.heightPicture = heightPicture;
		this.weightPicture = weightPicture;
	}

	public int getX() {return x;	}
	public int getY() {return y;}
	public int getHeightPicture() {return heightPicture;}
	public int getWeightPicture() {return weightPicture;}


	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
	public void setWeightPicture(int weightPicture) {this.weightPicture = weightPicture;}
	public void setHeightPicture(int heightPicture) {this.heightPicture = heightPicture;}
	
	
	
	

}
