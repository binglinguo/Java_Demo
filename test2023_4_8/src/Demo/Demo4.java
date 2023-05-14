package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-08 17:10
 **/
public class Demo4 {
    //package test2023_4_8;
    //
    //import java.awt.List;
    //import java.util.*;
    //import java.util.Collections;
    //import java.util.Scanner;
    //import java.util.concurrent.CountDownLatch;
    //import java.util.function.IntToDoubleFunction;
    //
    //
    //public class Main {
    //	public static int count(int i) {
    //		int sum = 0;
    //		while(i > 0) {
    //			sum += i % 10;
    //			i/=10;
    //		}
    //		return sum;
    //	}
    //	public static void jinzhizhuanhuan(int key,int n) {
    //		ArrayList<Integer> list = new ArrayList<>();
    //		for(int i = 0;i < 31; i++) {
    //			if(key == 0) {
    //				break;
    //			}
    //			int t = (int) Math.pow(n, i);
    //			if(key > t) {
    //				int ret = key / t;
    //				list.add(ret);
    //				key -= t;
    //			}else {
    //				list.add(0);
    //			}
    //		}
    //		System.out.println(list);
    //	}
    //	public static void main(String[] args) {
    //		Scanner scanner = new Scanner(System.in);
    //		int n = scanner.nextInt();
    //		jinzhizhuanhuan(10, 10);
    //		//System.out.println(Arrays.toString(array));
    ////		for(int i = 1;i <= n;i++) {
    ////			if(i % count(i) == 0){
    ////				System.out.println(i);
    ////			}
    ////		}
    //
    //	}
    ////	public static void main2(String[] args) {
    ////		long num = 0;
    ////		long s = 1;
    ////		for(long i = 1;i <= 41;i++) {
    ////			s *= i;
    ////			s%=1000000000;
    ////			num+=s;
    ////			num%=1000000000;
    ////			System.out.println(i + "乘积合" + s);
    ////			System.out.println(num);
    ////			System.out.println("------");
    ////		}
    ////	}
    ////	public static void main(String[] args) {
    ////		long a = 176;
    ////		int t = 176;
    ////		for(int i = 0;i < 8; i++) {
    ////			a *= t;
    ////		}
    ////		System.out.println(a);
    ////	}
    ////	public static void main1(String[] args) {
    ////		long s = 1;
    ////		long sum = 1;
    ////		for(long i = 1;i < 2023202320L;i++) {
    ////			sum *= i;
    ////			sum = sum % 1000000000;
    ////			s+=sum;
    ////			s = s % 1000000000;
    ////		}
    ////		System.out.println(s/1000000000);
    ////	}
    //}
    //package test2023_4_8;
    //
    //import java.util.Scanner;
    //
    //public class Demo2 {
    //	public static void main(String[] args) {
    //		Scanner scanner = new Scanner(System.in);
    //		int[] table = new int[8];
    //		// 2 1 7 4 5 3 8 6
    //
    //		for(int i = 0;i < 8;i++) {
    //			table[i] = scanner.nextInt();
    //		}
    //		int n = table[0];
    //		for(int i = 0; i < 8; i+=2) {
    //			n = Math.max(n, table[i]);
    //		}
    //		int m = table[1];
    //		for(int i = 1;i < 8; i+=2) {
    //			m = Math.max(m, table[i]);
    //		}
    //		int count = 0;
    //		int[][] array = new int[m + 1][n + 1];
    //		for(int i = table[0]; i < table[2];i++) {
    //			for(int j = table[1];j < table[3];j++ ) {
    //				array[i][j] = 1;
    //				count++;
    //			}
    //		}
    //		for(int i = table[4]; i < table[6];i++) {
    //			for(int j = table[5];j < table[7];j++ ) {
    //				if(array[i][j] == 1) {
    //					continue;
    //				}
    //				array[i][j] = 1;
    //				count++;
    //			}
    //		}
    //		System.out.println(count);
    //	}
    //	public static void main1(String[] args) {
    //		Scanner scanner = new Scanner(System.in);
    //		int[] table = new int[8];
    //		// 2 1 7 4 5 3 8 6
    //		for(int i = 0;i < 8;i++) {
    //			table[i] = scanner.nextInt();
    //		}
    //		int sum1 = (table[2] - table[0]) * (table[3] - table[1]);
    //		int sum2 = (table[6] - table[4]) * (table[7] - table[5]);
    //		int sum = sum1 + sum2;
    //		if(table[2] > table[4] || table[])
    //		System.out.println(sum);
    //	}
    //}
    //import java.util.ArrayList;
    //import java.util.Arrays;
    //import java.util.Scanner;
    //
    //public class Demo1 {
    //	public static void jinzhizhuanhuan(int key,int n) {
    //		int[] array = new int[32];
    //		for(int i = 0;i < 31; i++) {
    //			if(key == 0) {
    //				break;
    //			}
    //			int t = (int) Math.pow(n, i);
    //			if(key >= t) {
    //				int ret = key / t;
    //				array[i] = ret;
    //				key -= t * ret;
    //			}
    //		}
    //		System.out.println(Arrays.toString(array));
    //	}
    //	public static void main(String[] args) {
    //		Scanner scanner = new Scanner(System.in);
    //		int n = scanner.nextInt();
    //		jinzhizhuanhuan(n, 2);
    //	}
    //}
}
