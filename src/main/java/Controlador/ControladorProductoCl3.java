package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassProductoCl3Imp;
import model.TblProductocl3;

/**
 * Servlet implementation class ControladorProductoCl3
 */
public class ControladorProductoCl3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProductoCl3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				//response.getWriter().append("Served at: ").append(request.getContextPath());
				TblProductocl3 productocl3=new TblProductocl3();
				ClassProductoCl3Imp crud=new ClassProductoCl3Imp();
				List<TblProductocl3> listadoproductocl3=crud.ListadoProductocl3();
				//invocamos el listado  de productos para la vista
				request.setAttribute("listadodeproductoscl3",listadoproductocl3);
				//redireccionamos
				//request.getRequestDispatcher("/ListadoProductosCl3.jsp").forward(request, response);
				
				//recuperamos la accion y codigo
				String accion=request.getParameter("accion");
				//aplicamos una condicion...
				if(accion!=null){
					switch(accion){
					case "Modificar":
						int codigo=Integer.parseInt(request.getParameter("cod"));
						//asignar el codigo...
						productocl3.setIdproductocl3(codigo);
						TblProductocl3 buscarcod=crud.BuscarProductoCl3(productocl3);
						//enviar los valores buscados por codigo de la base de datos
						//al formulario actualizar..
						request.setAttribute("codigo",buscarcod.getIdproductocl3());
						request.setAttribute("nombre", buscarcod.getNombrecl3());
						request.setAttribute("precioven", buscarcod.getPrecioventacl3());
						request.setAttribute("preciocom", buscarcod.getPreciocompcl3());
						request.setAttribute("estado", buscarcod.getEstadocl3());
						request.setAttribute("descrip", buscarcod.getDescripcl3());
						
						//redireccionar..
						request.getRequestDispatcher("/FormActualizarProductoCl3.jsp").forward(request, response);
						//salimos
						break;
					case "Eliminar":
						int codeliminar = Integer.parseInt(request.getParameter("cod"));
						//asignamos el codigo a eliminar
						productocl3.setIdproductocl3(codeliminar);
						//invocamos al metodo eliminar
						crud.EliminarProductoCl3(productocl3);
						//refrescas listado
						List<TblProductocl3> listado = crud.ListadoProductocl3();
						request.setAttribute("listadodeproductos", listado);
						//redireccionar
						request.getRequestDispatcher("/ListadoProductosCl3.jsp").forward(request, response);
						//salimos
						break;
					
					case "Listar":
						List<TblProductocl3> listado2= crud.ListadoProductocl3();
						//invocamos el listado de productos para la vista
						request.setAttribute("listadodeproductos", listado2);
						//redireccionamos
						request.getRequestDispatcher("/FormRegistrarProductoCl3.jsp").forward(request, response);
						
					
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
				String codigo=request.getParameter("codigo");
				String nombre=request.getParameter("nombre");
				String preciovenstr=request.getParameter("precioven");
				String preciocomstr=request.getParameter("preciocom");
				String estado=request.getParameter("estado");
				String descrip=request.getParameter("descrip");
				
				double preciocompcl3 = Double.parseDouble(preciocomstr);
		        double preciovencl3 = Double.parseDouble(preciovenstr);
				
				//instanciar las respectivas entidades...
				TblProductocl3 producto=new TblProductocl3();
				ClassProductoCl3Imp crud=new ClassProductoCl3Imp();
				//asignamos valores
				producto.setNombrecl3(nombre);
				producto.setPrecioventacl3(preciovencl3);
				producto.setPreciocompcl3(preciocompcl3);
				producto.setEstadocl3(estado);
				producto.setDescripcl3(descrip);
				//invocamos la metodo registrar...
				crud.RegistrarProductoCl3(producto);
				//actualizador listado de clientes
				List<TblProductocl3> listadoproducto=crud.ListadoProductocl3();
				//invocamos el listado  de productos para la vista
				request.setAttribute("listadodeproductos",listadoproducto);
				//redireccionamos
				request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);

			}  //fin del metodo dopost...

}
