/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author hunglv
 */
public class HoaDonChiTiet {
    int id;
    int soLuong;
    int idHoaDonBan;
    MatHang mh;

    public HoaDonChiTiet(int id, int soLuong, int idHoaDonBan, MatHang mh) {
        this.id = id;
        this.soLuong = soLuong;
        this.idHoaDonBan = idHoaDonBan;
        this.mh = mh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getIdHoaDonBan() {
        return idHoaDonBan;
    }

    public void setIdHoaDonBan(int idHoaDonBan) {
        this.idHoaDonBan = idHoaDonBan;
    }

    public MatHang getMh() {
        return mh;
    }

    public void setMh(MatHang mh) {
        this.mh = mh;
    }

    
    
    
}
