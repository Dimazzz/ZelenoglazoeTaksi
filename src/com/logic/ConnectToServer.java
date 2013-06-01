package com.logic;

import java.net.*;

public class ConnectToServer extends Thread {
	public static void Connect(){
		try{
			int port = 9595;
			Socket s = new Socket("localhost", port);
		
			s.getInetAddress().getHostAddress();
			s.getLocalPort();
			
			s.getOutputStream().write(1);
			//read message
			byte buf[] = new byte[64*1024];
			int r = s.getInputStream().read(buf);
			String data = new String(buf, 0, r);
			
			//выводим дату куда нужно
		}
		catch(Exception e){
			//ошибка 
		}
	}
}