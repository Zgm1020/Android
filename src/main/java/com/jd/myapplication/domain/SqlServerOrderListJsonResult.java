package com.jd.myapplication.domain;

import java.util.List;

/**
 * Created by Administrator on 2020/3/25/025.
 */
public class SqlServerOrderListJsonResult {

    /**
     * Result : True
     * Message : [{"MPO_ID":877,"MPO_CODE":"JDPOORD056853","MPOR_ORG_ID":327,"MPOR_ORG_NAME":"采购中心B","MPOR_ORG_NUMBER":"1.21.01","MPOM_EXPECT_RECE_TIME":"2019-07-08T00:00:00","MPO_TYPE":"K3下推","MPO_PRIORITY":"","MPO_CREATE_USER_ID":179644,"MPO_CREATE_USER_NAME":"汪佳","MPO_CREATE_USER_NUMBER":"201407090","JD_RECE_TELEPHONE":"0316-6072907"},{"MPO_ID":1115,"MPO_CODE":"JDPOORD057615","MPOR_ORG_ID":327,"MPOR_ORG_NAME":"采购中心B","MPOR_ORG_NUMBER":"1.21.01","MPOM_EXPECT_RECE_TIME":"2019-07-21T00:00:00","MPO_TYPE":"K3下推","MPO_PRIORITY":"","MPO_CREATE_USER_ID":2321,"MPO_CREATE_USER_NAME":"贾璐璐","MPO_CREATE_USER_NUMBER":"201006008","JD_RECE_TELEPHONE":"0316-6072907"},{"MPO_ID":708,"MPO_CODE":"JDPOORD057480","MPOR_ORG_ID":327,"MPOR_ORG_NAME":"采购中心B","MPOR_ORG_NUMBER":"1.21.01","MPOM_EXPECT_RECE_TIME":"2019-08-05T00:00:00","MPO_TYPE":"K3下推","MPO_PRIORITY":"","MPO_CREATE_USER_ID":1587,"MPO_CREATE_USER_NAME":"王子硕","MPO_CREATE_USER_NUMBER":"200408011","JD_RECE_TELEPHONE":"0316-6072907"},{"MPO_ID":1096,"MPO_CODE":"JDPOORD057638","MPOR_ORG_ID":327,"MPOR_ORG_NAME":"采购中心B","MPOR_ORG_NUMBER":"1.21.01","MPOM_EXPECT_RECE_TIME":"2019-08-06T00:00:00","MPO_TYPE":"K3下推","MPO_PRIORITY":"","MPO_CREATE_USER_ID":1587,"MPO_CREATE_USER_NAME":"王子硕","MPO_CREATE_USER_NUMBER":"200408011","JD_RECE_TELEPHONE":"0316-6072907"}]
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
         * MPO_ID : 877
         * MPO_CODE : JDPOORD056853
         * MPOR_ORG_ID : 327
         * MPOR_ORG_NAME : 采购中心B
         * MPOR_ORG_NUMBER : 1.21.01
         * MPOM_EXPECT_RECE_TIME : 2019-07-08T00:00:00
         * MPO_TYPE : K3下推
         * MPO_PRIORITY :
         * MPO_CREATE_USER_ID : 179644
         * MPO_CREATE_USER_NAME : 汪佳
         * MPO_CREATE_USER_NUMBER : 201407090
         * JD_RECE_TELEPHONE : 0316-6072907
         */

        private int MPO_ID;
        private String MPO_CODE;
        private int MPOR_ORG_ID;
        private String MPOR_ORG_NAME;
        private String MPOR_ORG_NUMBER;
        private String MPOM_EXPECT_RECE_TIME;
        private String MPO_TYPE;
        private String MPO_PRIORITY;
        private int MPO_CREATE_USER_ID;
        private String MPO_CREATE_USER_NAME;
        private String MPO_CREATE_USER_NUMBER;
        private String JD_RECE_TELEPHONE;

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

        public int getMPOR_ORG_ID() {
            return MPOR_ORG_ID;
        }

        public void setMPOR_ORG_ID(int MPOR_ORG_ID) {
            this.MPOR_ORG_ID = MPOR_ORG_ID;
        }

        public String getMPOR_ORG_NAME() {
            return MPOR_ORG_NAME;
        }

        public void setMPOR_ORG_NAME(String MPOR_ORG_NAME) {
            this.MPOR_ORG_NAME = MPOR_ORG_NAME;
        }

        public String getMPOR_ORG_NUMBER() {
            return MPOR_ORG_NUMBER;
        }

        public void setMPOR_ORG_NUMBER(String MPOR_ORG_NUMBER) {
            this.MPOR_ORG_NUMBER = MPOR_ORG_NUMBER;
        }

        public String getMPOM_EXPECT_RECE_TIME() {
            return MPOM_EXPECT_RECE_TIME;
        }

        public void setMPOM_EXPECT_RECE_TIME(String MPOM_EXPECT_RECE_TIME) {
            this.MPOM_EXPECT_RECE_TIME = MPOM_EXPECT_RECE_TIME;
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

        public String getJD_RECE_TELEPHONE() {
            return JD_RECE_TELEPHONE;
        }

        public void setJD_RECE_TELEPHONE(String JD_RECE_TELEPHONE) {
            this.JD_RECE_TELEPHONE = JD_RECE_TELEPHONE;
        }
    }
}
