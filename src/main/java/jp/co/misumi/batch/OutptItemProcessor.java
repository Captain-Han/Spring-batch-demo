package jp.co.misumi.batch;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jp.co.misumi.model.InptData;
import jp.co.misumi.model.OutptData;

@Component("itemProcessor")
@Scope("step")
public class OutptItemProcessor implements ItemProcessor<InptData, OutptData>{

	private static final String BLANK = "";

	@Override
	public OutptData process(InptData item) throws Exception {
		System.out.println("------------------EntryItemProcessor---------------------");
		System.out.println(item.toString());

		OutptData result = new OutptData();

		// 作成日
		result.setCrtDt(getDateToString(getCrtDt()));
		// 納入担当者区分_日本用
		result.setArrUserDivJp(item.getGrp());
		// 現法コード
		result.setSuppsubSubsidiaryCd(item.getSubsidiaryCd());
		// MC・置場コード
		result.setMcPlantCd(item.getMcCd());
		// 得意先コード
		result.setCustCd(item.getCustCd());
		// 仕入先コード
		result.setSupplierCd(item.getSupplierCd());
		// 置場
		result.setPlant(subString(item.getMcPlantDiv(), 0,2));
		// 直送先コード
		result.setShipToCd(item.getShipToCd());
		// 入荷予定日
		result.setSchdArrDt(getDateToString(item.getVrd()));
		// 出荷予定日
		result.setSchdShipDt(getDateToString(item.getVsd()));
		// 親注番コード
		result.setCustRefCd(String.valueOf(item.getCustRefLength()));
		// 親注番
		result.setCustRef(getCustRef(item.getSubsidiaryCd(), item.getCustRef()));
		// 親注番（現地語）
		result.setCystRefNtv(getCystRefNtv(result.getSuppsubSubsidiaryCd(), 
				item.getHeaderRef(), item.getEngHeaderRef(), item.getCustRef()));
		// 子注番
		result.setCustSubRef(item.getCustSubRef());
		// 結合注番
		result.setRefStr(getRefStr(result.getCustRef(), result.getCystRefNtv(), 
				result.getCustSubRef(), item.getyPartNoDiv()));
		// グローバル番号
		result.setGlobalNo(item.getGlobalNo());
		// COMET紐付けSEQ
		result.setCometSeq(result.getSchdShipDt() + item.getCometSeq());
		// 商品コード
		result.setProductCd(item.getProductCd());
		// インナーコード
		result.setInnerCd(item.getInnerCd());
		// 商品種別
		result.setProductAssort(item.getProductAssort());
		// 数量
		result.setQty(item.getSoQty());
		// 仕入単価
		result.setPurcPrice(item.getPurchaseUnitPrice() * 1000);
		// 売単価
		result.setExcludeTaxSUPrice(item.getExcludeTaxSUPrice() * 1000);
		// 輸出フラグ
		result.setExportFlg(getExportFlg(item.getCustsubSubsidiaryCd(), item.getShipToCd(),
				item.getCustCountryCd(), item.getSubsidiaryCountryCd(), item.getShipToCountryCd()));
		// 仕入先名(現地語)
		result.setPurcCompanyName(getInforName(result.getExportFlg(), 
				item.getNtv1CompanyName(), item.getCompanyName()));
		// 仕入先名(英語)
		result.setPurcCompanyNameEn(item.getCompanyName());
		// 仕入先国コード
		result.setPurcCountryCd(item.getPurcCountryCd());
		// 仕入先国名（英語）
		result.setPurcCountryName(item.getPurcCountryName());
		// 分析コード
		result.setClassifyCd(item.getClassifyCd());
		// 分析名称
		result.setClassifyName(getClassifyName(result.getExportFlg(), 
				item.getNtvClassifyCdName(), item.getClassifyCdName()));
		// TODO バッチ区分result.setBacthDiv(item.getBacthDiv());
		// 在庫区分
		result.setStkDiv(item.getMcPlantDiv());
		// データ区分
		result.setDataDiv(item.getDataDiv());
		// 納区
		result.setDeliDiv(item.getDeliDiv());
		// 子商品SEQ
		result.setChildSeq(String.valueOf(item.getChildSeq()));
		// MC指定伝票区分
		result.setMcSpecifyVoucherDiv(item.getMcSpecifyVoucherDiv());
		// 梱包ランク
		result.setPackingRank(item.getPackingRank());
		// 納品書送付区分
		result.setDeliNoteSendFlg(item.getDeliNoteSendFlg());
		// 指定伝票区分
		result.setSpecifyVoucherDiv(item.getSpecifyVoucherDiv());
		// 現品添付票区分
		result.setMoveTicketDiv(item.getMoveTicketDiv());
		// 仮伝区分
		result.setTempVoucherDiv(item.getTempVoucherDiv());
		// ピッキングラベル種別
		result.setLabelDiv(nvl(item.getSoSubsidiaryCd(), "L002", "L001"));
		// 納入担当部課コード
		result.setDeliDeptCd(item.getDeliDeptCd());
		// 納入担当者コード
		result.setDeliAttentionCd(item.getDeliAttentionCd());
		// 納入者部課（現地語）
		result.setDeliDept(getDeliDept(item.getNtvDeliDept(), item.getSubsidiaryCd(), item.getGrp()));
		// 納入者氏名（現地語）
		result.setDeliAttention(getDeliDept(item.getNtvDeliAttention(), item.getSubsidiaryCd(), item.getGrp()));
		// ブランドコード
		result.setBrandCd(item.getBrandCd());
		// ブランド名（英語）
		result.setBrandNameEn(item.getBrandName());
		// 運賃エリアコード
		result.setFrtAreaCd(nvl(item.getShipToCd(), item.getShipToFrtAreaCd(), item.getCustFrtAreaCd()));
		// ブランド名(現地語)
		result.setBrandName(getInforName(result.getExportFlg(), item.getNtvBrandName(), item.getBrandName()));
		// ミスミ商品コード
		result.setMisumiProductCd(item.getProductCdMst());
		// 発注入り数
		result.setPoQtyPerCase(item.getPoQtyPerCase());
		// 入荷ラベル発注番号
		result.setBarcodeGlobalNo(item.getBarcodeGlobalNo());
		// TODO 納品書番号result.setPackingNo(item.getPackingNo());
		// 箱番号
		result.setBoxNo(BLANK);
		// Commercial Invoiceフラグ
		result.setComInvFlg(item.getComInvFlg());
		// Commercial Invoice出力枚数(オリジナル)
		result.setComInvPrintNumOrgn(item.getComInvPrintNumOrgn());
		// Commercial Invoice出力枚数(控え)
		result.setComInvPrintNumCopy(item.getComInvPrintNumCopy());
		// Commercial Invoice保存フラグ
		result.setComInvRetainFlg(item.getComInvRetainFlg());
		// Delivery Orderフラグ
		result.setDeliOrderFlg(item.getDeliOrderFlg());
		// Delivery Order出力枚数(オリジナル)
		result.setDeliOrderPrintNumOrgn(item.getDeliOrderPrintNumOrgn());
		// Delivery Order出力枚数(控え)
		result.setDeliInvPrintNumCopy(item.getComInvPrintNumCopy());
		// Delivery Order保存フラグ
		result.setDeliOrderRetainFlg(item.getDeliOrderRetainFlg());
		// Packing Listフラグ
		result.setPackListFlg(item.getPackListFlg());
		// Packing List出力枚数(オリジナル)
		result.setPackListPrintNumOrgn(item.getPackListPrintNumOrgn());
		// Packing List出力枚数(控え)
		result.setPackListPrintNumCopy(item.getPackListPrintNumCopy());
		// Packing List保存フラグ
		result.setPackListSaveFlg(item.getPackListRetainFlg());
		// Invoice&Packing Listフラグ
		result.setInvPackFlg(item.getInvPackFlg());
		// Invoice&Packing List出力枚数(オリジナル)
		result.setInvPackPrintNumOrgn(item.getInvPackPrintNumOrgn());
		// Invoice&Packing List出力枚数(控え)
		result.setInvPackPrintNumCopy(item.getInvPackPrintNumCopy());
		// Invoice&Packing List保存フラグ
		result.setInvPackRetainFlg(item.getInvPackRetainFlg());
		// HSコード
		result.setHsCd(item.getHsCd());
		// 現法名称
		result.setSubsidiaryName(getInforName(result.getExportFlg(),
				item.getNtvSubsidiaryName(), item.getSubsidiaryName()));
		// 現法住所1
		result.setSubsidiaryAddress_1(getInforName(result.getExportFlg(),
				item.getSubsidiaryNtvAddress_1(), item.getSubsidiaryAddress_1()));
		// 現法住所2
		result.setSubsidiaryAddress_2(getInforName(result.getExportFlg(),
				item.getSubsidiaryNtvAddress_2(), item.getSubsidiaryAddress_2()));
		// 現法住所3
		result.setSubsidiaryAddress_3(getInforName(result.getExportFlg(),
				item.getSubsidiaryNtvAddress_3(), item.getSubsidiaryAddress_3()));
		// 現法住所4
		result.setSubsidiaryAddress_4(getInforName(result.getExportFlg(),
				item.getSubsidiaryNtvAddress_4(), item.getSubsidiaryAddress_4()));
		// 現法電話番号
		result.setSubsidiaryTel(item.getSubsidiaryTel());
		// 現法FAX番号
		result.setSubsidiaryFax(item.getSubsidiaryFax());
		// 現法郵便番号
		result.setSubsidiaryPostalCd(item.getSubsidiaryPostalCd());
		// 現法国コード
		result.setSubsidiaryCountryCd(item.getSubsidiaryCountryCd());
		// 現法国名
		result.setSubsidiaryCountryName(getInforName(result.getExportFlg(),
				item.getNtvCountryName_1(), item.getCountryName()));
		// 現法登録番号
		result.setSubsidiaryLicenceNo(item.getSubsidiaryLicenceNo());
		// 現法税登録番号
		result.setSubsidiaryVatRegistrationNumber(item.getSubsidiaryVatRegistrationNumber());
		// 現法中央売上税番号
		result.setSubsidiarySaleTaxNo(BLANK);
		// 現法物品税管理コード
		result.setSubsidiaryGoodsTaxMangeCd(BLANK);
		// 現法物品税管理地
		result.setSubsidiaryGoodsTaxMangeCity(BLANK);
		// 現法部署名
		result.setSubsidiaryDeptName(BLANK);
		// 現法Commissionerate
		result.setSubsidiaryCommissionerate(BLANK);
		// エコール得意先コード
		result.setEcalCustCd(item.getEcalCustCd());
		// 得意先名称（現地語）
		result.setCustName(getInforName(result.getExportFlg(), item.getNtvCustName1(), item.getCustName()));
		// 得意先名称（英語）
		result.setCustNameEn(item.getCustName());
		// 得意先住所1
		result.setCustAddress_1(getInforName(result.getExportFlg(), 
				item.getCustNtvAddress_1(), item.getCustHalfwidthAddress_1()));
		// 得意先住所2
		result.setCustAddress_2(getInforName(result.getExportFlg(), 
				item.getCustNtvAddress_2(), item.getCustHalfwidthAddress_2()));
		// 得意先住所3
		result.setCustAddress_3(getInforName(result.getExportFlg(), 
				item.getCustNtvAddress_3(), item.getCustHalfwidthAddress_3()));
		// 得意先住所4
		result.setCustAddress_4(getInforName(result.getExportFlg(), 
				item.getCustNtvAddress_4(), item.getCustHalfwidthAddress_4()));
		// 得意先部署名
		result.setCustDeptName(item.getNtvCustDept());
		// 得意先郵便番号
		result.setCustPostalNo(item.getCustPostalCd());
		// 得意先国コード
		result.setCustCountryCd(item.getCustCountryCdMst());
		// 得意先国コード(UPS)
		result.setCustCountryCdUps(item.getCustUpsCountryCd());
		// 得意先国名
		result.setCustCountryName(getInforName(result.getExportFlg(), 
				item.getCustNtvCountryName_1(), item.getCustCountryName()));
		// 得意先都市名
		result.setCustCityName(item.getCustCityName());
		// 得意先電話番号
		result.setCustTel(item.getCustTel());
		// 得意先FAX番号
		result.setCustFax(item.getCustFax());
		// 得意先担当者
		result.setCustAttention(item.getNtvCustAttention());
		// 明細コメント
		result.setDtlComment(item.getDtComment());
		// 事務指示１フラグ
		result.setBusinessinstruct1ShowFlg(nvl(result.getShipToCd(), 
				item.getShipToBusinessinstruct1ShowFlg(), item.getCustBusinessinstruct1ShowFlg()));
		// 事務指示１
		result.setNtvBusinessinstruct1(nvl(result.getShipToCd(), 
				item.getShipToNtvBusinessinstruct1(), item.getCustNtvBusinessinstruct1()));
		// 事務指示２フラグ
		result.setBusinessinstruct2ShowFlg(nvl(result.getShipToCd(),
				item.getShipToBusinessinstruct2ShowFlg(), item.getCustBusinessinstruct2ShowFlg()));
		// 事務指示２
		result.setNtvBusinessinstruct2(nvl(result.getShipToCd(), 
				item.getShipToNtvBusinessinstruct2(), item.getCustNtvBusinessinstruct2()));
		// 梱包指示１フラグ
		result.setPackingInstruct1ShowFlg(nvl(result.getShipToCd(), 
				item.getShipToPackingInstruct1ShowFlg(), item.getCustPackingInstruct1ShowFlg()));
		// 梱包指示１
		result.setNtvPackingInstruct1(nvl(result.getShipToCd(), 
				item.getShipToNtvPackingInstruct1(), item.getCustNtvPackingInstruct1()));
		// 梱包指示２フラグ
		result.setPackingInstruct2ShowFlg(nvl(result.getShipToCd(), 
				item.getShipToPackingInstruct2ShowFlg(), item.getCustPackingInstruct2ShowFlg()));
		// 梱包指示２
		result.setNtvPackingInstruct2(nvl(result.getShipToCd(), 
				item.getShipToNtvPackingInstruct2(), item.getCustNtvPackingInstruct2()));
		// CS指示
		result.setCsInstruct(item.getHdCommentForLogistics());
		// 企業ライセンス番号
		result.setCustOfficeLicenseNo(item.getCustOfficeLicenseNo());
		// 売掛先コード
		result.setBillToCd(item.getCustBillToCd());
		// 売掛先名
		result.setBillToName(getInforName(result.getExportFlg(), 
				item.getNtvBillToName(), item.getBillToName()));
		// 売掛先住所1
		result.setBillToAddress_1(getInforName(result.getExportFlg(), 
				item.getBillToNtvAddress_1(), item.getBillToHalfwidthAddress_1()));
		// 売掛先住所2
		result.setBillToAddress_2(getInforName(result.getExportFlg(),
				item.getBillToNtvAddress_2(), item.getBillToHalfwidthAddress_2()));
		// 売掛先住所3
		result.setBillToAddress_3(getInforName(result.getExportFlg(), 
				item.getBillToNtvAddress_3(), item.getBillToHalfwidthAddress_3()));
		// 売掛先住所4
		result.setBillToAddress_4(getInforName(result.getExportFlg(),
				item.getBillToNtvAddress_4(), item.getBillToHalfwidthAddress_4()));
		// 売掛先部署名
		result.setBillToNtvBillToDept(item.getBillToNtvBillToDept());
		// 売掛先郵便番号
		result.setBillToPostalCd(item.getBillToPostalCd());
		// 売掛先国コード
		result.setBillToCountryCd(item.getBillToCountryCd());
		// 売掛先国名
		result.setBillToCountryName(getInforName(result.getExportFlg(),
				item.getBillToNtvCountryName_1(), item.getBillToCountryName()));
		// 売掛先電話番号
		result.setBillToTel(item.getBillToTel());
		// 売掛先FAX番号
		result.setBillToFax(item.getFaxBillTo());
		// 売掛先担当者
		result.setNtvBillToPerson(item.getNtvBillToPerson());
		// 売掛注釈1
		result.setNtvReceivableRemarks_1(item.getNtvReceivableRemarks_1());
		// 売掛注釈2
		result.setNtvReceivableRemarks_2(item.getNtvReceivableRemarks_2());
		// 直送先名
		result.setShipToName(getShipToInfor(item.getShipToCd(), result.getExportFlg(),
				item.getNtvShipToName1(), item.getShipToName(), item.getBillToName()));
		// 直送先住所1
		result.setShipToAddress_1(getShipToInfor(item.getShipToCd(), result.getExportFlg(),
				item.getShipToNtvAddress_1(), item.getShipToHalfwidthAddress_1(), item.getBillToHalfwidthAddress_1()));
		// 直送先住所2
		result.setShipToAddress_2(getShipToInfor(item.getShipToCd(), result.getExportFlg(),
				item.getShipToNtvAddress_2(), item.getShipToHalfwidthAddress_2(), item.getBillToHalfwidthAddress_2()));
		// 直送先住所3
		result.setShipToAddress_3(getShipToInfor(item.getShipToCd(), result.getExportFlg(),
				item.getShipToNtvAddress_3(), item.getShipToHalfwidthAddress_3(), item.getBillToHalfwidthAddress_3()));
		// 直送先住所4
		result.setShipToAddress_4(getShipToInfor(item.getShipToCd(), result.getExportFlg(),
				item.getShipToNtvAddress_4(), item.getShipToHalfwidthAddress_4(), item.getBillToHalfwidthAddress_4()));
		// 直送先部署名
		result.setShipToDeptName(item.getNtvDeliDept());
		// 直送先郵便番号
		result.setShipToPostalNo(item.getShipToPostalCd());
		// 直送先国コード
		result.setShipToCountryCd(item.getShipToCountryCdMst());
		// 直送先国コード(UPS)
		result.setShipUpsCountryCd(item.getShipToUpsCountryCd());
		// 直送先国名
		result.setShipToCountryName(getShipToInfor(item.getShipToCd(), result.getExportFlg(), 
				item.getShipToNtvCountryName_1(), item.getShipToCountryName(), item.getBillToCountryName()));
		// 直送先都市名
		result.setShipToCityName(item.getShipToCityName());
		// 直送先電話番号
		result.setShipToTel(item.getShipToTel());
		// 直送先FAX番号
		result.setShipToFax(item.getShipToFax());
		// 直送先担当者
		result.setShipToAttention(item.getNtvDeliAttention());
		// Sub1置場
		result.setSub1PlantCd(item.getCustsubMcPlantCd());
		// Sub1部門名
		result.setSub1DeptName(item.getSubsidiaryPlantDeptName());
		// Sub1住所1
		result.setSub1DeptAddress_1(item.getSubsidiaryPlantAddress_1());
		// Sub1住所2
		result.setSub1DeptAddress_2(item.getSubsidiaryPlantAddress_2());
		// Sub1住所3
		result.setSub1DeptAddress_3(item.getSubsidiaryPlantAddress_3());
		// Sub1住所4
		result.setSub1DeptAddress_4(item.getSubsidiaryPlantAddress_4());
		// Sub1郵便番号
		result.setSub1DeptPostalCd(item.getSubsidiaryPlantPostalCd());
		// Sub1国コード
		result.setSub1DeptCountryCd(item.getDeptCountryCd());
		// Sub1電話番号
		result.setSub1DeptTel(item.getSubsidiaryPlantTel());
		// Sub1ＦＡＸ番号
		result.setSub1DeptFax(item.getSubsidiaryPlantFax());
		// 扱い便区分
		result.setShippingDestinationCd(item.getCustShipmode());
		// 配送業者名
		result.setCarrierName(item.getShippingCarrierName());
		// 配送業者名略称
		result.setCarrierNameKana(item.getShippingCarrierAbb());
		// 支払い方法
		result.setPaymentTerms(item.getPaymentTerms());
		// インコタームズ
		result.setIncoterms(item.getIncoterms());
		// 支払い形態
		result.setSettlementMethod(item.getSettlementMethod());
		// 商品総称フラグ
		result.setProductGenericNameFlg(item.getProductGenericNameFlg());
		// 伝票区分
		result.setVoucherDiv(item.getVoucherDiv());
		// 税金エリアコード
		result.setTaxAreaCd(item.getTaxAreaCd());
		// 非課税フラグ
		result.setTaxFreeFlg(item.getTaxFreeFlg());
		// 統一発票タイプ
		result.setUniformInvType(item.getUniformInvType());
		// 売掛金締め単位
		result.setArCloseUnit(item.getArCloseUnit());
		// 売掛金締日
		result.setArClosingDay(item.getArClosingDay());
		// 最終得意先コード
		result.setFinalCustsubCustCd(item.getCustsubCustCd());
		// 最終得意先名(現地語）
		result.setFinalCustName(getInforName(result.getExportFlg(), 
				item.getCustomerNtvCustName1(), item.getCustomerCustName()));
		// 最終得意先名（英語）result.setFinalCustNameEn(item.getFinalCustNameEn());
		//TODO
		// 最終直送先コード
		result.setFinalCustsubShipToCd(item.getCustsubShipToCd());
		// 最終直送先名
		result.setFinalShipToName(getInforName(result.getExportFlg(), 
				item.getSubsidiaryNtvShipToName1(), item.getSubsidiaryShipToName()));
		// 受注伝票番号
		result.setSoVoucherNo(item.getSovoucherno());
		// 受注年月日
		result.setSoDate(getDateToString(item.getSoDate()));
		// 商品名
		result.setProductName(getInforName(result.getExportFlg(), 
				item.getNtvProductName(), item.getProductName()));
		// 単位重量
		result.setWeight(item.getWeight());
		// 重量単位
		result.setWeightUnit(item.getWeightUnit());
		// 原産国名表示フラグ
		result.setCountryOfOrignShowFlg(item.getCountryOfOrignShowFlg());
		// 原産国コード
		result.setCountryOfOrigin(item.getCountryOfOrigin());
		// 原産国名
		result.setCountryNameOfOrigin(getInforName(result.getExportFlg(), 
				item.getOriginNtvCountryName_1(), item.getOriginCountryName()));
		// 寸法単位
		result.setUnitOfMeasure(item.getUnitOfMeasure());
		// 売通貨単位
		result.setSUnitPriceCcyCd(item.getsUnitPriceCcyCd());
		// 仕入通貨単位
		result.setPUnitPriceCcyCd(item.getpUnitPriceCcyCd());
		// 総重量
		result.setTotalOfWeight(item.getTotalWeight());
		// 数量合計
		result.setSumQty(item.getTotalQty());
		// 受注金額
		result.setSoAmt(item.getSoAmount());
		// 税込み売単価
		result.setInTaxSPrice(item.getIncludeTaxSUPrice());
		// 受注金額小計
		result.setSoAmtSum(item.getSubtotalSoAmount());
		// 合計税金額
		result.setTotalTaxAmt(item.getTaxAmount());
		// 割引費
		result.setOffAmt(item.getTenthsDiscountedCost());
		// その他値引額
		result.setOtherDsctAmount(item.getOtherDsctAmount());
		// 運賃値引フラグ
		result.setFrtDiscountFlg(item.getFrtDiscountFlg());
		// 総合計額
		result.setTotalAmt(item.getTotalAmountPrice());
		// オリジナルINVOICENO
		result.setOriginalInvoiceNo(BLANK);
		// ジャーナル日付
		result.setJournalDt(BLANK);
		// オリジナルInvoiceDate
		result.setOriginalInvoiceDt(BLANK);
		// オリジナルグローバル番号
		result.setOriginalGlobalNo(BLANK);
		// オリジナル受注伝票番号
		result.setOriginalSoVoucherNo(BLANK);
		// 理由コード
		result.setReasonCd(BLANK);
		// 理由内容
		result.setReasonContent(BLANK);
		// 元請求書合計金額
		result.setSrcSumAmt(0);
		// 修正額
		result.setDiffAmt(0);
		// デビット/クレジット税金合計額
		result.setCreditTaxAmt(0);
		// デビット/クレジット総金額
		result.setCreditSumAmt(0);
		// 出荷不可フラグ
		result.setShipStopFlg(BLANK);
		// サプライヤーインボイス番号
		result.setSupplierInvNo(item.getSupplierInvNo());
		// 顧客到着日
		result.setCrd(getDateToString(item.getCrd()));
		// 所管部門コード
		result.setDeptCd(item.getProductControlDepCode());
		// 特別カスタマーBOX番号
		result.setSpecialCustBoxNo(item.getSpecialCustBoxNo());
		// 特別カスタマーBOXグループ
		result.setSpecialCustBoxGrp(item.getSpecialCustBoxGrp());
		// 輸送手段
		result.setTransportMeans(item.getTransportMeans());
		// 危険品フラグ
		result.setHazardFlg(item.getHazardFlg());
		// CS窓口
		result.setCsWindow(getInforName(result.getExportFlg(), 
				item.getNtvCellName(), item.getCellName()));
		// 値引表示フラグ
		result.setDiscountShowFlg(item.getDiscountShowFlg());
		// HSコード表示フラグ
		result.setHsCdShowFlg(item.getHsCdShowFlg());
		// NetWeight表示フラグ
		result.setNetWeightShowFlg(item.getNetWeightShowFlg());
		// 直送区分
		result.setDirectShipFlg(item.getDirectShipFlg());
		// 現法間取引フラグ
		result.setSuppsubBusinessFlg(getSuppsubBusinessFlg(item.getCustCategoryCd()));
		// 配送業者顧客番号
		result.setCarrierAcctNo(item.getCarrierAcctNo());
		// サービス停止区分
		result.setServiceStopDiv(item.getServiceStopDiv());
		// INVOICE注釈３
		result.setInvoiceRemarks_3(BLANK);
		// INVOICE注釈１
		result.setInvoiceRemarks_1(BLANK);
		// INVOICE注釈２
		result.setInvoiceRemarks_2(BLANK);
		// 物品税管理地
		result.setGoodsTaxMangeCity(BLANK);
		// 部署名
		result.setDeptName(BLANK);
		// Commissionerate
		result.setCommissionerate(BLANK);
		// 輸入申告書番号
		result.setImportNo(BLANK);
		// 入荷番号
		result.setArrNo(BLANK);
		// 出荷番号
		result.setShipNo(BLANK);
		// 売金額（相殺関税抜き）
		result.setAmt(0);
		// 相殺関税額
		result.setSetoffAmt(0);
		// 教育目的税額
		result.setEduTaxAmt(0);
		// 第２教育目的税額
		result.setEdu2TaxAmt(0);
		// 特別追加関税額
		result.setSAddTaxAmt(0);
		// 売金額（相殺関税込み）
		result.setInTaxAmt(0);
		// 売金額（相殺関税抜き）合計
		result.setSumAmt(0);
		// 相殺関税額合計
		result.setSumSetoffAmt(0);
		// "CENVAT Amt.合計
		result.setCentvatAmt(0);
		// 教育目的税額合計
		result.setSumEduTaxAmt(0);
		// 第2教育目的税額合計
		result.setSumEdu2TaxAmt(0);
		// 特別追加関税額合計
		result.setSumSAddTaxAmt(0);
		// 売金額（相殺関税込み）合計
		result.setSumInTaxAmt(0);
		// 重量合計
		result.setSumWeight(0);
		// 売金額合計（割引後）
		result.setSumActAmt(0);
		// 輸入関税評価額総計
		result.setTotalImportTaxAmt(0);
		// 相殺関税額総計
		result.setTotalSetoffTaxAmt(0);
		// 教育目的税額総計
		result.setTotalEduTaxAmt(0);
		// 第2教育目的税額総計
		result.setTotalEdu2TaxAmt(0);
		// 特別追加関税額総計
		result.setTotalSAddTaxAmt(0);
		// 数量合計
		//TODO result.setSumQty(0);
		// 相殺関税額合計
		result.setSumSetoffAmt(0);
		// 教育目的税額合計
		result.setSumEduTaxAmt(0);
		// 第2教育目的税額合計
		result.setSumEdu2TaxAmt(0);
		// 特別追加関税額合計
		result.setSumSAddTaxAmt(0);
		// 中央付加価値税額合計
		result.setSumCAddTaxAmt(0);
		// 所在地
		result.setLocalCity(BLANK);
		// 内税外税区分
		result.setTaxInExDiv(item.getTaxInExDiv());
		// 指定ＶＳＤ
		result.setSpecifyVad(BLANK);
		// 該非区分
		result.setIfDiv(getIfDiv(item.getOrderMsgCd()));
		// 配達時間帯
		result.setDeliveryTime(BLANK);
		// 送り状№回答区分
		result.setSendAnsDiv(BLANK);
		// 着日指示コメント
		result.setRdInstructComment(BLANK);
		// 配送日
		result.setDeliveryDate(BLANK);
		// SCコード名称（漢字）
		result.setScCodeName(item.getNtvMcPlantName());
		// 得意先名(カナ)
		result.setCustNameKana(item.getNtvCustName2());
		// 着日指示フラグ
		result.setRdInstructFlg(nvl(item.getSubsidiaryCdArrDt(), "1", "0"));
		// 注文部課名(漢字)
		result.setNtvCustDept(setKanJi(result.getArrUserDivJp(), 
				item.getNtvCustDept()));
		// 注文担当者(漢字)
		result.setNtvCustAttention(setKanJi(result.getArrUserDivJp(), 
				item.getNtvCustAttention()));
		// 商品名略称(カナ)
		result.setProductNameKana(getInforName(result.getExportFlg(), 
				item.getNtvProductName(), item.getProductName()));
		// 別納区分
		result.setOtherDeliDiv(BLANK);
		// 消費税率
		result.setCtaxRate(0);
		// 置場区分
		result.setPlantDiv(BLANK);
		// セル
		result.setCellCd(item.getCellCd());
		// 注文者部課名（英語）
		result.setCustDeptEn(BLANK);
		// 注文担当者名（英語）
		result.setCustAttentionEn(BLANK);
		// DMコード1
		result.setDmCd_1(BLANK);
		// DMコード2
		result.setDmCd_2(BLANK);
		// DMコード3
		result.setDmCd_3(BLANK);
		// DMコード4
		result.setDmCd_4(BLANK);
		// DMコード5
		result.setDmCd_5(BLANK);
		// 得意先メールアドレス
		result.setCustMailAddress(item.getCustMailAddressFlg());
		// 直送先メールアドレス
		result.setShipToMailAddress(item.getShipToMailAddress());
		// 輸出国仕入単価
		result.setExportPurcUpri(0);
		// 輸出国仕入単価通貨
		result.setExportPurcUpriCur(BLANK);
		// フレイト単価
		result.setFreightUpri(0);
		// 輸入諸掛単価
		result.setImportUpri(0);
		// 輸入関税単価
		result.setImportTaxUpri(0);
		// フレイト取引為替レート
		result.setFreightXrate(BLANK);
		// 現法通貨為替レート
		result.setSuppsubCurXrate(BLANK);
		// 仕入金額
		result.setPurcAmt(0);
		// Supplier Invoice Date 
		result.setSupplierInvoiceDate(BLANK);
		// 発注日
		result.setPoDt(BLANK);
		// 税抜き受注金額小計
		result.setSumSoAmt(0);
		// インコタームス１
		result.setIncoterms_1(BLANK);
		// インコタームス２
		result.setIncoterms_2(BLANK);
		// インコタームス３
		result.setIncoterms_3(BLANK);
		// 出荷置場コード
		result.setShipPlantCd(BLANK);
		// 優先得意先フラグ
		result.setFirstCustFlg(BLANK);
		// 更新区分
		result.setUpdDiv(BLANK);
		// 作成日_日本用
		result.setCrtDtJp(result.getCrtDt());
		// MC・置場コード_日本用
		result.setMcPlantCdJp(result.getMcPlantCd());
		// 得意先コード_日本用
		result.setCustCdJp(result.getCustCd());
		// 仕入先コード_日本用
		result.setSupplierCdJp(result.getSupplierCd());
		// 置場_日本用
		result.setMcPlantDivJp(result.getPlant());
		// グローバル番号_日本用
		result.setGlobalNoJp(result.getGlobalNoJp());
		// 子商品SEQ_日本用
		result.setChildSeqJp(result.getChildSeqJp());
		// データ区分_日本用
		result.setDataDivJp(result.getDataDivJp());
		// 商品コード用ブランド名 _日本用
		result.setBrandNameForProductCdJp(getMcPlantDivJp(item.getBrandNameForProductCd()));
		// ブランド商品コード_日本用
		result.setBrandProductCdJp(getBrandProductCdJp(item.getProductCdMst(), item.getBrandNameForProductCd()));
		// 子発注SEQ_日本用
		result.setSubPoSeqJp(item.getGlobalNoPo());
		// 拠点_日本用
		result.setReceivableMcCdJp(item.getReceivableMcCd());
		// MC漢字名称_日本用
		result.setNtvDeptNameAbbJp(item.getNtvDeptNameAbb());
		// MC電話番号_日本用
		result.setNtvDeptTelAbbJp(item.getPlantDeptTel());
		// 納品書印刷フラグ_日本用
		result.setPackingFlgJp(item.getPackingFlg());
		// 納品書出力枚数（オリジナル）_日本用
		result.setPackingPrintNumOrgnJp(item.getPackingPrintNumOrgn());
		// 納品書出力枚数（控え）_日本用
		result.setPackingPrintNumCopyJp(item.getPackingPrintNumCopy());
		// 納品書保存フラグ_日本用
		result.setPackingRetainFlgJp(item.getPackingRetainFlg());
		// 英文納品書印刷フラグ_日本用
		result.setEngPackingPrintFlgJp(getEngPackingPrintFlgJp(result.getExportFlg(), 
				item.getEngPackingFlg(), result.getVoucherDiv(), result.getCustCountryCd()));
		// 英文納品書出力枚数（オリジナル）_日本用
		result.setEngPackingPrintNumOrgnJp(item.getEngPackingPrintNumOrgn());
		// 英文納品書出力枚数（控え）_日本用
		result.setEngPackingPrintNumCopyJp(item.getEngPackingPrintNumCopy());
		// 英文納品書保存フラグ_日本用
		result.setEngPackingRetainFlgJp(item.getEngPackingRetainFlg());
		// 仮納品書印刷フラグ_日本用
		result.setTmpPackingPrintFlgJp(getTmpPackingPrintFlgJp(item.getDirectShipFlg(), 
				item.getTempVoucherDiv(), item.getTmpPackingFlg()));
		// 仮納品書出力枚数（オリジナル）_日本用
		result.setTmpPackingPrintNumOrgnJp(item.getTmpPackingPrintNumOrgn());
		// 仮納品書出力枚数（控え）_日本用
		result.setTmpPackingPrintNumCopyJp(item.getTmpPackingPrintNumCopy());
		// 仮納品書保存フラグ_日本用
		result.setTmpPackingRetainFlgJp(item.getTmpPackingRetainFlg());
		// 請求明細書印刷フラグ_日本用
		result.setInvoiceFlgJp(item.getInvoiceFlg());
		// 請求明細書出力枚数（オリジナル）_日本用
		result.setInvoicePrintNumOrgnJp(item.getInvoicePrintNumOrgn());
		// 請求明細書出力枚数（控え）_日本用
		result.setInvoicePrintNumCopyJp(item.getInvoicePrintNumCopy());
		// 請求明細書保存フラグ_日本用
		result.setInvoiceRetainFlgJp(item.getInvoiceRetainFlg());
		// ピッキングラベル早出しユーザー区分_日本用
		result.setLabelEarlyDivJp(item.getLabelEarlyDiv());
		// ピッキングラベル早出し対象区分_日本用
		result.setLabelEarlyObjectDivJp(getLabelEarlyObjectDivJp(result.getLabelEarlyDivJp(), 
				result.getDeliDiv(), item.getMcPlantDiv()));
		// 納入部課区分_日本用
		result.setArrDeptDivJp(item.getGrp());
		// 仕入先名（カナ）_日本用
		result.setCompanyNameKanaJp(item.getNtv2CompanyName());
		// ランク梱包SEQ_日本用
		result.setRankFlgJp(BLANK);
		// 得意先で複数配送先有無マーク_日本用
		result.setMangShipToFlgJp(item.getW1DeliAttentionCd());
		// 巡回便区分_日本用
		result.setPatrolDivJp(BLANK);
		// 現法名（カナ）_日本用
		result.setCustNameKanaJp(getCustNameKanaJp(result.getExportFlg(),item.getCustName()));
		// 現法名２_日本用
		result.setCustName_2Jp(getCustName_2(result.getBillToCountryName(), result.getCustName()));
		// 梱包指示１_日本用
		result.setNtvPackingInstruct1J(item.getNtvPackingInstruct1J());
		// 梱包指示２_日本用
		result.setNtvPackingInstruct2J(item.getNtvPackingInstruct2J());
		// 梱包指示３_日本用
		result.setNtvPackingInstruct3J(item.getNtvPackingInstruct3J());
		// 梱包指示４_日本用
		result.setNtvPackingInstruct4J(item.getNtvPackingInstruct4J());
		// 梱包指示５_日本用
		result.setNtvPackingInstruct5J(item.getNtvPackingInstruct5J());
		// 事務指示１_日本用
		result.setNtvBusinessInstruct1J(item.getNtvBusinessInstruct1J());
		// 事務指示２_日本用
		result.setNtvBusinessInstruct2J(item.getNtvBusinessInstruct2J());
		// 事務指示３_日本用
		result.setNtvBusinessInstruct3J(item.getNtvBusinessInstruct3J());
		// 事務指示４_日本用
		result.setNtvBusinessInstruct4J(item.getNtvBusinessInstruct4J());
		// 事務指示５_日本用
		result.setNtvBusinessInstruct5J(item.getNtvBusinessInstruct5J());
		// 直送先担当者（カナ）_日本用
		result.setShipToAttentionKanaJp(item.getShipToDeliAttention());
		// 直送先部課（カナ）_日本用
		result.setShipToDeptKanaJp(item.getShipToDeliDept());
		// 得意先担当者（カナ）_日本用
		result.setCustDeliAttentionKanaJp(getCustInfor(result.getArrUserDivJp(), item.getShipToCd(), item.getCustCd(), 
				item.getNtvDeliAttention(), item.getNtvCustAttention()));
		// 得意先部課（カナ）_日本用
		result.setCustDeliDeptKanaJp(getCustInfor(result.getArrUserDivJp(), item.getShipToCd(), item.getCustCd(), 
				item.getNtvDeliDept(), item.getNtvCustDept()));
		// 注文者名（カナ）_日本用
		result.setCustAttentionKanaJp(setKanaJp(result.getArrUserDivJp(), item.getNtvCustAttention()));
		// 注文担当部課名（カナ）_日本用
		result.setCustDeptKanaJp(setKanaJp(result.getArrUserDivJp(), item.getNtvCustDept()));
		// 直送先名称（カナ）_日本用
		result.setShipToNameKanaJp(item.getNtvShipToName2());
		// 納入者名（カナ）_日本用
		result.setDeliAttentionKanaJp(setKanaJp(result.getArrUserDivJp(), item.getNtvDeliAttention()));
		// 納入担当部課名（カナ）_日本用
		result.setDeliDeptKanaJp(setKanaJp(result.getArrUserDivJp(), item.getNtvDeliDept()));
		// 地区コード_日本用
		result.setCityCdJp(nvl(item.getShipToCd(), item.getShipToCityCd(), item.getCustCityCd()));
		// 備考(自動車規格コード)_日本用
		result.setAutomobileStandardCdJp(item.getAutomobileStandardCd());
		// 個口数SEQ_日本用
		result.setUnitQtySeqJp(item.getBoxNumberSeq());
		// 届先件数_日本用
		result.setSendedQtyJp(item.getShippingNumber());
		// ストーク料金適用区分_日本用
		result.setStorkChargeApplyDivJp(item.getStorkChargeApplyDiv());
		// 納品書番号_MJP_日本用
		result.setDeliNoteNoMjp(String.valueOf(item.getDeliNoteNoMjp()));
		// 合計金額（日本納品書用）_日本用
		result.setSumAmtJp(item.getTotalSAmountMjp());
		// 元J納品書番号_日本用
		result.setOldDeliNoteNoJp(item.getOriginalDeliNoteNo());

		return result;
	}

