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
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.Font;

public class ModificarVendedor extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textDni;
	private JTextField textApellido;
	private JTextField textEmail;
	private JTextField textClave;

	public ModificarVendedor() {
		setBackground(SystemColor.inactiveCaption);
		setTitle("ABM - Vendedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(SystemColor.activeCaption);
		
		JLabel lblVendedorX = new JLabel("MODIFICAR VENDEDOR");
		lblVendedorX.setFont(new Font("Tahoma", Font.BOLD, 15));
		
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
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(SystemColor.activeCaption);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Dni:");
		
		textDni = new JTextField();
		textDni.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Apellido:");
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Email:");
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Clave:");
		
		textClave = new JTextField();
		textClave.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(82)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
						.addComponent(textNombre, GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
						.addComponent(textDni)
						.addComponent(textApellido)
						.addComponent(textEmail)
						.addComponent(textClave))
					.addContainerGap(93, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(22)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textDni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1_1_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1_1_1_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1_1_1_1_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textClave, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(22))
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 550, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(74)
					.addComponent(lblVendedorX, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(257, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(331, Short.MAX_VALUE)
					.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(29))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(18)
					.addComponent(lblVendedorX)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnModificar))
					.addGap(13))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}
}
