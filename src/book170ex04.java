public class book170ex04 {
    public static void main (String[] args ) {
        int i = 0, j = 0;
        for( i=0; i<5; i++){
            for(j=0; j<4; j++){
                if(i == 1 && j==1) break;
                if(i == 3 && j ==2) continue;
            }
        }
        System.out.println("i =" + i + " , j = " + j);
    }
}
