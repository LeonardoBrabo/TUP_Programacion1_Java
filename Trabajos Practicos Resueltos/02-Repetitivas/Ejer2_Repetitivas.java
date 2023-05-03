public class Ejer2_Repetitivas {
    public static void main(String[] args) {

        //forma con for
        for (int i=2;i<=300;i+=2){
            System.out.print(i+" ,");
        }

        //forma con while
        int cont = 0;
        while(cont <=300){
            cont+=2;
            System.out.println(cont);
        }

        while(cont <=5000){
            if(cont == 300) break; //usando break.
            cont+=2;
            System.out.println(cont);

        }

    }


}
