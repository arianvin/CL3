package Interfaces;

import java.util.List;

import model.TblProductocl3;

public interface IProductoCl3 {
	//declaramos los metodos
		public void RegistrarProductoCl3(TblProductocl3 productocl3);
		public void ActualizarProductoCl3(TblProductocl3 productocl3);
		public void EliminarProductoCl3(TblProductocl3 productocl3);
		public TblProductocl3 BuscarProductoCl3(TblProductocl3 productocl3);
		public List<TblProductocl3> ListadoProductocl3();

}//fin de la interface
