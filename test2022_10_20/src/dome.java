/**
 * 麦兜最喜欢的食物是煎饼，每次在街上看到煎饼摊的时候都会在那里停留几分钟。
 * 最吸引麦兜还是煎饼师傅那一手熟练的翻煎饼的技术，一堆煎饼在那里，师傅只需要用铲子翻几下，就让煎饼整齐的叠在了一起。
 * 这天，为了庆祝麦兜被保送上研究生，他从煎饼师傅那里买回来一些煎饼请客。但是麦兜买回的煎饼大小不一，麦兜太想吃煎饼了，他想吃这些煎饼中最大的那个。
 * 麦兜还知道同学们也很喜欢煎饼，为了表示他的诚意，他想让同学们先吃，麦兜最后吃，因此，麦兜想把煎饼按照从小到大的顺序叠放在一起，
 * 大的在最下面。这样麦兜就可以在最后拿到最大的那一块煎饼了。 现在请你帮助麦兜用煎饼师傅翻煎饼的方法把麦兜买的煎饼从小到大的叠在一起。
 * 煎饼师傅的方法是用铲子插入两块煎饼之间，然后将铲子上的煎饼翻一转，这样铲子上第一个煎饼就被翻到了顶上，而原来顶上的煎饼则被翻到了刚才插入铲子的地方。
 * 麦兜希望这样翻煎饼的次数最少。
 */

import java.util.Scanner;

public class dome {
    public static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int t = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = a.length-1; i >= 0; i--) {
            t = findMax(a, i+1);
            if (a[i] != a[t]) {
                a = reverse(a, t);
                a = reverse(a, i);
            }
        }
        System.out.println(count);
    }

    public static int[] reverse(int[] a, int i) {
        int[] b=a;
        if (i != 0) {
            for(int start=0,end=i;start<end;start++,end--) {
                int temp=b[start];
                b[start]=b[end];
                b[end]=temp;
            }
            count++;
        }
        return b;
    }

    public static int findMax(int[] a, int i) {
        int max = 0;
        int t = 0;
        for (int j = 0; j < i; j++) {
            if (a[j] > max) {
                max = a[j];
                t = j;
            }
        }
        return t;
    }

}


