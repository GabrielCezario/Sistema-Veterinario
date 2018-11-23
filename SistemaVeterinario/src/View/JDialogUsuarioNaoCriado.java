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
import javax.swing.JTextPane;

public class JDialogUsuarioNaoCriado extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDialogUsuarioNaoCriado dialog = new JDialogUsuarioNaoCriado();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDialogUsuarioNaoCriado() {
		setBounds(100, 100, 450, 160);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblAtendenteCriadoCom = new JLabel("N\u00E3o foi poss\u00EDvel cadastrar");
		lblAtendenteCriadoCom.setForeground(new Color(139, 0, 0));
		lblAtendenteCriadoCom.setFont(new Font("Arial", Font.BOLD, 25));
		lblAtendenteCriadoCom.setBounds(56, 23, 323, 36);
		contentPanel.add(lblAtendenteCriadoCom);
		
		JLabel lbltodosOsCampos = new JLabel("(Todos os campos n\u00E3o foram preenchidos)");
		lbltodosOsCampos.setForeground(new Color(139, 0, 0));
		lbltodosOsCampos.setFont(new Font("Arial", Font.PLAIN, 20));
		lbltodosOsCampos.setBounds(27, 58, 384, 24);
		contentPanel.add(lbltodosOsCampos);
	}
}
