package jp.co.sysevo.model;

import org.springframework.stereotype.Component;
import java.util.Date;

@Component("inptData")
public class InptData {

	/** オンデマンド用出荷テーブル.COMET紐付けSEQ */
	private String cometSeq;
	/** 受注明細.現法コード */
	private String subsidiaryCd;
	/** 受注明細.MCコード */
	private String mcCd;
	/** 受注明細.得意先コード */
	private String custCd;
	/** 受注明細.得意先現法コード */
	private String custsubSubsidiaryCd;
	/** 受注明細.得意先国コード */
	private String custCountryCd;
	/** 受注明細.仕入先コード */
	private String supplierCd;
	/** 受注明細.置場区分 */
	private String mcPlantDiv;
	/** 受注明細.直送先コード */
	private String shipToCd;
	/** 受注明細.直送先国コード */
	private String shipToCountryCd;
	/** 受注明細.VRD */
	private Date vrd;
	/** 受注明細.VSD */
	private Date vsd;
	/** 受注明細.CRD */
	private Date crd;
	/** 受注明細.親注番桁数 */
	private int custRefLength;
	/** 受注明細.注文番号(親)(明細) */
	private String custRef;
	/** 受注明細.注文番号（子） */
	private String custSubRef;
	/** 受注明細.グローバル番号 */
	private String globalNo;
	/** 受注明細.商品コード */
	private String productCd;
	/** 受注明細.インナーコード */
	private String innerCd;
	/** 受注明細.商品種別 */
	private String productAssort;
	/** 受注明細.受注数量 */
	private int soQty;
	/** 受注明細.仕入単価 */
	private int purchaseUnitPrice;
	/** 受注明細.税抜き売単価 */
	private int excludeTaxSUPrice;
	/** 受注明細.置場区分 */
	private String plantDiv;
	/** 受注明細.納入区分 */
	private String deliDiv;
	/** 受注明細.指定伝票区分 */
	private String specifyVoucherDiv;
	/** 受注明細.現品添付票区分 */
	private String moveTicketDiv;
	/** 受注明細.梱包ランク */
	private String packingRank;
	/** 受注明細.納入担当者コード */
	private String deliAttentionCd;
	/** 受注明細.納入者部課（現地語） */
	private String ntvDeliDept;
	/** 受注明細.納入者氏名（現地語） */
	private String ntvDeliAttention;
	/** 受注明細.注文者部課（現地語） */
	private String ntvCustDept;
	/** 受注明細.ブランドコード */
	private String brandCd;
	/** 受注明細.得意先現法置場 */
	private String custsubMcPlantCd;
	/** 受注明細.支払条件 */
	private String paymentTerms;
	/** 受注明細.インコタームズ */
	private String incoterms;
	/** 受注明細.決済形態 */
	private String settlementMethod;
	/** 受注明細.伝票区分 */
	private String voucherDiv;
	/** 受注明細.得意先現法得意先コード */
	private String custsubCustCd;
	/** 受注明細.得意先現法直送先コード */
	private String custsubShipToCd;
	/** 受注明細.得受注伝票番号 */
	private String originalSoVoucherNo;
	/** 受注明細.受注日 */
	private Date soDate;
	/** 受注明細.商品重量 */
	private int weight;
	/** 受注明細.商品重量単位 */
	private String weightUnit;
	/** 受注明細.原産国コード */
	private String countryOfOrigin;
	/** 受注明細.売単価通貨コード */
	private String sUnitPriceCcyCd;
	/** 受注明細.仕入単価通貨コード */
	private String pUnitPriceCcyCd;
	/** 受注明細.輸送手段 */
	private String transportMeans;
	/** 受注明細.危険品フラグ */
	private String hazardFlg;
	/** 受注明細.直送フラグ */
	private String directShipFlg;
	/** 受注明細.得意先カテゴリコード */
	private String custCategoryCd;
	/** 受注明細.税込み売単価 */
	private int includeTaxSUPrice;
	/** 受注明細.その他値引額 */
	private int otherDsctAmount;
	/** 受注明細.グループ */
	private String grp;
	/** 受注明細.備考(自動車規格コード) */
	private String automobileStandardCd;
	/** 受注明細.ストーク料金適用区分 */
	private String storkChargeApplyDiv;
	/** 受注明細.納品書番号 */
	private String deliNoteNo;
	/** 受注明細.注文者氏名（現地語） */
	private String ntvCustAttention;
	/** 受注ヘッダ.ヘッダー注文番号 */
	private String headerRef;
	/** 受注ヘッダ.配送業者顧客番号 */
	private String carrierAcctNo;
	/** 部材品受注内訳ファイル.子ＳＥＱ */
	private int childSeq;
	/** 発注テーブル.バーコード用グローバル番号 */
	private String barcodeGlobalNo;
	/** 発注テーブル.Supplier Invoice No */
	private String supplierInvNo;
	/** タイプコードマスタ.分析コード */
	private String classifyCd;
	/** 製品分類マスタ.分析コード名（現地語) */
	private String ntvClassifyCdName;
	/** 製品分類マスタ.分析コード名 */
	private String classifyCdName;
	/** ブランドマスタ.ブランド名称（英語） */
	private String brandName;
	/** ブランドマスタ.ブランド名（現地語） */
	private String ntvBrandName;
	/** 商品コード用ブランド名.商品コード用名称 */
	private String brandNameForProductCd;
	/** 仕入先マスタ.企業名（現地語） */
	private String ntv1CompanyName;
	/** 仕入先マスタ.企業名 */
	private String companyName;
	/** 仕入先マスタ.国コード */
	private String companyCountryCd;
	/** 商品マスタ.商品コード */
	private String productCdMst;
	/** 商品マスタ.発注入り数 */
	private int poQtyPerCase;
	/** 商品マスタ.ＨＳコード */
	private String hsCd;
	/** 商品マスタ.商品名（英語） */
	private String productName;
	/** 商品マスタ.商品名（現地語） */
	private String ntvProductName;
	/** 商品マスタ.数量単位 */
	private String unitOfMeasure;
	/** 国マスタ.国名称 */
	private String countryName;
	/** 国マスタ.国名称（日本語） */
	private String ntvCountryName;
	/** 国マスタ.ＵＰＳ国コード */
	private String upsCountryCd;
	/** 得意先マスタ.MC指定伝票区分 */
	private String mcSpecifyVoucherDiv;
	/** 得意先マスタ.納品書送付フラグ */
	private String deliNoteSendFlg;
	/** 得意先マスタ.運賃エリアコード */
	private String frtAreaCd;
	/** 得意先マスタ.ＣｏｍｍｅｒｃｉａｌＩｎｖｏｉｃｅフラグ */
	private String comInvFlg;
	/** 得意先マスタ.ＣｏｍＩｎｖ出力枚数（オリジナル） */
	private int comInvPrintNumOrgn;
	/** 得意先マスタ.ＣｏｍＩｎｖ出力枚数（控え） */
	private int comInvPrintNumCopy;
	/** 得意先マスタ.ＣｏｍｍｅｒｃｉａｌＩｎｖｏｉｃｅ保存フラグ */
	private String comInvRetainFlg;
	/** 得意先マスタ.ＤｅｌｉｖｅｒｙＯｒｄｅｒフラグ */
	private String deliOrderFlg;
	/** 得意先マスタ.ＤｅｌｉＯｒｄｅｒ出力枚数（オリジナル） */
	private int deliOrderPrintNumOrgn;
	/** 得意先マスタ.ＤｅｌｉＯｒｄｅｒ出力枚数（控え） */
	private int deliInvPrintNumCopy;
	/** 得意先マスタ.ＤｅｌｉｖｅｒｙＯｒｄｅｒ保存フラグ */
	private String deliOrderRetainFlg;
	/** 得意先マスタ.ＰａｃｋｉｎｇＬｉｓｔフラグ */
	private String packListFlg;
	/** 得意先マスタ.ＰａｃｋＬｉｓｔ出力枚数（オリジナル） */
	private int packListPrintNumOrgn;
	/** 得意先マスタ.ＰａｃｋＬｉｓｔ出力枚数（控え） */
	private int packListPrintNumCopy;
	/** 得意先マスタ.ＰａｃｋｉｎｇＬｉｓｔ保存フラグ */
	private String packListRetainFlg;
	/** 得意先マスタ.INV_PACK_FLG */
	private String invPackFlg;
	/** 得意先マスタ.Ｉｎｖ＆Ｐａｃｋ出力枚数（オリジナル） */
	private int invPackPrintNumOrgn;
	/** 得意先マスタ.Ｉｎｖ＆Ｐａｃｋ出力枚数（控え） */
	private int invPackPrintNumCopy;
	/** 得意先マスタ.Ｉｎｖ＆Ｐａｃｋ保存フラグ */
	private String invPackRetainFlg;
	/** 得意先マスタ.エコール得意先コード */
	private String ecalCustCd;
	/** 得意先マスタ.得意先名（現地語１） */
	private String ntvCustName1;
	/** 得意先マスタ.得意先名（英字） */
	private String custName;
	/** 得意先マスタ.得意先名（現地語２） */
	private String ntvCustName2;
	/** 得意先マスタ.住所１（現地語） */
	private String custNtvAddress_1;
	/** 得意先マスタ.住所１（カナ／英字） */
	private String custHalfwidthAddress_1;
	/** 得意先マスタ.住所２（現地語） */
	private String custNtvAddress_2;
	/** 得意先マスタ.住所２（カナ／英字） */
	private String custHalfwidthAddress_2;
	/** 得意先マスタ.住所３（現地語） */
	private String custNtvAddress_3;
	/** 得意先マスタ.住所３（カナ／英字 */
	private String custHalfwidthAddress_3;
	/** 得意先マスタ.住所４（現地語） */
	private String custNtvAddress_4;
	/** 得意先マスタ.住所４（カナ／英字)  */
	private String custHalfwidthAddress_4;
	/** 得意先マスタ.国コード */
	private String custCountryCdMst;
	/** 得意先マスタ.都市名 */
	private String custCityName;
	/** 得意先マスタ.電話番号 */
	private String custTel;
	/** 得意先マスタ.ＦＡＸ番号 */
	private String custFax;
	/** 得意先マスタ.事務指示１侮ｦフラグ */
	private String businessinstruct1ShowFlg;
	/** 得意先マスタ.事務指示１（現地語可） */
	private String ntvBusinessinstruct1;
	/** 得意先マスタ.事務指示２侮ｦフラグ */
	private String businessinstruct2ShowFlg;
	/** 得意先マスタ.事務指示２（現地語可） */
	private String ntvBusinessinstruct2;
	/** 得意先マスタ.梱包指示１侮ｦフラグ */
	private String packingInstruct1ShowFlg;
	/** 得意先マスタ.梱包指示１（現地語可） */
	private String ntvPackingInstruct1;
	/** 得意先マスタ.梱包指示２侮ｦフラグ */
	private String packingInstruct2ShowFlg;
	/** 得意先マスタ.梱包指示２（現地語可） */
	private String ntvPackingInstruct2;
	/** 得意先マスタ.事業所ライセンス番号 */
	private String custOfficeLicenseNo;
	/** 得意先マスタ.売掛先コード */
	private String billToCd;
	/** 得意先マスタ.商品総称フラグ */
	private String productGenericNameFlg;
	/** 得意先マスタ.税金エリアコード */
	private String taxAreaCd;
	/** 得意先マスタ.非課税フラグ */
	private String taxFreeFlg;
	/** 得意先マスタ.原産国名侮ｦフラグ */
	private String countryOfOrignShowFlg;
	/** 得意先マスタ.特別カスタマーBOX番号 */
	private String specialCustBoxNo;
	/** 得意先マスタ.特別カスタマーＢＯＸグループ */
	private String specialCustBoxGrp;
	/** 得意先マスタ.値引侮ｦフラグ */
	private String discountShowFlg;
	/** 得意先マスタ.HSコード侮ｦフラグ */
	private String hsCdShowFlg;
	/** 得意先マスタ.NetWeight侮ｦフラグ */
	private String netWeightShowFlg;
	/** 得意先マスタ.セルコード */
	private String cellCd;
	/** 得意先マスタ.メールアドレス */
	private String mailAddress;
	/** 得意先マスタ.納品書フラグ */
	private String packingFlg;
	/** 得意先マスタ.納品書出力枚数（オリジナル） */
	private int packingPrintNumOrgn;
	/** 得意先マスタ.納品書出力枚数（控え） */
	private int packingPrintNumCopy;
	/** 得意先マスタ.納品書保存フラグ */
	private String packingRetainFlg;
	/** 得意先マスタ.英文納品書出力枚数（オリジナル） */
	private int engPackingPrintNumOrgn;
	/** 得意先マスタ.英文納品書出力枚数（控え） */
	private int engPackingPrintNumCopy;
	/** 得意先マスタ.英文納品書保存フラグ */
	private String engPackingRetainFlg;
	/** 得意先マスタ.仮納品書出力枚数（オリジナル） */
	private int tmpPackingPrintNumOrgn;
	/** 得意先マスタ.仮納品書出力枚数（控え） */
	private int tmpPackingPrintNumCopy;
	/** 得意先マスタ.仮納品書保存フラグ */
	private String tmpPackingRetainFlg;
	/** 得意先マスタ.請求書フラグ */
	private String invoiceFlg;
	/** 得意先マスタ.請求書出力枚数（オリジナル） */
	private int invoicePrintNumOrgn;
	/** 得意先マスタ.請求書出力枚数（控え）） */
	private int invoicePrintNumCopy;
	/** 得意先マスタ.請求書保存フラグ */
	private String invoiceRetainFlg;
	/** 得意先マスタ.運賃値引フラグ */
	private String frtDiscountFlg;
	/** 得意先マスタ.市町村コード */
	private String custCityCd;
	/** 売掛先マスタ.売掛先名（現地語） */
	private String ntvBillToName;
	/** 売掛先マスタ.売掛先名 */
	private String billToName;
	/** 売掛先マスタ.住所１（現地語） */
	private String billToNtvAddress_1;
	/** 売掛先マスタ.住所１（カナ／英字） */
	private String billToHalfwidthAddress_1;
	/** 売掛先マスタ.住所２（現地語） */
	private String billToNtvAddress_2;
	/** 売掛先マスタ.住所２（カナ／英字） */
	private String billToHalfwidthAddress_2;
	/** 売掛先マスタ.住所３（現地語） */
	private String billToNtvAddress_3;
	/** 売掛先マスタ.住所３（カナ／英字） */
	private String billToHalfwidthAddress_3;
	/** 売掛先マスタ.住所４（現地語） */
	private String billToNtvAddress_4;
	/** 売掛先マスタ.住所４（カナ／英字） */
	private String billToHalfwidthAddress_4;
	/** 売掛先マスタ.電話番号 */
	private String billToTel;
	/** 売掛先マスタ.売掛先ＦＡＸ番号 */
	private String faxBillTo;
	/** 売掛先マスタ.請求担当者（現地語） */
	private String ntvBillToPerson;
	/** 売掛先マスタ.売掛注釈１（現地語可） */
	private String ntvReceivableRemarks_1;
	/** 売掛先マスタ.売掛注釈２（現地語可） */
	private String ntvReceivableRemarks_2;
	/** 売掛先マスタ.統一発票タイプ */
	private String uniformInvType;
	/** 売掛先マスタ.売掛金締め単位 */
	private String arCloseUnit;
	/** 売掛先マスタ.売掛金締日 */
	private int arClosingDay;
	/** 売掛先マスタ.サービス停止区分 */
	private String serviceStopDiv;
	/** 売掛先マスタ.内税外税区分 */
	private String taxInExDiv;
	/** 売掛先マスタ.請求部課名（現地語） */
	private String ntvBillToDept;
	/** 売掛先マスタ.郵便番号 */
	private String billToPostalCd;
	/** 売掛先マスタ.国コード */
	private String billToCountryCd;
	/** 売掛先マスタ.売掛QCT拠点コード */
	private String billToReceivableMcCd;
	/** 現法マスタ.電話番号 */
	private String tel;
	/** 現法マスタ.ＦＡＸ番号 */
	private String fax;
	/** 現法マスタ.郵便番号 */
	private String postalCd;
	/** 現法マスタ.国コード */
	private String countryCd;
	/** 現法マスタ.現地法人名称 */
	private String subsidiaryName;
	/** 現法マスタ.現地法人名称（現地語） */
	private String ntvSubsidiaryName;
	/** 現法マスタ.住所１ */
	private String address_1;
	/** 現法マスタ.住所２ */
	private String address_2;
	/** 現法マスタ.住所３ */
	private String address_3;
	/** 現法マスタ.住所４ */
	private String address_4;
	/** 現法マスタ.住所１（現地語) */
	private String ntvAddress_1;
	/** 現法マスタ.住所２（現地語) */
	private String ntvAddress_2;
	/** 現法マスタ.住所３（現地語) */
	private String ntvAddress_3;
	/** 現法マスタ.住所４（現地語) */
	private String ntvAddress_4;
	/** 現法マスタ.ライセンス番号 */
	private String licenceNo;
	/** 現法マスタ.税登録番号 */
	private String vatRegistrationNumber;
	/** 直送先マスタ.仮伝区分 */
	private String shipToTempVoucherDiv;
	/** 直送先マスタ.運賃エリアコード */
	private String shipToFrtAreaCd;
	/** 直送先マスタ.直送先名（現地語１） */
	private String ntvShipToName1;
	/** 直送先マスタ.直送先名（英字） */
	private String shipToName;
	/** 直送先マスタ.住所１（現地語） */
	private String shipToNtvAddress_1;
	/** 直送先マスタ.住所１（カナ／英字） */
	private String shipToHalfwidthAddress_1;
	/** 直送先マスタ.住所２（現地語） */
	private String shipToNtvAddress_2;
	/** 直送先マスタ.住所２（カナ／英字） */
	private String shipToHalfwidthAddress_2;
	/** 直送先マスタ.住所３（現地語） */
	private String shipToNtvAddress_3;
	/** 直送先マスタ.住所３（カナ／英字） */
	private String shipToHalfwidthAddress_3;
	/** 直送先マスタ.住所４（現地語） */
	private String shipToNtvAddress_4;
	/** 直送先マスタ.住所４（カナ／英字） */
	private String shipToHalfwidthAddress_4;
	/** 直送先マスタ.郵便番号 */
	private String shipToPostalCd;
	/** 直送先マスタ.国コード */
	private String shipToCountryCdMst;
	/** 直送先マスタ.都市名 */
	private String shipToCityName;
	/** 直送先マスタ.電話番号 */
	private String shipToTel;
	/** 直送先マスタ.ＦＡＸ番号 */
	private String shipToFax;
	/** 直送先マスタ.メールアドレス */
	private String shipToMailAddress;
	/** 直送先マスタ.直送先名（現地語２） */
	private String shipToNtvShipToName2;
	/** 直送先マスタ.納入者氏名（カナ／英字） */
	private String shipToDeliAttention;
	/** 直送先マスタ.納入者部課（カナ／英字） */
	private String shipToDeliDept;
	/** 直送先マスタ.市町村コード */
	private String shipToCityCd;
	/** 実配送扱い便マスタ.扱い便区分 */
	private String shippingDestinationCd;
	/** MC_置場マスタ.ＭＣ／置場名称（現地語） */
	private String ntvMcPlantName;
	/** 部門マスタ.部門名 */
	private String deptName;
	/** 部門マスタ.住所１ */
	private String deptAddress_1;
	/** 部門マスタ.住所２ */
	private String deptAddress_2;
	/** 部門マスタ.住所３ */
	private String deptAddress_3;
	/** 部門マスタ.住所４ */
	private String deptAddress_4;
	/** 部門マスタ.郵便番号 */
	private String deptPostalCd;
	/** 部門マスタ.電話番号 */
	private String deptTel;
	/** 部門マスタ.ＦＡＸ番号 */
	private String deptFax;
	/** 部門マスタ（B）.部門名略称（現地語） */
	private String deptNtvDeptNameAbb;
	/** 輸出管理マスタ.受注メッセージコード */
	private String orderMsgCd;
	/** 得意先直送先物流.梱包指示テキスト(現地語)1 */
	private String ntvPackingInstruct1J;
	/** 得意先直送先物流.梱包指示テキスト(現地語)2 */
	private String ntvPackingInstruct2J;
	/** 得意先直送先物流.梱包指示テキスト(現地語)3 */
	private String ntvPackingInstruct3J;
	/** 得意先直送先物流.梱包指示テキスト(現地語)4 */
	private String ntvPackingInstruct4J;
	/** 得意先直送先物流.梱包指示テキスト(現地語)5 */
	private String ntvPackingInstruct5J;
	/** 得意先直送先物流.事務指示テキスト(現地語)1  */
	private String ntvBusinessInstruct1J;
	/** 得意先直送先物流.事務指示テキスト(現地語)2  */
	private String ntvBusinessInstruct2J;
	/** 得意先直送先物流.事務指示テキスト(現地語)3  */
	private String ntvBusinessInstruct3J;
	/** 得意先直送先物流.事務指示テキスト(現地語)4  */
	private String ntvBusinessInstruct4J;
	/** 得意先直送先物流.事務指示テキスト(現地語)5 : */
	private String ntvBusinessInstruct5J;
	/** 得意先直送先物流.ラベル早出し区分 */
	private String labelEarlyDiv;
	/** 子発注SEQ */
	private String subPoSeq;
	/** オンデマンド用出荷テーブル.データ区分 */
	private String dataDiv;
	/** 納入担当部課コード */
	private String deliDeptKana;
	/** 扱い便配送エリアマスタ.配送業者名 */
	private String carrierName;
	/** 扱い便配送エリアマスタ.配送業者名略称 */
	private String carrierNameKana;

