package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TrainSensorTest {

    TrainSensorImpl test;
    private TrainController controller;

    @Before
    public void before() {
        controller = mock(TrainController.class);
        test = new TrainSensorImpl(controller, null);
    }

    @Test
    public void ThisIsAnExampleTestStub() {
        Assert.assertEquals(5 ,test.getSpeedLimit());
    }

    @Test
    public void Test1() {
        when(controller.getReferenceSpeed()).thenReturn(5);
        test.overrideSpeedLimit(501);
        Assert.assertTrue(test.getAlarmState());
    }

    @Test
    public void Test2() {
        when(controller.getReferenceSpeed()).thenReturn(5);
        test.overrideSpeedLimit(-1);
        Assert.assertTrue(test.getAlarmState());
    }


    @Test
    public void Test3() {
        when(controller.getReferenceSpeed()).thenReturn(5);
        test.overrideSpeedLimit(100);
        Assert.assertFalse(test.getAlarmState());
    }

    @Test
    public void Test4() {
        when(controller.getReferenceSpeed()).thenReturn(150);
        test.overrideSpeedLimit(50);
        Assert.assertTrue(test.getAlarmState());
    }

    @Test
    public void Test5() {
        when(controller.getReferenceSpeed()).thenReturn(150);
        test.overrideSpeedLimit(80);
        Assert.assertFalse(test.getAlarmState());
    }
}

