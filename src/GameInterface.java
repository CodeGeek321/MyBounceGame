import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GameInterface extends JFrame {
    //declare a Timer object to start the movement
    Graphics ctx;
    RightPanel rightpanel;
    private int height;
    //declare a timer to start moving the ball
    Timer mytimer= new Timer(50, new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(rightpanel.getPositionY()- rightpanel.getHeight()<0){

                rightpanel.setPositionY(rightpanel.getPositionY()+5);
                rightpanel.paint(rightpanel.getGraphics());
            }else{


                rightpanel.setPositionY(rightpanel.getPositionY()-5);
                rightpanel.paint(rightpanel.getGraphics());
            }


        }
    });
    public GameInterface(){
        setSize(new Dimension(800, 600));
        height=this.getHeight();
        setResizable(false);
        setTitle("Bounce Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.black);
        //define a new JSplitPane and use it to add two JPanels
        JPanel leftpanel= new JPanel();
        //add buttons to the left panel programatically
        JButton up= new JButton("Move up");
        //set the event listeners for the buttons
        up.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //start he timer
                mytimer.start();


            }
        });
        JButton down = new JButton("Move down");
        down.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //move my ball down
                rightpanel.setPositionX(rightpanel.getPositionX());
                rightpanel.setPositionY(rightpanel.getPositionY()+5);
                rightpanel.paint(rightpanel.getGraphics());

            }
        });
        leftpanel.add(up);
        leftpanel.add(down);
        rightpanel= new RightPanel();
        JSplitPane splitpane= new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,leftpanel,rightpanel);
        this.add(splitpane);
        setVisible(true);
        ctx=this.getGraphics();

    }
}
