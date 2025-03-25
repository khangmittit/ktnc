import com.example.Test2.Bai5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestBai5 {
    @Test
    void testLayTenHopLe() {
        Bai5 bai5 = new Bai5("ten");
        assertEquals("ten", bai5.getTen());
    }

    @Test
    void testTenNull() {
        assertThrows(NullPointerException.class, () -> new Bai5(null));
    }
}