	/**
	 * 作成日を設定
	 * 
	 * 
	 */
	public Date getCrtDt() {

		Calendar updTs = Calendar.getInstance(TimeZone.getTimeZone("JST"));
		return updTs.getTime();
		
	}

	/**
	 * 親注番を設定
	 * @param str1,str2
	 * @return string
	 */
	public String getCustRef(String str1,String str2) {

		if (str1 == "MJP") {
			return " ";
		}
		else {
			return str2;
		}
	}

	/**
	 * 結合注番を設定
	 * @param CustRef,CystRefNtv,CustSubRef
	 * @return string
	 */
	public String getRefStr(String custRef, String cystRefNtv, String custSubRef, String yType) {

		if (!isEmpty(custRef)) {
			if (!isEmpty(cystRefNtv) && isEmpty(custSubRef)) {
				return custRef + "/" + cystRefNtv + yType;
			}
			if (!isEmpty(cystRefNtv) && !isEmpty(custSubRef)) {
				return custRef + "/" + cystRefNtv + "/" + custSubRef + yType;
			}
			if (isEmpty(cystRefNtv) && !isEmpty(custSubRef)) {
				return custRef + "/" + custSubRef + yType;
			}
			return custRef + yType;
		}
		else {
			if (!isEmpty(cystRefNtv) && isEmpty(custSubRef)) {
				return cystRefNtv + yType;
			}
			if (!isEmpty(cystRefNtv) && !isEmpty(custSubRef)) {
				return cystRefNtv + "/" + custSubRef + yType;
			}
			if (isEmpty(cystRefNtv) && !isEmpty(custSubRef)) {
				return custSubRef + yType;
			}
			return yType;
		}
	}

