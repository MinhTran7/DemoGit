/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Doctor;
import Model.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class view {

    static Scanner sc = new Scanner(System.in);
    public static List<Doctor> ls = new ArrayList();

    public static int getchoice() {
        int choice = 0;
        System.out.println("Choice 1 option you want:");
        System.out.println("1. Create new doctor.");
        System.out.println("2. Update info of doctor.");
        System.out.println("3. Delete a doctor.");
        System.out.println("4. Search info a doctor.");
        System.out.println("5. Exist program.");
        choice = model.checkChoice();
        return choice;
    }

    //tạo 1 doctor mới
    public static void createDotor(ArrayList<Doctor> lc) {
        String id;
        do {
        id = model.checkString("Enter id you want to create: ");
        if (!model.checkIDExist(lc, id)) {
            System.err.println("Code exists, please input again!");
        } else {
            break; // Khi ID hợp lệ, thoát khỏi vòng lặp
        }
    } while (true); // Lặp lại cho đến khi ID hợp lệ

        String name = model.checkString("Enter name: ");
        String specialization = model.checkString("Enter specialiation: ");
        
        int availability = model.checkNumberOfCreate("Enter availability: ");
        lc.add(new Doctor(id, name, specialization, availability));
        System.out.println("Add successful.");

    }

    //sửa lại thông tin của 1 tk doctor đã có
    public static void updateDoctor(ArrayList<Doctor> lu) {
        String id = model.checkString("Enter id you want to update: ");
        if (model.checkIDExist(lu, id)) {
            System.err.println("Not found doctor.");
            return;
        }
        //vì nó chỉ update trên 1 đối tượng cụ thể nên dùng cái này
        Doctor doctor = model.getDoctorbyID(lu, id);
        String name = model.checkStringOrEmpty("Enter name: ");
        //người dùng ko nhập gì thì lấy thông tin cũ
        if (name.isEmpty()) {
            name = doctor.getName();
        }
        String specialization = model.checkStringOrEmpty("Enter specialiation: ");
        if (specialization.isEmpty()) {
            specialization = doctor.getMajor();
        }
        int availability = model.checkNumber("Enter availability: ");
        if (availability == -1) {
            availability = doctor.getCourse();
        }
        //in ra man hình cho người dùng biết họ đã không nhập gì và thông tin vẫn được giữ nguyên.
        if (!model.checkChangeInfo(doctor, name, specialization, availability)) {
            System.err.println("No change.");
            return;
        }
        doctor.setName(name);
        doctor.setMajor(specialization);
        doctor.setCourse(availability);
        System.out.println("Update successful.");

    }

    //xoá 1 tk doctor
    public static void deleteDoctor(ArrayList<Doctor> ld) {
        String id = model.checkString("Enter id you want to delete: ");
        if (model.checkIDExist(ld, id)) {
            System.out.println("Not found doctor."); // Nếu ID không tồn tại
            return;
        }

        Doctor doctor = model.getDoctorbyID(ld, id);
        ld.remove(doctor); // Nếu tìm thấy, xóa bác sĩ
        System.out.println("Delete successful.");
    }

    //tìm kiểm 1 tk doctor
    public static void searchDoctor(ArrayList<Doctor> ls) {
        String id = model.checkString("enter id you want to search: ");
        
        Doctor doctor = model.getDoctorbyID(ls, id);
        if (doctor == null) {
            System.out.println("Id not exist.");
        }else{
            System.out.printf("id: %-15s name: %-15s specialization: %-25s availability: %-20s\n", 
                    doctor.getId(), doctor.getName(), doctor.getMajor(), doctor.getCourse());
            }
        }
    
    
    }


