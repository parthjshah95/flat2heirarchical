package ml.parth.shah.flat2heirarchical;


import junit.framework.TestCase;
import ml.parth.shah.flat2heirarchical.Flat2Heirarchical;
import org.junit.Assert;

/**
 * Created by parshah on 23/07/19.
 */
public class TestFlat2Heirarchical extends TestCase {
    protected String flatJsonString, deepJsonString;

    protected void setUp() {
        flatJsonString = "{" +
                    "\"property.child\":\"someValue\"," +
                    "\"property.child2\":\"lorem\"," +
                    "\"property2.child\":\"foo\"" +
                "}";
        deepJsonString = "{" +
                    "\"property\":{" +
                        "\"child\":\"someValue\"," +
                        "\"child2\":\"lorem\"" +
                    "}," +
                    "\"property2\":{" +
                        "\"child\":\"foo\"" +
                    "}" +
                "}";
    }

    public void testConvert(){
        Assert.assertEquals(deepJsonString, Flat2Heirarchical.convert(flatJsonString));
    }
}
