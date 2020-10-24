package bai4;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;

public class AnimationFrame extends Frame {
	Image[] images;
	AnimationThread t;
	public AnimationFrame() {
		images = new Image[2];
		images[0] = getToolkit().getImage("C:\\Users\\student15\\Documents\\LuuQuangDuc-16019921\\Chuong1\\bin\\bai4\\1.png");
		images[1] = getToolkit().getImage("C:\\Users\\student15\\Documents\\LuuQuangDuc-16019921\\Chuong1\\bin\\bai4\\2.png");
		setBounds(300, 200, 255, 256);
		t = new AnimationThread(this);
		t.start();
		show();
	}
	public void paint(Graphics g) {
		g.drawImage(images[t.getIndex()], 0, 20, this);
	}
}
