package Practica1;

public class iterar {
	
    public static void conFor(int a,int b){
        for (int i=a ;i<=b;i++){
            System.out.println(i);
        }
    }

    public static void conWhile(int a, int b){
        while (a<=b){
            System.out.println(a);
            a++;
        }
    }

    public static void sinEstructuras(int a,int b){
        if (a<=b){
            System.out.println(a);
            sinEstructuras(a+1, b);
        }    
    }

    public static void otraSinEstructuras(int a,int b){
        if (a==b){
            System.out.println(b);
        }else{
            System.out.println(a);
            otraSinEstructuras(a+1, b);
        }
    }
}
