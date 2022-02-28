package SRP.Ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VehiculeDao implements Dao{
	private List<Vehicule> _db = Arrays.asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
			new Car("3", "Megane", "Renault"));

	public Vehicule findById(String id) {
		for (Vehicule vehicule : _db) {
			if (vehicule.getId().equals(id)) {
				return vehicule;
			}
		}
		return null;
	}

	public List<Vehicule> findAll() {
		return new ArrayList<>(_db);
	}

}
