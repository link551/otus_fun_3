package pack1;

import org.junit.Assert;
import org.junit.Test;
import pack1.good.Bird;
import pack1.good.Crow;

public class BirdTest {

    @Test
    public void nameTest() {
        Bird bird = new Crow("Mag");
        Assert.assertEquals("Wrong Name", "Mag", bird.getName());
    }
}