	/**
	 * Dateの型(yyyyMMdd)を設定
	 * @param date
	 * @return currentTime
	 */
	public String getDateToString(Date date) {
		
		if (date == null) {
			return null;
		}
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		String dateString = formatter.format(date);
		return dateString;
	}

	/**
	 * 輸出フラグを設定
	 * @param custsubSubsidiaryCd,shipToCd,custCountryCd
	 * @param countryCd,shipToCountryCd
	 * @return String
	 */
	public String getExportFlg(String custsubSubsidiaryCd, String shipToCd, 
			String custCountryCd, String countryCd, String shipToCountryCd) {

		if (!isEmpty(custsubSubsidiaryCd) || (isEmpty(shipToCd) && custCountryCd != countryCd) 
				||(!isEmpty(shipToCd) && shipToCountryCd != countryCd)) {
			return "1";
		}
		else {
			return "0";
		}
	}

	/**
	 * 情報を設定
	 * @param flg 輸出フラグ
	 * @param infor1 
	 * @param infor2 
	 * @return  輸出フラグ 0の場合 infor1設定 ;輸出フラグ 1の場合 infor2設定
	 */
	public String getInforName(String flg, String infor1, String infor2){

		if (flg == "0") {
			if (!isEmpty(infor1)) {
				return infor1;
			}
			else {
				return infor2;
			}
		}
		else {
			return infor2;
		}
	}

