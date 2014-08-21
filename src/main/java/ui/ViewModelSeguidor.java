package ui;

import domain.Modelo;
import org.uqbar.commons.utils.Observable;


@Observable
public class ViewModelSeguidor {
	private Modelo modelo;
	public ViewModelSeguidor(Modelo modelo){
		this.modelo = modelo;
	}
}
