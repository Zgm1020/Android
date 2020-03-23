package com.jd.myapplication.domain;

import java.util.List;

public class JsonResult {

    /**
     * Result : True
     * Message : [{"MPO_ID":1,"MPO_CODE":"P0X190200018","MPO_NAME":"JDPOORD050135下推","MPO_TYPE":"K3下推","MPO_PRIORITY":"","MPO_FOLLOW_USER_ID":-1,"MPO_FOLLOW_USER_NAME":"","MPO_FOLLOW_USER_NUMBER":"","MPO_PRICE_CONFIRM_USER_ID":-1,"MPO_PRICE_CONFIRM_USER_NAME":"王洪蕊","MPO_PRICE_CONFIRM_USER_NUMBER":"201405069","MPO_PRICE_CONFIRM_TIME":"2019-01-17T00:00:00","MPO_CONTRACT_REVIEW_USER_ID":1785,"MPO_CONTRACT_REVIEW_USER_NAME":"李爱仙","MPO_CONTRACT_REVIEW_USER_NUMBER":"200106001","MPO_CONTRACT_REVIEW_TIME":"2019-01-17T00:00:00","MPO_CREATE_USER_ID":0,"MPO_CREATE_USER_NAME":"","MPO_CREATE_USER_NUMBER":"","MPO_CREATE_TIME":"2019-02-28T11:12:17","MPO_CHECK_GUID":"","MPO_CHECK_STATUS":1,"MPO_CHECK_COMMENT":"","MPO_CHECK_TIME":"2019-02-28T11:12:24.073","MPO_PROCESS_STATUS":0,"MPO_STATUS":1,"MPO_COMMENT":"","MPO_ACCOUNT":3,"MPOM_ID":1,"MPO_ID1":1,"MAT_ID":522653,"MAT_CODE":"2260.4732.100003","MAT_NAME":"交流接触器","MAT_GRAPHICS":"","MAT_TYPE":"零件易耗品","MAT_MODE":"LC1N3210B7N（32A AC24V 50/60Hz 1NO）","MAT_SPECIFICATION":"","MAT_MODE_SPECIFCATION":"LC1N3210B7N（32A AC24V 50/60Hz 1NO）","MAT_PURCHASE_UNIT":"个","MAT_COLOR":"","MAT_MATERIAL":"0","MAT_IS_INSTANCE":2,"MAT_PURCHASE_COUNT":2,"MAT_SINGLE_USE_COUNT":1,"MAT_ALLOW_DELIVERY_COUNT":2,"MAT_STOCT_COUNT_BEFORE_ORDER":0,"MPOM_SUPPLY_MAT_CODE":"","MPOM_IS_PRESENTED":40069,"MPOM_PRESENTED_COUNT":0,"MPOM_EXPECT_RECE_TIME":"2019-01-22T00:00:00","MPOM_ACTUAL_DELIVERY_TIME":"2019-01-22T00:00:00","MPOM_TECHNICAL_REQUIRE":"","MPOM_DELIVERY_REQUIRE":"","MPOM_PRICE_NOTE":"","MPOM_CHECK_METHOD":"免检","MPOM_DELIVERY_WAY":"整批","MPOM_IS_PICTURE":2,"MPOM_MAT_PICTURE":"","MPOM_CHECK_STATUS":1,"MPOM_PROCESS_STATUS":0,"MPOM_STATUS":1,"MPOM_COMMENT":"","K3_ENTRY_LINE_NUMBER":"1","K3_INTERNAL_NUMBER":"62023","MPOS_ID":1,"MPO_ID2":1,"MPOS_SUPPLY_ID":767,"MPOS_SUPPLY_NAME":"北京众恒恒信自动化设备有限公司","MPOS_SUPPLY_CODE":"G0652","MPOS_SUPPLY_TYPE":1,"MPOS_SUPPLY_ADDRESS":"","MPOS_BANK_ACCOUNT":"0200 2042 0920 0044 055","MPOS_BANK_NAME":"中国工商银行股份有限公司北京朗琴园支行","MPOS_BALANCE_TYPE":"月结","MPOS_CONTRACT_OR_ORDER":"合同","MPOS_TELEPHONE":"010-60801188-1228","MPOS_FAX":"010-60803963/60803978","JD_RECE_TELEPHONE":"0316-6072907","JD_FAX":"","JD_RECE_ADDRESS":"065001","MPOS_STATUS":1,"MPOS_COMMENT":""}]
     */

    private String Result;
    private List<MessageBean> Message;

    public String getResult() {
        return Result;
    }

    public void setResult(String Result) {
        this.Result = Result;
    }

    public List<MessageBean> getMessage() {
        return Message;
    }

    public void setMessage(List<MessageBean> Message) {
        this.Message = Message;
    }

