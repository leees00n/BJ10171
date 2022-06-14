public class book172ex08 {
    public static void main(String[]args){
        for( int i=0 ; i<5 ; i++){
            for( int j=0 ; j<=i ; j++)
                System.out.print("#");
            System.out.println();
        }


        System.out.println("while");

        int k=1;

        while(k<6)
        {   int q = 1;
                while(q<=k) {
                    System.out.print("#");
                    q++;
                }
         System.out.println();
            k++;
        }


        }
    }
