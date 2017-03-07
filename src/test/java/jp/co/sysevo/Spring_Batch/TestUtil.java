package jp.co.sysevo.Spring_Batch;

import jp.co.sysevo.model.InptData;
import jp.co.sysevo.model.OutptData;

public class TestUtil {

    private static final int INT_DEFAULT = 10;
    private static final int FIXED_VALUE = 0;
    private static final String BLANK = "";

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
    private static String subsidiaryCd = "受注明細.現法コード";
    // 受注明細.MCコード
    private static String mcCd = "受注明細.MCコード";
    // 受注明細.得意先コード
    private static String custCd = "受注明細.得意先コード";
    // 受注明細.仕入先コード
    private static String supplierCd = "受注明細.仕入先コード";
    // 受注明細.直送先コード
    private static String shipToCd = "受注明細.直送先コード";
    // 受注明細.親注番桁数
    private static int custRefLength = INT_DEFAULT;
    // 受注明細.注文番号（子）
    private static String custSubRef = "受注明細.注文番号（子）";
    // 受注明細.グローバル番号
    private static String globalNo = "受注明細.グローバル番号";
    // 受注明細.受注伝票番号
    private static String sovoucherno = "受注明細.受注伝票番号";
    // 受注明細.商品コード
    private static String productCd = "受注明細.受注伝票番号";
    // 受注明細.インナーコード
    private static String innerCd = "受注明細.インナーコード";
    // 受注明細.商品種別
    private static String productAssort = "受注明細.商品種別";
    // 仕入先マスタ.企業名
    private static String companyName = "仕入先マスタ.企業名";
    // 仕入先マスタ.国コード
    private static String purcCountryCd = "仕入先マスタ.国コード";
    // 国マスタ（仕入先）.国名称
    private static String purcCountryName = "国マスタ（仕入先）.国名称";
    // タイプコードマスタ.分析コード
    private static String classifyCd = "タイプコードマスタ.分析コード";
    // 受注明細.置場区分
    private static String mcPlantDiv = "受注明細.置場区分";
    // オンデマンド用出荷テーブル.データ区分
    private static String dataDiv = "オンデマンド用出荷テーブル.データ区分";
    // 受注明細.納入区分
    private static String deliDiv = "受注明細.納入区分";
    // 部材品受注内訳ファイル.子ＳＥＱ
    private static int childSeq = INT_DEFAULT;
    // 得意先マスタ.MC指定伝票区分
    private static String mcSpecifyVoucherDiv = "得意先マスタ.MC指定伝票区分";
    // 受注明細.梱包ランク
    private static String packingRank = "受注明細.梱包ランク";
    // 得意先マスタ.納品書送付フラグ
    private static String deliNoteSendFlg = "得意先マスタ.納品書送付フラグ";
    // 受注明細.指定伝票区分
    private static String specifyVoucherDiv = "受注明細.指定伝票区分";
    // 受注明細.現品添付票区分
    private static String moveTicketDiv = "受注明細.現品添付票区分";
    // 直送先マスタ.仮伝区分
    private static String tempVoucherDiv = "直送先マスタ.仮伝区分";
    // オンデマンド用出荷テーブル.納入部課コード
    private static String deliDeptCd = "オンデマンド用出荷テーブル.納入部課コード";
    // 受注明細.納入担当者コード
    private static String deliAttentionCd = "受注明細.納入担当者コード";
    // 受注明細.ブランドコード
    private static String brandCd = "受注明細.ブランドコード";
    // ブランドマスタ.ブランド名称（英語）
    private static String brandName = "ブランドマスタ.ブランド名称（英語）";
    // 商品マスタ.商品コード
    private static String productCdMst = "商品マスタ.商品コード";
    // 発注テーブル.バーコード用グローバル番号
    private static String barcodeGlobalNo = "発注テーブル.バーコード用グローバル番号";
    // 得意先マスタ.ＣｏｍｍｅｒｃｉａｌＩｎｖｏｉｃｅフラグ
    private static String comInvFlg = "得意先マスタ.ＣｏｍｍｅｒｃｉａｌＩｎｖｏｉｃｅフラグ";
    // 得意先マスタ.ＣｏｍｍｅｒｃｉａｌＩｎｖｏｉｃｅ保存フラグ
    private static String comInvRetainFlg = "得意先マスタ.ＣｏｍｍｅｒｃｉａｌＩｎｖｏｉｃｅ保存フラグ";
    // 得意先マスタ.ＤｅｌｉｖｅｒｙＯｒｄｅｒフラグ
    private static String deliOrderFlg = "得意先マスタ.ＤｅｌｉｖｅｒｙＯｒｄｅｒフラグ";
    // 得意先マスタ.ＤｅｌｉｖｅｒｙＯｒｄｅｒ保存フラグ
    private static String deliOrderRetainFlg = "得意先マスタ.ＤｅｌｉｖｅｒｙＯｒｄｅｒ保存フラグ";
    // 得意先マスタ.ＰａｃｋｉｎｇＬｉｓｔフラグ
    private static String packListFlg = "得意先マスタ.ＰａｃｋｉｎｇＬｉｓｔフラグ";
    // 得意先マスタ.ＰａｃｋｉｎｇＬｉｓｔ保存フラグ
    private static String packListRetainFlg = "得意先マスタ.ＰａｃｋｉｎｇＬｉｓｔ保存フラグ";
    // 得意先マスタ.Ｉｎｖ＆Ｐａｃｋｉｎｇフラグ
    private static String invPackFlg = "得意先マスタ.Ｉｎｖ＆Ｐａｃｋｉｎｇフラグ";
    // 得意先マスタ.Ｉｎｖ＆Ｐａｃｋ保存フラグ
    private static String invPackRetainFlg = "得意先マスタ.Ｉｎｖ＆Ｐａｃｋ保存フラグ";
    // 商品マスタ.ＨＳコード
    private static String hsCd = "商品マスタ.ＨＳコード";
    // 現法マスタ.電話番号
    private static String subsidiaryTel = "現法マスタ.電話番号";
    // 現法マスタ.ＦＡＸ番号
    private static String subsidiaryFax = "現法マスタ.ＦＡＸ番号";
    // 現法マスタ.郵便番号
    private static String subsidiaryPostalCd = "現法マスタ.郵便番号";
    // 現法マスタ.国コード
    private static String subsidiaryCountryCd = "現法マスタ.国コード";
    // 現法マスタ.ライセンス番号
    private static String subsidiaryLicenceNo = "現法マスタ.ライセンス番号";
    // 現法マスタ.税登録番号
    private static String subsidiaryVatRegistrationNumber = "現法マスタ.税登録番号";
    // 得意先マスタ.エコール得意先コード
    private static String ecalCustCd = "得意先マスタ.エコール得意先コード";
    // 得意先マスタ.得意先名（英字）
    private static String custName = "得意先マスタ.得意先名（英字）";
    // 受注明細.注文者部課（現地語）
    private static String ntvCustDept = "受注明細.注文者部課（現地語）";
//    // 得意先マスタ.得意先名（英字）
//    private static String custName;
    // 得意先マスタ.国コード
    private static String custCountryCd = "得意先マスタ.国コード";
    // 国マスタ（得意先）.ＵＰＳ国コード
    private static String custUpsCountryCd = "国マスタ（得意先）.ＵＰＳ国コード";
    // 得意先マスタ.都市名
    private static String custCityName = "得意先マスタ.都市名";
    // 得意先マスタ.電話番号
    private static String custTel = "得意先マスタ.電話番号";
    // 得意先マスタ.ＦＡＸ番号
    private static String custFax = "得意先マスタ.ＦＡＸ番号";
    // 受注明細.注文者氏名（現地語）
    private static String ntvCustAttention = "受注明細.注文者氏名（現地語）";
    // 得意先マスタ.事業所ライセンス番号
    private static String custOfficeLicenseNo = "得意先マスタ.事業所ライセンス番号";
    // 得意先マスタ.売掛先コード
    private static String custBillToCd = "得意先マスタ.売掛先コード";
    // 売掛先マスタ.請求部課名（現地語）
    private static String billToNtvBillToDept = "売掛先マスタ.請求部課名（現地語）";
    // 売掛先マスタ.郵便番号
    private static String billToPostalCd = "売掛先マスタ.郵便番号";
    // 売掛先マスタ.国コード
    private static String billToCountryCd = "売掛先マスタ.国コード";
    // 売掛先マスタ.電話番号
    private static String billToTel = "売掛先マスタ.電話番号";
    // 売掛先マスタ.売掛先ＦＡＸ番号
    private static String faxBillTo = "売掛先マスタ.売掛先ＦＡＸ番号";
    // 売掛先マスタ.請求担当者（現地語）
    private static String ntvBillToPerson = "売掛先マスタ.請求担当者（現地語）";
    // 売掛先マスタ.売掛注釈１（現地語可）
    private static String ntvReceivableRemarks_1 = "売掛先マスタ.売掛注釈１（現地語可）";
    // 売掛先マスタ.売掛注釈２（現地語可）
    private static String ntvReceivableRemarks_2 = "売掛先マスタ.売掛注釈２（現地語可）";
    // 受注明細.納入者部課（現地語）
    private static String ntvDeliDept = "受注明細.納入者部課（現地語）";
    // 直送先マスタ.郵便番号
    private static String shipToPostalCd = "直送先マスタ.郵便番号";
    // 直送先マスタ.国コード
    private static String shipToCountryCd = "直送先マスタ.国コード";
    // 国マスタ（直送先）.ＵＰＳ国コード
    private static String shipToUpsCountryCd = "国マスタ（直送先）.ＵＰＳ国コード";
    // 直送先マスタ.都市名
    private static String shipToCityName = "直送先マスタ.都市名";
    // 直送先マスタ.電話番号
    private static String shipToTel = "直送先マスタ.電話番号";
    // 直送先マスタ.ＦＡＸ番号
    private static String shipToFax = "直送先マスタ.ＦＡＸ番号";
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
    private static String subsidiaryPlantPostalCd = "部門マスタ（得意先現法置場）.郵便番号";
    // 現法マスタ（得意先現法置場）.国コード
    private static String deptCountryCd = "現法マスタ（得意先現法置場）.国コード";
    // 部門マスタ（得意先現法置場）.電話番号
    private static String subsidiaryPlantTel = "部門マスタ（得意先現法置場）.電話番号";
    // 部門マスタ（得意先現法置場）.ＦＡＸ番号
    private static String subsidiaryPlantFax = "部門マスタ（得意先現法置場）.ＦＡＸ番号";
    // 実配送扱い便マスタ.扱い便区分
    private static String custShipmode = "実配送扱い便マスタ.扱い便区分";
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
    private static String productGenericNameFlg = "得意先マスタ.商品総称フラグ";
    // 受注明細.伝票区分
    private static String voucherDiv = "受注明細.伝票区分";
    // 得意先マスタ.税金エリアコード
    private static String taxAreaCd = "得意先マスタ.税金エリアコード";
    // 得意先マスタ.非課税フラグ
    private static String taxFreeFlg = "得意先マスタ.非課税フラグ";
    // 売掛先マスタ.統一発票タイプ
    private static String uniformInvType = "売掛先マスタ.統一発票タイプ";
    // 売掛先マスタ.売掛金締め単位
    private static String arCloseUnit = "売掛先マスタ.売掛金締め単位";
    // 受注明細.得意先現法得意先コード
    private static String custsubCustCd = "受注明細.得意先現法得意先コード";
    // 受注明細.得意先現法直送先コード
    private static String custsubShipToCd = "受注明細.得意先現法直送先コード";
    // 受注明細.商品重量単位
    private static String weightUnit = "受注明細.商品重量単位";
    // 得意先マスタ.原産国名表示フラグ
    private static String countryOfOrignShowFlg = "得意先マスタ.原産国名表示フラグ";
    // 受注明細.原産国コード
    private static String countryOfOrigin = "受注明細.原産国コード";
    // 商品マスタ.数量単位
    private static String unitOfMeasure = "商品マスタ.数量単位";
    // 受注明細.売単価通貨コード
    private static String sUnitPriceCcyCd = "受注明細.売単価通貨コード";
    // 受注明細.仕入単価通貨コード
    private static String pUnitPriceCcyCd = "受注明細.仕入単価通貨コード";
    // 得意先マスタ.運賃値引フラグ
    private static String frtDiscountFlg = "得意先マスタ.運賃値引フラグ";
    // 発注テーブル.Supplier Invoice No
    private static String supplierInvNo = "発注テーブル.Supplier Invoice No";
    // 商品マスタ.商品所管部門コード
    private static String productControlDepCode = "商品マスタ.商品所管部門コード";
    // 得意先マスタ.特別カスタマーＢＯＸ番号
    private static String specialCustBoxNo = "得意先マスタ.特別カスタマーＢＯＸ番号";
    // 得意先マスタ.特別カスタマーＢＯＸグループ
    private static String specialCustBoxGrp = "得意先マスタ.特別カスタマーＢＯＸグループ";
    // 受注明細.輸送手段
    private static String transportMeans = "受注明細.輸送手段";
    // 受注明細.危険品フラグ
    private static String hazardFlg = "受注明細.危険品フラグ";
    // 得意先マスタ.値引表示フラグ
    private static String discountShowFlg = "得意先マスタ.値引表示フラグ";
    // 得意先マスタ.HSコード表示フラグ
    private static String hsCdShowFlg = "得意先マスタ.HSコード表示フラグ";
    // 得意先マスタ.NetWeight表示フラグ
    private static String netWeightShowFlg = "得意先マスタ.NetWeight表示フラグ";
    // 受注明細.直送フラグ
    private static String directShipFlg = "受注明細.直送フラグ";
    // 受注ヘッダ.配送業者顧客番号
    private static String carrierAcctNo = "受注ヘッダ.配送業者顧客番号";
    // 売掛先マスタ.サービス停止区分
    private static String serviceStopDiv = "売掛先マスタ.サービス停止区分";
    // 売掛先マスタ.内税外税区分
    private static String taxInExDiv = "売掛先マスタ.内税外税区分";
    // MC_置場マスタ.ＭＣ／置場名称（現地語）
    private static String ntvMcPlantName = "MC_置場マスタ.ＭＣ／置場名称（現地語）";
    // 得意先マスタ.得意先名（現地語２）
    private static String ntvCustName2 = "得意先マスタ.得意先名（現地語２）";
    // 得意先マスタ.セルコード
    private static String cellCd = "得意先マスタ.セルコード";
    // 得意先マスタ.メールアドレス
    private static String custMailAddressFlg = "得意先マスタ.メールアドレス";
    // 直送先マスタ.メールアドレス
    private static String shipToMailAddress = "直送先マスタ.メールアドレス";
    // GEIP受注明細.明細コメント
    private static String dtComment = "GEIP受注明細.明細コメント";
    // GEIP受注ヘッダ.ロジ連携用伝票コメント
    private static String hdCommentForLogistics = "GEIP受注ヘッダ.ロジ連携用伝票コメント";

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
        // todo
        inptData.setNtvCustDept(ntvCustDept);
        inptData.setCustCountryCd(custCountryCd);
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
        // todo
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
        outptData.setsUnitPriceCcyCd(sUnitPriceCcyCd);
        outptData.setpUnitPriceCcyCd(pUnitPriceCcyCd);
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

        return outptData;
    }

}
