package ui;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;

import domain.Modelo;

public class VistaNuevaMateria extends MainWindow<ViewModelNuevaMateria>{

	public VistaNuevaMateria(ViewModelNuevaMateria model) {
		super(new ViewModelNuevaMateria(new Modelo()));
	}

	@Override
	public void createContents(Panel mainPanel) {
		
		
	}

}
