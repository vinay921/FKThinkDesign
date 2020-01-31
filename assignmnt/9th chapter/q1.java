
import static org.junit.Assert.*;
import org.junit.Test;

class GearTest{
    public void test(){
        Gear1 gear = new Gear1(52,11,26,2);
        assertEquals(137.1,gear.gear_inches());

    }
}

class Gear{


    double chainring ;
    double cog;
    double rim;
    double tyre;


    public Gear(double chainring,double cog, double rim, double tyre)
    {
        this.chainring = chainring;
        this.cog = cog;
        this.rim = rim;
        this.tyre = tyre;
    }


    double ratio()
    {
        return chainring/cog;
    }

    double gear_inches()
    {
        Wheel1 wheel = new Wheel1(rim,tyre);

        return ratio()*wheel.diameter();
    }
}


class Wheel{

    double rim;
    double tyre;

    public Wheel(double rim,double tyre)
    {
        this.rim = rim;
        this.tyre = tyre;
    }

    double diameter()
    {
        return rim + (tyre*2);

    }

}
