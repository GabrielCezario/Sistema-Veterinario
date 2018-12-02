package DAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Model.Veterinario;

public class VeterinarioDAO {
	
	public static void criarVeterinario(Veterinario veterinario) {
		
		try {
			
			File file = new File("DataBase\\VeterinarioDataBase\\" + veterinario.getLogin());
			file.mkdir();
			
			if (file.exists()) {
				
				FileOutputStream fi = new FileOutputStream(file  + "\\" + veterinario.getLogin() + ".txt");
				ObjectOutputStream os = new ObjectOutputStream(fi);
				
				os.writeObject(veterinario);

				os.close();
				fi.close();
				
				File flMensagem = new File("DataBase\\VeterinarioDataBase\\" + veterinario.getLogin() + "\\Mensagem");
				flMensagem.mkdir();
				
				File flMarcacao = new File("DataBase\\VeterinarioDataBase\\" + veterinario.getLogin() + "\\Histórico Marcações");
				flMarcacao.mkdir();
				
				File listaVeterinario = new File("DataBase\\AtendenteDataBase\\TodosOsVeterinariosDataBase");
				
				FileOutputStream fi2 = new FileOutputStream(listaVeterinario  + "\\" + veterinario.getLogin() + ".txt");
				ObjectOutputStream os2 = new ObjectOutputStream(fi2);
				
				os2.writeObject(veterinario);

				os.close();
				fi.close();
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Veterinario pesquisarVeterinario(Veterinario veterinario) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream os = new ObjectInputStream(new FileInputStream("DataBase\\VeterinarioDataBase\\" + veterinario.getLogin() + ".txt"));
		Veterinario vt = (Veterinario) os.readObject();		
		
		return vt;
	}
	
	public static void atualizarVeterinario(Veterinario veterinario) throws FileNotFoundException, IOException {
		
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("DataBase\\VeterinarioDataBase\\" + veterinario.getLogin() + ".txt"));
		os.writeObject(veterinario);
		os.close();
		
	}
	
	public static void deletarVeterinario(Veterinario veterinario) {
		
		File file = new File("DataBase\\VeterinarioDataBase\\" + veterinario.getLogin());
		file.delete();
		
	}

}
