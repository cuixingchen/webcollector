package com.jyall.reptile.newHouse.bean;

/**
 * Created with IntelliJ IDEA.
 * 户型图片实体
 * User: cuipengfei
 * Date: 16-5-6
 * Time: 下午4:02
 * To change this template use File | Settings | File Templates.
 */
public class Huxing_imgBean {

    /**
     * 图片地址
     */
    private String huxing_img;

    /**
     * 图片title
     */
    private String title;

    public String getHuxing_img() {
        return huxing_img;
    }

    public void setHuxing_img(String huxing_img) {
        this.huxing_img = huxing_img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Huxing_imgBean{" +
                "huxing_img='" + huxing_img + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
