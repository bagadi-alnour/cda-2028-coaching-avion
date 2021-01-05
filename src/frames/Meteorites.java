package frames;

import javax.swing.*;

public class Meteorites {
    private  String jLabelName;
    private  String imagePath;
    private  ImageIcon image;

    private  int sizeX;
    private  int sizeY;
    private  int dirX;
    private  boolean showingLabel;
    private  int dirY;

    public Meteorites() {
        this.jLabelName = jLabelName;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.dirX = dirX;
        this.dirY = dirY;
    }

    public  JLabel create(String jLabelName, String imagePath, int sizeX, int sizeY, boolean showingLabel ) {
        JLabel res = new JLabel();
         res.setIcon(new ImageIcon(getClass().getResource(imagePath)));
        res.setSize(sizeX, sizeY);
        res.setText(jLabelName);
        res.setVisible(showingLabel);
        return res;
    }


    public String getjLabelName() {
        return jLabelName;
    }

    public void setjLabelName(String jLabelName) {
        this.jLabelName = jLabelName;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }

    public int getDirX() {
        return dirX;
    }

    public void setDirX(int dirX) {
        this.dirX = dirX;
    }

    public int getDirY() {
        return dirY;
    }

    public void setDirY(int dirY) {
        this.dirY = dirY;
    }

    public boolean isShowingLabel() {
        return showingLabel;
    }

    public void setShowingLabel(boolean showingLabel) {
        this.showingLabel = showingLabel;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
