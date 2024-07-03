package TestEntidad;

import java.util.List;

import Dao.ClassProductoCl3Imp;
import model.TblProductocl3;

public class TestEntidadProductoCl3 {

	public static void main(String[] args) {

		//realizamos la respectiva instancia de las clases...
		TblProductocl3 producto=new TblProductocl3();
		ClassProductoCl3Imp crud=new ClassProductoCl3Imp();
		
		/*	//asignamos valores
		producto.setNombrecl3("Parlante");
		producto.setPrecioventacl3(200.00);
		producto.setPreciocompcl3(150.00);
		producto.setEstadocl3("Nuevo");
		producto.setDescripcl3("Original");
		//invocamos al metodo registrar...
		crud.RegistrarProductoCl3(producto);  
		
		producto.setIdproductocl3(3);
		producto.setNombrecl3("Monitor");
		producto.setPrecioventacl3(500.00);;
		producto.setPreciocompcl3(400.00);;
		producto.setEstadocl3("Usado");;
		producto.setDescripcl3("Oficina"); 
		
		//invocar al metodo actualizar datos en la bd
		crud.ActualizarProductoCl3(producto);    */
		
		
		//eliminar el registro con idcliente
				producto.setIdproductocl3(3);
				//invocamos el metodo eliminar de la bd
				crud.EliminarProductoCl3(producto);  

		
		//testeamos el metodo listado
		List<TblProductocl3> listado=crud.ListadoProductocl3();
		
		//aplicamos un bucle for...
		for(TblProductocl3 lis:listado){
			//imprimimos por pantalla
			System.out.println("Nombre: "+lis.getNombrecl3()+ "\n"+
					"Precio compra: "+lis.getPreciocompcl3()+"\n"+
					"Precio venta: "+lis.getPrecioventacl3()+"\n"+
					"Estado: "+lis.getEstadocl3()+"\n"+
					"Descripcion: "+lis.getDescripcl3()+"\n"+"\n");
		}
		
	}
}
