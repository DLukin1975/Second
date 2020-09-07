import java.util.Scanner;

public class Lesson2_task8 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int Code[] = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        int i = 0;
        int max = Code[0];
        int SumPositiv = 0;
        int NumPositiv = 0;
        int SumEvenNegativ = 0;
        int SumNegativ = 0;
        int NumNegativ = 0;
        for (i=0;i<Code.length;i++) {
            if (Code[i]>max) {
                max = Code[i];
            };
            if (Code[i]>0) {
                SumPositiv = SumPositiv + Code[i];
                NumPositiv = NumPositiv+1;
            };
            if (Code[i]<0&Code[i]%2==0) {
                SumEvenNegativ = SumEvenNegativ + Code[i];
            };
            if (Code[i]<0) {
                SumNegativ = SumNegativ + Code[i];
                NumNegativ = NumNegativ+1;
            };
        }
        System.out.println ("Максимальное значение: " + max);
        System.out.println ("Сумма положительных значений: " + SumPositiv);
        System.out.println ("Сумма четных отрицательных значений: " + SumEvenNegativ);
        System.out.println ("Количество положительных значений: " + NumPositiv);
        System.out.println ("Среднее арифметическое отрицательных значений: " + (float)SumNegativ/NumNegativ);
    }
}