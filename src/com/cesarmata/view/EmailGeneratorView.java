package com.cesarmata.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JInternalFrame;

import com.cesarmata.model.Nota;
import com.cesarmata.service.EmailGeneratorService;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
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
	private JTextField textField;
	private JScrollPane sclBancos;
	private JTable tblNota;
	
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
		frmGeneradorHtml.setBounds(100, 100, 812, 794);
		frmGeneradorHtml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGeneradorHtml.getContentPane().setLayout(null);
		
		JLabel lblCliente = new JLabel("* Cliente:");
		lblCliente.setBounds(50, 13, 69, 16);
		frmGeneradorHtml.getContentPane().add(lblCliente);
		
		txtCliente = new JTextField();
		txtCliente.setBounds(195, 10, 298, 22);
		frmGeneradorHtml.getContentPane().add(txtCliente);
		txtCliente.setColumns(10);
		
		// ------------------------------------------------ //
		
		// - - - - - Botón para agregar el texto al cuerpo  - - - - - //
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				agregar();
			}
		});
		btnAgregar.setBounds(396, 363, 97, 25);
		frmGeneradorHtml.getContentPane().add(btnAgregar);
		
		// - - - - - Botón para generar el archivo - - - - - //
		JButton btnGenerarArchivo = new JButton("Generar archivo");
		btnGenerarArchivo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				generarArchivo();
			}
		});
		btnGenerarArchivo.setBounds(609, 695, 141, 25);
		frmGeneradorHtml.getContentPane().add(btnGenerarArchivo);
		
		// ------------------------------------------------ //
		
		JLabel lblEncabezado = new JLabel("* Encabezado:");
		lblEncabezado.setBounds(50, 42, 88, 16);
		frmGeneradorHtml.getContentPane().add(lblEncabezado);
		
		txtEncabezado = new JTextField();
		txtEncabezado.setBounds(195, 39, 298, 22);
		frmGeneradorHtml.getContentPane().add(txtEncabezado);
		txtEncabezado.setColumns(10);
		
		JLabel lblFuente = new JLabel("* Fuente:");
		lblFuente.setBounds(50, 75, 56, 16);
		frmGeneradorHtml.getContentPane().add(lblFuente);
		
		txtFuente = new JTextField();
		txtFuente.setBounds(195, 72, 298, 22);
		frmGeneradorHtml.getContentPane().add(txtFuente);
		txtFuente.setColumns(10);
		
		JLabel lblSeccion = new JLabel("* Secci\u00F3n:");
		lblSeccion.setBounds(50, 110, 87, 16);
		frmGeneradorHtml.getContentPane().add(lblSeccion);
		
		txtSeccion = new JTextField();
		txtSeccion.setBounds(195, 107, 298, 22);
		frmGeneradorHtml.getContentPane().add(txtSeccion);
		txtSeccion.setColumns(10);
		
		JLabel lblAutor = new JLabel("* Autor:");
		lblAutor.setBounds(50, 145, 56, 16);
		frmGeneradorHtml.getContentPane().add(lblAutor);
		
		txtAutor = new JTextField();
		txtAutor.setBounds(195, 142, 298, 22);
		frmGeneradorHtml.getContentPane().add(txtAutor);
		txtAutor.setColumns(10);
		
		JLabel lblContenido = new JLabel("* Contenido:");
		lblContenido.setBounds(50, 250, 88, 16);
		frmGeneradorHtml.getContentPane().add(lblContenido);
		
		txtContenido = new JTextField();
		txtContenido.setBounds(195, 247, 298, 22);
		frmGeneradorHtml.getContentPane().add(txtContenido);
		txtContenido.setColumns(10);
		
		JLabel lblUrlNota = new JLabel("* Link de la nota:");
		lblUrlNota.setBounds(50, 285, 113, 16);
		frmGeneradorHtml.getContentPane().add(lblUrlNota);
		
		txtUrlFuente = new JTextField();
		txtUrlFuente.setBounds(195, 282, 298, 22);
		frmGeneradorHtml.getContentPane().add(txtUrlFuente);
		txtUrlFuente.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Link imagen:");
		lblNewLabel.setBounds(50, 320, 87, 16);
		frmGeneradorHtml.getContentPane().add(lblNewLabel);
		
		txtLinkImagen = new JTextField();
		txtLinkImagen.setBounds(195, 317, 298, 22);
		frmGeneradorHtml.getContentPane().add(txtLinkImagen);
		txtLinkImagen.setColumns(10);
		
		JLabel lblTirajes = new JLabel("Tiraje o impactos:");
		lblTirajes.setBounds(51, 180, 116, 16);
		frmGeneradorHtml.getContentPane().add(lblTirajes);
		
		txtTirajes = new JTextField();
		txtTirajes.setBounds(195, 177, 298, 22);
		frmGeneradorHtml.getContentPane().add(txtTirajes);
		txtTirajes.setColumns(10);
		
		JLabel lblAdEquivalence = new JLabel("Ad Equivalence:");
		lblAdEquivalence.setBounds(50, 215, 102, 16);
		frmGeneradorHtml.getContentPane().add(lblAdEquivalence);
		
		textField = new JTextField();
		textField.setBounds(195, 212, 298, 22);
		frmGeneradorHtml.getContentPane().add(textField);
		textField.setColumns(10);
		
		sclBancos = new JScrollPane();
		sclBancos.setBounds(66, 406, 684, 258);
		frmGeneradorHtml.getContentPane().add(sclBancos);
		
		tblNota = new JTable();
		tblNota.setModel(new DefaultTableModel(
			new String[][] {
				{"Cliente", null, null, null},
				{"Encabezado", "Fuente", "Sección", "Autor"},
				{"Tiraje", "Ad equivalence", "Contenido", null},
				{"Link nota", null, null, null},
				{"Link imagen", null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"-", "-", "-", "-"
			}
		));
		tblNota.getColumnModel().getColumn(0).setPreferredWidth(251);
		tblNota.getColumnModel().getColumn(1).setPreferredWidth(185);
		tblNota.getColumnModel().getColumn(2).setPreferredWidth(194);
		tblNota.getColumnModel().getColumn(3).setPreferredWidth(148);
		sclBancos.setViewportView(tblNota);
	}
	
	public void agregar() {
		tblNota.setValueAt(txtCliente.getText(), 0, 0);
		
		tblNota.setValueAt(txtEncabezado.getText(), 1, 0);
		tblNota.setValueAt(txtFuente.getText(), 1, 1);
		tblNota.setValueAt(txtSeccion.getText(), 1, 2);
		tblNota.setValueAt(txtAutor.getText(), 1, 3);
		
		tblNota.setValueAt("tiraje", 2, 0);
		tblNota.setValueAt("Ad. Equivalence", 2, 1);
		tblNota.setValueAt(txtContenido.getText(), 2, 2);
		
		tblNota.setValueAt(txtUrlFuente.getText(), 3, 0);
		
		tblNota.setValueAt(txtLinkImagen.getText(), 4, 0);
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
		
		emailGeneratorService.createTemplate(nota.getCliente(), nota.getEncabezado(), nota.getSeccion(), nota.getFuente(), nota.getAutor(), nota.getContenido(), nota.getUrlFuente(), nota.getLinkImagen());
		txtCliente.setText("");
		txtEncabezado.setText("");
		txtSeccion.setText("");
		txtFuente.setText("");
		txtAutor.setText("");
		txtContenido.setText("");
		txtUrlFuente.setText("");
		txtLinkImagen.setText("");
	}
}