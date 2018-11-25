package DAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Model.Atendente;

public class AtendenteDAO {
	
	public static void criarAtendente(Atendente atendente) {
		
		try {
			
			File file = new File("DataBase\\AtendenteDataBase\\" + atendente.getLogin());
			file.mkdir();
			
			if (file.exists()) {
				
				FileOutputStream fi = new FileOutputStream(file + "\\" + atendente.getLogin() + ".txt");
				ObjectOutputStream os = new ObjectOutputStream(fi);
				
				os.writeObject(atendente);

				os.close();
				fi.close();
				
				File flMensagem = new File("DataBase\\AtendenteDataBase\\" + atendente.getLogin() + "\\Mensagem");
				flMensagem.mkdir();				
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		
	}
	
	public static Atendente pesquisarAtendente(Atendente atendente) throws FileNotFoundException, IOException, ClassNotFoundException{
			
		ObjectInputStream os = new ObjectInputStream(new FileInputStream("DataBase\\AtendenteDataBase\\" + atendente.getLogin()+".txt"));
		Atendente at = (Atendente) os.readObject();
		
		return at;
	}
	
	public static void atualizarAtendente(Atendente atendente) throws FileNotFoundException, IOException{
			
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("DataBase\\AtendenteDataBase\\"+atendente.getLogin()+".txt"));
		os.writeObject(atendente);
		os.close();
	
	}
	
	public static void deletarAtendente(Atendente atendente) throws FileNotFoundException, IOException{
		
		File file = new File("DataBase\\AtendenteDataBase" + atendente.getLogin());
		file.delete();

		
	}

}
