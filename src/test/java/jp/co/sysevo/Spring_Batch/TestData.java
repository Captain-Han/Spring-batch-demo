package jp.co.sysevo.Spring_Batch;

import jp.co.sysevo.model.InptData;
import jp.co.sysevo.model.OutptData;
import java.util.Date;


public class TestData {

	private static final int INT_DEFAULT = 10;
	private static final int FIXED_VALUE = 0;
	private static final String BLANK = "";
	private static final String SPACE = " ";
	private static final Date DATE_DEFAULT = new Date();
	// 受注明細.受注数量
	private static int soQty = INT_DEFAULT;
	// 商品マスタ.発注入り数
	private static int poQtyPerCase = INT_DEFAULT;
	// 得意先マスタ.ＣｏｍＩｎｖ出力枚数（オリジナル）
	private static int comInvPrintNumOrgn = INT_DEFAULT;
	// 得意先マスタ.ＣｏｍＩｎｖ出力枚数（控え）
	private static int comInvPrintNumCopy = INT_DEFAULT;
	// 得意先マスタ.ＤｅｌｉＯｒｄｅｒ出力枚数（オリジナル）
	private static int deliOrderPrintNumOrgn = INT_DEFAULT;
	// 得意先マスタ.ＤｅｌｉＯｒｄｅｒ出力枚数（控え）
	private static int deliOrderPrintNumCopy = INT_DEFAULT;
	// 得意先マスタ.ＰａｃｋＬｉｓｔ出力枚数（オリジナル）
	private static int packListPrintNumOrgn = INT_DEFAULT;
	// 得意先マスタ.ＰａｃｋＬｉｓｔ出力枚数（控え）
	private static int packListPrintNumCopy = INT_DEFAULT;
	// 得意先マスタ.Ｉｎｖ＆Ｐａｃｋ出力枚数（オリジナル）
	private static int invPackPrintNumOrgn = INT_DEFAULT;
	// 得意先マスタ.Ｉｎｖ＆Ｐａｃｋ出力枚数（控え）
	private static int invPackPrintNumCopy = INT_DEFAULT;
	// 売掛先マスタ.売掛金締日
	private static int arClosingDay = INT_DEFAULT;
	// 受注明細.商品重量
	private static int weight = INT_DEFAULT;
	// オンデマンド用出荷テーブル.総重量
	private static int totalWeight = INT_DEFAULT;
	// オンデマンド用出荷テーブル.数量合計
	private static int totalQty = INT_DEFAULT;
	// オンデマンド用出荷テーブル.受注金額
	private static int soAmount = INT_DEFAULT;
	// 受注明細.税込み売単価
	private static int includeTaxSUPrice = INT_DEFAULT;
	// オンデマンド用出荷テーブル.受注金額小計
	private static int subtotalSoAmount = INT_DEFAULT;
	// オンデマンド用出荷テーブル.合計税金額
	private static int taxAmount = INT_DEFAULT;
	// オンデマンド用出荷テーブル.割引費
	private static int tenthsDiscountedCost = INT_DEFAULT;
	// 受注明細.その他値引額
	private static int otherDsctAmount = INT_DEFAULT;
	// オンデマンド用出荷テーブル.総合計額
	private static int totalAmountPrice = INT_DEFAULT;
	// 受注明細.現法コード
	private static String subsidiaryCd = "subsidiaryCd";
	// 受注明細.MCコード
	private static String mcCd = "mcCd";
	// 受注明細.得意先コード
	private static String custCd = "custCd";
	// 受注明細.仕入先コード
	private static String supplierCd = "supplierCd";
	// 受注明細.直送先コード
	private static String shipToCd = "shipToCd";
	// 受注明細.親注番桁数
	private static int custRefLength = INT_DEFAULT;
	// 受注明細.注文番号（子）
	private static String custSubRef = "custSubRef";
	// 受注明細.グローバル番号
	private static String globalNo = "1111111";
	// 受注明細.受注伝票番号
	private static String sovoucherno = "1111111";
	// 受注明細.商品コード
	private static String productCd = "productCd.受注伝票番号";
	// 受注明細.インナーコード
	private static String innerCd = "innerCd";
	// 受注明細.商品種別
	private static String productAssort = "受注明細.商品種別";
	// 仕入先マスタ.企業名
	private static String companyName = "仕入先マスタ.企業名";
	// 仕入先マスタ.国コード
	private static String purcCountryCd = "purcCountryCd";
	// 国マスタ（仕入先）.国名称
	private static String purcCountryName = "国マスタ（仕入先）.国名称";
	// タイプコードマスタ.分析コード
	private static String classifyCd = "classifyCd";
	// 受注明細.置場区分
	private static String mcPlantDiv = "1";
	// オンデマンド用出荷テーブル.データ区分
	private static String dataDiv = "2";
	// 受注明細.納入区分
	private static String deliDiv = "3";
	// 部材品受注内訳ファイル.子ＳＥＱ
	private static int childSeq = INT_DEFAULT;
	// 得意先マスタ.MC指定伝票区分
	private static String mcSpecifyVoucherDiv = "1";
	// 受注明細.梱包ランク
	private static String packingRank = "2";
	// 得意先マスタ.納品書送付フラグ
	private static String deliNoteSendFlg = "1";
	// 受注明細.指定伝票区分
	private static String specifyVoucherDiv = "1";
	// 受注明細.現品添付票区分
	private static String moveTicketDiv = "1";
	// 直送先マスタ.仮伝区分
	private static String tempVoucherDiv = "1";
	// オンデマンド用出荷テーブル.納入部課コード
	private static String deliDeptCd = "deliDeptCd";
	// 受注明細.納入担当者コード
	private static String deliAttentionCd = "deliAttentionCd";
	// 受注明細.ブランドコード
	private static String brandCd = "brandCd";
	// ブランドマスタ.ブランド名称（英語）
	private static String brandName = "brandName";
	// 商品マスタ.商品コード
	private static String productCdMst = "productCdMst";
	// 発注テーブル.バーコード用グローバル番号
	private static String barcodeGlobalNo = "111";
	// 得意先マスタ.ＣｏｍｍｅｒｃｉａｌＩｎｖｏｉｃｅフラグ
	private static String comInvFlg = "1";
	// 得意先マスタ.ＣｏｍｍｅｒｃｉａｌＩｎｖｏｉｃｅ保存フラグ
	private static String comInvRetainFlg = "1";
	// 得意先マスタ.ＤｅｌｉｖｅｒｙＯｒｄｅｒフラグ
	private static String deliOrderFlg = "1";
	// 得意先マスタ.ＤｅｌｉｖｅｒｙＯｒｄｅｒ保存フラグ
	private static String deliOrderRetainFlg = "1";
	// 得意先マスタ.ＰａｃｋｉｎｇＬｉｓｔフラグ
	private static String packListFlg = "1";
	// 得意先マスタ.ＰａｃｋｉｎｇＬｉｓｔ保存フラグ
	private static String packListRetainFlg = "1";
	// 得意先マスタ.Ｉｎｖ＆Ｐａｃｋｉｎｇフラグ
	private static String invPackFlg = "1";
	// 得意先マスタ.Ｉｎｖ＆Ｐａｃｋ保存フラグ
	private static String invPackRetainFlg = "1";
	// 商品マスタ.ＨＳコード
	private static String hsCd = "hsCd";
	// 現法マスタ.電話番号
	private static String subsidiaryTel = "12233335241";
	// 現法マスタ.ＦＡＸ番号
	private static String subsidiaryFax = "1111";
	// 現法マスタ.郵便番号
	private static String subsidiaryPostalCd = "subsidiaryPostalCd";
	// 現法マスタ.国コード
	private static String subsidiaryCountryCd = "subsidiaryCountryCd";
	// 現法マスタ.ライセンス番号
	private static String subsidiaryLicenceNo = "11122";
	// 現法マスタ.税登録番号
	private static String subsidiaryVatRegistrationNumber = "1111";
	// 得意先マスタ.エコール得意先コード
	private static String ecalCustCd = "ecalCustCd";
	// 得意先マスタ.得意先名（英字）
	private static String custName = "custName";
	// 受注明細.注文者部課（現地語）
	private static String ntvCustDept = "受注明細.注文者部課（現地語）";
	// 得意先マスタ.郵便番号
	private static String custPostalCd = "1111";
	// 得意先マスタ.国コード
	private static String custCountryCd = "custCountryCd";
	// 国マスタ（得意先）.ＵＰＳ国コード
	private static String custUpsCountryCd = "custUpsCountryCd";
	// 得意先マスタ.都市名
	private static String custCityName = "得意先マスタ.都市名";
	// 得意先マスタ.電話番号
	private static String custTel = "12233335241";
	// 得意先マスタ.ＦＡＸ番号
	private static String custFax = "2221";
	// 受注明細.注文者氏名（現地語）
	private static String ntvCustAttention = "受注明細.注文者氏名（現地語）";
	// 得意先マスタ.事業所ライセンス番号
	private static String custOfficeLicenseNo = "得意先マスタ.事業所ライセンス番号";
	// 得意先マスタ.売掛先コード
	private static String custBillToCd = "custBillToCd";
	// 売掛先マスタ.請求部課名（現地語）
	private static String billToNtvBillToDept = "売掛先マスタ.請求部課名（現地語）";
	// 売掛先マスタ.郵便番号
	private static String billToPostalCd = "billToPostalCd";
	// 売掛先マスタ.国コード
	private static String billToCountryCd = "billToCountryCd";
	// 売掛先マスタ.電話番号
	private static String billToTel = "11221231";
	// 売掛先マスタ.売掛先ＦＡＸ番号
	private static String faxBillTo = "12311321";
	// 売掛先マスタ.請求担当者（現地語）
	private static String ntvBillToPerson = "売掛先マスタ.請求担当者（現地語）";
	// 売掛先マスタ.売掛注釈１（現地語可）
	private static String ntvReceivableRemarks_1 = "売掛先マスタ.売掛注釈１（現地語可）";
	// 売掛先マスタ.売掛注釈２（現地語可）
	private static String ntvReceivableRemarks_2 = "売掛先マスタ.売掛注釈２（現地語可）";
	// 受注明細.納入者部課（現地語）
	private static String ntvDeliDept = "受注明細.納入者部課（現地語）";
	// 直送先マスタ.郵便番号
	private static String shipToPostalCd = "shipToPostalCd";
	// 直送先マスタ.国コード
	private static String shipToCountryCd = "shipToCountryCd";
	// 国マスタ（直送先）.ＵＰＳ国コード
	private static String shipToUpsCountryCd = "shipToUpsCountryCd";
	// 直送先マスタ.都市名
	private static String shipToCityName = "直送先マスタ.都市名";
	// 直送先マスタ.電話番号
	private static String shipToTel = "1222112313";
	// 直送先マスタ.ＦＡＸ番号
	private static String shipToFax = "1231214";
	// 受注明細.納入者氏名（現地語）
	private static String ntvDeliAttention = "受注明細.納入者氏名（現地語）";
	// 受注明細.得意先現法置場
	private static String custsubMcPlantCd = "受注明細.得意先現法置場";
	// 部門マスタ（得意先現法置場）.部門名
	private static String subsidiaryPlantDeptName = "部門マスタ（得意先現法置場）.部門名";
	// 部門マスタ（得意先現法置場）.住所１
	private static String subsidiaryPlantAddress_1 = "部門マスタ（得意先現法置場）.住所１";
	// 部門マスタ（得意先現法置場）.住所２
	private static String subsidiaryPlantAddress_2 = "部門マスタ（得意先現法置場）.住所２";
	// 部門マスタ（得意先現法置場）.住所３
	private static String subsidiaryPlantAddress_3 = "部門マスタ（得意先現法置場）.住所３";
	// 部門マスタ（得意先現法置場）.住所４
	private static String subsidiaryPlantAddress_4 = "部門マスタ（得意先現法置場）.住所４";
	// 部門マスタ（得意先現法置場）.郵便番号
	private static String subsidiaryPlantPostalCd = "subsidiaryPlantPostalCd";
	// 現法マスタ（得意先現法置場）.国コード
	private static String deptCountryCd = "deptCountryCd";
	// 部門マスタ（得意先現法置場）.電話番号
	private static String subsidiaryPlantTel = "12312312111";
	// 部門マスタ（得意先現法置場）.ＦＡＸ番号
	private static String subsidiaryPlantFax = "42412412";
	// 実配送扱い便マスタ.扱い便区分
	private static String custShipmode = "111";
	// 扱い便区分マスタ.配送業者名
	private static String shippingCarrierName = "扱い便区分マスタ.配送業者名";
	// 扱い便区分マスタ.配送業者名略称
	private static String shippingCarrierAbb = "扱い便区分マスタ.配送業者名略称";
	// 受注明細.支払条件
	private static String paymentTerms = "受注明細.支払条件";
	// 受注明細.インコタームズ
	private static String incoterms = "受注明細.インコタームズ";
	// 受注明細.決済形態
	private static String settlementMethod = "受注明細.決済形態";
	// 得意先マスタ.商品総称フラグ
	private static String productGenericNameFlg = "111";
	// 受注明細.伝票区分
	private static String voucherDiv = "1111";
	// 得意先マスタ.税金エリアコード
	private static String taxAreaCd = "taxAreaCd";
	// 得意先マスタ.非課税フラグ
	private static String taxFreeFlg = "1";
	// 売掛先マスタ.統一発票タイプ
	private static String uniformInvType = "1";
	// 売掛先マスタ.売掛金締め単位
	private static String arCloseUnit = "売掛先マスタ.売掛金締め単位";
	// 受注明細.得意先現法得意先コード
	private static String custsubCustCd = "custsubCustCd";
	// 受注明細.得意先現法直送先コード
	private static String custsubShipToCd = "custsubShipToCd";
	// 受注明細.商品重量単位
	private static String weightUnit = "受注明細.商品重量単位";
	// 得意先マスタ.原産国名表示フラグ
	private static String countryOfOrignShowFlg = "1";
	// 受注明細.原産国コード
	private static String countryOfOrigin = "受注明細.原産国コード";
	// 商品マスタ.数量単位
	private static String unitOfMeasure = "商品マスタ.数量単位";
	// 受注明細.売単価通貨コード
	private static String sUnitPriceCcyCd = "sUnitPriceCcyCd";
	// 受注明細.仕入単価通貨コード
	private static String pUnitPriceCcyCd = "pUnitPriceCcyCd";
	// 得意先マスタ.運賃値引フラグ
	private static String frtDiscountFlg = "1";
	// 発注テーブル.Supplier Invoice No
	private static String supplierInvNo = "11";
	// 商品マスタ.商品所管部門コード
	private static String productControlDepCode = "12";
	// 得意先マスタ.特別カスタマーＢＯＸ番号
	private static String specialCustBoxNo = "13";
	// 得意先マスタ.特別カスタマーＢＯＸグループ
	private static String specialCustBoxGrp = "得意先マスタ.特別カスタマーＢＯＸグループ";
	// 受注明細.輸送手段
	private static String transportMeans = "受注明細.輸送手段";
	// 受注明細.危険品フラグ
	private static String hazardFlg = "1";
	// 得意先マスタ.値引表示フラグ
	private static String discountShowFlg = "0";
	// 得意先マスタ.HSコード表示フラグ
	private static String hsCdShowFlg = "1";
	// 得意先マスタ.NetWeight表示フラグ
	private static String netWeightShowFlg = "1";
	// 受注明細.直送フラグ
	private static String directShipFlg = "1";
	// 受注ヘッダ.配送業者顧客番号
	private static String carrierAcctNo = "1111";
	// 売掛先マスタ.サービス停止区分
	private static String serviceStopDiv = "1";
	// 売掛先マスタ.内税外税区分
	private static String taxInExDiv = "1";
	// MC_置場マスタ.ＭＣ／置場名称（現地語）
	private static String ntvMcPlantName = "MC_置場マスタ.ＭＣ／置場名称（現地語）";
	// 得意先マスタ.得意先名（現地語２）
	private static String ntvCustName2 = "得意先マスタ.得意先名（現地語２）";
	// 得意先マスタ.セルコード
	private static String cellCd = "cellCd";
	// 得意先マスタ.メールアドレス
	private static String custMailAddressFlg = "1";
	// 直送先マスタ.メールアドレス
	private static String shipToMailAddress = "直送先マスタ.メールアドレス";
	// GEIP受注明細.明細コメント
	private static String dtComment = "GEIP受注明細.明細コメント";
	// GEIP受注ヘッダ.ロジ連携用伝票コメント
	private static String hdCommentForLogistics = "GEIP受注ヘッダ.ロジ連携用伝票コメント";
	// 受注ヘッダ.ヘッダー注文番号
	private static String headerRef = "受注ヘッダ.ヘッダー注文番号";
	// 受注ヘッダ.ヘッダー注文番号(英数)
	private static String engHeaderRef = "受注ヘッダ.ヘッダー注文番号(英数)";
	// 受注明細.注文番号(親)(明細)
	private static String custRef = "受注明細.注文番号(親)(明細)";
	// オンデマンド用出荷テーブル.COMET紐付けSEQ
	private static String cometSeq = "オンデマンド用出荷テーブル.COMET紐付けSEQ";
	// 輸出管理マスタ.受注メッセージコード
	private static String orderMsgCd = "orderMsgCd";
	// 直送先マスタ.運賃エリアコード
	private static String shipToFrtAreaCd = "shipToFrtAreaCd";
	// 直送先マスタ.事務指示１表示フラグ
	private static String shipToBusinessinstruct1ShowFlg = "1";
	// 直送先マスタ.事務指示１（現地語可）
	private static String shipToNtvBusinessinstruct1 = "直送先マスタ.事務指示１（現地語可）";
	// 直送先マスタ.事務指示２表示フラグ
	private static String shipToBusinessinstruct2ShowFlg = "1";
	// 直送先マスタ.事務指示２（現地語可）
	private static String shipToNtvBusinessinstruct2 = "直送先マスタ.事務指示２（現地語可）";
	// 直送先マスタ.梱包指示１表示フラグ
	private static String shipToPackingInstruct1ShowFlg = "1";
	// 直送先マスタ.梱包指示１（現地語可）
	private static String shipToNtvPackingInstruct1 = "直送先マスタ.梱包指示１（現地語可）";
	// 直送先マスタ.梱包指示２表示フラグ
	private static String shipToPackingInstruct2ShowFlg = "1";
	// 直送先マスタ.梱包指示２（現地語可）
	private static String shipToNtvPackingInstruct2 = "直送先マスタ.梱包指示２（現地語可）";
	// 着日指示データ.現法コード
	private static String subsidiaryCdArrDt = "着日指示データ.現法コード";
	// 受注明細．得意先現法コード
	private static String custsubSubsidiaryCd = "custsubSubsidiaryCd";
	// 直送先マスタ.市町村コード
	private static String shipToCityCd = "shipToCityCd";
	// 得意先マスタ.市町村コード
	private static String custCityCd = "custCityCd";
	// 売掛先国名
	private static String billToCountryName= "売掛先国名";


