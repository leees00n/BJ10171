public class book170ex05 {
    public static void main (String[] args){
        int i = 2, j = 0;
        switch (i){
            case 0 : j+=0;
            break;
            case 2 : j+=2;
                break;

            case 4 : j+=4;
            break;

            default: j+=6;
                break;

        }
        System.out.println(j);
    }
}
