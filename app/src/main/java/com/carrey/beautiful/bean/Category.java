package com.carrey.beautiful.bean;

import java.util.List;

/**
 * @author : carrey
 * @Date : 16-7-7
 * @describe :
 */
public class Category {
    /**
     * status : true
     * tngou : [{"description":"\u2026\u2026","id":1,"keywords":"\u2026\u2026","name":"性感美女","seq":1,"title":"\u2026\u2026"},{"description":"\u2026\u2026","id":2,"keywords":"\u2026\u2026","name":"韩日美女","seq":2,"title":"\u2026\u2026"},{"description":"\u2026\u2026","id":3,"keywords":"\u2026\u2026","name":"丝袜美腿","seq":3,"title":"\u2026\u2026"},{"description":"\u2026\u2026","id":4,"keywords":"\u2026\u2026","name":"美女照片","seq":4,"title":"\u2026\u2026"},{"description":"\u2026\u2026","id":5,"keywords":"\u2026\u2026","name":"美女写真","seq":5,"title":"\u2026\u2026"},{"description":"\u2026\u2026","id":6,"keywords":"\u2026\u2026","name":"清纯美女","seq":6,"title":"\u2026\u2026"},{"description":"\u2026\u2026","id":2,"keywords":"\u2026\u2026","name":"性感车模","seq":7,"title":"\u2026\u2026"}]
     */

    public boolean status;
    /**
     * description : ……
     * id : 1
     * keywords : ……
     * name : 性感美女
     * seq : 1
     * title : ……
     */

    public List<TngouBean> tngou;

    public static class TngouBean {
        public String description;
        public int id;
        public String keywords;
        public String name;
        public int seq;
        public String title;
    }
}
