package com.kjc.constant;

/**
 * @Author: Kjc
 * @Description:
 * @Date: Create in 16:57 2017-12-06
 */
public enum MsgCode {

    SUCCESS(200) {
        public String getName() {
            return "成功";
        }
    },
    FAIL(203){
        public String getName() {
            return "失败";
        }
    };
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private MsgCode(int value){
        this.setValue(value);
    }

    public static MsgCode valueOf(int value){
        for(MsgCode type:MsgCode.values()){
            if(type.getValue()==value){
                return type;
            }
        }
        return null;
    }
    public abstract String getName();
}
