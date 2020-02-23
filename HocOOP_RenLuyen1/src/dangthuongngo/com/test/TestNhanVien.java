package dangthuongngo.com.test;

import java.util.Scanner;

import dangthuongngo.com.model.NhanVien;

public class TestNhanVien {
	public static void main(String[] args) {
		NhanVien nv1,nv2;
		System.out.println("Moi ban nhap thong tin cua nhan vien 1:");
		System.out.println("Nhap ho");
		String ho1=new Scanner(System.in).nextLine();
		System.out.println("Nhap ten");
		String ten1=new Scanner(System.in).nextLine();
		System.out.println("So SanPham");
		int soSP1=new Scanner(System.in).nextInt();
		nv1=new NhanVien(ho1, ten1, soSP1);
		
		System.out.println("Moi ban nhap thong tin cua nhan vien 2:");
		System.out.println("Nhap ho");
		String ho2=new Scanner(System.in).nextLine();
		System.out.println("Nhap ten");
		String ten2=new Scanner(System.in).nextLine();
		System.out.println("So SanPham");
		int soSP2=new Scanner(System.in).nextInt();
		nv2=new NhanVien(ho2, ten2, soSP2);

		System.out.println("Luong Nhan Vien 1"+nv1.getLuong());
		System.out.println("Luong Nhan Vien 2"+nv2.getLuong());
		
		if(nv1.lonHon(nv2))
			System.out.println("NV1 nhieu hon NV2"+(nv1.getSoSP()-nv2.getSoSP()));
		else
			System.out.println("NV2 nhieu hon NV1"+(nv1.getSoSP()-nv2.getSoSP()));
	}
}
