
import static java.lang.System.exit;
import java.util.Scanner;
public class Menu {
     public static void main(String[] args)
    {
    double pi=3.14;
    Scanner input = new Scanner(System.in); //memanggil library scanner
    operasi oper = new operasi(); //memanggil class operasi
    
    do {
    System.out.println("Menu");
    System.out.println("1. Balok");
    System.out.println("2. Bola");
    System.out.println("3. Kubus");
    System.out.println("4. Kerucut");
    System.out.println("5. Keluar");
    System.out.println("Pilih Menu : ");
    int menu = input.nextInt(); //input menu
    
    switch (menu){
        case 1 : //pilihan menu 1 "Balok"
        System.out.println("Volume dan Luas Balok");
            System.out.println("1. Volume");
            System.out.println("2. Luas");
            System.out.println("Pilih : ");
            int pilihbalok = input.nextInt(); //input pilihan pada menu "Balok"
    switch (pilihbalok) {
        case 1: //pilihan no 1 pada menu 1
            {
                System.out.print("panjang           : ");
                int p = input.nextInt(); //input panjang
                System.out.print("lebar             : ");
                int l = input.nextInt(); //input lebar
                System.out.print("tinggi            : ");
                int t = input.nextInt(); //input tinggi
                System.out.print("Luas permukaan    : "+ oper.LuasBalok(p,l,t) + "\n"); // memanggil proses operasi pada class operasi
                break;
            }
        case 2: //pilihan no 2 pada menu 2
            {
                System.out.print("panjang           : ");
                int p = input.nextInt(); //input panjang
                System.out.print("lebar             : ");
                int l = input.nextInt(); //input lebar
                System.out.print("tinggi            : ");
                int t = input.nextInt(); //input tinggi
                System.out.println("Volume          : " + oper.VolumeBalok(p, l, t)); // memanggil proses operasi pada class operasi
                break;
            }
        default:
            System.out.println("Pilihan Salah");
            break;
    }
            break;
            
        case 2 : //pilihan menu 2 "Bola"
            System.out.println("Volume dan Luas Bola");
            System.out.println("1. Volume");
            System.out.println("2. Luas");
            System.out.println("Pilih : ");
            int pilihbola = input.nextInt(); //input pilihan pada menu "Bola"
    switch (pilihbola) {
        case 1: //pilihan no 1 pada menu 2
            {
                System.out.print("jari-jari         : ");
                int r = input.nextInt();// input jari-jari
                System.out.print("Luas permukaan    : "+ oper.LuasBola(r) + "\n"); // memanggil proses operasi pada class operasi
                break;
            }
        case 2: //pilihan no 2 pada menu 2
            {
                System.out.print("jari-jari         : ");
                int r = input.nextInt();// input jari-jari
                System.out.println("Volume          : " + oper.VolumeBola(r)); // memanggil proses operasi pada class operasi
                break;
            }
        default:
            System.out.println("Pilihan Salah");
            break;
    }
            break;
            
        case 3 : //pilihan menu 3 "Kubus"
            System.out.println("Volume dan Luas Kubus");
            System.out.println("1. Volume");
            System.out.println("2. Luas");
            System.out.println("Pilih : ");
            int pilihkubus = input.nextInt(); 
            if(pilihkubus==1){
        System.out.print("panjang rusuk     : ");
        int a = input.nextInt();// input rusuk
        System.out.print("Luas permukaan    : "+ oper.LuasKubus(a) + "\n"); // memanggil proses operasi pada class operasi
            }
            else if (pilihkubus==2){
        System.out.print("panjang rusuk     : ");
        int a = input.nextInt();// input rusuk
        System.out.println("Volume          : " + oper.VolumeKubus(a)); // memanggil proses operasi pada class operasi
        }
            break;
        
        case 4 : //pilihan menu 4
             System.out.println("Volume dan Luas Kerucut");
            System.out.println("1. Volume");
            System.out.println("2. Luas");
            System.out.println("Pilih : ");
            int pilihkerucut = input.nextInt(); 
            if (pilihkerucut==1){
        System.out.print("jari-jari         : ");
        int r = input.nextInt(); //input jari-jari
        System.out.print("garis pelukis     : ");
        int s = input.nextInt(); //input garis pelukis
        System.out.print("tinggi            : ");
        int t = input.nextInt(); //input tinggi
        System.out.print("Luas alas         : "+ oper.LuasAlasKerucut(r)+ "\n"); // memanggil proses operasi pada class operasi
        System.out.print("Luas selimut      : "+ oper.LuasSelimutKerucut(r,s)+ "\n"); // memanggil proses operasi pada class operasi
        System.out.print("Luas permukaan    : "+ oper.LuasPermukaanKerucut(r, s) + "\n"); // memanggil proses operasi pada class operasi
            }
            else if (pilihkerucut==2){
                System.out.print("jari-jari         : ");
        int r = input.nextInt(); //input jari-jari
        System.out.print("tinggi            : ");
        int t = input.nextInt(); //input tinggi
        System.out.println("Volume          : " + oper.VolumeKerucut(r, t)); // memanggil proses operasi pada class operasi
        }
            break;
        
        case 5 :
            exit (0);
            
        default :
            System.out.println("Pilihan yang anda masukkan Salah");
            break;
            
    }
    }
    while (true);
    
}
}
