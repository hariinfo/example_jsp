package org.example.jakarta.hello;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
          throws ServletException, IOException {

    // Set a request attribute
    req.setAttribute("responseMessage", "This is a forwarded message from the Servlet!");

    // Forward to JSP
    RequestDispatcher dispatcher = req.getRequestDispatcher("/display.jsp");
    dispatcher.forward(req, resp);
  }
}
