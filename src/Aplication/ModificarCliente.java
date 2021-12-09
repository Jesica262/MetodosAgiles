package Aplication;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Class.Cliente;
import Class.Propietario;
import Controller.GestorCliente;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JComboBox;

public class ModificarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textTelefono;
	private JTextField textUsuario;
	private JTextField textClave;
	private JTextField textBarrio;
	private JTextField textCararteristicas;
	private JTextField textMonto;
	private GestorCliente gC = new GestorCliente();
	
	public ModificarCliente(Cliente c) {
		setBackground(SystemColor.inactiveCaption);
		setTitle("ABM - Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 700);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(SystemColor.activeCaption);
		
		JLabel lblPropietarioX = new JLabel("MODIFICAR CLIENTE");
		lblPropietarioX.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(SystemColor.inactiveCaption);
		
		JLabel lblNewLabel_2 = new JLabel("Datos del Cliente");
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setText(c.getNombre());
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Apellido:");
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setText(c.getApellido());
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Telefono:");
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setText(c.getTelefono().toString());
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Usuario:");
		
		textUsuario = new JTextField();
		textUsuario.setColumns(10);
		textUsuario.setText(c.getUsuario());
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Clave:");
		
		textClave = new JTextField();
		textClave.setColumns(10);
		textClave.setText(c.getClave());
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 266, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(37)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textNombre, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1_1)
								.addComponent(textApellido)
								.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addComponent(textTelefono)
								.addComponent(lblNewLabel_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addComponent(textUsuario, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addComponent(textClave, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(34, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 400, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2)
					.addGap(32)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1_1_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1_1_1_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1_1_1_1_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1_1_1_1_1_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textClave, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(42, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1.setBackground(SystemColor.inactiveCaption);
		
		JLabel lblNewLabel_2_1 = new JLabel("Datos del Inmueble Buscado");
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Localidad:");
		
		JLabel lblNewLabel_1_1 = new JLabel("Tipo de Inmueble:");
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Barrio:");
		
		textBarrio = new JTextField();
		textBarrio.setColumns(10);
		textBarrio.setText(c.getBarrio());
		JLabel lblNewLabel_1_1_1_2_1_1 = new JLabel("Caracteristicas:");
		
		textCararteristicas = new JTextField();
		textCararteristicas.setColumns(10);
		textCararteristicas.setText(c.getCaracteristicas());
		
		JLabel lblNewLabel_1_1_1_2_1_1_1 = new JLabel("Caracteristicas:");
		
		JLabel lblNewLabel_1_1_1_2_1_1_2 = new JLabel("Monto:");
		
		textMonto = new JTextField();
		textMonto.setColumns(10);
		textMonto.setText(c.getMonto().toString());
		
		JComboBox comboLocalidad = new JComboBox();
		comboLocalidad.setModel(new DefaultComboBoxModel(new String[] {"", "Rosario", "Santa Fe", "Resistencia", "Santo Tome", "Rincon", "Sauce"}));
		
		JComboBox comboInmueble = new JComboBox();
		comboInmueble.setModel(new DefaultComboBoxModel(new String[] {"", "L", "C", "D", "T", "Q", "G"}));
		
		GroupLayout gl_panel_2_1 = new GroupLayout(panel_2_1);
		gl_panel_2_1.setHorizontalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2_1.createSequentialGroup()
							.addGap(33)
							.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_1_1_1_2)
								.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1_1_2_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(textBarrio)
								.addComponent(lblNewLabel_1_1_1_2_1_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
								.addComponent(textCararteristicas, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1_1_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1_1_2_1_1_2, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
								.addComponent(textMonto, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
								.addComponent(comboLocalidad, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(comboInmueble, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_2_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(34, Short.MAX_VALUE))
		);
		gl_panel_2_1.setVerticalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2_1)
					.addGap(30)
					.addComponent(lblNewLabel_1_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(comboInmueble, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1_1_1_2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(comboLocalidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1_1_1_2_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textBarrio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1_1_1_2_1_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textCararteristicas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1_1_1_2_1_1_2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textMonto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(223)
					.addComponent(lblNewLabel_1_1_1_2_1_1_1)
					.addGap(31))
		);
		panel_2_1.setLayout(gl_panel_2_1);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textNombre.getText();
				String apellido = textApellido.getText();
				String telefono = textTelefono.getText();
				String usuario = textUsuario.getText();
				String clave = textClave.getText();
				String barrio = textBarrio.getText();
				String caracteristica = textCararteristicas.getText();
				String monto = textMonto.getText();
				String inmueble = comboInmueble.getSelectedItem().toString();
				String localidad = comboLocalidad.getSelectedItem().toString();
				

				if(gC.validacionVacios(nombre,apellido,telefono,usuario,clave,barrio,caracteristica,monto,inmueble,localidad))
				{
					Cliente c1 = new Cliente();
					Long tel = Long.parseLong(telefono);
					Float montoAux = Float.parseFloat(monto);
					
					c1.setIdCliente(c.getIdCliente());
					c1.setApellido(apellido);
					c1.setBarrio(barrio);
					c1.setCaracteristicas(caracteristica);
					c1.setClave(clave);
					c1.setEliminado(false);
					c1.setEmail(null);
					c1.setLocalidad(localidad);
					c1.setMonto(montoAux);
					c1.setNombre(nombre);
					c1.setTelefono(tel);
					c1.setTipoInmueble(inmueble);
					c1.setUsuario(usuario);
					
					try {
						gC.modificarCliente(c1);
						mensajeExitosoDeAlta();
						
						textNombre.setText("");
						textApellido.setText("");
						textTelefono.setText("");
						textUsuario.setText("");
						textClave.setText("");
						textBarrio.setText("");
						textCararteristicas.setText("");
						textMonto.setText("");
						comboInmueble.setSelectedItem("");
						comboLocalidad.setSelectedItem("");
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			
				}
				else {
					informarErrorDeAlta();
				}	
			}
		});
		btnModificar.setBackground(SystemColor.controlHighlight);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBackground(SystemColor.controlHighlight);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(70)
							.addComponent(lblPropietarioX, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(14)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(panel_2_1, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(36)
					.addComponent(lblPropietarioX)
					.addGap(28)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
						.addComponent(panel_2_1, Alignment.TRAILING, 0, 0, Short.MAX_VALUE))
					.addGap(63)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnModificar))
					.addGap(25))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 401, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void informarErrorDeAlta() {
		
		JOptionPane.showMessageDialog(null, "Es necesario completar todos los campos para modificar el Cliente");
		
	}
	public void mensajeExitosoDeAlta()
	{
		JOptionPane.showMessageDialog(null, "Cliente modificado con exito");
	}
}
