package model.serivces;

import java.util.List;
import java.util.function.Predicate;

import model.entities.User;

public class UserService {

	public double filteredSum(List<User> list, Predicate<User> criteria) { // recebendo um predicato como parametro
		double sum = 0;
		for (User u : list) {
			if(criteria.test(u)) {
				sum += u.getSalary();
			}
		}
		return sum;
	}
	
	public void filteredEmail(List<User> list, Predicate<User> criteria) { // recebendo um predicato como parametro
		for (User u : list) {
			if(criteria.test(u)) {
				System.out.println(u.getEmail());
			}
		}
	}
	
}
