package day03;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TS001 {

  public static Test suite() {
    TestSuite suite = new TestSuite();
   
   // suite.addTestSuite(TC001.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
