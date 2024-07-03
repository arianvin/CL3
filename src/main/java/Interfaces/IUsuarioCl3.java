package Interfaces;

import java.util.List;

import model.TblUsuariocl3;

public interface IUsuarioCl3 {
	
	//declaramos los metodos
	public void RegistrarUsuarioCl3(TblUsuariocl3 usuariocl3);
	public void ActualizarUsuarioCl3(TblUsuariocl3 usuariocl3);
	public void EliminarUsuarioCl3(TblUsuariocl3 usuariocl3);
	public TblUsuariocl3 BuscarUsuarioCl3(TblUsuariocl3 usuariocl3);
	public List<TblUsuariocl3> ListadoUsuariocl3();

}//fin de la interfaz
