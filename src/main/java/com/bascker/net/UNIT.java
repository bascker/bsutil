package com.bascker.net;

public enum  UNIT {

    BIT(1), BYTE(8 * BIT.val), KB(1024 * BIT.val),
    MB(1024 * KB.val), GB(1024 * MB.val);

    private long val;

    UNIT (long value) {
        this.val = value;
    }

    /**
     * 默认转 KB
     * @return the val of KB
     */
    public long value() {
        return value(KB);
    }

    public long value(final UNIT unit) {
        return val / unit.val;
    }

    public int intValue() {
        return intValue(KB);
    }

    public int intValue(final UNIT unit) {
        return new Long(value(unit)).intValue();
    }

}