	public static InptData getTransferInData() {

		InptData inptData = new InptData();
		inptData.setSoQty(soQty);
		inptData.setPoQtyPerCase(poQtyPerCase);
		inptData.setComInvPrintNumOrgn(comInvPrintNumOrgn);
		inptData.setComInvPrintNumCopy(comInvPrintNumCopy);
		inptData.setDeliOrderPrintNumOrgn(deliOrderPrintNumOrgn);
		inptData.setDeliOrderPrintNumCopy(deliOrderPrintNumCopy);
		inptData.setPackListPrintNumOrgn(packListPrintNumOrgn);
		inptData.setPackListPrintNumCopy(packListPrintNumCopy);
		inptData.setInvPackPrintNumOrgn(invPackPrintNumOrgn);
		inptData.setInvPackPrintNumCopy(invPackPrintNumCopy);
		inptData.setArClosingDay(arClosingDay);
		inptData.setWeight(weight);
		inptData.setTotalWeight(totalWeight);
		inptData.setTotalQty(totalQty);
		inptData.setSoAmount(soAmount);
		inptData.setIncludeTaxSUPrice(includeTaxSUPrice);
		inptData.setSubtotalSoAmount(subtotalSoAmount);
		inptData.setTaxAmount(taxAmount);
		inptData.setTenthsDiscountedCost(tenthsDiscountedCost);
		inptData.setOtherDsctAmount(otherDsctAmount);
		inptData.setTotalAmountPrice(totalAmountPrice);
		inptData.setSubsidiaryCd(subsidiaryCd);
		inptData.setMcCd(mcCd);
		inptData.setCustCd(custCd);
		inptData.setSupplierCd(supplierCd);
		inptData.setShipToCd(shipToCd);
		inptData.setCustRefLength(custRefLength);
		inptData.setCustSubRef(custSubRef);
		inptData.setGlobalNo(globalNo);
		inptData.setSovoucherno(sovoucherno);
		inptData.setProductCd(productCd);
		inptData.setInnerCd(innerCd);
		inptData.setProductAssort(productAssort);
		inptData.setCompanyName(companyName);
		inptData.setPurcCountryCd(purcCountryCd);
		inptData.setPurcCountryName(purcCountryName);
		inptData.setClassifyCd(classifyCd);
		inptData.setMcPlantDiv(mcPlantDiv);
		inptData.setDataDiv(dataDiv);
		inptData.setDeliDiv(deliDiv);
		inptData.setChildSeq(childSeq);
		inptData.setMcSpecifyVoucherDiv(mcSpecifyVoucherDiv);
		inptData.setPackingRank(packingRank);
		inptData.setDeliNoteSendFlg(deliNoteSendFlg);
		inptData.setSpecifyVoucherDiv(specifyVoucherDiv);
		inptData.setMoveTicketDiv(moveTicketDiv);
		inptData.setTempVoucherDiv(tempVoucherDiv);
		inptData.setDeliDeptCd(deliDeptCd);
		inptData.setDeliAttentionCd(deliAttentionCd);
		inptData.setBrandCd(brandCd);
		inptData.setBrandName(brandName);
		inptData.setProductCdMst(productCdMst);
		inptData.setBarcodeGlobalNo(barcodeGlobalNo);
		inptData.setComInvFlg(comInvFlg);
		inptData.setComInvRetainFlg(comInvRetainFlg);
		inptData.setDeliOrderFlg(deliOrderFlg);
		inptData.setDeliOrderRetainFlg(deliOrderRetainFlg);
		inptData.setPackListFlg(packListFlg);
		inptData.setPackListRetainFlg(packListRetainFlg);
		inptData.setInvPackFlg(invPackFlg);
		inptData.setInvPackRetainFlg(invPackRetainFlg);
		inptData.setHsCd(hsCd);
		inptData.setSubsidiaryTel(subsidiaryTel);
		inptData.setSubsidiaryFax(subsidiaryFax);
		inptData.setSubsidiaryPostalCd(subsidiaryPostalCd);
		inptData.setSubsidiaryCountryCd(subsidiaryCountryCd);
		inptData.setSubsidiaryLicenceNo(subsidiaryLicenceNo);
		inptData.setSubsidiaryVatRegistrationNumber(subsidiaryVatRegistrationNumber);
		inptData.setEcalCustCd(ecalCustCd);
		inptData.setCustName(custName);
		inptData.setCustPostalCd(custPostalCd);
		inptData.setNtvCustDept(ntvCustDept);
		inptData.setCustCountryCdMst(custCountryCd);
		inptData.setCustUpsCountryCd(custUpsCountryCd);
		inptData.setCustCityName(custCityName);
		inptData.setCustTel(custTel);
		inptData.setCustFax(custFax);
		inptData.setNtvCustAttention(ntvCustAttention);
		inptData.setCustOfficeLicenseNo(custOfficeLicenseNo);
		inptData.setCustBillToCd(custBillToCd);
		inptData.setBillToNtvBillToDept(billToNtvBillToDept);
		inptData.setBillToPostalCd(billToPostalCd);
		inptData.setBillToCountryCd(billToCountryCd);
		inptData.setBillToTel(billToTel);
		inptData.setFaxBillTo(faxBillTo);
		inptData.setNtvBillToPerson(ntvBillToPerson);
		inptData.setNtvReceivableRemarks_1(ntvReceivableRemarks_1);
		inptData.setNtvReceivableRemarks_2(ntvReceivableRemarks_2);
		inptData.setNtvDeliDept(ntvDeliDept);
		inptData.setShipToPostalCd(shipToPostalCd);
		inptData.setShipToCountryCd(shipToCountryCd);
		inptData.setShipToUpsCountryCd(shipToUpsCountryCd);
		inptData.setShipToCityName(shipToCityName);
		inptData.setShipToTel(shipToTel);
		inptData.setShipToFax(shipToFax);
		inptData.setNtvDeliAttention(ntvDeliAttention);
		inptData.setCustsubMcPlantCd(custsubMcPlantCd);
		inptData.setSubsidiaryPlantDeptName(subsidiaryPlantDeptName);
		inptData.setSubsidiaryPlantAddress_1(subsidiaryPlantAddress_1);
		inptData.setSubsidiaryPlantAddress_2(subsidiaryPlantAddress_2);
		inptData.setSubsidiaryPlantAddress_3(subsidiaryPlantAddress_3);
		inptData.setSubsidiaryPlantAddress_4(subsidiaryPlantAddress_4);
		inptData.setSubsidiaryPlantPostalCd(subsidiaryPlantPostalCd);
		inptData.setDeptCountryCd(deptCountryCd);
		inptData.setSubsidiaryPlantTel(subsidiaryPlantTel);
		inptData.setSubsidiaryPlantFax(subsidiaryPlantFax);
		inptData.setCustShipmode(custShipmode);
		inptData.setShippingCarrierName(shippingCarrierName);
		inptData.setShippingCarrierAbb(shippingCarrierAbb);
		inptData.setPaymentTerms(paymentTerms);
		inptData.setIncoterms(incoterms);
		inptData.setSettlementMethod(settlementMethod);
		inptData.setProductGenericNameFlg(productGenericNameFlg);
		inptData.setVoucherDiv(voucherDiv);
		inptData.setTaxAreaCd(taxAreaCd);
		inptData.setTaxFreeFlg(taxFreeFlg);
		inptData.setUniformInvType(uniformInvType);
		inptData.setArCloseUnit(arCloseUnit);
		inptData.setCustsubCustCd(custsubCustCd);
		inptData.setCustsubShipToCd(custsubShipToCd);
		inptData.setWeightUnit(weightUnit);
		inptData.setCountryOfOrignShowFlg(countryOfOrignShowFlg);
		inptData.setCountryOfOrigin(countryOfOrigin);
		inptData.setUnitOfMeasure(unitOfMeasure);
		inptData.setsUnitPriceCcyCd(sUnitPriceCcyCd);
		inptData.setpUnitPriceCcyCd(pUnitPriceCcyCd);
		inptData.setFrtDiscountFlg(frtDiscountFlg);
		inptData.setSupplierInvNo(supplierInvNo);
		inptData.setProductControlDepCode(productControlDepCode);
		inptData.setSpecialCustBoxNo(specialCustBoxNo);
		inptData.setSpecialCustBoxGrp(specialCustBoxGrp);
		inptData.setTransportMeans(transportMeans);
		inptData.setHazardFlg(hazardFlg);
		inptData.setDiscountShowFlg(discountShowFlg);
		inptData.setHsCdShowFlg(hsCdShowFlg);
		inptData.setNetWeightShowFlg(netWeightShowFlg);
		inptData.setDirectShipFlg(directShipFlg);
		inptData.setCarrierAcctNo(carrierAcctNo);
		inptData.setServiceStopDiv(serviceStopDiv);
		inptData.setTaxInExDiv(taxInExDiv);
		inptData.setNtvMcPlantName(ntvMcPlantName);
		inptData.setNtvCustName2(ntvCustName2);
		inptData.setCellCd(cellCd);
		inptData.setCustMailAddressFlg(custMailAddressFlg);
		inptData.setShipToMailAddress(shipToMailAddress);
		inptData.setDtComment(dtComment);
		inptData.setHdCommentForLogistics(hdCommentForLogistics);

		return inptData;
	}

