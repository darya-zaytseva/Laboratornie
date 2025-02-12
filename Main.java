import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = in.nextInt();
        int[][]sortArr = new int[n][n];
        for(int i=0; i<sortArr.length; i++){
            for(int j=0; j<sortArr.length; j++){
                System.out.println("Введите значение элемента:");
                sortArr[i][j]=in.nextInt();
            }
        }
        selectionSort(sortArr, n);
        for(int i=0; i<sortArr.length; i++){
            for(int j=0; j<sortArr.length; j++) {
                System.out.println(sortArr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void selectionSort(int[][] sortArr, int n){
        int[] dia = new int[n];
        for(int i=0; i<sortArr.length; i++){
            dia[i]=sortArr[i][n-1-i];
            }
        for(int i=0; i<dia.length-1; i++) {
                int min=i;
            for(int j=i+1; j<dia.length; j++) {
                if(dia[j]<dia[min]){
                    min=j;
                }
            }
            int per = dia[i];
            dia[i]=dia[min];
            dia[min]=per;
        }
        for(int i=0; i<sortArr.length; i++){
            sortArr[i][n-1-i]=dia[i];
        }
    }
}