	public InptData() {

	}

	/** オンデマンド用出荷テーブル.COMET紐付けSEQ */
	public String getCometSeq() {
		return cometSeq;
	}

	/** オンデマンド用出荷テーブル.COMET紐付けSEQ */
	public void setCometSeq(String cometSeq) {
		this.cometSeq = cometSeq;
	}

	/** 受注明細.現法コード */
	public String getSubsidiaryCd() {
		return subsidiaryCd;
	}

	/** 受注明細.現法コード */
	public void setSubsidiaryCd(String subsidiaryCd) {
		this.subsidiaryCd = subsidiaryCd;
	}

	/** 受注明細.MCコード */
	public String getMcCd() {
		return mcCd;
	}

	/** 受注明細.MCコード */
	public void setMcCd(String mcCd) {
		this.mcCd = mcCd;
	}

	/** 受注明細.得意先コード */
	public String getCustCd() {
		return custCd;
	}

	/** 受注明細.得意先コード */
	public void setCustCd(String custCd) {
		this.custCd = custCd;
	}

	/** 受注明細.得意先現法コード */
	public String getCustsubSubsidiaryCd() {
		return custsubSubsidiaryCd;
	}

	/** 受注明細.得意先現法コード */
	public void setCustsubSubsidiaryCd(String custsubSubsidiaryCd) {
		this.custsubSubsidiaryCd = custsubSubsidiaryCd;
	}

	/** 受注明細.得意先国コード */
	public String getCustCountryCd() {
		return custCountryCd;
	}

	/** 受注明細.得意先国コード */
	public void setCustCountryCd(String custCountryCd) {
		this.custCountryCd = custCountryCd;
	}

	/** 受注明細.仕入先コード */
	public String getSupplierCd() {
		return supplierCd;
	}

	/** 受注明細.仕入先コード */
	public void setSupplierCd(String supplierCd) {
		this.supplierCd = supplierCd;
	}

	/** 受注明細.置場区分 */
	public String getMcPlantDiv() {
		return mcPlantDiv;
	}

	/** 受注明細.置場区分 */
	public void setMcPlantDiv(String mcPlantDiv) {
		this.mcPlantDiv = mcPlantDiv;
	}

	/** 受注明細.直送先コード */
	public String getShipToCd() {
		return shipToCd;
	}

	/** 受注明細.直送先コード */
	public void setShipToCd(String shipToCd) {
		this.shipToCd = shipToCd;
	}

