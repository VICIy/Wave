package com.viciy.wave.mvp.model;

import java.util.List;

/**
 * Created by bai-qiang.yang on 2017/3/9.
 */
public class MeiNvResponse {

    /**
     * error : false
     * results : [{"_id":"58857746421aa95eae2d92b3","createdAt":"2017-01-23T11:23:50.64Z","desc":"1-23","publishedAt":"2017-01-23T11:35:32.450Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/16124047_121657248344062_4191645221970247680_n.jpg","used":true,"who":"代码家"},{"_id":"58841c08421aa95ea9de7a0c","createdAt":"2017-01-22T10:42:16.648Z","desc":"1-22","publishedAt":"2017-01-22T11:39:29.779Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/16229501_482786908558452_6858241750058663936_n.jpg","used":true,"who":"daimajia"},{"_id":"58817e1e421aa9119735ac5f","createdAt":"2017-01-20T11:03:58.727Z","desc":"1-20","publishedAt":"2017-01-20T11:50:52.750Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-01-20-030332.jpg","used":true,"who":"daimajia"},{"_id":"58802bea421aa9119a6ca6ab","createdAt":"2017-01-19T11:00:58.838Z","desc":"1-19","publishedAt":"2017-01-19T11:40:09.118Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/16124351_1863111260639981_4361246625721483264_n.jpg","used":true,"who":"daimajia"},{"_id":"587c6073421aa91194ca0e2c","createdAt":"2017-01-16T13:56:03.417Z","desc":"1-16","publishedAt":"2017-01-16T14:12:18.71Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034gw1fbsfgssfrwj20u011h48y.jpg","used":true,"who":"daimajia"},{"_id":"5878471d421aa9119735ac13","createdAt":"2017-01-13T11:18:53.183Z","desc":"1-13","publishedAt":"2017-01-13T11:58:16.991Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034gw1fbou2xsqpaj20u00u0q4h.jpg","used":true,"who":"daimajia"},{"_id":"5876e811421aa9315bfbe85f","createdAt":"2017-01-12T10:21:05.74Z","desc":"1-12","publishedAt":"2017-01-12T11:30:59.369Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/0060lm7Tgw1fbnmsjogt9j30u00u0jvv.jpg","used":true,"who":"daimajia"},{"_id":"58758a6e421aa9315bfbe854","createdAt":"2017-01-11T09:29:18.702Z","desc":"1-11","publishedAt":"2017-01-11T12:05:20.787Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/0060lm7Tgw1fbmfo9is9hj30u00u0ai3.jpg","used":true,"who":"daimajia"},{"_id":"58745425421aa93161103dd7","createdAt":"2017-01-10T11:25:25.871Z","desc":"1-10","publishedAt":"2017-01-10T11:33:19.525Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034gw1fbldexdog4j20u011h41b.jpg","used":true,"who":"daimajia"},{"_id":"5872f7f2421aa9316407fb84","createdAt":"2017-01-09T10:39:46.599Z","desc":"1-9","publishedAt":"2017-01-09T11:46:59.821Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034gw1fbk6h23k3ij20u00jymyw.jpg","used":true,"who":"daunahu"}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 58857746421aa95eae2d92b3
         * createdAt : 2017-01-23T11:23:50.64Z
         * desc : 1-23
         * publishedAt : 2017-01-23T11:35:32.450Z
         * source : chrome
         * type : 福利
         * url : http://7xi8d6.com1.z0.glb.clouddn.com/16124047_121657248344062_4191645221970247680_n.jpg
         * used : true
         * who : 代码家
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }
    }
}
