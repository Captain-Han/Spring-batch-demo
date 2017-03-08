package jp.co.sysevo.Spring_Batch;

import jp.co.sysevo.batch.OutptItemProcessor;
import jp.co.sysevo.model.InptData;
import jp.co.sysevo.model.OutptData;
import junit.framework.TestCase;
import org.junit.Assert;


public class OutputProcessorTest extends TestCase {

	public void testTransferProcessor() {

		InptData inptData = TestUtil.getTransferInData();
		OutptData expectedOutptData = TestUtil.getTransferOutData();

		assertEquals(inptData, expectedOutptData);
	}

	public void testFixedValue() {

		OutptData expectedOutptData = TestUtil.getFixedOutData();

		assertEquals(new InptData(), expectedOutptData);
	}

	public void testPurcPrice() {

		InptData inptData = TestUtil.getInptDataPurcPrice();
		OutptData expectedOutptData = TestUtil.getOutptDataPurcPrice();

		assertEquals(inptData, expectedOutptData);
	}

	public void testExcludeTaxSUPrice() {

		InptData inptData = TestUtil.getInptDataExcludeTaxSUPrice();
		OutptData expectedOutptData = TestUtil.getOutptDataExcludeTaxSUPrice();

		assertEquals(inptData, expectedOutptData);
	}

	public void testMcPlantDiv() {
		InptData inptData = TestUtil.getInptDataMcPlantDiv();
		OutptData expectedOutptData = TestUtil.getOutptDataMcPlantDiv();

		assertEquals(inptData, expectedOutptData);
	}

	public void testCometSeq() {
		InptData inptData = TestUtil.getInptCometSeq();
		OutptData expectedOutptData = TestUtil.getOutptCometSeq();

		assertEquals(inptData, expectedOutptData);
	}

	public void testMJPWithHeaderGrp0() {

		InptData inptData = TestUtil.getInptDataMJPWithHeaderGrp0();
		OutptData expectedOutptData = TestUtil.getOutptDataMJPWithHeaderGrp0();

		assertEquals(inptData, expectedOutptData);
	}

	public void testMJPWithEngHeaderGrp0() {

		InptData inptData = TestUtil.getInptDataMJPWithEngHeaderGrp0();
		OutptData expectedOutptData = TestUtil.getOutptDataMJPWithEngHeaderRefGrp0();

		assertEquals(inptData, expectedOutptData);
	}

	public void testMJPWithcustRefGrp0() {

		InptData inptData = TestUtil.getInptDataMJPWithcustRefGrp0();
		OutptData expectedOutptData = TestUtil.getOutptDataMJPWithcustRefGrp0();

		assertEquals(inptData, expectedOutptData);
	}

	public void testMJPWithHeaderGrp2() {

		InptData inptData = TestUtil.getInptDataMJPWithHeaderGrp2();
		OutptData expectedOutptData = TestUtil.getOutptDataMJPWithHeaderGrp2();

		assertEquals(inptData, expectedOutptData);
	}

	public void testMJPWithEngHeaderGrp2() {

		InptData inptData = TestUtil.getInptDataMJPWithEngHeaderGrp2();
		OutptData expectedOutptData = TestUtil.getOutptDataMJPWithEngHeaderRefGrp2();

		assertEquals(inptData, expectedOutptData);
	}

	public void testMJPWithCustRefGrp2() {

		InptData inptData = TestUtil.getInptDataMJPWithCustRefGrp2();
		OutptData expectedOutptData = TestUtil.getOutptDataMJPWithcustRefGrp2();

		assertEquals(inptData, expectedOutptData);
	}

	public void testNoMJPWithCustRefGrp0() {

		InptData inptData = TestUtil.getInptDataNoMJPHeaderRefGrp0();
		OutptData expectedOutptData = TestUtil.getOutptDataNoMJPHeaderRefGrp0();

		assertEquals(inptData, expectedOutptData);
	}

	public void testMJPWithCustRefGrp0() {

		InptData inptData = TestUtil.getInptDataNoMJPEngHeaderRefGrp0();
		OutptData expectedOutptData = TestUtil.getOutptDataNoMJPEngHeaderRefGrp0();

		assertEquals(inptData, expectedOutptData);
	}

	public void testChildSeq() {

		InptData inptData = TestUtil.getInptDataChildSeq();
		OutptData expectedOutptData = TestUtil.getOutptDataLabelL002();

		assertEquals(inptData, expectedOutptData);
	}

	public void testNoChildSeq() {

		InptData inptData = new InptData();
		OutptData expectedOutptData = TestUtil.getOutptDataLabelL001();

		assertEquals(inptData, expectedOutptData);
	}

