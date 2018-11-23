package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Color;

public class JDialogUsuarioCriado extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDialogUsuarioCriado dialog = new JDialogUsuarioCriado();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDialogUsuarioCriado() {
		setBounds(100, 100, 450, 160);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblAtendenteCriadoCom = new JLabel("Cadastrado com Sucesso!!");
		lblAtendenteCriadoCom.setForeground(new Color(0, 128, 0));
		lblAtendenteCriadoCom.setFont(new Font("Arial", Font.BOLD, 25));
		lblAtendenteCriadoCom.setBounds(56, 31, 324, 36);
		contentPanel.add(lblAtendenteCriadoCom);
	}
}
