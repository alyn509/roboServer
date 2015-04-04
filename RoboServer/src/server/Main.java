package server;

import org.restlet.Server;
import org.restlet.data.Protocol;
import org.restlet.representation.Representation;
import org.restlet.resource.*;



public class Main extends ServerResource {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new Server(Protocol.HTTP, 8182, Main.class).start();
		
		/*		shit for adding stuff in colsole
		new ClientResource("http://restlet.com").get().write(System.out);
		*/
	}
/*
    @Get("txt")
    public String toString() {
        return "hello, world";
    }
    */
	
    @Get("xml|html")
    public Representation  represent() {
        return new ClientResource("http://google.com").get();
    }
}
