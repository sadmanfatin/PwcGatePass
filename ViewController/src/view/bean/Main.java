package view.bean;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

import java.util.Map;

import javax.el.ELContext;

import javax.el.ExpressionFactory;

import javax.el.ValueExpression;

import javax.faces.application.FacesMessage;
import javax.faces.application.ViewHandler;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanCheckbox;
import oracle.adf.view.rich.component.rich.input.RichSelectOneRadio;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.adf.view.rich.event.DialogEvent;

import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.domain.TimestampLTZ;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;

public class Main {
    private RichTable searhPageHeaderTable;
    private RichSelectBooleanCheckbox isReturnedBinding;
    private RichSelectBooleanCheckbox returnableBinding;
    private RichTable deliveryLinesTable;
    private RichPanelCollection deliveryLinesPanelBinding;
    private RichButton createLinesBtnBinding;
    private RichInputComboboxListOfValues searchSourceBinding;
    private RichInputComboboxListOfValues searchSourceDocNoBinding;
    private RichTable populateSearchTableBinding;
    private RichTable deliveryDetailTableBinding;
    private RichPanelCollection deliveryDetailsPanelBinding;
    private RichButton populateLinesBtnBinding;
    private RichInputComboboxListOfValues gatePassClassHeader;
    private RichOutputText gateOutDateBinding;
    private RichOutputText gateInDateBinding;
    private RichSelectOneRadio gatePassTypeBinding;
    private RichInputComboboxListOfValues operatingUnitBinding;
    private RichInputComboboxListOfValues refGatePassNoBinding;
    private RichButton gateoutBtnBinding;
    private RichPanelLabelAndMessage gateInDateFieldBinding;
    private RichInputDate gateInBinding;
    private RichInputText inputOperatingUnitBinding;
    private RichButton customCreateLinesBtnBinding;
    private RichInputText disabledFlagBinding;
    private RichPanelFormLayout searchFormPanelBinding;
    private RichInputComboboxListOfValues comboInputOperatingUnitBinding;
    private RichTable deliveryrefres;
    private RichButton detaillinecreatebind;
    private RichInputText approvastatusbnd;
    private RichPanelLabelAndMessage shiptolocationbinding;
    private RichInputText shipToLocationBind;
    private RichInputComboboxListOfValues partytoaddressbind;
    private RichInputText partyaddressgeneric;

    private RichInputComboboxListOfValues vehicleType;
    private RichInputText vehicleNo;
    private RichInputText driverName;
    private RichInputText driverPhone;
    private RichButton sendForApproval;

    public Main() {
    }
        public BindingContainer getBindings() {
            return BindingContext.getCurrent().getCurrentBindingsEntry();
        }
    public void searchFieldPopulateData(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        OperationBinding operationBinding = executeOperation("populateLinesData");
//        OperationBinding operationBinding1 = executeOperation("populateDetailsData");
        
        ////System.out.println("In Bean");
        operationBinding.execute();
        ////System.out.println("In Bean2");
//        operationBinding1.execute();
//        ////System.out.println("After Bean 3");
        
        AdfFacesContext.getCurrentInstance().addPartialTarget(deliveryLinesTable);
        AdfFacesContext.getCurrentInstance().addPartialTarget(deliveryLinesPanelBinding);
    }

    private OperationBinding executeOperation(String operation) {
        OperationBinding createParam =
            getBindingsCont().getOperationBinding(operation);
        return createParam;
    }