	public static OutptData getTransferOutData() {

		OutptData outptData = new OutptData();
		outptData.setQty(soQty);
		outptData.setPoQtyPerCase(poQtyPerCase);
		outptData.setComInvPrintNumOrgn(comInvPrintNumOrgn);
		outptData.setComInvPrintNumCopy(comInvPrintNumCopy);
		outptData.setDeliOrderPrintNumOrgn(deliOrderPrintNumOrgn);
		outptData.setDeliInvPrintNumCopy(deliOrderPrintNumCopy);
		outptData.setPackListPrintNumOrgn(packListPrintNumOrgn);
		outptData.setPackListPrintNumCopy(packListPrintNumCopy);
		outptData.setInvPackPrintNumOrgn(invPackPrintNumOrgn);
		outptData.setInvPackPrintNumCopy(invPackPrintNumCopy);
		outptData.setArClosingDay(arClosingDay);
		outptData.setWeight(weight);
		outptData.setTotalOfWeight(totalWeight);
		outptData.setSumQty(totalQty);
		outptData.setSoAmt(soAmount);
		outptData.setInTaxSPrice(includeTaxSUPrice);
		outptData.setSoAmtSum(subtotalSoAmount);
		outptData.setTotalTaxAmt(taxAmount);
		outptData.setOffAmt(tenthsDiscountedCost);
		outptData.setOtherDsctAmount(otherDsctAmount);
		outptData.setTotalAmt(totalAmountPrice);
		outptData.setSuppsubSubsidiaryCd(subsidiaryCd);
		outptData.setMcPlantCd(mcCd);
		outptData.setCustCd(custCd);
		outptData.setSupplierCd(supplierCd);
		outptData.setShipToCd(shipToCd);
		outptData.setCustRefCd(String.valueOf(custRefLength));
		outptData.setCustSubRef(custSubRef);
		outptData.setGlobalNo(globalNo);
		outptData.setSoVoucherNo(sovoucherno);
		outptData.setProductCd(productCd);
		outptData.setInnerCd(innerCd);
		outptData.setProductAssort(productAssort);
		outptData.setPurcCompanyName(companyName);
		outptData.setPurcCountryCd(purcCountryCd);
		outptData.setPurcCountryName(purcCountryName);
		outptData.setClassifyCd(classifyCd);
		outptData.setStkDiv(mcPlantDiv);
		outptData.setDataDiv(dataDiv);
		outptData.setDeliDiv(deliDiv);
		outptData.setChildSeq(String.valueOf(childSeq));
		outptData.setMcSpecifyVoucherDiv(mcSpecifyVoucherDiv);
		outptData.setPackingRank(packingRank);
		outptData.setDeliNoteSendFlg(deliNoteSendFlg);
		outptData.setSpecifyVoucherDiv(specifyVoucherDiv);
		outptData.setMoveTicketDiv(moveTicketDiv);
		outptData.setTempVoucherDiv(tempVoucherDiv);
		outptData.setDeliDeptCd(deliDeptCd);
		outptData.setDeliAttentionCd(deliAttentionCd);
		outptData.setBrandCd(brandCd);
		outptData.setBrandName(brandName);
		outptData.setMisumiProductCd(productCdMst);
		outptData.setBarcodeGlobalNo(barcodeGlobalNo);
		outptData.setComInvFlg(comInvFlg);
		outptData.setComInvRetainFlg(comInvRetainFlg);
		outptData.setDeliOrderFlg(deliOrderFlg);
		outptData.setDeliOrderRetainFlg(deliOrderRetainFlg);
		outptData.setPackListFlg(packListFlg);
		outptData.setPackListSaveFlg(packListRetainFlg);
		outptData.setInvPackFlg(invPackFlg);
		outptData.setInvPackRetainFlg(invPackRetainFlg);
		outptData.setHsCd(hsCd);
		outptData.setSuppsubTel(subsidiaryTel);
		outptData.setSuppsubFax(subsidiaryFax);
		outptData.setSuppsubPostalCd(subsidiaryPostalCd);
		outptData.setSuppsubCountryCd(subsidiaryCountryCd);
		outptData.setSuppsubLicenceNo(subsidiaryLicenceNo);
		outptData.setSuppsubVatRegistrationNumber(subsidiaryVatRegistrationNumber);
		outptData.setEcalCustCd(ecalCustCd);
		outptData.setCustName(custName);
		outptData.setCustPostalNo(custPostalCd);
		outptData.setNtvCustDept(ntvCustDept);
		outptData.setCustCountryCd(custCountryCd);
		outptData.setCustCountryCdUps(custUpsCountryCd);
		outptData.setCustCityName(custCityName);
		outptData.setCustTel(custTel);
		outptData.setCustFax(custFax);
		outptData.setNtvCustAttention(ntvCustAttention);
		outptData.setCustOfficeLicenseNo(custOfficeLicenseNo);
		outptData.setBillToCd(custBillToCd);
		outptData.setBillToNtvBillToDept(billToNtvBillToDept);
		outptData.setBillToPostalCd(billToPostalCd);
		outptData.setBillToCountryCd(billToCountryCd);
		outptData.setBillToTel(billToTel);
		outptData.setBillToFax(faxBillTo);
		outptData.setNtvBillToPerson(ntvBillToPerson);
		outptData.setNtvReceivableRemarks_1(ntvReceivableRemarks_1);
		outptData.setNtvReceivableRemarks_2(ntvReceivableRemarks_2);
		outptData.setShipToDeptName(ntvDeliDept);
		outptData.setShipToPostalNo(shipToPostalCd);
		outptData.setShipToCountryCd(shipToCountryCd);
		outptData.setShipUpsCountryCd(shipToUpsCountryCd);
		outptData.setShipToCityName(shipToCityName);
		outptData.setShipToTel(shipToTel);
		outptData.setShipToFax(shipToFax);
		outptData.setShipToAttention(ntvDeliAttention);
		outptData.setSub1PlantCd(custsubMcPlantCd);
		outptData.setSub1DeptName(subsidiaryPlantDeptName);
		outptData.setSub1DeptAddress_1(subsidiaryPlantAddress_1);
		outptData.setSub1DeptAddress_2(subsidiaryPlantAddress_2);
		outptData.setSub1DeptAddress_3(subsidiaryPlantAddress_3);
		outptData.setSub1DeptAddress_4(subsidiaryPlantAddress_4);
		outptData.setSub1DeptPostalCd(subsidiaryPlantPostalCd);
		outptData.setSub1DeptCountryCd(deptCountryCd);
		outptData.setSub1DeptTel(subsidiaryPlantTel);
		outptData.setSub1DeptFax(subsidiaryPlantFax);
		outptData.setShippingDestinationCd(custShipmode);
		outptData.setCarrierName(shippingCarrierName);
		outptData.setCarrierNameKana(shippingCarrierAbb);
		outptData.setPaymentTerms(paymentTerms);
		outptData.setIncoterms(incoterms);
		outptData.setSettlementMethod(settlementMethod);
		outptData.setProductGenericNameFlg(productGenericNameFlg);
		outptData.setVoucherDiv(voucherDiv);
		outptData.setTaxAreaCd(taxAreaCd);
		outptData.setTaxFreeFlg(taxFreeFlg);
		outptData.setUniformInvType(uniformInvType);
		outptData.setArCloseUnit(arCloseUnit);
		outptData.setFinalCustsubCustCd(custsubCustCd);
		outptData.setFinalCustsubShipToCd(custsubShipToCd);
		outptData.setWeightUnit(weightUnit);
		outptData.setCountryOfOrignShowFlg(countryOfOrignShowFlg);
		outptData.setCountryOfOrigin(countryOfOrigin);
		outptData.setUnitOfMeasure(unitOfMeasure);
		outptData.setSUnitPriceCcyCd(sUnitPriceCcyCd);
		outptData.setPUnitPriceCcyCd(pUnitPriceCcyCd);
		outptData.setFrtDiscountFlg(frtDiscountFlg);
		outptData.setSupplierInvNo(supplierInvNo);
		outptData.setDeptCd(productControlDepCode);
		outptData.setSpecialCustBoxNo(specialCustBoxNo);
		outptData.setSpecialCustBoxGrp(specialCustBoxGrp);
		outptData.setTransportMeans(transportMeans);
		outptData.setHazardFlg(hazardFlg);
		outptData.setDiscountShowFlg(discountShowFlg);
		outptData.setHsCdShowFlg(hsCdShowFlg);
		outptData.setNetWeightShowFlg(netWeightShowFlg);
		outptData.setDirectShipFlg(directShipFlg);
		outptData.setCarrierAcctNo(carrierAcctNo);
		outptData.setServiceStopDiv(serviceStopDiv);
		outptData.setTaxInExDiv(taxInExDiv);
		outptData.setScCodeName(ntvMcPlantName);
		outptData.setCustNameKana(ntvCustName2);
		outptData.setCellCd(cellCd);
		outptData.setCustMailAddress(custMailAddressFlg);
		outptData.setShipToMailAddress(shipToMailAddress);
		outptData.setDtlComment(dtComment);
		outptData.setCsInstruct(hdCommentForLogistics);

		return outptData;
	}

