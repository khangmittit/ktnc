import com.example.Test2.Bai4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBai4 {
    @Test
    void testLayPhanTuDauTien() {
        int[] n = {1, 2, 3, 4, 5};
        assertEquals(1, Bai4.getElementAtIndex(n, 0));
    }

    @Test
    void testLayPhanTuThuBa() {
        int[] n = {1, 2, 3, 4, 5};
        assertEquals(4, Bai4.getElementAtIndex(n, 3));
    }

    @Test
    void testLayPhanTuCuoiCung() {
        int[] n = {1, 2, 3, 4, 5};
        assertEquals(5, Bai4.getElementAtIndex(n, 4));
    }

    @Test
    void testIndexAm() {
        int[] n = {1, 2, 3, 4, 5};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Bai4.getElementAtIndex(n, -1));
    }

    @Test
    void testIndexVuotQuaDoDaiMang() {
        int[] n = {1, 2, 3, 4, 5};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Bai4.getElementAtIndex(n, 5));
    }
}
