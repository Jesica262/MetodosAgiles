package Aplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class MostrarFoto extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostrarFoto frame = new MostrarFoto(null);
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
	public MostrarFoto(ImageIcon imagen) {
		setTitle("Foto del Inmueble");
		Image im = imagen.getImage();
		Image nueva = im.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
		imagen= new ImageIcon(nueva);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setVerticalAlignment(SwingConstants.BOTTOM);
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		panel.add(btnCerrar);
		
		JLabel lblFoto = new JLabel("");
		lblFoto.setVerticalAlignment(SwingConstants.TOP);
		lblFoto.setIcon(imagen);
		panel.add(lblFoto);
	}

}
