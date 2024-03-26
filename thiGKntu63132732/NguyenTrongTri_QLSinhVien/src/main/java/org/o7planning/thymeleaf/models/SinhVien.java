package org.o7planning.thymeleaf.models;

public class SinhVien {
	private String maSoSV;
	private String hoVaTen;
	private String diem;
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
	public String getDiem() {
		return diem;
	}
	public void seKhoa(String diem) {
		this.diem = diem;
	}

	public SinhVien(String maSoSV, String hoVaTen, String diem) {
		this.maSoSV = maSoSV;
		this.hoVaTen = hoVaTen;
		this.diem = diem;
	}
}
