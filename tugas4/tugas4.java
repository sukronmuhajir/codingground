import java.util.Scanner;
public class tugas4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("angka pertama : ");
    byte number1 = scanner.nextByte();
    System.out.print("angka kedua : ");
    byte number2 = scanner.nextByte();
    int hasil = number1+number2;
    System.out.println("jumlah " + number1 + " + " + number2 + " = " + hasil);
}
}