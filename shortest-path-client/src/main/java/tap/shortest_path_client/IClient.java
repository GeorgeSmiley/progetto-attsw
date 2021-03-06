package tap.shortest_path_client;

import java.io.IOException;
import java.util.List;

import com.google.gson.JsonSyntaxException;

public interface IClient {
	public List<String> getAllTables() throws JsonSyntaxException, IOException;
	public GridFromServer retrieveGrid(String name) throws JsonSyntaxException, IOException;
	public List<String> getShortestPath(String fromName, String toName, String where)throws JsonSyntaxException, IOException;
}
