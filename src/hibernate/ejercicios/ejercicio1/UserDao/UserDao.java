package hibernate.ejercicios.ejercicio1.UserDao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import hibernate.ejercicios.ejercicio1.entity.UserEntity;
import hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class UserDao {
	
	private EntityManager em;
	
	public UserDao() {
	em = JpaUtil.getEntityManager();
	}
	
	public List<UserEntity> getUsers(){
		
		List<UserEntity> usuarios = new ArrayList<UserEntity>();
		
		usuarios = em.createQuery("from UserEntity", UserEntity.class).getResultList();
		
		
		return usuarios;
	}
	
	public List<UserEntity> getUserByName(String name){
		
		List<UserEntity> usuarios;
		
		Query query = em.createQuery("from UserEntity ue where ue.nombre?1", UserEntity.class);
		
		query.setParameter(1, name);
		usuarios = query.getResultList(); 
		return usuarios;
	}
	
	public List<UserEntity> getUsersByDate(Date fechaConsulta){
		List<UserEntity> usuarios;
		
		Query query = em.createQuery("from UserEntity ue where ue.fechaAlta>=?1", UserEntity.class);
		
		query.setParameter(1, fechaConsulta);
		usuarios  = query.getResultList();
		
		return usuarios;	
	}
	
	
}