    private BindingContainer getBindingsCont() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public void gatePassVCListener(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        ////System.out.println("gatePassVCListener");
        
        String gatePassType = null;
        String refgatepass = null;
        String gpClass  = null;
        
        DCBindingContainer bindings =
        (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding dcIteratorBindings = bindings.findIteratorBinding("PwcGatePassHeaderVO1Iterator");
        ViewObject hdrVO = dcIteratorBindings.getViewObject();
        
      
        try{
            gatePassType = valueChangeEvent.getNewValue().toString(); 
        }catch(Exception e){
            ;
        }
        try{
            refgatepass = hdrVO.getCurrentRow()
                                .getAttribute("RefGatePassNo").toString();
        }catch(Exception e){
            ;
        }
        try {
            gpClass = hdrVO.getCurrentRow().getAttribute("GatePassClass").toString();
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
        AdfFacesContext.getCurrentInstance().addPartialTarget(partyaddressgeneric);

        ////System.out.println("RefGatePassNo Value " +refgatepass);
        ////System.out.println("Gatte pass class "+gpClass);      
        ////System.out.println("Gate pass type " +gatePassType);
        
        if (gatePassType.equals("Generic")) {
            
//            partyaddressgeneric.setRendered(true);
           
//            try {
//                this.getCustomCreateLinesBtnBinding().setVisible(true);
//                this.getDetaillinecreatebind().setVisible(true);
//                this.getPopulateLinesBtnBinding().setVisible(false);
//            } catch (Exception e) {
//                // TODO: Add catch code
//                e.printStackTrace();
//            }
            if (gpClass.equals("OGP")) 
            {       
//                AdfFacesContext.getCurrentInstance().addPartialTarget(partyaddressgeneric);

                if(refgatepass == null)
                {
                    this.getCustomCreateLinesBtnBinding().setVisible(true);
                    this.getDetaillinecreatebind().setVisible(true);
                    this.getPopulateLinesBtnBinding().setVisible(false);
//                    this.getPopulateLinesBtnBinding().setVisible(false);
//                    this.getDetaillinecreatebind().setVisible(true);
                }
                else{
                    this.getCustomCreateLinesBtnBinding().setVisible(false);
                    this.getDetaillinecreatebind().setVisible(false);
                    this.getPopulateLinesBtnBinding().setVisible(false);
                }
            } 
            else if (gpClass.equals("IGP")) {
                if(refgatepass == null)
                {
                    this.getCustomCreateLinesBtnBinding().setVisible(true);
                    this.getDetaillinecreatebind().setVisible(true);
                    this.getPopulateLinesBtnBinding().setVisible(false);
                //                    this.getPopulateLinesBtnBinding().setVisible(false);
                //                    this.getDetaillinecreatebind().setVisible(true);
                }
                else{
                    this.getCustomCreateLinesBtnBinding().setVisible(false);
                    this.getDetaillinecreatebind().setVisible(false);
                    this.getPopulateLinesBtnBinding().setVisible(false);
                }
                //this.getPopulateLinesBtnBinding().setVisible(true);
                //                this.getCreateLinesBtnBinding().setVisible(true);
            }
        } 
        else if (gatePassType.equals("Transactional"))
        {
            if(gpClass.equals("IGP"))
            {
                if(refgatepass == null)
                {
                    this.getCustomCreateLinesBtnBinding().setVisible(true);
                    this.getDetaillinecreatebind().setVisible(true);
                    this.getPopulateLinesBtnBinding().setVisible(false);
                    ////System.out.println("gpClass" +gpClass);
                    ////System.out.println("gatePassType" + gatePassType);
                }else
                {
                    this.getCustomCreateLinesBtnBinding().setVisible(false);
                    this.getDetaillinecreatebind().setVisible(false);
                    this.getPopulateLinesBtnBinding().setVisible(false);
                }
            }
            else if(!(gpClass.equals("IGP")))
            {
                    ////System.out.println("gpClass" +gpClass);
                    ////System.out.println("gatePassType" + gatePassType);
                    this.getPopulateLinesBtnBinding().setVisible(true);
                    this.getCustomCreateLinesBtnBinding().setVisible(false);
                    this.getDetaillinecreatebind().setVisible(false);
            }
        }
        
        AdfFacesContext.getCurrentInstance().addPartialTarget(getDeliveryLinesPanelBinding());
        AdfFacesContext.getCurrentInstance().addPartialTarget(getDeliveryDetailsPanelBinding());
        AdfFacesContext.getCurrentInstance().addPartialTarget(getCustomCreateLinesBtnBinding()); 
        AdfFacesContext.getCurrentInstance().addPartialTarget(getPopulateLinesBtnBinding());
        AdfFacesContext.getCurrentInstance().addPartialTarget(getDetaillinecreatebind());
        AdfFacesContext.getCurrentInstance().addPartialTarget(getGatePassClassHeader());
        AdfFacesContext.getCurrentInstance().addPartialTarget(getGatePassTypeBinding());
        AdfFacesContext.getCurrentInstance().addPartialTarget(getComboInputOperatingUnitBinding());
//        AdfFacesContext.getCurrentInstance().addPartialTarget(partytoaddressbind);
//        AdfFacesContext.getCurrentInstance().addPartialTarget(partyaddressgeneric);
        
    
    }

    public void setIsReturnedBinding(RichSelectBooleanCheckbox isReturnedBinding) {
        this.isReturnedBinding = isReturnedBinding;
    }

    public RichSelectBooleanCheckbox getIsReturnedBinding() {
        return isReturnedBinding;
    }

    public void setReturnableBinding(RichSelectBooleanCheckbox returnableBinding) {
        this.returnableBinding = returnableBinding;
    }

    public RichSelectBooleanCheckbox getReturnableBinding() {
        return returnableBinding;
    }

    public void setDeliveryLinesTable(RichTable deliveryLinesTable) {
        this.deliveryLinesTable = deliveryLinesTable;
    }

    public RichTable getDeliveryLinesTable() {
        return deliveryLinesTable;
    }

    public void setDeliveryLinesPanelBinding(RichPanelCollection deliveryLinesPanelBinding) {
        this.deliveryLinesPanelBinding = deliveryLinesPanelBinding;
    }

    public RichPanelCollection getDeliveryLinesPanelBinding() {
        return deliveryLinesPanelBinding;
    }

    public void setCreateLinesBtnBinding(RichButton createLinesBtnBinding) {
        this.createLinesBtnBinding = createLinesBtnBinding;
    }

    public RichButton getCreateLinesBtnBinding() {
        return createLinesBtnBinding;
    }

    public void isReturnedVCListener(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
//        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        String isReturnable = null;
        try{
            isReturnable = valueChangeEvent.getNewValue().toString(); 
            ////System.out.println("isReturnable "+isReturnable);
        }catch(Exception e){
            e.printStackTrace();
        }
        if(isReturnable.equals("true")){
            this.getReturnableBinding().setDisabled(true);
               
        }else{
            this.getReturnableBinding().setDisabled(false);          

        }
        AdfFacesContext.getCurrentInstance().addPartialTarget(getReturnableBinding());
//        AdfFacesContext.getCurrentInstance().addPartialTarget(getIsReturnedBinding()); 
    }

    public void populateLinesDialogListener(DialogEvent dialogEvent) {
        // Add event code here...
        
        if (dialogEvent.getOutcome().name().equals("ok")) {
            OperationBinding operationBinding = executeOperation("populateLinesDialogListener");
            operationBinding.execute();
            OperationBinding binding = executeOperation("populateBtnListener");
            binding.execute();
            AdfFacesContext.getCurrentInstance().addPartialTarget(getDisabledFlagBinding());
            AdfFacesContext.getCurrentInstance().addPartialTarget(getDeliveryLinesTable());
            AdfFacesContext.getCurrentInstance().addPartialTarget(getDeliveryLinesPanelBinding());
            AdfFacesContext.getCurrentInstance().addPartialTarget(getDeliveryDetailTableBinding());
            AdfFacesContext.getCurrentInstance().addPartialTarget(getDeliveryDetailsPanelBinding());
        }

    }

    public void setSearchSourceBinding(RichInputComboboxListOfValues searchSourceBinding) {
        this.searchSourceBinding = searchSourceBinding;
    }

    public RichInputComboboxListOfValues getSearchSourceBinding() {
        return searchSourceBinding;
    }

    public void setSearchSourceDocNoBinding(RichInputComboboxListOfValues searchSourceDocNoBinding) {
        this.searchSourceDocNoBinding = searchSourceDocNoBinding;
    }

    public RichInputComboboxListOfValues getSearchSourceDocNoBinding() {
        return searchSourceDocNoBinding;
    }

    public void populateGoBtnBinding(ActionEvent actionEvent) {
        // Add event code here...
        
        String source = null;
        String sourceDocNo = null;
        double locationid = 0;
        
        try{
            source = this.getSearchSourceBinding().getValue().toString();    
            ////System.out.println("source "+source);
        }catch(Exception e){
            ;    
        }
        try{
            sourceDocNo = this.getSearchSourceDocNoBinding().getValue().toString();
            ////System.out.println("sourceDocNo "+sourceDocNo);
        }catch(Exception e){
            ;    
        }
//        try{
//            locationid = Double.parseDouble(this.getShipToLocationBind().getValue().toString());
//            ////System.out.println("locationid "+locationid);
//        }catch(Exception e){
//            locationid = 217;    
//        }
        this.getSearchSourceBinding().setValue("");
        this.getSearchSourceDocNoBinding().setValue("");
            
        OperationBinding operationBinding = executeOperation("populateLinesDialogListenerNew");
        operationBinding.getParamsMap().put("source", source);
        operationBinding.getParamsMap().put("sourceDocNo", sourceDocNo);
        operationBinding.execute();
        AdfFacesContext.getCurrentInstance().addPartialTarget(this.getPopulateSearchTableBinding());
        
        
    }
    
    

    public void setPopulateSearchTableBinding(RichTable populateSearchTableBinding) {
        this.populateSearchTableBinding = populateSearchTableBinding;
    }

    public RichTable getPopulateSearchTableBinding() {
        return populateSearchTableBinding;
    }

    public void popupFetchListener(PopupFetchEvent popupFetchEvent) {
        // Add event code here...
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        String orgId = (String) sessionScope.get("OrgId");
        ////System.out.println("orgId "+orgId);
        OperationBinding operationBinding = executeOperation("popupFetchListenerNew");
        operationBinding.execute();
//        this.getSearchSourceBinding().setValue("");   
//        this.getSearchSourceDocNoBinding().setValue("");
//        AdfFacesContext.getCurrentInstance().addPartialTarget(this.getSearchSourceDocNoBinding());
//        AdfFacesContext.getCurrentInstance().addPartialTarget(this.getSearchSourceBinding());
//        AdfFacesContext.getCurrentInstance().addPartialTarget(this.getSearchFormPanelBinding());
    }

    public void setDeliveryDetailTableBinding(RichTable deliveryDetailTableBinding) {
        this.deliveryDetailTableBinding = deliveryDetailTableBinding;
    }

    public RichTable getDeliveryDetailTableBinding() {
        return deliveryDetailTableBinding;
    }

    public void setDeliveryDetailsPanelBinding(RichPanelCollection deliveryDetailsPanelBinding) {
        this.deliveryDetailsPanelBinding = deliveryDetailsPanelBinding;
    }

    public RichPanelCollection getDeliveryDetailsPanelBinding() {
        return deliveryDetailsPanelBinding;
    }

    public void setPopulateLinesBtnBinding(RichButton populateLinesBtnBinding) {
        this.populateLinesBtnBinding = populateLinesBtnBinding;
    }

    public RichButton getPopulateLinesBtnBinding() {
        return populateLinesBtnBinding;
    }

    public void setGatePassClassHeader(RichInputComboboxListOfValues gatePassClassHeader) {
        this.gatePassClassHeader = gatePassClassHeader;
    }

    public RichInputComboboxListOfValues getGatePassClassHeader() {
        return gatePassClassHeader;
    }

    public void gateOutDateBtnBinding(ActionEvent actionEvent) {
        // Add event code here...
        java.util.Date utilDate = new java.util.Date();
//        this.setGateInDateBinding(Timestamp.toTimestamp(new java.sql.Timestamp(utilDate.getTime()).toString()));
//        
//        this.getGateOutDateBinding().setVisible(false);
//        this.getGateInDateBinding().setVisible(true);
//        
//        AdfFacesContext.getCurrentInstance().addPartialTarget(getGateInDateBinding());
//        AdfFacesContext.getCurrentInstance().addPartialTarget(getGateOutDateBinding());
    }

    public void setGateOutDateBinding(RichOutputText gateOutDateBinding) {
        this.gateOutDateBinding = gateOutDateBinding;
    }

    public RichOutputText getGateOutDateBinding() {
        return gateOutDateBinding;
    }

    public void setGateInDateBinding(RichOutputText gateInDateBinding) {
        this.gateInDateBinding = gateInDateBinding;
    }

    public RichOutputText getGateInDateBinding() {
        return gateInDateBinding;
    }

    public String gateOutAction() {
        OperationBinding operationBinding = executeOperation("gateOutActionBind");
        operationBinding.execute();
        // Add event code here... 
        java.util.Date utilDate = new java.util.Date();
//        this.setGateInBinding(
//        (Timestamp.toTimestamp(new java.sql.Timestamp(utilDate.getTime()).toString())));
//        
//        Date date = new Date();
//        String convertedDate;
//        
//        SimpleDateFormat ddf = new 
        AdfFacesContext.getCurrentInstance().addPartialTarget(getGateInBinding());
        FacesContext fctx = FacesContext.getCurrentInstance();
        String page = fctx.getViewRoot().getViewId();
        ViewHandler viewHandler = fctx.getApplication().getViewHandler();
        UIViewRoot uiViewRoot = viewHandler.createView(fctx, page);
        uiViewRoot.setViewId(page)
;
        fctx.setViewRoot(uiViewRoot);
        return null;
    }
    
    public void refreshPage()
    {
            FacesContext fctx = FacesContext.getCurrentInstance();
            String page = fctx.getViewRoot().getViewId();
            ViewHandler viewHandler = fctx.getApplication().getViewHandler();
            UIViewRoot uiViewRoot = viewHandler.createView(fctx, page);
            uiViewRoot.setViewId(page);
            fctx.setViewRoot(uiViewRoot);
        }

    public void comboSearchFieldPopulateData(ValueChangeEvent valueChangeEvent) {
//        ////System.out.println("Field Populate data is called");
//        String refgatepass = null;
//        
//        DCBindingContainer bindings =
//        (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
//        DCIteratorBinding dcIteratorBindings = bindings.findIteratorBinding("PwcGatePassHeaderVO1Iterator");
//        
//        ViewObject hdrVO = dcIteratorBindings.getViewObject();
//        try{
//            refgatepass = hdrVO.getCurrentRow()
//                                .getAttribute("RefGatePassNo").toString();
//        }catch(Exception e){
//            ;
//        }
//        ////System.out.println("Referance Gate pass value " +refgatepass);
//        ViewObject vo = this.findViewObject("PwcGatePassLinesVO1Iterator");
//
//        if(refgatepass != null){
//           //            Row hdrRow = vo.getCurrentRow();
////            vo.setCurrentRow(hdrRow);
//            //ViewObject linesVO = this.findViewObject("PwcGatePassDetailsVO1Iterator");
//            if(vo.getRowCount() > 0){
//                this.showMessage("You can not Change Refrence gate pass no, Records Exists.","INFO");    
//                    hdrVO.getCurrentRow().setAttribute("RefGatePassNo1", null);
//                return;
//                }
//        }if(refgatepass == null){
//            if(vo.getRowCount() > 0){
//                this.showMessage("You can not Change Refrence gate pass no, Records Exists.","INFO");    
//                hdrVO.getCurrentRow().setAttribute("RefGatePassNo", null);
//                return;
//                }
//            else{ 
        try{    valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
                        OperationBinding operationBinding = executeOperation("populateLinesData");
                        //        OperationBinding operationBinding1 = executeOperation("populateDetailsData");
                        
                        ////System.out.println("In Bean");
                        operationBinding.execute();
                        ////System.out.println("In Bean2");
                        //        operationBinding1.execute();
                        //        ////System.out.println("After Bean 3");
                        AdfFacesContext.getCurrentInstance().addPartialTarget(deliveryLinesTable);
                        AdfFacesContext.getCurrentInstance().addPartialTarget(deliveryLinesPanelBinding);
                        //refreshPage();
//                    }
//        }
        } catch (Exception e) {
            ////System.out.println("Errro Bean");
        }
        ////System.out.println("end of refrence vlaue change");
        
    }

    public void setGatePassTypeBinding(RichSelectOneRadio gatePassTypeBinding) {
        this.gatePassTypeBinding = gatePassTypeBinding;
    }

    public RichSelectOneRadio getGatePassTypeBinding() {
        return gatePassTypeBinding;
    }

    public void setOperatingUnitBinding(RichInputComboboxListOfValues operatingUnitBinding) {
        this.operatingUnitBinding = operatingUnitBinding;
    }

    public RichInputComboboxListOfValues getOperatingUnitBinding() {
        return operatingUnitBinding;
    }

    public void setRefGatePassNoBinding(RichInputComboboxListOfValues refGatePassNoBinding) {
        this.refGatePassNoBinding = refGatePassNoBinding;
    }

    public RichInputComboboxListOfValues getRefGatePassNoBinding() {
        return refGatePassNoBinding;
    }

    public void setGateoutBtnBinding(RichButton gateoutBtnBinding) {
        this.gateoutBtnBinding = gateoutBtnBinding;
    }

    public RichButton getGateoutBtnBinding() {
        return gateoutBtnBinding;
    }

    public void gateOutDateVCListener(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
    }

    public String saveBtnAction() {
        // Add event code here...
//        this.getGateInDateFieldBinding(Timestamp.(new java.sql.Timestamp(utilDate.getTime()).toString()));
        ////System.out.println("Save Action called");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("SaveButtonActionListenerAM");
        operationBinding.execute();
//        AdfFacesContext.getCurrentInstance().addPartialTarget(deliveryLinesPanelBinding);
//        AdfFacesContext.getCurrentInstance().addPartialTarget(deliveryLinesTable);
        //refreshPage();  
//        detaillinecreatebind.setRendered(true);
//        createLinesBtnBinding.setRendered(true);
//        customCreateLinesBtnBinding.setRendered(true);
        return null; 
        
    }

    public void setGateInDateFieldBinding(RichPanelLabelAndMessage gateInDateFieldBinding) {
        this.gateInDateFieldBinding = gateInDateFieldBinding;
    }

    public RichPanelLabelAndMessage getGateInDateFieldBinding() {
        return gateInDateFieldBinding;
    }

    public void setGateInBinding(RichInputDate gateInBinding) {
        this.gateInBinding = gateInBinding;
    }

    public RichInputDate getGateInBinding() {
        return gateInBinding;
    }

    public void setInputOperatingUnitBinding(RichInputText inputOperatingUnitBinding) {
        this.inputOperatingUnitBinding = inputOperatingUnitBinding;
    }

    public RichInputText getInputOperatingUnitBinding() {
        return inputOperatingUnitBinding;
    }

    public void createBtnLines(ActionEvent actionEvent) {
        // Add event code here...
        OperationBinding operationBinding = executeOperation("createBtnLines");
        operationBinding.execute();
    }

    public void setCustomCreateLinesBtnBinding(RichButton customCreateLinesBtnBinding) {
        this.customCreateLinesBtnBinding = customCreateLinesBtnBinding;
    }

    public RichButton getCustomCreateLinesBtnBinding() {
        return customCreateLinesBtnBinding;
    }

    public void populateBtnListener(ActionEvent actionEvent) {
        // Add event code here...
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        String orgId = (String) sessionScope.get("OrgId");
        OperationBinding operationBinding = executeOperation("populateBtnListener");
        operationBinding.execute();
    }

    public void setDisabledFlagBinding(RichInputText disabledFlagBinding) {
        this.disabledFlagBinding = disabledFlagBinding;
    }

    public RichInputText getDisabledFlagBinding() {
        return disabledFlagBinding;
    }

    public void GpWorkflowNotifyBean(ActionEvent actionEvent) {
        // Add event code here...
        BindingContainer GPbindings = getBindings();
        OperationBinding operationBinding = GPbindings.getOperationBinding("SaveButtonActionListenerAM2");
        operationBinding.execute();
        
        
        Object methodReturnValue = operationBinding.getResult();
        String message = null;
        if (methodReturnValue != null) 
        {
            message = methodReturnValue.toString();
            FacesMessage fm = new FacesMessage(message);
            fm.setSeverity(FacesMessage.SEVERITY_INFO);
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, fm);
            return;
        } 
        else{
        ////System.out.println("Before Notify");
        oracle.binding.OperationBinding ob = getBindings().getOperationBinding("sendNotifyforApproval");
        String status = (String)ob.execute();
        
        FacesMessage fm = new FacesMessage(status);
        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, fm);
        
//        BindingContainer bindings = getBindings();
//        DCIteratorBinding dciter = (DCIteratorBinding)bindings.get("PwcGatePassHeaderVO1Iterator");
//        dciter.executeQuery();
//        dciter.refresh(DCIteratorBinding.RANGESIZE_UNLIMITED);
        OperationBinding oobinding = executeOperation("Commit");
        oobinding.execute();
        ////System.out.println("Commit");    
        ///refreshPage();   
        //AdfFacesContext.getCurrentInstance().addPartialTarget(approvastatusbnd);
        }
    }
    public void setSearchFormPanelBinding(RichPanelFormLayout searchFormPanelBinding) {
        this.searchFormPanelBinding = searchFormPanelBinding;
    }

