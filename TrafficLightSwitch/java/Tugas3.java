/*NAMA : WAHYU OZORAH MANURUNG
NPM: G1A022060
KELAS B2
*/
package TrafficLightSwitch.java; //PACKAGE
import java.util.Scanner; //memanggil impor package yang membaca masukan pengguna
public class Tugas3 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); //membca teks yang dimasukan pengguna
        System.out.println ("enter a color code: "); //pengguna memasukan data
        int code = input.nextInt(); //menyimpan masukan pengguna ke tipe data
        switch(code){ 
            
     case 1: //kondisi 1, jika user menginput 1
      System.out.print ("Next Traffic Light is green");//jika memenuhi maka akan diesekusi bagian ini
      break;//berhenti tanpa melanjutkan ke next case
     case 2: //kondisi 2, jika user menginput 2
     System.out.print("Next Traffic Light is yellow"); //jika memenuhi maka akan diesekusi bagian ini
     break; //berhenti tanpa melanjutkan ke next case
     case 3: //kondisi 3, jika user menginput 3
      System.out.print ("Next Traffic Light is green"); //jika memenuhi maka akan diesekusi bagian ini
      break; //berhenti
      
     default: //kondisi, jika user menginput selain ketika diatas
         System.out.print("invalid calor");//jika tidak memenuhi maka akan diesekusi bagian ini
         
     }
    }
    
}
