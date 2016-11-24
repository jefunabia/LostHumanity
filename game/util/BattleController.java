package game.util;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class BattleController extends JPanel implements Runnable {
	
	@Override
	public void run() {
		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				racquet.keyReleased(e);
				racquet2.keyReleased(e);
			}

			@Override
			public void keyPressed(KeyEvent e) {
				racquet.keyPressed(e);
				racquet2.keyPressed(e);
			}
		});
		setFocusable(true);
	}

}
