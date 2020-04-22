/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author phamthu
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tạo  giỏ hàng1
        System.out.println("---------GIỎ HÀNG 1---------------");
        ArrayList<HangHoa> hangHoa1 = new ArrayList<>();
        //thêm vào giỏ hàng
        hangHoa1.add(new HangHoa("Dưỡng da", 500000, "Vasaline"));
        hangHoa1.add(new HangHoa("bông tẩy trang", 60000, "tẩy trang"));
        //thanh toán giỏ hàng 1 online
        System.out.println("---------Thanh toán giở hàng 1 theo thanh toán ONLINE----------");
        GioHang gioHang1 = new GioHang();
        gioHang1.setHanghoa(hangHoa1);
        gioHang1.setHinhThucThanhToan(new ThanhToanOnline());
        for(int i =0 ;i<hangHoa1.size();i++)
        {
            System.out.println("Giỏ hàng 1 Thanh toán Online :"+ "Tên hàng hóa :"+hangHoa1.get(i).getTenHH()+"\n"+"Giá :"
                  +hangHoa1.get(i).getGia()+"\n"+"Mô tả :"+hangHoa1.get(i).getMoTa());
        }
        //tổng tiêng của giỏ hàng 1
            System.out.println("Tổng tiền của của hàng 1 : "+gioHang1.tongTien());
         //tổng tiền thanh toán online
            System.out.println("Tổng tiền thanh toán online của giỏ hàng 1 :"+gioHang1.thanhToan());
         //Thanh toán giỏ hàng 1 theo COD
          System.out.println("---------Thanh toán giở hàng 1 theo thanh toán COD----------");
         gioHang1.setHinhThucThanhToan(new ThanhToanCOD());
        for(int i =0 ;i<hangHoa1.size();i++)
        {
            System.out.println("Giỏ hàng 1 Thanh toán COD :"+ "Tên hàng hóa :"+hangHoa1.get(i).getTenHH()+"\n"+"Giá :"
                  +hangHoa1.get(i).getGia()+"\n"+"Mô tả :"+hangHoa1.get(i).getMoTa());
        }
        //tổng tiêng của giỏ hàng 1
            System.out.println("Tổng tiền của của hàng 1 : "+gioHang1.tongTien());
         //tổng tiền thanh toán online
            System.out.println("Tổng tiền thanh toán COD của giỏ hàng 1 :"+gioHang1.thanhToan());
        //tạo giở hàng 2
        System.out.println("----------------------------------------------------");
        System.out.println("---------GIỎ HÀNG 2----------");
        ArrayList<HangHoa> hangHoa2 = new ArrayList<>();
        // them vào giỏ hàng
        hangHoa2.add(new HangHoa("sữa",45000, "sửa tiệt trùng"));
        hangHoa2.add(new HangHoa("Bánh mì", 240000, "dùng để ăn"));
        //thanh toán giỏ hàng 2 online
        System.out.println("---------Thanh toán giở hàng 2 theo thanh toán ONLINE----------");
        GioHang gioHang2 = new GioHang();
        gioHang2.setHanghoa(hangHoa2);
        gioHang2.setHinhThucThanhToan(new ThanhToanOnline());
        for(int i =0 ;i<hangHoa2.size();i++)
        {
            System.out.println("Giỏ hàng 2 Thanh toán Online :"+ "Tên hàng hóa :"+hangHoa2.get(i).getTenHH()+"\n"+"Giá :"
                  +hangHoa2.get(i).getGia()+"\n"+"Mô tả :"+hangHoa2.get(i).getMoTa());
        }
        //tổng tiêng của giỏ hàng 2
            System.out.println("Tổng tiền của của hàng 2 : "+gioHang2.tongTien());
         //tổng tiền thanh toán online
            System.out.println("Tổng tiền thanh toán online của giỏ hàng 2 :"+gioHang2.thanhToan());
         //Thanh toán giỏ hàng 2 theo COD
          System.out.println("---------Thanh toán giở hàng 2 theo thanh toán COD----------");
         gioHang2.setHinhThucThanhToan(new ThanhToanCOD());
        for(int i =0 ;i<hangHoa2.size();i++)
        {
            System.out.println("Giỏ hàng 2 Thanh toán COD :"+ "Tên hàng hóa :"+hangHoa2.get(i).getTenHH()+"\n"+"Giá :"
                  +hangHoa2.get(i).getGia()+"\n"+"Mô tả :"+hangHoa2.get(i).getMoTa());
        }
        //tổng tiêng của giỏ hàng 1
            System.out.println("Tổng tiền của của hàng 2 : "+gioHang2.tongTien());
         //tổng tiền thanh toán online
            System.out.println("Tổng tiền thanh toán COD của giỏ hàng 2 :"+gioHang2.thanhToan());
          System.out.println("----------------------------------------------------");
        
        
    }
    
}