	/**
	 * 分析名称を設定
	 * @param flg 輸出フラグ
	 * @param ntvClassifyCdName 製品分類マスタ.分析コード名（現地語）
	 * @param classifyCdName 製品分類マスタ.分析コード名（前頭３２文字）
	 * @return classifyName
	 */
	public String getClassifyName(String flg, String ntvClassifyCdName, String classifyCdName) {

		if (flg == "0") {
			if (!isEmpty(ntvClassifyCdName)) {
				return ntvClassifyCdName;
			}
			else {
				if (isEmpty(classifyCdName)) {
					return BLANK;
				}
				return classifyCdName.substring(0,32);
			}
		}
		else {
			if (isEmpty(classifyCdName)) {
				return BLANK;
			}
			return classifyCdName.substring(0,32);
		}
	}

	/**
	 * 納入者部課（現地語）を設定
	 * @param ntvCustDept 納入者部課（現地語）
	 * @param subsidiaryCd 現法コード
	 * @param grp 受注明細.グループ
	 * @return deliDept
	 */
	public String getDeliDept(String ntvCustDept, String subsidiaryCd, String grp) {
		
		if (subsidiaryCd == "MJP" && grp == "2") {
			return BLANK;
		}
		else {
			return ntvCustDept;
		}
	}

	/**
	 * 運賃エリアコードを設定
	 * @param shipToCd 受注明細.直送先コード
	 * @param shipToFrtAreaCd 直送先マスタ.運賃エリアコード
	 * @param frtAreaCd 得意先マスタ.運賃エリアコード
	 * @return frtAreaCd
	 */
	public String getFrtAreaCd(String shipToCd, String shipToFrtAreaCd, String frtAreaCd) {
		
		if (!isEmpty(shipToCd)) {
			return shipToFrtAreaCd;
		}
		else {
			return frtAreaCd;
		}
	}

