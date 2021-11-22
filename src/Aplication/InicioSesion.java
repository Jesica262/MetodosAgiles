package Aplication;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Class.Administrador;
import Class.DTOAdministrador;
import Controller.GestorAdministrador;
import Controller.LoginController;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;

public class InicioSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField textContrasenia;
	private LoginController lc = new LoginController();
	GestorAdministrador ga = GestorAdministrador.get();


	public InicioSesion() {
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
		);
		
		JComboBox comboCargo = new JComboBox();
		comboCargo.setModel(new DefaultComboBoxModel(new String[] {"", "ADMINISTRADOR", "VENDEDOR", "USUARIO", "PROPIETARIO"}));
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textContrasenia = new JTextField();
		textContrasenia.setColumns(10);
		
		JLabel lblContrasea_1 = new JLabel("Cargo:");
		lblContrasea_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(37, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblContrasea_1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtUsuario, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
						.addComponent(lblUsuario, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblContrasea, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
						.addComponent(textContrasenia)
						.addComponent(comboCargo, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(33))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(37, Short.MAX_VALUE)
					.addComponent(lblUsuario)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(lblContrasea)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textContrasenia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(lblContrasea_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(comboCargo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(30))
		);
		panel.setLayout(gl_panel);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.setBackground(UIManager.getColor("controlHighlight"));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String usuario = txtUsuario.getText();
				String contrasenia = textContrasenia.getText();
				String cargo = comboCargo.getSelectedItem().toString();
				
				switch (cargo)
				{
					case "ADMINISTRADOR":
						MenuAdministrador menu = new MenuAdministrador();
						menu.setVisible(true);
						menu.setLocationRelativeTo(null);
						break;
					case "VENDEDOR":
						MenuVendedor menuV = new MenuVendedor();
						menuV.setVisible(true);
						menuV.setLocationRelativeTo(null);
						break;
					case "USUARIO":
						MenuCliente menuC = new MenuCliente();
						menuC.setVisible(true);
						menuC.setLocationRelativeTo(null);
						break;
					default:
						JOptionPane.showMessageDialog(null, "Debe seleccionar un cargo!!");
				}
				
				
			/*	if(lc.validacionVacios(usuario, contrasenia)) {
					DTOAdministrador administradorABuscar = new DTOAdministrador(usuario,contrasenia);
					ArrayList<DTOAdministrador> listaAdministradores;
					try {
						listaAdministradores = ga.buscarAdministrador(administradorABuscar);
						
						if(!listaAdministradores.isEmpty()) {
							VendedorABM vendedorABM = new VendedorABM(listaAdministradores.get(0));
							vendedorABM.setVisible(true);
							vendedorABM.setLocationRelativeTo(null);
							dispose();
							
						}
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
				}*/
	
//				administrador.setNombre(nombre);
//				try {
//					ga.guardar(administrador);
//				} catch (Exception e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
				//	String user = txtUsuario.getText();
				//String password = textContrasenia.getText();
				//Boolean aux = lc.validacionVacios(user, password);
		/*		if(lc.validacionVacios(txtUsuario.getText().toString(), textContrasenia.getText().toString()))
				{
					Menu menu = new Menu();
					menu.setVisible(true);
					menu.setLocationRelativeTo(null);
					dispose();
				}
				else {
			
					informarError();
				}*/
				
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(72, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(70))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(237)
					.addComponent(btnNewButton)
					.addContainerGap(252, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(221)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(238, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(18)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton)
					.addContainerGap(14, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void informarError() {
		JOptionPane.showMessageDialog(null, "Debe completar los datos faltantes");
		
	}
	
	public JTextField getTxtUsuario() {
		return txtUsuario;
	}


	public void setTxtUsuario(JTextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}


	public JTextField getTextContrasenia() {
		return textContrasenia;
	}


	public void setTextContrasenia(JTextField textContrasenia) {
		this.textContrasenia = textContrasenia;
	}
}
