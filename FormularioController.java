package br.edu.infnet.model;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FormularioController")
public class FormularioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
     
    public FormularioController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("<html>");
		System.out.println("<head>");
		System.out.println("</head");
		System.out.println("<body>");
		System.out.println("nome" + request.getContextPath());
		System.out.println("email" + request.getContextPath());
		System.out.println("senha" + request.getContextPath());
		System.out.println("</body>");
		 System.out.println("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
