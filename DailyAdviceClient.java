import java.io.*;
import java.net.*;

public class DailyAdviceClient {

	public void go()
	{
		try
		{
			Socket s = new Socket("192.168.10.102", 3847);//Create a socket with server's IP and port
			//Chain some streams together and use a BufferedReader
			InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
			BufferedReader reader = new BufferedReader(streamReader);
			
			String advice = reader.readLine();
			System.out.println("Today " + advice );
			
			reader.close();
		}
		catch( IOException ex)
		{
			ex.printStackTrace();
		}
	}
	public static void main(String[] args) {
		DailyAdviceClient client = new DailyAdviceClient();
		client.go();
			
	}

}
