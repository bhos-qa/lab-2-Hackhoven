import org.example.MyClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyClassTest {
    @Test
    public void testAddNumbers() {
        MyClass myClass = new MyClass();
        assertEquals(5, myClass.addNumbers(2, 3));
    }
}
