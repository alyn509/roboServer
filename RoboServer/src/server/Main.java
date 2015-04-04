package server;

import org.restlet.Server;
import org.restlet.data.MediaType;
import org.restlet.data.Protocol;
import org.restlet.representation.FileRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.*;



public class Main extends ServerResource {
	
	public static void main(String[] args) throws Exception {

		new Server(Protocol.HTTP, 8182, Main.class).start();
	}
	
    @Get("xml|html")
    public Representation represent() {
        return new FileRepresentation("./html/thing.html", MediaType.TEXT_HTML);
    }
}