	public static OutptData getFixedOutData() {

		OutptData outptData = new OutptData();
		// 固定値[0]
		outptData.setSrcSumAmt(FIXED_VALUE);
		outptData.setDiffAmt(FIXED_VALUE);
		outptData.setCreditTaxAmt(FIXED_VALUE);
		outptData.setCreditSumAmt(FIXED_VALUE);
		outptData.setAmt(FIXED_VALUE);
		outptData.setSetoffAmt(FIXED_VALUE);
		outptData.setEduTaxAmt(FIXED_VALUE);
		outptData.setEdu2TaxAmt(FIXED_VALUE);
		outptData.setSAddTaxAmt(FIXED_VALUE);
		outptData.setInTaxAmt(FIXED_VALUE);
		outptData.setSumAmt(FIXED_VALUE);
		outptData.setSumSetoffAmt(FIXED_VALUE);
		outptData.setCentvatAmt(FIXED_VALUE);
		outptData.setSumEduTaxAmt(FIXED_VALUE);
		outptData.setSumEdu2TaxAmt(FIXED_VALUE);
		outptData.setSumSAddTaxAmt(FIXED_VALUE);
		outptData.setSumInTaxAmt(FIXED_VALUE);
		outptData.setSumWeight(FIXED_VALUE);
		outptData.setSumActAmt(FIXED_VALUE);
		outptData.setTotalImportTaxAmt(FIXED_VALUE);
		outptData.setTotalSetoffTaxAmt(FIXED_VALUE);
		outptData.setTotalEduTaxAmt(FIXED_VALUE);
		outptData.setTotalEdu2TaxAmt(FIXED_VALUE);
		outptData.setTotalSAddTaxAmt(FIXED_VALUE);
		outptData.setSumQty(FIXED_VALUE);
		outptData.setSumCAddTaxAmt(FIXED_VALUE);
		outptData.setExportPurcUpri(FIXED_VALUE);
		outptData.setFreightUpri(FIXED_VALUE);
		outptData.setImportUpri(FIXED_VALUE);
		outptData.setImportTaxUpri(FIXED_VALUE);
		outptData.setPurcAmt(FIXED_VALUE);
		outptData.setSumSoAmt(FIXED_VALUE);
		outptData.setCtaxRate(FIXED_VALUE);
		// 日付 todo
		// ブランク
		outptData.setBoxNo(BLANK);
		outptData.setSuppsubSaleTaxNo(BLANK);
		outptData.setSuppsubGoodsTaxMangeCd(BLANK);
		outptData.setSuppsubGoodsTaxMangeCity(BLANK);
		outptData.setSuppsubDeptName(BLANK);
		outptData.setSuppsubCommissionerate(BLANK);
		outptData.setOriginalInvoiceNo(BLANK);
		outptData.setOriginalGlobalNo(BLANK);
		outptData.setOriginalSoVoucherNo(BLANK);
		outptData.setReasonCd(BLANK);
		outptData.setReasonContent(BLANK);
		outptData.setInvoiceRemarks_3(BLANK);
		outptData.setInvoiceRemarks_1(BLANK);
		outptData.setInvoiceRemarks_2(BLANK);
		outptData.setGoodsTaxMangeCity(BLANK);
		outptData.setDeptName(BLANK);
		outptData.setCommissionerate(BLANK);
		outptData.setImportNo(BLANK);
		outptData.setArrNo(BLANK);
		outptData.setShipNo(BLANK);
		outptData.setLocalCity(BLANK);
//		outptData.setDeliveryTime(BLANK);
		outptData.setSendAnsDiv(BLANK);
		outptData.setRdInstructComment(BLANK);
		outptData.setOtherDeliDiv(BLANK);
		outptData.setPlantDiv(BLANK);
		outptData.setCustDeptEn(BLANK);
		outptData.setCustAttentionEn(BLANK);
		outptData.setDmCd_1(BLANK);
		outptData.setDmCd_2(BLANK);
		outptData.setDmCd_3(BLANK);
		outptData.setDmCd_4(BLANK);
		outptData.setDmCd_5(BLANK);
		outptData.setExportPurcUpriCur(BLANK);
		outptData.setFreightXrate(BLANK);
		outptData.setSuppsubCurXrate(BLANK);
		outptData.setIncoterms_1(BLANK);
		outptData.setIncoterms_2(BLANK);
		outptData.setIncoterms_3(BLANK);
		outptData.setShipPlantCd(BLANK);
		outptData.setFirstCustFlg(BLANK);
		outptData.setUpdDiv(BLANK);
		outptData.setShipStopFlg(BLANK);

		return outptData;
	}

	public static InptData getInptDataPurcPrice() {

		InptData inptData = new InptData();
		inptData.setPurchaseUnitPrice(10);

		return inptData;
	}

	public static OutptData getOutptDataPurcPrice() {

		OutptData outptData = new OutptData();
		outptData.setPurcPrice(10 * 1000);

		return outptData;
	}

	public static InptData getInptDataExcludeTaxSUPrice() {

		InptData inptData = new InptData();
		inptData.setExcludeTaxSUPrice(10);

		return inptData;
	}

	public static OutptData getOutptDataExcludeTaxSUPrice() {

		OutptData outptData = new OutptData();
		outptData.setExcludeTaxSUPrice(10 * 1000);

		return outptData;
	}

	public static InptData getInptDataMcPlantDiv() {

		InptData inptData = new InptData();
		inptData.setMcPlantDiv(mcPlantDiv);

		return inptData;
	}

	public static OutptData getOutptDataMcPlantDiv() {

		OutptData outptData = new OutptData();
		outptData.setPlant(mcPlantDiv);

		return outptData;
	}

	public static InptData getInptCometSeq() {

		InptData inptData = new InptData();
		inptData.setCometSeq(cometSeq);
		inptData.setVsd(DATE_DEFAULT);

		return inptData;
	}

	public static OutptData getOutptCometSeq() {

		OutptData outptData = new OutptData();
		outptData.setCometSeq(DATE_DEFAULT + cometSeq);
		return outptData;
	}

	public static InptData getInptDataMJPWithHeaderGrp0() {

		InptData inptData = new InptData();
		inptData.setSubsidiaryCd("MJP");
		inptData.setHeaderRef(headerRef);
		inptData.setGrp("0");
		setGrpWithDeli(inptData);

		return inptData;
	}

	public static InptData getInptDataMJPWithEngHeaderGrp0() {

		InptData inptData = new InptData();
		inptData.setSubsidiaryCd("MJP");
		inptData.setHeaderRef(engHeaderRef);
		inptData.setGrp("0");
		setGrpWithDeli(inptData);

		return inptData;
	}

	public static InptData getInptDataMJPWithcustRefGrp0() {

		InptData inptData = new InptData();
		inptData.setSubsidiaryCd("MJP");
		inptData.setHeaderRef(custRef);
		inptData.setGrp("0");
		setGrpWithDeli(inptData);

		return inptData;
	}

	public static InptData getInptDataMJPWithHeaderGrp2() {

		InptData inptData = new InptData();
		inptData.setSubsidiaryCd("MJP");
		inptData.setHeaderRef(headerRef);
		inptData.setGrp("2");

		return inptData;
	}

	public static InptData getInptDataMJPWithEngHeaderGrp2() {

		InptData inptData = new InptData();
		inptData.setSubsidiaryCd("MJP");
		inptData.setHeaderRef(engHeaderRef);
		inptData.setGrp("2");

		return inptData;
	}

	public static InptData getInptDataMJPWithCustRefGrp2() {

		InptData inptData = new InptData();
		inptData.setSubsidiaryCd("MJP");
		inptData.setHeaderRef(custRef);
		inptData.setGrp("2");

		return inptData;
	}

