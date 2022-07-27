package cl.talentoDigital.modelo;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="SQ_PASAJERO", initialValue=1, allocationSize=1,sequenceName ="SQ_PASAJERO")// esto solo para los de oracle
public class Pasajero {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SQ_PASAJERO")
	private Integer id;
	private String rut;
	private String nombre;
	private String apellido;
	private Integer edad;
	private String ciudadNatal;
	@OneToMany(mappedBy="pasajero")
	private List<Destino> listaDestino;
	
	public Pasajero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pasajero(Integer id, String rut, String nombre, String apellido, Integer edad, String ciudadNatal,
			ArrayList<Destino> listaDestino) {
		super();
		this.id = id;
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.ciudadNatal = ciudadNatal;
		this.listaDestino = listaDestino;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCiudadNatal() {
		return ciudadNatal;
	}

	public void setCiudadNatal(String ciudadNatal) {
		this.ciudadNatal = ciudadNatal;
	}

	public List<Destino> getListaDestino() {
		return listaDestino;
	}

	public void setListaDestino(List<Destino> listaDestino) {
		this.listaDestino = listaDestino;
	}

	@Override
	public String toString() {
		return "Pasajero [id=" + id + ", rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", edad="
				+ edad + ", ciudadNatal=" + ciudadNatal + ", listaDestino=" + listaDestino + "]";
	}
	
	
}