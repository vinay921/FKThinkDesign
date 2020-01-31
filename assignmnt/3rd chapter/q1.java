
interface Circles{
    public double Diameter();
}

class Wheels implements  Circles{

    double tyre,rim;

    public Wheels(double rim,double tyre)
    {
        this.rim = rim;
        this.tyre = tyre;
    }

    public double Diameter()
    {
        return rim+tyre*2;
    }

    public double Circumference()
    {
        return Diameter()* Math.PI;
    }

}

class Gear {


    private double chainring,cog;

    public void setChainring(double chainring)
    {
        this.chainring = chainring;
    }

    public void setCog(double cog)
    {
        this.cog = cog;
    }


    public double getChainring() {
     return this.chainring; 
    }
    public double getCog() { 
        return this.cog; 
    }


    public Gear(double chainring, double cog)
    {
        setChainring(chainring);
        setCog(cog);
    }

    public double Ratio()
    {
        return chainring/cog;
    }

    public double getGearInches(Circles wheel)
    {
        return Ratio()*(wheel.Diameter());
    }

}

