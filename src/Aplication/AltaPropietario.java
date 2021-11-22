package Aplication;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AltaPropietario extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textDni;
	private JTextField textApellido;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaPropietario frame = new AltaPropietario();
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
	public AltaPropietario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ABM - Propietario");
		setForeground(SystemColor.inactiveCaption);
		setBackground(SystemColor.inactiveCaption);
		setBounds(100, 100, 600, 560);
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
				
				dispose();
			}
		});
		btnCancelar.setBackground(SystemColor.controlHighlight);
		
		JLabel lblPropietarioX = new JLabel("ALTA DE PROPIETARIO");
		lblPropietarioX.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnAceptr = new JButton("Aceptar");
		btnAceptr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Mensaje 
				dispose();
			}
		});
		btnAceptr.setBackground(SystemColor.controlHighlight);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(SystemColor.activeCaption);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(74)
					.addComponent(lblPropietarioX, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(240, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(338, Short.MAX_VALUE)
					.addComponent(btnAceptr, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addGap(24))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 550, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(41)
					.addComponent(lblPropietarioX)
					.addGap(25)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnAceptr))
					.addGap(25))
		);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo:");
		
		JComboBox comboBox = new JComboBox();
		
		JLabel lblNewLabel_1_2 = new JLabel("Provincia:");
		
		JComboBox comboBox_1 = new JComboBox();
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Calle:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Telefono:");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Apellido:");
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Dni:");
		
		textDni = new JTextField();
		textDni.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Localidad:");
		
		JComboBox comboBox_1_1 = new JComboBox();
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Numero:");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Email:");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addGap(36)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
									.addGap(77)
									.addComponent(lblNewLabel_1_2_1_1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
									.addGap(24)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
									.addGap(77)
									.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
									.addGap(12))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
									.addContainerGap())))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addGap(4)
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
									.addGap(77)
									.addComponent(lblNewLabel_1_1_1_2, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
									.addGap(124))
								.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
											.addGap(10)
											.addComponent(textNombre))
										.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
											.addGap(4)
											.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)))
									.addGap(77)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(textApellido, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
												.addComponent(comboBox_1_1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(textDni, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))))))
							.addContainerGap())))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(56, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_1_1)
						.addComponent(textApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(5)
							.addComponent(lblNewLabel_2))
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(7)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_1)
								.addComponent(textDni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(5)
							.addComponent(lblNewLabel_1_2))
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_1_1_2)
								.addComponent(comboBox_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_1_2_1))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_2_1_1)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_1_1_1_1_1))
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_1_1_1)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(62))
		);
		panel.setLayout(gl_panel);
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
