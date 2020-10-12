/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Admin
 */
public class RunMain {
    public static void main(String[] args) {
        HangHoa h1 = new HangHoa("TV1", "Ti vi", 12000000, 2);
        System.out.println("*Thông tin mặt hàng thứ nhất là:");
        h1.Xuat();
        HangHoa h2 = new HangHoa();
        h2.setMaHang("TL1");
        h2.setTenHang("Tủ lạnh");
        h2.setDonGia(4000000);
        h2.setSoLuong(3);
        System.out.println("*Thông tin mặt hàng thứ 2 là:");
        h2.Xuat();
    }
}