    public static class MessageBean {
        /**
         * MPO_ID : 1
         * MPO_CODE : P0X190200018
         * MPO_NAME : JDPOORD050135下推
         * MPO_TYPE : K3下推
         * MPO_PRIORITY :
         * MPO_FOLLOW_USER_ID : -1
         * MPO_FOLLOW_USER_NAME :
         * MPO_FOLLOW_USER_NUMBER :
         * MPO_PRICE_CONFIRM_USER_ID : -1
         * MPO_PRICE_CONFIRM_USER_NAME : 王洪蕊
         * MPO_PRICE_CONFIRM_USER_NUMBER : 201405069
         * MPO_PRICE_CONFIRM_TIME : 2019-01-17T00:00:00
         * MPO_CONTRACT_REVIEW_USER_ID : 1785
         * MPO_CONTRACT_REVIEW_USER_NAME : 李爱仙
         * MPO_CONTRACT_REVIEW_USER_NUMBER : 200106001
         * MPO_CONTRACT_REVIEW_TIME : 2019-01-17T00:00:00
         * MPO_CREATE_USER_ID : 0
         * MPO_CREATE_USER_NAME :
         * MPO_CREATE_USER_NUMBER :
         * MPO_CREATE_TIME : 2019-02-28T11:12:17
         * MPO_CHECK_GUID :
         * MPO_CHECK_STATUS : 1
         * MPO_CHECK_COMMENT :
         * MPO_CHECK_TIME : 2019-02-28T11:12:24.073
         * MPO_PROCESS_STATUS : 0
         * MPO_STATUS : 1
         * MPO_COMMENT :
         * MPO_ACCOUNT : 3
         * MPOM_ID : 1
         * MPO_ID1 : 1
         * MAT_ID : 522653
         * MAT_CODE : 2260.4732.100003
         * MAT_NAME : 交流接触器
         * MAT_GRAPHICS :
         * MAT_TYPE : 零件易耗品
         * MAT_MODE : LC1N3210B7N（32A AC24V 50/60Hz 1NO）
         * MAT_SPECIFICATION :
         * MAT_MODE_SPECIFCATION : LC1N3210B7N（32A AC24V 50/60Hz 1NO）
         * MAT_PURCHASE_UNIT : 个
         * MAT_COLOR :
         * MAT_MATERIAL : 0
         * MAT_IS_INSTANCE : 2
         * MAT_PURCHASE_COUNT : 2
         * MAT_SINGLE_USE_COUNT : 1
         * MAT_ALLOW_DELIVERY_COUNT : 2
         * MAT_STOCT_COUNT_BEFORE_ORDER : 0
         * MPOM_SUPPLY_MAT_CODE :
         * MPOM_IS_PRESENTED : 40069
         * MPOM_PRESENTED_COUNT : 0
         * MPOM_EXPECT_RECE_TIME : 2019-01-22T00:00:00
         * MPOM_ACTUAL_DELIVERY_TIME : 2019-01-22T00:00:00
         * MPOM_TECHNICAL_REQUIRE :
         * MPOM_DELIVERY_REQUIRE :
         * MPOM_PRICE_NOTE :
         * MPOM_CHECK_METHOD : 免检
         * MPOM_DELIVERY_WAY : 整批
         * MPOM_IS_PICTURE : 2
         * MPOM_MAT_PICTURE :
         * MPOM_CHECK_STATUS : 1
         * MPOM_PROCESS_STATUS : 0
         * MPOM_STATUS : 1
         * MPOM_COMMENT :
         * K3_ENTRY_LINE_NUMBER : 1
         * K3_INTERNAL_NUMBER : 62023
         * MPOS_ID : 1
         * MPO_ID2 : 1
         * MPOS_SUPPLY_ID : 767
         * MPOS_SUPPLY_NAME : 北京众恒恒信自动化设备有限公司
         * MPOS_SUPPLY_CODE : G0652
         * MPOS_SUPPLY_TYPE : 1
         * MPOS_SUPPLY_ADDRESS :
         * MPOS_BANK_ACCOUNT : 0200 2042 0920 0044 055
         * MPOS_BANK_NAME : 中国工商银行股份有限公司北京朗琴园支行
         * MPOS_BALANCE_TYPE : 月结
         * MPOS_CONTRACT_OR_ORDER : 合同
         * MPOS_TELEPHONE : 010-60801188-1228
         * MPOS_FAX : 010-60803963/60803978
         * JD_RECE_TELEPHONE : 0316-6072907
         * JD_FAX :
         * JD_RECE_ADDRESS : 065001
         * MPOS_STATUS : 1
         * MPOS_COMMENT :
         */

