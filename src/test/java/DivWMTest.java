import static org.junit.Assert.*;
import org.junit.Test;

public class DivWMTest{

    @Test
    public void divide() {
        int[] tests = {-100, 0, 1, 2, 50,100,150 };
        boolean x=true;
        for (int i =0 ; i<7 ;i++){
            DivWM d = new DivWM();
            if(d.divide(tests[i]) == true && (tests[i] <0 || tests[i] >100 )){
                x=false;
                break;
            }
        }
        assertTrue(x);
    }
}