import java.util.Scanner;
public class Main {
    public static float topla(float num1,float num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        //isim ve yaş alma ve yazdırma
        /*    Scanner ekrandanal = new Scanner(System.in);
        System.out.print("Adınızı giriniz: ");
        String isim = ekrandanal.next();
        System.out.print("Yaşınızı giriniz: ");
        int yas = ekrandanal.nextInt();
        System.out.println("Merhaba "+isim+" "+yas);
        ekrandanal.close();*/

        //dairenin alanı ve çevresi hesaplama
        /*float pi=3.14f;
        Scanner ekrandanal = new Scanner(System.in);
        System.out.print("çap giriniz: ");
        float cap = ekrandanal.nextInt();
        System.out.println("çevre:"+2*pi*cap+"  alan:"+pi*cap*cap);
        ekrandanal.close();*/

        Scanner ekrandanal = new Scanner(System.in);
        System.out.println("Vize notu giriniz: ");
        float vize = ekrandanal.nextFloat();
        System.out.println("Final notu giriniz: ");
        float Yil_sonu = ekrandanal.nextFloat();
        float Donem_notu=Yil_sonu*0.7f+vize*0.3f;
        System.out.println("Dönem notunuz:"+Donem_notu);
        if(Donem_notu>60){
            System.out.println("Geçti");

        }
        else if(Donem_notu<60 && Donem_notu>50){
            System.out.println("Koşullu geçti");
        }
        else{
            System.out.println("Kaldı");

        }

        ekrandanal.close();


    }

}