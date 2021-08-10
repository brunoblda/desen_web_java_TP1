package br.edu.infnet.model.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.model.domain.Usuario;


public class CadastroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CadastroController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.getRequestDispatcher("index.html").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Usuario usuario = new Usuario(request.getParameter("nome"), request.getParameter("email"), request.getParameter("senha"));
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Confirma</title>\r\n"
				+ "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "\r\n"
				+ "<div class=\"container\">\r\n"
				+ "  <h2>Usuário Cadastrado com sucesso</h2>\r\n"
				+ "  <h3>" + usuario + "</h3> \r\n"
				+ "  <form action=\"CadastroController\" method=\"get\">\r\n"
				+ "    <button type=\"submit\" class=\"btn btn-default\">Voltar</button>\r\n"
				+ "  </form>\r\n"
				+ "</div>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "</html>");
		
		//request.getRequestDispatcher("confirmacao.html").forward(request, response);
		
	}

}
