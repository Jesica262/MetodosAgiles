package Aplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Class.DTOAdministrador;
import Class.Vendedor;
import Controller.GestorVendedor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.Font;

public class ClienteABM extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textDni;
	private JTextField textApellido;
	private JTextField textEmail;
	private JTextField textClave;
	private DTOAdministrador dtoAdministrador;

	public ClienteABM() {
		setBackground(SystemColor.inactiveCaption);
		setTitle("ABM - Vendedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 550);
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
		
		JLabel lblVendedorX = new JLabel("VENDEDOR X");
		lblVendedorX.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(SystemColor.controlHighlight);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		
		JLabel lblNewLabel_1_1 = new JLabel("Dni:");
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Apellido:");
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Email:");
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Clave:");
		
		textNombre = new JTextField();
		textNombre.setEditable(false);
		textNombre.setColumns(10);
		
		textDni = new JTextField();
		textDni.setEditable(false);
		textDni.setColumns(10);
		
		textApellido = new JTextField();
		textApellido.setEditable(false);
		textApellido.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setEditable(false);
		textEmail.setColumns(10);
		
		textClave = new JTextField();
		textClave.setEditable(false);
		textClave.setColumns(10);
		
		JButton btnModificar = new JButton("Modificar Vendedor");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ModificarVendedor modificar = new ModificarVendedor();
				modificar.setVisible(true);
				modificar.setLocationRelativeTo(null);
			}
		});
		btnModificar.setBackground(SystemColor.controlHighlight);
		
		JButton btnEliminar = new JButton("Eliminar Vendedor");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//"Mensaje"
				dispose();
			}
		});
		btnEliminar.setBackground(SystemColor.controlHighlight);
		
		JButton btnCrear = new JButton("Crear Vendedor");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AltaVendedor alta = new AltaVendedor();
				alta.setVisible(true);
				alta.setLocationRelativeTo(null);
				
			}
		});
		btnCrear.setBackground(SystemColor.controlHighlight);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(39)
					.addComponent(lblVendedorX, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(351, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(56)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel_1.createSequentialGroup()
										.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
											.addComponent(textDni, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
											.addComponent(lblNewLabel_1_1, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
											.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
											.addComponent(textNombre, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
											.addComponent(textApellido, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
											.addComponent(textEmail, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
										.addGap(92))
									.addGroup(gl_panel_1.createSequentialGroup()
										.addComponent(lblNewLabel_1_1_1)
										.addPreferredGap(ComponentPlacement.RELATED)))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(textClave, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
									.addGap(89)))
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnCancelar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(btnEliminar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnModificar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnCrear, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
							.addGap(32))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(28)
					.addComponent(lblVendedorX)
					.addGap(25)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_1_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textDni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_1_1_1))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnCrear)
							.addGap(18)
							.addComponent(btnModificar)
							.addGap(18)
							.addComponent(btnEliminar)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_1_1_1_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_1_1_1_1_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textClave, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCancelar))
					.addGap(56))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 405, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel = new JLabel("VENDEDORES:");
		
		JComboBox comboBoxVendedores = new JComboBox();
		List<Vendedor> listaVendedores = GestorVendedor.get().obtenerTodos(); 
		comboBoxVendedores.setBackground(UIManager.getColor("InternalFrame.borderHighlight"));
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBackground(SystemColor.controlHighlight);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(38)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBoxVendedores, 0, 246, Short.MAX_VALUE)
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
						.addComponent(comboBoxVendedores, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBuscar))
					.addGap(28))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

	public ClienteABM(DTOAdministrador dtoAdmin) {
		// TODO Auto-generated constructor stub
		dtoAdministrador=dtoAdmin;
	}
}
