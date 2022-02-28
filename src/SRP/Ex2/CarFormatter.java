package SRP.Ex2;

import java.util.List;

public class CarFormatter implements Formatter{
	public String getCarsNames(List<Car> cars) {
		StringBuilder sb = new StringBuilder();
		for (Car car : cars) {
			sb.append(getCarName(car));
			sb.append(", ");
		}
		return sb.substring(0, sb.length() - 2);
	}

	public String getCarName(Car car) {
		StringBuilder sb = new StringBuilder();
		sb.append(car.getBrand());
		sb.append(" ");
		sb.append(car.getModel());
		return sb.substring(0, sb.length() - 2);
	}
}
