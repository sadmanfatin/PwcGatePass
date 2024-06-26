package model.VO;

import java.math.BigDecimal;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jun 22 14:25:22 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PopulateSearchDetailsRVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        HeaderId,
        GatePassClass,
        DeliveryChallanNo,
        Source,
        SourceDocNo,
        GatePassNo,
        LineId,
        RefLineId,
        ItemId,
        Quantity,
        Uom,
        ItemDesc,
        ItemDetails,
        SecondaryQty,
        Remarks,
        SecondaryUom,
        DetailId;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int GATEPASSCLASS = AttributesEnum.GatePassClass.index();
    public static final int DELIVERYCHALLANNO = AttributesEnum.DeliveryChallanNo.index();
    public static final int SOURCE = AttributesEnum.Source.index();
    public static final int SOURCEDOCNO = AttributesEnum.SourceDocNo.index();
    public static final int GATEPASSNO = AttributesEnum.GatePassNo.index();
    public static final int LINEID = AttributesEnum.LineId.index();
    public static final int REFLINEID = AttributesEnum.RefLineId.index();
    public static final int ITEMID = AttributesEnum.ItemId.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int UOM = AttributesEnum.Uom.index();
    public static final int ITEMDESC = AttributesEnum.ItemDesc.index();
    public static final int ITEMDETAILS = AttributesEnum.ItemDetails.index();
    public static final int SECONDARYQTY = AttributesEnum.SecondaryQty.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int SECONDARYUOM = AttributesEnum.SecondaryUom.index();
    public static final int DETAILID = AttributesEnum.DetailId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PopulateSearchDetailsRVORowImpl() {
    }
}

