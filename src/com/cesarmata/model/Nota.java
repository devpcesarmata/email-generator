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
	
	public Nota() {
		
	}
	
	public Nota (String cliente, String encabezado, String fuente, String seccion, String autor, String contenido, String urlFuente, String linkImagen) {
		this.cliente = cliente;
		this.encabezado = encabezado;
		this.fuente = fuente;
		this.seccion = seccion;
		this.autor = autor;
		this.contenido = contenido;
		this.urlFuente = urlFuente;
		this.linkImagen = linkImagen;
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
	
}