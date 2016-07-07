package com.carrey.beautiful.bean;

import java.util.List;

/**
 * @author : carrey
 * @Date : 16-7-7
 * @describe :
 */
public class ImageDetal {

    /**
     * count : 112
     * fcount : 0
     * galleryclass : 1
     * id : 733
     * img : /ext/160705/b20281b0c59550a69961e0b4b571186c.jpg
     * list : [{"gallery":733,"id":12541,"src":"/ext/160705/b20281b0c59550a69961e0b4b571186c.jpg"},{"gallery":733,"id":12542,"src":"/ext/160705/ae3c0b256677410bb07537931673a70d.jpg"},{"gallery":733,"id":12543,"src":"/ext/160705/ee4fde9672772a1fb60c34c8a891ecc4.jpg"},{"gallery":733,"id":12544,"src":"/ext/160705/89af44991d3965924e24e813beb62713.jpg"},{"gallery":733,"id":12545,"src":"/ext/160705/6b4b2bf5f146932a4ec7498b00ecc1bd.jpg"},{"gallery":733,"id":12546,"src":"/ext/160705/b0bb7a04652506c7635e3640964730ee.jpg"},{"gallery":733,"id":12547,"src":"/ext/160705/31e0fbb1665cc326bf58d259e1683f05.jpg"}]
     * rcount : 0
     * size : 7
     * status : true
     * time : 1467720670000
     * title : 清纯靓丽性感的吊带女
     * url : http://www.tngou.net/tnfs/show/733
     */

    public int count;
    public int fcount;
    public int galleryclass;
    public int id;
    public String img;
    public int rcount;
    public int size;
    public boolean status;
    public long time;
    public String title;
    public String url;
    /**
     * gallery : 733
     * id : 12541
     * src : /ext/160705/b20281b0c59550a69961e0b4b571186c.jpg
     */

    public List<ListBean> list;

    public static class ListBean {
        public int gallery;
        public int id;
        public String src;
    }
}
