import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("before");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("after");
    }

    @org.junit.jupiter.api.Test
    void main() {
        assertEquals(1,1);
    }
}