import java.net.SocketPermission;

public class Array {
    public static void main(String args[]) {
        int[] arr = new int[500];

        int[] ar = { 10, 20, 30, 40 };

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);      // 0 0 0 0 
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println(arr[i]);     // 10, 20, 30, 40
        }
        
        System.out.println("");
        System.out.println("");


        int [][] flat = new int[2][3];
        // flat = {2,4,6,8};
        for(int i = 0; i < flat.length; i++)
        {
            for(int j = 0; j < flat[i].length; j++){
                System.out.print(flat[i][j]);
            }
            System.out.println("");
        }
    }

}
