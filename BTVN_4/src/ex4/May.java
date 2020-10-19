package ex4;

import java.util.Scanner;

public class May {
    Scanner sc = new Scanner(System.in);
    private String mayCode;
    private String mayStyle;
    private String mayStatus;

    public May(){

    }
    public May(String mayCode, String mayStyle, String mayStatus) {
        this.mayCode = mayCode;
        this.mayStyle = mayStyle;
        this.mayStatus = mayStatus;
    }

    public String getMayCode() {
        return mayCode;
    }

    public void setMayCode(String mayCode) {
        this.mayCode = mayCode;
    }

    public String getMayStyle() {
        return mayStyle;
    }

    public void setMayStyle(String mayStyle) {
        this.mayStyle = mayStyle;
    }

    public String getMayStatus() {
        return mayStatus;
    }

    public void setMayStatus(String mayStatus) {
        this.mayStatus = mayStatus;
    }
    public void Input(){
        System.out.print("Input May Code: ");
        mayCode = sc.nextLine();
        System.out.print("Input May Style: ");
        mayStyle = sc.nextLine();
        System.out.print("Input May Status: ");
        mayStatus = sc.nextLine();
    }
    public void Output(){
        System.out.println("May Code: " + getMayCode());
        System.out.println("Input May Style: " + getMayStyle());
        System.out.println("Input May Status: " + getMayStatus());
    }

}
