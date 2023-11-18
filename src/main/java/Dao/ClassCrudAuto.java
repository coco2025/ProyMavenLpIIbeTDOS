package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.Iautoable;
import model.TblAuto;

public class ClassCrudAuto implements Iautoable {

	@Override
	public void RegistrarAuto(TblAuto tblauto) {
		//establecer conexion con la unidad
				//persistencia...
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("ProyectoLPIIMAVENTDOS");
				EntityManager em=fabri.createEntityManager();
				//iniciamos la transaccion...
				em.getTransaction().begin();
				//registramos
				em.persist(tblauto);
				//confirmamos
				em.getTransaction().commit();
				//cerramos
				em.close();
		
		
	}//fin del metodo registrar...

	@Override
	public void ActualizarAuto(TblAuto tblauto) {
		//establecer conexion con la unidad
		//persistencia...
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("ProyectoLPIIMAVENTDOS");
		EntityManager em=fabri.createEntityManager();
		//iniciamos la transaccion...
		em.getTransaction().begin();
		//actualizar
		em.merge(tblauto);
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		
	}  //fin del metodo actualizar

	@Override
	public void EliminarAuto(TblAuto tblauto) {
		//establecer conexion con la unidad
				//persistencia...
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("ProyectoLPIIMAVENTDOS");
				EntityManager em=fabri.createEntityManager();
				//iniciamos la transaccion...
				em.getTransaction().begin();
				//recuperamos el codigo a eliminar
				TblAuto elim=em.merge(tblauto);
				//eliminamos
				em.remove(elim);
				//confirmamos
				em.getTransaction().commit();
				//cerramos
				em.close();
		
	}  //fin del metodo eliminar...

	@Override
	public TblAuto BuscarAuto(TblAuto tblauto) {
		//establecer conexion con la unidad
				//persistencia...
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("ProyectoLPIIMAVENTDOS");
				EntityManager em=fabri.createEntityManager();
				//iniciamos la transaccion...
				em.getTransaction().begin();
				//buscar por codigo
				TblAuto buscar=em.find(TblAuto.class,tblauto.getIdauto());
				//confirmamos
				em.getTransaction().commit();
				//cerramos
				em.close();
		return buscar;
	}  //fin del metodo buscar auto...

	@Override
	public List<TblAuto> ListarAuto() {
		//establecer conexion con la unidad
				//persistencia...
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("ProyectoLPIIMAVENTDOS");
				EntityManager em=fabri.createEntityManager();
				//iniciamos la transaccion...
				em.getTransaction().begin();
				//listado
				List<TblAuto> listar=em.createQuery("select a from TblAuto a",TblAuto.class).getResultList();
				//confirmamos
				em.getTransaction().commit();
				//cerramos
				em.close();
		        return listar;
	}  //fin del metodo listadoauto....

}  //fin de la clase classcrudauto
