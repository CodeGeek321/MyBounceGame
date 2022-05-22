import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel {
    //define the position where the circle will be drawn
    private int positionX=150;
    private int positionY=150;
    private int radius=100;//as the shape is a circle
    //override the paint method to draw the bounce ball on the second panel


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d= (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.RED);
        g2d.fillOval(positionX,positionY,radius,radius);
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }
    public void setPositionY(int positionY){
        this.positionY=positionY;
    }
    public int getPositionX(){
        return this.positionX;
    }
    public int getPositionY(){
        return this.positionY;
    }
}
