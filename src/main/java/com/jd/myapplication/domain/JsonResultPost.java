package com.jd.myapplication.domain;

import java.util.List;

/**
 * Created by Administrator on 2020/3/21/021.
 */
public class JsonResultPost {

    /**
     * Result : True
     * Message : [{"IUnDealCount":4,"IDealCount":0,"IDoneCount":0}]
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
         * IUnDealCount : 4
         * IDealCount : 0
         * IDoneCount : 0
         */

        private int IUnDealCount;
        private int IDealCount;
        private int IDoneCount;

        public int getIUnDealCount() {
            return IUnDealCount;
        }

        public void setIUnDealCount(int IUnDealCount) {
            this.IUnDealCount = IUnDealCount;
        }

        public int getIDealCount() {
            return IDealCount;
        }

        public void setIDealCount(int IDealCount) {
            this.IDealCount = IDealCount;
        }

        public int getIDoneCount() {
            return IDoneCount;
        }

        public void setIDoneCount(int IDoneCount) {
            this.IDoneCount = IDoneCount;
        }

        @Override
        public String toString() {
            return "MessageBean{" +
                    "IUnDealCount=" + IUnDealCount +
                    ", IDealCount=" + IDealCount +
                    ", IDoneCount=" + IDoneCount +
                    '}';
        }
    }
}