        private int MPO_ID;
        private String MPO_CODE;
        private String MPO_NAME;
        private String MPO_TYPE;
        private String MPO_PRIORITY;
        private int MPO_FOLLOW_USER_ID;
        private String MPO_FOLLOW_USER_NAME;
        private String MPO_FOLLOW_USER_NUMBER;
        private int MPO_PRICE_CONFIRM_USER_ID;
        private String MPO_PRICE_CONFIRM_USER_NAME;
        private String MPO_PRICE_CONFIRM_USER_NUMBER;
        private String MPO_PRICE_CONFIRM_TIME;
        private int MPO_CONTRACT_REVIEW_USER_ID;
        private String MPO_CONTRACT_REVIEW_USER_NAME;
        private String MPO_CONTRACT_REVIEW_USER_NUMBER;
        private String MPO_CONTRACT_REVIEW_TIME;
        private int MPO_CREATE_USER_ID;
        private String MPO_CREATE_USER_NAME;
        private String MPO_CREATE_USER_NUMBER;
        private String MPO_CREATE_TIME;
        private String MPO_CHECK_GUID;
        private int MPO_CHECK_STATUS;
        private String MPO_CHECK_COMMENT;
        private String MPO_CHECK_TIME;
        private int MPO_PROCESS_STATUS;
        private int MPO_STATUS;
        private String MPO_COMMENT;
        private int MPO_ACCOUNT;
        private int MPOM_ID;
        private int MPO_ID1;
        private int MAT_ID;
        private String MAT_CODE;
        private String MAT_NAME;
        private String MAT_GRAPHICS;
        private String MAT_TYPE;
        private String MAT_MODE;
        private String MAT_SPECIFICATION;
        private String MAT_MODE_SPECIFCATION;
        private String MAT_PURCHASE_UNIT;
        private String MAT_COLOR;
        private String MAT_MATERIAL;
        private int MAT_IS_INSTANCE;
        private int MAT_PURCHASE_COUNT;
        private int MAT_SINGLE_USE_COUNT;
        private int MAT_ALLOW_DELIVERY_COUNT;
        private int MAT_STOCT_COUNT_BEFORE_ORDER;
        private String MPOM_SUPPLY_MAT_CODE;
        private int MPOM_IS_PRESENTED;
        private int MPOM_PRESENTED_COUNT;
        private String MPOM_EXPECT_RECE_TIME;
        private String MPOM_ACTUAL_DELIVERY_TIME;
        private String MPOM_TECHNICAL_REQUIRE;
        private String MPOM_DELIVERY_REQUIRE;
        private String MPOM_PRICE_NOTE;
        private String MPOM_CHECK_METHOD;
        private String MPOM_DELIVERY_WAY;
        private int MPOM_IS_PICTURE;
        private String MPOM_MAT_PICTURE;
        private int MPOM_CHECK_STATUS;
        private int MPOM_PROCESS_STATUS;
        private int MPOM_STATUS;
        private String MPOM_COMMENT;
        private String K3_ENTRY_LINE_NUMBER;
        private String K3_INTERNAL_NUMBER;
        private int MPOS_ID;
        private int MPO_ID2;
        private int MPOS_SUPPLY_ID;
        private String MPOS_SUPPLY_NAME;
        private String MPOS_SUPPLY_CODE;
        private int MPOS_SUPPLY_TYPE;
        private String MPOS_SUPPLY_ADDRESS;
        private String MPOS_BANK_ACCOUNT;
        private String MPOS_BANK_NAME;
        private String MPOS_BALANCE_TYPE;
        private String MPOS_CONTRACT_OR_ORDER;
        private String MPOS_TELEPHONE;
        private String MPOS_FAX;
        private String JD_RECE_TELEPHONE;
        private String JD_FAX;
        private String JD_RECE_ADDRESS;
        private int MPOS_STATUS;
        private String MPOS_COMMENT;

        public int getMPO_ID() {
            return MPO_ID;
        }

        public void setMPO_ID(int MPO_ID) {
            this.MPO_ID = MPO_ID;
        }

        public String getMPO_CODE() {
            return MPO_CODE;
        }

        public void setMPO_CODE(String MPO_CODE) {
            this.MPO_CODE = MPO_CODE;
        }

        public String getMPO_NAME() {
            return MPO_NAME;
        }

        public void setMPO_NAME(String MPO_NAME) {
            this.MPO_NAME = MPO_NAME;
        }

        public String getMPO_TYPE() {
            return MPO_TYPE;
        }

        public void setMPO_TYPE(String MPO_TYPE) {
            this.MPO_TYPE = MPO_TYPE;
        }

        public String getMPO_PRIORITY() {
            return MPO_PRIORITY;
        }

        public void setMPO_PRIORITY(String MPO_PRIORITY) {
            this.MPO_PRIORITY = MPO_PRIORITY;
        }

        public int getMPO_FOLLOW_USER_ID() {
            return MPO_FOLLOW_USER_ID;
        }

        public void setMPO_FOLLOW_USER_ID(int MPO_FOLLOW_USER_ID) {
            this.MPO_FOLLOW_USER_ID = MPO_FOLLOW_USER_ID;
        }

        public String getMPO_FOLLOW_USER_NAME() {
            return MPO_FOLLOW_USER_NAME;
        }

        public void setMPO_FOLLOW_USER_NAME(String MPO_FOLLOW_USER_NAME) {
            this.MPO_FOLLOW_USER_NAME = MPO_FOLLOW_USER_NAME;
        }

        public String getMPO_FOLLOW_USER_NUMBER() {
            return MPO_FOLLOW_USER_NUMBER;
        }

        public void setMPO_FOLLOW_USER_NUMBER(String MPO_FOLLOW_USER_NUMBER) {
            this.MPO_FOLLOW_USER_NUMBER = MPO_FOLLOW_USER_NUMBER;
        }

        public int getMPO_PRICE_CONFIRM_USER_ID() {
            return MPO_PRICE_CONFIRM_USER_ID;
        }

        public void setMPO_PRICE_CONFIRM_USER_ID(int MPO_PRICE_CONFIRM_USER_ID) {
            this.MPO_PRICE_CONFIRM_USER_ID = MPO_PRICE_CONFIRM_USER_ID;
        }

        public String getMPO_PRICE_CONFIRM_USER_NAME() {
            return MPO_PRICE_CONFIRM_USER_NAME;
        }

        public void setMPO_PRICE_CONFIRM_USER_NAME(String MPO_PRICE_CONFIRM_USER_NAME) {
            this.MPO_PRICE_CONFIRM_USER_NAME = MPO_PRICE_CONFIRM_USER_NAME;
        }

        public String getMPO_PRICE_CONFIRM_USER_NUMBER() {
            return MPO_PRICE_CONFIRM_USER_NUMBER;
        }

        public void setMPO_PRICE_CONFIRM_USER_NUMBER(String MPO_PRICE_CONFIRM_USER_NUMBER) {
            this.MPO_PRICE_CONFIRM_USER_NUMBER = MPO_PRICE_CONFIRM_USER_NUMBER;
        }

        public String getMPO_PRICE_CONFIRM_TIME() {
            return MPO_PRICE_CONFIRM_TIME;
        }

        public void setMPO_PRICE_CONFIRM_TIME(String MPO_PRICE_CONFIRM_TIME) {
            this.MPO_PRICE_CONFIRM_TIME = MPO_PRICE_CONFIRM_TIME;
        }

        public int getMPO_CONTRACT_REVIEW_USER_ID() {
            return MPO_CONTRACT_REVIEW_USER_ID;
        }