	/**
	 * 指示を設定
	 * @param object 判断対象
	 * @param result1 戻り値1
	 * @param result2  戻り値2
	 * @return objectがブランクの場合　result2を設定；以外の場合　result1を設定；
	 */
	public String nvl(String object, String result1, String result2) {
		
		if (!isEmpty(object)) {
			return result1;
		}
		else {
			return result2;
		}
	}

	/**
	 * 直送先Inforを設定
	 * @param shipToCd 受注明細の直送先コード
	 * @param flg 輸出フラグ
	 * @param infor1
	 * @param infor2 
	 * @return shipToInfor
	 */
	public String getShipToInfor(String shipToCd, String flg, String infor1, String infor2, String infor3) {
		if (isEmpty(shipToCd)) {
			return BLANK;
		}
		else {
			if (flg == "0") {
				if (!isEmpty(infor1)) {
					return infor1;
				}
				else {
					return infor2;
				}
			}
			else {
				return infor3;
			}
		}
	}

	/**
	 * 商品コード用ブランド名を設定
	 * @param brandNameForProductCd 商品コード用ブランド名.商品コード用名
	 *  
	 * @return brandNameForProductCd
	 */
	public String getMcPlantDivJp(String brandNameForProductCd) {
		if (brandNameForProductCd == "ﾐｽﾐ" || brandNameForProductCd== "MISUMI") {
			return BLANK;
		}
		else {
			return brandNameForProductCd;
		}
	}

