package com.jyall.reptile.newHouse.utils;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

/**
 * Created with IntelliJ IDEA.
 * User: cuipengfei
 * Date: 16-5-6
 * Time: 下午5:46
 * To change this template use File | Settings | File Templates.
 */
public class MongoUtil {

    private static final MongoClient mongoClient = new MongoClient("localhost", 27017);

    public void addBean() {
        MongoDatabase db = mongoClient.getDatabase("xinfang");
//        db.getCollection("canshu");
    }
}
