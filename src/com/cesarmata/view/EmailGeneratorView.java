package com.cesarmata.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.cesarmata.model.Nota;
import com.cesarmata.service.EmailGeneratorService;

import javax.swing.JButton;
/**
 * @author Cesar Mata.
 *
 */
public class EmailGeneratorView {

	private JFrame frmGeneradorHtml;
	private JTextField txtCliente;
	
	Nota nota = new Nota();

	EmailGeneratorService emailGeneratorService = new EmailGeneratorService();
	private JTextField txtEncabezado;
	private JTextField txtFuente;
	private JTextField txtSeccion;
	private JTextField txtAutor;
	private JTextField txtUrlFuente;
	private JTextField txtLinkImagen;
	private JTextField txtContenido;
	private JTextField txtTirajes;
	private JTextField txtAdEquivalence;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmailGeneratorView window = new EmailGeneratorView();
					window.frmGeneradorHtml.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmailGeneratorView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGeneradorHtml = new JFrame();
		frmGeneradorHtml.setTitle("Generador html");
		frmGeneradorHtml.setBounds(100, 100, 610, 683);
		frmGeneradorHtml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGeneradorHtml.getContentPane().setLayout(null);
		
		JLabel lblCliente = new JLabel("* Cliente:");
		lblCliente.setBounds(51, 40, 69, 16);
		frmGeneradorHtml.getContentPane().add(lblCliente);
		
		txtCliente = new JTextField();
		txtCliente.setBounds(195, 37, 298, 22);
		frmGeneradorHtml.getContentPane().add(txtCliente);
		txtCliente.setColumns(10);
		
		JButton btnGenerarArchivo = new JButton("Generar archivo");
		btnGenerarArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				generarArchivo();
			}
		});
		btnGenerarArchivo.setBounds(405, 578, 141, 25);
		frmGeneradorHtml.getContentPane().add(btnGenerarArchivo);
		
		JLabel lblEncabezado = new JLabel("* Encabezado:");
		lblEncabezado.setBounds(50, 82, 88, 16);
		frmGeneradorHtml.getContentPane().add(lblEncabezado);
		
		txtEncabezado = new JTextField();
		txtEncabezado.setBounds(195, 76, 298, 22);
		frmGeneradorHtml.getContentPane().add(txtEncabezado);
		txtEncabezado.setColumns(10);
		
		JLabel lblFuente = new JLabel("* Fuente:");
		lblFuente.setBounds(51, 126, 56, 16);
		frmGeneradorHtml.getContentPane().add(lblFuente);
		
		txtFuente = new JTextField();
		txtFuente.setBounds(195, 123, 298, 22);
		frmGeneradorHtml.getContentPane().add(txtFuente);
		txtFuente.setColumns(10);
		
		JLabel lblSeccion = new JLabel("* Secci\u00F3n:");
		lblSeccion.setBounds(51, 176, 87, 16);
		frmGeneradorHtml.getContentPane().add(lblSeccion);
		
		txtSeccion = new JTextField();
		txtSeccion.setBounds(195, 173, 298, 22);
		frmGeneradorHtml.getContentPane().add(txtSeccion);
		txtSeccion.setColumns(10);
		
		JLabel lblAutor = new JLabel("* Autor:");
		lblAutor.setBounds(51, 226, 56, 16);
		frmGeneradorHtml.getContentPane().add(lblAutor);
		
		txtAutor = new JTextField();
		txtAutor.setBounds(195, 223, 298, 22);
		frmGeneradorHtml.getContentPane().add(txtAutor);
		txtAutor.setColumns(10);
		
		JLabel lblContenido = new JLabel("* Contenido:");
		lblContenido.setBounds(50, 411, 88, 16);
		frmGeneradorHtml.getContentPane().add(lblContenido);
		
		txtContenido = new JTextField();
		txtContenido.setBounds(195, 408, 298, 22);
		frmGeneradorHtml.getContentPane().add(txtContenido);
		txtContenido.setColumns(10);
		
		JLabel lblUrlNota = new JLabel("* Link de la nota:");
		lblUrlNota.setBounds(54, 465, 113, 16);
		frmGeneradorHtml.getContentPane().add(lblUrlNota);
		
		txtUrlFuente = new JTextField();
		txtUrlFuente.setBounds(195, 462, 298, 22);
		frmGeneradorHtml.getContentPane().add(txtUrlFuente);
		txtUrlFuente.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Link imagen:");
		lblNewLabel.setBounds(51, 524, 87, 16);
		frmGeneradorHtml.getContentPane().add(lblNewLabel);
		
		txtLinkImagen = new JTextField();
		txtLinkImagen.setBounds(195, 521, 298, 22);
		frmGeneradorHtml.getContentPane().add(txtLinkImagen);
		txtLinkImagen.setColumns(10);
		
		JLabel lblTirajes = new JLabel("Tiraje o impactos:");
		lblTirajes.setBounds(51, 294, 116, 16);
		frmGeneradorHtml.getContentPane().add(lblTirajes);
		
		txtTirajes = new JTextField();
		txtTirajes.setBounds(195, 291, 298, 22);
		frmGeneradorHtml.getContentPane().add(txtTirajes);
		txtTirajes.setColumns(10);
		
		JLabel lblAdEquivalence = new JLabel("Ad Equivalence:");
		lblAdEquivalence.setBounds(51, 365, 102, 16);
		frmGeneradorHtml.getContentPane().add(lblAdEquivalence);
		
		txtAdEquivalence = new JTextField();
		txtAdEquivalence.setBounds(195, 362, 298, 22);
		frmGeneradorHtml.getContentPane().add(txtAdEquivalence);
		txtAdEquivalence.setColumns(10);
		
	}
	
	public void generarArchivo () {
		nota.setCliente(txtCliente.getText()); 
		nota.setEncabezado(txtEncabezado.getText());
		nota.setSeccion(txtSeccion.getText());
		nota.setFuente(txtFuente.getText());
		nota.setAutor(txtAutor.getText());
		nota.setContenido(txtContenido.getText());
		nota.setUrlFuente(txtUrlFuente.getText());
		nota.setLinkImagen(txtLinkImagen.getText());
		nota.setTiraje(txtTirajes.getText());
		nota.setAdEquivalence(txtAdEquivalence.getText());
		
		emailGeneratorService.createTemplate(nota.getCliente(), nota.getEncabezado(), nota.getSeccion(), nota.getFuente(), nota.getAutor(), nota.getContenido(), nota.getUrlFuente(), nota.getLinkImagen(), nota.getTiraje(), nota.getAdEquivalence());
		txtCliente.setText("");
		txtEncabezado.setText("");
		txtSeccion.setText("");
		txtFuente.setText("");
		txtAutor.setText("");
		txtTirajes.setText("");
		txtAdEquivalence.setText("");
		txtContenido.setText("");
		txtUrlFuente.setText("");
		txtLinkImagen.setText("");
	}
}