import java.util.Scanner;

public class Task1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your number");
            int size = sc.nextInt();
            int[][] array = new int[size][size];
            int k, i, j, i1, i2, j1, j2, value = 1;
            i1  = j1  = 0;
            i2  = j2 = size;
            for(k = 0; k < size / 2 + 1; i1++, i2--, j1++, j2--, value++, k++) {
                for(i = i1; i < i2; i++){
                    for(j = j1; j < j2; j++) {
                        array[i][j] = value;
                    }
                }
            }
            for(i = 0; i < size; i++){
                for(j = 0; j < size; j++)
                    System.out.print(array[i][j]+" ");
                System.out.println();
            }
        }
    }
