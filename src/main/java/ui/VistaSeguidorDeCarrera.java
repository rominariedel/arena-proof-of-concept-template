package ui;

import domain.Modelo;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.CheckBox;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;

public class VistaSeguidorDeCarrera extends MainWindow<ViewModelSeguidor>{

	public VistaSeguidorDeCarrera() {
		super(new ViewModelSeguidor(new Modelo()));
	}
	
	@Override
	public void createContents(Panel mainPanel){
		this.setTitle("Seguidor de carrera");
		mainPanel.setLayout(new VerticalLayout());
	}
	
	 public static void main(String[] args) {
		    new VistaEditarNota().startApplication();
	 }
}
