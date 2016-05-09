package com.jyall.reptile.excel;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: cuipengfei
 * Date: 16-5-9
 * Time: 下午2:27
 * To change this template use File | Settings | File Templates.
 */
public class ExcelUtil {

    private static HashMap<String, Integer> biaozhunMap;
    private static Integer count;

    private static HashMap<Integer, String> errorMap;
    private static Integer errorCount;

    /**
     * 读取标准
     */
    public static void readBiaozhun(String pathName) throws IOException {
        FileInputStream inp = new FileInputStream("/home/pf/Desktop/天津.xls");
        HSSFWorkbook wb = new HSSFWorkbook(inp);
        HSSFSheet sheet = wb.getSheetAt(0); //
        // 填充上面的表格,数据需要从数据库查询
        HSSFRow row0 = sheet.getRow(0); //
        biaozhunMap = new HashMap<String, Integer>();
        count = 0;
        while (true) {
            HSSFCell keyCel = row0.getCell(count);
            if (keyCel == null) {
                count--;
                break;
            } else {
                String key = keyCel.getStringCellValue();
                biaozhunMap.put(key, count);
                count++;
            }
        }
    }


    /**
     *
     */
    public static void transErrorMap(String pathName,String pathName_new) throws IOException {
        FileInputStream inp = new FileInputStream(pathName);
        HSSFWorkbook wb = new HSSFWorkbook(inp);
        HSSFSheet sheet = wb.getSheetAt(0); //
        // 填充上面的表格,数据需要从数据库查询
        HSSFRow row0 = sheet.getRow(0); //
        errorMap = new HashMap<Integer, String>();
        errorCount = 0;
        while (true) {
            HSSFCell keyCel = row0.getCell(errorCount);
            if (keyCel == null) {
                errorCount--;
                break;
            } else {
                String key = keyCel.getStringCellValue();
                errorMap.put(errorCount, key);
                errorCount++;
            }
        }
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        HSSFSheet sheetNew = hssfWorkbook.createSheet(sheet.getSheetName());
        for (int cell_i = 0; cell_i <= sheet.getLastRowNum(); cell_i++) {
            HSSFRow rowNew = sheetNew.createRow(cell_i);
            HSSFRow rowOld = sheet.getRow(cell_i);
            for (Integer i :
                    errorMap.keySet()) {
                String key1 = errorMap.get(i);
                Integer value = biaozhunMap.get(key1);
                if (value == null) {
                    count++;
                    biaozhunMap.put(key1, count);
                    value = biaozhunMap.get(key1);
                }
                HSSFCell cellOld = rowOld.getCell(i);
                HSSFCell cellNew = rowNew.createCell(value, cellOld.getCellType());
                cellNew.setCellValue(cellOld.getRichStringCellValue());
            }
        }
        FileOutputStream outputStream = new FileOutputStream(pathName_new);
        hssfWorkbook.write(outputStream);
        outputStream.flush();
        outputStream.close();

    }


    public static void main(String[] args) throws Exception {
        String path = "/home/pf/Desktop/excel";
        String path_new=path+"_new";
        File file_new =new File(path_new);
        if  (!file_new .exists()  && !file_new .isDirectory())
        {
            file_new .mkdir();
        }
        File file = new File(path);
        File[] tempList = file.listFiles();
        System.out.println("该目录下对象个数：" + tempList.length);
        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                System.out.println("文     件：" + tempList[i]);
                readBiaozhun(tempList[i].getPath());

                transErrorMap(tempList[i].getPath(),path_new+"/"+tempList[i].getName());
            }
            if (tempList[i].isDirectory()) {
                System.out.println("文件夹：" + tempList[i]);
            }
        }
    }
}
