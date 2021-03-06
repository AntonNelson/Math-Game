/**
 * 
 */
package com.mathgame.math;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * The panel where the cards that have been made can be stored for later use
 *
 */
public class HoldPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2013522168342802483L;
	final String imageFile = "images/card holder.png";
	Image background;
	
	public void init(MathGame mathGame)	{

		this.setLayout(new FlowLayout());
		Border empty = BorderFactory.createEmptyBorder(10,10,10,10);
		this.setBorder(empty);
		//used as spacer so cards are placed in right position; if removed, cards will have to snap at different location
		
		Dimension size = getPreferredSize();
		size.width = 750;
		size.height = 150;
		setPreferredSize(size);
		
		background = mathGame.getImage(mathGame.getDocumentBase(), imageFile);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponents(g);
		g.drawImage(background, 0, 0, null);

		
	}
}