/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author phamthu
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //phép cộng
        Context cong  = new Context();
        cong.setTinhToan(new Cong());
        System.out.println("75 + 12 = "+ cong.tinh(75, 12));
        //phép trừ
        Context tru = new Context();
        tru.setTinhToan(new Tru());
        System.out.println("54 - 78 = "+tru.tinh(54, 78));
        //phép nhân
        Context nhan = new Context();
        nhan.setTinhToan(new Nhan());
        System.out.println("15 * 20 = "+nhan.tinh(15, 20));
        //phép chia
        Context chia  = new Context();
        chia.setTinhToan(new Chia());
        System.out.println("30 / 0 = "+chia.tinh(30, 0));
    }
    
}
