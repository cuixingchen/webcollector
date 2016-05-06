package com.jyall.reptile;

import com.jyall.reptile.newHouse.NewHouseCrawler;

/**
 * 新房爬虫入口
 */
public class App {
    private static String city = "bj";

    public static void main(String[] args) throws Exception {
        NewHouseCrawler crawler = new NewHouseCrawler("newHouse", true);
//        crawler.addSeed("http://" + city + ".fang.anjuke.com/");//查询总数
//        crawler.addSeed("http://" + city + ".fang.anjuke.com/loupan/s?p=1");//查询分页
//        crawler.addSeed("http://" + city + ".fang.anjuke.com/loupan/canshu-410134.html");//查询单品参数
//        crawler.addSeed("http://" + city + ".fang.anjuke.com/loupan/canshu-246882.html");//查询单品参数
//        crawler.addSeed("http://" + city + ".fang.anjuke.com/loupan/huxing-410134.html");//查询单品户型
        crawler.addSeed("http://" + city + ".fang.anjuke.com/loupan/xiangce-410134.html");//查询单品相册

        /*可以设置每个线程visit的间隔，这里是毫秒*/
        //crawler.setVisitInterval(1000);
        /*可以设置http请求重试的间隔，这里是毫秒*/
        //crawler.setRetryInterval(1000);
        crawler.setThreads(5);
        crawler.start(2);
    }
}
