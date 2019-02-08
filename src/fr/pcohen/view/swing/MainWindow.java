package fr.pcohen.view.swing;

import javax.swing.JPanel;

public class MainWindow extends Window {

	public MainWindow() {
		super();
		SearchBoxPan searchBoxPan = new SearchBoxPan(this);		
	}
	
	@Override
	/**
	 * Efface le panel central pour le remplacer par un nouveau que l'on passe � la methode en parametre
	 * @param nouveauPanel (JPanel)
	 */
	public void deleteAndReplace(JPanel newPanel) {		
		System.out.println("test");
		this.getMainPan().removeAll();
		this.getMainPan().add(newPanel);
		this.getFullPan().repaint();
		this.getFullPan().revalidate();
	}
	
	public void test() {
		System.out.println("test methode dans mainWindow");
		}

}