	/** 着日指示データに対応するレコードが存在 */
	public void testSubsidiaryCdArrDt() {
		InptData inptData = TestUtil.getInptDataSubsidiaryCdArrDt();
		OutptData expectedOutptData = TestUtil.getOutptDataRdInstructFlg1();

		assertEquals(inptData, expectedOutptData);

	}

	/** 着日指示データに対応するレコードが存在 */
	public void testNoSubsidiaryCdArrDt() {
		OutptData expectedOutptData = TestUtil.getOutptDataRdInstructFlg0();

		assertEquals(new InptData(), expectedOutptData);

	}
	/** 受注明細．得意先現法コード　≠　空白 */
	public void testcustsubSubsidiaryCd() {
		InptData inptData = TestUtil.getInptDataSubsidiaryCdArrDt();
		OutptData expectedOutptData = TestUtil.getOutptDataRdInstructFlg1();

		assertEquals(inptData, expectedOutptData);

	}

	public void testOrderMsgCd9001() {
		InptData inptData = TestUtil.getInptOrderMsgCd9001();
		OutptData expectedOutptData = TestUtil.getOutptDataifDiv1();

		assertEquals(inptData, expectedOutptData);
	}

	public void testOrderMsgCd9002() {
		InptData inptData = TestUtil.getInptOrderMsgCd9002();
		OutptData expectedOutptData = TestUtil.getOutptDataifDiv2();

		assertEquals(inptData, expectedOutptData);
	}

	public void testOrderMsgCd() {
		OutptData expectedOutptData = TestUtil.getOutptDataifDiv();

		assertEquals(new InptData(), expectedOutptData);
	}

	public void testCustCategoryCd01() {
		InptData inptData = TestUtil.getInptCustCategoryCd01();
		OutptData expectedOutptData = TestUtil.getOutptSuppsubBusinessFlg1();

		assertEquals(inptData, expectedOutptData);
	}

	public void testCustCategoryCd02() {
		InptData inptData = TestUtil.getInptCustCategoryCd02();
		OutptData expectedOutptData = TestUtil.getOutptSuppsubBusinessFlg1();

		assertEquals(inptData, expectedOutptData);
	}

	public void testCustCategoryCd() {
		OutptData expectedOutptData = TestUtil.getOutptSuppsubBusinessFlg0();

		assertEquals(new InptData(), expectedOutptData);
	}

	public void testGrp1() {
		InptData inptData = TestUtil.getInptGrp1();
		OutptData expectedOutptData = TestUtil.getOutptGrp1();

		assertEquals(inptData, expectedOutptData);
	}

	public void testGrp() {
		OutptData expectedOutptData = TestUtil.getOutptGrp();

		assertEquals(new InptData(), expectedOutptData);
	}

	public void testShipTo() {
		InptData inptData = TestUtil.getInptShipToCd();
		OutptData expectedOutptData = TestUtil.getOutptShipToCd();

		assertEquals(inptData, expectedOutptData);
	}

	public void testNoShipToCd() {
		InptData inptData = TestUtil.getInptNoShipToCd();
		OutptData expectedOutptData = TestUtil.getOutptNoShipToCd();

		assertEquals(inptData, expectedOutptData);
	}

	/** 受注明細．得意先現法コード　≠　空白 */
	public void testCustsubSubsidiaryCd() {
		InptData inptData = TestUtil.getInptCustsubSubsidiaryCd();
		OutptData expectedOutptData = TestUtil.getOutptExportFlg1();

		assertEquals(inptData, expectedOutptData);
	}

	/** 受注明細．直送先コード　＝　空白　 かつ　受注明細．得意先国コード　≠　現法マスタ．国コード */
	public void testCustNotEsSubsidiary() {
		InptData inptData = TestUtil.getInptCustNotEsSubsidiary();
		OutptData expectedOutptData = TestUtil.getOutptExportFlg1();

		assertEquals(inptData, expectedOutptData);
	}

	/** 受注明細．直送先コード　≠　空白　かつ　受注明細．直送先国コード　≠　現法マスタ．国コード */
	public void testInptCustEsSubsidiary() {
		InptData inptData = TestUtil.getInptCustBNotEsSubsidiary();
		OutptData expectedOutptData = TestUtil.getOutptExportFlg1();

		assertEquals(inptData, expectedOutptData);
	}

	/** 受注明細．直送先コード 上記以外の場合 */
	public void testExportFlg1() {
		OutptData expectedOutptData = TestUtil.getOutptExportFlg0();

		assertEquals(new InptData(), expectedOutptData);
	}

	public void testExportFlgFalse() {
		InptData inptData = TestUtil.getExportFlgFalseExisInData();
		OutptData expectedOutptData = TestUtil.getExportFlgFalseExisOutData();

		assertEquals(inptData, expectedOutptData);
	}