	/**
	 * ブランド商品コードを設定
	 * @param productCdMst 商品マスタ.商品コード
	 * @param branNmForProductCd ブランドマスタ.商品コード用ブランド名
	 * @return brandNameForProductCd
	 */
	public String getBrandProductCdJp(String productCdMst, String branNmForProductCd) {

		String str = BLANK;
		if (!isEmpty(branNmForProductCd)) {
			str = productCdMst + "(" + branNmForProductCd + ")";
			if (str.length() > 56) {
				return productCdMst;
			}
			else {
				return str;
			}
		}
		else {
			str = productCdMst;
			return str;
		}

	}

	/**
	 * 英文納品書印刷フラグを設定
	 * @param flg 輸出フラグ
	 * @param engPackingRetain 得意先マスタ.英文納品書フラグ
	 * @param shipTyp 伝票区分
	 * @param custCountryCd 得意先国コード
	 * @return EngPackingPrintFlgJp
	 */
	public String getEngPackingPrintFlgJp(String flg, String engPackingRetain, String shipTyp, String custCountryCd) {
		
		if (flg == "1" && (shipTyp == "110" || shipTyp == "116") && custCountryCd != "192") {
			return engPackingRetain;
		}
		else {
			return "0";
		}
	}

	/**
	 * 仮納品書印刷フラグを設定
	 * @param directShipFlg 受注明細.直送フラグ
	 * @param shipToTempVoucherDiv 直送先マスタ.仮伝区分
	 * @param tmpFlg 得意先マスタ.仮納品書フラグ
	 * @return tmpPackingPrintFlgJp
	 */
	public String getTmpPackingPrintFlgJp(String directShipFlg, String shipToTempVoucherDiv, String tmpFlg) {
		
		if (directShipFlg == "1") {
			return "0";
		}
		else {
			if (shipToTempVoucherDiv == "0") {
				return "1";
			}
			else {
				return tmpFlg;
			}
		}
	}

