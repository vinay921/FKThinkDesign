
import junit.framework.*;

import static org.junit.Assert.*;
import org.junit.Test;

class WheelTest{
    public void test(){
        Wheel2 wheel = new Wheel2(26, 2);
        assertEquals(30,wheel.diameter());

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
