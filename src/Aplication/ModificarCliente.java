package Aplication;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import java.awt.Font;

public class ModificarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textClave;
	private JTextField textTelefono;
	private JTextField textUsuario;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textEmail;

	public ModificarCliente() {
		setBackground(SystemColor.inactiveCaption);
		setTitle("ABM - Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(SystemColor.activeCaption);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(SystemColor.controlHighlight);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Mensaje 
				dispose();
			}
		});
		btnModificar.setBackground(SystemColor.controlHighlight);
		
		JLabel lblPropietarioX = new JLabel("MODIFICAR CLIENTE");
		lblPropietarioX.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(SystemColor.activeCaption);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Clave:");
		
		textClave = new JTextField();
		textClave.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Telefono:");
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Usuario:");
		
		textUsuario = new JTextField();
		textUsuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Apellido:");
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email:");
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_2_1_1)
						.addComponent(lblNewLabel_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(textTelefono, Alignment.LEADING)
							.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addComponent(textNombre, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
							.addComponent(textUsuario, Alignment.LEADING)))
					.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel_1_1_1_2, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1_1_1_2, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addComponent(textEmail)
						.addComponent(textClave, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
						.addComponent(textApellido))
					.addGap(39))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_1_1_1_2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_1_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_1_1_1_1_2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textClave, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_1_1_1_1_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_1_2_1_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(55, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(66)
					.addComponent(lblPropietarioX, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(254, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(348, Short.MAX_VALUE)
					.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(18))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(26)
					.addComponent(lblPropietarioX)
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnModificar))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 574, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
