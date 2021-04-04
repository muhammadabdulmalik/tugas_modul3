package searching;
import java.util.Scanner;
public class binary {
    public static void main(String[] args){
          int data[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int posisiAwal = 0;
        int posisiAkhir = data.length - 1;
        int pointer;
        boolean ketemu = false;
        
        
        
        System.out.println("** Binary Search **");
        System.out.println();
        
        
        
        System.out.println("Isi data adalah");
        for(int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
        
        
        
        System.out.print("Masukkan data yang dicari : ");
        Scanner masukan = new Scanner(System.in);
        int cari = masukan.nextInt();
        
        
        
        while((posisiAwal <= posisiAkhir) && (ketemu == false)){
            pointer = (posisiAwal + posisiAkhir) / 2;
            
            System.out.println("index pointer : " + pointer);
            if(cari == data[pointer]){
                ketemu = true;
                System.out.println("Data " + cari + " telah ditemukan pada index ke " + pointer);
            }else if(cari < data[pointer] ){
                System.out.println("cari di kiri");
                posisiAkhir = pointer - 1;
            }else if(cari > data[pointer]){
                System.out.println("cari di kanan");
                posisiAwal = pointer + 1;
            }
        }
        
        
        
        if(ketemu){
            System.out.println("Kesimpulan: data ditemukan");
        }else{
            System.out.println("Kesimpulan: data tidak ditemukan");
        }
        
        
        
        System.out.println();
        System.out.println("Muhammad Abdul Malik");
        System.out.println("** Terimakasih **");
    }
}