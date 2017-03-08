package jp.co.sysevo.Spring_Batch;

import jp.co.sysevo.batch.OutptItemProcessor;
import jp.co.sysevo.model.InptData;
import jp.co.sysevo.model.OutptData;
import junit.framework.TestCase;
import org.junit.Assert;


public class OutputProcessorTest extends TestCase {

	public void testTransferProcessor() {

		InptData inptData = TestData.getTransferInData();
		OutptData expectedOutptData = TestData.getTransferOutData();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testFixedValue() {

		OutptData expectedOutptData = TestData.getFixedOutData();

		assertEqualsCustomiz(new InptData(), expectedOutptData);
	}

	public void testPurcPrice() {

		InptData inptData = TestData.getInptDataPurcPrice();
		OutptData expectedOutptData = TestData.getOutptDataPurcPrice();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testExcludeTaxSUPrice() {

		InptData inptData = TestData.getInptDataExcludeTaxSUPrice();
		OutptData expectedOutptData = TestData.getOutptDataExcludeTaxSUPrice();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testMcPlantDiv() {
		InptData inptData = TestData.getInptDataMcPlantDiv();
		OutptData expectedOutptData = TestData.getOutptDataMcPlantDiv();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testCometSeq() {
		InptData inptData = TestData.getInptCometSeq();
		OutptData expectedOutptData = TestData.getOutptCometSeq();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testMJPWithHeaderGrp0() {

		InptData inptData = TestData.getInptDataMJPWithHeaderGrp0();
		OutptData expectedOutptData = TestData.getOutptDataMJPWithHeaderGrp0();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testMJPWithEngHeaderGrp0() {

		InptData inptData = TestData.getInptDataMJPWithEngHeaderGrp0();
		OutptData expectedOutptData = TestData.getOutptDataMJPWithEngHeaderRefGrp0();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testMJPWithcustRefGrp0() {

		InptData inptData = TestData.getInptDataMJPWithcustRefGrp0();
		OutptData expectedOutptData = TestData.getOutptDataMJPWithcustRefGrp0();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testMJPWithHeaderGrp2() {

		InptData inptData = TestData.getInptDataMJPWithHeaderGrp2();
		OutptData expectedOutptData = TestData.getOutptDataMJPWithHeaderGrp2();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testMJPWithEngHeaderGrp2() {

		InptData inptData = TestData.getInptDataMJPWithEngHeaderGrp2();
		OutptData expectedOutptData = TestData.getOutptDataMJPWithEngHeaderRefGrp2();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testMJPWithCustRefGrp2() {

		InptData inptData = TestData.getInptDataMJPWithCustRefGrp2();
		OutptData expectedOutptData = TestData.getOutptDataMJPWithcustRefGrp2();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testNoMJPWithCustRefGrp0() {

		InptData inptData = TestData.getInptDataNoMJPHeaderRefGrp0();
		OutptData expectedOutptData = TestData.getOutptDataNoMJPHeaderRefGrp0();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testMJPWithCustRefGrp0() {

		InptData inptData = TestData.getInptDataNoMJPEngHeaderRefGrp0();
		OutptData expectedOutptData = TestData.getOutptDataNoMJPEngHeaderRefGrp0();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testChildSeq() {

		InptData inptData = TestData.getInptDataChildSeq();
		OutptData expectedOutptData = TestData.getOutptDataLabelL002();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testNoChildSeq() {

		InptData inptData = new InptData();
		OutptData expectedOutptData = TestData.getOutptDataLabelL001();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	/** 着日指示データに対応するレコードが存在 */
	public void testSubsidiaryCdArrDt() {
		InptData inptData = TestData.getInptDataSubsidiaryCdArrDt();
		OutptData expectedOutptData = TestData.getOutptDataRdInstructFlg1();

		assertEqualsCustomiz(inptData, expectedOutptData);

	}

	/** 着日指示データに対応するレコードが存在 */
	public void testNoSubsidiaryCdArrDt() {
		OutptData expectedOutptData = TestData.getOutptDataRdInstructFlg0();

		assertEqualsCustomiz(new InptData(), expectedOutptData);

	}
	/** 受注明細．得意先現法コード　≠　空白 */
	public void testcustsubSubsidiaryCd() {
		InptData inptData = TestData.getInptDataSubsidiaryCdArrDt();
		OutptData expectedOutptData = TestData.getOutptDataRdInstructFlg1();

		assertEqualsCustomiz(inptData, expectedOutptData);

	}

	public void testOrderMsgCd9001() {
		InptData inptData = TestData.getInptOrderMsgCd9001();
		OutptData expectedOutptData = TestData.getOutptDataifDiv1();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testOrderMsgCd9002() {
		InptData inptData = TestData.getInptOrderMsgCd9002();
		OutptData expectedOutptData = TestData.getOutptDataifDiv2();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testOrderMsgCd() {
		OutptData expectedOutptData = TestData.getOutptDataifDiv();

		assertEqualsCustomiz(new InptData(), expectedOutptData);
	}

	public void testCustCategoryCd01() {
		InptData inptData = TestData.getInptCustCategoryCd01();
		OutptData expectedOutptData = TestData.getOutptSuppsubBusinessFlg1();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testCustCategoryCd02() {
		InptData inptData = TestData.getInptCustCategoryCd02();
		OutptData expectedOutptData = TestData.getOutptSuppsubBusinessFlg1();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testCustCategoryCd() {
		OutptData expectedOutptData = TestData.getOutptSuppsubBusinessFlg0();

		assertEqualsCustomiz(new InptData(), expectedOutptData);
	}

	public void testGrp1() {
		InptData inptData = TestData.getInptGrp1();
		OutptData expectedOutptData = TestData.getOutptGrp1();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testGrp() {
		OutptData expectedOutptData = TestData.getOutptGrp();

		assertEqualsCustomiz(new InptData(), expectedOutptData);
	}

	public void testShipTo() {
		InptData inptData = TestData.getInptShipToCd();
		OutptData expectedOutptData = TestData.getOutptShipToCd();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testNoShipToCd() {
		InptData inptData = TestData.getInptNoShipToCd();
		OutptData expectedOutptData = TestData.getOutptNoShipToCd();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	/** 受注明細．得意先現法コード　≠　空白 */
	public void testCustsubSubsidiaryCd() {
		InptData inptData = TestData.getInptCustsubSubsidiaryCd();
		OutptData expectedOutptData = TestData.getOutptExportFlg1();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	/** 受注明細．直送先コード　＝　空白　 かつ　受注明細．得意先国コード　≠　現法マスタ．国コード */
	public void testCustNotEsSubsidiary() {
		InptData inptData = TestData.getInptCustNotEsSubsidiary();
		OutptData expectedOutptData = TestData.getOutptExportFlg1();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	/** 受注明細．直送先コード　≠　空白　かつ　受注明細．直送先国コード　≠　現法マスタ．国コード */
	public void testInptCustEsSubsidiary() {
		InptData inptData = TestData.getInptCustBNotEsSubsidiary();
		OutptData expectedOutptData = TestData.getOutptExportFlg1();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	/** 受注明細．直送先コード 上記以外の場合 */
	public void testExportFlg1() {
		OutptData expectedOutptData = TestData.getOutptExportFlg0();

		assertEqualsCustomiz(new InptData(), expectedOutptData);
	}

	public void testExportFlgFalse() {
		InptData inptData = TestData.getExportFlgFalseExisInData();
		OutptData expectedOutptData = TestData.getExportFlgFalseExisOutData();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testExportFlgFalseNotExis() {
		InptData inptData = TestData.getExportFlgFalseNotExisInData();
		OutptData expectedOutptData = TestData.getExportFlgFalseNotExisOutData();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testExportFlgTrueExis() {
		InptData inptData = TestData.getExportFlgTrueExisInData();
		OutptData expectedOutptData = TestData.getExportFlgTrueExisOutData();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testShipToCdExistInfor() {
		InptData inptData = TestData.getInputShipToCdExistInfor();
		OutptData expectedOutptData = TestData.getOutputShipToCdExistInfor();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testShipToCdNotExistInfor() {
		InptData inptData = TestData.getInputShipToCdNotExistInfor();
		OutptData expectedOutptData = TestData.getOutputShipToCdNotExistInfor();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}


	public void testShipToCdBLANKInfor() {
		InptData inptData = TestData.getInputShipToCdBLANKInfor();
		OutptData expectedOutptData = TestData.getOutputShipToCdBlankInfor();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}


	public void testDirectInputInfor() {
		InptData inptData = TestData.getDirectInputInfor();
		OutptData expectedOutptData = TestData.getDirectOutputInfor();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testRankPatrolDiv() {
		OutptData expectedOutptData = TestData.getRankPatrolDivOutData();

		assertEqualsCustomiz(new InptData(), expectedOutptData);
	}

	public void testPlant() {
		InptData inptData = TestData.getMcPlantDivInData();
		OutptData expectedOutptData = TestData.getPlantOutData();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testExportFlg1CustName() {
		InptData inptData = TestData.getExportFlg1InputData();
		OutptData expectedOutptData = TestData.getExportFlg1CustNameOutData();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testExportFlg0CustName() {
		InptData inptData = new InptData();
		OutptData expectedOutptData = TestData.getExportFlg0CustNameOutData();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testShipToCdExist() {
		InptData inptData = TestData.getShipToCdExistInputData();
		OutptData expectedOutptData = TestData.getShipToCdExistOutData();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testShipToCdNotExist() {
		InptData inptData = TestData.getShipToCdNotExistInputData();
		OutptData expectedOutptData = TestData.getShipToCdNotExistOutData();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testGrp2() {
		InptData inptData = TestData.getGrp2InputData();
		OutptData expectedOutptData = TestData.getGrp2OutData();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testGrpNot2() {
		InptData inptData = TestData.getGrpNot2InputData();
		OutptData expectedOutptData = TestData.getGrpNot2OutData();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testGrp2Deli() {
		InptData inptData = TestData.getGrp2DeliInputData();
		OutptData expectedOutptData = TestData.getGrpNot2DeliOutData();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testGrp2ntvDeli() {
		InptData inptData = TestData.getGrp2ntvDeliInputData();
		OutptData expectedOutptData = TestData.getGrpNot2ntvDelOutData();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testGrp2ntvDeliNotEuqal() {
		InptData inptData = TestData.getGrp2ntvDeliNotEuqalInputData();
		OutptData expectedOutptData = TestData.getGrpNot2ntvDelNotEuqalOutData();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	public void testGrp3() {
		InptData inptData = TestData.getGrp3inptData();
		OutptData expectedOutptData = TestData.getGrp3OutData();

		assertEqualsCustomiz(inptData, expectedOutptData);
	}

	// 現法名２
	public void testCustName_2JpNvl() {
		String billToCountryName = null;
		String expectedCustName = "";
		OutptItemProcessor outptItemProcessor = new OutptItemProcessor();

		String actualCustname = outptItemProcessor.getCustName_2(billToCountryName, "");

		Assert.assertEquals(expectedCustName, actualCustname);
	}

	public void testCustName_2JpNotSpace() {
		String billToCountryName = "billToCountryName";
		String expectedCustName = "custName";
		OutptItemProcessor outptItemProcessor = new OutptItemProcessor();

		String actualCustname = outptItemProcessor.getCustName_2(billToCountryName, "custName");

		Assert.assertEquals(billToCountryName.trim()+"/"+expectedCustName.trim(), actualCustname);
	}

	public void testCustName_2JpSpace() {
		String billToCountryName = " ";
		String expectedCustName = "custName";
		OutptItemProcessor outptItemProcessor = new OutptItemProcessor();

		String actualCustname = outptItemProcessor.getCustName_2(billToCountryName, "custName");

		Assert.assertEquals(expectedCustName, actualCustname);
	}

	public void testbrandNameForProductCd() {
		String brandNameForProductCd = "ﾐｽﾐ";
		String expected = "";
		OutptItemProcessor outptItemProcessor = new OutptItemProcessor();

		String actual = outptItemProcessor.getMcPlantDivJp(brandNameForProductCd);

		Assert.assertEquals(expected, actual);
	}

	public void testbrandNameForProductCdMISUMI() {
		String brandNameForProductCd = "MISUMI";
		String expected = "";
		OutptItemProcessor outptItemProcessor = new OutptItemProcessor();

		String actual = outptItemProcessor.getMcPlantDivJp(brandNameForProductCd);

		Assert.assertEquals(expected, actual);
	}

	public void testbrandNameForProductCdElse() {
		String brandNameForProductCd = "brandNameForProductCd";
		String expected = "brandNameForProductCd";
		OutptItemProcessor outptItemProcessor = new OutptItemProcessor();

		String actual = outptItemProcessor.getMcPlantDivJp(brandNameForProductCd);

		Assert.assertEquals(expected, actual);
	}

	private void assertEqualsCustomiz(InptData inptData, OutptData expectedOutptData) {
		try {
			OutptItemProcessor outptItemProcessor = new OutptItemProcessor();
			OutptData actualOutptData = outptItemProcessor.process(inptData);
			TestUtil.assertDataEquals(expectedOutptData, actualOutptData);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void testBrandProductCdJp2() {
		String productCdMst = "1234567890123456789012345678901234";
		String branNmForProductCd = "12345678901234567890";

		String expectedOutptData = "1234567890123456789012345678901234(12345678901234567890)";
		assertEqualsBrandProductCdJp(productCdMst, branNmForProductCd, expectedOutptData);
	}

	public void testBrandProductCdJp3() {
		String productCdMst = "12345678901234567890123456789012345";
		String branNmForProductCd = "12345678901234567890";

		String expectedOutptData = "12345678901234567890123456789012345";
		assertEqualsBrandProductCdJp(productCdMst, branNmForProductCd, expectedOutptData);
	}
	private void assertEqualsBrandProductCdJp(String productCdMst, String branNmForProductCd,
											  String expectedOutptData) {
		try {
			OutptItemProcessor outptItemProcessor = new OutptItemProcessor();
			String actualOutptData = outptItemProcessor.getBrandProductCdJp(productCdMst, branNmForProductCd);
			Assert.assertEquals(expectedOutptData, actualOutptData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
