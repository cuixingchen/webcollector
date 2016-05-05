package com.jyall.reptile.newHouse;

import cn.edu.hfut.dmic.webcollector.model.CrawlDatums;
import cn.edu.hfut.dmic.webcollector.model.Page;
import cn.edu.hfut.dmic.webcollector.plugin.berkeley.BreadthCrawler;
import com.jyall.reptile.newHouse.bean.CanshuBean;
import com.jyall.reptile.newHouse.bean.HuxingBean;
import com.jyall.reptile.newHouse.bean.XiangceBean;
import com.jyall.reptile.newHouse.utils.BeanHelper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: cuipengfei
 * Date: 16-5-5
 * Time: 下午3:50
 * To change this template use File | Settings | File Templates.
 */
public class NewHouseCrawler extends BreadthCrawler {
    Logger logger = LoggerFactory.getLogger(NewHouseCrawler.class);

    public NewHouseCrawler(String crawlPath, boolean autoParse) {
        super(crawlPath, autoParse);
    }

    @Override
    public void visit(Page page, CrawlDatums next) {
        if (page.matchUrl("http://[a-zA-Z]{1,}.fang.anjuke.com/loupan11/.*")) { //查询城市列表
            logger.info("URL:" + page.getUrl());

        } else if (page.matchUrl("http://[a-zA-Z]{1,}.fang.anjuke.com")) {      //查询总条数来进行分页查询单页50条
            logger.info("URL:" + page.getUrl());
            Document jsoup = Jsoup.parse(page.getHtml());
            Elements elements = jsoup.getElementsByClass("list-contents");
            elements = elements.get(0).getElementsByClass("result");
            String count = elements.get(0).tagName("em").text().trim();
            count = count.substring(count.indexOf("有") + 1, count.indexOf("个"));
            logger.info("count:" + count);
        } else if (page.matchUrl("http://[a-zA-Z]{1,}.fang.anjuke.com/loupan/s\\?p=[0-9]{1,}")) {//查询单品
            logger.info("URL:" + page.getUrl());
            Document jsoup = Jsoup.parse(page.getHtml());
            Elements elements = jsoup.getElementsByClass("key-list");
            Element element = elements.get(0);
            Elements itemmods = element.getElementsByClass("item-mod");
            String datalink = "";
            for (Element itemmod : itemmods
                    ) {
                datalink = itemmod.attr("data-link");
                datalink = datalink.substring(0, datalink.indexOf("loupan/")) +
                        "loupan/canshu-" + datalink.substring(datalink.indexOf("loupan/") + 7);
                break;//正式使用要注释掉
            }
            logger.info("canshu:" + datalink);
            logger.info("huxing:" + datalink.replace("canshu", "huxing"));
            logger.info("huxing:" + datalink.replace("canshu", "xiangce"));
            next.add(datalink);//查询单品参数信息
            next.add(datalink.replace("canshu", "huxing"));//查询单品户型
            next.add(datalink.replace("canshu", "xiangce"));//查询单品相册
        } else if (page.matchUrl("http://[a-zA-Z]{1,}.fang.anjuke.com/loupan/canshu-[0-9]{1,}.html")) {
            logger.info("URL:" + page.getUrl());
            CanshuBean bean = BeanHelper.canshuHelper(page.getHtml());
            logger.info(bean.toString());

        } else if (page.matchUrl("http://[a-zA-Z]{1,}.fang.anjuke.com/loupan/huxing-[0-9]{1,}.html")) {
            logger.info("URL:" + page.getUrl());
            HuxingBean bean = BeanHelper.huxingHelper(page.getHtml());
            logger.info(bean.toString());

        } else if (page.matchUrl("http://[a-zA-Z]{1,}.fang.anjuke.com/loupan/xiangce-[0-9]{1,}.html")) {
            logger.info("URL:" + page.getUrl());
            XiangceBean bean = BeanHelper.xiangceHelper(page.getHtml());
            logger.info(bean.toString());
        }


    }
}
