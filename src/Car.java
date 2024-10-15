//Blueprint class.
public class Car {
    private String _model;
    private int _tankSize;
    private double _manfMPG;

    //Constructor class.
    public Car(String model, int tank, double mpg)
    {
        this._model = model;
        _tankSize = tank;
        _manfMPG = mpg;
    }

    //Return the model
    public String getModel()
    {
        return _model;
    }

    //est distance car can travel
    public double estDistance()
    {
        //assume 0.22 gal = litre
        return _tankSize * _manfMPG * 0.22;
    }
}
