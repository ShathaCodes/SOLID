package SRP.Ex2;

public class CarManager
{
    private final Dao _carDao;
    private final Formatter _carFormatter;
    private final Rater _carRater;

    public CarManager(VehiculeDao vehiculeDao, CarFormatter carFormatter, CarRater carRater)
    {
        _carDao = vehiculeDao;
        _carFormatter = carFormatter;
        _carRater = carRater;
    }

    public Car getCarById(final String carId)
    {
        return (Car)_carDao.findById(carId);
    }

    public String getCarsNames()
    {
        return _carFormatter.getCarsNames(_carDao.findAll());
    }

    public Car getBestCar()
    {
        return _carRater.getBestCar(_carDao.findAll());
    }
}
