package com.example.java;
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]){
float a[]=new float[5];

    Scanner scanner=new Scanner(System.in);

    while (true){
        for(int i =0;i<5;i++) {
            System.out.println("請輸入第"+(i+1)+"個數字!");
            a[i] =scanner.nextFloat();
        }
        bubble(a);
      for(int i=0;i<a.length;i++){
          System.out.print(a[i]+" ");
      }
    }

    }
    public static void bubble(float [] data){
        float temp;
        for(int j=0;j<data.length-1;j++){
            for (int i=0;i<data.length-j-1;i++){
                if(data[i+1]>data[i]){
                    temp=data[i];
                    data[i]=data[i+1];
                    data[i+1]=temp;
                }
            }
        }
    }
}
