package com.jyall.reptile.newHouse.bean;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * 安居客新房参数实体
 * User: cuipengfei
 * Date: 16-5-5
 * Time: 下午7:49
 * To change this template use File | Settings | File Templates.
 */
public class CanshuBean implements Serializable {

    /**
     * 安居客楼盘Id
     */
    private int loupan_Id;

/*********************基本信息******************************/
    /**
     * 楼盘名称
     */
    private String name;

    /**
     * 楼盘状态（是否在售竣工）
     */
    private String status;
    /**
     * 楼盘特点
     */
    private String tedian;
    /**
     * 参考单价
     */
    private String price;
    /**
     * 物业类型
     */
    private String type;
    /**
     * 开发商
     */
    private String kaifashang;
    /**
     * 区域位置
     */
    private String region;
    /**
     * 楼盘地址
     */
    private String address;
    /**
     * 售楼处电话
     */
    private String phone;
/************************销售信息*********************************/
    /**
     * 最低售价
     */
    private String zuidishoufu;

    /**
     * 楼盘优惠
     */
    private String loupanyouhui;
    /**
     * 楼盘户型
     */
    private String huxing;
    /**
     * 开盘时间
     */
    private String kaipanTime;
    /**
     * 交房时间
     */
    private String jiaofangTime;
    /**
     * 售楼处地址
     */
    private String shoulouchuAddress;

/***************************小区情况 *****************************************/

    /**
     * 建筑类型
     */
    private String jianzhuType;
    /**
     * 产权年限
     */
    private String chanquannianxian;
    /**
     * 装修标准
     */
    private String zhuangxiubiaozhun;
    /**
     * 容积率
     */
    private String rongjilv;
    /**
     * 绿化率
     */
    private String lvhualv;
    /**
     * 规划户数
     */
    private String guihuahushu;
    /**
     * 楼层状况
     */
    private String loucengzhuangkuang;
    /**
     * 工程进度
     */
    private String gongchengjindu;
    /**
     * 物业管理费
     */
    private String wuyeguanlifei;
    /**
     * 物业公司
     */
    private String wuyegongsi;
    /**
     * 车位数
     */
    private String cheweishu;
    /**
     * 车位比
     */
    private String cheweibi;
    /***************************交通配套*********************************************/

    /**
     * 公交
     */
    private String gongjiao;
    /**
     * 地铁
     */
    private String ditie;
    /**
     * 高速高架
     */
    private String gaosugaojia;

    public String getGongjiao() {
        return gongjiao;
    }

