package fr.pcohen.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Window extends JFrame {
	  
	  private JPanel searchPan = new JPanel();
	  private SearchBoxPan searchBoxPan = new SearchBoxPan();
	  
  public Window(){

    this.setTitle("DevGED");
    this.setSize(600, 800);
    
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    this.setVisible(true);
    
    searchPan.setBackground(new Color(51,51,51));
    searchPan.add(searchBoxPan);
    

    this.setContentPane(searchPan);               

    this.setVisible(true);

  }

}