	/** 受注明細.直送先国コード */
	public String getShipToCountryCd() {
		return shipToCountryCd;
	}

	/** 受注明細.直送先国コード */
	public void setShipToCountryCd(String shipToCountryCd) {
		this.shipToCountryCd = shipToCountryCd;
	}

	/** 受注明細.VRD */
	public Date getVrd() {
		return vrd;
	}

	/** 受注明細.VRD */
	public void setVrd(Date vrd) {
		this.vrd = vrd;
	}

	/** 受注明細.VSD */
	public Date getVsd() {
		return vsd;
	}

	/** 受注明細.VSD */
	public void setVsd(Date vsd) {
		this.vsd = vsd;
	}

	/** 受注明細.CRD */
	public Date getCrd() {
		return crd;
	}

	/** 受注明細.CRD */
	public void setCrd(Date crd) {
		this.crd = crd;
	}

	/** 受注明細.親注番桁数 */
	public int getCustRefLength() {
		return custRefLength;
	}

	/** 受注明細.親注番桁数 */
	public void setCustRefLength(int custRefLength) {
		this.custRefLength = custRefLength;
	}

	/** 受注明細.注文番号(親)(明細) */
	public String getCustRef() {
		return custRef;
	}

	/** 受注明細.注文番号(親)(明細) */
	public void setCustRef(String custRef) {
		this.custRef = custRef;
	}

	/** 受注明細.注文番号（子） */
	public String getCustSubRef() {
		return custSubRef;
	}

	/** 受注明細.注文番号（子） */
	public void setCustSubRef(String custSubRef) {
		this.custSubRef = custSubRef;
	}

	/** 受注明細.グローバル番号 */
	public String getGlobalNo() {
		return globalNo;
	}

	/** 受注明細.グローバル番号 */
	public void setGlobalNo(String globalNo) {
		this.globalNo = globalNo;
	}

	/** 受注明細.商品コード */
	public String getProductCd() {
		return productCd;
	}

	/** 受注明細.商品コード */
	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	/** 受注明細.インナーコード */
	public String getInnerCd() {
		return innerCd;
	}

	/** 受注明細.インナーコード */
	public void setInnerCd(String innerCd) {
		this.innerCd = innerCd;
	}

	/** 受注明細.商品種別 */
	public String getProductAssort() {
		return productAssort;
	}

	/** 受注明細.商品種別 */
	public void setProductAssort(String productAssort) {
		this.productAssort = productAssort;
	}

	/** 受注明細.受注数量 */
	public int getSoQty() {
		return soQty;
	}

	/** 受注明細.受注数量 */
	public void setSoQty(int soQty) {
		this.soQty = soQty;
	}

	/** 受注明細.仕入単価 */
	public int getPurchaseUnitPrice() {
		return purchaseUnitPrice;
	}

	/** 受注明細.仕入単価 */
	public void setPurchaseUnitPrice(int purchaseUnitPrice) {
		this.purchaseUnitPrice = purchaseUnitPrice;
	}

	/** 受注明細.税抜き売単価 */
	public int getExcludeTaxSUPrice() {
		return excludeTaxSUPrice;
	}

	/** 受注明細.税抜き売単価 */
	public void setExcludeTaxSUPrice(int excludeTaxSUPrice) {
		this.excludeTaxSUPrice = excludeTaxSUPrice;
	}

	/** 受注明細.置場区分 */
	public String getPlantDiv() {
		return plantDiv;
	}

	/** 受注明細.置場区分 */
	public void setPlantDiv(String plantDiv) {
		this.plantDiv = plantDiv;
	}

	/** 受注明細.納入区分 */
	public String getDeliDiv() {
		return deliDiv;
	}

	/** 受注明細.納入区分 */
	public void setDeliDiv(String deliDiv) {
		this.deliDiv = deliDiv;
	}

	/** 受注明細.指定伝票区分 */
	public String getSpecifyVoucherDiv() {
		return specifyVoucherDiv;
	}

	/** 受注明細.指定伝票区分 */
	public void setSpecifyVoucherDiv(String specifyVoucherDiv) {
		this.specifyVoucherDiv = specifyVoucherDiv;
	}

	/** 受注明細.現品添付票区分 */
	public String getMoveTicketDiv() {
		return moveTicketDiv;
	}

	/** 受注明細.現品添付票区分 */
	public void setMoveTicketDiv(String moveTicketDiv) {
		this.moveTicketDiv = moveTicketDiv;
	}

	/** 受注明細.梱包ランク */
	public String getPackingRank() {
		return packingRank;
	}

	/** 受注明細.梱包ランク */
	public void setPackingRank(String packingRank) {
		this.packingRank = packingRank;
	}

	/** 受注明細.納入担当者コード */
	public String getDeliAttentionCd() {
		return deliAttentionCd;
	}

	/** 受注明細.納入担当者コード */
	public void setDeliAttentionCd(String deliAttentionCd) {
		this.deliAttentionCd = deliAttentionCd;
	}

	/** 受注明細.納入者部課（現地語） */
	public String getNtvDeliDept() {
		return ntvDeliDept;
	}

	/** 受注明細.納入者部課（現地語） */
	public void setNtvDeliDept(String ntvDeliDept) {
		this.ntvDeliDept = ntvDeliDept;
	}

	/** 受注明細.納入者氏名（現地語） */
	public String getNtvDeliAttention() {
		return ntvDeliAttention;
	}

	/** 受注明細.納入者氏名（現地語） */
	public void setNtvDeliAttention(String ntvDeliAttention) {
		this.ntvDeliAttention = ntvDeliAttention;
	}

	/** 受注明細.注文者部課（現地語） */
	public String getNtvCustDept() {
		return ntvCustDept;
	}

	/** 受注明細.注文者部課（現地語） */
	public void setNtvCustDept(String ntvCustDept) {
		this.ntvCustDept = ntvCustDept;
	}

	/** 受注明細.ブランドコード */
	public String getBrandCd() {
		return brandCd;
	}

	/** 受注明細.ブランドコード */
	public void setBrandCd(String brandCd) {
		this.brandCd = brandCd;
	}

	/** 受注明細.得意先現法置場 */
	public String getCustsubMcPlantCd() {
		return custsubMcPlantCd;
	}

	/** 受注明細.得意先現法置場 */
	public void setCustsubMcPlantCd(String custsubMcPlantCd) {
		this.custsubMcPlantCd = custsubMcPlantCd;
	}

	/** 受注明細.支払条件 */
	public String getPaymentTerms() {
		return paymentTerms;
	}

	/** 受注明細.支払条件 */
	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	/** 受注明細.インコタームズ */
	public String getIncoterms() {
		return incoterms;
	}

	/** 受注明細.インコタームズ */
	public void setIncoterms(String incoterms) {
		this.incoterms = incoterms;
	}

	/** 受注明細.決済形態 */
	public String getSettlementMethod() {
		return settlementMethod;
	}

	/** 受注明細.決済形態 */
	public void setSettlementMethod(String settlementMethod) {
		this.settlementMethod = settlementMethod;
	}

	/** 受注明細.伝票区分 */
	public String getVoucherDiv() {
		return voucherDiv;
	}

	/** 受注明細.伝票区分 */
	public void setVoucherDiv(String voucherDiv) {
		this.voucherDiv = voucherDiv;
	}

	/** 受注明細.得意先現法得意先コード */
	public String getCustsubCustCd() {
		return custsubCustCd;
	}

	/** 受注明細.得意先現法得意先コード */
	public void setCustsubCustCd(String custsubCustCd) {
		this.custsubCustCd = custsubCustCd;
	}

	/** 受注明細.得意先現法直送先コード */
	public String getCustsubShipToCd() {
		return custsubShipToCd;
	}

	/** 受注明細.得意先現法直送先コード */
	public void setCustsubShipToCd(String custsubShipToCd) {
		this.custsubShipToCd = custsubShipToCd;
	}

	/** 受注明細.得受注伝票番号 */
	public String getOriginalSoVoucherNo() {
		return originalSoVoucherNo;
	}

	/** 受注明細.得受注伝票番号 */
	public void setOriginalSoVoucherNo(String originalSoVoucherNo) {
		this.originalSoVoucherNo = originalSoVoucherNo;
	}

	/** 受注明細.受注日 */
	public Date getSoDate() {
		return soDate;
	}

	/** 受注明細.受注日 */
	public void setSoDate(Date soDate) {
		this.soDate = soDate;
	}

	/** 受注明細.商品重量 */
	public int getWeight() {
		return weight;
	}

	/** 受注明細.商品重量 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/** 受注明細.商品重量単位 */
	public String getWeightUnit() {
		return weightUnit;
	}

	/** 受注明細.商品重量単位 */
	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

	/** 受注明細.原産国コード */
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	/** 受注明細.原産国コード */
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	/** 受注明細.売単価通貨コード */
	public String getsUnitPriceCcyCd() {
		return sUnitPriceCcyCd;
	}

	/** 受注明細.売単価通貨コード */
	public void setsUnitPriceCcyCd(String sUnitPriceCcyCd) {
		this.sUnitPriceCcyCd = sUnitPriceCcyCd;
	}

	/** 受注明細.仕入単価通貨コード */
	public String getpUnitPriceCcyCd() {
		return pUnitPriceCcyCd;
	}

	/** 受注明細.仕入単価通貨コード */
	public void setpUnitPriceCcyCd(String pUnitPriceCcyCd) {
		this.pUnitPriceCcyCd = pUnitPriceCcyCd;
	}

	/** 受注明細.輸送手段 */
	public String getTransportMeans() {
		return transportMeans;
	}

	/** 受注明細.輸送手段 */
	public void setTransportMeans(String transportMeans) {
		this.transportMeans = transportMeans;
	}

	/** 受注明細.危険品フラグ */
	public String getHazardFlg() {
		return hazardFlg;
	}

	/** 受注明細.危険品フラグ */
	public void setHazardFlg(String hazardFlg) {
		this.hazardFlg = hazardFlg;
	}

	/** 受注明細.直送フラグ */
	public String getDirectShipFlg() {
		return directShipFlg;
	}

	/** 受注明細.直送フラグ */
	public void setDirectShipFlg(String directShipFlg) {
		this.directShipFlg = directShipFlg;
	}

	/** 受注明細.得意先カテゴリコード */
	public String getCustCategoryCd() {
		return custCategoryCd;
	}

	/** 受注明細.得意先カテゴリコード */
	public void setCustCategoryCd(String custCategoryCd) {
		this.custCategoryCd = custCategoryCd;
	}

	/** 受注明細.税込み売単価 */
	public int getIncludeTaxSUPrice() {
		return includeTaxSUPrice;
	}

	/** 受注明細.税込み売単価 */
	public void setIncludeTaxSUPrice(int includeTaxSUPrice) {
		this.includeTaxSUPrice = includeTaxSUPrice;
	}

	/** 受注明細.その他値引額 */
	public int getOtherDsctAmount() {
		return otherDsctAmount;
	}

	/** 受注明細.その他値引額 */
	public void setOtherDsctAmount(int otherDsctAmount) {
		this.otherDsctAmount = otherDsctAmount;
	}

	/** 受注明細.グループ */
	public String getGrp() {
		return grp;
	}

	/** 受注明細.グループ */
	public void setGrp(String grp) {
		this.grp = grp;
	}

	/** 受注明細.備考(自動車規格コード) */
	public String getAutomobileStandardCd() {
		return automobileStandardCd;
	}

	/** 受注明細.備考(自動車規格コード) */
	public void setAutomobileStandardCd(String automobileStandardCd) {
		this.automobileStandardCd = automobileStandardCd;
	}

	/** 受注明細.ストーク料金適用区分 */
	public String getStorkChargeApplyDiv() {
		return storkChargeApplyDiv;
	}

	/** 受注明細.ストーク料金適用区分 */
	public void setStorkChargeApplyDiv(String storkChargeApplyDiv) {
		this.storkChargeApplyDiv = storkChargeApplyDiv;
	}

	/** 受注明細.納品書番号 */
	public String getDeliNoteNo() {
		return deliNoteNo;
	}

