package WebStuff.cgibin;
public class CgiTest {
	public static void main(String[] args) {
		String opts = System.getProperty("query_string");
		String type = "Content-Type: text/html\n\n";
		String output = "<html>" +
			"<meta http-equiv=\"Refresh\" content=\"1; url=http://team2.netfarmers.dk\">" +
			"<p>Hi there </p>" +
			"<p>opt: " +  opts + "</p>" +
			"<p>Hi there </p>" +
			"</html>";
		System.out.println(type);
		System.out.println(output);
	}
}