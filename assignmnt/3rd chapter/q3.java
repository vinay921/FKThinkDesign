class Gear{
    private double chainring,cog,rim,tyre;
    private Wheels wheel;

    public Gear3(double chainring, double cog, double rim, double tyre)
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

