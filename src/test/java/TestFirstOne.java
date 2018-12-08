import com.grab.test.FirstOne;
import org.junit.Test;

import java.util.List;

/**
 * Created by liweiwei.li on 2018/12/8.
 */
public class TestFirstOne {
    @Test
    public void testFirstOne(){
        int n = 10;             //指定数n
        FirstOne firstOne = new FirstOne();
        int[] origin = {1, 2, 3, 5, 7, 8, 9, 9};
        String result = firstOne.searchSum(origin,n);
        System.out.print(result);
    }


}
