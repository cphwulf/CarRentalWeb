package WebStuff.cgibin;
public class CgiTest {
	public static void main(String[] args) {
		String opts = System.getProperty("query_string");
		String type = "Content-Type: text/html\n\n";
		String output = "<html>" +
			"<p>Kurt Verner Bor her </p>" +
			"<p>opt: " +  opts + "</p>" +
			"<p>Hi there </p>" +
			"</html>";
		System.out.println(type);
		System.out.println(output);
	}
}