	public static OutptData getOutptDataMJPWithHeaderGrp0() {

		OutptData outptData = new OutptData();
		outptData.setCustRef(SPACE);
		outptData.setCystRefNtv(headerRef);
		// 納入者部課（現地語）
		outptData.setDeliDept(ntvDeliDept);
		// 納入者氏名（現地語）
		outptData.setDeliAttention(ntvDeliAttention);

		return outptData;
	}

	public static OutptData getOutptDataMJPWithEngHeaderRefGrp0() {

		OutptData outptData = new OutptData();
		outptData.setCustRef(SPACE);
		outptData.setCystRefNtv(engHeaderRef);
		// 納入者部課（現地語）
		outptData.setDeliDept(ntvDeliDept);
		// 納入者氏名（現地語）
		outptData.setDeliAttention(ntvDeliAttention);

		return outptData;
	}

	public static OutptData getOutptDataMJPWithcustRefGrp0() {

		OutptData outptData = new OutptData();
		outptData.setCustRef(SPACE);
		outptData.setCystRefNtv(custRef);
		// 納入者部課（現地語）
		outptData.setDeliDept(ntvDeliDept);
		// 納入者氏名（現地語）
		outptData.setDeliAttention(ntvDeliAttention);

		return outptData;
	}

	public static OutptData getOutptDataMJPWithHeaderGrp2() {

		OutptData outptData = new OutptData();
		outptData.setCustRef(SPACE);
		outptData.setCystRefNtv(headerRef);
		// 納入者部課（現地語）
		outptData.setDeliDept(BLANK);
		// 納入者氏名（現地語）
		outptData.setDeliAttention(BLANK);

		return outptData;
	}

	public static OutptData getOutptDataMJPWithEngHeaderRefGrp2() {

		OutptData outptData = new OutptData();
		outptData.setCustRef(SPACE);
		outptData.setCystRefNtv(engHeaderRef);
		// 納入者部課（現地語）
		outptData.setDeliDept(BLANK);
		// 納入者氏名（現地語）
		outptData.setDeliAttention(BLANK);

		return outptData;
	}

	public static OutptData getOutptDataMJPWithcustRefGrp2() {

		OutptData outptData = new OutptData();
		outptData.setCustRef(SPACE);
		outptData.setCystRefNtv(custRef);
		// 納入者部課（現地語）
		outptData.setDeliDept(BLANK);
		// 納入者氏名（現地語）
		outptData.setDeliAttention(BLANK);

		return outptData;
	}

	public static InptData getInptDataNoMJPHeaderRefGrp0() {

		InptData inptData = new InptData();
		inptData.setCustRef(custRef);
		inptData.setHeaderRef(headerRef);
		inptData.setGrp("0");
		setGrpWithDeli(inptData);

		return inptData;
	}

	public static InptData getInptDataNoMJPEngHeaderRefGrp0() {

		InptData inptData = new InptData();
		inptData.setCustRef(custRef);
		inptData.setHeaderRef(engHeaderRef);
		inptData.setGrp("0");
		setGrpWithDeli(inptData);

		return inptData;
	}

	public static OutptData getOutptDataNoMJPHeaderRefGrp0() {

		OutptData outptData = new OutptData();
		outptData.setCustRef(custRef);
		outptData.setCystRefNtv(headerRef);
		// 納入者部課（現地語）
		outptData.setDeliDept(ntvDeliDept);
		// 納入者氏名（現地語）
		outptData.setDeliAttention(ntvDeliAttention);

		return outptData;
	}

	public static OutptData getOutptDataNoMJPEngHeaderRefGrp0() {

		OutptData outptData = new OutptData();
		outptData.setCustRef(custRef);
		outptData.setCystRefNtv(engHeaderRef);
		// 納入者部課（現地語）
		outptData.setDeliDept(ntvDeliDept);
		// 納入者氏名（現地語）
		outptData.setDeliAttention(ntvDeliAttention);

		return outptData;
	}

	public static InptData getInptDataChildSeq() {

		InptData inptData = new InptData();
		inptData.setChildSeq(childSeq);

		return inptData;
	}

	public static OutptData getOutptDataLabelL002() {

		OutptData outptData = new OutptData();
		outptData.setLabelDiv("L002");
		return outptData;
	}

	public static OutptData getOutptDataLabelL001() {

		OutptData outptData = new OutptData();
		outptData.setLabelDiv("L001");
		return outptData;
	}

	public static InptData getInptDataSubsidiaryCdArrDt() {

		InptData inptData = new InptData();
		inptData.setSubsidiaryCdArrDt(subsidiaryCdArrDt);

		return inptData;
	}

	public static OutptData getOutptDataRdInstructFlg1() {

		OutptData outptData = new OutptData();
		outptData.setRdInstructFlg("1");
		return outptData;
	}

	public static OutptData getOutptDataRdInstructFlg0() {

		OutptData outptData = new OutptData();
		outptData.setRdInstructFlg("0");
		return outptData;
	}

	public static InptData getInptOrderMsgCd9001() {

		InptData inptData = new InptData();
		inptData.setOrderMsgCd("9001");

		return inptData;
	}

	public static InptData getInptOrderMsgCd9002() {

		InptData inptData = new InptData();
		inptData.setOrderMsgCd("9002");

		return inptData;
	}

	public static OutptData getOutptDataifDiv1() {

		OutptData outptData = new OutptData();
		outptData.setIfDiv("1");

		return outptData;
	}

	public static OutptData getOutptDataifDiv2() {

		OutptData outptData = new OutptData();
		outptData.setIfDiv("2");

		return outptData;
	}

	public static OutptData getOutptDataifDiv() {

		OutptData outptData = new OutptData();
		outptData.setIfDiv(BLANK);

		return outptData;
	}

	public static InptData getInptCustCategoryCd01() {

		InptData inptData = new InptData();
		inptData.setCustCategoryCd("01");

		return inptData;
	}

	public static InptData getInptCustCategoryCd02() {

		InptData inptData = new InptData();
		inptData.setCustCategoryCd("02");

		return inptData;
	}

	public static OutptData getOutptSuppsubBusinessFlg1() {

		OutptData outptData = new OutptData();
		outptData.setSuppsubBusinessFlg("1");

		return outptData;
	}

	public static OutptData getOutptSuppsubBusinessFlg0() {

		OutptData outptData = new OutptData();
		outptData.setSuppsubBusinessFlg("0");

		return outptData;
	}

	public static InptData getInptGrp1() {

		InptData inptData = new InptData();
		inptData.setGrp("1");
		inptData.setNtvCustDept(ntvCustDept);
		inptData.setNtvCustAttention(ntvCustAttention);

		return inptData;
	}

	public static OutptData getOutptGrp1() {

		OutptData outptData = new OutptData();
		outptData.setNtvCustDept(ntvCustDept);
		outptData.setNtvCustAttention(ntvCustAttention);

		return outptData;
	}

	public static OutptData getOutptGrp() {

		OutptData outptData = new OutptData();
		outptData.setNtvCustDept(BLANK);
		outptData.setNtvCustAttention(BLANK);

		return outptData;
	}

	public static InptData getInptShipToCd() {

		InptData inptData = new InptData();
		inptData.setShipToCd(shipToCd);
		inptData.setShipToFrtAreaCd(shipToFrtAreaCd);
		inptData.setShipToBusinessinstruct1ShowFlg(shipToBusinessinstruct1ShowFlg);
		inptData.setShipToNtvBusinessinstruct1(shipToNtvBusinessinstruct1);
		inptData.setShipToBusinessinstruct2ShowFlg(shipToBusinessinstruct2ShowFlg);
		inptData.setShipToNtvBusinessinstruct2(shipToNtvBusinessinstruct2);
		inptData.setShipToPackingInstruct1ShowFlg(shipToPackingInstruct1ShowFlg);
		inptData.setShipToNtvPackingInstruct1(shipToNtvPackingInstruct1);
		inptData.setShipToPackingInstruct2ShowFlg(shipToPackingInstruct2ShowFlg);
		inptData.setShipToNtvPackingInstruct2(shipToNtvPackingInstruct2);

		return inptData;
	}

	public static OutptData getOutptShipToCd() {

		OutptData outptData = new OutptData();
		outptData.setShipToCd(shipToCd);
		outptData.setFrtAreaCd(shipToFrtAreaCd);
		outptData.setBusinessinstruct1ShowFlg(shipToBusinessinstruct1ShowFlg);
		outptData.setNtvBusinessinstruct1(shipToNtvBusinessinstruct1);
		outptData.setBusinessinstruct2ShowFlg(shipToBusinessinstruct2ShowFlg);
		outptData.setNtvBusinessinstruct2(shipToNtvBusinessinstruct2);
		outptData.setPackingInstruct1ShowFlg(shipToPackingInstruct1ShowFlg);
		outptData.setNtvPackingInstruct1(shipToNtvPackingInstruct1);
		outptData.setPackingInstruct2ShowFlg(shipToPackingInstruct2ShowFlg);
		outptData.setNtvPackingInstruct2(shipToNtvPackingInstruct2);

		return outptData;
	}

	public static InptData getInptNoShipToCd() {

		InptData inptData = new InptData();
		inptData.setShipToFrtAreaCd(shipToFrtAreaCd);
		inptData.setShipToBusinessinstruct1ShowFlg(shipToBusinessinstruct1ShowFlg);
		inptData.setShipToNtvBusinessinstruct1(shipToNtvBusinessinstruct1);
		inptData.setShipToBusinessinstruct2ShowFlg(shipToBusinessinstruct2ShowFlg);
		inptData.setShipToNtvBusinessinstruct2(shipToNtvBusinessinstruct2);
		inptData.setShipToPackingInstruct1ShowFlg(shipToPackingInstruct1ShowFlg);
		inptData.setShipToNtvPackingInstruct1(shipToNtvPackingInstruct1);
		inptData.setShipToPackingInstruct2ShowFlg(shipToPackingInstruct2ShowFlg);
		inptData.setShipToNtvPackingInstruct2(shipToNtvPackingInstruct2);

		return inptData;
	}

	public static OutptData getOutptNoShipToCd() {

		OutptData outptData = new OutptData();
		outptData.setFrtAreaCd(shipToFrtAreaCd);
		outptData.setBusinessinstruct1ShowFlg(shipToBusinessinstruct1ShowFlg);
		outptData.setNtvBusinessinstruct1(shipToNtvBusinessinstruct1);
		outptData.setBusinessinstruct2ShowFlg(shipToBusinessinstruct2ShowFlg);
		outptData.setNtvBusinessinstruct2(shipToNtvBusinessinstruct2);
		outptData.setPackingInstruct1ShowFlg(shipToPackingInstruct1ShowFlg);
		outptData.setNtvPackingInstruct1(shipToNtvPackingInstruct1);
		outptData.setPackingInstruct2ShowFlg(shipToPackingInstruct2ShowFlg);
		outptData.setNtvPackingInstruct2(shipToNtvPackingInstruct2);
		outptData.setShipToName(BLANK);
		outptData.setShipToAddress_1(BLANK);
		outptData.setShipToAddress_2(BLANK);
		outptData.setShipToAddress_3(BLANK);
		outptData.setShipToAddress_4(BLANK);
		outptData.setShipToCountryName(BLANK);

		return outptData;
	}

	/**
	 * 受注明細．得意先現法コード　≠　空白
	 */
	public static InptData getInptCustsubSubsidiaryCd() {

		InptData inptData = new InptData();
		inptData.setCustsubSubsidiaryCd(custsubSubsidiaryCd);

		return inptData;
	}