    public RichPanelFormLayout getSearchFormPanelBinding() {
        return searchFormPanelBinding;
    }

    public void setComboInputOperatingUnitBinding(RichInputComboboxListOfValues comboInputOperatingUnitBinding) {
        this.comboInputOperatingUnitBinding = comboInputOperatingUnitBinding;
    }

    public RichInputComboboxListOfValues getComboInputOperatingUnitBinding() {
        return comboInputOperatingUnitBinding;
    }

    public void resetSourceDocFields(ActionEvent actionEvent) {
        // Add event code here...
        
        this.getSearchSourceBinding().setValue("");
        this.getSearchSourceDocNoBinding().setValue("");
        AdfFacesContext.getCurrentInstance().addPartialTarget(getSearchSourceBinding());
        AdfFacesContext.getCurrentInstance().addPartialTarget(getSearchSourceDocNoBinding());
    }

    public void createDeatailAL(ActionEvent actionEvent) {
        ViewObject vo = this.findViewObject("PwcGatePassLinesVO1Iterator");
        Row hdrRow = vo.getCurrentRow();
        vo.setCurrentRow(hdrRow);
        //ViewObject linesVO = this.findViewObject("PwcGatePassDetailsVO1Iterator");
        
        ////System.out.println("Count of parent line " +vo.getRowCount());
        if(vo.getRowCount() <= 0){
            this.showMessage("You can not Create Record, Parent Record not Exists.","ERROR");    
            return;
        }
        else
        {
            OperationBinding operationBinding =
                    executeOperation("createDeatailAL");
            operationBinding.execute();
            AdfFacesContext.getCurrentInstance().addPartialTarget(deliveryDetailTableBinding);
        }
    }
    
