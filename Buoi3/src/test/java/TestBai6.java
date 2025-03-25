import com.example.Test2.Bai6;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestBai6 {
    Bai6 bai6 = new Bai6();

    @Test
    void test1() {
        int[] n = {2, 4, 1, 6, 4};
        assertEquals(1, bai6.PhanTu(n));
    }

    @Test
    void test2() {
        int[] n = {0, 1, 2};
        assertEquals(0, bai6.PhanTu(n));
    }

    @Test
    void test3() {
        int[] n = {0, 2, -1, 3};
        assertEquals(-1, bai6.PhanTu(n));
    }

    @Test
    void test4() {
        int[] n = {200, 394, 203, 183};
        assertEquals(183, bai6.PhanTu(n));
    }

    @Test
    void test5() {
        int[] n = {};
        assertThrows(ArithmeticException.class, () -> bai6.PhanTu(n));
    }
}