	/**
	 * 受注明細．直送先コード　＝　空白　 かつ　受注明細．得意先国コード　≠　現法マスタ．国コード
	 */
	public static InptData getInptCustNotEsSubsidiary() {

		InptData inptData = new InptData();
		inptData.setShipToCd(BLANK);
		inptData.setCustCountryCd(custCountryCd);
		inptData.setSubsidiaryCountryCd(subsidiaryCountryCd);

		return inptData;
	}

	/**
	 * 受注明細．直送先コード　≠　空白　かつ　受注明細．直送先国コード　≠　現法マスタ．国コード
	 */
	public static InptData getInptCustBNotEsSubsidiary() {

		InptData inptData = new InptData();

		inptData.setShipToCd(shipToCd);
		inptData.setCustCountryCd(custCountryCd);
		inptData.setSubsidiaryCountryCd(subsidiaryCountryCd);

		return inptData;
	}

	public static OutptData getOutptExportFlg1() {

		OutptData outptData = new OutptData();
		outptData.setExportFlg("1");

		return outptData;
	}

	public static OutptData getOutptExportFlg0() {

		OutptData outptData = new OutptData();
		outptData.setExportFlg("0");

		return outptData;
	}

	public static InptData getExportFlgFalseExisInData() {

		InptData inptData = new InptData();
		inptData.setNtv1CompanyName("仕入先マスタ.企業名（現地語）");
		inptData.setNtvClassifyCdName("製品分類マスタ.分析コード名（現地語）");
		inptData.setNtvBrandName("ブランドマスタ.ブランド名称（現地語）");
		inptData.setNtvSubsidiaryName("現法マスタ.現地法人名称（現地語）");
		inptData.setSubsidiaryNtvAddress_1("現法マスタ.住所１（現地語）");
		inptData.setSubsidiaryNtvAddress_2("現法マスタ.住所２（現地語）");
		inptData.setSubsidiaryNtvAddress_3("現法マスタ.住所３（現地語）");
		inptData.setSubsidiaryNtvAddress_4("現法マスタ.住所４（現地語）");
		inptData.setNtvCountryName_1("国マスタ.国名称（日本語）");
		inptData.setNtvCustName1("得意先マスタ.得意先名（現地語１）");
		inptData.setCustNtvAddress_1("得意先マスタ.住所１（現地語）");
		inptData.setCustNtvAddress_2("得意先マスタ.住所２（現地語）");
		inptData.setCustNtvAddress_3("得意先マスタ.住所３（現地語）");
		inptData.setCustNtvAddress_4("得意先マスタ.住所４（現地語）");
		inptData.setCustNtvCountryName_1("国マスタ（得意先）.国名称（日本語）");
		inptData.setNtvBillToName("売掛先マスタ.売掛先名（現地語）");
		inptData.setBillToNtvAddress_1("売掛先マスタ.住所１（現地語）");
		inptData.setBillToNtvAddress_2("売掛先マスタ.住所２（現地語）");
		inptData.setBillToNtvAddress_3("売掛先マスタ.住所３（現地語）");
		inptData.setBillToNtvAddress_4("売掛先マスタ.住所４（現地語）");
		inptData.setBillToNtvCountryName_1("国マスタ（売掛先）.国名称（日本語）");
		inptData.setCustomerNtvCustName1("得意先マスタ（得意先現法得意先コード）.得意先名（現地語１）");
		inptData.setSubsidiaryNtvShipToName1("直送先マスタ（得意先現法直送先コード）.直送先名（現地語１）");
		inptData.setNtvProductName("商品マスタ.商品名（現地語）");
		inptData.setNtvProductName("商品マスタ.商品名（現地語）");
		inptData.setOriginNtvCountryName_1("国マスタ（原産国）.国名称（日本語）");

		return inptData;
	}

	public static OutptData getExportFlgFalseExisOutData() {

		OutptData outptData = new OutptData();
		outptData.setExportFlg("0");
		outptData.setPurcCompanyName("仕入先マスタ.企業名（現地語）");
		outptData.setClassifyName("製品分類マスタ.分析コード名（現地語）");
		outptData.setBrandName("ブランドマスタ.ブランド名称（現地語）");
		outptData.setSuppsubSubsidiaryName("現法マスタ.現地法人名称（現地語）");
		outptData.setSuppsubAddress_1("現法マスタ.住所１（現地語）");
		outptData.setSuppsubAddress_2("現法マスタ.住所２（現地語）");
		outptData.setSuppsubAddress_3("現法マスタ.住所３（現地語）");
		outptData.setSuppsubAddress_4("現法マスタ.住所４（現地語）");
		outptData.setSuppsubCountryName("国マスタ.国名称（日本語）");
		outptData.setCustName("得意先マスタ.得意先名（現地語１）");
		outptData.setCustAddress_1("得意先マスタ.住所１（現地語）");
		outptData.setCustAddress_2("得意先マスタ.住所２（現地語）");
		outptData.setCustAddress_3("得意先マスタ.住所３（現地語）");
		outptData.setCustAddress_4("得意先マスタ.住所４（現地語）");
		outptData.setCustCountryName("国マスタ（得意先）.国名称（日本語）");
		outptData.setBillToName("売掛先マスタ.売掛先名（現地語）");
		outptData.setBillToAddress_1("売掛先マスタ.住所１（現地語）");
		outptData.setBillToAddress_2("売掛先マスタ.住所２（現地語）");
		outptData.setBillToAddress_3("売掛先マスタ.住所３（現地語）");
		outptData.setBillToAddress_4("売掛先マスタ.住所４（現地語）");
		outptData.setBillToCountryName("国マスタ（売掛先）.国名称（日本語）");
		outptData.setFinalCustName("得意先マスタ（得意先現法得意先コード）.得意先名（現地語１）");
		outptData.setFinalShipToName("直送先マスタ（得意先現法直送先コード）.直送先名（現地語１）");
		outptData.setProductName("商品マスタ.商品名（現地語）");
		outptData.setProductNameKana("商品マスタ.商品名（現地語）");
		outptData.setCountryNameOfOrigin("国マスタ（原産国）.国名称（日本語）");

		return outptData;
	}

	public static InptData getExportFlgFalseNotExisInData() {

		InptData inptData = new InptData();
		inptData.setNtv1CompanyName(BLANK);
		inptData.setNtvClassifyCdName(BLANK);
		inptData.setNtvBrandName(BLANK);
		inptData.setNtvSubsidiaryName(BLANK);
		inptData.setSubsidiaryNtvAddress_1(BLANK);
		inptData.setSubsidiaryNtvAddress_2(BLANK);
		inptData.setSubsidiaryNtvAddress_3(BLANK);
		inptData.setSubsidiaryNtvAddress_4(BLANK);
		inptData.setNtvCountryName_1(BLANK);
		inptData.setNtvCustName1(BLANK);
		inptData.setCustNtvAddress_1(BLANK);
		inptData.setCustNtvAddress_2(BLANK);
		inptData.setCustNtvAddress_3(BLANK);
		inptData.setCustNtvAddress_4(BLANK);
		inptData.setCustNtvCountryName_1(BLANK);
		inptData.setNtvBillToName(BLANK);
		inptData.setBillToNtvAddress_1(BLANK);
		inptData.setBillToNtvAddress_2(BLANK);
		inptData.setBillToNtvAddress_3(BLANK);
		inptData.setBillToNtvAddress_4(BLANK);
		inptData.setBillToNtvCountryName_1(BLANK);
		inptData.setCustomerNtvCustName1(BLANK);
		inptData.setSubsidiaryNtvShipToName1(BLANK);
		inptData.setNtvProductName(BLANK);
		inptData.setNtvProductName(BLANK);
		inptData.setOriginNtvCountryName_1(BLANK);
		inptData.setCompanyName("CompanyName");
		inptData.setClassifyCdName("ClassifyCdName");
		inptData.setBrandName("BrandName");
		inptData.setSubsidiaryName("SubsidiaryName");
		inptData.setSubsidiaryAddress_1("SubsidiaryAddress_1");
		inptData.setSubsidiaryAddress_2("SubsidiaryAddress_2");
		inptData.setSubsidiaryAddress_3("SubsidiaryAddress_3");
		inptData.setSubsidiaryAddress_4("SubsidiaryAddress_4");
		inptData.setCountryName("CountryName");
		inptData.setCustName("CustName");
		inptData.setCustHalfwidthAddress_1("CustHalfwidthAddress_1");
		inptData.setCustHalfwidthAddress_2("CustHalfwidthAddress_2");
		inptData.setCustHalfwidthAddress_3("CustHalfwidthAddress_3");
		inptData.setCustHalfwidthAddress_4("CustHalfwidthAddress_4");
		inptData.setCustCountryName("CustCountryName");
		inptData.setBillToName("BillToName");
		inptData.setBillToHalfwidthAddress_1("BillToHalfwidthAddress_1");
		inptData.setBillToHalfwidthAddress_2("BillToHalfwidthAddress_2");
		inptData.setBillToHalfwidthAddress_3("BillToHalfwidthAddress_3");
		inptData.setBillToHalfwidthAddress_4("BillToHalfwidthAddress_4");
		inptData.setBillToCountryName("BillToCountryName");
		inptData.setCustomerCustName("CustomerCustName");
		inptData.setSubsidiaryShipToName("SubsidiaryShipToName");
		inptData.setProductName("ProductName");
		// 得意先マスタ.商品名（英語）;
		inptData.setOriginCountryName("OriginCountryName");

		return inptData;
	}

	public static OutptData getExportFlgFalseNotExisOutData() {

		OutptData outptData = new OutptData();
		outptData.setExportFlg("0");
		outptData.setPurcCompanyName("CompanyName");
		outptData.setClassifyName("ClassifyCdName");
		outptData.setBrandName("BrandName");
		outptData.setSuppsubSubsidiaryName("SubsidiaryName");
		outptData.setSuppsubAddress_1("SubsidiaryAddress_1");
		outptData.setSuppsubAddress_2("SubsidiaryAddress_2");
		outptData.setSuppsubAddress_3("SubsidiaryAddress_3");
		outptData.setSuppsubAddress_4("SubsidiaryAddress_4");
		outptData.setSuppsubCountryName("CountryName");
		outptData.setCustName("CustName");
		outptData.setCustAddress_1("CustHalfwidthAddress_1");
		outptData.setCustAddress_2("CustHalfwidthAddress_2");
		outptData.setCustAddress_3("CustHalfwidthAddress_3");
		outptData.setCustAddress_4("CustHalfwidthAddress_4");
		outptData.setCustCountryName("CustCountryName");
		outptData.setBillToName("BillToName");
		outptData.setBillToAddress_1("BillToHalfwidthAddress_1");
		outptData.setBillToAddress_2("BillToHalfwidthAddress_2");
		outptData.setBillToAddress_3("BillToHalfwidthAddress_3");
		outptData.setBillToAddress_4("BillToHalfwidthAddress_4");
		outptData.setBillToCountryName("BillToCountryName");
		outptData.setFinalCustName("CustomerCustName");
		outptData.setFinalShipToName("SubsidiaryShipToName");
		outptData.setProductName("ProductName");
		outptData.setProductNameKana("ProductName");
		outptData.setCountryNameOfOrigin("OriginCountryName");

		return outptData;
	}

