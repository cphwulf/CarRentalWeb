package WebStuff.cgibin;
public class CgiTest {
	public static void main(String[] args) {
		String opts = System.getProperty("query_string");
		String type = "Content-Type: text/html\n\n";
		String output = "<html>" +
			"<BODY>" +
			"<b>Simple Web Form</b><p>" +
			"<p>Kurt Verner Bor her </p>" +
			"<p>opt: " +  opts + "</p>" +
			"<FORM ACTION=\"/cgi-bin/run.sh\">" +
			"<INPUT TYPE=\"TEXT\" NAME=\"Field\" SIZE=\"25\"><BR>"+
			"<INPUT TYPE=\"SUBMIT\" NAME=\"Submit\" VALUE=\"Submit\">"+
			"</FORM>"+
			"</BODY>"+
			"</html>";
		System.out.println(type);
		System.out.println(output);
	}
}