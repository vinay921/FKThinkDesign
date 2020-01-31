
class Gear{

    double chainring,cog,rim,tyre;

    public Gear(double chainring,double cog,double rim,double tyre)
    {
        this.chainring = chainring;
        this.cog = cog;
        this.rim = rim;
        this.tyre = tyre;
    }

    public double Ratio()
    {
        return chainring/cog;
    }

    public double getGearInches()
    {
        return Ratio()*(rim+tyre*2);
    }

}