	public static InptData getExportFlgTrueExisInData() {

		InptData inptData = new InptData();

		inptData.setCompanyName("CompanyName");
		inptData.setClassifyCdName("ClassifyCdName");
		inptData.setBrandName("BrandName");
		inptData.setSubsidiaryName("SubsidiaryName");
		inptData.setSubsidiaryAddress_1("SubsidiaryAddress_1");
		inptData.setSubsidiaryAddress_2("SubsidiaryAddress_2");
		inptData.setSubsidiaryAddress_3("SubsidiaryAddress_3");
		inptData.setSubsidiaryAddress_4("SubsidiaryAddress_4");
		inptData.setCountryName("CountryName");
		inptData.setCustName("CustName");
		inptData.setCustHalfwidthAddress_1("CustHalfwidthAddress_1");
		inptData.setCustHalfwidthAddress_2("CustHalfwidthAddress_2");
		inptData.setCustHalfwidthAddress_3("CustHalfwidthAddress_3");
		inptData.setCustHalfwidthAddress_4("CustHalfwidthAddress_4");
		inptData.setCustCountryName("CustCountryName");
		inptData.setBillToName("BillToName");
		inptData.setBillToHalfwidthAddress_1("BillToHalfwidthAddress_1");
		inptData.setBillToHalfwidthAddress_2("BillToHalfwidthAddress_2");
		inptData.setBillToHalfwidthAddress_3("BillToHalfwidthAddress_3");
		inptData.setBillToHalfwidthAddress_4("BillToHalfwidthAddress_4");
		inptData.setBillToCountryName("BillToCountryName");
		inptData.setCustomerCustName("CustomerCustName");
		inptData.setSubsidiaryShipToName("SubsidiaryShipToName");
		inptData.setProductName("ProductName");
		// 得意先マスタ.商品名（英語）;
		inptData.setOriginCountryName("OriginCountryName");

		return inptData;
	}

	public static OutptData getExportFlgTrueExisOutData() {

		OutptData outptData = new OutptData();
		outptData.setExportFlg("1");
		outptData.setPurcCompanyName("CompanyName");
		outptData.setClassifyName("ClassifyCdName");
		outptData.setBrandName("BrandName");
		outptData.setSuppsubSubsidiaryName("SubsidiaryName");
		outptData.setSuppsubAddress_1("SubsidiaryAddress_1");
		outptData.setSuppsubAddress_2("SubsidiaryAddress_2");
		outptData.setSuppsubAddress_3("SubsidiaryAddress_3");
		outptData.setSuppsubAddress_4("SubsidiaryAddress_4");
		outptData.setSuppsubCountryName("CountryName");
		outptData.setCustName("CustName");
		outptData.setCustAddress_1("CustHalfwidthAddress_1");
		outptData.setCustAddress_2("CustHalfwidthAddress_2");
		outptData.setCustAddress_3("CustHalfwidthAddress_3");
		outptData.setCustAddress_4("CustHalfwidthAddress_4");
		outptData.setCustCountryName("CustCountryName");
		outptData.setBillToName("BillToName");
		outptData.setBillToAddress_1("BillToHalfwidthAddress_1");
		outptData.setBillToAddress_2("BillToHalfwidthAddress_2");
		outptData.setBillToAddress_3("BillToHalfwidthAddress_3");
		outptData.setBillToAddress_4("BillToHalfwidthAddress_4");
		outptData.setBillToCountryName("BillToCountryName");
		outptData.setFinalCustName("CustomerCustName");
		outptData.setFinalShipToName("SubsidiaryShipToName");
		outptData.setProductName("ProductName");
		outptData.setProductNameKana("ProductName");
		outptData.setCountryNameOfOrigin("OriginCountryName");

		return outptData;
	}

	public static InptData getInputShipToCdExistInfor() {

		InptData inptData = new InptData();
		inptData.setShipToCd("test");
		// 【輸出フラグ】が"0"
		inptData.setNtvShipToName1("直送先マスタ.直送先名（現地語１）");
		inptData.setShipToNtvAddress_1("直送先マスタ.住所１（現地語）");
		inptData.setShipToNtvAddress_2("直送先マスタ.住所２（現地語）");
		inptData.setShipToNtvAddress_3("直送先マスタ.住所３（現地語）");
		inptData.setShipToNtvAddress_4("直送先マスタ.住所４（現地語）");
		inptData.setShipToNtvCountryName_1("国マスタ（直送先）.国名称（日本語）");

		return inptData;
	}

	public static OutptData getOutputShipToCdExistInfor() {

		OutptData outptData = new OutptData();
		outptData.setShipToCd("test");

		// 【輸出フラグ】が"0"
		outptData.setShipToName("直送先マスタ.直送先名（現地語１）");
		outptData.setShipToAddress_1("直送先マスタ.住所１（現地語）");
		outptData.setShipToAddress_2("直送先マスタ.住所２（現地語）");
		outptData.setShipToAddress_3("直送先マスタ.住所３（現地語）");
		outptData.setShipToAddress_4("直送先マスタ.住所４（現地語）");
		outptData.setShipToCountryName("国マスタ（直送先）.国名称（日本語）");

		return outptData;
	}

	public static InptData getInputShipToCdNotExistInfor() {

		InptData inptData = new InptData();
		inptData.setShipToCd("test");
		// 【輸出フラグ】が"0"
		inptData.setNtvShipToName1(BLANK);
		inptData.setShipToNtvAddress_1(BLANK);
		inptData.setShipToNtvAddress_2(BLANK);
		inptData.setShipToNtvAddress_3(BLANK);
		inptData.setShipToNtvAddress_4(BLANK);
		inptData.setShipToNtvCountryName_1(BLANK);
		//inptData.();
		inptData.setBillToHalfwidthAddress_1("BillToHalfwidthAddress_1");
		inptData.setBillToHalfwidthAddress_2("BillToHalfwidthAddress_2");
		inptData.setBillToHalfwidthAddress_3("BillToHalfwidthAddress_3");
		inptData.setBillToHalfwidthAddress_4("BillToHalfwidthAddress_4");
		inptData.setBillToCountryName("BillToCountryName");

		return inptData;
	}

	public static OutptData getOutputShipToCdNotExistInfor() {

		OutptData outptData = new OutptData();
		outptData.setShipToCd("test");
		// 【輸出フラグ】が"0"
		outptData.setShipToName("");
		outptData.setShipToAddress_1("BillToHalfwidthAddress_1");
		outptData.setShipToAddress_2("BillToHalfwidthAddress_2");
		outptData.setShipToAddress_3("BillToHalfwidthAddress_3");
		outptData.setShipToAddress_4("BillToHalfwidthAddress_4");
		outptData.setShipToCountryName("BillToCountryName");

		return outptData;
	}

	public static InptData getInputShipToCdBLANKInfor() {

		InptData inptData = new InptData();
		inptData.setShipToCd(BLANK);
		inptData.setNtvShipToName1(BLANK);
		inptData.setShipToNtvAddress_1(BLANK);
		inptData.setShipToNtvAddress_2(BLANK);
		inptData.setShipToNtvAddress_3(BLANK);
		inptData.setShipToNtvAddress_4(BLANK);
		inptData.setShipToNtvCountryName_1("");
		inptData.setShipToName("ShipToName");
		inptData.setShipToHalfwidthAddress_1("ShipToHalfwidthAddress_1");
		inptData.setShipToHalfwidthAddress_2("ShipToHalfwidthAddress_2");
		inptData.setShipToHalfwidthAddress_3("ShipToHalfwidthAddress_3");
		inptData.setShipToHalfwidthAddress_4("ShipToHalfwidthAddress_4");
		inptData.setShipToCountryName("ShipToCountryName");

		return inptData;
	}

	public static OutptData getOutputShipToCdBlankInfor() {

		OutptData outptData = new OutptData();
		outptData.setShipToCd(BLANK);
		outptData.setShipToName(BLANK);
		outptData.setShipToAddress_1(BLANK);
		outptData.setShipToAddress_2(BLANK);
		outptData.setShipToAddress_3(BLANK);
		outptData.setShipToAddress_4(BLANK);
		outptData.setShipToCountryName(BLANK);

		return outptData;
	}

	public static InptData getDirectInputInfor() {

		InptData inptData = new InptData();
		inptData.setPackingPrintNumOrgn(1);
		inptData.setPackingPrintNumCopy(2);
		inptData.setEngPackingPrintNumOrgn(3);
		inptData.setEngPackingPrintNumCopy(4);
		inptData.setTmpPackingPrintNumOrgn(5);
		inptData.setTmpPackingPrintNumCopy(6);
		inptData.setInvoicePrintNumOrgn(7);
		inptData.setInvoicePrintNumCopy(8);
		inptData.setBoxNumberSeq("BoxNumberSeq");
		inptData.setShippingNumber("123");
		inptData.setMcCd("McCd");
		inptData.setCustCd("CustCd");
		inptData.setSupplierCd("SupplierCd");
		inptData.setGlobalNo("GlobalNo");
		inptData.setChildSeq(213);
		inptData.setDataDiv("DataDiv");
		inptData.setReceivableMcCd("ReceivableMcCd");
		inptData.setNtvDeptNameAbb("NtvDeptNameAbb");
		inptData.setPlantDeptTel("PlantDeptTel");
		inptData.setPackingFlg("PackingFlg");
		inptData.setPackingRetainFlg("PackingRetainFlg");
		inptData.setEngPackingRetainFlg("EngPackingRetainFlg");
		inptData.setTmpPackingRetainFlg("TmpPackingRetainFlg");
		inptData.setInvoiceFlg("InvoiceFlg");
		inptData.setInvoiceRetainFlg("InvoiceRetainFlg");
		inptData.setLabelEarlyDiv("LabelEarlyDiv");
		inptData.setGrp("Grp");
		inptData.setGrp("Grp");
		inptData.setNtv2CompanyName("Ntv2CompanyName");
		inptData.setNtvBusinessInstruct1J("NtvBusinessInstruct1J");
		inptData.setNtvBusinessInstruct2J("NtvBusinessInstruct2J");
		inptData.setNtvBusinessInstruct3J("NtvBusinessInstruct3J");
		inptData.setNtvBusinessInstruct4J("NtvBusinessInstruct4J");
		inptData.setNtvBusinessInstruct5J("NtvBusinessInstruct5J");
		inptData.setNtvPackingInstruct1J("NtvPackingInstruct1J");
		inptData.setNtvPackingInstruct2J("NtvPackingInstruct2J");
		inptData.setNtvPackingInstruct3J("NtvPackingInstruct3J");
		inptData.setNtvPackingInstruct4J("NtvPackingInstruct4J");
		inptData.setNtvPackingInstruct5J("NtvPackingInstruct5J");
		inptData.setShipToDeliAttention("ShipToDeliAttention");
		inptData.setShipToDeliDept("ShipToDeliDept");
		inptData.setNtvShipToName2("NtvShipToName2");
		inptData.setAutomobileStandardCd("AutomobileStandardCd");
		inptData.setStorkChargeApplyDiv("StorkChargeApplyDiv");
		inptData.setDeliNoteNoMjp(321);
		inptData.setTotalSAmountMjp(222);
		inptData.setOriginalDeliNoteNo("OriginalDeliNoteNo");
		inptData.setW1DeliAttentionCd("W1DeliAttentionCd");

		return inptData;
	}

