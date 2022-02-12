package powerpackage;

import org.junit.Test;

public class PowerTest {
    @Test
    public void oneRaisedToOneIsOnew() {
        assert powerfinder.OF(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneIs2() {
        assert powerfinder.OF(2,1) == 2;
    }

    @Test
    public void twoPower2Is4() {
        assert powerfinder.OF(2, 2) == 4;
    }

    @Test
    public void powerOf2And3IsSIX() {
        assert powerfinder.OF(3, 2) == 3*3;
    }
}
