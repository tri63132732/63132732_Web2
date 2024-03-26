package org.o7planning.thymeleaf.models;

public class SinhVien {
	private String maSoSV;
	private String hoVaTen;
	private String khoa;
	private String truong;
	public String getMaSoSV() {
		return maSoSV;
	}
	public void setMaSoSV(String maSoSV) {
		this.maSoSV = maSoSV;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public String getKhoa() {
		return khoa;
	}
	public void seKhoa(String khoa) {
		this.khoa = khoa;
	}
	public String getTruong() {
		return truong;
	}
	public void setTruong(String truong) {
		this.truong = truong;
	}
	public SinhVien(String maSoSV, String hoVaTen, String khoa, String truong) {
		this.maSoSV = maSoSV;
		this.hoVaTen = hoVaTen;
		this.khoa = khoa;
		this.truong = truong;
	}
}