	public static OutptData getDirectOutputInfor() {

		OutptData outptData = new OutptData();
		outptData.setPackingPrintNumOrgnJp(1);
		outptData.setPackingPrintNumCopyJp(2);
		outptData.setEngPackingPrintNumOrgnJp(3);
		outptData.setEngPackingPrintNumCopyJp(4);
		outptData.setTmpPackingPrintNumOrgnJp(5);
		outptData.setTmpPackingPrintNumCopyJp(6);
		outptData.setInvoicePrintNumOrgnJp(7);
		outptData.setInvoicePrintNumCopyJp(8);
		outptData.setUnitQtySeqJp("BoxNumberSeq");
		outptData.setSendedQtyJp(123);
		outptData.setMcPlantCd("McCd");
		outptData.setCustCd("CustCd");
		outptData.setSupplierCd("SupplierCd");
		outptData.setGlobalNo("GlobalNo");
		outptData.setChildSeq("213");
		outptData.setDataDiv("DataDiv");
		outptData.setReceivableMcCdJp("ReceivableMcCd");
		outptData.setNtvDeptNameAbbJp("NtvDeptNameAbb");
		outptData.setNtvDeptTelAbbJp("PlantDeptTel");
		outptData.setPackingFlgJp("PackingFlg");
		outptData.setPackingRetainFlgJp("PackingRetainFlg");
		outptData.setEngPackingRetainFlgJp("EngPackingRetainFlg");
		outptData.setTmpPackingRetainFlgJp("TmpPackingRetainFlg");
		outptData.setInvoiceFlgJp("InvoiceFlg");
		outptData.setInvoiceRetainFlgJp("InvoiceRetainFlg");
		outptData.setLabelEarlyDivJp("LabelEarlyDiv");
		outptData.setArrDeptDivJp("Grp");
		outptData.setArrUserDivJp("Grp");
		outptData.setCompanyNameKanaJp("Ntv2CompanyName");
		outptData.setNtvPackingInstruct1J("NtvBusinessInstruct1J");
		outptData.setNtvPackingInstruct2J("NtvBusinessInstruct2J");
		outptData.setNtvPackingInstruct3J("NtvBusinessInstruct3J");
		outptData.setNtvPackingInstruct4J("NtvBusinessInstruct4J");
		outptData.setNtvPackingInstruct5J("NtvBusinessInstruct5J");
		outptData.setNtvBusinessInstruct1J("NtvPackingInstruct1J");
		outptData.setNtvBusinessInstruct2J("NtvPackingInstruct2J");
		outptData.setNtvBusinessInstruct3J("NtvPackingInstruct3J");
		outptData.setNtvBusinessInstruct4J("NtvPackingInstruct4J");
		outptData.setNtvBusinessInstruct5J("NtvPackingInstruct5J");
		outptData.setShipToAttentionKanaJp("ShipToDeliAttention");
		outptData.setShipToDeptKanaJp("ShipToDeliDept");
		outptData.setShipToNameKanaJp("NtvShipToName2");
		outptData.setAutomobileStandardCdJp("AutomobileStandardCd");
		outptData.setStorkChargeApplyDivJp("StorkChargeApplyDiv");
		outptData.setDeliNoteNoMjp("321");
		outptData.setSumAmtJp(222);
		outptData.setOldDeliNoteNoJp("OriginalDeliNoteNo");
		outptData.setMangShipToFlgJp("W1DeliAttentionCd");

		return outptData;
	}

	public static OutptData getRankPatrolDivOutData() {

		OutptData outptData = new OutptData();
		outptData.setRankFlgJp(BLANK);
		outptData.setPatrolDivJp(BLANK);

		return outptData;
	}

	/**
	 * 置場	受注明細.置場区分（頭2桁のみ）
	 */
	public static InptData getMcPlantDivInData() {

		InptData inptData = new InptData();
		inptData.setMcPlantDiv(mcPlantDiv);

		return inptData;
	}

	public static OutptData getPlantOutData() {

		OutptData outptData = new OutptData();
		outptData.setPlant(mcPlantDiv.substring(0, 1));

		return outptData;
	}

	public static InptData getExportFlg1InputData() {

		InptData inptData = getInptCustBNotEsSubsidiary();
		inptData.setCustName(custName);

		return inptData;
	}

	public static OutptData getExportFlg1CustNameOutData() {

		OutptData outptData = new OutptData();
		outptData.setCustNameKanaJp(custName);

		return outptData;
	}

	public static OutptData getExportFlg0CustNameOutData() {

		OutptData outptData = new OutptData();
		outptData.setCustNameKanaJp(BLANK);

		return outptData;
	}

	public static InptData getShipToCdExistInputData() {

		InptData inptData = new InptData();
		inptData.setShipToCd(shipToCd);
		inptData.setShipToCityCd(shipToCityCd);

		return inptData;
	}

	public static OutptData getShipToCdExistOutData() {

		OutptData outptData = new OutptData();
		outptData.setCityCdJp(shipToCityCd);

		return outptData;
	}

	public static InptData getShipToCdNotExistInputData() {

		InptData inptData = new InptData();
		inptData.setShipToCityCd(custCityCd);

		return inptData;
	}

	public static OutptData getShipToCdNotExistOutData() {

		OutptData outptData = new OutptData();
		outptData.setCityCdJp(custCityCd);

		return outptData;
	}

	/**
	 * 受注明細.グループが"2"
	 * 注文者名（カナ）			受注明細.注文者氏名（現地語）
	 * 注文担当部課名（カナ）			受注明細.注文者部課（現地語）
	 * 納入者名（カナ）			受注明細.納入者氏名（現地語）
	 * 納入担当部課名（カナ）			受注明細.納入者部課（現地語）
	 */
	public static InptData getGrp2InputData() {

		InptData inptData = new InptData();
		inptData.setGrp("2");
		inptData.setNtvCustAttention(ntvCustAttention);
		inptData.setNtvCustDept(ntvCustDept);
		inptData.setNtvDeliAttention(ntvDeliAttention);
		inptData.setNtvDeliDept(ntvDeliDept);

		return inptData;
	}

	public static OutptData getGrp2OutData() {

		OutptData outptData = new OutptData();
		outptData.setCustAttentionKanaJp(ntvCustAttention);
		outptData.setCustDeptKanaJp(ntvCustDept);
		outptData.setDeliAttentionKanaJp(ntvDeliAttention);
		outptData.setDeliDeptKanaJp(ntvDeliDept);

		return outptData;
	}

	/**
	 * 受注明細.グループが"2"でない
	 * 注文者名（カナ）			ブランク
	 * 注文担当部課名（カナ）			ブランク
	 * 納入者名（カナ）			ブランク
	 * 納入担当部課名（カナ）			ブランク
	 */
	public static InptData getGrpNot2InputData() {

		InptData inptData = new InptData();
		inptData.setGrp("3");
		inptData.setNtvCustAttention(ntvCustAttention);
		inptData.setNtvCustDept(ntvCustDept);
		inptData.setNtvDeliAttention(ntvDeliAttention);
		inptData.setNtvDeliDept(ntvDeliDept);

		return inptData;
	}

	public static OutptData getGrpNot2OutData() {

		OutptData outptData = new OutptData();
		outptData.setCustAttentionKanaJp(BLANK);
		outptData.setCustDeptKanaJp(BLANK);
		outptData.setDeliAttentionKanaJp(BLANK);
		outptData.setDeliDeptKanaJp(BLANK);

		return outptData;
	}

	/**
	 * 受注明細.グループが"2"、受注明細.直送先コードが存在しない
	 * 得意先担当者（カナ）			受注明細.納入者氏名（現地語）
	 * 得意先部課（カナ）			受注明細.納入者部課（現地語）
	 */
	public static InptData getGrp2DeliInputData() {

		InptData inptData = new InptData();
		inptData.setGrp("2");
		inptData.setNtvDeliAttention(ntvDeliAttention);
		inptData.setNtvDeliDept(ntvDeliDept);

		return inptData;
	}

	public static OutptData getGrpNot2DeliOutData() {

		OutptData outptData = new OutptData();
		outptData.setCustDeliAttentionKanaJp(ntvDeliAttention);
		outptData.setCustDeliDeptKanaJp(ntvDeliDept);

		return outptData;
	}

	/**
	 * 受注明細.グループが"2"、受注明細.直送先＝受注明細.得意先
	 * 得意先担当者（カナ）			受注明細.納入者氏名（現地語）
	 * 得意先部課（カナ）			受注明細.納入者部課（現地語）
	 */
	public static InptData getGrp2ntvDeliInputData() {

		InptData inptData = new InptData();
		inptData.setGrp("2");
		inptData.setShipToCd(shipToCd);
		inptData.setCustCd(shipToCd);
		setGrpWithDeli(inptData);

		return inptData;
	}

	public static OutptData getGrpNot2ntvDelOutData() {

		OutptData outptData = new OutptData();
		outptData.setCustDeliAttentionKanaJp(ntvDeliDept);
		outptData.setCustDeliDeptKanaJp(ntvDeliAttention);

		return outptData;
	}

	/**
	 * 受注明細.グループが"2"、受注明細.直送先コードが存在する、 かつ受注明細.直送先≠受注明細.得意先
	 * 得意先担当者（カナ）			受注明細.注文者氏名（現地語）
	 * 得意先部課（カナ）			受注明細.注文者部課（現地語）
	 */
	public static InptData getGrp2ntvDeliNotEuqalInputData() {

		InptData inptData = new InptData();
		inptData.setGrp("2");
		inptData.setShipToCd(shipToCd);
		inptData.setCustCd(custCd);
		inptData.setNtvCustAttention(ntvCustAttention);
		inptData.setNtvCustDept(ntvCustDept);

		return inptData;
	}

	public static OutptData getGrpNot2ntvDelNotEuqalOutData() {

		OutptData outptData = new OutptData();
		outptData.setCustDeliAttentionKanaJp(ntvCustAttention);
		outptData.setCustDeliDeptKanaJp(ntvCustDept);

		return outptData;
	}

	/**
	 * 上記以外の場合
	 * 得意先担当者（カナ）			ブランク
	 * 得意先部課（カナ）			ブランク
	 */
	public static InptData getGrp3inptData() {

		InptData inptData = new InptData();
		inptData.setGrp("3");

		return inptData;
	}

	public static OutptData getGrp3OutData() {

		OutptData outptData = new OutptData();
		outptData.setCustDeliAttentionKanaJp(BLANK);
		outptData.setCustDeliDeptKanaJp(BLANK);

		return outptData;
	}

	/**
	 * 上記取得した【売掛先国名】に半角スペースしか存在しない	現法名２			上記取得した【得意先名称（現地語）】
	 * @return
	 */
	public static OutptData getBillToCountryNameOutData() {
		OutptData outptData = new OutptData();
		outptData.setBillToCountryName(billToCountryName);
		outptData.setCustName_2Jp(SPACE);
		return outptData;
	}

	private static void setGrpWithDeli(InptData inptData) {
		// 受注明細.グループが"2"でないの場合、受注明細.納入者部課（現地語）
		inptData.setNtvDeliDept(ntvDeliDept);
		// 受注明細.グループが"2"でないの場合、受注明細.納入者氏名（現地語）
		inptData.setNtvDeliAttention(ntvDeliAttention);
	}
}