        public void setMPO_CONTRACT_REVIEW_USER_ID(int MPO_CONTRACT_REVIEW_USER_ID) {
            this.MPO_CONTRACT_REVIEW_USER_ID = MPO_CONTRACT_REVIEW_USER_ID;
        }

        public String getMPO_CONTRACT_REVIEW_USER_NAME() {
            return MPO_CONTRACT_REVIEW_USER_NAME;
        }

        public void setMPO_CONTRACT_REVIEW_USER_NAME(String MPO_CONTRACT_REVIEW_USER_NAME) {
            this.MPO_CONTRACT_REVIEW_USER_NAME = MPO_CONTRACT_REVIEW_USER_NAME;
        }

        public String getMPO_CONTRACT_REVIEW_USER_NUMBER() {
            return MPO_CONTRACT_REVIEW_USER_NUMBER;
        }

        public void setMPO_CONTRACT_REVIEW_USER_NUMBER(String MPO_CONTRACT_REVIEW_USER_NUMBER) {
            this.MPO_CONTRACT_REVIEW_USER_NUMBER = MPO_CONTRACT_REVIEW_USER_NUMBER;
        }

        public String getMPO_CONTRACT_REVIEW_TIME() {
            return MPO_CONTRACT_REVIEW_TIME;
        }

        public void setMPO_CONTRACT_REVIEW_TIME(String MPO_CONTRACT_REVIEW_TIME) {
            this.MPO_CONTRACT_REVIEW_TIME = MPO_CONTRACT_REVIEW_TIME;
        }

        public int getMPO_CREATE_USER_ID() {
            return MPO_CREATE_USER_ID;
        }

        public void setMPO_CREATE_USER_ID(int MPO_CREATE_USER_ID) {
            this.MPO_CREATE_USER_ID = MPO_CREATE_USER_ID;
        }

        public String getMPO_CREATE_USER_NAME() {
            return MPO_CREATE_USER_NAME;
        }

        public void setMPO_CREATE_USER_NAME(String MPO_CREATE_USER_NAME) {
            this.MPO_CREATE_USER_NAME = MPO_CREATE_USER_NAME;
        }

        public String getMPO_CREATE_USER_NUMBER() {
            return MPO_CREATE_USER_NUMBER;
        }

        public void setMPO_CREATE_USER_NUMBER(String MPO_CREATE_USER_NUMBER) {
            this.MPO_CREATE_USER_NUMBER = MPO_CREATE_USER_NUMBER;
        }

        public String getMPO_CREATE_TIME() {
            return MPO_CREATE_TIME;
        }

        public void setMPO_CREATE_TIME(String MPO_CREATE_TIME) {
            this.MPO_CREATE_TIME = MPO_CREATE_TIME;
        }

        public String getMPO_CHECK_GUID() {
            return MPO_CHECK_GUID;
        }

        public void setMPO_CHECK_GUID(String MPO_CHECK_GUID) {
            this.MPO_CHECK_GUID = MPO_CHECK_GUID;
        }

        public int getMPO_CHECK_STATUS() {
            return MPO_CHECK_STATUS;
        }

        public void setMPO_CHECK_STATUS(int MPO_CHECK_STATUS) {
            this.MPO_CHECK_STATUS = MPO_CHECK_STATUS;
        }

        public String getMPO_CHECK_COMMENT() {
            return MPO_CHECK_COMMENT;
        }

        public void setMPO_CHECK_COMMENT(String MPO_CHECK_COMMENT) {
            this.MPO_CHECK_COMMENT = MPO_CHECK_COMMENT;
        }

        public String getMPO_CHECK_TIME() {
            return MPO_CHECK_TIME;
        }

        public void setMPO_CHECK_TIME(String MPO_CHECK_TIME) {
            this.MPO_CHECK_TIME = MPO_CHECK_TIME;
        }

        public int getMPO_PROCESS_STATUS() {
            return MPO_PROCESS_STATUS;
        }

        public void setMPO_PROCESS_STATUS(int MPO_PROCESS_STATUS) {
            this.MPO_PROCESS_STATUS = MPO_PROCESS_STATUS;
        }

        public int getMPO_STATUS() {
            return MPO_STATUS;
        }

        public void setMPO_STATUS(int MPO_STATUS) {
            this.MPO_STATUS = MPO_STATUS;
        }

        public String getMPO_COMMENT() {
            return MPO_COMMENT;
        }

        public void setMPO_COMMENT(String MPO_COMMENT) {
            this.MPO_COMMENT = MPO_COMMENT;
        }

        public int getMPO_ACCOUNT() {
            return MPO_ACCOUNT;
        }

        public void setMPO_ACCOUNT(int MPO_ACCOUNT) {
            this.MPO_ACCOUNT = MPO_ACCOUNT;
        }

        public int getMPOM_ID() {
            return MPOM_ID;
        }

        public void setMPOM_ID(int MPOM_ID) {
            this.MPOM_ID = MPOM_ID;
        }

        public int getMPO_ID1() {
            return MPO_ID1;
        }

        public void setMPO_ID1(int MPO_ID1) {
            this.MPO_ID1 = MPO_ID1;
        }

        public int getMAT_ID() {
            return MAT_ID;
        }

        public void setMAT_ID(int MAT_ID) {
            this.MAT_ID = MAT_ID;
        }

        public String getMAT_CODE() {
            return MAT_CODE;
        }

        public void setMAT_CODE(String MAT_CODE) {
            this.MAT_CODE = MAT_CODE;
        }

        public String getMAT_NAME() {
            return MAT_NAME;
        }

