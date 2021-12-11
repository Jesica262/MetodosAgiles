package Aplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Class.Inmueble;
import Class.Propietario;
import Class.Vendedor;
import Controller.GestorInmueble;
import Controller.GestorPropietario;
import Controller.GestorVendedor;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.time.LocalDate;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;

public class AltaInmueble extends JFrame {

	private JPanel contentPane;
	private JTextField textProvincia;
	private JTextField textFieldNroCalle;
	private JTextField textBarrio;
	private JTextField textFieldLocalidad;
	private JTextField textFieldCalle;
	private JTextField textFieldDepartamento;
	private JTextField textFieldPrecioVenta;
	private JTextField textFieldFrente;
	private JTextField textFieldFondo;
	private JTextField textFieldSuperficie;
	private JTextField textFieldBaños;
	private JTextField textFieldDormitorios;
	private JTextField textFieldAntiguedad;
	private GestorInmueble gestor= GestorInmueble.get();
	private GestorPropietario gestorPropietario = new GestorPropietario();
	private JTextField textFechaCarga;
	private JTextField textFieldSuperficieEdificada;
	ImageIcon imagen=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaInmueble frame = new AltaInmueble();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AltaInmueble() {
		setTitle("Alta Inmueble");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 825);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		
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
		
		textFieldLocalidad = new JTextField();
		textFieldLocalidad.setColumns(10);
		
		textFieldCalle = new JTextField();
		textFieldCalle.setColumns(10);
		
		JLabel lblDepartamento = new JLabel("Departamento:");
		
		textFieldDepartamento = new JTextField();
		textFieldDepartamento.setColumns(10);
		
		JLabel lblTipoInmueble = new JLabel("Tipo de Inmueble:");
		
		JComboBox<String> comboBoxTipoInmueble = new JComboBox<String>();
		comboBoxTipoInmueble.addItem("L");
		comboBoxTipoInmueble.addItem("C");
		comboBoxTipoInmueble.addItem("D");
		comboBoxTipoInmueble.addItem("T");
		comboBoxTipoInmueble.addItem("Q");
		comboBoxTipoInmueble.addItem("G");
		
		JLabel lblPrecioVenta = new JLabel("Precio de Venta:");
		
		textFieldPrecioVenta = new JTextField();
		textFieldPrecioVenta.setColumns(10);
		
		JLabel lblUSD = new JLabel("USD$");
		
		JLabel lblOrientacion = new JLabel("Orientaci\u00F3n:");
		
