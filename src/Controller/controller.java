/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Doctor;
import View.view;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class controller {
    private ArrayList<Doctor> doctorList;

    public controller() {
        doctorList = new ArrayList<>();
    }
    

    public void run() {
        while (true) {
            int choice = view.getchoice(); // Lấy lựa chọn từ người dùng
            switch (choice) {
                case 1:
                    view.createDotor(doctorList); // Tạo bác sĩ mới
                    break;
                case 2:
                    view.updateDoctor(doctorList); // Cập nhật thông tin bác sĩ
                    break;
                case 3:
                    view.deleteDoctor(doctorList); // Xóa bác sĩ
                    break;
                case 4:
                    view.searchDoctor(doctorList); // Tìm kiếm bác sĩ
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    return; // Thoát chương trình
            }
        }
    }
}
