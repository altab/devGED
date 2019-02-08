package fr.pcohen.view.swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainListener implements ActionListener {
	
	private Window window;
	private SearchBoxPan searchBoxPan;
	
	public MainListener(SearchBoxPan searchBoxPan, Window window ) {
		super();
		this.window = window;
		this.searchBoxPan = searchBoxPan;		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (searchBoxPan instanceof SearchBoxPan) {
			JPanel center = new JPanel();
			JLabel label = new JLabel("Bouton Recherche OK");
			label.setForeground(Color.GRAY);
			center.add(label);
			
			window.deleteAndReplace(center);
            
		}

	}

}
