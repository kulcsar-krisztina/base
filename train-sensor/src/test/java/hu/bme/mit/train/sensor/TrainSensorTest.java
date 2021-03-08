package hu.bme.mit.train.sensor;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TrainSensorTest {

    TrainSensorImpl test;

    @Before
    public void before() {
        test = new TrainSensorImpl(null, null);
    }

    @Test
    public void ThisIsAnExampleTestStub() {
        Assert.assertEquals(5 ,test.getSpeedLimit());
    }
}

