package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Aluno;

/**
 * Servlet implementation class ControllerAluno
 */
@WebServlet("/ControllerAluno")
public class ControllerAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	public static int id=0;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// Lembrar view nao fala com view, view so fala com o controller
		
		Aluno a = new Aluno();
		
		try {
			
			a.setIdAluno(++id);
			a.setNome(request.getParameter("nome"));
			a.setDisciplina(request.getParameter("disciplina"));
			a.setNota1(new Double(request.getParameter("nota1")));
			a.setNota2(new Double(request.getParameter("nota2")));
		
			if (a.isNome() && a.isDisciplina() && a.isNota1() && a.isNota2()){
				a.setMedia((a.getNota1()+ a.getNota2())/2);
				request.setAttribute("msg", "OK, Dados Enviados: "+a);
			}else {
				//vorta...
				request.setAttribute("msg", "Dados Invalidos");
			}
			
		}catch(Exception ex) {
			request.setAttribute("msg", "error: "+ex.getMessage());
		}
		
		finally {
			request.getRequestDispatcher("sistemaaluno.jsp").forward(request, response);
		}
	}

}
