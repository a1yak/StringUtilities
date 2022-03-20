package Strings;

import java.util.Scanner;
import java.util.Locale;
public class Main
{
   public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String docNum; // "5555-aBC-7776-reto-A1b2";
        System.out.println("Введите номер документа в формате xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.");
        docNum = sc.nextLine();
        String[] num = docNum.split("-");
        System.out.println("First blocks of numbers: "+Document.FirstBlocks(num)+"\n\nEdited document number");
        Document.PrintEditNumber(num);
        Document.printOnlyLettersLC(num);
        Document.Checking(docNum, num);
        sc.close();
    }
}
