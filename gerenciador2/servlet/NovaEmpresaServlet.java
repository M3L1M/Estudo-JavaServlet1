package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;




public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    

	protected void doPost(HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws IOException, ServletException{
		
		
		
		String nomeEmpresa=request.getParameter("nome");
		Empresa empresa=new Empresa();
		empresa.setNome(nomeEmpresa);
		
		Banco banco=new Banco();
		banco.adiciona(empresa);
		
		
		RequestDispatcher rd=request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		request.setAttribute("empresa", empresa.getNome());
		
		rd.forward(request, response);
		
		/*PrintWriter out=response.getWriter();
		out.println("<html><body>Empresa "+nomeEmpresa+" cadastrada com sucesso</body></html>");
		
		System.out.println("EMPRESA CADASTRADA COM SUCESSO");*/
	}

}