	/** 受注明細.納品書番号 */
	public void setDeliNoteNo(String deliNoteNo) {
		this.deliNoteNo = deliNoteNo;
	}

	/** 受注明細.注文者氏名（現地語） */
	public String getNtvCustAttention() {
		return ntvCustAttention;
	}

	/** 受注明細.注文者氏名（現地語） */
	public void setNtvCustAttention(String ntvCustAttention) {
		this.ntvCustAttention = ntvCustAttention;
	}

	/** 受注ヘッダ.ヘッダー注文番号 */
	public String getHeaderRef() {
		return headerRef;
	}

	/** 受注ヘッダ.ヘッダー注文番号 */
	public void setHeaderRef(String headerRef) {
		this.headerRef = headerRef;
	}

	/** 受注ヘッダ.配送業者顧客番号 */
	public String getCarrierAcctNo() {
		return carrierAcctNo;
	}

	/** 受注ヘッダ.配送業者顧客番号 */
	public void setCarrierAcctNo(String carrierAcctNo) {
		this.carrierAcctNo = carrierAcctNo;
	}

	/** 部材品受注内訳ファイル.子ＳＥＱ */
	public int getChildSeq() {
		return childSeq;
	}

	/** 部材品受注内訳ファイル.子ＳＥＱ */
	public void setChildSeq(int childSeq) {
		this.childSeq = childSeq;
	}

	/** 発注テーブル.バーコード用グローバル番号 */
	public String getBarcodeGlobalNo() {
		return barcodeGlobalNo;
	}

	/** 発注テーブル.バーコード用グローバル番号 */
	public void setBarcodeGlobalNo(String barcodeGlobalNo) {
		this.barcodeGlobalNo = barcodeGlobalNo;
	}

	/** 発注テーブル.Supplier Invoice No */
	public String getSupplierInvNo() {
		return supplierInvNo;
	}

	/** 発注テーブル.Supplier Invoice No */
	public void setSupplierInvNo(String supplierInvNo) {
		this.supplierInvNo = supplierInvNo;
	}

	/** タイプコードマスタ.分析コード */
	public String getClassifyCd() {
		return classifyCd;
	}

	/** タイプコードマスタ.分析コード */
	public void setClassifyCd(String classifyCd) {
		this.classifyCd = classifyCd;
	}

	/** 製品分類マスタ.分析コード名（現地語) */
	public String getNtvClassifyCdName() {
		return ntvClassifyCdName;
	}

	/** 製品分類マスタ.分析コード名（現地語) */
	public void setNtvClassifyCdName(String ntvClassifyCdName) {
		this.ntvClassifyCdName = ntvClassifyCdName;
	}

	/** 製品分類マスタ.分析コード名 */
	public String getClassifyCdName() {
		return classifyCdName;
	}

	/** 製品分類マスタ.分析コード名 */
	public void setClassifyCdName(String classifyCdName) {
		this.classifyCdName = classifyCdName;
	}

	/** ブランドマスタ.ブランド名称（英語） */
	public String getBrandName() {
		return brandName;
	}

	/** ブランドマスタ.ブランド名称（英語） */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	/** ブランドマスタ.ブランド名（現地語） */
	public String getNtvBrandName() {
		return ntvBrandName;
	}

	/** ブランドマスタ.ブランド名（現地語） */
	public void setNtvBrandName(String ntvBrandName) {
		this.ntvBrandName = ntvBrandName;
	}

	/** 商品コード用ブランド名.商品コード用名称 */
	public String getBrandNameForProductCd() {
		return brandNameForProductCd;
	}

	/** 商品コード用ブランド名.商品コード用名称 */
	public void setBrandNameForProductCd(String brandNameForProductCd) {
		this.brandNameForProductCd = brandNameForProductCd;
	}

	/** 仕入先マスタ.企業名（現地語） */
	public String getNtv1CompanyName() {
		return ntv1CompanyName;
	}

	/** 仕入先マスタ.企業名（現地語） */
	public void setNtv1CompanyName(String ntv1CompanyName) {
		this.ntv1CompanyName = ntv1CompanyName;
	}

	/** 仕入先マスタ.企業名 */
	public String getCompanyName() {
		return companyName;
	}

	/** 仕入先マスタ.企業名 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/** 仕入先マスタ.国コード */
	public String getCompanyCountryCd() {
		return companyCountryCd;
	}

	/** 仕入先マスタ.国コード */
	public void setCompanyCountryCd(String companyCountryCd) {
		this.companyCountryCd = companyCountryCd;
	}

	/** 商品マスタ.商品コード */
	public String getProductCdMst() {
		return productCdMst;
	}

	/** 商品マスタ.商品コード */
	public void setProductCdMst(String productCdMst) {
		this.productCdMst = productCdMst;
	}

	/** 商品マスタ.発注入り数 */
	public int getPoQtyPerCase() {
		return poQtyPerCase;
	}

	/** 商品マスタ.発注入り数 */
	public void setPoQtyPerCase(int poQtyPerCase) {
		this.poQtyPerCase = poQtyPerCase;
	}

	/** 商品マスタ.ＨＳコード */
	public String getHsCd() {
		return hsCd;
	}

	/** 商品マスタ.ＨＳコード */
	public void setHsCd(String hsCd) {
		this.hsCd = hsCd;
	}

	/** 商品マスタ.商品名（英語） */
	public String getProductName() {
		return productName;
	}

	/** 商品マスタ.商品名（英語） */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/** 商品マスタ.商品名（現地語） */
	public String getNtvProductName() {
		return ntvProductName;
	}

	/** 商品マスタ.商品名（現地語） */
	public void setNtvProductName(String ntvProductName) {
		this.ntvProductName = ntvProductName;
	}

	/** 商品マスタ.数量単位 */
	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	/** 商品マスタ.数量単位 */
	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	/** 国マスタ.国名称 */
	public String getCountryName() {
		return countryName;
	}

	/** 国マスタ.国名称 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/** 国マスタ.国名称（日本語） */
	public String getNtvCountryName() {
		return ntvCountryName;
	}

	/** 国マスタ.国名称（日本語） */
	public void setNtvCountryName(String ntvCountryName) {
		this.ntvCountryName = ntvCountryName;
	}

	/** 国マスタ.ＵＰＳ国コード */
	public String getUpsCountryCd() {
		return upsCountryCd;
	}

	/** 国マスタ.ＵＰＳ国コード */
	public void setUpsCountryCd(String upsCountryCd) {
		this.upsCountryCd = upsCountryCd;
	}

	/** 得意先マスタ.MC指定伝票区分 */
	public String getMcSpecifyVoucherDiv() {
		return mcSpecifyVoucherDiv;
	}

	/** 得意先マスタ.MC指定伝票区分 */
	public void setMcSpecifyVoucherDiv(String mcSpecifyVoucherDiv) {
		this.mcSpecifyVoucherDiv = mcSpecifyVoucherDiv;
	}

	/** 得意先マスタ.納品書送付フラグ */
	public String getDeliNoteSendFlg() {
		return deliNoteSendFlg;
	}

	/** 得意先マスタ.納品書送付フラグ */
	public void setDeliNoteSendFlg(String deliNoteSendFlg) {
		this.deliNoteSendFlg = deliNoteSendFlg;
	}

	/** 得意先マスタ.運賃エリアコード */
	public String getFrtAreaCd() {
		return frtAreaCd;
	}

	/** 得意先マスタ.運賃エリアコード */
	public void setFrtAreaCd(String frtAreaCd) {
		this.frtAreaCd = frtAreaCd;
	}

	/** 得意先マスタ.ＣｏｍｍｅｒｃｉａｌＩｎｖｏｉｃｅフラグ */
	public String getComInvFlg() {
		return comInvFlg;
	}

	/** 得意先マスタ.ＣｏｍｍｅｒｃｉａｌＩｎｖｏｉｃｅフラグ */
	public void setComInvFlg(String comInvFlg) {
		this.comInvFlg = comInvFlg;
	}

	/** 得意先マスタ.ＣｏｍＩｎｖ出力枚数（オリジナル） */
	public int getComInvPrintNumOrgn() {
		return comInvPrintNumOrgn;
	}

	/** 得意先マスタ.ＣｏｍＩｎｖ出力枚数（オリジナル） */
	public void setComInvPrintNumOrgn(int comInvPrintNumOrgn) {
		this.comInvPrintNumOrgn = comInvPrintNumOrgn;
	}

	/** 得意先マスタ.ＣｏｍＩｎｖ出力枚数（控え） */
	public int getComInvPrintNumCopy() {
		return comInvPrintNumCopy;
	}

	/** 得意先マスタ.ＣｏｍＩｎｖ出力枚数（控え） */
	public void setComInvPrintNumCopy(int comInvPrintNumCopy) {
		this.comInvPrintNumCopy = comInvPrintNumCopy;
	}

	/** 得意先マスタ.ＣｏｍｍｅｒｃｉａｌＩｎｖｏｉｃｅ保存フラグ */
	public String getComInvRetainFlg() {
		return comInvRetainFlg;
	}

	/** 得意先マスタ.ＣｏｍｍｅｒｃｉａｌＩｎｖｏｉｃｅ保存フラグ */
	public void setComInvRetainFlg(String comInvRetainFlg) {
		this.comInvRetainFlg = comInvRetainFlg;
	}

	/** 得意先マスタ.ＤｅｌｉｖｅｒｙＯｒｄｅｒフラグ */
	public String getDeliOrderFlg() {
		return deliOrderFlg;
	}

	/** 得意先マスタ.ＤｅｌｉｖｅｒｙＯｒｄｅｒフラグ */
	public void setDeliOrderFlg(String deliOrderFlg) {
		this.deliOrderFlg = deliOrderFlg;
	}

	/** 得意先マスタ.ＤｅｌｉＯｒｄｅｒ出力枚数（オリジナル） */
	public int getDeliOrderPrintNumOrgn() {
		return deliOrderPrintNumOrgn;
	}

	/** 得意先マスタ.ＤｅｌｉＯｒｄｅｒ出力枚数（オリジナル） */
	public void setDeliOrderPrintNumOrgn(int deliOrderPrintNumOrgn) {
		this.deliOrderPrintNumOrgn = deliOrderPrintNumOrgn;
	}

	/** 得意先マスタ.ＤｅｌｉＯｒｄｅｒ出力枚数（控え） */
	public int getDeliInvPrintNumCopy() {
		return deliInvPrintNumCopy;
	}

	/** 得意先マスタ.ＤｅｌｉＯｒｄｅｒ出力枚数（控え） */
	public void setDeliInvPrintNumCopy(int deliInvPrintNumCopy) {
		this.deliInvPrintNumCopy = deliInvPrintNumCopy;
	}

	/** 得意先マスタ.ＤｅｌｉｖｅｒｙＯｒｄｅｒ保存フラグ */
	public String getDeliOrderRetainFlg() {
		return deliOrderRetainFlg;
	}

	/** 得意先マスタ.ＤｅｌｉｖｅｒｙＯｒｄｅｒ保存フラグ */
	public void setDeliOrderRetainFlg(String deliOrderRetainFlg) {
		this.deliOrderRetainFlg = deliOrderRetainFlg;
	}

	/** 得意先マスタ.ＰａｃｋｉｎｇＬｉｓｔフラグ */
	public String getPackListFlg() {
		return packListFlg;
	}

	/** 得意先マスタ.ＰａｃｋｉｎｇＬｉｓｔフラグ */
	public void setPackListFlg(String packListFlg) {
		this.packListFlg = packListFlg;
	}

	/** 得意先マスタ.ＰａｃｋＬｉｓｔ出力枚数（オリジナル） */
	public int getPackListPrintNumOrgn() {
		return packListPrintNumOrgn;
	}

	/** 得意先マスタ.ＰａｃｋＬｉｓｔ出力枚数（オリジナル） */
	public void setPackListPrintNumOrgn(int packListPrintNumOrgn) {
		this.packListPrintNumOrgn = packListPrintNumOrgn;
	}

	/** 得意先マスタ.ＰａｃｋＬｉｓｔ出力枚数（控え） */
	public int getPackListPrintNumCopy() {
		return packListPrintNumCopy;
	}

