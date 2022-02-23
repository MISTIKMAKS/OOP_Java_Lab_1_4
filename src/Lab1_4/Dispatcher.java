package Lab1_4;

import java.lang.Math;
import java.util.Scanner;

public class Dispatcher {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double P, S;
        int n, k;
        P = 1;
        n = 1;
        while (n <= 20)
        {
            S = 0;
            k = 1;
            while (k <= n)
            {
                S += k;
                k++;
            }
            P *= ((n * n) + Math.pow(S, 2)) / (n + 1);
            n++;
        }
        System.out.println("" + P);
        P = 1;
        n = 1;
        do
        {
            S = 0;
            k = 1;
            do

            {
                S += k;
                k++;
            } while (k <= n);
            P *= ((n * n) + Math.pow(S, 2)) / (n + 1);
            n++;
        } while (n <= 20);
        System.out.println("" + P);
        P = 1;
        for (n = 1; n <= 20; n++)
        {
            S = 0;
            for (k = 1; k <= n; k++)
            {
                S += k;
            }
            P *= ((n * n) + Math.pow(S, 2)) / (n + 1);
        }
        System.out.println("" + P);
        P = 1;
        for (n = 20; n >= 1; n--)
        {
            S = 0;
            for (k = n; k >= 1; k--)
            {
                S += k;
            }
            P *= ((n * n) + Math.pow(S, 2)) / (n + 1);
        }
        System.out.println("" + P);

	}

}