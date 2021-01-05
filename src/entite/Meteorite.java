package entite;

import javax.swing.JPanel;

public abstract class Meteorite extends JPanel {
	
	private int widthPicture, heightPicture;   // dimension de l'objet
	private int x, y;							// position de l'objet
	
	
	public Meteorite(int x, int y, int widthPicture , int heightPicture) {
		this.x = x;
		this.y = y;
		this.widthPicture = widthPicture;
		this.heightPicture = heightPicture;
	}

	////////////////////GETTERS and SETTERS
	public int getX() {return x;}
	public int getY() {return y;}
	public int getHeightPicture() {return heightPicture;}
	public int widthPicture() {return widthPicture;}


	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
	public void setWeightPicture(int widthPicture) {this.widthPicture = widthPicture;}
	public void setHeightPicture(int heightPicture) {this.heightPicture = heightPicture;}
	
	
	
	

}