        public void setMAT_NAME(String MAT_NAME) {
            this.MAT_NAME = MAT_NAME;
        }

        public String getMAT_GRAPHICS() {
            return MAT_GRAPHICS;
        }

        public void setMAT_GRAPHICS(String MAT_GRAPHICS) {
            this.MAT_GRAPHICS = MAT_GRAPHICS;
        }

        public String getMAT_TYPE() {
            return MAT_TYPE;
        }

        public void setMAT_TYPE(String MAT_TYPE) {
            this.MAT_TYPE = MAT_TYPE;
        }

        public String getMAT_MODE() {
            return MAT_MODE;
        }

        public void setMAT_MODE(String MAT_MODE) {
            this.MAT_MODE = MAT_MODE;
        }

        public String getMAT_SPECIFICATION() {
            return MAT_SPECIFICATION;
        }

        public void setMAT_SPECIFICATION(String MAT_SPECIFICATION) {
            this.MAT_SPECIFICATION = MAT_SPECIFICATION;
        }

        public String getMAT_MODE_SPECIFCATION() {
            return MAT_MODE_SPECIFCATION;
        }

        public void setMAT_MODE_SPECIFCATION(String MAT_MODE_SPECIFCATION) {
            this.MAT_MODE_SPECIFCATION = MAT_MODE_SPECIFCATION;
        }

        public String getMAT_PURCHASE_UNIT() {
            return MAT_PURCHASE_UNIT;
        }

        public void setMAT_PURCHASE_UNIT(String MAT_PURCHASE_UNIT) {
            this.MAT_PURCHASE_UNIT = MAT_PURCHASE_UNIT;
        }

        public String getMAT_COLOR() {
            return MAT_COLOR;
        }

        public void setMAT_COLOR(String MAT_COLOR) {
            this.MAT_COLOR = MAT_COLOR;
        }

        public String getMAT_MATERIAL() {
            return MAT_MATERIAL;
        }

        public void setMAT_MATERIAL(String MAT_MATERIAL) {
            this.MAT_MATERIAL = MAT_MATERIAL;
        }

        public int getMAT_IS_INSTANCE() {
            return MAT_IS_INSTANCE;
        }

        public void setMAT_IS_INSTANCE(int MAT_IS_INSTANCE) {
            this.MAT_IS_INSTANCE = MAT_IS_INSTANCE;
        }

        public int getMAT_PURCHASE_COUNT() {
            return MAT_PURCHASE_COUNT;
        }

        public void setMAT_PURCHASE_COUNT(int MAT_PURCHASE_COUNT) {
            this.MAT_PURCHASE_COUNT = MAT_PURCHASE_COUNT;
        }

        public int getMAT_SINGLE_USE_COUNT() {
            return MAT_SINGLE_USE_COUNT;
        }

        public void setMAT_SINGLE_USE_COUNT(int MAT_SINGLE_USE_COUNT) {
            this.MAT_SINGLE_USE_COUNT = MAT_SINGLE_USE_COUNT;
        }

        public int getMAT_ALLOW_DELIVERY_COUNT() {
            return MAT_ALLOW_DELIVERY_COUNT;
        }

        public void setMAT_ALLOW_DELIVERY_COUNT(int MAT_ALLOW_DELIVERY_COUNT) {
            this.MAT_ALLOW_DELIVERY_COUNT = MAT_ALLOW_DELIVERY_COUNT;
        }

        public int getMAT_STOCT_COUNT_BEFORE_ORDER() {
            return MAT_STOCT_COUNT_BEFORE_ORDER;
        }

        public void setMAT_STOCT_COUNT_BEFORE_ORDER(int MAT_STOCT_COUNT_BEFORE_ORDER) {
            this.MAT_STOCT_COUNT_BEFORE_ORDER = MAT_STOCT_COUNT_BEFORE_ORDER;
        }

        public String getMPOM_SUPPLY_MAT_CODE() {
            return MPOM_SUPPLY_MAT_CODE;
        }

        public void setMPOM_SUPPLY_MAT_CODE(String MPOM_SUPPLY_MAT_CODE) {
            this.MPOM_SUPPLY_MAT_CODE = MPOM_SUPPLY_MAT_CODE;
        }

        public int getMPOM_IS_PRESENTED() {
            return MPOM_IS_PRESENTED;
        }

        public void setMPOM_IS_PRESENTED(int MPOM_IS_PRESENTED) {
            this.MPOM_IS_PRESENTED = MPOM_IS_PRESENTED;
        }

        public int getMPOM_PRESENTED_COUNT() {
            return MPOM_PRESENTED_COUNT;
        }

        public void setMPOM_PRESENTED_COUNT(int MPOM_PRESENTED_COUNT) {
            this.MPOM_PRESENTED_COUNT = MPOM_PRESENTED_COUNT;
        }

        public String getMPOM_EXPECT_RECE_TIME() {
            return MPOM_EXPECT_RECE_TIME;
        }

        public void setMPOM_EXPECT_RECE_TIME(String MPOM_EXPECT_RECE_TIME) {
            this.MPOM_EXPECT_RECE_TIME = MPOM_EXPECT_RECE_TIME;
        }

        public String getMPOM_ACTUAL_DELIVERY_TIME() {
            return MPOM_ACTUAL_DELIVERY_TIME;
        }

        public void setMPOM_ACTUAL_DELIVERY_TIME(String MPOM_ACTUAL_DELIVERY_TIME) {
            this.MPOM_ACTUAL_DELIVERY_TIME = MPOM_ACTUAL_DELIVERY_TIME;
        }

        public String getMPOM_TECHNICAL_REQUIRE() {
            return MPOM_TECHNICAL_REQUIRE;
        }

