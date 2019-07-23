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
                    "\"property.child\": \"someValue\"" +
                "}";
        deepJsonString = "{" +
                    "\"property\": {" +
                        "\"child\": \"someValue\"" +
                    "}" +
                "}";
    }

    public void testConvert(){
        Assert.assertSame(deepJsonString, Flat2Heirarchical.convert(flatJsonString));
    }
}
