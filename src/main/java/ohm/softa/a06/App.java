package ohm.softa.a06;

import com.google.gson.Gson;
import ohm.softa.a06.model.Joke;

/**
 * @author Peter Kurfer
 * Created on 11/10/17.
 * Annot. "serializedName": https://www.javadoc.io/doc/com.google.code.gson/gson/latest/com.google.gson/com/google/gson/annotations/SerializedName.html
 */
public class App {

	public static void main(String[] args) {
		// TODO fetch a random joke and print it to STDOUT
		Gson gson = new Gson();

		// JSON String --> Java Object
		Joke2 j = gson.fromJson("{\"id\": 0, \"value\": \"Haha.\"}", Joke2.class);
		// categories remains `null`

		System.out.println(j.id);
		// Object --> JSON String
		String json = gson.toJson(j);
		System.out.println(json);
	}

}
class Joke2 {
	String id;
	String value;
	String[] categories;
}
