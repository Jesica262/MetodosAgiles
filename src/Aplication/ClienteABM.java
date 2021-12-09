package Aplication;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Class.Cliente;
import Class.DTOAdministrador;
import Class.Propietario;
import Class.Vendedor;
import Controller.GestorCliente;
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
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.Font;

public class ClienteABM extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textTelefono;
	private DTOAdministrador dtoAdministrador;
	private GestorCliente gC = new GestorCliente();
	private JTextField textUsuario;
	private JTextField textClave;

	public ClienteABM() {
		setBackground(SystemColor.inactiveCaption);
		setTitle("ABM - Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 700);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(SystemColor.activeCaption);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(SystemColor.activeCaption);
		
		JLabel lblVendedorX = new JLabel("CLIENTE");
		lblVendedorX.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		
		textNombre = new JTextField();
		textNombre.setEditable(false);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Apellido:");

		textApellido = new JTextField();
		textApellido.setEditable(false);
		textApellido.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Telefono:");
		
		textTelefono = new JTextField();
		textTelefono.setEditable(false);
		textTelefono.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Datos del Cliente");
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Usuario:");
		
		textUsuario = new JTextField();
		textUsuario.setEditable(false);
		textUsuario.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Clave:");
		
		textClave = new JTextField();
		textClave.setEditable(false);
		textClave.setColumns(10);
		
		JComboBox comboBoxClientes = new JComboBox();
		comboBoxClientes.setBackground(UIManager.getColor("InternalFrame.borderHighlight"));
		
		List<Cliente> clienteX = new ArrayList<Cliente>();
		
		try {
			clienteX = gC.buscarTodos();
				
			comboBoxClientes.addItem("");
			for(Cliente e: clienteX)
			{
					
				comboBoxClientes.addItem(e.getNombre());
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(SystemColor.controlHighlight);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		
		JButton btnModificar = new JButton("Modificar Cliente");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String cliente = comboBoxClientes.getSelectedItem().toString();				
				
				if(!comboBoxClientes.getSelectedItem().toString().equals(""))
				{	
					try {
						Cliente c = gC.BuscarPorNombre(cliente);
			
						textNombre.setText("");
						textApellido.setText("");
						textTelefono.setText("");
						textUsuario.setText("");
						textClave.setText("");
						
						ModificarCliente modificar = new ModificarCliente(c);
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
		
		
		
		JButton btnCrear = new JButton("Crear Cliente");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AltaCliente alta = new AltaCliente();
				alta.setVisible(true);
				alta.setLocationRelativeTo(null);
				
			}
		});
		btnCrear.setBackground(SystemColor.controlHighlight);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(SystemColor.inactiveCaption);
		
		
		JButton btnEliminar = new JButton("Eliminar Cliente");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String cliente = comboBoxClientes.getSelectedItem().toString();
				
				try {
					Cliente c = gC.BuscarPorNombre(cliente);
					c.setEliminado(true);
					gC.modificarEstado(c);
					
					mensajeExitosoDeBaja();
					dispose();
						
					ClienteABM abm = new ClienteABM();
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
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(37)
					.addComponent(btnCrear, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnModificar, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnEliminar, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
					.addGap(43))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(446, Short.MAX_VALUE)
					.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addGap(56)
					.addComponent(lblVendedorX, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(328, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addGap(27)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 518, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(28)
					.addComponent(lblVendedorX)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCrear)
						.addComponent(btnModificar)
						.addComponent(btnEliminar))
					.addGap(18)
					.addComponent(btnCancelar)
					.addContainerGap())
		);
		
	
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(23)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(115)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1_1)
								.addComponent(textApellido)
								.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addComponent(textTelefono)
								.addComponent(lblNewLabel_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addComponent(textNombre, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
								.addComponent(textUsuario)
								.addComponent(textClave))))
					.addContainerGap(117, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
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
					.addGap(26))
		);
		panel_2.setLayout(gl_panel_2);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 574, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 555, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel = new JLabel("CLIENTES");
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String cliente = comboBoxClientes.getSelectedItem().toString();
				
				if(!comboBoxClientes.getSelectedItem().toString().equals(""))
				{	
					lblVendedorX.setText("CLIENTE ".concat(cliente).toUpperCase());
					try {
						Cliente c = gC.BuscarPorNombre(cliente);
				
						textNombre.setText(c.getNombre());				
						textApellido.setText(c.getApellido());
						textTelefono.setText(c.getTelefono().toString());
						textUsuario.setText(c.getUsuario());
						textClave.setText(c.getClave());
						textUsuario.setText(c.getUsuario());
						textClave.setText(c.getClave());
						
						
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
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(38)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBoxClientes, 0, 240, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
					.addGap(30))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(34, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(btnBuscar)
						.addComponent(comboBoxClientes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

	public void mensajeDeSeleccion()
	{
		JOptionPane.showMessageDialog(null, "Debe seleccionar un Cliente para poder buscar");
	}
	public void mensajeExitosoDeBaja()
	{
		JOptionPane.showMessageDialog(null, "Cliente eliminado con exito");
	}
	public void mensajeFalloDeBaja()
	{
		JOptionPane.showMessageDialog(null, "Debe seleccionar un Cliente para que pueda ser eliminado");
	}
	public void mensajeDeSeleccionModificacion()
	{
		JOptionPane.showMessageDialog(null, "Debe seleccionar un Cliente para poder modificarlo");
	}
}
