package searching;
import java.util.Scanner;
public class sequential {
    public static void main(String[] args) {
        String data[] = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "Nama Mahasiswa", "Tesla"};
        boolean ketemu = false;
        
        
        
        System.out.println("** Secuential Search **");
        System.out.println();
        
        
        
        System.out.print("Isi data adalah: | ");
        for(int i=0; i < data.length; i++){
            System.out.print(data[i] + " | ");
        }
        System.out.println();
        
        
        
        System.out.print("Masukkan data yang dicari: ");
        Scanner masukan = new Scanner(System.in);
        String cari = masukan.nextLine();
        
        
        
        for(int i=0; i<data.length; i++){
            if(cari.equalsIgnoreCase(data[i])){
                System.out.println("Data " + cari + " berada pada index ke-" + i);
                ketemu = true;
                break;
            }
        }
        
        
        
        if(!ketemu){
            System.out.println("data tidak ditemukan");
        }
        
        
        
        System.out.println();
        System.out.println("Fajar wahyu pratama");
        System.out.println("** Terimakasih **");
    }
}