    public void setGongjiao(String gongjiao) {
        this.gongjiao = gongjiao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTedian() {
        return tedian;
    }

    public void setTedian(String tedian) {
        this.tedian = tedian;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKaifashang() {
        return kaifashang;
    }

    public void setKaifashang(String kaifashang) {
        this.kaifashang = kaifashang;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZuidishoufu() {
        return zuidishoufu;
    }

    public void setZuidishoufu(String zuidishoufu) {
        this.zuidishoufu = zuidishoufu;
    }

    public String getHuxing() {
        return huxing;
    }

    public void setHuxing(String huxing) {
        this.huxing = huxing;
    }

    public String getKaipanTime() {
        return kaipanTime;
    }

    public void setKaipanTime(String kaipanTime) {
        this.kaipanTime = kaipanTime;
    }

    public String getJiaofangTime() {
        return jiaofangTime;
    }

    public void setJiaofangTime(String jiaofangTime) {
        this.jiaofangTime = jiaofangTime;
    }

    public String getShoulouchuAddress() {
        return shoulouchuAddress;
    }

    public void setShoulouchuAddress(String shoulouchuAddress) {
        this.shoulouchuAddress = shoulouchuAddress;
    }

    public String getJianzhuType() {
        return jianzhuType;
    }

    public void setJianzhuType(String jianzhuType) {
        this.jianzhuType = jianzhuType;
    }

    public String getChanquannianxian() {
        return chanquannianxian;
    }

    public void setChanquannianxian(String chanquannianxian) {
        this.chanquannianxian = chanquannianxian;
    }

    public String getZhuangxiubiaozhun() {
        return zhuangxiubiaozhun;
    }

    public void setZhuangxiubiaozhun(String zhuangxiubiaozhun) {
        this.zhuangxiubiaozhun = zhuangxiubiaozhun;
    }

    public String getRongjilv() {
        return rongjilv;
    }

    public void setRongjilv(String rongjilv) {
        this.rongjilv = rongjilv;
    }

    public String getLvhualv() {
        return lvhualv;
    }

    public void setLvhualv(String lvhualv) {
        this.lvhualv = lvhualv;
    }

    public String getGuihuahushu() {
        return guihuahushu;
    }

    public void setGuihuahushu(String guihuahushu) {
        this.guihuahushu = guihuahushu;
    }

    public String getLoucengzhuangkuang() {
        return loucengzhuangkuang;
    }

    public void setLoucengzhuangkuang(String loucengzhuangkuang) {
        this.loucengzhuangkuang = loucengzhuangkuang;
    }

    public String getGongchengjindu() {
        return gongchengjindu;
    }

    public void setGongchengjindu(String gongchengjindu) {
        this.gongchengjindu = gongchengjindu;
    }

    public String getWuyeguanlifei() {
        return wuyeguanlifei;
    }

    public void setWuyeguanlifei(String wuyeguanlifei) {
        this.wuyeguanlifei = wuyeguanlifei;
    }

    public String getWuyegongsi() {
        return wuyegongsi;
    }

    public void setWuyegongsi(String wuyegongsi) {
        this.wuyegongsi = wuyegongsi;
    }

    public String getCheweishu() {
        return cheweishu;
    }

    public void setCheweishu(String cheweishu) {
        this.cheweishu = cheweishu;
    }

    public String getCheweibi() {
        return cheweibi;
    }

    public void setCheweibi(String cheweibi) {
        this.cheweibi = cheweibi;
    }

    public String getDitie() {
        return ditie;
    }

    public void setDitie(String ditie) {
        this.ditie = ditie;
    }

    public String getGaosugaojia() {
        return gaosugaojia;
    }

    public void setGaosugaojia(String gaosugaojia) {
        this.gaosugaojia = gaosugaojia;
    }

    public int getLoupan_Id() {
        return loupan_Id;
    }

    public void setLoupan_Id(int loupan_Id) {
        this.loupan_Id = loupan_Id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLoupanyouhui() {
        return loupanyouhui;
    }

    public void setLoupanyouhui(String loupanyouhui) {
        this.loupanyouhui = loupanyouhui;
    }

    @Override
    public String toString() {
        return "CanshuBean{" +
                "loupan_Id=" + loupan_Id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", tedian='" + tedian + '\'' +
                ", price='" + price + '\'' +
                ", type='" + type + '\'' +
                ", kaifashang='" + kaifashang + '\'' +
                ", region='" + region + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", zuidishoufu='" + zuidishoufu + '\'' +
                ", loupanyouhui='" + loupanyouhui + '\'' +
                ", huxing='" + huxing + '\'' +
                ", kaipanTime='" + kaipanTime + '\'' +
                ", jiaofangTime='" + jiaofangTime + '\'' +
                ", shoulouchuAddress='" + shoulouchuAddress + '\'' +
                ", jianzhuType='" + jianzhuType + '\'' +
                ", chanquannianxian='" + chanquannianxian + '\'' +
                ", zhuangxiubiaozhun='" + zhuangxiubiaozhun + '\'' +
                ", rongjilv='" + rongjilv + '\'' +
                ", lvhualv='" + lvhualv + '\'' +
                ", guihuahushu='" + guihuahushu + '\'' +
                ", loucengzhuangkuang='" + loucengzhuangkuang + '\'' +
                ", gongchengjindu='" + gongchengjindu + '\'' +
                ", wuyeguanlifei='" + wuyeguanlifei + '\'' +
                ", wuyegongsi='" + wuyegongsi + '\'' +
                ", cheweishu='" + cheweishu + '\'' +
                ", cheweibi='" + cheweibi + '\'' +
                ", gongjiao='" + gongjiao + '\'' +
                ", ditie='" + ditie + '\'' +
                ", gaosugaojia='" + gaosugaojia + '\'' +
                '}';
    }
}
