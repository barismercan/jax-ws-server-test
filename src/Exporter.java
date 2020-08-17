

import javax.xml.ws.Endpoint;

import com.baris.services.FighterServiceImpl;

public class Exporter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Endpoint.publish("http://localhost:8091/fighterservice", new FighterServiceImpl());
	}

}
