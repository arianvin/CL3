package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassUsuarioCl3Imp;
import model.TblUsuariocl3;
/**
 * Servlet implementation class ControladorUsuarioCl3
 */
public class ControladorUsuarioCl3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorUsuarioCl3() {
        super();
        // TODO Auto-generated constructor stub
    }   //fin del constrolador

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		TblUsuariocl3 usuariocl3=new TblUsuariocl3();
		ClassUsuarioCl3Imp crud=new ClassUsuarioCl3Imp();
		List<TblUsuariocl3> listadousuariocl3=crud.ListadoUsuariocl3();
		//invocamos el listado  de productos para la vista
		request.setAttribute("listadodeusuarioscl3",listadousuariocl3);
		//redireccionamos
		//request.getRequestDispatcher("/ListadoUsuariosCl3.jsp").forward(request, response);
		
		//recuperamos la accion y codigo
		String accion=request.getParameter("accion");
		//aplicamos una condicion...
		if(accion!=null){
			switch(accion){
			case "Modificar":
				int codigo=Integer.parseInt(request.getParameter("cod"));
				//asignar el codigo...
				usuariocl3.setIdusuariocl3(codigo);
				TblUsuariocl3 buscarcod=crud.BuscarUsuarioCl3(usuariocl3);
				//enviar los valores buscados por codigo de la base de datos
				//al formulario actualizar..
				request.setAttribute("usuariocl3",buscarcod.getUsuariocl3());
				request.setAttribute("passwordcl3",buscarcod.getPasswordcl3());
				//redireccionar..
				request.getRequestDispatcher("/FormActualizarUsuarioCl3.jsp").forward(request, response);
				//salimos
				break;
			case "Eliminar":
				int codeliminar = Integer.parseInt(request.getParameter("cod"));
				//asignamos el codigo a eliminar
				usuariocl3.setIdusuariocl3(codeliminar);
				//invocamos al metodo eliminar
				crud.EliminarUsuarioCl3(usuariocl3);
				//refrescas listado
				List<TblUsuariocl3> listado = crud.ListadoUsuariocl3();
				request.setAttribute("listadodeusuarios", listado);
				//redireccionar
				request.getRequestDispatcher("/ListadoUsuariosCl3.jsp").forward(request, response);
				//salimos
				break;
			 }  //fin del switch...		
		}   //fin del if...
			
		
	} //fin del metodo doget..

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		//recuperamos los valores del formulario...
		String usuariocl3=request.getParameter("usuariocl3");
		String passwordcl3=request.getParameter("passwordcl3");
		
		//instanciar las respectivas entidades...
		TblUsuariocl3 usuario=new TblUsuariocl3();
		ClassUsuarioCl3Imp crud=new ClassUsuarioCl3Imp();
		//asignamos valores
		usuario.setUsuariocl3(usuariocl3);
		usuario.setPasswordcl3(passwordcl3);
		//invocamos la metodo registrar...
		crud.RegistrarUsuarioCl3(usuario);
		//actualizador listado de clientes
		List<TblUsuariocl3> listadousuariocl3=crud.ListadoUsuariocl3();
		//invocamos el listado  de productos para la vista
		request.setAttribute("listadodeusuarioscl3",listadousuariocl3);
		//redireccionamos
		request.getRequestDispatcher("/ListadoUsuariosCl3.jsp").forward(request, response);

	}  //fin del metodo dopost...

}//fin de todo
