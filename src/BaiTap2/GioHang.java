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
public class GioHang 
{
    IThanhToan thanhToan;
    ArrayList<HangHoa> hanghoa = new ArrayList<>();

    public void setHanghoa(ArrayList<HangHoa> hanghoa) {
        this.hanghoa = hanghoa;
    }
    
    public void setHinhThucThanhToan(IThanhToan thanhToan)
    {
        this.thanhToan = thanhToan;
    }
    public int  tongTien()
    {
        int tong = 0;
        for(int i = 0; i< hanghoa.size();i++)
        {
            tong += hanghoa.get(i).getGia();
        }
        return tong;
    }
    
    public double thanhToan()
    {
        return thanhToan.thanhToan(tongTien());
    }
}
