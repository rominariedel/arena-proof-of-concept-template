package ui;

import org.uqbar.commons.utils.Observable;

import domain.Modelo;

@Observable
public class ViewModelNuevaMateria {
	private Modelo modelo;
	public ViewModelNuevaMateria(Modelo modelo){
		this.modelo = modelo;
	}
}