package Aplication;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Class.Propietario;
import Controller.GestorPropietario;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PropietarioABM extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textDni;
	private JTextField textApellido;
	private JTextField textTelefono;
	private JTextField textEmail;
	private JTextField textCalle;
	private JTextField textNumero;
	private JTextField textTipo;
	private JTextField textProvincia;
	private JTextField textLocalidad;
	private GestorPropietario gp = new GestorPropietario();

	public PropietarioABM() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ABM - Propietario");
		setForeground(SystemColor.inactiveCaption);
		setBackground(SystemColor.inactiveCaption);
		setBounds(100, 100, 600, 650);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JLabel lblNewLabel = new JLabel("PROPIETARIOS:");
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Telefono:");
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Email:");
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Apellido:");
		
		JLabel lblNewLabel_1_1 = new JLabel("Dni:");
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		
		JLabel lblPropietarioX = new JLabel("PROPIETARIO ");
		lblPropietarioX.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		textNombre = new JTextField();
		textNombre.setEditable(false);
		textNombre.setColumns(10);
		
		textDni = new JTextField();
		textDni.setEditable(false);
		textDni.setColumns(10);
		
		textApellido = new JTextField();
		textApellido.setEditable(false);
		textApellido.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setEditable(false);
		textTelefono.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setEditable(false);
		textEmail.setColumns(10);
		
		textCalle = new JTextField();
		textCalle.setEditable(false);
		textCalle.setColumns(10);

		textNumero = new JTextField();
		textNumero.setEditable(false);
		textNumero.setColumns(10);
		
		textTipo = new JTextField();
		textTipo.setEditable(false);
		textTipo.setColumns(10);
		
		textProvincia = new JTextField();
		textProvincia.setEditable(false);
		textProvincia.setColumns(10);
		
		textLocalidad = new JTextField();
		textLocalidad.setEditable(false);
		textLocalidad.setColumns(10);
		
		JComboBox comboBoxPropietario = new JComboBox();
		comboBoxPropietario.setBackground(UIManager.getColor("InternalFrame.borderHighlight"));
		
		List<Propietario> propietarioX = new ArrayList<Propietario>();
		
		propietarioX = gp.buscarTodos();
		comboBoxPropietario.addItem("");
		for(Propietario e: propietarioX)
		{			
			comboBoxPropietario.addItem(e.getNombre());
		}
		
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String propietario = comboBoxPropietario.getSelectedItem().toString();
				
				if(!comboBoxPropietario.getSelectedItem().toString().equals(""))
				{	
					lblPropietarioX.setText("PROPIETARIO ".concat(propietario).toUpperCase());
					try {
						Propietario p = gp.BuscarPorNombre(propietario);
				
						textNombre.setText(p.getNombre());
						textDni.setText(p.getNumeroDocumento().toString());					
						textApellido.setText(p.getApellido());
						textTelefono.setText(p.getTelefono().toString());
						textCalle.setText(p.getCalle());
						textNumero.setText(p.getNumeroCalle().toString());
						textTipo.setText(p.getTipoDocumento());
						textProvincia.setText(p.getProvincia());					
						textLocalidad.setText(p.getLocalidad());
						textEmail.setText(p.getEmail());
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
				}
				else {
					
					 mensajeDeSeleccion();
				}
			}
		});
		btnBuscar.setBackground(SystemColor.controlHighlight);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(42)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBoxPropietario, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
					.addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
					.addGap(28))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(comboBoxPropietario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBuscar))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_contentPane_1 = new GroupLayout(contentPane_1);
		gl_contentPane_1.setHorizontalGroup(
			gl_contentPane_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 965, Short.MAX_VALUE)
		);
		gl_contentPane_1.setVerticalGroup(
			gl_contentPane_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 443, Short.MAX_VALUE)
		);
		contentPane_1.setLayout(gl_contentPane_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBackground(SystemColor.controlHighlight);
		
		JButton btnCrear = new JButton("Crear Propietario");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AltaPropietario alta = new AltaPropietario();
				alta.setVisible(true);
				alta.setLocationRelativeTo(null);
			}
		});
		btnCrear.setBackground(SystemColor.controlHighlight);
		
		JButton btnModificar = new JButton("Modificar Propietario");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String propietario = comboBoxPropietario.getSelectedItem().toString();
				
				if(!comboBoxPropietario.getSelectedItem().toString().equals(""))
				{	
					try {
						Propietario p = gp.BuscarPorNombre(propietario);
				
						textNombre.setText("");
						textDni.setText("");				
						textApellido.setText("");
						textTelefono.setText("");
						textCalle.setText("");
						textNumero.setText("");
						textTipo.setText("");
						textProvincia.setText("");					
						textLocalidad.setText("");
						textEmail.setText("");
						
						ModificarPropietario modificar = new ModificarPropietario(p);
						modificar.setVisible(true);
						modificar.setLocationRelativeTo(null);
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
				}
				else {
					
					 mensajeDeSeleccionModificacion();
				}
			}
		});
		btnModificar.setBackground(SystemColor.controlHighlight);
		
		JButton btnEliminar = new JButton("Eliminar Propietario");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String propietario = comboBoxPropietario.getSelectedItem().toString();
				
				try {
					Propietario p = gp.BuscarPorNombre(propietario);
					p.setEliminado(true);
					gp.modificarEstado(p);
					
					mensajeExitosoDeBaja();
					dispose();
						
					PropietarioABM abm = new PropietarioABM();
					abm.setVisible(true);
					abm.setLocationRelativeTo(null);
						
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					mensajeFalloDeBaja();
				}
						
			}
				
		});
		btnEliminar.setBackground(SystemColor.controlHighlight);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo:");
		
		JLabel lblNewLabel_1_2 = new JLabel("Provincia:");
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Localidad:");
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Calle:");
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Numero:");
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
							.addGap(205))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
							.addGap(90))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_1_2)
							.addGap(232))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(229))
						.addComponent(lblNewLabel_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(textCalle, Alignment.LEADING)
								.addComponent(textTelefono, Alignment.LEADING)
								.addComponent(textProvincia, Alignment.LEADING)
								.addComponent(textNombre, Alignment.LEADING)
								.addComponent(textTipo, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNewLabel_1_2_1_1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
									.addGap(145))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNewLabel_1_1_1_2, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
									.addGap(136))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNewLabel_1_1, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
									.addGap(163))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
									.addGap(145))
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
									.addComponent(textDni)
									.addComponent(textApellido, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
									.addGroup(gl_panel_1.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(textLocalidad, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))))
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(textEmail, Alignment.LEADING)
								.addComponent(textNumero, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 155, GroupLayout.PREFERRED_SIZE)))
					.addGap(43))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(64)
					.addComponent(lblPropietarioX, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
					.addGap(307))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(54)
					.addComponent(btnCrear, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(57, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(454, Short.MAX_VALUE)
					.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addGap(23))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(31)
					.addComponent(lblPropietarioX)
					.addGap(27)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_1_1_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_1_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textTipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textDni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_2)
						.addComponent(lblNewLabel_1_1_1_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textProvincia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textLocalidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_2_1)
						.addComponent(lblNewLabel_1_2_1_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textCalle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_1_1_1_1)
						.addComponent(lblNewLabel_1_1_1_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(55)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCrear)
						.addComponent(btnModificar)
						.addComponent(btnEliminar))
					.addGap(18)
					.addComponent(btnCancelar)
					.addGap(34))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, 0, 0, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 576, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(contentPane_1, GroupLayout.PREFERRED_SIZE, 593, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 503, GroupLayout.PREFERRED_SIZE))
						.addComponent(contentPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void mensajeExitosoDeBaja()
	{
		JOptionPane.showMessageDialog(null, "Propietario eliminado con exito");
	}
	public void mensajeFalloDeBaja()
	{
		JOptionPane.showMessageDialog(null, "Debe seleccionar un Propietario para que pueda ser eliminado");
	}
	public void mensajeDeSeleccion()
	{
		JOptionPane.showMessageDialog(null, "Debe seleccionar un Propietario para poder buscar");
	}
	public void mensajeDeSeleccionModificacion()
	{
		JOptionPane.showMessageDialog(null, "Debe seleccionar un Propietario para poder modificarlo");
	}
}