	/** 得意先マスタ.ＰａｃｋＬｉｓｔ出力枚数（控え） */
	public void setPackListPrintNumCopy(int packListPrintNumCopy) {
		this.packListPrintNumCopy = packListPrintNumCopy;
	}

	/** 得意先マスタ.ＰａｃｋｉｎｇＬｉｓｔ保存フラグ */
	public String getPackListRetainFlg() {
		return packListRetainFlg;
	}

	/** 得意先マスタ.ＰａｃｋｉｎｇＬｉｓｔ保存フラグ */
	public void setPackListRetainFlg(String packListRetainFlg) {
		this.packListRetainFlg = packListRetainFlg;
	}

	/** 得意先マスタ.INV_PACK_FLG */
	public String getInvPackFlg() {
		return invPackFlg;
	}

	/** 得意先マスタ.INV_PACK_FLG */
	public void setInvPackFlg(String invPackFlg) {
		this.invPackFlg = invPackFlg;
	}

	/** 得意先マスタ.Ｉｎｖ＆Ｐａｃｋ出力枚数（オリジナル） */
	public int getInvPackPrintNumOrgn() {
		return invPackPrintNumOrgn;
	}

	/** 得意先マスタ.Ｉｎｖ＆Ｐａｃｋ出力枚数（オリジナル） */
	public void setInvPackPrintNumOrgn(int invPackPrintNumOrgn) {
		this.invPackPrintNumOrgn = invPackPrintNumOrgn;
	}

	/** 得意先マスタ.Ｉｎｖ＆Ｐａｃｋ出力枚数（控え） */
	public int getInvPackPrintNumCopy() {
		return invPackPrintNumCopy;
	}

	/** 得意先マスタ.Ｉｎｖ＆Ｐａｃｋ出力枚数（控え） */
	public void setInvPackPrintNumCopy(int invPackPrintNumCopy) {
		this.invPackPrintNumCopy = invPackPrintNumCopy;
	}

	/** 得意先マスタ.Ｉｎｖ＆Ｐａｃｋ保存フラグ */
	public String getInvPackRetainFlg() {
		return invPackRetainFlg;
	}

	/** 得意先マスタ.Ｉｎｖ＆Ｐａｃｋ保存フラグ */
	public void setInvPackRetainFlg(String invPackRetainFlg) {
		this.invPackRetainFlg = invPackRetainFlg;
	}

	/** 得意先マスタ.エコール得意先コード */
	public String getEcalCustCd() {
		return ecalCustCd;
	}

	/** 得意先マスタ.エコール得意先コード */
	public void setEcalCustCd(String ecalCustCd) {
		this.ecalCustCd = ecalCustCd;
	}

	/** 得意先マスタ.得意先名（現地語１） */
	public String getNtvCustName1() {
		return ntvCustName1;
	}

	/** 得意先マスタ.得意先名（現地語１） */
	public void setNtvCustName1(String ntvCustName1) {
		this.ntvCustName1 = ntvCustName1;
	}

	/** 得意先マスタ.得意先名（英字） */
	public String getCustName() {
		return custName;
	}

	/** 得意先マスタ.得意先名（英字） */
	public void setCustName(String custName) {
		this.custName = custName;
	}

	/** 得意先マスタ.得意先名（現地語２） */
	public String getNtvCustName2() {
		return ntvCustName2;
	}

	/** 得意先マスタ.得意先名（現地語２） */
	public void setNtvCustName2(String ntvCustName2) {
		this.ntvCustName2 = ntvCustName2;
	}

	/** 得意先マスタ.住所１（現地語） */
	public String getCustNtvAddress_1() {
		return custNtvAddress_1;
	}

	/** 得意先マスタ.住所１（現地語） */
	public void setCustNtvAddress_1(String custNtvAddress_1) {
		this.custNtvAddress_1 = custNtvAddress_1;
	}

	/** 得意先マスタ.住所１（カナ／英字） */
	public String getCustHalfwidthAddress_1() {
		return custHalfwidthAddress_1;
	}

	/** 得意先マスタ.住所１（カナ／英字） */
	public void setCustHalfwidthAddress_1(String custHalfwidthAddress_1) {
		this.custHalfwidthAddress_1 = custHalfwidthAddress_1;
	}

	/** 得意先マスタ.住所２（現地語） */
	public String getCustNtvAddress_2() {
		return custNtvAddress_2;
	}

	/** 得意先マスタ.住所２（現地語） */
	public void setCustNtvAddress_2(String custNtvAddress_2) {
		this.custNtvAddress_2 = custNtvAddress_2;
	}

	/** 得意先マスタ.住所２（カナ／英字） */
	public String getCustHalfwidthAddress_2() {
		return custHalfwidthAddress_2;
	}

	/** 得意先マスタ.住所２（カナ／英字） */
	public void setCustHalfwidthAddress_2(String custHalfwidthAddress_2) {
		this.custHalfwidthAddress_2 = custHalfwidthAddress_2;
	}

	/** 得意先マスタ.住所３（現地語） */
	public String getCustNtvAddress_3() {
		return custNtvAddress_3;
	}

	/** 得意先マスタ.住所３（現地語） */
	public void setCustNtvAddress_3(String custNtvAddress_3) {
		this.custNtvAddress_3 = custNtvAddress_3;
	}

	/** 得意先マスタ.住所３（カナ／英字 */
	public String getCustHalfwidthAddress_3() {
		return custHalfwidthAddress_3;
	}

	/** 得意先マスタ.住所３（カナ／英字 */
	public void setCustHalfwidthAddress_3(String custHalfwidthAddress_3) {
		this.custHalfwidthAddress_3 = custHalfwidthAddress_3;
	}

	/** 得意先マスタ.住所４（現地語） */
	public String getCustNtvAddress_4() {
		return custNtvAddress_4;
	}

	/** 得意先マスタ.住所４（現地語） */
	public void setCustNtvAddress_4(String custNtvAddress_4) {
		this.custNtvAddress_4 = custNtvAddress_4;
	}

	/** 得意先マスタ.住所４（カナ／英字)  */
	public String getCustHalfwidthAddress_4() {
		return custHalfwidthAddress_4;
	}

	/** 得意先マスタ.住所４（カナ／英字)  */
	public void setCustHalfwidthAddress_4(String custHalfwidthAddress_4) {
		this.custHalfwidthAddress_4 = custHalfwidthAddress_4;
	}

	/** 得意先マスタ.国コード */
	public String getCustCountryCdMst() {
		return custCountryCdMst;
	}

	/** 得意先マスタ.国コード */
	public void setCustCountryCdMst(String custCountryCdMst) {
		this.custCountryCdMst = custCountryCdMst;
	}

	/** 得意先マスタ.都市名 */
	public String getCustCityName() {
		return custCityName;
	}

	/** 得意先マスタ.都市名 */
	public void setCustCityName(String custCityName) {
		this.custCityName = custCityName;
	}

	/** 得意先マスタ.電話番号 */
	public String getCustTel() {
		return custTel;
	}

	/** 得意先マスタ.電話番号 */
	public void setCustTel(String custTel) {
		this.custTel = custTel;
	}

	/** 得意先マスタ.ＦＡＸ番号 */
	public String getCustFax() {
		return custFax;
	}

	/** 得意先マスタ.ＦＡＸ番号 */
	public void setCustFax(String custFax) {
		this.custFax = custFax;
	}

	/** 得意先マスタ.事務指示１表示フラグ */
	public String getBusinessinstruct1ShowFlg() {
		return businessinstruct1ShowFlg;
	}

	/** 得意先マスタ.事務指示１表示フラグ */
	public void setBusinessinstruct1ShowFlg(String businessinstruct1ShowFlg) {
		this.businessinstruct1ShowFlg = businessinstruct1ShowFlg;
	}

	/** 得意先マスタ.事務指示１（現地語可） */
	public String getNtvBusinessinstruct1() {
		return ntvBusinessinstruct1;
	}

	/** 得意先マスタ.事務指示１（現地語可） */
	public void setNtvBusinessinstruct1(String ntvBusinessinstruct1) {
		this.ntvBusinessinstruct1 = ntvBusinessinstruct1;
	}

	/** 得意先マスタ.事務指示２表示フラグ */
	public String getBusinessinstruct2ShowFlg() {
		return businessinstruct2ShowFlg;
	}

	/** 得意先マスタ.事務指示２表示フラグ */
	public void setBusinessinstruct2ShowFlg(String businessinstruct2ShowFlg) {
		this.businessinstruct2ShowFlg = businessinstruct2ShowFlg;
	}

	/** 得意先マスタ.事務指示２（現地語可） */
	public String getNtvBusinessinstruct2() {
		return ntvBusinessinstruct2;
	}

	/** 得意先マスタ.事務指示２（現地語可） */
	public void setNtvBusinessinstruct2(String ntvBusinessinstruct2) {
		this.ntvBusinessinstruct2 = ntvBusinessinstruct2;
	}

	/** 得意先マスタ.梱包指示１表示フラグ */
	public String getPackingInstruct1ShowFlg() {
		return packingInstruct1ShowFlg;
	}

	/** 得意先マスタ.梱包指示１表示フラグ */
	public void setPackingInstruct1ShowFlg(String packingInstruct1ShowFlg) {
		this.packingInstruct1ShowFlg = packingInstruct1ShowFlg;
	}

	/** 得意先マスタ.梱包指示１（現地語可） */
	public String getNtvPackingInstruct1() {
		return ntvPackingInstruct1;
	}

	/** 得意先マスタ.梱包指示１（現地語可） */
	public void setNtvPackingInstruct1(String ntvPackingInstruct1) {
		this.ntvPackingInstruct1 = ntvPackingInstruct1;
	}

	/** 得意先マスタ.梱包指示２表示フラグ */
	public String getPackingInstruct2ShowFlg() {
		return packingInstruct2ShowFlg;
	}

	/** 得意先マスタ.梱包指示２表示フラグ */
	public void setPackingInstruct2ShowFlg(String packingInstruct2ShowFlg) {
		this.packingInstruct2ShowFlg = packingInstruct2ShowFlg;
	}

	/** 得意先マスタ.梱包指示２（現地語可） */
	public String getNtvPackingInstruct2() {
		return ntvPackingInstruct2;
	}

	/** 得意先マスタ.梱包指示２（現地語可） */
	public void setNtvPackingInstruct2(String ntvPackingInstruct2) {
		this.ntvPackingInstruct2 = ntvPackingInstruct2;
	}

	/** 得意先マスタ.事業所ライセンス番号 */
	public String getCustOfficeLicenseNo() {
		return custOfficeLicenseNo;
	}

	/** 得意先マスタ.事業所ライセンス番号 */
	public void setCustOfficeLicenseNo(String custOfficeLicenseNo) {
		this.custOfficeLicenseNo = custOfficeLicenseNo;
	}

	/** 得意先マスタ.売掛先コード */
	public String getBillToCd() {
		return billToCd;
	}

	/** 得意先マスタ.売掛先コード */
	public void setBillToCd(String billToCd) {
		this.billToCd = billToCd;
	}

	/** 得意先マスタ.商品総称フラグ */
	public String getProductGenericNameFlg() {
		return productGenericNameFlg;
	}

	/** 得意先マスタ.商品総称フラグ */
	public void setProductGenericNameFlg(String productGenericNameFlg) {
		this.productGenericNameFlg = productGenericNameFlg;
	}

	/** 得意先マスタ.税金エリアコード */
	public String getTaxAreaCd() {
		return taxAreaCd;
	}

	/** 得意先マスタ.税金エリアコード */
	public void setTaxAreaCd(String taxAreaCd) {
		this.taxAreaCd = taxAreaCd;
	}

	/** 得意先マスタ.非課税フラグ */
	public String getTaxFreeFlg() {
		return taxFreeFlg;
	}

	/** 得意先マスタ.非課税フラグ */
	public void setTaxFreeFlg(String taxFreeFlg) {
		this.taxFreeFlg = taxFreeFlg;
	}

	/** 得意先マスタ.原産国名表示フラグ */
	public String getCountryOfOrignShowFlg() {
		return countryOfOrignShowFlg;
	}