        public void setMPOM_TECHNICAL_REQUIRE(String MPOM_TECHNICAL_REQUIRE) {
            this.MPOM_TECHNICAL_REQUIRE = MPOM_TECHNICAL_REQUIRE;
        }

        public String getMPOM_DELIVERY_REQUIRE() {
            return MPOM_DELIVERY_REQUIRE;
        }

        public void setMPOM_DELIVERY_REQUIRE(String MPOM_DELIVERY_REQUIRE) {
            this.MPOM_DELIVERY_REQUIRE = MPOM_DELIVERY_REQUIRE;
        }

        public String getMPOM_PRICE_NOTE() {
            return MPOM_PRICE_NOTE;
        }

        public void setMPOM_PRICE_NOTE(String MPOM_PRICE_NOTE) {
            this.MPOM_PRICE_NOTE = MPOM_PRICE_NOTE;
        }

        public String getMPOM_CHECK_METHOD() {
            return MPOM_CHECK_METHOD;
        }

        public void setMPOM_CHECK_METHOD(String MPOM_CHECK_METHOD) {
            this.MPOM_CHECK_METHOD = MPOM_CHECK_METHOD;
        }

        public String getMPOM_DELIVERY_WAY() {
            return MPOM_DELIVERY_WAY;
        }

        public void setMPOM_DELIVERY_WAY(String MPOM_DELIVERY_WAY) {
            this.MPOM_DELIVERY_WAY = MPOM_DELIVERY_WAY;
        }

        public int getMPOM_IS_PICTURE() {
            return MPOM_IS_PICTURE;
        }

        public void setMPOM_IS_PICTURE(int MPOM_IS_PICTURE) {
            this.MPOM_IS_PICTURE = MPOM_IS_PICTURE;
        }

        public String getMPOM_MAT_PICTURE() {
            return MPOM_MAT_PICTURE;
        }

        public void setMPOM_MAT_PICTURE(String MPOM_MAT_PICTURE) {
            this.MPOM_MAT_PICTURE = MPOM_MAT_PICTURE;
        }

        public int getMPOM_CHECK_STATUS() {
            return MPOM_CHECK_STATUS;
        }

        public void setMPOM_CHECK_STATUS(int MPOM_CHECK_STATUS) {
            this.MPOM_CHECK_STATUS = MPOM_CHECK_STATUS;
        }

        public int getMPOM_PROCESS_STATUS() {
            return MPOM_PROCESS_STATUS;
        }

        public void setMPOM_PROCESS_STATUS(int MPOM_PROCESS_STATUS) {
            this.MPOM_PROCESS_STATUS = MPOM_PROCESS_STATUS;
        }

        public int getMPOM_STATUS() {
            return MPOM_STATUS;
        }

        public void setMPOM_STATUS(int MPOM_STATUS) {
            this.MPOM_STATUS = MPOM_STATUS;
        }

        public String getMPOM_COMMENT() {
            return MPOM_COMMENT;
        }

        public void setMPOM_COMMENT(String MPOM_COMMENT) {
            this.MPOM_COMMENT = MPOM_COMMENT;
        }

        public String getK3_ENTRY_LINE_NUMBER() {
            return K3_ENTRY_LINE_NUMBER;
        }

        public void setK3_ENTRY_LINE_NUMBER(String K3_ENTRY_LINE_NUMBER) {
            this.K3_ENTRY_LINE_NUMBER = K3_ENTRY_LINE_NUMBER;
        }

        public String getK3_INTERNAL_NUMBER() {
            return K3_INTERNAL_NUMBER;
        }

        public void setK3_INTERNAL_NUMBER(String K3_INTERNAL_NUMBER) {
            this.K3_INTERNAL_NUMBER = K3_INTERNAL_NUMBER;
        }

        public int getMPOS_ID() {
            return MPOS_ID;
        }

        public void setMPOS_ID(int MPOS_ID) {
            this.MPOS_ID = MPOS_ID;
        }

        public int getMPO_ID2() {
            return MPO_ID2;
        }

        public void setMPO_ID2(int MPO_ID2) {
            this.MPO_ID2 = MPO_ID2;
        }

        public int getMPOS_SUPPLY_ID() {
            return MPOS_SUPPLY_ID;
        }

        public void setMPOS_SUPPLY_ID(int MPOS_SUPPLY_ID) {
            this.MPOS_SUPPLY_ID = MPOS_SUPPLY_ID;
        }

        public String getMPOS_SUPPLY_NAME() {
            return MPOS_SUPPLY_NAME;
        }

        public void setMPOS_SUPPLY_NAME(String MPOS_SUPPLY_NAME) {
            this.MPOS_SUPPLY_NAME = MPOS_SUPPLY_NAME;
        }

        public String getMPOS_SUPPLY_CODE() {
            return MPOS_SUPPLY_CODE;
        }

        public void setMPOS_SUPPLY_CODE(String MPOS_SUPPLY_CODE) {
            this.MPOS_SUPPLY_CODE = MPOS_SUPPLY_CODE;
        }

        public int getMPOS_SUPPLY_TYPE() {
            return MPOS_SUPPLY_TYPE;
        }

        public void setMPOS_SUPPLY_TYPE(int MPOS_SUPPLY_TYPE) {
            this.MPOS_SUPPLY_TYPE = MPOS_SUPPLY_TYPE;
        }

        public String getMPOS_SUPPLY_ADDRESS() {
            return MPOS_SUPPLY_ADDRESS;
        }

        public void setMPOS_SUPPLY_ADDRESS(String MPOS_SUPPLY_ADDRESS) {
            this.MPOS_SUPPLY_ADDRESS = MPOS_SUPPLY_ADDRESS;
        }

