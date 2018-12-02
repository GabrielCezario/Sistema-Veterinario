package DAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Model.Cliente;

public class ClienteDAO {
	
	public static void criarCliente(Cliente cliente) {
		
		try {
			
			File file = new File("DataBase\\ClienteDataBase\\" + cliente.getLogin());
			file.mkdir();
			
			if (file.exists()) {
				
				FileOutputStream fi = new FileOutputStream(file  + "\\" + cliente.getLogin() + ".txt");
				ObjectOutputStream os = new ObjectOutputStream(fi);
				
				os.writeObject(cliente);

				os.close();
				fi.close();
				
				File flMensagem = new File("DataBase\\ClienteDataBase\\" + cliente.getLogin() + "\\Mensagem");
				flMensagem.mkdir();
				
				File flMarcacao = new File("DataBase\\ClienteDataBase\\" + cliente.getLogin() + "\\Histórico Marcações");
				flMarcacao.mkdir();
				
				File listaCliente = new File("DataBase\\AtendenteDataBase\\TodosOsClientesDataBase");
				
				FileOutputStream fi2 = new FileOutputStream(listaCliente  + "\\" + cliente.getLogin() + ".txt");
				ObjectOutputStream os2 = new ObjectOutputStream(fi2);
				
				os2.writeObject(cliente);

				os.close();
				fi.close();
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Cliente pesquisarCliente(Cliente cliente) throws FileNotFoundException, IOException, ClassNotFoundException{
			
		ObjectInputStream os = new ObjectInputStream(new FileInputStream("DataBase\\ClienteDataBase\\" + cliente.getLogin()+".txt"));
		Cliente cl = (Cliente) os.readObject();
		
		return cl;
	}
	
	public static void atualizarCliente(Cliente cliente) throws FileNotFoundException, IOException {
		
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("DataBase\\ClienteDataBase\\" + cliente.getLogin() + ".txt"));
		os.writeObject(cliente);
		os.close();
		
	}
	
	public static void deletarCliente(Cliente cliente) throws FileNotFoundException, IOException{
			
		File file = new File("DataBase\\AtendenteDataBase" + cliente.getLogin());
		file.delete();
		
	}

}