	/** 得意先マスタ.原産国名表示フラグ */
	public void setCountryOfOrignShowFlg(String countryOfOrignShowFlg) {
		this.countryOfOrignShowFlg = countryOfOrignShowFlg;
	}

	/** 得意先マスタ.特別カスタマーBOX番号 */
	public String getSpecialCustBoxNo() {
		return specialCustBoxNo;
	}

	/** 得意先マスタ.特別カスタマーBOX番号 */
	public void setSpecialCustBoxNo(String specialCustBoxNo) {
		this.specialCustBoxNo = specialCustBoxNo;
	}

	/** 得意先マスタ.特別カスタマーＢＯＸグループ */
	public String getSpecialCustBoxGrp() {
		return specialCustBoxGrp;
	}

	/** 得意先マスタ.特別カスタマーＢＯＸグループ */
	public void setSpecialCustBoxGrp(String specialCustBoxGrp) {
		this.specialCustBoxGrp = specialCustBoxGrp;
	}

	/** 得意先マスタ.値引表示フラグ */
	public String getDiscountShowFlg() {
		return discountShowFlg;
	}

	/** 得意先マスタ.値引表示フラグ */
	public void setDiscountShowFlg(String discountShowFlg) {
		this.discountShowFlg = discountShowFlg;
	}

	/** 得意先マスタ.HSコード表示フラグ */
	public String getHsCdShowFlg() {
		return hsCdShowFlg;
	}

	/** 得意先マスタ.HSコード表示フラグ */
	public void setHsCdShowFlg(String hsCdShowFlg) {
		this.hsCdShowFlg = hsCdShowFlg;
	}

	/** 得意先マスタ.NetWeight表示フラグ */
	public String getNetWeightShowFlg() {
		return netWeightShowFlg;
	}

	/** 得意先マスタ.NetWeight表示フラグ */
	public void setNetWeightShowFlg(String netWeightShowFlg) {
		this.netWeightShowFlg = netWeightShowFlg;
	}

	/** 得意先マスタ.セルコード */
	public String getCellCd() {
		return cellCd;
	}

	/** 得意先マスタ.セルコード */
	public void setCellCd(String cellCd) {
		this.cellCd = cellCd;
	}

	/** 得意先マスタ.メールアドレス */
	public String getMailAddress() {
		return mailAddress;
	}

	/** 得意先マスタ.メールアドレス */
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	/** 得意先マスタ.納品書フラグ */
	public String getPackingFlg() {
		return packingFlg;
	}

	/** 得意先マスタ.納品書フラグ */
	public void setPackingFlg(String packingFlg) {
		this.packingFlg = packingFlg;
	}

	/** 得意先マスタ.納品書出力枚数（オリジナル） */
	public int getPackingPrintNumOrgn() {
		return packingPrintNumOrgn;
	}

	/** 得意先マスタ.納品書出力枚数（オリジナル） */
	public void setPackingPrintNumOrgn(int packingPrintNumOrgn) {
		this.packingPrintNumOrgn = packingPrintNumOrgn;
	}

	/** 得意先マスタ.納品書出力枚数（控え） */
	public int getPackingPrintNumCopy() {
		return packingPrintNumCopy;
	}

	/** 得意先マスタ.納品書出力枚数（控え） */
	public void setPackingPrintNumCopy(int packingPrintNumCopy) {
		this.packingPrintNumCopy = packingPrintNumCopy;
	}

	/** 得意先マスタ.納品書保存フラグ */
	public String getPackingRetainFlg() {
		return packingRetainFlg;
	}

	/** 得意先マスタ.納品書保存フラグ */
	public void setPackingRetainFlg(String packingRetainFlg) {
		this.packingRetainFlg = packingRetainFlg;
	}

	/** 得意先マスタ.英文納品書出力枚数（オリジナル） */
	public int getEngPackingPrintNumOrgn() {
		return engPackingPrintNumOrgn;
	}

	/** 得意先マスタ.英文納品書出力枚数（オリジナル） */
	public void setEngPackingPrintNumOrgn(int engPackingPrintNumOrgn) {
		this.engPackingPrintNumOrgn = engPackingPrintNumOrgn;
	}

	/** 得意先マスタ.英文納品書出力枚数（控え） */
	public int getEngPackingPrintNumCopy() {
		return engPackingPrintNumCopy;
	}

	/** 得意先マスタ.英文納品書出力枚数（控え） */
	public void setEngPackingPrintNumCopy(int engPackingPrintNumCopy) {
		this.engPackingPrintNumCopy = engPackingPrintNumCopy;
	}

	/** 得意先マスタ.英文納品書保存フラグ */
	public String getEngPackingRetainFlg() {
		return engPackingRetainFlg;
	}

	/** 得意先マスタ.英文納品書保存フラグ */
	public void setEngPackingRetainFlg(String engPackingRetainFlg) {
		this.engPackingRetainFlg = engPackingRetainFlg;
	}

	/** 得意先マスタ.仮納品書出力枚数（オリジナル） */
	public int getTmpPackingPrintNumOrgn() {
		return tmpPackingPrintNumOrgn;
	}

	/** 得意先マスタ.仮納品書出力枚数（オリジナル） */
	public void setTmpPackingPrintNumOrgn(int tmpPackingPrintNumOrgn) {
		this.tmpPackingPrintNumOrgn = tmpPackingPrintNumOrgn;
	}

	/** 得意先マスタ.仮納品書出力枚数（控え） */
	public int getTmpPackingPrintNumCopy() {
		return tmpPackingPrintNumCopy;
	}

	/** 得意先マスタ.仮納品書出力枚数（控え） */
	public void setTmpPackingPrintNumCopy(int tmpPackingPrintNumCopy) {
		this.tmpPackingPrintNumCopy = tmpPackingPrintNumCopy;
	}

	/** 得意先マスタ.仮納品書保存フラグ */
	public String getTmpPackingRetainFlg() {
		return tmpPackingRetainFlg;
	}

	/** 得意先マスタ.仮納品書保存フラグ */
	public void setTmpPackingRetainFlg(String tmpPackingRetainFlg) {
		this.tmpPackingRetainFlg = tmpPackingRetainFlg;
	}

	/** 得意先マスタ.請求書フラグ */
	public String getInvoiceFlg() {
		return invoiceFlg;
	}

	/** 得意先マスタ.請求書フラグ */
	public void setInvoiceFlg(String invoiceFlg) {
		this.invoiceFlg = invoiceFlg;
	}

	/** 得意先マスタ.請求書出力枚数（オリジナル） */
	public int getInvoicePrintNumOrgn() {
		return invoicePrintNumOrgn;
	}

	/** 得意先マスタ.請求書出力枚数（オリジナル） */
	public void setInvoicePrintNumOrgn(int invoicePrintNumOrgn) {
		this.invoicePrintNumOrgn = invoicePrintNumOrgn;
	}

	/** 得意先マスタ.請求書出力枚数（控え）） */
	public int getInvoicePrintNumCopy() {
		return invoicePrintNumCopy;
	}

	/** 得意先マスタ.請求書出力枚数（控え）） */
	public void setInvoicePrintNumCopy(int invoicePrintNumCopy) {
		this.invoicePrintNumCopy = invoicePrintNumCopy;
	}

	/** 得意先マスタ.請求書保存フラグ */
	public String getInvoiceRetainFlg() {
		return invoiceRetainFlg;
	}

	/** 得意先マスタ.請求書保存フラグ */
	public void setInvoiceRetainFlg(String invoiceRetainFlg) {
		this.invoiceRetainFlg = invoiceRetainFlg;
	}

	/** 得意先マスタ.運賃値引フラグ */
	public String getFrtDiscountFlg() {
		return frtDiscountFlg;
	}

	/** 得意先マスタ.運賃値引フラグ */
	public void setFrtDiscountFlg(String frtDiscountFlg) {
		this.frtDiscountFlg = frtDiscountFlg;
	}

	/** 得意先マスタ.市町村コード */
	public String getCustCityCd() {
		return custCityCd;
	}

	/** 得意先マスタ.市町村コード */
	public void setCustCityCd(String custCityCd) {
		this.custCityCd = custCityCd;
	}

	/** 売掛先マスタ.売掛先名（現地語） */
	public String getNtvBillToName() {
		return ntvBillToName;
	}

	/** 売掛先マスタ.売掛先名（現地語） */
	public void setNtvBillToName(String ntvBillToName) {
		this.ntvBillToName = ntvBillToName;
	}

	/** 売掛先マスタ.売掛先名 */
	public String getBillToName() {
		return billToName;
	}

	/** 売掛先マスタ.売掛先名 */
	public void setBillToName(String billToName) {
		this.billToName = billToName;
	}

	/** 売掛先マスタ.住所１（現地語） */
	public String getBillToNtvAddress_1() {
		return billToNtvAddress_1;
	}

	/** 売掛先マスタ.住所１（現地語） */
	public void setBillToNtvAddress_1(String billToNtvAddress_1) {
		this.billToNtvAddress_1 = billToNtvAddress_1;
	}

	/** 売掛先マスタ.住所１（カナ／英字） */
	public String getBillToHalfwidthAddress_1() {
		return billToHalfwidthAddress_1;
	}

	/** 売掛先マスタ.住所１（カナ／英字） */
	public void setBillToHalfwidthAddress_1(String billToHalfwidthAddress_1) {
		this.billToHalfwidthAddress_1 = billToHalfwidthAddress_1;
	}

	/** 売掛先マスタ.住所２（現地語） */
	public String getBillToNtvAddress_2() {
		return billToNtvAddress_2;
	}

	/** 売掛先マスタ.住所２（現地語） */
	public void setBillToNtvAddress_2(String billToNtvAddress_2) {
		this.billToNtvAddress_2 = billToNtvAddress_2;
	}

	/** 売掛先マスタ.住所２（カナ／英字） */
	public String getBillToHalfwidthAddress_2() {
		return billToHalfwidthAddress_2;
	}

	/** 売掛先マスタ.住所２（カナ／英字） */
	public void setBillToHalfwidthAddress_2(String billToHalfwidthAddress_2) {
		this.billToHalfwidthAddress_2 = billToHalfwidthAddress_2;
	}

	/** 売掛先マスタ.住所３（現地語） */
	public String getBillToNtvAddress_3() {
		return billToNtvAddress_3;
	}

	/** 売掛先マスタ.住所３（現地語） */
	public void setBillToNtvAddress_3(String billToNtvAddress_3) {
		this.billToNtvAddress_3 = billToNtvAddress_3;
	}

	/** 売掛先マスタ.住所３（カナ／英字） */
	public String getBillToHalfwidthAddress_3() {
		return billToHalfwidthAddress_3;
	}

	/** 売掛先マスタ.住所３（カナ／英字） */
	public void setBillToHalfwidthAddress_3(String billToHalfwidthAddress_3) {
		this.billToHalfwidthAddress_3 = billToHalfwidthAddress_3;
	}

	/** 売掛先マスタ.住所４（現地語） */
	public String getBillToNtvAddress_4() {
		return billToNtvAddress_4;
	}

	/** 売掛先マスタ.住所４（現地語） */
	public void setBillToNtvAddress_4(String billToNtvAddress_4) {
		this.billToNtvAddress_4 = billToNtvAddress_4;
	}

	/** 売掛先マスタ.住所４（カナ／英字） */
	public String getBillToHalfwidthAddress_4() {
		return billToHalfwidthAddress_4;
	}

	/** 売掛先マスタ.住所４（カナ／英字） */
	public void setBillToHalfwidthAddress_4(String billToHalfwidthAddress_4) {
		this.billToHalfwidthAddress_4 = billToHalfwidthAddress_4;
	}

	/** 売掛先マスタ.電話番号 */
	public String getBillToTel() {
		return billToTel;
	}

	/** 売掛先マスタ.電話番号 */
	public void setBillToTel(String billToTel) {
		this.billToTel = billToTel;
	}

	/** 売掛先マスタ.売掛先ＦＡＸ番号 */
	public String getFaxBillTo() {
		return faxBillTo;
	}

	/** 売掛先マスタ.売掛先ＦＡＸ番号 */
	public void setFaxBillTo(String faxBillTo) {
		this.faxBillTo = faxBillTo;
	}

