package aed;

class Funciones {
    int cuadrado(int x){
        return x*x;
    }

    double distancia(double x, double y) {
        double res1 = x*x + y*y;
        double res2 = Math.sqrt(res1);
        return res2;
    }

    boolean esPar(int n) {
        return n % 2 == 0;
    }

    boolean esBisiesto(int n) {
        return (n%4==0 && n%100!=0) || (n % 400 == 0);
    }

    int factorialIterativo(int n) {
        int num = 1;
        if (n == 0 || n == 1) {
            return num;
        }else {
            for(int i = 2; i!=n+1; i++)
               num = num*i;
            }
        return num;
    }

    int factorialRecursivo(int n) {
        if(n==0 || n == 1){
            return 1;
        }
        return n*factorialRecursivo(n-1);
    }

    boolean esPrimo(int n) {
        double num = (int) Math.sqrt(n);

        if(n==1 || n == 0){
            return false;
        }
        for(int i = 2; i <=num ;i++){
            if(n%i==0){return false;}
        }

        return true;
    }

    int sumatoria(int[] numeros) {
        int sum = 0;
        for(int i = 0; i<numeros.length; i++){
            sum+=numeros[i];
        }
        return sum;
    }

    int busqueda(int[] numeros, int buscado) {
        int pos = 0;
        for(int i=0;i<numeros.length;i++){
            if(buscado==numeros[i]){pos=i;}
        }
        return pos;
    }

    boolean tienePrimo(int[] numeros) {
        for(int i = 0; i<numeros.length;i++){
            if(esPrimo(numeros[i])){
                return true;
            }
        }
        return false;
    }

    boolean todosPares(int[] numeros) {
        for(int i = 0; i<numeros.length;i++){
            if(!esPar(numeros[i])){
                return false;
            }
        }
        return true;
    }

    boolean esPrefijo(String s1, String s2) {
        if(s1.length() > s2.length()){return false;}
        
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){return false;}
        }
        return true;
    }

    boolean esSufijo(String s1, String s2) {
        int comienzo = s2.length()-s1.length();

        if(s1.length() > s2.length()){return false;}

        
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i)!= s2.charAt(comienzo+i)){return false;}
        }
        return true;
    }
}
