package fr.pcohen.view.swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainListener implements ActionListener {
	
	private String origine;
	private Window window;
	
	public MainListener(String origine, Window window ) {
		super();
		this.origine = origine;
		this.window = window;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("action OK");
		System.out.println(origine);

		if (origine == "searchBox") {
			
			JPanel center = new JPanel();
			JLabel label = new JLabel("Recherche OK");
			label.setForeground(Color.GRAY);
			center.add(label);
			
			window.deleteAndReplace(center);
            
		}

	}

}
