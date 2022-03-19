/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat_app;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JTextPane;

/**
 *
 * @author Olu
 */
public class chat_text extends JTextPane{
    
    private Color borderColor = Color.BLUE;
    private Color bgColor = Color.GREEN;
    
    public chat_text(){
        setBackground(new Color(0, 0, 0, 0));
    }
    

     
    @Override
    protected void paintComponent(Graphics graphics){
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(bgColor);
        g2.fillRoundRect(0,0, getWidth(), getHeight(), 5, 5);
        g2.setColor(borderColor);
        g2.drawRoundRect(0,0, getWidth() - 1, getHeight() - 1, 5, 5);
        super.paintComponent(graphics);
    }

    /**
     * @return the borderColor
     */
    public Color getBorderColor() {
        return borderColor;
    }

    /**
     * @param borderColor the borderColor to set
     */
    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    /**
     * @return the bgColor
     */
    public Color getBgColor() {
        return bgColor;
    }

    /**
     * @param bgColor the bgColor to set
     */
    public void setBgColor(Color bgColor) {
        this.bgColor = bgColor;
    }
    
    
    
   
}
