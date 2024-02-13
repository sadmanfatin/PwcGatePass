package model;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jun 19 13:51:08 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PwcGatePassDetailsImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        LineId,
        DetailId,
        LineCode,
        ItemId,
        Quantity,
        Uom,
        CreatedBy,
        CreationDate,
        LastUpdatedBy,
        LastUpdateDate;
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
    public static final int LINEID = AttributesEnum.LineId.index();
    public static final int DETAILID = AttributesEnum.DetailId.index();
    public static final int LINECODE = AttributesEnum.LineCode.index();
    public static final int ITEMID = AttributesEnum.ItemId.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int UOM = AttributesEnum.Uom.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PwcGatePassDetailsImpl() {
    }

    /**
     * Gets the attribute value for LineId, using the alias name LineId.
     * @return the value of LineId
     */
    public BigDecimal getLineId() {
        return (BigDecimal) getAttributeInternal(LINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LineId.
     * @param value value to set the LineId
     */
    public void setLineId(BigDecimal value) {
        setAttributeInternal(LINEID, value);
    }

    /**
     * Gets the attribute value for DetailId, using the alias name DetailId.
     * @return the value of DetailId
     */
    public BigDecimal getDetailId() {
        return (BigDecimal) getAttributeInternal(DETAILID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DetailId.
     * @param value value to set the DetailId
     */
    public void setDetailId(BigDecimal value) {
        setAttributeInternal(DETAILID, value);
    }

    /**
     * Gets the attribute value for LineCode, using the alias name LineCode.
     * @return the value of LineCode
     */
    public String getLineCode() {
        return (String) getAttributeInternal(LINECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LineCode.
     * @param value value to set the LineCode
     */
    public void setLineCode(String value) {
        setAttributeInternal(LINECODE, value);
    }

    /**
     * Gets the attribute value for ItemId, using the alias name ItemId.
     * @return the value of ItemId
     */
    public BigDecimal getItemId() {
        return (BigDecimal) getAttributeInternal(ITEMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemId.
     * @param value value to set the ItemId
     */
    public void setItemId(BigDecimal value) {
        setAttributeInternal(ITEMID, value);
    }

    /**
     * Gets the attribute value for Quantity, using the alias name Quantity.
     * @return the value of Quantity
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) getAttributeInternal(QUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Quantity.
     * @param value value to set the Quantity
     */
    public void setQuantity(BigDecimal value) {
        setAttributeInternal(QUANTITY, value);
    }

    /**
     * Gets the attribute value for Uom, using the alias name Uom.
     * @return the value of Uom
     */
    public String getUom() {
        return (String) getAttributeInternal(UOM);
    }

    /**
     * Sets <code>value</code> as the attribute value for Uom.
     * @param value value to set the Uom
     */
    public void setUom(String value) {
        setAttributeInternal(UOM, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public BigDecimal getCreatedBy() {
        return (BigDecimal) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(BigDecimal value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the value of CreationDate
     */
    public Timestamp getCreationDate() {
        return (Timestamp) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Timestamp value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public BigDecimal getLastUpdatedBy() {
        return (BigDecimal) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(BigDecimal value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the value of LastUpdateDate
     */
    public Timestamp getLastUpdateDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateDate.
     * @param value value to set the LastUpdateDate
     */
    public void setLastUpdateDate(Timestamp value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * @param detailId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal detailId) {
        return new Key(new Object[] { detailId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.PwcGatePassDetails");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}
