package com.jd.myapplication.domain;

import java.util.List;

/**
 * Created by Administrator on 2020/3/25/025.
 */
public class MysqlUserJsonResult {

    /**
     * state : 1
     * message : ok
     */

    private int state;
    private String message;
    private List<DataBean> data;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 14
         * username : lisi
         * password : e10adc3949ba59abbe56e057f20f883e
         * phone : 12344444444
         * email : 678910@qq.com
         * created : 2015-06-19T02:02:11.000+0000
         * updated : 2015-06-19T02:02:11.000+0000
         */

        private int id;
        private String username;
        private String password;
        private String phone;
        private String email;
        private String created;
        private String updated;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public String getUpdated() {
            return updated;
        }

        public void setUpdated(String updated) {
            this.updated = updated;
        }
    }
}
