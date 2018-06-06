package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.List;



import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

public class QuotedMainTest {
  @Parameter
  List<String> args = new ArrayList<>();
  
  String quoted = "\" \"";

  @Test
  public void testMain() {
    JCommander jc = new JCommander(this);
    jc.parse(quoted);
    AssertJUnit.assertEquals(args.size(), 1);
    AssertJUnit.assertEquals(args.get(0), " ");
  }
  
  public static void main(String[] args) {
    new QuotedMainTest().testMain();
  }
}
