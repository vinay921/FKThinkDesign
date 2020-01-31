
import java.util.ArrayList;

class Wheel{

    double tyre,rim;

    public Wheel(double rim,double tyre)
    {
        this.rim = rim;
        this.tyre = tyre;
    }

}

class Gear{

    ArrayList<Wheel> wheels;

    public Gear(double[][] data)
    {
        wheelify(data);
    }

    public ArrayList<Double> Diameters()
    {
        ArrayList<Double> diameters = new ArrayList<>();

        for(Wheel wheel:wheels)
        {
            diameters.add(wheel.rim+wheel.tyre*2);
        }

        return diameters;
    }

    public void wheelify(double[][] data)
    {
        for(double[] wheel:data)
        {
            wheels.add(new Wheel(wheel[0],wheel[1]));
        }
    }

}

