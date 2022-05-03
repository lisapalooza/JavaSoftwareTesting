package mea.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
  @Test
  public void testDistance() {
    Point p = new Point(20, 35);
    Assert.assertEquals(p.distance(), 15);
    assert p.distance() == 15;
  }
}
