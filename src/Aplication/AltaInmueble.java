package Aplication;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Class.Inmueble;
import Class.Vendedor;
import Controller.GestorInmueble;
import Controller.GestorVendedor;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;

public class AltaInmueble extends JFrame {

	private JPanel contentPane;
	private JTextField textProvincia;
	private JTextField textFieldNroCalle;
	private JTextField textBarrio;
	private JTextField textFieldOtraLocalidad;
	private JTextField textFieldOtraCalle;
	private JTextField textFieldPiso;
	private JTextField textFieldDepartamento;
	private JTextField textFieldPrecioVenta;
	private JTextField textFieldFrente;
	private JTextField textFieldFondo;
	private JTextField textFieldSuperficie;
	private JTextField textFieldBaños;
	private JTextField textFieldDormitorios;
	private JTextField textFieldAntiguedad;
	private GestorInmueble gestor= GestorInmueble.get();
	private JTextField textField;
	
	public AltaInmueble() {

		setTitle("Alta Inmueble");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 825);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(SystemColor.activeCaption);
		
		JLabel lblProvincia = new JLabel("Provincia:");
		
		JLabel lblLocalidad = new JLabel("Localidad:");
		
		JLabel lblCalle = new JLabel("Calle:");
		
		JLabel lblNroCalle = new JLabel("Nro: ");
		
		JLabel lblBarrio = new JLabel("Barrio");
		
		textProvincia = new JTextField();
		textProvincia.setColumns(10);
		
		textFieldNroCalle = new JTextField();
		textFieldNroCalle.setColumns(10);
		
		textBarrio = new JTextField();
		textBarrio.setColumns(10);
		
		JLabel lblOtraLocalidad = new JLabel("Otra localidad:");
		
		textFieldOtraLocalidad = new JTextField();
		textFieldOtraLocalidad.setColumns(10);
		
		JComboBox comboBoxLocalidades = new JComboBox();
		
		JComboBox comboBoxCalles = new JComboBox();
		
		textFieldOtraCalle = new JTextField();
		textFieldOtraCalle.setColumns(10);
		
		JLabel lblOtraCalle = new JLabel("Otra calle:");
		
		JLabel lblPiso = new JLabel("Piso:");
		
		textFieldPiso = new JTextField();
		textFieldPiso.setColumns(10);
		
		JLabel lblDepartamento = new JLabel("Departamento:");
		
		textFieldDepartamento = new JTextField();
		textFieldDepartamento.setColumns(10);
		
		JLabel lblTipoInmueble = new JLabel("Tipo de Inmueble:");
		
		JComboBox comboBoxTipoInmueble = new JComboBox();
		
		JLabel lblPrecioVenta = new JLabel("Precio de Venta USD$:");
		
		textFieldPrecioVenta = new JTextField();
		textFieldPrecioVenta.setColumns(10);
		
		JLabel lblOrientacion = new JLabel("Orientaci\u00F3n:");
		
		JComboBox comboBoxOrientacion = new JComboBox();
		
		JLabel lblFrente = new JLabel("Frente (m):");
		
		textFieldFrente = new JTextField();
		textFieldFrente.setColumns(10);
		
		JLabel lblFondo = new JLabel("Fondo (m):");
		
		textFieldFondo = new JTextField();
		textFieldFondo.setColumns(10);
		
		JLabel lblSuperficie = new JLabel("Superficie del Terreno (m2):");
		
		textFieldSuperficie = new JTextField();
		textFieldSuperficie.setColumns(10);
		
		JButton btnVerImagenInmueble = new JButton("Cargar Imagen");
		
		JScrollBar scrollBar = new JScrollBar();
		
		JLabel lblFechaDeCarga = new JLabel("Fecha de Carga:");
		
		JLabel lblDormitorios = new JLabel("Cantidad de dormitorios:");
		
		textFieldBaños = new JTextField();
		textFieldBaños.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldBaños.setColumns(10);
		
		JLabel lblBaños = new JLabel("Cantidad de ba\u00F1os:");
		
		JCheckBox chckbxPavimento = new JCheckBox("Pavimento");
		chckbxPavimento.setBackground(SystemColor.activeCaption);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		
		JTextArea textObservaciones = new JTextArea();
		
		textFieldDormitorios = new JTextField();
		textFieldDormitorios.setColumns(10);
		
		JLabel lblAntiguedad = new JLabel("Antiguedad:");
		
		textFieldAntiguedad = new JTextField();
		textFieldAntiguedad.setColumns(10);
		
		JButton btnPrevisualizarImagen = new JButton("Previsualizar Imagen");
		
