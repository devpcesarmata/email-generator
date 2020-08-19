/**
 * 
 */
package com.cesarmata.model;

/**
 * @author Cesar Mata.
 *
 */
public class Nota {
	private String cliente;
	private String encabezado;
	private String fuente;
	private String seccion;
	private String autor;
	private String contenido;
	private String urlFuente;
	private String linkImagen;
	private String nota;
	
	private String tiraje;
	private String adEquivalence;
	
	public Nota() {
		
	}
	
	public Nota(String nota) {
		this.nota = nota;
	}
	
	public Nota (String cliente, String encabezado, String fuente, String seccion, String autor, String contenido, String urlFuente, String linkImagen, String tiraje, String adEquivalence) {
		this.cliente = cliente;
		this.encabezado = encabezado;
		this.fuente = fuente;
		this.seccion = seccion;
		this.autor = autor;
		this.contenido = contenido;
		this.urlFuente = urlFuente;
		this.linkImagen = linkImagen;
		this.tiraje = tiraje;
		this.adEquivalence = adEquivalence;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getEncabezado() {
		return encabezado;
	}

	public void setEncabezado(String encabezado) {
		this.encabezado = encabezado;
	}

	public String getFuente() {
		return fuente;
	}

	public void setFuente(String fuente) {
		this.fuente = fuente;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getUrlFuente() {
		return urlFuente;
	}

	public void setUrlFuente(String urlFuente) {
		this.urlFuente = urlFuente;
	}

	public String getLinkImagen() {
		return linkImagen;
	}

	public void setLinkImagen(String linkImagen) {
		this.linkImagen = linkImagen;
	}
	
	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public String getTiraje() {
		return tiraje;
	}

	public void setTiraje(String tiraje) {
		this.tiraje = tiraje;
	}

	public String getAdEquivalence() {
		return adEquivalence;
	}

	public void setAdEquivalence(String adEquivalence) {
		this.adEquivalence = adEquivalence;
	}

	@Override
	public String toString() {
		return "Nota [cliente=" + cliente + ", encabezado=" + encabezado + ", fuente=" + fuente + ", seccion=" + seccion
				+ ", autor=" + autor + ", contenido=" + contenido + ", urlFuente=" + urlFuente + ", linkImagen="
				+ linkImagen + ", nota=" + nota + ", tiraje=" + tiraje + ", adEquivalence=" + adEquivalence + "]";
	}
	
}