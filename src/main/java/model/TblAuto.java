package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_auto database table.
 * 
 */
@Entity
@Table(name="tbl_auto")
@NamedQuery(name="TblAuto.findAll", query="SELECT t FROM TblAuto t")
public class TblAuto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idauto;

	private String color;

	private String marca;

	private String modelo;

	private String motor;

	@Column(name="NRO_TARJE")
	private String nroTarje;

	public TblAuto() {
	}

	public int getIdauto() {
		return this.idauto;
	}

	public void setIdauto(int idauto) {
		this.idauto = idauto;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMotor() {
		return this.motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getNroTarje() {
		return this.nroTarje;
	}

	public void setNroTarje(String nroTarje) {
		this.nroTarje = nroTarje;
	}

}