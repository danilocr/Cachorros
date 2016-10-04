package Controllers;

import java.io.IOException;

import ServicesModel.PMF;
import ServicesModel.Usuario;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SaveUsuario extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		String nombre = req.getParameter("nombre");
		String correo = req.getParameter("correo");
		String pass = req.getParameter("pass");
		String pass2 = req.getParameter("pass2");
		String sexo = req.getParameter("sexo");
		
		Usuario p = new Usuario( nombre,  correo,  pass, sexo);
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		resp.setContentType("text/html");
		
		try{
			pm.makePersistent(p);
			resp.sendRedirect("sucess-registroc.jsp");
		}catch(Exception e){
			System.out.println(e);
			resp.sendRedirect("error-registroc.jsp");
		}finally{
			pm.close();
		}
	}
}