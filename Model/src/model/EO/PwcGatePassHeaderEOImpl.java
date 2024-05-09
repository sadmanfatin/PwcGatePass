package model.EO;

import java.math.BigDecimal;

import java.sql.SQLException;
//import java.sql.Timestamp;

import java.sql.Time;

import java.util.Map;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.NClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.TimestampLTZ;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
import oracle.jbo.domain.Timestamp;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jun 19 13:49:04 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PwcGatePassHeaderEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        HeaderId,
        CreatedBy,
        CreationDate,
        LastUpdateDate,
        LastUpdatedBy,
        GatePassClass,
        GatePassDate,
        GatePassType,
        GatePassNo,
        PartFromId,
        PartyToId,
        PartyFromAddress,
        PartyToAddress,
        OuId,
        VehicleType,
        VehicleNo,
        DriverName,
        DriverPhone,
        Returnable,
        IsReturned,
        RefGatePassNo,
        GateInDate,
        GateOutDate,
        GateInFlag,
        GateOutFlag,
        CreaterName,
        LastEditorName,
        OperatingUnit,
        TimeOutFlag,
        DisabledFlag,
        ApprovalStatus,
        Source,
        SourceDocNo,
        LocationId,
        Remarks,
        PartyAddressGeneric,
        OrganizationId,
        Internal,
        PwcGatePassLinesEO;
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
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int GATEPASSCLASS = AttributesEnum.GatePassClass.index();
    public static final int GATEPASSDATE = AttributesEnum.GatePassDate.index();
    public static final int GATEPASSTYPE = AttributesEnum.GatePassType.index();
    public static final int GATEPASSNO = AttributesEnum.GatePassNo.index();
    public static final int PARTFROMID = AttributesEnum.PartFromId.index();
    public static final int PARTYTOID = AttributesEnum.PartyToId.index();
    public static final int PARTYFROMADDRESS = AttributesEnum.PartyFromAddress.index();
    public static final int PARTYTOADDRESS = AttributesEnum.PartyToAddress.index();
    public static final int OUID = AttributesEnum.OuId.index();
    public static final int VEHICLETYPE = AttributesEnum.VehicleType.index();
    public static final int VEHICLENO = AttributesEnum.VehicleNo.index();
    public static final int DRIVERNAME = AttributesEnum.DriverName.index();
    public static final int DRIVERPHONE = AttributesEnum.DriverPhone.index();
    public static final int RETURNABLE = AttributesEnum.Returnable.index();
    public static final int ISRETURNED = AttributesEnum.IsReturned.index();
    public static final int REFGATEPASSNO = AttributesEnum.RefGatePassNo.index();
    public static final int GATEINDATE = AttributesEnum.GateInDate.index();
    public static final int GATEOUTDATE = AttributesEnum.GateOutDate.index();
    public static final int GATEINFLAG = AttributesEnum.GateInFlag.index();
    public static final int GATEOUTFLAG = AttributesEnum.GateOutFlag.index();
    public static final int CREATERNAME = AttributesEnum.CreaterName.index();
    public static final int LASTEDITORNAME = AttributesEnum.LastEditorName.index();
    public static final int OPERATINGUNIT = AttributesEnum.OperatingUnit.index();
    public static final int TIMEOUTFLAG = AttributesEnum.TimeOutFlag.index();
    public static final int DISABLEDFLAG = AttributesEnum.DisabledFlag.index();
    public static final int APPROVALSTATUS = AttributesEnum.ApprovalStatus.index();
    public static final int SOURCE = AttributesEnum.Source.index();
    public static final int SOURCEDOCNO = AttributesEnum.SourceDocNo.index();
    public static final int LOCATIONID = AttributesEnum.LocationId.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int PARTYADDRESSGENERIC = AttributesEnum.PartyAddressGeneric.index();
    public static final int ORGANIZATIONID = AttributesEnum.OrganizationId.index();
    public static final int INTERNAL = AttributesEnum.Internal.index();
    public static final int PWCGATEPASSLINESEO = AttributesEnum.PwcGatePassLinesEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PwcGatePassHeaderEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.PwcGatePassHeaderEO");
    }


    /**
     * Gets the attribute value for HeaderId, using the alias name HeaderId.
     * @return the value of HeaderId
     */
    public Number getHeaderId() {
        return (Number) getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for HeaderId.
     * @param value value to set the HeaderId
     */
    public void setHeaderId(Number value) {
        setAttributeInternal(HEADERID, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
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
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the value of LastUpdateDate
     */
    public Timestamp getLastUpdateDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for GatePassClass, using the alias name GatePassClass.
     * @return the value of GatePassClass
     */
    public String getGatePassClass() {
        return (String) getAttributeInternal(GATEPASSCLASS);
    }

    /**
     * Sets <code>value</code> as the attribute value for GatePassClass.
     * @param value value to set the GatePassClass
     */
    public void setGatePassClass(String value) {
        setAttributeInternal(GATEPASSCLASS, value);
    }

    /**
     * Gets the attribute value for GatePassDate, using the alias name GatePassDate.
     * @return the value of GatePassDate
     */
    public Timestamp getGatePassDate() {
        return (Timestamp) getAttributeInternal(GATEPASSDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for GatePassDate.
     * @param value value to set the GatePassDate
     */
    public void setGatePassDate(Timestamp value) {
        setAttributeInternal(GATEPASSDATE, value);
    }

    /**
     * Gets the attribute value for GatePassType, using the alias name GatePassType.
     * @return the value of GatePassType
     */
    public String getGatePassType() {
        return (String) getAttributeInternal(GATEPASSTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for GatePassType.
     * @param value value to set the GatePassType
     */
    public void setGatePassType(String value) {
        setAttributeInternal(GATEPASSTYPE, value);
    }

    /**
     * Gets the attribute value for GatePassNo, using the alias name GatePassNo.
     * @return the value of GatePassNo
     */
    public String getGatePassNo() {
        return (String) getAttributeInternal(GATEPASSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for GatePassNo.
     * @param value value to set the GatePassNo
     */
    public void setGatePassNo(String value) {
        setAttributeInternal(GATEPASSNO, value);
    }

    /**
     * Gets the attribute value for PartFromId, using the alias name PartFromId.
     * @return the value of PartFromId
     */
    public Number getPartFromId() {
        return (Number) getAttributeInternal(PARTFROMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PartFromId.
     * @param value value to set the PartFromId
     */
    public void setPartFromId(Number value) {
        setAttributeInternal(PARTFROMID, value);
    }

    /**
     * Gets the attribute value for PartyToId, using the alias name PartyToId.
     * @return the value of PartyToId
     */
    public Number getPartyToId() {
        return (Number) getAttributeInternal(PARTYTOID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PartyToId.
     * @param value value to set the PartyToId
     */
    public void setPartyToId(Number value) {
        setAttributeInternal(PARTYTOID, value);
    }

    /**
     * Gets the attribute value for PartyFromAddress, using the alias name PartyFromAddress.
     * @return the value of PartyFromAddress
     */
    public String getPartyFromAddress() {
        return (String) getAttributeInternal(PARTYFROMADDRESS);
    }

    /**
     * Sets <code>value</code> as the attribute value for PartyFromAddress.
     * @param value value to set the PartyFromAddress
     */
    public void setPartyFromAddress(String value) {
        setAttributeInternal(PARTYFROMADDRESS, value);
    }

    /**
     * Gets the attribute value for PartyToAddress, using the alias name PartyToAddress.
     * @return the value of PartyToAddress
     */
    public String getPartyToAddress() {
        return (String) getAttributeInternal(PARTYTOADDRESS);
    }

    /**
     * Sets <code>value</code> as the attribute value for PartyToAddress.
     * @param value value to set the PartyToAddress
     */
    public void setPartyToAddress(String value) {
        setAttributeInternal(PARTYTOADDRESS, value);
    }

    /**
     * Gets the attribute value for OuId, using the alias name OuId.
     * @return the value of OuId
     */
    public Number getOuId() {
        return (Number) getAttributeInternal(OUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OuId.
     * @param value value to set the OuId
     */
    public void setOuId(Number value) {
        setAttributeInternal(OUID, value);
    }

    /**
     * Gets the attribute value for VehicleType, using the alias name VehicleType.
     * @return the value of VehicleType
     */
    public String getVehicleType() {
        return (String) getAttributeInternal(VEHICLETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for VehicleType.
     * @param value value to set the VehicleType
     */
    public void setVehicleType(String value) {
        setAttributeInternal(VEHICLETYPE, value);
    }

    /**
     * Gets the attribute value for VehicleNo, using the alias name VehicleNo.
     * @return the value of VehicleNo
     */
    public String getVehicleNo() {
        return (String) getAttributeInternal(VEHICLENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for VehicleNo.
     * @param value value to set the VehicleNo
     */
    public void setVehicleNo(String value) {
        setAttributeInternal(VEHICLENO, value);
    }

    /**
     * Gets the attribute value for DriverName, using the alias name DriverName.
     * @return the value of DriverName
     */
    public String getDriverName() {
        return (String) getAttributeInternal(DRIVERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for DriverName.
     * @param value value to set the DriverName
     */
    public void setDriverName(String value) {
        setAttributeInternal(DRIVERNAME, value);
    }

    /**
     * Gets the attribute value for DriverPhone, using the alias name DriverPhone.
     * @return the value of DriverPhone
     */
    public String getDriverPhone() {
        return (String) getAttributeInternal(DRIVERPHONE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DriverPhone.
     * @param value value to set the DriverPhone
     */
    public void setDriverPhone(String value) {
        setAttributeInternal(DRIVERPHONE, value);
    }

    /**
     * Gets the attribute value for Returnable, using the alias name Returnable.
     * @return the value of Returnable
     */
    public String getReturnable() {
        return (String) getAttributeInternal(RETURNABLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Returnable.
     * @param value value to set the Returnable
     */
    public void setReturnable(String value) {
        setAttributeInternal(RETURNABLE, value);
    }

    /**
     * Gets the attribute value for IsReturned, using the alias name IsReturned.
     * @return the value of IsReturned
     */
    public String getIsReturned() {
        return (String) getAttributeInternal(ISRETURNED);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsReturned.
     * @param value value to set the IsReturned
     */
    public void setIsReturned(String value) {
        setAttributeInternal(ISRETURNED, value);
    }

    /**
     * Gets the attribute value for RefGatePassNo, using the alias name RefGatePassNo.
     * @return the value of RefGatePassNo
     */
    public String getRefGatePassNo() {
        return (String) getAttributeInternal(REFGATEPASSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for RefGatePassNo.
     * @param value value to set the RefGatePassNo
     */
    public void setRefGatePassNo(String value) {
        setAttributeInternal(REFGATEPASSNO, value);
    }

    /**
     * Gets the attribute value for GateInDate, using the alias name GateInDate.
     * @return the value of GateInDate
     */
    public Timestamp getGateInDate() {
        return (Timestamp) getAttributeInternal(GATEINDATE);
    }

    public void setGateInDate(Timestamp value) {
        setAttributeInternal(GATEINDATE,value);

    }

    /**
     * Gets the attribute value for GateOutDate, using the alias name GateOutDate.
     * @return the value of GateOutDate
     */
    public Timestamp getGateOutDate() {
        return (Timestamp) getAttributeInternal(GATEOUTDATE);
    }
    
    public void setGateOutDate(Timestamp value) {
        setAttributeInternal(GATEOUTDATE,value);

    }


    /**
     * Gets the attribute value for GateInFlag, using the alias name GateInFlag.
     * @return the value of GateInFlag
     */
    public String getGateInFlag() {
        return (String) getAttributeInternal(GATEINFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for GateInFlag.
     * @param value value to set the GateInFlag
     */
    public void setGateInFlag(String value) {
        setAttributeInternal(GATEINFLAG, value);
    }

    /**
     * Gets the attribute value for GateOutFlag, using the alias name GateOutFlag.
     * @return the value of GateOutFlag
     */
    public String getGateOutFlag() {
        return (String) getAttributeInternal(GATEOUTFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for GateOutFlag.
     * @param value value to set the GateOutFlag
     */
    public void setGateOutFlag(String value) {
        setAttributeInternal(GATEOUTFLAG, value);
    }

    /**
     * Gets the attribute value for CreaterName, using the alias name CreaterName.
     * @return the value of CreaterName
     */
    public String getCreaterName() {
        return (String) getAttributeInternal(CREATERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreaterName.
     * @param value value to set the CreaterName
     */
    public void setCreaterName(String value) {
        setAttributeInternal(CREATERNAME, value);
    }

    /**
     * Gets the attribute value for LastEditorName, using the alias name LastEditorName.
     * @return the value of LastEditorName
     */
    public String getLastEditorName() {
        return (String) getAttributeInternal(LASTEDITORNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastEditorName.
     * @param value value to set the LastEditorName
     */
    public void setLastEditorName(String value) {
        setAttributeInternal(LASTEDITORNAME, value);
    }

    /**
     * Gets the attribute value for OperatingUnit, using the alias name OperatingUnit.
     * @return the value of OperatingUnit
     */
    public String getOperatingUnit() {
        return (String) getAttributeInternal(OPERATINGUNIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for OperatingUnit.
     * @param value value to set the OperatingUnit
     */
    public void setOperatingUnit(String value) {
        setAttributeInternal(OPERATINGUNIT, value);
    }

    /**
     * Gets the attribute value for TimeOutFlag, using the alias name TimeOutFlag.
     * @return the value of TimeOutFlag
     */
    public String getTimeOutFlag() {
        return (String) getAttributeInternal(TIMEOUTFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for TimeOutFlag.
     * @param value value to set the TimeOutFlag
     */
    public void setTimeOutFlag(String value) {
        setAttributeInternal(TIMEOUTFLAG, value);
    }

    /**
     * Gets the attribute value for DisabledFlag, using the alias name DisabledFlag.
     * @return the value of DisabledFlag
     */
    public String getDisabledFlag() {
        return (String) getAttributeInternal(DISABLEDFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for DisabledFlag.
     * @param value value to set the DisabledFlag
     */
    public void setDisabledFlag(String value) {
        setAttributeInternal(DISABLEDFLAG, value);
    }

    /**
     * Gets the attribute value for ApprovalStatus, using the alias name ApprovalStatus.
     * @return the value of ApprovalStatus
     */
    public String getApprovalStatus() {
        return (String) getAttributeInternal(APPROVALSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApprovalStatus.
     * @param value value to set the ApprovalStatus
     */
    public void setApprovalStatus(String value) {
        setAttributeInternal(APPROVALSTATUS, value);
    }

    /**
     * Gets the attribute value for Source, using the alias name Source.
     * @return the value of Source
     */
    public String getSource() {
        return (String) getAttributeInternal(SOURCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Source.
     * @param value value to set the Source
     */
    public void setSource(String value) {
        setAttributeInternal(SOURCE, value);
    }

    /**
     * Gets the attribute value for SourceDocNo, using the alias name SourceDocNo.
     * @return the value of SourceDocNo
     */
    public String getSourceDocNo() {
        return (String) getAttributeInternal(SOURCEDOCNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SourceDocNo.
     * @param value value to set the SourceDocNo
     */
    public void setSourceDocNo(String value) {
        setAttributeInternal(SOURCEDOCNO, value);
    }

    /**
     * Gets the attribute value for LocationId, using the alias name LocationId.
     * @return the value of LocationId
     */
    public BigDecimal getLocationId() {
        return (BigDecimal) getAttributeInternal(LOCATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LocationId.
     * @param value value to set the LocationId
     */
    public void setLocationId(BigDecimal value) {
        setAttributeInternal(LOCATIONID, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the value of Remarks
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for PartyAddressGeneric, using the alias name PartyAddressGeneric.
     * @return the value of PartyAddressGeneric
     */
    public String getPartyAddressGeneric() {
        return (String) getAttributeInternal(PARTYADDRESSGENERIC);
    }

    /**
     * Sets <code>value</code> as the attribute value for PartyAddressGeneric.
     * @param value value to set the PartyAddressGeneric
     */
    public void setPartyAddressGeneric(String value) {
        setAttributeInternal(PARTYADDRESSGENERIC, value);
    }


    /**
     * Gets the attribute value for OrganizationId, using the alias name OrganizationId.
     * @return the value of OrganizationId
     */
    public String getOrganizationId() {
        return (String) getAttributeInternal(ORGANIZATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrganizationId.
     * @param value value to set the OrganizationId
     */
    public void setOrganizationId(String value) {
        setAttributeInternal(ORGANIZATIONID, value);
    }

    /**
     * Gets the attribute value for Internal, using the alias name Internal.
     * @return the value of Internal
     */
    public String getInternal() {
        return (String) getAttributeInternal(INTERNAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Internal.
     * @param value value to set the Internal
     */
    public void setInternal(String value) {
        setAttributeInternal(INTERNAL, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getPwcGatePassLinesEO() {
        return (RowIterator) getAttributeInternal(PWCGATEPASSLINESEO);
    }


    /**
     * @param headerId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number headerId) {
        return new Key(new Object[] { headerId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        
        oracle.jbo.server.SequenceImpl s =
            new oracle.jbo.server.SequenceImpl("PWC_GATE_PASS_HEADER_S",
                                               getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        setHeaderId(sVal);
        String gatePassType = this.getGatePassClass();
        System.out.println(gatePassType);
               
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        String OrgId = (String)sessionScope.get("OrgId");
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        
        String query_ou = "SELECT NAME AS FROM HR_OPERATING_UNITS WHERE ORGANIZATION_ID ="+OrgId;
        ViewObject queryVO1 = this.getDBTransaction().createViewObjectFromQueryStmt(query_ou);
        queryVO1.executeQuery();
        queryVO1.getQuery();
        String OU = null;
        String gatePassClass = null;
        try{
            OU = queryVO1.first().getAttribute(0).toString();    
        }catch(Exception ee){
            ;    
        }
        
        try {
            this.setOperatingUnit(OU);
            System.out.println(OU);
        } catch (Exception e1) {
            // TODO: Add catch code
            e1.printStackTrace();
        }
        
        try {
            this.setOuId(new Number(OrgId));
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
        
        try{
            gatePassClass = userSession.getAttribute("gatePassClass").toString();    
        }catch(Exception e){
            ;
        }
        
        if(gatePassClass.equals("IGP"))
        {
            this.setGatePassClass("IGP");
            }
        else if (gatePassClass.equals("OGP"))
        {
            this.setGatePassClass("OGP");
            }
        else 
        {
            this.setGatePassClass("Time Out");
        }
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
        
        
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        String userId = (String)sessionScope.get("UserId");
        
        String query = "SELECT USER_NAME FROM FND_USER WHERE USER_ID ="+userId;
        ViewObject queryVO = this.getDBTransaction().createViewObjectFromQueryStmt(query);
        queryVO.executeQuery();
        String name = null;
        try{
            name = queryVO.first().getAttribute(0).toString();    
        }catch(Exception ee){
            ;    
        }
        
        String gatePassType = this.getGatePassClass();
        java.util.Date utilDate = new java.util.Date();
        if (DML_UPDATE == operation) {
            try {
                setLastUpdatedBy(new oracle.jbo.domain.Number(userId));
            } catch (SQLException sqle) {
                // TODO: Add catch code
                sqle.printStackTrace();
            }
            this.setLastEditorName(name);
            if(gatePassType != null && gatePassType.equals("Time Out")){
            //                this.setGateOutFlag("Y");
                            this.setGateInDate(Timestamp.toTimestamp(new java.sql.Timestamp(utilDate.getTime()).toString()));
                        }
            
            if(this.getInternal().equals("Y")){
                this.setApprovalStatus("Y");
                System.out.println("================ ML_UPDATE  this.getInternal().equals(\"Y\") ");
                }else  if(this.getInternal().equals("N")){
                
                 //   this.setApprovalStatus("");
                }
            
        } else if (DML_INSERT == operation) {
            System.out.println("In DML");
            
            String gatePassClass = this.getGatePassClass();
//            String ouName = this.getOperatingUnit();
            String orgId = null;
            try{
                orgId = this.getOuId().toString(); //(String) sessionScope.get("orgId");    
            }catch(Exception ee){
                ;
            }
            
            String orgIds = (String)sessionScope.get("OrgId");
            System.out.println("This org id in DO DML " +orgId +"se"+orgIds);
            
            String sobid = null;
            query = "SELECT A.SET_OF_BOOKS_ID\n"+
                    "FROM hr_operating_units A, xle_entity_profiles B, GL_LEDGERS C\n"+
                    "WHERE A.DEFAULT_LEGAL_CONTEXT_ID = B.LEGAL_ENTITY_ID\n"+
                    "AND A.SET_OF_BOOKS_ID = C.LEDGER_ID\n"+
                    "AND A.ORGANIZATION_ID = "+orgId+"\n"+
                    "ORDER BY B.NAME";
            
            System.out.println(query);
            queryVO = this.getDBTransaction().createViewObjectFromQueryStmt(query);
            try{
                sobid = queryVO.first().getAttribute(0).toString();
            }catch(Exception eee){
                eee.printStackTrace();    
            }
            System.out.println("The value of sob_id " +sobid);
            
            query = "SELECT FND_SEQNUM.get_next_auto_sequence (50503,'"+gatePassClass+"',"+sobid+",null,SYSDATE) FROM DUAL";
            System.out.println(query);
            queryVO = this.getDBTransaction().createViewObjectFromQueryStmt(query);
            String sVal = null;
            try{
                sVal = queryVO.first().getAttribute(0).toString();
            }catch(Exception eee){
                eee.printStackTrace();    
            }
            System.out.println("The value of sVal " +sVal);

            this.setGatePassNo(gatePassClass+"-"+sVal);
//            oracle.jbo.server.SequenceImpl s =
//                new oracle.jbo.server.SequenceImpl("PWC_GATE_PASS_NO_SEQ",
//                                                   getDBTransaction());
//            System.out.println(s);
//            System.out.println("Sequence Generated");
//            System.out.println(gatePassType);
//            oracle.jbo.domain.Number sVal = s.getSequenceNumber();
//            this.setGatePassNo(sVal.toString());

            try {
                setCreatedBy(new oracle.jbo.domain.Number(userId));
            } catch (SQLException sqle) {
                // TODO: Add catch code
                sqle.printStackTrace();
            }
            this.setCreaterName(name);
            if(gatePassType != null && gatePassType.equals("IGP")){
                this.setGateInFlag("Y"); 
            }else if(gatePassType != null && gatePassType.equals("OGP")){
                this.setGateOutFlag("Y");
            }else if(gatePassType != null && gatePassType.equals("Time Out")){
//                this.setGateOutFlag("Y");
//                this.setGateInDate(Timestamp.toTimestamp(new java.sql.Timestamp(utilDate.getTime()).toString()));
//                this.getRefGatePassNo().set
            }
            
            if(this.getInternal().equals("Y")){
                this.setApprovalStatus("Y");
                System.out.println("================ ML_UPDATE  this.getInternal().equals(\"Y\") ");
                }else  if(this.getInternal().equals("N")){
                
                 //   this.setApprovalStatus("");
                }
            
            
        }
        super.doDML(operation, e);
    }
//    public void openSpecificGP(String GPvalue) {
//
////                if (GPvalue != null) {
////                    ViewObject HdrVo =this.                   
////                                           is.setWhereClause("HEADER_ID =" + GPvalue);
////                    this.executeQuery();
//                     
//                }
}

