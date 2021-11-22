package Aplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ModificarPropietario extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textDni;
	private JTextField textTelefono;
	private JTextField textEmail;
	private JTextField textCalle;
	private JTextField textNumero;

	public ModificarPropietario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ABM - Propietario");
		setForeground(SystemColor.inactiveCaption);
		setBackground(SystemColor.inactiveCaption);
		setBounds(100, 100, 600, 550);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Mensaje 
				dispose();
			}
		});
		btnCancelar.setBackground(SystemColor.controlHighlight);
		
		JLabel lblPropietarioX = new JLabel("MODIFICAR DE PROPIETARIO");
		lblPropietarioX.setFont(new Font("Tahoma", Font.BOLD, 15));
		
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
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Apellido:");
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo:");
		
		JComboBox comboTipo = new JComboBox();
		
		JLabel lblNewLabel_1_1 = new JLabel("Dni:");
		
		textDni = new JTextField();
		textDni.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Telefono:");
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Email:");
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Calle:");
		
		textCalle = new JTextField();
		textCalle.setColumns(10);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Numero:");
		
		textNumero = new JTextField();
		textNumero.setColumns(10);
		
		JLabel lblNewLabel_1_2 = new JLabel("Provincia:");
		
		JComboBox comboProvincia = new JComboBox();
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Localidad:");
		
		JComboBox comboLocalidad = new JComboBox();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(textCalle, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboProvincia, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addComponent(textNombre, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
						.addComponent(comboTipo, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textTelefono))
					.addGap(73)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_2_1_1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(textEmail, Alignment.LEADING)
								.addComponent(textNumero, Alignment.LEADING)
								.addComponent(comboLocalidad, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1_1_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
								.addComponent(textDni, Alignment.LEADING)
								.addComponent(lblNewLabel_1_1_1_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
								.addComponent(textApellido, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_1_1_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_1_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textDni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_1_1_1_2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(comboLocalidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(comboTipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_1_2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(comboProvincia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_2_1)
						.addComponent(lblNewLabel_1_2_1_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textCalle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_1_1_1_1)
						.addComponent(lblNewLabel_1_1_1_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(36))
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(71)
					.addComponent(lblPropietarioX, GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
					.addGap(192))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 550, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(340, Short.MAX_VALUE)
					.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addGap(22))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(25)
					.addComponent(lblPropietarioX)
					.addGap(18)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
					.addGap(32)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnModificar))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 574, GroupLayout.PREFERRED_SIZE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 503, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