	/** 売掛先マスタ.請求担当者（現地語） */
	public String getNtvBillToPerson() {
		return ntvBillToPerson;
	}

	/** 売掛先マスタ.請求担当者（現地語） */
	public void setNtvBillToPerson(String ntvBillToPerson) {
		this.ntvBillToPerson = ntvBillToPerson;
	}

	/** 売掛先マスタ.売掛注釈１（現地語可） */
	public String getNtvReceivableRemarks_1() {
		return ntvReceivableRemarks_1;
	}

	/** 売掛先マスタ.売掛注釈１（現地語可） */
	public void setNtvReceivableRemarks_1(String ntvReceivableRemarks_1) {
		this.ntvReceivableRemarks_1 = ntvReceivableRemarks_1;
	}

	/** 売掛先マスタ.売掛注釈２（現地語可） */
	public String getNtvReceivableRemarks_2() {
		return ntvReceivableRemarks_2;
	}

	/** 売掛先マスタ.売掛注釈２（現地語可） */
	public void setNtvReceivableRemarks_2(String ntvReceivableRemarks_2) {
		this.ntvReceivableRemarks_2 = ntvReceivableRemarks_2;
	}

	/** 売掛先マスタ.統一発票タイプ */
	public String getUniformInvType() {
		return uniformInvType;
	}

	/** 売掛先マスタ.統一発票タイプ */
	public void setUniformInvType(String uniformInvType) {
		this.uniformInvType = uniformInvType;
	}

	/** 売掛先マスタ.売掛金締め単位 */
	public String getArCloseUnit() {
		return arCloseUnit;
	}

	/** 売掛先マスタ.売掛金締め単位 */
	public void setArCloseUnit(String arCloseUnit) {
		this.arCloseUnit = arCloseUnit;
	}

	/** 売掛先マスタ.売掛金締日 */
	public int getArClosingDay() {
		return arClosingDay;
	}

	/** 売掛先マスタ.売掛金締日 */
	public void setArClosingDay(int arClosingDay) {
		this.arClosingDay = arClosingDay;
	}

	/** 売掛先マスタ.サービス停止区分 */
	public String getServiceStopDiv() {
		return serviceStopDiv;
	}

	/** 売掛先マスタ.サービス停止区分 */
	public void setServiceStopDiv(String serviceStopDiv) {
		this.serviceStopDiv = serviceStopDiv;
	}

	/** 売掛先マスタ.内税外税区分 */
	public String getTaxInExDiv() {
		return taxInExDiv;
	}

	/** 売掛先マスタ.内税外税区分 */
	public void setTaxInExDiv(String taxInExDiv) {
		this.taxInExDiv = taxInExDiv;
	}

	/** 売掛先マスタ.請求部課名（現地語） */
	public String getNtvBillToDept() {
		return ntvBillToDept;
	}

	/** 売掛先マスタ.請求部課名（現地語） */
	public void setNtvBillToDept(String ntvBillToDept) {
		this.ntvBillToDept = ntvBillToDept;
	}

	/** 売掛先マスタ.郵便番号 */
	public String getBillToPostalCd() {
		return billToPostalCd;
	}

	/** 売掛先マスタ.郵便番号 */
	public void setBillToPostalCd(String billToPostalCd) {
		this.billToPostalCd = billToPostalCd;
	}

	/** 売掛先マスタ.国コード */
	public String getBillToCountryCd() {
		return billToCountryCd;
	}

	/** 売掛先マスタ.国コード */
	public void setBillToCountryCd(String billToCountryCd) {
		this.billToCountryCd = billToCountryCd;
	}

	/** 売掛先マスタ.売掛QCT拠点コード */
	public String getBillToReceivableMcCd() {
		return billToReceivableMcCd;
	}

	/** 売掛先マスタ.売掛QCT拠点コード */
	public void setBillToReceivableMcCd(String billToReceivableMcCd) {
		this.billToReceivableMcCd = billToReceivableMcCd;
	}

	/** 現法マスタ.電話番号 */
	public String getTel() {
		return tel;
	}

	/** 現法マスタ.電話番号 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/** 現法マスタ.ＦＡＸ番号 */
	public String getFax() {
		return fax;
	}

	/** 現法マスタ.ＦＡＸ番号 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/** 現法マスタ.郵便番号 */
	public String getPostalCd() {
		return postalCd;
	}

	/** 現法マスタ.郵便番号 */
	public void setPostalCd(String postalCd) {
		this.postalCd = postalCd;
	}

	/** 現法マスタ.国コード */
	public String getCountryCd() {
		return countryCd;
	}

	/** 現法マスタ.国コード */
	public void setCountryCd(String countryCd) {
		this.countryCd = countryCd;
	}

	/** 現法マスタ.現地法人名称 */
	public String getSubsidiaryName() {
		return subsidiaryName;
	}

	/** 現法マスタ.現地法人名称 */
	public void setSubsidiaryName(String subsidiaryName) {
		this.subsidiaryName = subsidiaryName;
	}

	/** 現法マスタ.現地法人名称（現地語） */
	public String getNtvSubsidiaryName() {
		return ntvSubsidiaryName;
	}

	/** 現法マスタ.現地法人名称（現地語） */
	public void setNtvSubsidiaryName(String ntvSubsidiaryName) {
		this.ntvSubsidiaryName = ntvSubsidiaryName;
	}

	/** 現法マスタ.住所１ */
	public String getAddress_1() {
		return address_1;
	}

