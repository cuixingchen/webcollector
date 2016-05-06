package com.jyall.reptile.newHouse.bean;

/**
 * Created with IntelliJ IDEA.
 * 安居客新房相册信息
 * User: cuipengfei
 * Date: 16-5-5
 * Time: 下午8:19
 * To change this template use File | Settings | File Templates.
 */
public class XiangceBean {
    /**
     * 安居客楼盘Id
     */
    private int loupan_Id;

    /**
     * 图片类型
     */
    private String type;

    /**
     * 图片地址
     */
    private String img;

    /**
     * 图片alt描述
     */
    private String title;

    /**
     * 时间
     */
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "XiangceBean{" +
                "loupan_Id=" + loupan_Id +
                ", type='" + type + '\'' +
                ", img='" + img + '\'' +
                ", title='" + title + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public int getLoupan_Id() {
        return loupan_Id;
    }

    public void setLoupan_Id(int loupan_Id) {
        this.loupan_Id = loupan_Id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
