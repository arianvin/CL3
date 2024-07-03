package TestEntidad;

import java.util.List;

import Dao.ClassUsuarioCl3Imp;
import model.TblUsuariocl3;

public class TestEntidadUsuarioCl3 {
	public static void main(String[] args) {

		//realizamos la respectiva instancia de las clases...
		TblUsuariocl3 usuario=new TblUsuariocl3();
		ClassUsuarioCl3Imp crud=new ClassUsuarioCl3Imp();
		//asignamos valores
		usuario.setUsuariocl3("arian");
		usuario.setPasswordcl3("123");
		//invocamos al metodo registrar...
		crud.RegistrarUsuarioCl3(usuario);
		
		//testeamos el metodo listado
		List<TblUsuariocl3> listado=crud.ListadoUsuariocl3();
		//aplicamos un bucle for...
		for(TblUsuariocl3 lis:listado){
			
			//imprimimos por pantalla
			System.out.println("Usuario: "+lis.getUsuariocl3()+
					"Password: "+lis.getPasswordcl3());
		}
		
		
		

		
		
		
		
		
	}//fin del metodo main

}//fin de todo