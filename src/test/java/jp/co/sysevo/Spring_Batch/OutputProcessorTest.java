package jp.co.sysevo.Spring_Batch;

import jp.co.sysevo.batch.OutptItemProcessor;
import jp.co.sysevo.model.InptData;
import jp.co.sysevo.model.OutptData;
import junit.framework.TestCase;
import org.junit.Assert;


public class OutputProcessorTest extends TestCase {

    public void testTransferProcessor() {

        System.out.println("<------processor test begin-------->");

        System.out.println("<------transfer test begin-------->");
        InptData inptData = TestUtil.getTransferInData();
        OutptData expectedOutptData = TestUtil.getTransferOutData();

        try {
            OutptItemProcessor outptItemProcessor = new OutptItemProcessor();
            OutptData actualOutptData = outptItemProcessor.process(inptData);
            Assert.assertEquals("test", "test111");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testFixedValue() {

        System.out.println("<------fixed value test begin-------->");

    }

}
