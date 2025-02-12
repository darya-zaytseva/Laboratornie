import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = in.nextInt();
        int[][] sortArr = new int[n][n];
        for (int i = 0; i < sortArr.length; i++) {
            for (int j = 0; j < sortArr.length; j++) {
                System.out.println("Введите значение элемента:");
                sortArr[i][j] = in.nextInt();
            }
        }
        combSort(sortArr, n);
        for (int i = 0; i < sortArr.length; i++) {
            for (int j = 0; j < sortArr.length; j++) {
                System.out.println(sortArr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void combSort(int[][] sortArr, int n){
        double factor = 1.247;
        int step = n;
        while(step>=1){
            for(int i = 0; i+step<n; i++){
                int peri1 = i;
                int perj1 = n-1-i;
                int peri2 = i+step;
                int perj2 = n-1-i-step;
                if(sortArr[peri1][perj1]>sortArr[peri2][perj2]){
                    swap(sortArr,peri1, perj1, peri2, perj2);
                }
            }
            step/=factor;
        }
    }
    static void swap(int[][]sortArr, int peri1, int perj1, int peri2, int perj2){
        int swap = sortArr[peri1][perj1];
        sortArr[peri1][perj1]=sortArr[peri2][perj2];
        sortArr[peri2][perj2]=swap;
    }
}