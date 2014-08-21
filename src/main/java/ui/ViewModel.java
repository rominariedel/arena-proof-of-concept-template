package ui;

import java.util.Date;
import domain.Modelo;
import org.uqbar.commons.utils.Observable;

@Observable
public class ViewModel {

  private Modelo modelo;
  private Date fecha;
  private String descripcion;
  private Boolean aprobado;
	
  public ViewModel(Modelo modelo) {
    this.modelo = modelo;
  }
  
  public Date getFecha(){
	  return this.fecha;
  }
  
  public void setFecha(Date fecha)
  {
	  this.fecha = fecha;
  }

  public String getDescripcion(){
	  return this.descripcion;
  }
  
  public void setDescripcion(String descripcion)
  {
	  this.descripcion = descripcion;
  }
  
  public Boolean getAprobado(){
	  return this.aprobado;
  }
  
  public void setAprobado(Boolean aprobado)
  {
	  this.aprobado = aprobado;
  }
  
}
