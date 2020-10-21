import java.io.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class webInterface extends HttpServlet {

    private static final long serialVersionUID = 102831973239L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<p><Strong>POG!!!!!!</Strong></p>");
        out.println("<p><a href = /PAsystem> Go Back</a></p>");
        out.println("<iframe width=420 height=315 src=https://www.youtube.com/embed/tgbNymZ7vqY?autoplay=1&controls=0> </iframe>");
        out.println("</body></html>");
    }
}
