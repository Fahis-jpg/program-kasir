package com.mycompany.tugaspemrogamanskuensial;
import java.util.Scanner;
public class TUGASPEMROGAMANSKUENSIAL {

    public static void main(String[] args) {
        System.out.println("PEMROGAMAN KASIR");
        
        double Kg, Rp, Total, Potongan, Hargadiskon, UANG, KEMBALIAN;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Kg= ");
        Kg = input.nextDouble();
        System.out.println("Rp= 14000  ");
        Rp= 14000;
        
        Total=Kg*Rp;
        Potongan=Total*0.05;
        Hargadiskon =Total-Potongan;
             
        System.out.println("Total     = "+Kg+"*"+Rp);
        System.out.println("          = " + Total);
        System.out.println("Diskon 5% = " + Hargadiskon);
        
        
        System.out.print("UANG      = ");
        UANG = input.nextDouble();
        
        KEMBALIAN=UANG-Hargadiskon;
        System.out.print("KEMBALIAN = " + KEMBALIAN);
        KEMBALIAN = input.nextDouble(); 
         
        
        
                
              
        
                                 
    }
}
