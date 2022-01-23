package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 int day=0;
     int month=1;
     String msj = "Burcunuz: ";
     String burc;
        System.out.println("1. Ay 1. Gün olarak giriniz!");
     Scanner inp=new Scanner(System.in);
        System.out.print("Ay:");
        month= inp.nextInt();
        System.out.print("Gün: ");
        day= inp.nextInt();
      if(month==1)
       if (day >=1 && day <=31 )
       if (day < 22)
      {
         burc ="Oğlak";
          System.out.println(msj+burc);
      }
      else
       {
           burc="Kova";
           System.out.println(msj+burc);
       }

      if(month==2)
          if(day >=1 &&  day <=28)
              if (day <22)
              {
                  burc="Kova";
                  System.out.println(msj+burc);
              }
       else
              {
                  burc="Balık";
                  System.out.println(msj+burc);
              }
        if(month==3)
            if(day >=1 &&  day <=31)
                if (day <20)
                {
                    burc="Balık";
                    System.out.println(msj+burc);
                }
                else
                {
                    burc="Koç";
                    System.out.println(msj+burc);
                }
        if(month==4)
            if(day >=1 &&  day <=30)
                if (day <21)
                {
                    burc="Koç";
                    System.out.println(msj+burc);
                }
                else
                {
                    burc="Boğa";
                    System.out.println(msj+burc);
                }
        if(month==5)
            if(day >=1 &&  day <=31)
                if (day <21)
                {
                    burc="Boğa";
                    System.out.println(msj+burc);
                }
                else
                {
                    burc="İkizler";
                    System.out.println(msj+burc);
                }
        if(month==6)
            if(day >=1 &&  day <=30)
                if (day <22)
                {
                    burc="İkizler";
                    System.out.println(msj+burc);
                }
                else
                {
                    burc="Yengeç";
                    System.out.println(msj+burc);
                }
        if(month==7)
            if(day >=1 &&  day <=31)
                if (day <23)
                {
                    burc="Yengeç";
                    System.out.println(msj+burc);
                }
                else
                {
                    burc="Aslan";
                    System.out.println(msj+burc);
                }
        if(month==8)
            if(day >=1 &&  day <=31)
                if (day <23)
                {
                    burc="Aslan";
                    System.out.println(msj+burc);
                }
                else
                {
                    burc="Basak";
                    System.out.println(msj+burc);
                }
        if(month==9)
            if(day >=1 &&  day <=30)
                if (day <23)
                {
                    burc="Basak";
                    System.out.println(msj+burc);
                }
                else
                {
                    burc="Terazi";
                    System.out.println(msj+burc);
                }
        if(month==10)
            if(day >=1 &&  day <=31)
                if (day <23)
                {
                    burc="Terazi";
                    System.out.println(msj+burc);
                }
                else
                {
                    burc="Akrep";
                    System.out.println(msj+burc);
                }
        if(month==1)
            if(day >=20 &&  day <=30)
                if (day <23)
                {
                    burc="Akrep";
                    System.out.println(msj+burc);
                }
                else
                {
                    burc="Yay";
                    System.out.println(msj+burc);
                }
        if(month==12)
            if(day >=1 &&  day <=31)
                if (day <22)
                {
                    burc="Yay";
                    System.out.println(msj+burc);
                }
                else
                {
                    burc="Oğlak";
                    System.out.println(msj+burc);
                }
                if (day >31 && month >12 ) {
                    System.out.println("Yanlış bir gün veya Ay girdiniz");

                }

    }
}
