package Strings;

import java.sql.SQLOutput;

public class Document
{
    static StringBuilder FirstBlocks(String[] str)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(str[0]);
        sb.append(str[2]);
        return sb;
    }
    static String[] PrintEditNumber(String[] str)
    {
        for (int i=0;i<5;i++)
        {
            if(i==1||i==3)
                System.out.print("***");
            else System.out.print(str[i]);
        }
        return str;
    }
    static void printOnlyLettersLC(String[] str)
    {
        StringBuilder letters = new StringBuilder();
        letters.append(str[1].toLowerCase() + "/");
        letters.append(str[3].toLowerCase() + "/");
        String sub = new String();
        sub = str[4].substring(0, 1);
        String temp = sub.toUpperCase();
        letters.append(sub.toLowerCase() + "/");
        sub = str[4].substring(2, 3);
        letters.append(sub.toLowerCase() + "/");
        System.out.println("\n\n"+letters);
        System.out.println("Letters:"+str[1].toUpperCase()+"/"+str[3].toUpperCase()+"/"+temp+"/"+sub.toUpperCase()+"\n");
    }
    static void Checking(String str, String[] subber)
    {
        boolean qwe=false;
        for(int i=0;i<5;i++)
        {
            if (subber[i].compareToIgnoreCase("abc")==0)
            {
                System.out.println("Document number contain sequence abc regardless register\n\n");
                 qwe = true;
            }
        }
        if(!qwe)
        {
            System.out.println("Document number doesn't contain sequence abc regardless register\n\n");
        }
        String tempbuf = str.substring(0,4);
        if(tempbuf.compareTo("555")==1)
        {
            System.out.println("Document starts with 555\n\n");
        }
        else {System.out.println("Document doesn't start with 555\n\n");}
        tempbuf = str.substring(18, 22);

        if(tempbuf.compareToIgnoreCase("a1b2")==0)
        {
            System.out.println("Document ends with a1b2");
        }
        else
        {System.out.println("Document doesn't end with a1b2");}
    }
}
