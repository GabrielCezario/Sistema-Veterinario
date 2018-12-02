package View;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Inicio extends JPanel {

	/**
	 * Create the panel.
	 */
	public Inicio() {
		setLayout(null);
		
		JLabel lblSistemaVeterinrio = new JLabel("Sistema Veterin\u00E1rio");
		lblSistemaVeterinrio.setFont(new Font("Arial", Font.PLAIN, 25));
		lblSistemaVeterinrio.setHorizontalAlignment(SwingConstants.CENTER);
		lblSistemaVeterinrio.setBounds(171, 37, 309, 39);
		add(lblSistemaVeterinrio);
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Main.getFrame().setContentPane(new LoginCliente());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnCliente.setBounds(73, 373, 89, 23);
		add(btnCliente);
		
		JButton btnAtendente = new JButton("Atendente");
		btnAtendente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Main.getFrame().setContentPane(new LoginAtendente());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnAtendente.setBounds(290, 373, 89, 23);
		add(btnAtendente);
		
		JButton btnVeterinrio = new JButton("Veterin\u00E1rio");
		btnVeterinrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new LoginVeterinario());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		btnVeterinrio.setBounds(477, 373, 103, 23);
		add(btnVeterinrio);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Gabriel\\git\\Sistema-Veterinario\\SistemaVeterinario\\Imagens\\imgAnimais.png"));
		lblNewLabel.setBounds(10, 107, 620, 174);
		add(lblNewLabel);

	}
}
