import java.util.*;
import java.util.stream.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import onjava.*;

/* >* 
  Observation: I think some of the methods, such as ChatterClient.main,
  would be more appropriate written as a test case, rather than part of the 
  actual class.
*< */

public class SimpleTcpTests {

  @BeforeAll
  static void startMsg() {
    System.out.println(">>> Network Tests <<<");
  }

  @BeforeEach
  static void setupServer () {
  }

  @Test
  void basicTest() throws Exception {
    SimpleServer server = new SimpleServer();
    SimpleClient client = new SimpleClient();
    client.main(null);
    assertTrue(false); // Fail until there are good assertions in the test
  }

  @Test
  void multiTest() throws Exception {
    MultiSimpleClient client = new MultiSimpleClient();
    MultiSimpleServer server = new MultiSimpleServer();
    client.main(null);
    assertTrue(false); // Fail until there are good assertions in the test
  }

  @Test
  void chatterTest() throws Exception {
    ChatterServer server = new ChatterServer();
    ChatterClient.main(null);
    assertTrue(false); // Fail until there are good assertions in the test
  }

}
