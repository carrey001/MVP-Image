package com.carrey.beautiful.bean;

import java.util.List;

/**
 * @author : carrey
 * @Date : 16-7-7
 * @describe :
 */
public class CategoryList {


    /**
     * status : true
     * total : 237
     * tngou : [{"count":122,"fcount":0,"galleryclass":1,"id":733,"img":"/ext/160705/b20281b0c59550a69961e0b4b571186c.jpg","rcount":0,"size":7,"time":1467720670000,"title":"清纯靓丽性感的吊带女"},{"count":79,"fcount":0,"galleryclass":1,"id":730,"img":"/ext/160705/28f6335e24128ca453aa559e89d93e4a.jpg","rcount":0,"size":7,"time":1467720452000,"title":"兔女郎的性感黑色蕾丝"},{"count":65,"fcount":0,"galleryclass":1,"id":729,"img":"/ext/160705/8011d05d3235ed05477000720307c85c.jpg","rcount":0,"size":10,"time":1467719971000,"title":"高挑嫩模苏茜Susie黑丝长腿私房写真"},{"count":37529,"fcount":0,"galleryclass":1,"id":728,"img":"/ext/160417/677ab7206386e96d45dfa67e719f4335.jpg","rcount":0,"size":6,"time":1460857234000,"title":"粉嫩少女"},{"count":7655,"fcount":0,"galleryclass":1,"id":717,"img":"/ext/160408/1d3a87c0a012024db834eeba9f28d891.jpg","rcount":0,"size":9,"time":1460114220000,"title":"清纯美女明星李七喜"},{"count":5586,"fcount":0,"galleryclass":1,"id":714,"img":"/ext/160408/d80563951d37941965b3c5819247b923.jpg","rcount":0,"size":16,"time":1460114121000,"title":"娇俏mm绮里嘉清纯脸蛋不忘露纹身"},{"count":5354,"fcount":0,"galleryclass":1,"id":706,"img":"/ext/160321/11b7f4fd41e0a2549d3fe5f1c30e8608.jpg","rcount":0,"size":10,"time":1458560719000,"title":"极品美女那性感美腿娇身"},{"count":5360,"fcount":0,"galleryclass":1,"id":705,"img":"/ext/160321/d663c9e93d3d6aa5323db3817af4fabc.jpg","rcount":0,"size":11,"time":1458560657000,"title":"美女腿模高挑身材，那吊带黑丝腿超性感"},{"count":5176,"fcount":0,"galleryclass":1,"id":703,"img":"/ext/160318/3115aed4b35439691acb30475502043c.jpg","rcount":0,"size":10,"time":1458306237000,"title":"修长的丝袜美腿"},{"count":2646,"fcount":0,"galleryclass":1,"id":700,"img":"/ext/160318/bbdcabe782e108b7bb2034595cebc91f.jpg","rcount":0,"size":14,"time":1458305579000,"title":"苗条身材美女性感花纹黑丝长腿魔鬼身材"},{"count":3343,"fcount":0,"galleryclass":1,"id":693,"img":"/ext/160317/f9cd7df30d01d8e848c1374cea84e9f0.jpg","rcount":0,"size":9,"time":1458208060000,"title":"漂亮mm绮里嘉清纯脸蛋美胸傲人"},{"count":2929,"fcount":0,"galleryclass":1,"id":691,"img":"/ext/160317/0c581abeb5025e9022a85aa60a7c19d0.jpg","rcount":0,"size":6,"time":1458207997000,"title":"极品美人angelxy性感清纯内衣秀"},{"count":3708,"fcount":0,"galleryclass":1,"id":686,"img":"/ext/160310/d6deaf37a893eb9b0f89bc6faa15b824.jpg","rcount":0,"size":23,"time":1457572983000,"title":"巨乳美女李雪婷清纯诱惑高清写真"},{"count":3643,"fcount":0,"galleryclass":1,"id":681,"img":"/ext/160307/e35c5af5ac12e9e4a15704972abe1e7a.jpg","rcount":0,"size":16,"time":1457312573000,"title":"秀女郎可可清秀容颜性感图片"},{"count":3618,"fcount":0,"galleryclass":1,"id":679,"img":"/ext/160307/1387aa5211ba4e76528abb15791aaaee.jpg","rcount":0,"size":16,"time":1457312356000,"title":"甜美美女嫩模沙滩比基尼性感写真"},{"count":1887,"fcount":0,"galleryclass":1,"id":662,"img":"/ext/160227/10baaaeb24e98f364a1c8d12b27a700f.jpg","rcount":0,"size":10,"time":1456536949000,"title":"校花米妮精彩演绎兔女郎 "},{"count":1636,"fcount":0,"galleryclass":1,"id":660,"img":"/ext/160227/6ce469cd1898bff51698de92d59a8bee.jpg","rcount":0,"size":11,"time":1456536673000,"title":"可爱的吊带兔女郎"},{"count":1788,"fcount":0,"galleryclass":1,"id":656,"img":"/ext/160225/fc435e33684aa55c32ab56e1318729f0.jpg","rcount":0,"size":11,"time":1456359847000,"title":"猫猫女雪莉srily高清性感私房写真"},{"count":1600,"fcount":0,"galleryclass":1,"id":655,"img":"/ext/160225/bd9048920896c50bc3dcf954bd62fba3.jpg","rcount":0,"size":24,"time":1456359697000,"title":"兔女郎郑瑞熙蓝领制服性感美图"},{"count":1723,"fcount":0,"galleryclass":1,"id":654,"img":"/ext/160225/424a3cddb795a3d1b1a4eed1ed9c51a5.jpg","rcount":0,"size":17,"time":1456359633000,"title":"秀人网新晋御女郎刘点点制服写真"}]
     */

    public boolean status;
    public int total;
    /**
     * count : 122
     * fcount : 0
     * galleryclass : 1
     * id : 733
     * img : /ext/160705/b20281b0c59550a69961e0b4b571186c.jpg
     * rcount : 0
     * size : 7
     * time : 1467720670000
     * title : 清纯靓丽性感的吊带女
     */

    public List<TngouBean> tngou;

    public static class TngouBean {
        public int count;
        public int fcount;
        public int galleryclass;
        public int id;
        public String img;
        public int rcount;
        public int size;
        public long time;
        public String title;
    }
}
