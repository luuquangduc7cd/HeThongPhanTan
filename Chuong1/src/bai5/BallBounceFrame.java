package bai5;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BallBounceFrame extends Frame {
	private Panel canvas;
	public BallBounceFrame() {
		this.setTitle("Ting ting ting... pong pong pong...");
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		canvas = new Panel();
		add(canvas, "Center");
		Panel p = new Panel();
		Button start = new Button("Start");
		p.add(start);
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Ball b = new Ball(canvas);
				b.start();
			}
		});

		Button close = new Button("Close");
		p.add(close);
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.setVisible(false);
				System.exit(0);
			}
		});
		add(p, "South");
	}
}
