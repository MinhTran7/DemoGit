/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class model {

    static Scanner sc = new Scanner(System.in);

    //nhận vào 1 lựa chọn từ 1-5
    public static int checkChoice() {
        int choice;
        while (true) {
            try {
                System.out.println("Enter your choice: ");
                String input = sc.nextLine();
                if (input.matches("[^a-zA-Z0-9]+")) {
                    System.out.println("Bạn đang nhập ký tự đặc biệt, bạn cần nhập số nguyên dương.");
                } else if ((input.length() == 1) && (input.matches("[a-zA-Z]"))) {
                    System.out.println("Bạn đang nhập kí tự, bạn cần nhập số nguyên dương.");
                } else if (input.matches(".*[a-zA-Z]+.*") && input.matches(".*\\d+.*")) {
                    System.out.println("Bạn đang nhập chuỗi, bạn cần nhập số nguyên dương.");
                } else if (input.matches(".*[a-zA-Z]+.*")) {
                    System.out.println("Bạn đang nhập chuỗi, bạn cần nhập số nguyên dương.");
                } else {
                    choice = Integer.parseInt(input);
                    if (choice < 0) {
                        System.out.println("bạn đang nhập số âm, bạn cần nhập số nguyên dương.");

                    } else if (choice > 5 || choice == 0) {
                        System.out.println("option trên không có trong lựa chọn.");

                    } else {
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Please! input integer number!!");
                sc.next();
            }
        }
        return choice;
    }

    //kiểm tra cho id, name, và specialization
    public static String checkString(String mess) {
        String string;
        while (true) {
            try {
                System.out.print(mess);
                String input = sc.nextLine();
                if (input.isEmpty()) {
                    System.out.println("Enter id can not empty!");
                } else if (input.matches("[^a-zA-Z0-9]+")) {
                    System.out.println("You are input special character. you need " + mess);
                } else if (input.matches("^\\d+$")) {
                    System.out.println("You are input number, you need " + mess);
                } else {
                    string = input;
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid value, Please enter string.");
                sc.next();
            }
        }
        return string;
    }

    //dành riêng cho update
    public static String checkStringOrEmpty(String mess) {
        String string;
        while (true) {
            try {
                System.out.print(mess);
                String input = sc.nextLine();
                if (input.isEmpty()) {
                    string = input;
                    return string;
                } else if (input.matches("[^a-zA-Z0-9]+")) {
                    System.out.println("You are input special character. you need " + mess);
                } else if (input.matches(".*\\d+.*")) {
                    System.out.println("You are input number, you need " + mess);
                } else {
                    string = input;
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid value, Please enter string.");
                sc.next();
            }
        }
        return string;
    }

    //nếu đã tồn tại thì trả về false ko thì trả về true
    public static boolean checkIDExist(ArrayList<Doctor> lx, String id) {
        for (Doctor doctor : lx) {
            if (id.equalsIgnoreCase(doctor.getId())) {
                return false;//có thì trả ra false
            }
        }
        return true;//ko có thì trả ra true
    }

    //dành riêng cho create
    public static int checkNumberOfCreate(String mess) {
        int n;
        while (true) {
            try {
                System.out.print(mess);
                String input = sc.nextLine();
                if (input.isEmpty()) {
                    System.out.println("Input cannot be empty. Please enter a number.");
                } else if (input.matches("[^a-zA-Z0-9]+")) {
                    System.out.println("Bạn đang nhập ký tự đặc biệt, bạn cần nhập số nguyên dương.");
                } else if ((input.length() == 1) && (input.matches("[a-zA-Z]"))) {
                    System.out.println("Bạn đang nhập kí tự, bạn cần nhập số nguyên dương.");
                } else if (input.matches(".*[a-zA-Z]+.*") && input.matches(".*\\d+.*")) {
                    System.out.println("Bạn đang nhập chuỗi, bạn cần nhập số nguyên dương.");
                } else if (input.matches(".*[a-zA-Z]+.*")) {
                    System.out.println("Bạn đang nhập chuỗi, bạn cần nhập số nguyên dương.");
                } else {
                    n = Integer.parseInt(input);
                    if (n < 0) {
                        System.out.println("Bạn đang nhập số âm, bạn cần nhập số nguyên dương.");
                    } else {
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Please! input integer number!!");
            }
        }
        return n;
    }

    //dành riêng cho update
    public static int checkNumber(String mess) {
        int n;
        while (true) {
            try {
                System.out.print(mess);
                String input = sc.nextLine();
                if (input.isEmpty()) {
                    return -1;
                } else if (input.matches("[^a-zA-Z0-9]+")) {
                    System.out.println("Bạn đang nhập ký tự đặc biệt, bạn cần nhập số nguyên dương.");
                } else if ((input.length() == 1) && (input.matches("[a-zA-Z]"))) {
                    System.out.println("Bạn đang nhập kí tự, bạn cần nhập số nguyên dương.");
                } else if (input.matches(".*[a-zA-Z]+.*") && input.matches(".*\\d+.*")) {
                    System.out.println("Bạn đang nhập chuỗi, bạn cần nhập số nguyên dương.");
                } else if (input.matches(".*[a-zA-Z]+.*")) {
                    System.out.println("Bạn đang nhập chuỗi, bạn cần nhập số nguyên dương.");
                } else {
                    n = Integer.parseInt(input);
                    if (n < 0) {
                        System.out.println("Bạn đang nhập số âm, bạn cần nhập số nguyên dương.");
                    } else {
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Please! input integer number!!");
            }
        }
        return n;
    }

    //so sánh 2 cái id coi có bằng nhau hay ko
    public static Doctor getDoctorbyID(ArrayList<Doctor> lg, String id) {
        for (Doctor doctor : lg) {
            if (doctor.getId().equalsIgnoreCase(id)) {
                return doctor;// bằng nhau thì trả về chính tk đoctor đấy
            }
        }
        return null;
    }

    //kiểm tra xem thông tin của người dùng nhập vào có thông tin rỗng hay không
    public static boolean checkChangeInfo(Doctor doctor, String name, String specialization, int availability) {
        if (doctor.getName().equalsIgnoreCase(name)
                && doctor.getMajor().equalsIgnoreCase(specialization)
                && doctor.getCourse() == availability) {
            return false;//vì nó chả thay đổi gì
        }
        return true;
    }

}
