package model.LOV;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jun 19 14:08:32 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class GatePassTypeLOVRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        GpType;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return GatePassTypeLOVRowImpl.AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return GatePassTypeLOVRowImpl.AttributesEnum.firstIndex() + GatePassTypeLOVRowImpl.AttributesEnum
                                                                                              .staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = GatePassTypeLOVRowImpl.AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int GPTYPE = AttributesEnum.GpType.index();

    /**
     * This is the default constructor (do not remove).
     */
    public GatePassTypeLOVRowImpl() {
    }
}