    private static Object evaluateEL(String el) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ELContext elContext = facesContext.getELContext();
        ExpressionFactory expressionFactory = facesContext.getApplication().getExpressionFactory();
        ValueExpression exp = expressionFactory.createValueExpression(elContext, el, Object.class);
        return exp.getValue(elContext);
    }
    
    public ViewObject findViewObject(String iterator){        
        
        DCBindingContainer dcb = (DCBindingContainer) evaluateEL("#{bindings}");
        DCIteratorBinding dciter = dcb.findIteratorBinding(iterator);
        return dciter.getViewObject();
        
    }
    
    public void p2DialogListner(DialogEvent dialogEvent) {
            if (dialogEvent.getOutcome().name().equals("yes")) {
                ////System.out.println("In th p2 listner");
                ViewObject vo = this.findViewObject("PwcGatePassLinesVO1Iterator");
                Row hdrRow = vo.getCurrentRow();
                vo.setCurrentRow(hdrRow);
                ViewObject linesVO = this.findViewObject("PwcGatePassDetailsVO1Iterator");
                if(linesVO.getRowCount() > 0){
                    this.showMessage("You can not Delete this Document, Child Records Exists.","INFO");    
                    return;
                } ////System.out.println("in delete"); 
                    OperationBinding ob = executeOperation("Delete");
                    ob.execute();
                    AdfFacesContext.getCurrentInstance().addPartialTarget(deliveryLinesTable);
                    OperationBinding obinding = executeOperation("Commit");
                    obinding.execute();
                    ////System.out.println("Commit");
                    //AdfFacesContext.getCurrentInstance().addPartialTarget(deliveryLinesTable);
                refreshPage();   
            }
        
        
    }
    public void showMessage(String message, String messageType){
           
           FacesMessage fm = new FacesMessage(message);
           if(messageType != null && messageType.toUpperCase().equals("INFO")){
               fm.setSeverity(FacesMessage.SEVERITY_INFO);    
           }else if(messageType != null && messageType.toUpperCase().equals("ERROR")){
               fm.setSeverity(FacesMessage.SEVERITY_INFO);
           }else if(messageType != null && messageType.toUpperCase().equals("WARN")){
               fm.setSeverity(FacesMessage.SEVERITY_WARN);
           }else if(messageType != null && messageType.toUpperCase().equals("FATAL")){
               fm.setSeverity(FacesMessage.SEVERITY_FATAL);
           }
           FacesContext context = FacesContext.getCurrentInstance();
           context.addMessage(null, fm);    
           
       }

    public void p3dialoglistner(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().name().equals("yes")) {
            OperationBinding ob = executeOperation("Delete1");
            ob.execute();
            AdfFacesContext.getCurrentInstance().addPartialTarget(deliveryDetailTableBinding);
            OperationBinding obinding = executeOperation("Commit");
            obinding.execute();
        }
    }

    public void setDeliveryrefres(RichTable deliveryrefres) {
        this.deliveryrefres = deliveryrefres;
    }

    public RichTable getDeliveryrefres() {
        return deliveryrefres;
    }

    public void setDetaillinecreatebind(RichButton detaillinecreatebind) {
        this.detaillinecreatebind = detaillinecreatebind;
    }

    public RichButton getDetaillinecreatebind() {
        return detaillinecreatebind;
    }

    public void setApprovastatusbnd(RichInputText approvastatusbnd) {
        this.approvastatusbnd = approvastatusbnd;
    }

    public RichInputText getApprovastatusbnd() {
        return approvastatusbnd;
    }

    public void AttachementActionListener(ActionEvent actionEvent) {
        OperationBinding operationBinding = executeOperation("AttachementActionListener");
        operationBinding.execute();
        
        if (!operationBinding.getErrors().isEmpty()) {
            ////System.out.println("if errors-->");
        }

        Object methodReturnValue = operationBinding.getResult();
        String message = null;

        if (methodReturnValue != null) {
            message = methodReturnValue.toString();
        } else {
            message = "-1";
        }

        if (message.equals("-1")) {
            FacesMessage fm = new FacesMessage("Failed to call Attachment Form.");
            fm.setSeverity(FacesMessage.SEVERITY_INFO);
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, fm);

        } else {
            FacesContext ctx = FacesContext.getCurrentInstance();
            ExtendedRenderKitService erks = Service.getService(ctx.getRenderKit(), ExtendedRenderKitService.class);
            String url =
                "window.open('" + message +
                "','_blank','toolbar=no,location=no,menubar=no,alwaysRaised=yes,height=500,width=1100');";
            erks.addScript(FacesContext.getCurrentInstance(), url);

        }
    }

    public void operatingUnitVCL(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        
        String OUId = null;
        try{
            OUId = valueChangeEvent.getNewValue().toString();
        }catch(Exception e){
            ;    
        }
        
        
        
        
        
    }

    public void setShiptolocationbinding(RichPanelLabelAndMessage shiptolocationbinding) {
        this.shiptolocationbinding = shiptolocationbinding;
    }

    public RichPanelLabelAndMessage getShiptolocationbinding() {
        return shiptolocationbinding;
    }

    public void setShipToLocationBind(RichInputText shipToLocationBind) {
        this.shipToLocationBind = shipToLocationBind;
    }

    public RichInputText getShipToLocationBind() {
        return shipToLocationBind;
    }

    public void setPartytoaddressbind(RichInputComboboxListOfValues partytoaddressbind) {
        this.partytoaddressbind = partytoaddressbind;
    }

    public RichInputComboboxListOfValues getPartytoaddressbind() {
        return partytoaddressbind;
    }

    public void setPartyaddressgeneric(RichInputText partyaddressgeneric) {
        this.partyaddressgeneric = partyaddressgeneric;
    }

    public RichInputText getPartyaddressgeneric() {
        return partyaddressgeneric;
    }
    
    public void internalFieldValueChangeListener(ValueChangeEvent valueChangeEvent) {
          // Add event code here...
          String newValue = valueChangeEvent.getNewValue().toString();
          System.out.println("================ internalFieldValueChangeListener  new value  : "+ newValue);
          
          if( newValue.equals("true")){
            //  this.getVehicleNo().setVisible(false);
            //  this.getVehicleType().setVisible(false);
            //  this.getDriverName().setVisible(false);
            //  this.getDriverPhone().setVisible(false);
              
    //            this.getVehicleNo().setRequired(false);
    //            this.getVehicleType().setRequired(false);
    //            this.getDriverName().setRequired(false);
    //            this.getDriverPhone().setRequired(false);
              
              this.getVehicleNo().setDisabled(true);
              this.getVehicleType().setDisabled(true);
              this.getDriverName().setDisabled(true);
              this.getDriverPhone().setDisabled(true);
              
              this.getVehicleNo().setValue("N/A");
              this.getVehicleType().setValue("N/A");
              this.getDriverName().setValue("N/A");
              this.getDriverPhone().setValue("N/A");
              this.getSendForApproval().setDisabled(true);   
              
          }
          else if (newValue.equals("false") ){
    //            this.getVehicleNo().setVisible(true);
    //            this.getVehicleType().setVisible(true);
    //            this.getDriverName().setVisible(true);
    //            this.getDriverPhone().setVisible(true);
    //
    //            this.getVehicleNo().setRequired(true);
    //            this.getVehicleType().setRequired(true);
    //            this.getDriverName().setRequired(true);
    //            this.getDriverPhone().setRequired(true);
              
              this.getVehicleNo().setDisabled(false);
              this.getVehicleType().setDisabled(false);
              this.getDriverName().setDisabled(false);
              this.getDriverPhone().setDisabled(false);
              
              this.getVehicleNo().setValue("");
              this.getVehicleType().setValue("");
              this.getDriverName().setValue("");
              this.getDriverPhone().setValue("");
              this.getSendForApproval().setDisabled(false);   
              
          }
          
          AdfFacesContext.getCurrentInstance().addPartialTarget(this.getVehicleNo());
          AdfFacesContext.getCurrentInstance().addPartialTarget(this.getVehicleType());
          AdfFacesContext.getCurrentInstance().addPartialTarget(this.getDriverName());
          AdfFacesContext.getCurrentInstance().addPartialTarget(this.getDriverPhone());
          AdfFacesContext.getCurrentInstance().addPartialTarget(this.getSendForApproval());
      }
    
    public void setVehicleType(RichInputComboboxListOfValues vehicleType) {
          this.vehicleType = vehicleType;
      }

      public RichInputComboboxListOfValues getVehicleType() {
          return vehicleType;
      }

      public void setVehicleNo(RichInputText vehicleNo) {
          this.vehicleNo = vehicleNo;
      }

      public RichInputText getVehicleNo() {
          return vehicleNo;
      }

      public void setDriverName(RichInputText driverName) {
          this.driverName = driverName;
      }

      public RichInputText getDriverName() {
          return driverName;
      }

      public void setDriverPhone(RichInputText driverPhone) {
          this.driverPhone = driverPhone;
      }

      public RichInputText getDriverPhone() {
          return driverPhone;
      }


      public void setSendForApproval(RichButton sendForApproval) {
          this.sendForApproval = sendForApproval;
      }

      public RichButton getSendForApproval() {
          return sendForApproval;
      }
    public void reverseGatePass(ActionEvent actionEvent) {
        // Add event code here...
        OperationBinding operationBinding = executeOperation("reverseGatePass");
        operationBinding.execute();
        
        AdfFacesContext.getCurrentInstance().addPartialTarget(this.getSearhPageHeaderTable());
    
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO , "",  "GatePass Approval Reversed Successfully!");
            FacesContext.getCurrentInstance().addMessage(null, message);
        
    }
    public void setSearhPageHeaderTable(RichTable searhPageHeaderTable) {
        this.searhPageHeaderTable = searhPageHeaderTable;
    }

    public RichTable getSearhPageHeaderTable() {
        return searhPageHeaderTable;
    }
    
}
