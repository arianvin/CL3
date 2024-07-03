package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuarioCl3;
import model.TblUsuariocl3;

public class ClassUsuarioCl3Imp implements IUsuarioCl3{

	@Override
	public void RegistrarUsuarioCl3(TblUsuariocl3 usuariocl3) {
		//establecer conexion con la unidad de persistencia...
				EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL3_VINCENTIARIAN");
			    //permite gestionar entidades
				EntityManager em=fabr.createEntityManager();
				//iniciar transaccion
				em.getTransaction().begin();
				//registramos
				em.persist(usuariocl3);
				//emitimos mensaje por consola
				System.out.println("usuario registrado en la BD correctamente");
				//confirmamos
				em.getTransaction().commit();
				//cerramos la transaccion
				em.close();
			}  //fin del metodo registrar...

	@Override
	public void ActualizarUsuarioCl3(TblUsuariocl3 usuariocl3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarUsuarioCl3(TblUsuariocl3 usuariocl3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TblUsuariocl3 BuscarUsuarioCl3(TblUsuariocl3 usuariocl3) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TblUsuariocl3> ListadoUsuariocl3() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