        public String getMPOS_BANK_ACCOUNT() {
            return MPOS_BANK_ACCOUNT;
        }

        public void setMPOS_BANK_ACCOUNT(String MPOS_BANK_ACCOUNT) {
            this.MPOS_BANK_ACCOUNT = MPOS_BANK_ACCOUNT;
        }

        public String getMPOS_BANK_NAME() {
            return MPOS_BANK_NAME;
        }

        public void setMPOS_BANK_NAME(String MPOS_BANK_NAME) {
            this.MPOS_BANK_NAME = MPOS_BANK_NAME;
        }

        public String getMPOS_BALANCE_TYPE() {
            return MPOS_BALANCE_TYPE;
        }

        public void setMPOS_BALANCE_TYPE(String MPOS_BALANCE_TYPE) {
            this.MPOS_BALANCE_TYPE = MPOS_BALANCE_TYPE;
        }

        public String getMPOS_CONTRACT_OR_ORDER() {
            return MPOS_CONTRACT_OR_ORDER;
        }

        public void setMPOS_CONTRACT_OR_ORDER(String MPOS_CONTRACT_OR_ORDER) {
            this.MPOS_CONTRACT_OR_ORDER = MPOS_CONTRACT_OR_ORDER;
        }

        public String getMPOS_TELEPHONE() {
            return MPOS_TELEPHONE;
        }

        public void setMPOS_TELEPHONE(String MPOS_TELEPHONE) {
            this.MPOS_TELEPHONE = MPOS_TELEPHONE;
        }

        public String getMPOS_FAX() {
            return MPOS_FAX;
        }

        public void setMPOS_FAX(String MPOS_FAX) {
            this.MPOS_FAX = MPOS_FAX;
        }

        public String getJD_RECE_TELEPHONE() {
            return JD_RECE_TELEPHONE;
        }

        public void setJD_RECE_TELEPHONE(String JD_RECE_TELEPHONE) {
            this.JD_RECE_TELEPHONE = JD_RECE_TELEPHONE;
        }

        public String getJD_FAX() {
            return JD_FAX;
        }

        public void setJD_FAX(String JD_FAX) {
            this.JD_FAX = JD_FAX;
        }

        public String getJD_RECE_ADDRESS() {
            return JD_RECE_ADDRESS;
        }

        public void setJD_RECE_ADDRESS(String JD_RECE_ADDRESS) {
            this.JD_RECE_ADDRESS = JD_RECE_ADDRESS;
        }

        public int getMPOS_STATUS() {
            return MPOS_STATUS;
        }

        public void setMPOS_STATUS(int MPOS_STATUS) {
            this.MPOS_STATUS = MPOS_STATUS;
        }

        public String getMPOS_COMMENT() {
            return MPOS_COMMENT;
        }

        public void setMPOS_COMMENT(String MPOS_COMMENT) {
            this.MPOS_COMMENT = MPOS_COMMENT;
        }

