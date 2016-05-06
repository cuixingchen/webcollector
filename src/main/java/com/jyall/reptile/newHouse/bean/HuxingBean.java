package com.jyall.reptile.newHouse.bean;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * 安居客新房户型实体
 * User: cuipengfei
 * Date: 16-5-5
 * Time: 下午8:19
 * To change this template use File | Settings | File Templates.
 */
public class HuxingBean {
    /**
     * 安居客楼盘Id
     */
    private int loupan_Id;

    /**
     * 户型大分类
     */
    private String huxing;

    /**
     * 具体户型
     */
    private String huxing_des;

    /**
     * 户型销售状态
     */
    private String sale_status;

    /**
     * 面积
     */
    private String mianji;

    /**
     * 户型图片集合
     */
    private List<Huxing_imgBean> huxing_imgBeanList;

    /**
     * 户型首选图片
     */
    private String huxing_img;

    /**
     * 户型名称
     */
    private String huxing_name;


    /**
     * 户型详细url
     */
    private String huxing_xiangxi_url;

    /**
     * 朝向
     */
    private String chaoxiang;

    /**
     * 层高
     */
    private String cenggao;

    public void setHuxing_img(String huxing_img) {
        this.huxing_img = huxing_img;
    }

    public String getHuxing_xiangxi_url() {
        return huxing_xiangxi_url;
    }

    public String getHuxing_name() {
        return huxing_name;
    }

    public void setHuxing_name(String huxing_name) {
        this.huxing_name = huxing_name;
    }

    public void setHuxing_xiangxi_url(String huxing_xiangxi_url) {
        this.huxing_xiangxi_url = huxing_xiangxi_url;
    }

    public String getSale_status() {
        return sale_status;
    }

    public void setSale_status(String sale_status) {
        this.sale_status = sale_status;
    }

    public int getLoupan_Id() {
        return loupan_Id;
    }

    public void setLoupan_Id(int loupan_Id) {
        this.loupan_Id = loupan_Id;
    }

    public String getHuxing() {
        return huxing;
    }

    public void setHuxing(String huxing) {
        this.huxing = huxing;
    }

    public String getHuxing_des() {
        return huxing_des;
    }

    public void setHuxing_des(String huxing_des) {
        this.huxing_des = huxing_des;
    }

    public String getMianji() {
        return mianji;
    }

    public void setMianji(String mianji) {
        this.mianji = mianji;
    }

    public String getHuxing_img() {
        return huxing_img;
    }

    public String getChaoxiang() {
        return chaoxiang;
    }

    public void setChaoxiang(String chaoxiang) {
        this.chaoxiang = chaoxiang;
    }

    public String getCenggao() {
        return cenggao;
    }

    public void setCenggao(String cenggao) {
        this.cenggao = cenggao;
    }

    @Override
    public String toString() {
        return "HuxingBean{" +
                "loupan_Id=" + loupan_Id +
                ", huxing='" + huxing + '\'' +
                ", huxing_des='" + huxing_des + '\'' +
                ", sale_status='" + sale_status + '\'' +
                ", mianji='" + mianji + '\'' +
                ", huxing_imgBeanList=" + huxing_imgBeanList +
                ", huxing_img='" + huxing_img + '\'' +
                ", huxing_name='" + huxing_name + '\'' +
                ", huxing_xiangxi_url='" + huxing_xiangxi_url + '\'' +
                ", chaoxiang='" + chaoxiang + '\'' +
                ", cenggao='" + cenggao + '\'' +
                '}';
    }

    public List<Huxing_imgBean> getHuxing_imgBeanList() {
        return huxing_imgBeanList;
    }

    public void setHuxing_imgBeanList(List<Huxing_imgBean> huxing_imgBeanList) {
        this.huxing_imgBeanList = huxing_imgBeanList;
    }
}
