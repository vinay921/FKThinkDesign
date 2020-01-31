
class Gear{

    double chainring,cog;

    public Gear1(double chainring,double cog)
    {
        this.chainring = chainring;
        this.cog = cog;
    }

    public double Ratio()
    {
        return chainring/cog;

    }

}

