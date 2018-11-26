package View;

import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFrame;


public class Main {

	private static JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					IniciarDB();
					
					Main window = new Main();
					window.frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
				
				//Mudando o LAF do projeto!
				
		        try {
		            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		                if ("Windows".equals(info.getName())) {
		                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
		                    break;
		                }
		            }
		        } catch (ClassNotFoundException ex) {
		            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (InstantiationException ex) {
		            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (IllegalAccessException ex) {
		            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
		            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        }
		        
		        //===========================================================================================================
				
			}
		});
	}


	public Main() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 645, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setContentPane(new Inicio());		
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

	}
	
	public static JFrame getFrame() {
		return frame;
	}
	
	public static void IniciarDB() {
		
		File DataBase = new File("DataBase");
		File ClienteDataBase = new File("DataBase\\ClienteDataBase");
		File AtendenteDataBase = new File("DataBase\\AtendenteDataBase");
		File VeterinarioDataBase = new File("DataBase\\VeterinarioDataBase");
		
		if (!DataBase.exists()) {
			DataBase.mkdir();
			
			if (!ClienteDataBase.exists()) {
				ClienteDataBase.mkdir();
			}
			
			if (!AtendenteDataBase.exists()) {
				AtendenteDataBase.mkdir();
			}
			
			if (!VeterinarioDataBase.exists()) {
				VeterinarioDataBase.mkdir();
			}
		}
		
	}

}
