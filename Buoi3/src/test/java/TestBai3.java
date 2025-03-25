import com.example.Test2.Bai3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestBai3 {
    @Test
    void testMangCoBaPhanTu() {
        int[] n = {2, 2, 2};
        assertEquals(2, Bai3.tinhTBC(n));
    }

    @Test
    void testMangMotPhanTu() {
        int[] n = {10};
        assertEquals(10, Bai3.tinhTBC(n));
    }

    @Test
    void testMangNhieuPhanTu() {
        int[] n = {2, 3, 4, 5};
        assertEquals(3.5f, Bai3.tinhTBC(n));
    }

    @Test
    void testMangSoAm() {
        int[] n = {-1, -4, -5, -6};
        assertEquals(-4, Bai3.tinhTBC(n));
    }

    @Test
    void testMangHaiSoGiongNhau() {
        int[] n = {1, 1};
        assertEquals(1, Bai3.tinhTBC(n));
    }

    @Test
    void testMangCoSoKhong() {
        int[] n = {0};
        assertEquals(0, Bai3.tinhTBC(n));
    }

    @Test
    void testMangSoLon() {
        int[] n = {10000, 20000};
        assertEquals(15000, Bai3.tinhTBC(n));
    }

    @Test
    void testMangSoAmVaDuong() {
        int[] n = {-1, 1};
        assertEquals(0, Bai3.tinhTBC(n));
    }

    @Test
    void testMangHaiSoChenhLechLon() {
        int[] n = {2, 2000};
        assertEquals(1001, Bai3.tinhTBC(n));
    }

    @Test
    void testMangRong() {
        int[] n = {};
        assertThrows(ArithmeticException.class, () -> Bai3.tinhTBC(n));
    }
}