		JButton btnCrearInmueble = new JButton("Crear Inmueble");
		btnCrearInmueble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				if(gestor.validacionVacios((Propietario) comboBoxPropietarios.getSelectedItem(), 
//						textFechaCarga.getText(), textProvincia.getText(), 
//						comboBoxLocalidades.getSelectedItem().toString(), comboBoxCalles.getSelectedItem().toString(), 
//						textFieldNroCalle.getText(), comboBoxTipoInmueble.getSelectedItem().toString(), 
//						textFieldPrecioVenta.getText())) {
//					Inmueble i=new Inmueble (textNombre.getText(), textApellido.getText(),
//							Long.parseLong(textDni.getText()), textUsuario.getText(), textClave.getText(), 
//							textEmail.getText(), false);
//					
//					try {
//						gv.crearVendedor(v);
//						mensajeExitosoDeAlta();
//						//volvemos a la pantalla anterior
//						VendedorABM vendedorABM = new VendedorABM();
//						vendedorABM.setVisible(true);
//						vendedorABM.setLocationRelativeTo(null);
//						dispose();
//					} catch (Exception e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//						informarErrorDeAlta();
//					}
//					
//					
//				}else informarErrorDeAlta();
//				//Mensaje 
//				
			}
		});
		
		
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InmuebleABM inmuebleABM = new InmuebleABM();
				inmuebleABM.setVisible(true);
				inmuebleABM.setLocationRelativeTo(null);
				dispose();
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(SystemColor.inactiveCaption);
		
		textField = new JTextField();
		textField.setText("2021-12-08");
		textField.setEditable(false);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(SystemColor.activeCaption);
		
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addContainerGap()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addComponent(lblBaños, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED))
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_1.createSequentialGroup()
													.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
														.addComponent(lblSuperficie, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
														.addGroup(gl_panel_1.createSequentialGroup()
															.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
																	.addComponent(lblCalle, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
																	.addComponent(lblNroCalle, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
																	.addComponent(lblBarrio, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
																	.addComponent(lblLocalidad, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																	.addComponent(lblProvincia))
																.addComponent(lblTipoInmueble, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
																.addComponent(lblOrientacion, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
															.addPreferredGap(ComponentPlacement.RELATED)
															.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
																	.addGroup(gl_panel_1.createSequentialGroup()
																		.addComponent(textFieldNroCalle, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(ComponentPlacement.UNRELATED)
																		.addComponent(lblPiso)
																		.addPreferredGap(ComponentPlacement.UNRELATED)
																		.addComponent(textFieldPiso, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
																	.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
																		.addComponent(comboBoxLocalidades, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																		.addComponent(comboBoxCalles, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
																	.addComponent(textBarrio, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
																	.addComponent(comboBoxTipoInmueble, 0, 141, Short.MAX_VALUE)
																	.addComponent(comboBoxOrientacion, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
																	.addComponent(textFieldSuperficie, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
																	.addComponent(textFieldBaños, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
																.addComponent(textProvincia, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
															.addGap(32)
															.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_panel_1.createSequentialGroup()
																	.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
																		.addComponent(lblOtraCalle, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
																		.addComponent(lblDepartamento, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
																	.addGap(35)
																	.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
																		.addComponent(textFieldOtraLocalidad, Alignment.LEADING)
																		.addComponent(textFieldDepartamento, Alignment.LEADING)
																		.addComponent(textFieldOtraCalle, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
																		.addComponent(textField, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
																	.addGap(8))
																.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
																	.addGroup(gl_panel_1.createSequentialGroup()
																		.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
																			.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
																				.addComponent(lblAntiguedad, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																				.addComponent(lblFrente, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
																				.addComponent(lblFondo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
																			.addComponent(lblDormitorios, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
																			.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
																				.addComponent(lblFechaDeCarga, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																				.addComponent(lblPrecioVenta, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
																			.addComponent(textFieldPrecioVenta, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
																			.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
																				.addGroup(gl_panel_1.createSequentialGroup()
																					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
																						.addComponent(textFieldFrente, 94, 125, Short.MAX_VALUE)
																						.addComponent(textFieldAntiguedad, 94, 125, Short.MAX_VALUE)
																						.addGroup(gl_panel_1.createSequentialGroup()
																							.addGap(1)
																							.addComponent(textFieldDormitorios, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
																					.addGap(8))
																				.addComponent(textFieldFondo, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))))
																	.addComponent(lblOtraLocalidad)))))
													.addGap(145))
												.addGroup(gl_panel_1.createSequentialGroup()
													.addComponent(panel, GroupLayout.PREFERRED_SIZE, 567, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)))
											.addComponent(chckbxPavimento, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
											.addGap(1))))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(42)
									.addComponent(lblObservaciones, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textObservaciones, GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_panel_1.createSequentialGroup()
								.addContainerGap()
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 567, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnVerImagenInmueble, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnPrevisualizarImagen, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCrearInmueble, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addGap(285)))
					.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
										.addComponent(textProvincia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblProvincia)
										.addComponent(lblFechaDeCarga))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblLocalidad)
										.addComponent(comboBoxLocalidades, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(comboBoxCalles, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblCalle))
									.addGap(18)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
										.addComponent(textFieldNroCalle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblPiso)
										.addComponent(textFieldPiso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNroCalle)
										.addComponent(lblDepartamento)))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addComponent(lblOtraLocalidad)
											.addGap(18)
											.addComponent(lblOtraCalle))
										.addGroup(gl_panel_1.createSequentialGroup()
											.addComponent(textFieldOtraLocalidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(textFieldOtraCalle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(textFieldDepartamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
							.addGap(18)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(textBarrio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblBarrio))
							.addGap(24)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
										.addComponent(comboBoxTipoInmueble, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTipoInmueble))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
										.addComponent(comboBoxOrientacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblOrientacion))
									.addGap(15)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblSuperficie)
										.addComponent(textFieldSuperficie, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblBaños)
										.addComponent(textFieldBaños, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
											.addComponent(lblPrecioVenta, GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE))
										.addComponent(textFieldPrecioVenta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
										.addComponent(textFieldFrente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblFrente))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblAntiguedad)
										.addComponent(textFieldAntiguedad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblFondo)
										.addComponent(textFieldFondo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(textFieldDormitorios, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblDormitorios))))
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(34)
									.addComponent(chckbxPavimento))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(18)
									.addComponent(panel, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblObservaciones, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
								.addComponent(textObservaciones, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
							.addGap(33)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnVerImagenInmueble)
								.addComponent(btnPrevisualizarImagen)
								.addComponent(btnCrearInmueble)
								.addComponent(btnCancelar))
							.addGap(53))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(scrollBar, GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
							.addContainerGap())))
		);
		
		JLabel lblPropietarios = new JLabel("Propietario:");
		
		JComboBox comboBoxPropietarios = new JComboBox();
		
		JButton btnNewButton = new JButton(" Buscar");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(40)
					.addComponent(lblPropietarios)
					.addGap(31)
					.addComponent(comboBoxPropietarios, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(15)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPropietarios)
						.addComponent(comboBoxPropietarios, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton)))
		);
		panel_2.setLayout(gl_panel_2);
		
		JCheckBox chckbxTelefono = new JCheckBox("Tel\u00E9fono");
		chckbxTelefono.setBackground(SystemColor.inactiveCaption);
		
		JCheckBox chckbxLavadero = new JCheckBox("Lavadero");
		chckbxLavadero.setBackground(SystemColor.inactiveCaption);
		
		JCheckBox chckbxGasNatural = new JCheckBox("Gas Natural");
		chckbxGasNatural.setBackground(SystemColor.inactiveCaption);
		
		JCheckBox chckbxAguaCaliente = new JCheckBox("Agua Caliente");
		chckbxAguaCaliente.setBackground(SystemColor.inactiveCaption);
		
		JCheckBox chckbxPropiedadHorizontal = new JCheckBox("Propiedad Horizontal");
		chckbxPropiedadHorizontal.setBackground(SystemColor.inactiveCaption);
		
		JCheckBox chckbxCochera = new JCheckBox("Cochera");
		chckbxCochera.setBackground(SystemColor.inactiveCaption);
		
		JCheckBox chckbxGarage = new JCheckBox("Garage");
		chckbxGarage.setBackground(SystemColor.inactiveCaption);
		
		JCheckBox chckbxAguaCorriente = new JCheckBox("Agua Corriente");
		chckbxAguaCorriente.setBackground(SystemColor.inactiveCaption);
		
		JCheckBox chckbxPatio = new JCheckBox("Patio");
		chckbxPatio.setBackground(SystemColor.inactiveCaption);
		
		JCheckBox chckbxPiscina = new JCheckBox("Piscina");
		chckbxPiscina.setBackground(SystemColor.inactiveCaption);
		
		JCheckBox chckbxCloacas = new JCheckBox("Clocacas");
		chckbxCloacas.setBackground(SystemColor.inactiveCaption);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(63)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxPropiedadHorizontal)
						.addComponent(chckbxCochera, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxGarage, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxAguaCorriente, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxGasNatural, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.addComponent(chckbxAguaCaliente, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
							.addGap(18))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxTelefono, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.addComponent(chckbxLavadero, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(chckbxPatio, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxPiscina, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxCloacas, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(8, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(23)
							.addComponent(chckbxPiscina)
							.addComponent(chckbxCloacas))
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(chckbxPropiedadHorizontal)
								.addComponent(chckbxCochera)
								.addComponent(chckbxGarage)
								.addComponent(chckbxAguaCorriente))
							.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(chckbxTelefono)
										.addComponent(chckbxLavadero))
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(chckbxPatio)
										.addGap(18)))
								.addComponent(chckbxGasNatural)
								.addComponent(chckbxAguaCaliente))))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 601, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 731, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void informarErrorDeAlta() {
		
		JOptionPane.showMessageDialog(null, "No se pudo dar de alta el inmueble. Verifique que todos los campos esten correctos.");
		
	}
	public void mensajeExitosoDeAlta()
	{
		JOptionPane.showMessageDialog(null, "Inmueble dado de alta con exito.");
	}
}