	/**
	 * ピッキングラベル早出し対象区分を設定
	 * @param labelEarlyDivJp ピッキングラベル早出しユーザー区分
	 * @param deliDiv 納区
	 * @param mcPlantDiv 受注明細.置場区分
	 * @return labelEarlyObjectDivJp
	 */
	public String getLabelEarlyObjectDivJp(String labelEarlyDivJp, String deliDiv, String mcPlantDiv) {

		if (labelEarlyDivJp == "1" && !isEmpty(deliDiv)
				&& deliDiv.substring(0, 1).equals("0")
				&& mcPlantDiv == "532") {
			return "1";
		}
		else {
			return BLANK;
		}
	}

	/**
	 * 現法名（カナ）を設定
	 * @param flg 輸出フラグ
	 * @param custName 得意先マスタ.得意先名（英字）を設定
	 * 
	 * @return custNameKanaJp
	 */
	public String getCustNameKanaJp(String flg, String custName) {

		if (flg == "1") {
			return custName;
		}
		else {
			return BLANK;
		}
	}

	/**
	 * 現法名２を設定
	 * @param billToCountryName 売掛先国名
	 * @param custName 得意先名称（現地語）
	 * 
	 * @return custName_2
	 */
	public String getCustName_2(String billToCountryName, String custName) {

		if (!isEmpty(billToCountryName)) {
			if (!isEmpty(billToCountryName.trim()) && !isEmpty(custName)) {
				return billToCountryName.trim() + "/" + custName.trim();
			}
			else {
				return custName;
			}
		}
		else {
			return BLANK;
		}
	}

