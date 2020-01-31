import java.util.HashMap;

class Gear{

    private double chainring,cog,rim,tyre;
    private Wheels wheel;

    public Gear(double chainring, double cog, double rim, double tyre)
    {
        this.chainring = chainring;
        this.cog = cog;
        this.rim = rim;
        this.tyre = tyre;
        wheel = new Wheels(rim,tyre);
    }

    public double Ratio()
    {
        return chainring/cog;
    }

    public double getGearInches()
    {
        return Ratio()*diameter();
    }

    public double diameter()
    {
        return wheel.getDiameter();
    }

}


public class q4
{

    public q4(HashMap<String,Double> args)
    {
        Gear obj = new Gear(args.get("chainring"),args.get("cog"),args.get("rim"),args.get("tyre"));
    }

}
