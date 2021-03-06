package tap.shortes_path_client.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;


public class ColoredPoint {
	private int x,y;
	private String name;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	private Color col;
	public ColoredPoint(int x, int y, Color col) {
		this.x=x;
		this.y=y;
		this.col=col;
	}

	public void draw(Graphics g,int width,int height) {
		g.setColor(col);
		g.fillOval(this.x-width/2, this.y-height/2, width, height);
		g.setFont(g.getFont().deriveFont(Font.BOLD));
		if(name!=null) g.drawString(name, x+width/2, y-height/2);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Point getPoint() {
		return new Point(x,y);
	}
	public void setColor(Color col) {
		this.col=col;
		
	}
	public Color getCol() {
		return this.col;
	}

}