		JComboBox<String> comboBoxOrientacion = new JComboBox<String>();
		comboBoxOrientacion.addItem("ESTE");
		comboBoxOrientacion.addItem("OESTE");
		comboBoxOrientacion.addItem("NORTE");
		comboBoxOrientacion.addItem("SUR");
		
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
		btnVerImagenInmueble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser file = new JFileChooser();
				file.showOpenDialog(new JFrame());
				File archivo = file.getSelectedFile();
				if(archivo!=null) {
					String origen = archivo.getPath();
					imagen = new ImageIcon(origen);
					
				}
				
				
			}
		});
		
		JScrollBar scrollBar = new JScrollBar();
		
		JLabel lblFechaDeCarga = new JLabel("Fecha de Carga:");
		
		JLabel lblPropietarios = new JLabel("Propietario:");
		
		
		JComboBox<Propietario> comboBoxPropietarios = new JComboBox<Propietario>();
		try {
			List<Propietario> listaPropietarios = gestorPropietario.buscarTodos();
			for(Propietario p : listaPropietarios) comboBoxPropietarios.addItem(p);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			mensajeErrorAlCargarPropietarios();
		}
		
		JCheckBox chckbxPropiedadHorizontal = new JCheckBox("Propiedad Horizontal");
		
		JCheckBox chckbxPatio = new JCheckBox("Patio");
		
		JCheckBox chckbxCochera = new JCheckBox("Cochera");
		
		JCheckBox chckbxCloacas = new JCheckBox("Clocacas");
		
		JCheckBox chckbxGarage = new JCheckBox("Garage");
		
		JCheckBox chckbxPiscina = new JCheckBox("Piscina");
		
		JCheckBox chckbxAguaCorriente = new JCheckBox("Agua Corriente");
		
		JCheckBox chckbxLavadero = new JCheckBox("Lavadero");
		
		JLabel lblDormitorios = new JLabel("Cantidad de dormitorios:");
		
		textFieldBaños = new JTextField();
		textFieldBaños.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldBaños.setColumns(10);
		
		JLabel lblBaños = new JLabel("Cantidad de ba\u00F1os:");
		
		JCheckBox chckbxAguaCaliente = new JCheckBox("Agua Caliente");
		
		JCheckBox chckbxGasNatural = new JCheckBox("Gas Natural");
		
		JCheckBox chckbxPavimento = new JCheckBox("Pavimento");
		
		JCheckBox chckbxTelefono = new JCheckBox("Tel\u00E9fono");
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		
		JTextArea textObservaciones = new JTextArea();
		
		textFechaCarga = new JTextField();
		textFechaCarga.setEditable(false);
		textFechaCarga.setText(LocalDate.now().toString());
		textFechaCarga.setColumns(10);
		
		textFieldDormitorios = new JTextField();
		textFieldDormitorios.setColumns(10);
		
		JLabel lblAntiguedad = new JLabel("Antiguedad:");
		
		textFieldAntiguedad = new JTextField();
		textFieldAntiguedad.setColumns(10);
		
		JButton btnPrevisualizarImagen = new JButton("Previsualizar Imagen");
		btnPrevisualizarImagen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(imagen!=null) {
					MostrarFoto foto= new MostrarFoto(imagen);
					foto.setVisible(true);
					foto.setLocationRelativeTo(null);
				}else JOptionPane.showMessageDialog(null,"No existe imagen cargada.");
			}
		});
		
		
		
		
		JButton btnCrearInmueble = new JButton("Crear Inmueble");
		btnCrearInmueble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(gestor.validacionVacios(comboBoxPropietarios.getSelectedItem().toString(), textFechaCarga.getText(), 
						textProvincia.getText(), textFieldLocalidad.getText(), textFieldCalle.getText(), textFieldNroCalle.getText(), 
						comboBoxTipoInmueble.getSelectedItem().toString(), textFieldPrecioVenta.getText())) {
					
					Inmueble i = new Inmueble(LocalDate.now(),"ALTO",textProvincia.getText(),textFieldLocalidad.getText(),
							textFieldCalle.getText(),Integer.parseInt(textFieldNroCalle.getText()),
							textFieldDepartamento.getText(),textBarrio.getText(),comboBoxTipoInmueble.getSelectedItem().toString(),
							Float.parseFloat(textFieldPrecioVenta.getText()),comboBoxOrientacion.getSelectedItem().toString(),
							Float.parseFloat(textFieldFrente.getText()),Float.parseFloat(textFieldFondo.getText()), 
							Float.parseFloat(textFieldSuperficie.getText()), chckbxPropiedadHorizontal.isSelected(), 
							Float.parseFloat(textFieldSuperficieEdificada.getText()), 
							Integer.parseInt(textFieldAntiguedad.getText()), Integer.parseInt(textFieldDormitorios.getText()), 
							Integer.parseInt(textFieldBaños.getText()), chckbxCochera.isSelected() , chckbxPatio.isSelected(), 
							chckbxPiscina.isSelected(), chckbxAguaCorriente.isSelected(), chckbxCloacas.isSelected(), 
							chckbxGasNatural.isSelected(),chckbxAguaCaliente.isSelected(), 
							chckbxTelefono.isSelected(), chckbxLavadero.isSelected(), chckbxPavimento.isSelected(), 
							textObservaciones.getText(),false, false,false, (Propietario) comboBoxPropietarios.getSelectedItem());
					
					try {
						gestor.crearInmueble(i);
						mensajeExitosoDeAlta();
						InmuebleABM abm= new InmuebleABM();
						abm.setVisible(true);
						abm.setLocationRelativeTo(null);
						dispose();
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						informarErrorDeAlta();
					}
					
					
				}else informarErrorDeAlta();
				

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
		
		textFieldSuperficieEdificada = new JTextField();
		textFieldSuperficieEdificada.setColumns(10);
		
		JCheckBox chckbxtelefono = new JCheckBox("telefono");
		
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_1.createSequentialGroup()
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel_1.createSequentialGroup()
										.addContainerGap()
										.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_panel_1.createSequentialGroup()
												.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
													.addGroup(gl_panel_1.createSequentialGroup()
														.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
															.addComponent(lblLocalidad, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
															.addComponent(lblCalle, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
															.addComponent(lblProvincia)
															.addComponent(lblFechaDeCarga)
															.addComponent(lblPropietarios, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
														.addGap(22))
													.addGroup(gl_panel_1.createSequentialGroup()
														.addComponent(lblSuperficie, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addPreferredGap(ComponentPlacement.RELATED)))
												.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
													.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
														.addComponent(comboBoxPropietarios, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
														.addGroup(gl_panel_1.createSequentialGroup()
															.addPreferredGap(ComponentPlacement.RELATED)
															.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_panel_1.createSequentialGroup()
																	.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
																		.addComponent(textFieldCalle, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
																		.addGroup(gl_panel_1.createSequentialGroup()
																			.addComponent(comboBoxTipoInmueble, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																			.addPreferredGap(ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
																			.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
																				.addGroup(gl_panel_1.createSequentialGroup()
																					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
																						.addComponent(lblNroCalle, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
																						.addGroup(gl_panel_1.createSequentialGroup()
																							.addComponent(lblDepartamento, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
																							.addPreferredGap(ComponentPlacement.RELATED)
																							.addComponent(textFieldDepartamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
																					.addPreferredGap(ComponentPlacement.UNRELATED)
																					.addComponent(textFieldNroCalle, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
																				.addGroup(gl_panel_1.createSequentialGroup()
																					.addGap(55)
																					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
																						.addComponent(lblAntiguedad, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
																						.addGroup(gl_panel_1.createSequentialGroup()
																							.addComponent(lblPrecioVenta, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
																							.addPreferredGap(ComponentPlacement.RELATED)
																							.addComponent(textFieldPrecioVenta, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
																						.addComponent(chckbxtelefono))
																					.addPreferredGap(ComponentPlacement.RELATED)
																					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
																						.addComponent(textFieldAntiguedad, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
																						.addComponent(lblUSD, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))))
																			.addPreferredGap(ComponentPlacement.RELATED))
																		.addComponent(comboBoxOrientacion, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
																	.addGap(175))
																.addGroup(gl_panel_1.createSequentialGroup()
																	.addGap(10)
																	.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
																		.addComponent(textFieldSuperficieEdificada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(textFieldSuperficie, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
																	.addGap(455)))
															.addGap(59)
															.addComponent(lblFondo, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(textFieldFondo, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
														.addComponent(textProvincia, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
														.addComponent(textFechaCarga, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
													.addGroup(gl_panel_1.createSequentialGroup()
														.addGap(36)
														.addComponent(textFieldLocalidad, 148, 148, 148))))
											.addGroup(gl_panel_1.createSequentialGroup()
												.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
													.addComponent(chckbxPropiedadHorizontal)
													.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
														.addComponent(chckbxCochera, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
														.addComponent(chckbxGarage, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
														.addComponent(chckbxAguaCorriente, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
														.addGroup(gl_panel_1.createSequentialGroup()
															.addComponent(lblBaños)
															.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
															.addComponent(textFieldBaños, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))))
												.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
													.addGroup(gl_panel_1.createSequentialGroup()
														.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
															.addGroup(gl_panel_1.createSequentialGroup()
																.addGap(36)
																.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
																	.addComponent(chckbxCloacas, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
																	.addComponent(chckbxPiscina, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
																	.addComponent(chckbxLavadero, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
																	.addComponent(chckbxPatio, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)))
															.addGroup(gl_panel_1.createSequentialGroup()
																.addGap(18)
																.addComponent(lblDormitorios)))
														.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
															.addGroup(gl_panel_1.createSequentialGroup()
																.addPreferredGap(ComponentPlacement.RELATED, 375, Short.MAX_VALUE)
																.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
																	.addComponent(chckbxAguaCaliente, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
																	.addComponent(chckbxGasNatural, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
																	.addComponent(chckbxTelefono, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
																	.addComponent(chckbxPavimento, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)))
															.addGroup(gl_panel_1.createSequentialGroup()
																.addPreferredGap(ComponentPlacement.RELATED)
																.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
																	.addComponent(lblBarrio, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
																	.addGroup(gl_panel_1.createSequentialGroup()
																		.addComponent(textFieldDormitorios, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
																		.addGap(37)))
																.addPreferredGap(ComponentPlacement.RELATED)
																.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
																	.addGroup(gl_panel_1.createSequentialGroup()
																		.addComponent(lblFrente, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(textFieldFrente, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
																	.addComponent(textBarrio, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)))))
													.addGroup(gl_panel_1.createSequentialGroup()
														.addGap(18)
														.addComponent(textObservaciones, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)))
												.addGap(4))))
									.addGroup(gl_panel_1.createSequentialGroup()
										.addGap(36)
										.addComponent(btnVerImagenInmueble, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_panel_1.createSequentialGroup()
												.addGap(2)
												.addComponent(btnPrevisualizarImagen, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
												.addGap(35)
												.addComponent(btnCrearInmueble, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(btnCancelar, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
											.addComponent(lblObservaciones, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)))
								.addGap(116))
							.addGroup(gl_panel_1.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblTipoInmueble, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblOrientacion, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollBar, GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(15)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPropietarios)
						.addComponent(comboBoxPropietarios, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFechaDeCarga)
						.addComponent(textFechaCarga, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textProvincia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblProvincia))
					.addGap(12)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLocalidad)
						.addComponent(textFieldLocalidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(textFieldCalle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNroCalle)
							.addComponent(textFieldNroCalle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblCalle))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDepartamento)
						.addComponent(textFieldDepartamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBarrio)
						.addComponent(textBarrio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTipoInmueble)
						.addComponent(comboBoxTipoInmueble, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPrecioVenta, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textFieldPrecioVenta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFrente)
						.addComponent(lblUSD)
						.addComponent(textFieldFrente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOrientacion)
						.addComponent(comboBoxOrientacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFondo)
								.addComponent(textFieldFondo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSuperficie)
								.addComponent(textFieldSuperficie, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(textFieldSuperficieEdificada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblAntiguedad)
								.addComponent(textFieldAntiguedad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldBaños, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBaños)
						.addComponent(textFieldDormitorios, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDormitorios))
					.addGap(28)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxPatio)
						.addComponent(chckbxPropiedadHorizontal)
						.addComponent(chckbxPavimento)
						.addComponent(chckbxtelefono))
					.addGap(26)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxCochera)
						.addComponent(chckbxCloacas)
						.addComponent(chckbxTelefono))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxGarage)
						.addComponent(chckbxPiscina)
						.addComponent(chckbxGasNatural))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxAguaCorriente)
						.addComponent(chckbxLavadero)
						.addComponent(chckbxAguaCaliente))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblObservaciones, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(41))
						.addComponent(textObservaciones, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnVerImagenInmueble)
						.addComponent(btnCancelar)
						.addComponent(btnCrearInmueble)
						.addComponent(btnPrevisualizarImagen))
					.addGap(44))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 607, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 731, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	private void mensajeErrorAlCargarPropietarios() {
		JOptionPane.showMessageDialog(null, "Se produjo un error al intentar cargar los propietarios.");
		
	}
	public void informarErrorDeAlta() {
		
		JOptionPane.showMessageDialog(null, "No se pudo dar de alta el inmueble. Verifique que todos los campos esten correctos.");
		
	}
	public void mensajeExitosoDeAlta()
	{
		JOptionPane.showMessageDialog(null, "Inmueble dado de alta con exito.");
	}
}
