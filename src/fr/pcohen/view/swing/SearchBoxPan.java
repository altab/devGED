package fr.pcohen.view.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SearchBoxPan extends JPanel {

	JLabel label = new JLabel("Search # ");
	JTextField searchField = new JTextField(20);
	public JButton buttonSearch = new JButton("Search");
	
	public SearchBoxPan(Window window) {
		
		this.setLayout(new BorderLayout());
		
		this.setBackground(new Color(51,51,51));
		
		label.setForeground(Color.GRAY);
		
		buttonSearch.addActionListener(new MainListener(this, window));
		 
		
		this.add(label, BorderLayout.WEST);
		this.add(searchField, BorderLayout.CENTER);
		this.add(buttonSearch, BorderLayout.EAST);
		
	}
	
	
	public JButton getButtonSearch() {
		return buttonSearch;
	}

	public void setButtonSearch(JButton buttonSearch) {
		this.buttonSearch = buttonSearch;
	}


}