        @Override
        public String toString() {
            return "MessageBean{" +
                    "MPO_ID=" + MPO_ID +
                    ", MPO_CODE='" + MPO_CODE + '\'' +
                    ", MPO_NAME='" + MPO_NAME + '\'' +
                    ", MPO_TYPE='" + MPO_TYPE + '\'' +
                    ", MPO_PRIORITY='" + MPO_PRIORITY + '\'' +
                    ", MPO_FOLLOW_USER_ID=" + MPO_FOLLOW_USER_ID +
                    ", MPO_FOLLOW_USER_NAME='" + MPO_FOLLOW_USER_NAME + '\'' +
                    ", MPO_FOLLOW_USER_NUMBER='" + MPO_FOLLOW_USER_NUMBER + '\'' +
                    ", MPO_PRICE_CONFIRM_USER_ID=" + MPO_PRICE_CONFIRM_USER_ID +
                    ", MPO_PRICE_CONFIRM_USER_NAME='" + MPO_PRICE_CONFIRM_USER_NAME + '\'' +
                    ", MPO_PRICE_CONFIRM_USER_NUMBER='" + MPO_PRICE_CONFIRM_USER_NUMBER + '\'' +
                    ", MPO_PRICE_CONFIRM_TIME='" + MPO_PRICE_CONFIRM_TIME + '\'' +
                    ", MPO_CONTRACT_REVIEW_USER_ID=" + MPO_CONTRACT_REVIEW_USER_ID +
                    ", MPO_CONTRACT_REVIEW_USER_NAME='" + MPO_CONTRACT_REVIEW_USER_NAME + '\'' +
                    ", MPO_CONTRACT_REVIEW_USER_NUMBER='" + MPO_CONTRACT_REVIEW_USER_NUMBER + '\'' +
                    ", MPO_CONTRACT_REVIEW_TIME='" + MPO_CONTRACT_REVIEW_TIME + '\'' +
                    ", MPO_CREATE_USER_ID=" + MPO_CREATE_USER_ID +
                    ", MPO_CREATE_USER_NAME='" + MPO_CREATE_USER_NAME + '\'' +
                    ", MPO_CREATE_USER_NUMBER='" + MPO_CREATE_USER_NUMBER + '\'' +
                    ", MPO_CREATE_TIME='" + MPO_CREATE_TIME + '\'' +
                    ", MPO_CHECK_GUID='" + MPO_CHECK_GUID + '\'' +
                    ", MPO_CHECK_STATUS=" + MPO_CHECK_STATUS +
                    ", MPO_CHECK_COMMENT='" + MPO_CHECK_COMMENT + '\'' +
                    ", MPO_CHECK_TIME='" + MPO_CHECK_TIME + '\'' +
                    ", MPO_PROCESS_STATUS=" + MPO_PROCESS_STATUS +
                    ", MPO_STATUS=" + MPO_STATUS +
                    ", MPO_COMMENT='" + MPO_COMMENT + '\'' +
                    ", MPO_ACCOUNT=" + MPO_ACCOUNT +
                    ", MPOM_ID=" + MPOM_ID +
                    ", MPO_ID1=" + MPO_ID1 +
                    ", MAT_ID=" + MAT_ID +
                    ", MAT_CODE='" + MAT_CODE + '\'' +
                    ", MAT_NAME='" + MAT_NAME + '\'' +
                    ", MAT_GRAPHICS='" + MAT_GRAPHICS + '\'' +
                    ", MAT_TYPE='" + MAT_TYPE + '\'' +
                    ", MAT_MODE='" + MAT_MODE + '\'' +
                    ", MAT_SPECIFICATION='" + MAT_SPECIFICATION + '\'' +
                    ", MAT_MODE_SPECIFCATION='" + MAT_MODE_SPECIFCATION + '\'' +
                    ", MAT_PURCHASE_UNIT='" + MAT_PURCHASE_UNIT + '\'' +
                    ", MAT_COLOR='" + MAT_COLOR + '\'' +
                    ", MAT_MATERIAL='" + MAT_MATERIAL + '\'' +
                    ", MAT_IS_INSTANCE=" + MAT_IS_INSTANCE +
                    ", MAT_PURCHASE_COUNT=" + MAT_PURCHASE_COUNT +
                    ", MAT_SINGLE_USE_COUNT=" + MAT_SINGLE_USE_COUNT +
                    ", MAT_ALLOW_DELIVERY_COUNT=" + MAT_ALLOW_DELIVERY_COUNT +
                    ", MAT_STOCT_COUNT_BEFORE_ORDER=" + MAT_STOCT_COUNT_BEFORE_ORDER +
                    ", MPOM_SUPPLY_MAT_CODE='" + MPOM_SUPPLY_MAT_CODE + '\'' +
                    ", MPOM_IS_PRESENTED=" + MPOM_IS_PRESENTED +
                    ", MPOM_PRESENTED_COUNT=" + MPOM_PRESENTED_COUNT +
                    ", MPOM_EXPECT_RECE_TIME='" + MPOM_EXPECT_RECE_TIME + '\'' +
                    ", MPOM_ACTUAL_DELIVERY_TIME='" + MPOM_ACTUAL_DELIVERY_TIME + '\'' +
                    ", MPOM_TECHNICAL_REQUIRE='" + MPOM_TECHNICAL_REQUIRE + '\'' +
                    ", MPOM_DELIVERY_REQUIRE='" + MPOM_DELIVERY_REQUIRE + '\'' +
                    ", MPOM_PRICE_NOTE='" + MPOM_PRICE_NOTE + '\'' +
                    ", MPOM_CHECK_METHOD='" + MPOM_CHECK_METHOD + '\'' +
                    ", MPOM_DELIVERY_WAY='" + MPOM_DELIVERY_WAY + '\'' +
                    ", MPOM_IS_PICTURE=" + MPOM_IS_PICTURE +
                    ", MPOM_MAT_PICTURE='" + MPOM_MAT_PICTURE + '\'' +
                    ", MPOM_CHECK_STATUS=" + MPOM_CHECK_STATUS +
                    ", MPOM_PROCESS_STATUS=" + MPOM_PROCESS_STATUS +
                    ", MPOM_STATUS=" + MPOM_STATUS +
                    ", MPOM_COMMENT='" + MPOM_COMMENT + '\'' +
                    ", K3_ENTRY_LINE_NUMBER='" + K3_ENTRY_LINE_NUMBER + '\'' +
                    ", K3_INTERNAL_NUMBER='" + K3_INTERNAL_NUMBER + '\'' +
                    ", MPOS_ID=" + MPOS_ID +
                    ", MPO_ID2=" + MPO_ID2 +
                    ", MPOS_SUPPLY_ID=" + MPOS_SUPPLY_ID +
                    ", MPOS_SUPPLY_NAME='" + MPOS_SUPPLY_NAME + '\'' +
                    ", MPOS_SUPPLY_CODE='" + MPOS_SUPPLY_CODE + '\'' +
                    ", MPOS_SUPPLY_TYPE=" + MPOS_SUPPLY_TYPE +
                    ", MPOS_SUPPLY_ADDRESS='" + MPOS_SUPPLY_ADDRESS + '\'' +
                    ", MPOS_BANK_ACCOUNT='" + MPOS_BANK_ACCOUNT + '\'' +
                    ", MPOS_BANK_NAME='" + MPOS_BANK_NAME + '\'' +
                    ", MPOS_BALANCE_TYPE='" + MPOS_BALANCE_TYPE + '\'' +
                    ", MPOS_CONTRACT_OR_ORDER='" + MPOS_CONTRACT_OR_ORDER + '\'' +
                    ", MPOS_TELEPHONE='" + MPOS_TELEPHONE + '\'' +
                    ", MPOS_FAX='" + MPOS_FAX + '\'' +
                    ", JD_RECE_TELEPHONE='" + JD_RECE_TELEPHONE + '\'' +
                    ", JD_FAX='" + JD_FAX + '\'' +
                    ", JD_RECE_ADDRESS='" + JD_RECE_ADDRESS + '\'' +
                    ", MPOS_STATUS=" + MPOS_STATUS +
                    ", MPOS_COMMENT='" + MPOS_COMMENT + '\'' +
                    '}';
        }
    }
}
