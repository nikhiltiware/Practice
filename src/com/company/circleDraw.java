package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Nikhil on 4/1/16.
 */
public class circleDraw extends JApplet{

    public void drawCenteredCircle(Graphics g) {
        super.paint( g );

        g.setColor( new Color(0,0,0));

        g.drawOval(50,75,100,100);

    }
}
