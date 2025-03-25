import com.example.Test2.Bai1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestBai1 {
    Bai1 bai1 = new Bai1();

    @Test
    void testTichSoDuong() {
        assertEquals(12, bai1.tinhTich(3, 4));
    }

    @Test
    void testTichSoAm() {
        assertEquals(6, bai1.tinhTich(-2, -3));
    }

    @Test
    void testTichMotSoAmMotSoDuong() {
        assertEquals(-15, bai1.tinhTich(-3, 5));
    }

    @Test
    void testTichMotSoAmMotSoDuongNguocLai() {
        assertEquals(-15, bai1.tinhTich(5, -3));
    }

    @Test
    void testTichSoKhong() {
        assertEquals(0, bai1.tinhTich(0, 7));
    }

    @Test
    void testTichSoKhongHaiSo() {
        assertEquals(0, bai1.tinhTich(0, 0));
    }

    @Test
    void testTichSoLon() {
        assertEquals(2147395600, bai1.tinhTich(46340, 46340));
    }

    @Test
    void testTichSoAmVaLon() {
        assertEquals(-2147395600, bai1.tinhTich(-46340, 46340));
    }

    @Test
    void testTichSoBienTren() {
        assertEquals(Integer.MAX_VALUE, bai1.tinhTich(Integer.MAX_VALUE, 1));
    }

    @Test
    void testTichSoBienDuoi() {
        assertEquals(Integer.MIN_VALUE, bai1.tinhTich(Integer.MIN_VALUE, 1));
    }

    @Test
    void testSoThuc() {
        assertThrows(IllegalArgumentException.class, () -> bai1.tinhTich((int)2.5, 1));
    }
}