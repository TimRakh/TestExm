import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

public class SquareTest {
  Square square;
  @BeforeAll
  public static void before(){System.out.println("Тесты пошли");}
  @AfterAll
  public static void after(){System.out.println("Тесты все");}
  @BeforeEach
  public void beforeEach(){square = new Square();}
  @AfterEach
  public void afterEach() {
    square = null;
  }

  @Test
  public void squareOfArea() {
    double a = 1.2, expected = 1.44;
    double result = square.squareOfArea(a);
    Assertions.assertEquals(expected, result);
  }

  @Test
  public void squareOfOval(){
    double a = 1.0, b = 0, expected = 0;
    int result = (int)square.squareOfOval(a,b);
    Assertions.assertEquals(expected,result);
  }

  @Test
  public void squareOfCircle() {
    double a = -1.1;
    Class<MistakesNumbers> expected = MistakesNumbers.class;
    Executable executable = () -> square.squareOfCircle(a);
    Assertions.assertThrowsExactly(expected, executable);
  }
}