	public void testExportFlgFalseNotExis() {
		InptData inptData = TestUtil.getExportFlgFalseNotExisInData();
		OutptData expectedOutptData = TestUtil.getExportFlgFalseNotExisOutData();

		assertEquals(inptData, expectedOutptData);
	}

	public void testExportFlgTrueExis() {
		InptData inptData = TestUtil.getExportFlgTrueExisInData();
		OutptData expectedOutptData = TestUtil.getExportFlgTrueExisOutData();

		assertEquals(inptData, expectedOutptData);
	}

	public void testShipToCdExistInfor() {
		InptData inptData = TestUtil.getInputShipToCdExistInfor();
		OutptData expectedOutptData = TestUtil.getOutputShipToCdExistInfor();

		assertEquals(inptData, expectedOutptData);
	}

	public void testShipToCdNotExistInfor() {
		InptData inptData = TestUtil.getInputShipToCdNotExistInfor();
		OutptData expectedOutptData = TestUtil.getOutputShipToCdNotExistInfor();

		assertEquals(inptData, expectedOutptData);
	}


	public void testShipToCdBLANKInfor() {
		InptData inptData = TestUtil.getInputShipToCdBLANKInfor();
		OutptData expectedOutptData = TestUtil.getOutputShipToCdBlankInfor();

		assertEquals(inptData, expectedOutptData);
	}


	public void testDirectInputInfor() {
		InptData inptData = TestUtil.getDirectInputInfor();
		OutptData expectedOutptData = TestUtil.getDirectOutputInfor();

		assertEquals(inptData, expectedOutptData);
	}

	public void testRankPatrolDiv() {
		OutptData expectedOutptData = TestUtil.getRankPatrolDivOutData();

		assertEquals(new InptData(), expectedOutptData);
	}

	public void testPlant() {
		InptData inptData = TestUtil.getMcPlantDivInData();
		OutptData expectedOutptData = TestUtil.getPlantOutData();

		assertEquals(inptData, expectedOutptData);
	}

	public void testExportFlg1CustName() {
		InptData inptData = TestUtil.getExportFlg1InputData();
		OutptData expectedOutptData = TestUtil.getExportFlg1CustNameOutData();

		assertEquals(inptData, expectedOutptData);
	}

	public void testExportFlg0CustName() {
		InptData inptData = new InptData();
		OutptData expectedOutptData = TestUtil.getExportFlg0CustNameOutData();

		assertEquals(inptData, expectedOutptData);
	}

	public void testShipToCdExist() {
		InptData inptData = TestUtil.getShipToCdExistInputData();
		OutptData expectedOutptData = TestUtil.getShipToCdExistOutData();

		assertEquals(inptData, expectedOutptData);
	}

	public void testShipToCdNotExist() {
		InptData inptData = TestUtil.getShipToCdNotExistInputData();
		OutptData expectedOutptData = TestUtil.getShipToCdNotExistOutData();

		assertEquals(inptData, expectedOutptData);
	}

	public void testGrp2() {
		InptData inptData = TestUtil.getGrp2InputData();
		OutptData expectedOutptData = TestUtil.getGrp2OutData();

		assertEquals(inptData, expectedOutptData);
	}

	public void testGrpNot2() {
		InptData inptData = TestUtil.getGrpNot2InputData();
		OutptData expectedOutptData = TestUtil.getGrpNot2OutData();

		assertEquals(inptData, expectedOutptData);
	}

	public void testGrp2Deli() {
		InptData inptData = TestUtil.getGrp2DeliInputData();
		OutptData expectedOutptData = TestUtil.getGrpNot2DeliOutData();

		assertEquals(inptData, expectedOutptData);
	}

	public void testGrp2ntvDeli() {
		InptData inptData = TestUtil.getGrp2ntvDeliInputData();
		OutptData expectedOutptData = TestUtil.getGrpNot2ntvDelOutData();

		assertEquals(inptData, expectedOutptData);
	}

	public void testGrp2ntvDeliNotEuqal() {
		InptData inptData = TestUtil.getGrp2ntvDeliNotEuqalInputData();
		OutptData expectedOutptData = TestUtil.getGrpNot2ntvDelNotEuqalOutData();

		assertEquals(inptData, expectedOutptData);
	}

	public void testGrp3() {
		InptData inptData = TestUtil.getGrp3inptData();
		OutptData expectedOutptData = TestUtil.getGrp3OutData();

		assertEquals(inptData, expectedOutptData);
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

	private void assertEquals(InptData inptData, OutptData expectedOutptData) {
		try {
			OutptItemProcessor outptItemProcessor = new OutptItemProcessor();
			OutptData actualOutptData = outptItemProcessor.process(inptData);
			Assert.assertEquals(expectedOutptData, actualOutptData);

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
