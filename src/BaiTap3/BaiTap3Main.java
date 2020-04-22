/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;



/**
 *
 * @author phamthu
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        QLSV qlsv = new QLSV();
        // tạo danh sách sinh viên
        ArrayList<SinhVien> dssv = new ArrayList<>();
        // thêm danh sách 
        dssv.add(new SinhVien("vũ thị thu", new SimpleDateFormat("yyyy,mm,dd").parse("1998,2,24"), 10));
        dssv.add(new SinhVien("nguyễn thu ni", new SimpleDateFormat("yyyy,mm,dd").parse("2000,2,12"), 5));
        dssv.add(new SinhVien("nguyễn  xuân vũ", new SimpleDateFormat("yyyy,mm,dd").parse("2001,6,23"), 7));
        qlsv.setSinhVien(dssv);
        
        //in danh sách theo tên
        System.out.println("------------IN DANH SÁCH THEO TÊN ------------");
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        qlsv.inDS();
        System.out.println("---------------------------------");
        //in danh sách theo điểm
        System.out.println("------------IN DANH SÁCH THEO ĐIỂM ------------");
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        qlsv.inDS();
        System.out.println("-------------------------------");
        
        
       
        

    }
    
}
