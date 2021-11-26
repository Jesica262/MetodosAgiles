package Aplication;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Class.Propietario;
import Controller.GestorPropietario;
import javax.swing.DefaultComboBoxModel;
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
	private GestorPropietario gp = new GestorPropietario();

	public ModificarPropietario(Propietario p) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ABM - Propietario");
		setForeground(SystemColor.inactiveCaption);
		setBackground(SystemColor.inactiveCaption);
		setBounds(100, 100, 600, 650);
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
		
		JLabel lblPropietarioX = new JLabel("MODIFICAR DE PROPIETARIO");
		lblPropietarioX.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(SystemColor.activeCaption);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setText(p.getNombre());
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Apellido:");
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setText(p.getApellido());
		
		JLabel lblNewLabel_2 = new JLabel("Tipo:");
		
		JComboBox comboTipo = new JComboBox();
		comboTipo.setModel(new DefaultComboBoxModel(new String[] {"", "DNI", "CI", "LI", "LE", "LC"}));
		
		JLabel lblNewLabel_1_1 = new JLabel("Dni:");
		
		textDni = new JTextField();
		textDni.setColumns(10);
		textDni.setText(p.getNumeroDocumento().toString());
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Telefono:");
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setText(p.getTelefono().toString());
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Email:");
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setText(p.getEmail());
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Calle:");
		
		textCalle = new JTextField();
		textCalle.setColumns(10);
		textCalle.setText(p.getCalle());
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Numero:");
		
		textNumero = new JTextField();
		textNumero.setColumns(10);
		textNumero.setText(p.getNumeroCalle().toString());
		
		JLabel lblNewLabel_1_2 = new JLabel("Provincia:");
		
		JComboBox comboProvincia = new JComboBox();
		comboProvincia.setModel(new DefaultComboBoxModel(new String[] {"", "Santa fe", "Neuquen", "Jujuy", "Salta", "Catamarca", "Rio Negro", "La Pampa", "Misiones", "Corriente", "Santiago de estero", "Tucuman", "Entre Rios"}));
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Localidad:");
		
		JComboBox comboLocalidad = new JComboBox();
		comboLocalidad.setModel(new DefaultComboBoxModel(new String[] {"", "Rosario", "Santa Fe", "Resistencia", "Santo Tome", "Rincon", "Sauce"}));
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre = textNombre.getText();
				String apellido = textApellido.getText();
				String dni = textDni.getText();
				String telefono = textTelefono.getText();
				String email = textEmail.getText();
				String calle = textCalle.getText();
				String numero = textNumero.getText();
				String tipo = comboTipo.getSelectedItem().toString();
				String provincia = comboProvincia.getSelectedItem().toString();
				String localidad = comboLocalidad.getSelectedItem().toString();
				
				if(gp.validacionVacios(nombre,apellido,dni,telefono,email,calle,numero,tipo,provincia,localidad))
				{
					Propietario p2 = new Propietario();
					Integer nro = Integer.parseInt(numero);
					Long tel = Long.parseLong(telefono);
					Long dniAux = Long.parseLong(dni);
					p2.setNombre(nombre);
					p2.setApellido(apellido);
					p2.setCalle(calle);
					p2.setEmail(email);
					p2.setLocalidad(localidad);
					p2.setNumeroCalle(nro);
					p2.setProvincia(provincia);
					p2.setTelefono(tel);
					p2.setTipoDocumento(tipo);
					p2.setNumeroDocumento(dniAux);
					p2.setIdPropietario(p.getIdPropietario());
					
				
					try {
						gp.modificar(p2);
						mensajeExitosoDeAlta();
						
						textNombre.setText("");
						textApellido.setText("");
						textDni.setText("");
						textTelefono.setText("");
						textEmail.setText("");
						textCalle.setText("");
						textNumero.setText("");
						comboTipo.setSelectedItem("");
						comboProvincia.setSelectedItem("");
						comboLocalidad.setSelectedItem("");
						dispose();
						
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
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(29)
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
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(textEmail, Alignment.LEADING)
							.addComponent(textNumero, Alignment.LEADING)
							.addComponent(comboLocalidad, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel_1_1_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_1_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
							.addComponent(textDni, Alignment.LEADING)
							.addComponent(lblNewLabel_1_1_1_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
							.addComponent(textApellido, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(54)
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
					.addContainerGap(101, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(71)
					.addComponent(lblPropietarioX, GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
					.addGap(192))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(339, Short.MAX_VALUE)
					.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addGap(23))
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(25)
					.addComponent(lblPropietarioX)
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 460, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnModificar))
					.addGap(25))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 574, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void informarErrorDeAlta() {
		
		JOptionPane.showMessageDialog(null, "Es necesario completar todos los campos para modificar el Propietario");
		
	}
	public void mensajeExitosoDeAlta()
	{
		JOptionPane.showMessageDialog(null, "Propietario modificado con exito");
	}
}
