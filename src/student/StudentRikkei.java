package student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentRikkei {
    private String rollNumber;
    private String fullName;
    private Boolean gender;
    private Date dateOfBirth;
    private String address;
    private String className;

    public StudentRikkei() {
    }

    public StudentRikkei(String rollNumber, String fullName, Boolean gender, Date dateOfBirth, String address, String className) {
        this.rollNumber = rollNumber;
        this.fullName = fullName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.className = className;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void input(Scanner scanner) {
        System.out.println("Nhập mã sinh viên: ");
        rollNumber = scanner.nextLine();
        System.out.println("Nhập họ tên sinh viên: ");
        fullName = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập ngày sinh: ");
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dateOfBirth = sf.parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("Nhập không đúng định dạng ngày tháng");
        }
        System.out.println("Nhập quê quán: ");
        address = scanner.nextLine();
        System.out.println("Nhập tên lớp học: ");
        className = scanner.nextLine();
    }

    public void display(){
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("%-6s%-20s%-5s%-12s%-20s%-10s\n","-------","---------------------","------","-------------","---------------------","------------");
        System.out.printf("|%-6s|%-20s|%-5s|%-12s|%-20s|%-10s|\n",rollNumber,fullName,gender?"Nam":"Nữ",sf.format(dateOfBirth),address,className);
    }
    public void endTable(){
        System.out.printf("%-6s%-20s%-5s%-12s%-20s%-10s\n","-------","---------------------","------","-------------","---------------------","------------");
    }

}

/*
    Mã định danh của các kiểu dữ liệu:
    %d  : int
    %f  : float
    %lf : double
    %ld : long
    %s  : String
    %c  : char

    %-5d    : In số nguyên trong độ rộng 5 kí tự, căn bên trái
    %5d     : In số nguyên trong độ rộng 5 kí tự, căn bên phải
    %.2f    : In số thực có 2 số sau dấu phẩy
 */