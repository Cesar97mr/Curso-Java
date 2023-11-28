package hibernate.ejercicios.ejercicio1;

import java.time.LocalDate;
import java.util.List;
import hibernate.ejercicios.ejercicio1.UserDao.UserDao;
import hibernate.ejercicios.ejercicio1.entity.UserEntity;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		UserDao userDao = new UserDao();
		List<UserEntity> usuarios = userDao.getUsers();
		System.out.println("Empieza");
		for (UserEntity ue : usuarios) {
			System.out.println(ue);
		}
		
		System.out.println("Termina");
		
	}
}
