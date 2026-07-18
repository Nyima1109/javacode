package lab9;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Palindrome extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get input from user
        String input = request.getParameter("input");

        // Reverse the input
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

        // Check palindrome
        out.println("<html><body>");
        out.println("<h2>Palindrome Result</h2>");

        if (input.equalsIgnoreCase(reverse)) {
            out.println(input + " is a <b>Palindrome</b>");
        } else {
            out.println(input + " is <b>Not a Palindrome</b>");
        }

        out.println("</body></html>");
    }
}