	/** 現法マスタ.住所１ */
	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}

	/** 現法マスタ.住所２ */
	public String getAddress_2() {
		return address_2;
	}

	/** 現法マスタ.住所２ */
	public void setAddress_2(String address_2) {
		this.address_2 = address_2;
	}

	/** 現法マスタ.住所３ */
	public String getAddress_3() {
		return address_3;
	}

	/** 現法マスタ.住所３ */
	public void setAddress_3(String address_3) {
		this.address_3 = address_3;
	}

	/** 現法マスタ.住所４ */
	public String getAddress_4() {
		return address_4;
	}

	/** 現法マスタ.住所４ */
	public void setAddress_4(String address_4) {
		this.address_4 = address_4;
	}

	/** 現法マスタ.住所１（現地語) */
	public String getNtvAddress_1() {
		return ntvAddress_1;
	}

	/** 現法マスタ.住所１（現地語) */
	public void setNtvAddress_1(String ntvAddress_1) {
		this.ntvAddress_1 = ntvAddress_1;
	}

	/** 現法マスタ.住所２（現地語) */
	public String getNtvAddress_2() {
		return ntvAddress_2;
	}

	/** 現法マスタ.住所２（現地語) */
	public void setNtvAddress_2(String ntvAddress_2) {
		this.ntvAddress_2 = ntvAddress_2;
	}

	/** 現法マスタ.住所３（現地語) */
	public String getNtvAddress_3() {
		return ntvAddress_3;
	}

	/** 現法マスタ.住所３（現地語) */
	public void setNtvAddress_3(String ntvAddress_3) {
		this.ntvAddress_3 = ntvAddress_3;
	}

	/** 現法マスタ.住所４（現地語) */
	public String getNtvAddress_4() {
		return ntvAddress_4;
	}

	/** 現法マスタ.住所４（現地語) */
	public void setNtvAddress_4(String ntvAddress_4) {
		this.ntvAddress_4 = ntvAddress_4;
	}

	/** 現法マスタ.ライセンス番号 */
	public String getLicenceNo() {
		return licenceNo;
	}

	/** 現法マスタ.ライセンス番号 */
	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}

	/** 現法マスタ.税登録番号 */
	public String getVatRegistrationNumber() {
		return vatRegistrationNumber;
	}

	/** 現法マスタ.税登録番号 */
	public void setVatRegistrationNumber(String vatRegistrationNumber) {
		this.vatRegistrationNumber = vatRegistrationNumber;
	}

	/** 直送先マスタ.仮伝区分 */
	public String getShipToTempVoucherDiv() {
		return shipToTempVoucherDiv;
	}

	/** 直送先マスタ.仮伝区分 */
	public void setShipToTempVoucherDiv(String shipToTempVoucherDiv) {
		this.shipToTempVoucherDiv = shipToTempVoucherDiv;
	}

	/** 直送先マスタ.運賃エリアコード */
	public String getShipToFrtAreaCd() {
		return shipToFrtAreaCd;
	}

	/** 直送先マスタ.運賃エリアコード */
	public void setShipToFrtAreaCd(String shipToFrtAreaCd) {
		this.shipToFrtAreaCd = shipToFrtAreaCd;
	}

	/** 直送先マスタ.直送先名（現地語１） */
	public String getNtvShipToName1() {
		return ntvShipToName1;
	}

	/** 直送先マスタ.直送先名（現地語１） */
	public void setNtvShipToName1(String ntvShipToName1) {
		this.ntvShipToName1 = ntvShipToName1;
	}

	/** 直送先マスタ.直送先名（英字） */
	public String getShipToName() {
		return shipToName;
	}

	/** 直送先マスタ.直送先名（英字） */
	public void setShipToName(String shipToName) {
		this.shipToName = shipToName;
	}

	/** 直送先マスタ.住所１（現地語） */
	public String getShipToNtvAddress_1() {
		return shipToNtvAddress_1;
	}

	/** 直送先マスタ.住所１（現地語） */
	public void setShipToNtvAddress_1(String shipToNtvAddress_1) {
		this.shipToNtvAddress_1 = shipToNtvAddress_1;
	}

	/** 直送先マスタ.住所１（カナ／英字） */
	public String getShipToHalfwidthAddress_1() {
		return shipToHalfwidthAddress_1;
	}

	/** 直送先マスタ.住所１（カナ／英字） */
	public void setShipToHalfwidthAddress_1(String shipToHalfwidthAddress_1) {
		this.shipToHalfwidthAddress_1 = shipToHalfwidthAddress_1;
	}

	/** 直送先マスタ.住所２（現地語） */
	public String getShipToNtvAddress_2() {
		return shipToNtvAddress_2;
	}

	/** 直送先マスタ.住所２（現地語） */
	public void setShipToNtvAddress_2(String shipToNtvAddress_2) {
		this.shipToNtvAddress_2 = shipToNtvAddress_2;
	}

	/** 直送先マスタ.住所２（カナ／英字） */
	public String getShipToHalfwidthAddress_2() {
		return shipToHalfwidthAddress_2;
	}

	/** 直送先マスタ.住所２（カナ／英字） */
	public void setShipToHalfwidthAddress_2(String shipToHalfwidthAddress_2) {
		this.shipToHalfwidthAddress_2 = shipToHalfwidthAddress_2;
	}

	/** 直送先マスタ.住所３（現地語） */
	public String getShipToNtvAddress_3() {
		return shipToNtvAddress_3;
	}

	/** 直送先マスタ.住所３（現地語） */
	public void setShipToNtvAddress_3(String shipToNtvAddress_3) {
		this.shipToNtvAddress_3 = shipToNtvAddress_3;
	}

	/** 直送先マスタ.住所３（カナ／英字） */
	public String getShipToHalfwidthAddress_3() {
		return shipToHalfwidthAddress_3;
	}

	/** 直送先マスタ.住所３（カナ／英字） */
	public void setShipToHalfwidthAddress_3(String shipToHalfwidthAddress_3) {
		this.shipToHalfwidthAddress_3 = shipToHalfwidthAddress_3;
	}

	/** 直送先マスタ.住所４（現地語） */
	public String getShipToNtvAddress_4() {
		return shipToNtvAddress_4;
	}

	/** 直送先マスタ.住所４（現地語） */
	public void setShipToNtvAddress_4(String shipToNtvAddress_4) {
		this.shipToNtvAddress_4 = shipToNtvAddress_4;
	}

	/** 直送先マスタ.住所４（カナ／英字） */
	public String getShipToHalfwidthAddress_4() {
		return shipToHalfwidthAddress_4;
	}

	/** 直送先マスタ.住所４（カナ／英字） */
	public void setShipToHalfwidthAddress_4(String shipToHalfwidthAddress_4) {
		this.shipToHalfwidthAddress_4 = shipToHalfwidthAddress_4;
	}

	/** 直送先マスタ.郵便番号 */
	public String getShipToPostalCd() {
		return shipToPostalCd;
	}

	/** 直送先マスタ.郵便番号 */
	public void setShipToPostalCd(String shipToPostalCd) {
		this.shipToPostalCd = shipToPostalCd;
	}

	/** 直送先マスタ.国コード */
	public String getShipToCountryCdMst() {
		return shipToCountryCdMst;
	}

	/** 直送先マスタ.国コード */
	public void setShipToCountryCdMst(String shipToCountryCdMst) {
		this.shipToCountryCdMst = shipToCountryCdMst;
	}

	/** 直送先マスタ.都市名 */
	public String getShipToCityName() {
		return shipToCityName;
	}

	/** 直送先マスタ.都市名 */
	public void setShipToCityName(String shipToCityName) {
		this.shipToCityName = shipToCityName;
	}

	/** 直送先マスタ.電話番号 */
	public String getShipToTel() {
		return shipToTel;
	}

	/** 直送先マスタ.電話番号 */
	public void setShipToTel(String shipToTel) {
		this.shipToTel = shipToTel;
	}

	/** 直送先マスタ.ＦＡＸ番号 */
	public String getShipToFax() {
		return shipToFax;
	}

	/** 直送先マスタ.ＦＡＸ番号 */
	public void setShipToFax(String shipToFax) {
		this.shipToFax = shipToFax;
	}

	/** 直送先マスタ.メールアドレス */
	public String getShipToMailAddress() {
		return shipToMailAddress;
	}

	/** 直送先マスタ.メールアドレス */
	public void setShipToMailAddress(String shipToMailAddress) {
		this.shipToMailAddress = shipToMailAddress;
	}

	/** 直送先マスタ.直送先名（現地語２） */
	public String getShipToNtvShipToName2() {
		return shipToNtvShipToName2;
	}

	/** 直送先マスタ.直送先名（現地語２） */
	public void setShipToNtvShipToName2(String shipToNtvShipToName2) {
		this.shipToNtvShipToName2 = shipToNtvShipToName2;
	}

	/** 直送先マスタ.納入者氏名（カナ／英字） */
	public String getShipToDeliAttention() {
		return shipToDeliAttention;
	}

	/** 直送先マスタ.納入者氏名（カナ／英字） */
	public void setShipToDeliAttention(String shipToDeliAttention) {
		this.shipToDeliAttention = shipToDeliAttention;
	}

	/** 直送先マスタ.納入者部課（カナ／英字） */
	public String getShipToDeliDept() {
		return shipToDeliDept;
	}

	/** 直送先マスタ.納入者部課（カナ／英字） */
	public void setShipToDeliDept(String shipToDeliDept) {
		this.shipToDeliDept = shipToDeliDept;
	}

	/** 直送先マスタ.市町村コード */
	public String getShipToCityCd() {
		return shipToCityCd;
	}

	/** 直送先マスタ.市町村コード */
	public void setShipToCityCd(String shipToCityCd) {
		this.shipToCityCd = shipToCityCd;
	}

	/** 実配送扱い便マスタ.扱い便区分 */
	public String getShippingDestinationCd() {
		return shippingDestinationCd;
	}

	/** 実配送扱い便マスタ.扱い便区分 */
	public void setShippingDestinationCd(String shippingDestinationCd) {
		this.shippingDestinationCd = shippingDestinationCd;
	}

	/** MC_置場マスタ.ＭＣ／置場名称（現地語） */
	public String getNtvMcPlantName() {
		return ntvMcPlantName;
	}

	/** MC_置場マスタ.ＭＣ／置場名称（現地語） */
	public void setNtvMcPlantName(String ntvMcPlantName) {
		this.ntvMcPlantName = ntvMcPlantName;
	}

	/** 部門マスタ.部門名 */
	public String getDeptName() {
		return deptName;
	}

	/** 部門マスタ.部門名 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/** 部門マスタ.住所１ */
	public String getDeptAddress_1() {
		return deptAddress_1;
	}

	/** 部門マスタ.住所１ */
	public void setDeptAddress_1(String deptAddress_1) {
		this.deptAddress_1 = deptAddress_1;
	}

	/** 部門マスタ.住所２ */
	public String getDeptAddress_2() {
		return deptAddress_2;
	}

	/** 部門マスタ.住所２ */
	public void setDeptAddress_2(String deptAddress_2) {
		this.deptAddress_2 = deptAddress_2;
	}

	/** 部門マスタ.住所３ */
	public String getDeptAddress_3() {
		return deptAddress_3;
	}

	/** 部門マスタ.住所３ */
	public void setDeptAddress_3(String deptAddress_3) {
		this.deptAddress_3 = deptAddress_3;
	}

	/** 部門マスタ.住所４ */
	public String getDeptAddress_4() {
		return deptAddress_4;
	}

	/** 部門マスタ.住所４ */
	public void setDeptAddress_4(String deptAddress_4) {
		this.deptAddress_4 = deptAddress_4;
	}

	/** 部門マスタ.郵便番号 */
	public String getDeptPostalCd() {
		return deptPostalCd;
	}

	/** 部門マスタ.郵便番号 */
	public void setDeptPostalCd(String deptPostalCd) {
		this.deptPostalCd = deptPostalCd;
	}

	/** 部門マスタ.電話番号 */
	public String getDeptTel() {
		return deptTel;
	}

	/** 部門マスタ.電話番号 */
	public void setDeptTel(String deptTel) {
		this.deptTel = deptTel;
	}

	/** 部門マスタ.ＦＡＸ番号 */
	public String getDeptFax() {
		return deptFax;
	}

	/** 部門マスタ.ＦＡＸ番号 */
	public void setDeptFax(String deptFax) {
		this.deptFax = deptFax;
	}

	/** 部門マスタ（B）.部門名略称（現地語） */
	public String getDeptNtvDeptNameAbb() {
		return deptNtvDeptNameAbb;
	}

	/** 部門マスタ（B）.部門名略称（現地語） */
	public void setDeptNtvDeptNameAbb(String deptNtvDeptNameAbb) {
		this.deptNtvDeptNameAbb = deptNtvDeptNameAbb;
	}

	/** 輸出管理マスタ.受注メッセージコード */
	public String getOrderMsgCd() {
		return orderMsgCd;
	}

	/** 輸出管理マスタ.受注メッセージコード */
	public void setOrderMsgCd(String orderMsgCd) {
		this.orderMsgCd = orderMsgCd;
	}

	/** 得意先直送先物流.梱包指示テキスト(現地語)1 */
	public String getNtvPackingInstruct1J() {
		return ntvPackingInstruct1J;
	}

	/** 得意先直送先物流.梱包指示テキスト(現地語)1 */
	public void setNtvPackingInstruct1J(String ntvPackingInstruct1J) {
		this.ntvPackingInstruct1J = ntvPackingInstruct1J;
	}

	/** 得意先直送先物流.梱包指示テキスト(現地語)2 */
	public String getNtvPackingInstruct2J() {
		return ntvPackingInstruct2J;
	}

	/** 得意先直送先物流.梱包指示テキスト(現地語)2 */
	public void setNtvPackingInstruct2J(String ntvPackingInstruct2J) {
		this.ntvPackingInstruct2J = ntvPackingInstruct2J;
	}

	/** 得意先直送先物流.梱包指示テキスト(現地語)3 */
	public String getNtvPackingInstruct3J() {
		return ntvPackingInstruct3J;
	}

	/** 得意先直送先物流.梱包指示テキスト(現地語)3 */
	public void setNtvPackingInstruct3J(String ntvPackingInstruct3J) {
		this.ntvPackingInstruct3J = ntvPackingInstruct3J;
	}

	/** 得意先直送先物流.梱包指示テキスト(現地語)4 */
	public String getNtvPackingInstruct4J() {
		return ntvPackingInstruct4J;
	}

	/** 得意先直送先物流.梱包指示テキスト(現地語)4 */
	public void setNtvPackingInstruct4J(String ntvPackingInstruct4J) {
		this.ntvPackingInstruct4J = ntvPackingInstruct4J;
	}

	/** 得意先直送先物流.梱包指示テキスト(現地語)5 */
	public String getNtvPackingInstruct5J() {
		return ntvPackingInstruct5J;
	}

	/** 得意先直送先物流.梱包指示テキスト(現地語)5 */
	public void setNtvPackingInstruct5J(String ntvPackingInstruct5J) {
		this.ntvPackingInstruct5J = ntvPackingInstruct5J;
	}

	/** 得意先直送先物流.事務指示テキスト(現地語)1  */
	public String getNtvBusinessInstruct1J() {
		return ntvBusinessInstruct1J;
	}

	/** 得意先直送先物流.事務指示テキスト(現地語)1  */
	public void setNtvBusinessInstruct1J(String ntvBusinessInstruct1J) {
		this.ntvBusinessInstruct1J = ntvBusinessInstruct1J;
	}

	/** 得意先直送先物流.事務指示テキスト(現地語)2  */
	public String getNtvBusinessInstruct2J() {
		return ntvBusinessInstruct2J;
	}

	/** 得意先直送先物流.事務指示テキスト(現地語)2  */
	public void setNtvBusinessInstruct2J(String ntvBusinessInstruct2J) {
		this.ntvBusinessInstruct2J = ntvBusinessInstruct2J;
	}

	/** 得意先直送先物流.事務指示テキスト(現地語)3  */
	public String getNtvBusinessInstruct3J() {
		return ntvBusinessInstruct3J;
	}

	/** 得意先直送先物流.事務指示テキスト(現地語)3  */
	public void setNtvBusinessInstruct3J(String ntvBusinessInstruct3J) {
		this.ntvBusinessInstruct3J = ntvBusinessInstruct3J;
	}

	/** 得意先直送先物流.事務指示テキスト(現地語)4  */
	public String getNtvBusinessInstruct4J() {
		return ntvBusinessInstruct4J;
	}

	/** 得意先直送先物流.事務指示テキスト(現地語)4  */
	public void setNtvBusinessInstruct4J(String ntvBusinessInstruct4J) {
		this.ntvBusinessInstruct4J = ntvBusinessInstruct4J;
	}

	/** 得意先直送先物流.事務指示テキスト(現地語)5  */
	public String getNtvBusinessInstruct5J() {
		return ntvBusinessInstruct5J;
	}

	/** 得意先直送先物流.事務指示テキスト(現地語)5  */
	public void setNtvBusinessInstruct5J(String ntvBusinessInstruct5J) {
		this.ntvBusinessInstruct5J = ntvBusinessInstruct5J;
	}

	/** 得意先直送先物流.ラベル早出し区分 */
	public String getLabelEarlyDiv() {
		return labelEarlyDiv;
	}

	/** 得意先直送先物流.ラベル早出し区分 */
	public void setLabelEarlyDiv(String labelEarlyDiv) {
		this.labelEarlyDiv = labelEarlyDiv;
	}

	/** 子発注SEQ */
	public String getSubPoSeq() {
		return subPoSeq;
	}

	/** 子発注SEQ */
	public void setSubPoSeq(String subPoSeq) {
		this.subPoSeq = subPoSeq;
	}

	/** オンデマンド用出荷テーブル.データ区分 */
	public String getDataDiv() {
		return dataDiv;
	}

	/** オンデマンド用出荷テーブル.データ区分 */
	public void setDataDiv(String dataDiv) {
		this.dataDiv = dataDiv;
	}

	/** 納入担当部課コード */
	public String getDeliDeptKana() {
		return deliDeptKana;
	}

	/** 納入担当部課コード */
	public void setDeliDeptKana(String deliDeptKana) {
		this.deliDeptKana = deliDeptKana;
	}

	/** 扱い便配送エリアマスタ.配送業者名 */
	public String getCarrierName() {
		return carrierName;
	}

	/** 扱い便配送エリアマスタ.配送業者名 */
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	/** 扱い便配送エリアマスタ.配送業者名略称 */
	public String getCarrierNameKana() {
		return carrierNameKana;
	}

	/** 扱い便配送エリアマスタ.配送業者名略称 */
	public void setCarrierNameKana(String carrierNameKana) {
		this.carrierNameKana = carrierNameKana;
	}
}