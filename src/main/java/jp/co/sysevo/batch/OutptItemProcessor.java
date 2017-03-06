package jp.co.sysevo.batch;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.filter.LevelFilter;
import jp.co.sysevo.model.InptData;
import jp.co.sysevo.model.OutptData;

@Component("itemProcessor")
@Scope("step")
public class OutptItemProcessor implements ItemProcessor<InptData, OutptData>{
	@Override
	public OutptData process(InptData item) throws Exception {
		System.out.println("------------------EntryItemProcessor---------------------");
		System.out.println(item.toString());

		OutptData result = new OutptData();

		// 作成日
		result.setCrtDt(getCrtDt());
		// 現法コード
		result.setSuppsubSubsidiaryCd(item.getSubsidiaryCd());
		// MC・置場コード
		result.setMcPlantCd(item.getMcCd());
		// 得意先コード
		result.setCustCd(item.getCustCd());
		// 仕入先コード
		result.setSupplierCd(item.getSupplierCd());
		// 置場
		result.setPlant(item.getPlantDiv().substring(0,2));
		// 直送先コード
		result.setShipToCd(item.getShipToCd());
		// 入荷予定日
		result.setSchdArrDt(getDate(item.getVrd()));
		// 出荷予定日
		result.setSchdShipDt(getDate(item.getVsd()));
		// 親注番コード
		result.setCustRefCd(String.valueOf(item.getCustRefLength()));
		// 親注番
		result.setCustRef(getCustRef(item.getSubsidiaryCd(), item.getCustRef()));
		// 親注番（現地語）
		//TODO
//		result.setCystRefNtv(item.getCystRefNtv());
		// 子注番
		result.setCustSubRef(item.getCustSubRef());
		// 結合注番
		result.setRefStr(getRefStr(result.getCustRef(), result.getCystRefNtv(), result.getCustSubRef(), "item.get受注明細.Ｙ品番区分"));
		// グローバル番号
		result.setGlobalNo(item.getGlobalNo());
		// COMET紐付けSEQ
		result.setCometSeq(result.getSchdShipDt().toString() + item.getCometSeq());
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
				item.getCustCountryCd(), item.getCountryCd(), item.getShipToCountryCd()));
		// 仕入先名(現地語)
		result.setPurcCompanyName(getInforName(result.getExportFlg(), item.getNtv1CompanyName(), item.getCompanyName()));
		// 仕入先名(英語)
		result.setPurcCompanyNameEn(item.getCompanyName());
		// 仕入先国コード
		result.setPurcCountryCd(item.getCompanyCountryCd());
		// 仕入先国名（英語）
		result.setPurcCountryName(item.getCountryName());
		// 分析コード
		result.setClassifyCd(item.getClassifyCd());
		// 分析名称
		result.setClassifyName(getClassifyName(result.getExportFlg(), item.getNtvClassifyCdName(), item.getClassifyCdName()));
		// バッチ区分result.setBacthDiv(item.getBacthDiv());
		//TODO
		// 在庫区分
		result.setStkDiv(item.getMcPlantDiv());
		// データ区分
		result.setDataDiv(item.getDataDiv());
		// 納区
		result.setDeliDiv(item.getDeliDiv());
		// 子商品SEQ
		// TODO result.setChildSeq(item.getChildSeq());
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
		result.setTempVoucherDiv(item.getShipToTempVoucherDiv());
		// ピッキングラベル種別
		//TODO result.setLabelDiv();
		// 納入担当部課コード
		//TODOresult.setDeliDeptCd(item.getDeliDeptCd());
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
		result.setFrtAreaCd(getFrtAreaCd(item.getShipToCd(), item.getShipToFrtAreaCd(), item.getFrtAreaCd()));
		// ブランド名(現地語)
		result.setBrandName(getInforName(result.getExportFlg(), item.getNtvBrandName(), item.getBrandName()));
		// ミスミ商品コード
		result.setMisumiProductCd(item.getProductCdMst());
		// 発注入り数
		result.setPoQtyPerCase(item.getPoQtyPerCase());
		// 入荷ラベル発注番号
		result.setBarcodeGlobalNo(item.getBarcodeGlobalNo());
		// 納品書番号result.setPackingNo(item.getPackingNo());
		//TODO
		// 箱番号result.setBoxNo(item.getBoxNo());
		//TODO
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
		result.setDeliInvPrintNumCopy(item.getDeliInvPrintNumCopy());
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
		result.setSuppsubSubsidiaryName(getInforName(result.getExportFlg(), item.getNtvSubsidiaryName(), item.getSubsidiaryName()));
		// 現法住所1
		result.setSuppsubAddress_1(getInforName(result.getExportFlg(), item.getNtvAddress_1(), item.getAddress_1()));
		// 現法住所2
		result.setSuppsubAddress_2(getInforName(result.getExportFlg(), item.getNtvAddress_2(), item.getAddress_2()));
		// 現法住所3
		result.setSuppsubAddress_3(getInforName(result.getExportFlg(), item.getNtvAddress_3(), item.getAddress_3()));
		// 現法住所4
		result.setSuppsubAddress_4(getInforName(result.getExportFlg(), item.getNtvAddress_4(), item.getAddress_4()));
		// 現法電話番号
		result.setSuppsubTel(item.getTel());
		// 現法FAX番号
		result.setSuppsubFax(item.getFax());
		// 現法郵便番号
		result.setSuppsubPostalCd(item.getPostalCd());
		// 現法国コード
		result.setSuppsubCountryCd(item.getCountryCd());
		// 現法国名
		result.setSuppsubCountryName(getInforName(result.getExportFlg(), item.getNtvCountryName(), item.getCountryName()));
		// 現法登録番号
		result.setSuppsubLicenceNo(item.getLicenceNo());
		// 現法税登録番号
		result.setSuppsubVatRegistrationNumber(item.getVatRegistrationNumber());
		// 現法中央売上税番号
		result.setSuppsubSaleTaxNo("");
		// 現法物品税管理コード
		result.setSuppsubGoodsTaxMangeCd("");
		// 現法物品税管理地
		result.setSuppsubGoodsTaxMangeCity("");
		// 現法部署名
		result.setSuppsubDeptName("");
		// 現法Commissionerate
		result.setSuppsubCommissionerate("");
		// エコール得意先コード
		result.setEcalCustCd(item.getEcalCustCd());
		// 得意先名称（現地語）
		result.setCustName(getInforName(result.getExportFlg(), item.getNtvCustName1(), item.getCustName()));
		// 得意先名称（英語）
		result.setCustNameEn(item.getCustName());
		// 得意先住所1
		result.setCustAddress_1(getInforName(result.getExportFlg(), item.getCustNtvAddress_1(), item.getCustHalfwidthAddress_1()));
		// 得意先住所2
		result.setCustAddress_2(getInforName(result.getExportFlg(), item.getCustNtvAddress_2(), item.getCustHalfwidthAddress_2()));
		// 得意先住所3
		result.setCustAddress_3(getInforName(result.getExportFlg(), item.getCustNtvAddress_3(), item.getCustHalfwidthAddress_3()));
		// 得意先住所4
		result.setCustAddress_4(getInforName(result.getExportFlg(), item.getCustNtvAddress_4(), item.getCustHalfwidthAddress_4()));
		// 得意先部署名
		result.setCustDeptName(item.getNtvCustDept());
		// 得意先郵便番号
		//TODO
		result.setCustPostalNo(item.getCustName());
		// 得意先国コード
		result.setCustCountryCd(item.getCustCountryCdMst());
		// 得意先国コード(UPS)
		result.setCustCountryCdUps(item.getUpsCountryCd());
		// 得意先国名
		result.setCustCountryName(getInforName(result.getExportFlg(), item.getNtvCountryName(), item.getCountryName()));
		// 得意先都市名
		result.setCustCityName(item.getCustCityName());
		// 得意先電話番号
		result.setCustTel(item.getCustTel());
		// 得意先FAX番号
		result.setCustFax(item.getCustFax());
		// 得意先担当者
		result.setCustAttention(item.getNtvCustAttention());
		// 明細コメントresult.setDtlComment(item.getDtlComment());
		//TODO
		// 事務指示１フラグ
		//TODO
		result.setBusinessinstruct1ShowFlg(getInstructions(result.getShipToCd(),"直送先マスタ.事務指示１表示フラグ",item.getBusinessinstruct1ShowFlg()));
		// 事務指示１
		//TODO
		result.setNtvBusinessinstruct1(getInstructions(result.getShipToCd(),"直送先マスタ.事務指示１（現地語可）",item.getNtvBusinessinstruct1()));
		// 事務指示２フラグ
		result.setBusinessinstruct2ShowFlg(getInstructions(result.getShipToCd(),"直送先マスタ.事務指示2表示フラグ",item.getBusinessinstruct2ShowFlg()));
		// 事務指示２
		result.setNtvBusinessinstruct2(getInstructions(result.getShipToCd(),"直送先マスタ.事務指示2（現地語可）",item.getNtvBusinessinstruct2()));
		// 梱包指示１フラグ
		result.setPackingInstruct1ShowFlg(getInstructions(result.getShipToCd(),"直送先マスタ.梱包指示１表示フラグ",item.getPackingInstruct1ShowFlg()));
		// 梱包指示１
		result.setNtvPackingInstruct1(getInstructions(result.getShipToCd(),"直送先マスタ.梱包指示１（現地語可）",item.getNtvPackingInstruct1()));
		// 梱包指示２フラグ
		result.setPackingInstruct2ShowFlg(getInstructions(result.getShipToCd(),"直送先マスタ.梱包指示2表示フラグ",item.getPackingInstruct2ShowFlg()));
		// 梱包指示２
		result.setNtvPackingInstruct2(getInstructions(result.getShipToCd(),"直送先マスタ.梱包指示2（現地語可）",item.getNtvPackingInstruct2()));
		// CS指示result.setCsInstruct(item.getCsInstruct());
		//TODO
		// 企業ライセンス番号
		result.setCustOfficeLicenseNo(item.getCustOfficeLicenseNo());
		// 売掛先コード
		result.setBillToCd(item.getBillToCd());
		// 売掛先名
		result.setBillToName(getInforName(result.getExportFlg(), item.getNtvBillToName(), item.getBillToName()));
		// 売掛先住所1
		result.setBillToAddress_1(getInforName(result.getExportFlg(), item.getBillToNtvAddress_1(), item.getBillToHalfwidthAddress_1()));
		// 売掛先住所2
		result.setBillToAddress_2(getInforName(result.getExportFlg(), item.getBillToNtvAddress_2(), item.getBillToHalfwidthAddress_2()));
		// 売掛先住所3
		result.setBillToAddress_3(getInforName(result.getExportFlg(), item.getBillToNtvAddress_3(), item.getBillToHalfwidthAddress_3()));
		// 売掛先住所4
		result.setBillToAddress_4(getInforName(result.getExportFlg(), item.getBillToNtvAddress_4(), item.getBillToHalfwidthAddress_4()));
		// 売掛先部署名
		result.setBillToNtvBillToDept(item.getNtvBillToDept());
		// 売掛先郵便番号
		result.setBillToPostalCd(item.getBillToPostalCd());
		// 売掛先国コード
		result.setBillToCountryCd(item.getBillToCountryCd());
		// 売掛先国名
		result.setBillToCountryName(getInforName(result.getExportFlg(), item.getNtvCountryName(), item.getCountryName()));
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
		result.setShipToName(getShipToInfor(item.getShipToCd(),result.getExportFlg(), item.getNtvShipToName1(), item.getShipToName()));
		// 直送先住所1
		result.setShipToAddress_1(getShipToInfor(item.getShipToCd(),result.getExportFlg(), item.getCustNtvAddress_1(), item.getCustHalfwidthAddress_1()));
		// 直送先住所2
		result.setShipToAddress_2(getShipToInfor(item.getShipToCd(),result.getExportFlg(), item.getCustNtvAddress_2(), item.getCustHalfwidthAddress_2()));
		// 直送先住所3
		result.setShipToAddress_3(getShipToInfor(item.getShipToCd(),result.getExportFlg(), item.getCustNtvAddress_3(), item.getCustHalfwidthAddress_3()));
		// 直送先住所4
		result.setShipToAddress_4(getShipToInfor(item.getShipToCd(),result.getExportFlg(), item.getCustNtvAddress_4(), item.getCustHalfwidthAddress_4()));
		// 直送先部署名
		result.setShipToDeptName(item.getNtvDeliDept());
		// 直送先郵便番号
		result.setShipToPostalNo(item.getBillToPostalCd());
		// 直送先国コード
		result.setShipToCountryCd(item.getBillToCountryCd());
		// 直送先国コード(UPS)
		result.setShipUpsCountryCd(item.getUpsCountryCd());
		// 直送先国名
		result.setShipToCountryName(getShipToInfor(item.getShipToCd(),result.getExportFlg(), item.getNtvCountryName(), item.getCountryName()));
		// 直送先都市名
		result.setShipToCityName(item.getCustCityName());
		// 直送先電話番号
		result.setShipToTel(item.getCustTel());
		// 直送先FAX番号
		result.setShipToFax(item.getCustFax());
		// 直送先担当者
		result.setShipToAttention(item.getNtvDeliAttention());
		// Sub1置場
		result.setSub1PlantCd(item.getCustsubMcPlantCd());
		// Sub1部門名
		result.setSub1DeptName(item.getDeptName());
		// Sub1住所1
		result.setSub1DeptAddress_1(item.getDeptAddress_1());
		// Sub1住所2
		result.setSub1DeptAddress_2(item.getDeptAddress_2());
		// Sub1住所3
		result.setSub1DeptAddress_3(item.getDeptAddress_3());
		// Sub1住所4
		result.setSub1DeptAddress_4(item.getDeptAddress_4());
		// Sub1郵便番号
		result.setSub1DeptPostalCd(item.getDeptPostalCd());
		// Sub1国コード
		result.setSub1DeptCountryCd(item.getCountryCd());
		// Sub1電話番号
		result.setSub1DeptTel(item.getDeptTel());
		// Sub1ＦＡＸ番号
		result.setSub1DeptFax(item.getDeptFax());
		// 扱い便区分
		result.setShippingDestinationCd(item.getShippingDestinationCd());
		// 配送業者名
		result.setCarrierName(item.getCarrierName());
		// 配送業者名略称
		result.setCarrierNameKana(item.getCarrierNameKana());
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
		result.setFinalCustName(getInforName(result.getExportFlg(), item.getNtvCustName1(), item.getCustName()));
		// 最終得意先名（英語）result.setFinalCustNameEn(item.getFinalCustNameEn());
		//TODO
		// 最終直送先コード
		result.setFinalCustsubShipToCd(item.getCustsubShipToCd());
		// 最終直送先名
		result.setFinalShipToName(getInforName(result.getExportFlg(), item.getNtvShipToName1(), item.getShipToName()));
		// 受注伝票番号
		result.setSoVoucherNo(item.getOriginalSoVoucherNo());
		// 受注年月日
		result.setSoDate(getDate(item.getSoDate()));
		// 商品名
		result.setProductName(getInforName(result.getExportFlg(), item.getNtvProductName(), item.getProductName()));
		// 単位重量
		result.setWeight(item.getWeight());
		// 重量単位
		result.setWeightUnit(item.getWeightUnit());
		// 原産国名表示フラグ
		result.setCountryOfOrignShowFlg(item.getCountryOfOrignShowFlg());
		// 原産国コード
		result.setCountryOfOrigin(item.getCountryOfOrigin());
		// 原産国名
		result.setCountryNameOfOrigin(getInforName(result.getExportFlg(), item.getNtvCountryName(), item.getCountryName()));
		// 寸法単位
		result.setUnitOfMeasure(item.getUnitOfMeasure());
		// 売通貨単位
		result.setsUnitPriceCcyCd(item.getsUnitPriceCcyCd());
		// 仕入通貨単位
		result.setpUnitPriceCcyCd(item.getpUnitPriceCcyCd());
		// 総重量result.setTotalOfWeight(item.getTotalOfWeight());
		// 数量合計result.setSumQty(item.getSumQty());
		// 受注金額result.setSoAmt(item.getSoAmt());
		// 税込み売単価result.setInTaxSPrice(item.getInTaxSPrice());
		// 受注金額小計result.setSoAmtSum(item.getSoAmtSum());
		// 合計税金額result.setTotalTaxAmt(item.getTotalTaxAmt());
		// 割引費result.setOffAmt(item.getOffAmt());
		// その他値引額result.setOtherDsctAmount(item.getOtherDsctAmount());
		// 運賃値引フラグresult.setFrtDiscountFlg(item.getFrtDiscountFlg());
		// 総合計額result.setTotalAmt(item.getTotalAmt());
		// オリジナルINVOICENO
		result.setOriginalInvoiceNo(rightPadBlack("",8));
		// ジャーナル日付result.setJournalDt(item.getJournalDt());
		//TODO
		// オリジナルInvoiceDateresult.setOriginalInvoiceDt(item.getOriginalInvoiceDt());
		//TODO
		// オリジナルグローバル番号
		result.setOriginalGlobalNo(rightPadBlack("",14));
		// オリジナル受注伝票番号
		result.setOriginalSoVoucherNo(rightPadBlack("",12));
		// 理由コード
		result.setReasonCd(rightPadBlack("",4));
		// 理由内容
		result.setReasonContent(rightPadBlack("",10));
		// 元請求書合計金額result.setSrcSumAmt(item.getSrcSumAmt());
		// TODO
		// 修正額result.setDiffAmt(item.getDiffAmt());
		//TODO
		// デビット/クレジット税金合計額
		//TODO　result.setCreditTaxAmt(item.getCreditTaxAmt());
		// デビット/クレジット総金額
		// TODO result.setCreditSumAmt(item.getCreditSumAmt());
		// 出荷不可フラグ
		//TODO result.setShipStopFlg(item.getShipStopFlg());
		// サプライヤーインボイス番号
		result.setSupplierInvNo(item.getSupplierInvNo());
		// 顧客到着日
		result.setCrd(item.getCrd());
		// 所管部門コード
		// TODO result.setDeptCd(item.getDeptCd());
		// 特別カスタマーBOX番号
		result.setSpecialCustBoxNo(item.getSpecialCustBoxNo());
		// 特別カスタマーBOXグループ
		result.setSpecialCustBoxGrp(item.getSpecialCustBoxGrp());
		// 輸送手段
		result.setTransportMeans(item.getTransportMeans());
		// 危険品フラグ
		result.setHazardFlg(item.getHazardFlg());
		// CS窓口
		// TODO result.setCsWindow(item.getCsWindow());
		// 値引表示フラグ
		result.setDiscountShowFlg(item.getDiscountShowFlg());
		// HSコード表示フラグ
		result.setHsCdShowFlg(item.getHsCdShowFlg());
		// NetWeight表示フラグ
		result.setNetWeightShowFlg(item.getNetWeightShowFlg());
		// 直送区分
		result.setDirectShipFlg(item.getDirectShipFlg());
		// 現法間取引フラグ
		// TODO result.setSuppsubBusinessFlg(item.getSuppsubBusinessFlg());
		// 配送業者顧客番号
		result.setCarrierAcctNo(item.getCarrierAcctNo());
		// サービス停止区分
		result.setServiceStopDiv(item.getServiceStopDiv());
		// INVOICE注釈３
		result.setInvoiceRemarks_3("");
		// INVOICE注釈１
		result.setInvoiceRemarks_1("");
		// INVOICE注釈２
		result.setInvoiceRemarks_2("");
		// 物品税管理地
		result.setGoodsTaxMangeCity("");
		// 部署名
		result.setDeptName("");
		// Commissionerate
		result.setCommissionerate("");
		// 輸入申告書番号
		result.setImportNo("");
		// 入荷番号
		result.setArrNo(rightPadBlack("",11));
		// 出荷番号
		result.setShipNo(rightPadBlack("",23));
		// TODO int ブランク
		// 売金額（相殺関税抜き）result.setAmt();
		// 相殺関税額result.setSetoffAmt(item.getSetoffAmt());
		// 教育目的税額result.setEduTaxAmt(item.getEduTaxAmt());
		// 第２教育目的税額result.setEdu2TaxAmt(item.getEdu2TaxAmt());
		// 特別追加関税額result.setSAddTaxAmt(item.getSAddTaxAmt());
		// 売金額（相殺関税込み）result.setInTaxAmt(item.getInTaxAmt());
		// 売金額（相殺関税抜き）合計result.setSumAmt(item.getSumAmt());
		// 相殺関税額合計result.setSumSetoffAmt(item.getSumSetoffAmt());
		// "CENVAT Amt.合計
		// result.setCentvatAmt(item.getCentvatAmt());"
		// 教育目的税額合計result.setSumEduTaxAmt(item.getSumEduTaxAmt());
		// 第2教育目的税額合計result.setSumEdu2TaxAmt(item.getSumEdu2TaxAmt());
		// 特別追加関税額合計result.setSumSAddTaxAmt(item.getSumSAddTaxAmt());
		// 売金額（相殺関税込み）合計result.setSumInTaxAmt(item.getSumInTaxAmt());
		// 重量合計result.setSumWeight(item.getSumWeight());
		// 売金額合計（割引後）result.setSumActAmt(item.getSumActAmt());
		// 輸入関税評価額総計result.setTotalImportTaxAmt(item.getTotalImportTaxAmt());
		// 相殺関税額総計result.setTotalSetoffTaxAmt(item.getTotalSetoffTaxAmt());
		// 教育目的税額総計result.setTotalEduTaxAmt(item.getTotalEduTaxAmt());
		// 第2教育目的税額総計result.setTotalEdu2TaxAmt(item.getTotalEdu2TaxAmt());
		// 特別追加関税額総計result.setTotalSAddTaxAmt(item.getTotalSAddTaxAmt());
		// 数量合計result.setSumQty(item.getSumQty());
		// 相殺関税額合計result.setSumSetoffAmt(item.getSumSetoffAmt());
		// 教育目的税額合計result.setSumEduTaxAmt(item.getSumEduTaxAmt());
		// 第2教育目的税額合計result.setSumEdu2TaxAmt(item.getSumEdu2TaxAmt());
		// 特別追加関税額合計result.setSumSAddTaxAmt(item.getSumSAddTaxAmt());
		// 中央付加価値税額合計result.setSumCAddTaxAmt(item.getSumCAddTaxAmt());
		// TODO int ブランク
		// 所在地
		result.setLocalCity("");
		// 内税外税区分
		result.setTaxInExDiv(item.getTaxInExDiv());
		// 指定ＶＳＤ
		result.setSpecifyVad("");
		// 該非区分
		result.setIfDiv("");
		// 配達時間帯
		// TODO result.setDeliveryTime("");
		// 送り状№回答区分
		result.setSendAnsDiv("");
		// 着日指示コメント
		result.setRdInstructComment("");
		// 配送日
		// TODO result.setDeliveryDate(item.getDeliveryDate());
		// SCコード名称（漢字）
		result.setScCodeName(item.getNtvMcPlantName());
		// 得意先名(カナ)
		result.setCustNameKana(item.getNtvCustName2());
		// 着日指示フラグ
		result.setRdInstructFlg("");
		// 注文部課名(漢字)
		//TODO result.setNtvCustDept(item.getNtvCustDept());
		// 注文担当者(漢字)
		// TODO result.setNtvCustAttention(item.getNtvCustAttention());
		// 商品名略称(カナ)
		result.setProductNameKana(getInforName(result.getExportFlg(), item.getNtvProductName(), item.getProductName()));
		// 別納区分
		result.setOtherDeliDiv("");
		// 消費税率
		result.setCtaxRate(0);
		// 置場区分
		result.setPlantDiv("");
		// セル
		result.setCellCd(item.getCellCd());
		// 注文者部課名（英語）
		result.setCustDeptEn("");
		// 注文担当者名（英語）
		result.setCustAttentionEn("");
		// DMコード1
		result.setDmCd_1("");
		// DMコード2
		result.setDmCd_2("");
		// DMコード3
		result.setDmCd_3("");
		// DMコード4
		result.setDmCd_4("");
		// DMコード5
		result.setDmCd_5("");
		// 得意先メールアドレス
		result.setCustMailAddress(item.getMailAddress());
		// 直送先メールアドレス
		result.setShipToMailAddress(item.getShipToMailAddress());
		// 輸出国仕入単価
		// TODO result.setExportPurcUpri("");
		// 輸出国仕入単価通貨
		result.setExportPurcUpriCur("");
		// フレイト単価
		// TODO result.setFreightUpri("");
		// 輸入諸掛単価
		// TODO result.setImportUpri("");
		// 輸入関税単価
		// TODO result.setImportTaxUpri("");
		// フレイト取引為替レート
		result.setFreightXrate("");
		// 現法通貨為替レート
		result.setSuppsubCurXrate("");
		// 仕入金額
		// TODO result.setPurcAmt("");
		// Supplier Invoice Date
		// TODO result.setSupplierInvoiceDate("");
		// TODO 発注日result.setPoDt(item.getPoDt());
		// TODO 税抜き受注金額小計result.setSumSoAmt(item.getSumSoAmt());
		// インコタームス１
		result.setIncoterms_1("");
		// インコタームス２
		result.setIncoterms_2("");
		// インコタームス３
		result.setIncoterms_3("");
		// 出荷置場コード
		result.setShipPlantCd("");
		// 優先得意先フラグ
		result.setFirstCustFlg("");
		// 更新区分
		result.setUpdDiv("");
		// 作成日_日本用
		result.setCrtDtJp(result.getCrtDt());
		// MC・置場コード_日本用result.setMcPlantCdJp(item.getMcPlantCdJp());
		// 得意先コード_日本用result.setCustCdJp(item.getCustCdJp());
		// 仕入先コード_日本用
		result.setSupplierCdJp(result.getSupplierCd());
		// 置場_日本用result.setMcPlantDivJp();
		// グローバル番号_日本用
		result.setGlobalNoJp(result.getGlobalNoJp());
		// 子商品SEQ_日本用
		result.setChildSeqJp(result.getChildSeqJp());
		// データ区分_日本用
		result.setDataDivJp(result.getDataDivJp());
		// 商品コード用ブランド名 _日本用
		result.setBrandNameForProductCdJp(getMcPlantDivJp(item.getBrandNameForProductCd()));
		// ブランド商品コード_日本用
		// TODO result.setBrandProductCdJp(getBrandProductCdJp());
		// TODO 子発注SEQ_日本用result.setSubPoSeqJp(item.getSubPoSeqJp());
		// 拠点_日本用
		result.setReceivableMcCdJp(item.getBillToReceivableMcCd());
		// MC漢字名称_日本用
		result.setNtvDeptNameAbbJp(item.getDeptNtvDeptNameAbb());
		// MC電話番号_日本用
		result.setNtvDeptTelAbbJp(item.getDeptTel());
		// 納品書印刷フラグ_日本用
		result.setPackingFlgJp(item.getPackingFlg());
		// 納品書出力枚数（オリジナル）_日本用
		result.setPackingPrintNumOrgnJp(item.getPackingPrintNumOrgn());
		// 納品書出力枚数（控え）_日本用
		result.setPackingPrintNumCopyJp(item.getPackingPrintNumCopy());
		// 納品書保存フラグ_日本用
		result.setPackingRetainFlgJp(item.getPackingRetainFlg());
		// 英文納品書印刷フラグ_日本用
		//TODO result.setEngPackingPrintFlgJp(getEngPackingPrintFlgJp());
		// 英文納品書出力枚数（オリジナル）_日本用
		result.setEngPackingPrintNumOrgnJp(item.getEngPackingPrintNumOrgn());
		// 英文納品書出力枚数（控え）_日本用
		result.setEngPackingPrintNumCopyJp(item.getEngPackingPrintNumCopy());
		// 英文納品書保存フラグ_日本用
		result.setEngPackingRetainFlgJp(item.getEngPackingRetainFlg());
		// 仮納品書印刷フラグ_日本用
		result.setTmpPackingPrintFlgJp(getTmpPackingPrintFlgJp(item.getDirectShipFlg(), item.getShipToTempVoucherDiv(), "得意先マスタ.仮納品書フラグ"));
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
		result.setLabelEarlyObjectDivJp(getLabelEarlyObjectDivJp(result.getLabelEarlyDivJp(), result.getDeliDiv(), item.getMcPlantDiv()));
		// 納入部課区分_日本用
		result.setArrDeptDivJp(item.getGrp());
		// 納入担当者区分_日本用
		result.setArrUserDivJp(item.getGrp());
		// 仕入先名（カナ）_日本用
		result.setCompanyNameKanaJp("仕入先マスタ.企業名（カナ）");
		// TODO ランク梱包SEQ_日本用result.setRankFlgJp(item.getRankFlgJp());
		// TODO 1得意先で複数配送先有無マーク_日本用result.setMangShipToFlgJp(item.getMangShipToFlgJp());
		// TODO  巡回便区分_日本用result.setPatrolDivJp(item.getPatrolDivJp());
		// 現法名（カナ）_日本用
		result.setCustNameKanaJp(getCustNameKanaJp(result.getExportFlg(),item.getCustName()));
		// 現法名２_日本用
		result.setCustName_2Jp(getCustName_2(result.getBillToCountryName(), result.getCustName()));
		// 梱包指示１_日本用
		result.setNtvPackingInstruct1Jp(item.getNtvPackingInstruct1J());
		// 梱包指示２_日本用
		result.setNtvPackingInstruct2Jp(item.getNtvPackingInstruct2J());
		// 梱包指示３_日本用
		result.setNtvPackingInstruct3Jp(item.getNtvPackingInstruct3J());
		// 梱包指示４_日本用
		result.setNtvPackingInstruct4Jp(item.getNtvPackingInstruct4J());
		// 梱包指示５_日本用
		result.setNtvPackingInstruct5Jp(item.getNtvPackingInstruct5J());
		// 事務指示１_日本用
		result.setNtvBusinessInstruct1Jp(item.getNtvBusinessInstruct1J());
		// 事務指示２_日本用
		result.setNtvBusinessInstruct2Jp(item.getNtvBusinessInstruct2J());
		// 事務指示３_日本用
		result.setNtvBusinessInstruct3Jp(item.getNtvBusinessInstruct3J());
		// 事務指示４_日本用
		result.setNtvBusinessInstruct4Jp(item.getNtvBusinessInstruct4J());
		// 事務指示５_日本用
		result.setNtvBusinessInstruct5Jp(item.getNtvBusinessInstruct5J());
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
		result.setShipToNameKanaJp(item.getShipToNtvShipToName2());
		// 納入者名（カナ）_日本用
		result.setDeliAttentionKanaJp(setKanaJp(result.getArrUserDivJp(), item.getNtvDeliAttention()));
		// 納入担当部課名（カナ）_日本用
		result.setDeliDeptKanaJp(item.getNtvDeliDept());
		// 地区コード_日本用result.setCityCdJp(item.getCityCdJp());
		// 備考(自動車規格コード)_日本用
		result.setAutomobileStandardCdJp(item.getAutomobileStandardCd());
		// TODO 個口数SEQ_日本用result.setUnitQtySeqJp(item.getUnitQtySeqJp());
		// TODO 届先件数_日本用result.setSendedQtyJp(item.getSendedQtyJp());
		// ストーク料金適用区分_日本用
		result.setStorkChargeApplyDivJp(item.getStorkChargeApplyDiv());
		// 納品書番号_MJP_日本用
		result.setDeliNoteNoJp(item.getDeliNoteNo());
		// TODO 合計金額（日本納品書用）_日本用result.setSumAmtJp(item.getSumAmtJp());
		// TODO 元J納品書番号_日本用result.setOldDeliNoteNoJp(item.getOldDeliNoteNoJp());



		return result;
	}

	private Date getCrtDt() {

		Calendar updTs = Calendar.getInstance(TimeZone.getTimeZone("JST"));
		return updTs.getTime();
		
	}

	/**
	 * 親注番を設定
	 * @param str1,str2
	 * @return string
	 */
	private String getCustRef(String str1,String str2) {

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
	private String getRefStr(String custRef, String cystRefNtv, String custSubRef, String yType) {

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
			return yType;
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
	private Date getDate(Date date) {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		String dateString = formatter.format(date);
		ParsePosition pos = new ParsePosition(0);
		Date currentTime = formatter.parse(dateString, pos);
		return currentTime;
	}

	/**
	 * 輸出フラグを設定
	 * @param custsubSubsidiaryCd,shipToCd,custCountryCd
	 * @param countryCd,shipToCountryCd
	 * @return String
	 */
	private String getExportFlg(String custsubSubsidiaryCd, String shipToCd, 
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
	private String getInforName(String flg, String infor1, String infor2){

		if (flg == "0") {
			if (!infor1.isEmpty()) {
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
	private String getClassifyName(String flg, String ntvClassifyCdName, String classifyCdName) {

		if (flg == "0") {
			if (!isEmpty(ntvClassifyCdName)) {
				return ntvClassifyCdName;
			}
			else {
				return classifyCdName.substring(0,32);
			}
		}
		else {
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
	private String getDeliDept(String ntvCustDept, String subsidiaryCd, String grp) {
		
		if (subsidiaryCd == "MJP" && grp == "2") {
			return "";
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
	private String getFrtAreaCd(String shipToCd, String shipToFrtAreaCd, String frtAreaCd) {
		
		if (!isEmpty(shipToCd)) {
			return shipToFrtAreaCd;
		}
		else {
			return frtAreaCd;
		}
	}

	/**
	 * 指示を設定
	 * @param shipToCd 受注明細の直送先コード
	 * @param shipTocdStr 直送先マスタ指示
	 * @param custStr 得意先マスタ指示
	 * @return Instructions
	 */
	private String getInstructions(String shipToCd, String shipTocdStr, String custStr) {
		
		if (!isEmpty(shipToCd)) {
			return shipTocdStr;
		}
		else {
			return custStr;
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
	private String getShipToInfor(String shipToCd, String flg, String infor1, String infor2) {
		if (isEmpty(shipToCd)) {
			return "";
		}
		else {
			return getInforName(flg, infor1, infor2);
		}
	}
	
	/**
	 * ブランクを設定
	 * @param str String対象
	 * @param len 固定桁数
	 * @return str
	 */
	private String rightPadBlack(String str, int len) {
		int lenth = len - str.length();
		for(int i = 0; i < lenth; i++){
			str+=" ";
		 }
		return str;
	}

	/**
	 * 商品コード用ブランド名を設定
	 * @param brandNameForProductCd 商品コード用ブランド名.商品コード用名
	 *  
	 * @return brandNameForProductCd
	 */
	private String getMcPlantDivJp(String brandNameForProductCd) {
		if (brandNameForProductCd == "ﾐｽﾐ" || brandNameForProductCd== "MISUMI") {
			return "";
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
	private String getBrandProductCdJp(String productCdMst, String branNmForProductCd) {
		
		String str = productCdMst + "(" + branNmForProductCd + ")";
		if (str.length() > 56) {
			return productCdMst;
		}
		else {
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
	private String getEngPackingPrintFlgJp(String flg, String engPackingRetain, String shipTyp, String custCountryCd) {
		
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
	private String getTmpPackingPrintFlgJp(String directShipFlg, String shipToTempVoucherDiv, String tmpFlg) {
		
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
	private String getLabelEarlyObjectDivJp(String labelEarlyDivJp, String deliDiv, String mcPlantDiv) {

		if (labelEarlyDivJp == "1" && deliDiv.substring(0, 1) =="0" 
				&& mcPlantDiv == "532") {
			return "1";
		}
		else {
			return "";
		}
	}

	/**
	 * 現法名（カナ）を設定
	 * @param flg 輸出フラグ
	 * @param custName 得意先マスタ.得意先名（英字）を設定
	 * 
	 * @return custNameKanaJp
	 */
	private String getCustNameKanaJp(String flg, String custName) {

		if (flg == "1") {
			return custName;
		}
		else {
			return "";
		}
	}

	/**
	 * 現法名２を設定
	 * @param billToCountryName 売掛先国名
	 * @param custName 得意先名称（現地語）
	 * 
	 * @return custName_2
	 */
	private String getCustName_2(String billToCountryName, String custName) {

		if (!isEmpty(billToCountryName)) {
			return billToCountryName + "/" + custName;
		}
		else {
			return custName;
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
	private String getCustInfor(String arrUserDivJp, String shipToCd, String custCd, 
			String result1, String result2) {

		if (arrUserDivJp == "2") {
			if (isEmpty(shipToCd) || shipToCd == custCd) {
				return result1;
			}

			if (!isEmpty(shipToCd) && shipToCd != custCd) {
				return result2;
			}

			return "";
		}
		else {
			return "";
		}
	}

	/**
	 * カナを設定
	 * @param arrUserDivJp 納入担当者区分
	 * @param result  値
	 * 
	 * @return kanaJp
	 */
	private String setKanaJp(String arrUserDivJp, String result) {

		if (arrUserDivJp == "2") {
			return result;
		}
		else {
			return "";
		}
	}

	/**
	 * emptyが判断
	 * @param ｓｔｒ  判断対象
	 * 
	 * @return boolean
	 */
	private boolean isEmpty(String str) {

		if (str == null || str.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
}
