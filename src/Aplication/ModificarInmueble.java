package Aplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Class.Inmueble;
import Class.Propietario;
import Controller.GestorInmueble;
import Controller.GestorPropietario;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
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

public class ModificarInmueble extends JFrame {

	private JPanel contentPane;
	private JTextField textProvincia;
	private JTextField textFieldNroCalle;
	private JTextField textBarrio;
	private JTextField textFieldPiso;
	private JTextField textFieldDepartamento;
	private JTextField textFieldPrecioVenta;
	private JTextField textFieldFrente;
	private JTextField textFieldFondo;
	private JTextField textFieldSuperficie;
	private JTextField textFieldBaños;
	private JTextField textFieldDormitorios;
	private JTextField textFieldAntiguedad;
	private JTextField textFieldLocalidad;
	private JTextField textFieldCalle;
	private JTextField textFieldSuperficieEdificada;
	private JTextField textFieldFechaDeCarga;
	private GestorInmueble gestor= GestorInmueble.get();
	private GestorPropietario gestorPropietario = new GestorPropietario();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarInmueble frame = new ModificarInmueble(new Inmueble());
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
	public ModificarInmueble(Inmueble inmueble) {
		setTitle("Modificar Inmueble");
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
		textProvincia.setText(inmueble.getProvincia());
		textProvincia.setColumns(10);
		
		textFieldNroCalle = new JTextField();
		textFieldNroCalle.setText(inmueble.getNumeroCalle().toString());
		textFieldNroCalle.setColumns(10);
		
		textBarrio = new JTextField();
		textBarrio.setText(inmueble.getBarrio());
		textBarrio.setColumns(10);
		
		JLabel lblPiso = new JLabel("Piso:");
		
		textFieldPiso = new JTextField();
		textFieldPiso.setText(inmueble.getPisoDepartamento());
		textFieldPiso.setColumns(10);
		
		JLabel lblDepartamento = new JLabel("Departamento:");
		
		textFieldDepartamento = new JTextField();
		textFieldDepartamento.setText(inmueble.getPisoDepartamento());
		textFieldDepartamento.setColumns(10);
		
		JLabel lblTipoInmueble = new JLabel("Tipo de Inmueble:");
		
		JComboBox<String> comboBoxTipoInmueble = new JComboBox<String>();
		comboBoxTipoInmueble.addItem(inmueble.getTipoInmueble());
		comboBoxTipoInmueble.addItem("L");
		comboBoxTipoInmueble.addItem("C");
		comboBoxTipoInmueble.addItem("D");
		comboBoxTipoInmueble.addItem("T");
		comboBoxTipoInmueble.addItem("Q");
		comboBoxTipoInmueble.addItem("G");
		
		
		
		JLabel lblPrecioVenta = new JLabel("Precio de Venta:");
		
		textFieldPrecioVenta = new JTextField();
		textFieldPrecioVenta.setText(inmueble.getPrecioVenta().toString());
		textFieldPrecioVenta.setColumns(10);
		
		JLabel lblUSD = new JLabel("USD$");
		
		JLabel lblOrientacion = new JLabel("Orientaci\u00F3n:");
		
		JComboBox<String> comboBoxOrientacion = new JComboBox<String>();
		comboBoxOrientacion.addItem(inmueble.getOrientacion());
		comboBoxOrientacion.addItem("ESTE");
		comboBoxOrientacion.addItem("OESTE");
		comboBoxOrientacion.addItem("NORTE");
		comboBoxOrientacion.addItem("SUR");
		
		JLabel lblFrente = new JLabel("Frente (m):");
		
		textFieldFrente = new JTextField();
		textFieldFrente.setText(inmueble.getFrente().toString());
		textFieldFrente.setColumns(10);
		
		JLabel lblFondo = new JLabel("Fondo (m):");
		
		textFieldFondo = new JTextField();
		textFieldFondo.setText(inmueble.getFondo().toString());
		textFieldFondo.setColumns(10);
		
		JLabel lblSuperficie = new JLabel("Superficie del Terreno (m2):");
		
		textFieldSuperficie = new JTextField();
		textFieldSuperficie.setText(inmueble.getSuperficieTerreno().toString());
		textFieldSuperficie.setColumns(10);
		
		JButton btnVerImagenInmueble = new JButton("Cargar Imagen");
		btnVerImagenInmueble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser file = new JFileChooser();
				file.showOpenDialog(new JFrame());
				File archivo = file.getSelectedFile();
				if(archivo!=null) {
					String origen = archivo.getPath();
					inmueble.setImagen(new ImageIcon(origen));
				}
			}
		});
		
		JScrollBar scrollBar = new JScrollBar();
		
		JLabel lblFechaDeCarga = new JLabel("Fecha de Carga:");
		
		JLabel lblPropietarios = new JLabel("Propietario:");
		
		JComboBox<Propietario> comboBoxPropietarios = new JComboBox<Propietario>();
		comboBoxPropietarios.addItem(inmueble.getPropietario());
		try {
			List<Propietario> listaPropietarios = gestorPropietario.buscarTodos();
			for(Propietario p : listaPropietarios) comboBoxPropietarios.addItem(p);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			mensajeErrorAlCargarPropietarios();
		}
		
		JCheckBox chckbxPropiedadHorizontal = new JCheckBox("Propiedad Horizontal");
		chckbxPropiedadHorizontal.setSelected(inmueble.getPropiedadHorizontal());
		
		JCheckBox chckbxPatio = new JCheckBox("Patio");
		chckbxPatio.setSelected(inmueble.getPatio());
		
		JCheckBox chckbxCochera = new JCheckBox("Cochera");
		chckbxCochera.setSelected(inmueble.getGarageCochera());
		
		JCheckBox chckbxCloacas = new JCheckBox("Clocacas");
		chckbxCloacas.setSelected(inmueble.getCloacas());
		
		JCheckBox chckbxGarage = new JCheckBox("Garage");
		chckbxGarage.setSelected(inmueble.getGarageCochera());
		
		JCheckBox chckbxPiscina = new JCheckBox("Piscina");
		chckbxPiscina.setSelected(inmueble.getPiscina());
		
		JCheckBox chckbxAguaCorriente = new JCheckBox("Agua Corriente");
		chckbxAguaCorriente.setSelected(inmueble.getAguaCorriente());
		
		JCheckBox chckbxLavadero = new JCheckBox("Lavadero");
		chckbxLavadero.setSelected(inmueble.getLavadero());
		
		JLabel lblDormitorios = new JLabel("Cantidad de dormitorios:");
		
		textFieldBaños = new JTextField();
		textFieldBaños.setText(inmueble.getBaños().toString());
		textFieldBaños.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldBaños.setColumns(10);
		
		JLabel lblBaños = new JLabel("Cantidad de ba\u00F1os:");
		
		JCheckBox chckbxAguaCaliente = new JCheckBox("Agua Caliente");
		chckbxAguaCaliente.setSelected(inmueble.getAguaCaliente());
		
		JCheckBox chckbxGasNatural = new JCheckBox("Gas Natural");
		chckbxGasNatural.setSelected(inmueble.getGasNatural());
		
		JCheckBox chckbxPavimento = new JCheckBox("Pavimento");
		chckbxPavimento.setSelected(inmueble.getPavimento());
		
		JCheckBox chckbxTelefono = new JCheckBox("Tel\u00E9fono");
		chckbxTelefono.setSelected(inmueble.getTelefono());
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		
		JTextArea textObservaciones = new JTextArea();
		textObservaciones.setText(inmueble.getObservaciones());
		
		JButton btnPrevisualizarImagen = new JButton("Previsualizar Imagen");
		btnPrevisualizarImagen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inmueble.getImagen()!=null) {
					MostrarFoto foto= new MostrarFoto(inmueble.getImagen());
					foto.setVisible(true);
					foto.setLocationRelativeTo(null);
				}else JOptionPane.showMessageDialog(null,"No existe imagen cargada.");
			}
		});
		
		
		
		textFieldDormitorios = new JTextField();
		textFieldDormitorios.setText(inmueble.getDormitorios().toString());
		textFieldDormitorios.setColumns(10);
		
		JLabel lblAntiguedad = new JLabel("Antiguedad:");
		
		textFieldAntiguedad = new JTextField();
		textFieldAntiguedad.setText(inmueble.getAntiguedad().toString());
		textFieldAntiguedad.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InmuebleABM inmuebleABM = new InmuebleABM();
				inmuebleABM.setVisible(true);
				inmuebleABM.setLocationRelativeTo(null);
				dispose();
			}
		});
		
		textFieldLocalidad = new JTextField();
		textFieldLocalidad.setText(inmueble.getLocalidad());
		textFieldLocalidad.setColumns(10);
		
		textFieldCalle = new JTextField();
		textFieldCalle.setText(inmueble.getCalle());
		textFieldCalle.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Superficie Edificada");
		
		textFieldSuperficieEdificada = new JTextField();
		textFieldSuperficieEdificada.setText(inmueble.getSuperficieEdificada().toString());
		textFieldSuperficieEdificada.setText("");
		textFieldSuperficieEdificada.setColumns(10);
		
		textFieldFechaDeCarga = new JTextField();
		textFieldFechaDeCarga.setText(inmueble.getFechaCarga().toString());
		textFieldFechaDeCarga.setEnabled(false);
		textFieldFechaDeCarga.setEditable(false);
		textFieldFechaDeCarga.setColumns(10);
		
		JButton btnModificar = new JButton("Modificar Inmueble");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(gestor.validacionVacios(comboBoxPropietarios.getSelectedItem().toString(), textFieldFechaDeCarga.getText(), 
						textProvincia.getText(), textFieldLocalidad.getText(), textFieldCalle.getText(), textFieldNroCalle.getText(),
						comboBoxTipoInmueble.getSelectedItem().toString(), textFieldPrecioVenta.getText())) {
					
					Inmueble i = new Inmueble(inmueble.getFechaCarga(),"ALTO",textProvincia.getText(),textFieldLocalidad.getText(),
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
							textObservaciones.getText(),inmueble.getEliminado(),
							inmueble.getReservado(),inmueble.getVendido(), (Propietario) comboBoxPropietarios.getSelectedItem());
					i.setCodigo(inmueble.getCodigo());
					
					try {
						gestor.modificarInmueble(i);
						mensajeExitosoDeModificacion();
						InmuebleABM abm= new InmuebleABM();
						abm.setVisible(true);
						abm.setLocationRelativeTo(null);
						dispose();
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						informarErrorDeModificacion();
					}
					
					
				}else informarErrorDeModificacion();
			}

			
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addComponent(lblLocalidad, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblCalle, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNroCalle, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblBarrio, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblProvincia)
												.addComponent(lblFechaDeCarga)
												.addComponent(lblPropietarios, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
											.addGap(18))
										.addGroup(gl_panel_1.createSequentialGroup()
											.addComponent(lblTipoInmueble, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
											.addGap(4)))
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(comboBoxPropietarios, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_1.createSequentialGroup()
													.addComponent(textFieldNroCalle, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(lblPiso)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(textFieldPiso, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
													.addComponent(textBarrio, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
													.addComponent(comboBoxTipoInmueble, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_1.createSequentialGroup()
													.addGap(18)
													.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_panel_1.createSequentialGroup()
															.addComponent(lblDepartamento, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(textFieldDepartamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_panel_1.createSequentialGroup()
															.addPreferredGap(ComponentPlacement.RELATED)
															.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_panel_1.createSequentialGroup()
																	.addComponent(lblFrente, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
																		.addComponent(textFieldAntiguedad, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
																		.addGroup(gl_panel_1.createSequentialGroup()
																			.addComponent(textFieldFrente, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
																			.addPreferredGap(ComponentPlacement.UNRELATED)
																			.addComponent(lblFondo, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
																			.addPreferredGap(ComponentPlacement.RELATED)
																			.addComponent(textFieldFondo, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))))
																.addGroup(gl_panel_1.createSequentialGroup()
																	.addComponent(lblPrecioVenta, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
																		.addComponent(textFieldSuperficieEdificada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addGroup(gl_panel_1.createSequentialGroup()
																			.addComponent(textFieldPrecioVenta, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
																			.addGap(10)
																			.addComponent(lblUSD, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))))))))
												.addGroup(gl_panel_1.createSequentialGroup()
													.addGap(34)
													.addComponent(lblNewLabel))))
										.addComponent(textProvincia, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldLocalidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldCalle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldFechaDeCarga, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
										.addComponent(chckbxPropiedadHorizontal)
										.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
											.addGroup(gl_panel_1.createSequentialGroup()
												.addComponent(lblOrientacion, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(comboBoxOrientacion, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
											.addComponent(chckbxCochera, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
											.addComponent(chckbxGarage, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
											.addComponent(chckbxAguaCorriente, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
											.addGroup(gl_panel_1.createSequentialGroup()
												.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
													.addComponent(lblBaños, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(lblSuperficie, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
												.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
												.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
													.addComponent(textFieldSuperficie, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
													.addComponent(textFieldBaños, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)))))
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
													.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
														.addComponent(lblAntiguedad, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblDormitorios))))
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_1.createSequentialGroup()
													.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
														.addComponent(chckbxAguaCaliente, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
														.addComponent(chckbxGasNatural, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
														.addComponent(chckbxTelefono, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
														.addComponent(chckbxPavimento, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)))
												.addGroup(gl_panel_1.createSequentialGroup()
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(textFieldDormitorios, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))))
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGap(18)
											.addComponent(textObservaciones, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)))
									.addGap(4))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(36)
							.addComponent(btnVerImagenInmueble, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(2)
									.addComponent(btnPrevisualizarImagen, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
									.addGap(35)
									.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnCancelar, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
								.addComponent(lblObservaciones, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(116)
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
						.addComponent(textFieldFechaDeCarga, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textProvincia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblProvincia))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLocalidad)
						.addComponent(textFieldLocalidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCalle)
						.addComponent(textFieldCalle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(textFieldNroCalle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPiso)
								.addComponent(textFieldPiso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNroCalle)
								.addComponent(lblDepartamento))
							.addGap(18)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(textBarrio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblBarrio)
								.addComponent(lblNewLabel)
								.addComponent(textFieldSuperficieEdificada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(textFieldDepartamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(32)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblOrientacion)
								.addComponent(comboBoxOrientacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblFrente)
								.addComponent(textFieldFrente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblFondo)
								.addComponent(textFieldFondo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBoxTipoInmueble, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTipoInmueble)
								.addComponent(textFieldPrecioVenta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblUSD)
								.addComponent(lblPrecioVenta, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(32)))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSuperficie)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(textFieldSuperficie, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblAntiguedad)
							.addComponent(textFieldAntiguedad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldBaños, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBaños)
						.addComponent(textFieldDormitorios, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDormitorios))
					.addGap(28)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxPatio)
						.addComponent(chckbxPropiedadHorizontal)
						.addComponent(chckbxPavimento))
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
							.addComponent(lblObservaciones, GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
							.addGap(41))
						.addComponent(textObservaciones, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnVerImagenInmueble)
						.addComponent(btnCancelar)
						.addComponent(btnModificar)
						.addComponent(btnPrevisualizarImagen))
					.addGap(44))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 605, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 731, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	private void mensajeErrorAlCargarPropietarios() {
		JOptionPane.showMessageDialog(null, "Se produjo un error al intentar cargar los propietarios.");
		
	}
	private void informarErrorDeModificacion() {
		JOptionPane.showMessageDialog(null, "No se pudo modificar el Inmueble. Por favor verifique los datos.");
		
	}

	private void mensajeExitosoDeModificacion() {
		JOptionPane.showMessageDialog(null, "El inmueble fué modificado con éxito.");
		
	}
}
