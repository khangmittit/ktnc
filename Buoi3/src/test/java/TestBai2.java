import com.example.Test2.Bai2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestBai2 {
    @Test
    void testThuongSoDuong() {
        assertEquals(2, Bai2.thuong(2, 1));
    }

    @Test
    void testThuongSoNhoHonMot() {
        assertEquals(0.5f, Bai2.thuong(1, 2));
    }

    @Test
    void testThuongHaiSoBangNhau() {
        assertEquals(1, Bai2.thuong(1, 1));
    }

    @Test
    void testThuongSoKhong() {
        assertEquals(0, Bai2.thuong(0, 1));
    }

    @Test
    void testThuongSoAmVaDuong() {
        assertEquals(-1, Bai2.thuong(1, -1));
    }

    @Test
    void testThuongSoLon() {
        assertEquals(50, Bai2.thuong(100, 2));
    }

    @Test
    void testThuongSoAmVaSoLon() {
        assertEquals(-50, Bai2.thuong(-100, 2));
    }

    @Test
    void testThuongSoDuongVaSoLon() {
        assertEquals(6, Bai2.thuong(12, 2));
    }

    @Test
    void testThuongSoBienTren() {
        assertEquals(Integer.MAX_VALUE, Bai2.thuong(Integer.MAX_VALUE, 1));
    }

    @Test
    void testChiaChoKhong() {
        assertThrows(ArithmeticException.class, () -> Bai2.thuong(1, 0));
    }
}