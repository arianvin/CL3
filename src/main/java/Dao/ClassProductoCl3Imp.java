package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProductoCl3;
import model.TblProductocl3;

public class ClassProductoCl3Imp implements IProductoCl3{

	public void RegistrarProductoCl3(TblProductocl3 productocl3) {
		//establecer conexion con la unidad de persistencia...
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL3_VINCENTIARIAN");
	    //permite gestionar entidades
		EntityManager em=fabr.createEntityManager();
		//iniciar transaccion
		em.getTransaction().begin();
		//registramos
		em.persist(productocl3);
		//emitimos mensaje por consola
		System.out.println("producto registrado en la BD correctamente");
		//confirmamos
		em.getTransaction().commit();
		//cerramos la transaccion
		em.close();
	}  //fin del metodo registrar...

	public void ActualizarProductoCl3(TblProductocl3 productocl3) {
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL3_VINCENTIARIAN");
		//permite gestionar entidades
		EntityManager em=fabr.createEntityManager();
		//iniciar transaccion
		em.getTransaction().begin();
		//actualizamos
		em.merge(productocl3);
		//comfirmamos 
		em.getTransaction().commit();
		//cerramos
		em.close();
		
		
	}   //fin del metodo actualizar producto..

	public void EliminarProductoCl3(TblProductocl3 productocl3) {
		//establecemos la conexion con unidad de persistencia.
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL3_VINCENTIARIAN");
		//gestionar las entidades
		EntityManager em=fabr.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//recuperamos el codigo a eliminar
		TblProductocl3 elim=em.merge(productocl3);
		//procedemos a eliminar el registro
		em.remove(elim);
		//emitimos mensaje por consola
		System.out.println("Producto eliminado de la base de datos");
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		
	}   //fin del metodo eliminar cliente...

	public TblProductocl3 BuscarProductoCl3(TblProductocl3 productocl3) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TblProductocl3> ListadoProductocl3() {
		//establecemos la conexion con la unidad de persistencia..
        EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL3_VINCENTIARIAN");
        //gestionamos las entidads
        EntityManager em=fabr.createEntityManager();
        //iniciamos la transaccion
        em.getTransaction().begin();
        //recuperamos los clientes  de la base de datos
        //***********utilizando jpql
        List<TblProductocl3> listadoproductos=em.createQuery("select c from TblProductocl3 c",TblProductocl3.class).getResultList();
        //confirmamos la transaccion
        em.getTransaction().commit();
        //cerramos
        em.close();
		return listadoproductos;
	}   //fin del metodo listado cliente.. 

}