	/**
	 * 得意先Inforを設定
	 * @param arrUserDivJp 納入担当者区分
	 * @param shipToCd 受注明細.直送先コード
	 * @param custCd 受注明細.得意先
	 * @param result1  値1
	 * @param result2  値2
	 * @return custInfor
	 */
	public String getCustInfor(String arrUserDivJp, String shipToCd, String custCd, 
			String result1, String result2) {

		if (arrUserDivJp == "2") {
			if (isEmpty(shipToCd) || shipToCd == custCd) {
				return result1;
			}

			if (!isEmpty(shipToCd) && shipToCd != custCd) {
				return result2;
			}

			return BLANK;
		}
		else {
			return BLANK;
		}
	}

	/**
	 * カナを設定
	 * @param arrUserDivJp 納入担当者区分
	 * @param result  値
	 * 
	 * @return kanaJp
	 */
	public String setKanaJp(String arrUserDivJp, String result) {

		if (arrUserDivJp == "2") {
			return result;
		}
		else {
			return BLANK;
		}
	}

	/**
	 * 漢字を設定
	 * @param arrUserDivJp 納入担当者区分
	 * @param result  値
	 * 
	 * @return kanaJp
	 */
	public String setKanJi(String arrUserDivJp, String result) {

		if (arrUserDivJp == "1") {
			return result;
		}
		else {
			return BLANK;
		}
	}

	/**
	 * emptyが判断
	 * @param ｓｔｒ  判断対象
	 * 
	 * @return boolean
	 */
	public boolean isEmpty(String str) {

		if (str == null || str.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * 親注番（現地語）を設定
	 * @param suppsubSubsidiaryCd  現法コード
	 * @param headerRef 受注ヘッダ.ヘッダー注文番号
	 * @param engHeaderRef	受注ヘッダ.ヘッダー注文番号(英数)
	 * @param custRef 親注番
	 * @return boolean
	 */
	public String getCystRefNtv(String suppsubSubsidiaryCd, String headerRef, String engHeaderRef, String custRef) {
		// "MJPの場合、 COALESCE(SH.HEADER_REF, SH.ENG_HEADER_REF, SD.CUST_REF)
		// 上記以外の場合、 COALESCE(SH.HEADER_REF, SH.ENG_HEADER_REF)"
		if (suppsubSubsidiaryCd == "MJP") {
			if (!isEmpty(headerRef)) {
				return headerRef;
			} else if (!isEmpty(engHeaderRef)) {
				return engHeaderRef;
			} else if (!isEmpty(custRef)) {
				return custRef;
			}
			return BLANK;
		} else {
			if (!isEmpty(headerRef)) {
				return headerRef;
			} else if (!isEmpty(engHeaderRef)) {
				return engHeaderRef;
			}
			return BLANK;
		}
	}

	/**
	 * 現法間取引フラグを設定
	 * @param custCategoryCd 受注明細．得意先カテゴリコード
	 * @param 
	 * @return 受注明細．得意先カテゴリコード01または02の場合、１設定;それ以外０設定
	 */
	public String getSuppsubBusinessFlg(String custCategoryCd) {

		if (custCategoryCd == "01" || custCategoryCd == "02") {
			return "1";
		}
		else {
			return "0";
		}
	}

	/**
	 * DateToString
	 * @param date
	 * @param
	 * @return dateがnullの場合：null;それ以外の場合: date.toString;
	 */
	public String  dateToString(Date date) {
		if (date == null) {
			return null;
		}
		else {
			return date.toString();
		}
	}

	private String subString (String str, int begin, int lenth) {
		
		if (isEmpty(str)) {
			return  BLANK;
		}
		else {
			if (lenth > str.length()) {
				return str;
			}
			else {
				return str.substring(begin, lenth);
			}
		}
	}

	/**
	 * 該非区分を設定
	 * @param orderMsgCd 輸出管理マスタ.受注メッセージコード
	 * @param 
	 * @return orderMsgCdが9001の場合、1設定;9002の場合、2設定;それ以外BLANK設定
	 */
	public String getIfDiv(String orderMsgCd) {
		
		if (!isEmpty(orderMsgCd)) {
			if (orderMsgCd.equals("9001")) {
				return "1";
			}
			if (orderMsgCd.equals("9002")) {
				return "2";
			}
			return BLANK;
		}
		else {
			return BLANK;
		}
	}
}
