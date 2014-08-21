package ui;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.CheckBox;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;

import domain.Modelo;

public class Vista extends MainWindow<ViewModel> {
	

	public Vista() {
		super(new ViewModel(new Modelo()));
	}

	@Override
	public void createContents(Panel mainPanel){
		this.setTitle("Editar Nota");
		mainPanel.setLayout(new VerticalLayout());
		
		new Label(mainPanel).setText("Fecha:");
		new TextBox(mainPanel).bindValueToProperty("fecha");
		
		new Label(mainPanel).setText("Descripcion:");
		new TextBox(mainPanel).bindValueToProperty("descripcion");
		
		new CheckBox(mainPanel).bindValueToProperty("aprobado");
		new Label(mainPanel).setText("Aprobado");
		
		new Button(mainPanel).onClick(() -> {}).setCaption("aceptar");
		
	}
	
	 public static void main(String[] args) {
		    new Vista().startApplication();
	 }
}

