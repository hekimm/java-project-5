/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;
import java.util.Scanner;
/**
 *
 * @author hekimcanaktas
 */
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner scanner  = new Scanner(System.in);
int birinciSayi,ikinciSayi,ucuncuSayi,enBuyukSayi;

        System.out.println("Birinci sayıyı giriniz: ");
        
        birinciSayi = scanner.nextInt();
        
        System.out.println("İkinci sayıyı giriniz: ");
        
        ikinciSayi = scanner.nextInt();
        
        System.out.println("Üçüncü sayıyı giriniz: ");
        
        ucuncuSayi = scanner.nextInt();
        
        enBuyukSayi = birinciSayi;
        
        if(ikinciSayi > enBuyukSayi){
            enBuyukSayi = ikinciSayi;
            
        }
         if(ucuncuSayi > enBuyukSayi){
            enBuyukSayi = ucuncuSayi;
        }
        
        System.out.println("En büyük sayi : " + enBuyukSayi);
        
    }
    
}
