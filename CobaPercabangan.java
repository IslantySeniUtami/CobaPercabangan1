package cobapercabangan;

import java.util.Scanner;

public class CobaPercabangan {
    public static void main(String[] args) {
        String identitas = "Islanty Seni Utami / X RPL 4 / 21";
        System.out.println("Identitas : "+ identitas);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nilai a ?");
        int a = scanner.nextInt();
        
        System.out.println("\nIF.. 1");
        if(a < 7) System.out.println("nilai a kurang dari 7");
        
        System.out.println("nIF.. 2");
        if(a == 7)
            System.out.println("nilai a sama dengan 7");
        
        System.out.println("nIF.. 3");
        if(a > 7)
            System.out.println("isi variabel a : "+ a);
            System.out.println("nilai a lebih dari 7");
    System.out.println("\nIF..ELSE..");
    if (a < 7) {
        System.out.println("isi variabel a : "+ a);
        System.out.println("nilai a kurang dari 7");  
    } else System.out.println("nilai a lebih dari atau sama dengan 7");
    System.out.println("\nIF..ELSE IF..ELSE.. 1");
    if(a < 7) {
        System.out.println("nilai a kurang dari 7");
    } else if(a == 7) {
        System.out.println("nilai a samma dengan 7");
    } else
        System.out.println("nilai a lebih dari 7");
    
    System.out.println("\nIF..ELSE IF..ELSE.. 2");
    if(a < 7) {
        System.out.println("nilai a kurang dari 7");
    } else if(a < 7) {
        System.out.println("nilai a kurang dari 7");
    } else if(a < 14) {
        System.out.println("nilai a kurang dari 14");
    } else if(a == 21) {
        System.out.println("nilai a sama dengan 21");
    }else {
        System.out.println("nilai a lebih dari 21");
    System.out.println("\nNested IF");
    if(a < 7) {
        System.out.println("nilai a kurang dari 7");
        if(a > 8)
            System.out.println("nilai a lebih dari 8");
        if(a < 14)
            System.out.println("nilai a kurang dari 14");
    System.out.println("\nSWITCH..CASE");
    switch(a) {
        case 1: System.out.println("nilai a => 1"); break;
        case 2: System.out.println("nilai a => 2"); break;
        case 3:
        case 4: System.out.println("nilai a => 3 atau 4"); break;
        case 5: System.out.println("nilai a => 5"); break;
        default: System.out.println("nilai a bukan antara 1-5");
    }
    int nilai;
    System.out.print("\nNilai Anda ?");
    nilai = scanner.nextInt();
    
    String grade = (nilai < 75 ? "belum kompeten" : "kompeten");
    System.out.println(nilai + " => " + grade);
    }
    
    }
    
    }
}
