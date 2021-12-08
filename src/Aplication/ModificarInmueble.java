package Aplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;

public class ModificarInmueble extends JFrame {

	private JPanel contentPane;
	private JTextField textProvincia;
	private JTextField textFieldNroCalle;
	private JTextField textClave;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarInmueble frame = new ModificarInmueble();
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
	public ModificarInmueble() {
		setTitle("Interface Inmueble");
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
		
		textClave = new JTextField();
		textClave.setColumns(10);
		
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
		
		JLabel lblPrecioVenta = new JLabel("Precio de Venta:");
		
		textFieldPrecioVenta = new JTextField();
		textFieldPrecioVenta.setColumns(10);
		
		JLabel lblUSD = new JLabel("USD$");
		
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
		
		JLabel lblPropietarios = new JLabel("Propietario:");
		
		JComboBox comboBoxPropietarios = new JComboBox();
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Propiedad Horizontal");
		
		JCheckBox chckbxPatio = new JCheckBox("Patio");
		
		JCheckBox chckbxCochera = new JCheckBox("Cochera");
		
		JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("Clocacas");
		
		JCheckBox chckbxGarage = new JCheckBox("Garage");
		
		JCheckBox chckbxPiscina = new JCheckBox("Piscina");
		
		JCheckBox chckbxNewCheckBox_2_2_1_1 = new JCheckBox("Agua Corriente");
		
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
		
		JTextArea textArea = new JTextArea();
		
		JButton btnPrevisualizarImagen = new JButton("Previsualizar Imagen");
		
		JButton btnModificar = new JButton("Modificar Inmueble");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		textFieldDormitorios = new JTextField();
		textFieldDormitorios.setColumns(10);
		
		JLabel lblAntiguedad = new JLabel("Antiguedad:");
		
		textFieldAntiguedad = new JTextField();
		textFieldAntiguedad.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
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
													.addComponent(comboBoxLocalidades, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(comboBoxCalles, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
													.addComponent(textClave, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
													.addComponent(comboBoxTipoInmueble, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
											.addGap(18)
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
													.addGroup(gl_panel_1.createSequentialGroup()
														.addComponent(lblOtraLocalidad)
														.addGap(18)
														.addComponent(textFieldOtraLocalidad))
													.addGroup(gl_panel_1.createSequentialGroup()
														.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
															.addComponent(lblOtraCalle, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
															.addComponent(lblDepartamento, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(ComponentPlacement.RELATED)
														.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
															.addComponent(textFieldDepartamento, Alignment.LEADING)
															.addComponent(textFieldOtraCalle, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))))
												.addGroup(gl_panel_1.createSequentialGroup()
													.addPreferredGap(ComponentPlacement.RELATED)
													.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_panel_1.createSequentialGroup()
															.addComponent(lblPrecioVenta, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(textFieldPrecioVenta, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
															.addGap(10)
															.addComponent(lblUSD, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
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
																	.addComponent(textFieldFondo, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))))))))
										.addComponent(textProvincia, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
										.addComponent(chckbxNewCheckBox)
										.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
											.addGroup(gl_panel_1.createSequentialGroup()
												.addComponent(lblOrientacion, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(comboBoxOrientacion, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
											.addComponent(chckbxCochera, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
											.addComponent(chckbxGarage, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
											.addComponent(chckbxNewCheckBox_2_2_1_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
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
														.addComponent(chckbxNewCheckBox_2_1, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
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
													.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
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
											.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)))
									.addGap(4))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(36)
							.addComponent(btnVerImagenInmueble, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(2)
									.addComponent(btnPrevisualizarImagen, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
									.addGap(35)
									.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnCancelar, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
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
					.addComponent(lblFechaDeCarga)
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textProvincia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblProvincia))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLocalidad)
						.addComponent(comboBoxLocalidades, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblOtraLocalidad)
						.addComponent(textFieldOtraLocalidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(comboBoxCalles, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblOtraCalle)
							.addComponent(textFieldOtraCalle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblCalle))
					.addGap(18)
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
								.addComponent(textClave, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblBarrio)))
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
						.addComponent(chckbxNewCheckBox)
						.addComponent(chckbxPavimento))
					.addGap(26)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxCochera)
						.addComponent(chckbxNewCheckBox_2_1)
						.addComponent(chckbxTelefono))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxGarage)
						.addComponent(chckbxPiscina)
						.addComponent(chckbxGasNatural))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox_2_2_1_1)
						.addComponent(chckbxLavadero)
						.addComponent(chckbxAguaCaliente))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblObservaciones, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
							.addGap(41))
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
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
}
