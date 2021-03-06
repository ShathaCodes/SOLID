package SRP.Ex2;

import java.util.List;

public class CarRater implements Rater
{
    public Car getBestCar(List<Car> cars)
    {
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) 
                bestCar = car;
        }
        return bestCar;
    }
}
