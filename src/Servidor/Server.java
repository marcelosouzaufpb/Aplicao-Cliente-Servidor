package Servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private ServerSocket serverSocket;

	private void criarServerSocket(int porta) throws IOException {
		this.serverSocket = new ServerSocket(porta);
	}

	private Socket esperaConexao() throws IOException {
		Socket socket = serverSocket.accept();
		return socket;
	}

	public static void maim(String[] args) {
		Server server = new Server();
		try {
			server.criarServerSocket(5555);
			Socket socket = server.esperaConexao();	
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
