package com.jyall.reptile.newHouse.utils;

import com.jyall.reptile.newHouse.bean.CanshuBean;
import com.jyall.reptile.newHouse.bean.HuxingBean;
import com.jyall.reptile.newHouse.bean.XiangceBean;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Created with IntelliJ IDEA.
 * 安居客新房信息提取工具类
 * User: cuipengfei
 * Date: 16-5-5
 * Time: 下午8:18
 * To change this template use File | Settings | File Templates.
 */
public class BeanHelper {
    /**
     * 楼盘详情提取
     *
     * @param html
     * @return
     */
    public static CanshuBean canshuHelper(String html, String url) {
        CanshuBean canshuBean = new CanshuBean();
        canshuBean.setLoupan_Id(Integer.parseInt(url.substring(url.indexOf("canshu-") + 7).replace(".html", "")));
        Document doc = Jsoup.parse(html);
        Element container = doc.getElementById("container");
        Elements can_itemList = container.getElementsByClass("can-container");
        can_itemList = can_itemList.get(0).getElementsByClass("can-left");
        can_itemList = can_itemList.get(0).getElementsByClass("can-item");
        for (Element element : can_itemList
                ) {
            String type = element.getElementsByClass("can-head").get(0).tagName("h4").text().trim();
            Elements list = element.tagName("ul").getElementsByTag("li");
            if ("基本信息".equals(type)) {
                for (Element li : list
                        ) {
                    String div_name = li.getElementsByClass("name").get(0).text().trim();
                    Element div_des = li.getElementsByClass("des").get(0);
                    if ("楼盘名称".equals(div_name)) {
                        canshuBean.setName(div_des.text().trim().split(" ")[0]);
                        canshuBean.setStatus(div_des.text().trim().split(" ")[1]);
                    } else if ("楼盘特点".equals(div_name)) {
                        Elements aList = div_des.getElementsByTag("a");
                        String des = "";
                        for (Element a : aList
                                ) {
                            des = des + a.text().trim() + ",";
                        }
                        if (aList.size() > 0) {
                            des = des.substring(0, des.length() - 1);
                        }
                        canshuBean.setTedian(des);
                    } else if ("参考单价".equals(div_name)) {
                        canshuBean.setPrice(div_des.text().trim());
                    } else if ("物业类型".equals(div_name)) {
                        canshuBean.setType(div_des.text().trim());
                    } else if ("开发商".equals(div_name)) {
                        canshuBean.setKaifashang(div_des.text().trim());
                    } else if ("区域位置".equals(div_name)) {
                        canshuBean.setRegion(div_des.text().trim());
                    } else if ("楼盘地址".equals(div_name)) {
                        canshuBean.setAddress(div_des.text().trim());
                    } else if ("售楼处电话".equals(div_name)) {
                        canshuBean.setPhone(div_des.text().trim());
                    }
                }
            } else if ("销售信息".equals(type)) {
                for (Element li : list
                        ) {
                    String div_name = li.getElementsByClass("name").get(0).text().trim();
                    Element div_des = li.getElementsByClass("des").get(0);
                    if ("最低首付".equals(div_name)) {
                        canshuBean.setZuidishoufu(div_des.text().trim());
                    } else if ("楼盘优惠".equals(div_name)) {
                        canshuBean.setLoupanyouhui(div_des.text().trim());
                    } else if ("楼盘户型".equals(div_name)) {
                        canshuBean.setHuxing(div_des.text().trim());
                    } else if ("开盘时间".equals(div_name)) {
                        canshuBean.setKaipanTime(div_des.text().trim());
                    } else if ("交房时间".equals(div_name)) {
                        canshuBean.setJiaofangTime(div_des.text().trim());
                    } else if ("售楼处地址".equals(div_name)) {
                        canshuBean.setShoulouchuAddress(div_des.text().trim());
                    }
                }
            } else if ("小区情况".equals(type)) {
                for (Element li : list
                        ) {
                    String div_name = li.getElementsByClass("name").get(0).text().trim();
                    Element div_des = li.getElementsByClass("des").get(0);
                    if ("建筑类型".equals(div_name)) {
                        canshuBean.setJianzhuType(div_des.text().trim());
                    } else if ("产权年限".equals(div_name)) {
                        canshuBean.setChanquannianxian(div_des.text().trim());
                    } else if ("装修标准".equals(div_name)) {
                        canshuBean.setZhuangxiubiaozhun(div_des.text().trim());
                    } else if ("容积率".equals(div_name)) {
                        canshuBean.setRongjilv(div_des.text().trim());
                    } else if ("绿化率".equals(div_name)) {
                        canshuBean.setLvhualv(div_des.text().trim());
                    } else if ("规划户数".equals(div_name)) {
                        canshuBean.setGuihuahushu(div_des.text().trim());
                    } else if ("楼层状况".equals(div_name)) {
                        canshuBean.setLoucengzhuangkuang(div_des.text().trim());
                    } else if ("工程进度".equals(div_name)) {
                        canshuBean.setGongchengjindu(div_des.text().trim());
                    } else if ("物业管理费".equals(div_name)) {
                        canshuBean.setWuyeguanlifei(div_des.text().trim());
                    } else if ("物业公司".equals(div_name)) {
                        canshuBean.setWuyegongsi(div_des.text().trim());
                    } else if ("车位数".equals(div_name)) {
                        canshuBean.setCheweishu(div_des.text().trim());
                    } else if ("车位比".equals(div_name)) {
                        canshuBean.setCheweibi(div_des.text().trim());
                    }
                }
            } else if ("交通配套".equals(type)) {
                for (Element li : list
                        ) {
                    String div_name = li.getElementsByClass("name").get(0).text().trim();
                    Element div_des = li.getElementsByClass("des").get(0);
                    if ("高速/高架".equals(div_name)) {
                        canshuBean.setGaosugaojia(div_des.text().trim());
                    } else if ("地铁".equals(div_name)) {
                        canshuBean.setDitie(div_des.text().trim());
                    } else if ("公交".equals(div_name)) {
                        canshuBean.setGongjiao(div_des.text().trim());
                    }
                }
            }

        }

        return canshuBean;

    }

    /**
     * 户型详情提取
     *
     * @param html
     * @return
     */
    public static HuxingBean huxingHelper(String html, String url) {
        return null;
    }

    /**
     * 相册详情提取
     *
     * @param html
     * @return
     */
    public static XiangceBean xiangceHelper(String html, String url) {
        return null;
    }
}
