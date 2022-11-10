import java.util.*;

public class Actions {
    static Scanner in = new Scanner(System.in);

    public static void oddAndEven() {
        int k = in.nextInt();
        int j = in.nextInt();
        int even = 0;
        int odd = 0;
        for (int i = k; i <= j; i++) {
            if (i % 2 == 0) {
                even++;
            } else odd++;
        }
        System.out.println("even: " + even);
        System.out.println("odd: " + odd);
    }


    public static void greaterThanOne() {
        int k;
        int num = 0;
        int result = 0;
        for (int i = 0; i < 5; i++) {
            k = in.nextInt();
            if (i == 0) num = k;
            if (num < k) {
                result++;
            }
        }
        System.out.println(result + " numbers greater than one");
    }

    public static void square(int n) {
        if (n > 0) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j <= 7; j++) {
                    System.out.print(" *");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("------------------------");
            n--;
            square(n);
        }
    }
//" \uD83E\uDD73"

    public static void triangle(int n) {
        if (n > 0) {
            for (int i = 0; i < 15; i++) {
                System.out.println();
                for (int k = 15 - i; k > 1; k--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print(" *");
                }
            }
            System.out.println();
            System.out.println("---------------------------------");
            n--;
            triangle(n);
        }
    }

    public static void orthodox(int n) {
        if (n > 0) {
            int num = 14;
            for (int i = 0; i < 7; i++) {
                System.out.println(" ");
                for (int p = 0; p < 1; p++) {
                    if (i > 0) System.out.print("|");
                }
                for (int i1 = 1; i1 < i; i1++) {
                    System.out.print("'");
                }
                for (int k = 0; k < 15; k++) {
                    if (k == num && i != 0) {
                        System.out.print("|");
                    } else System.out.print("*");
                }
                num--;
            }
            int numb = 6;
            for (int i2 = 0; i2 < 7; i2++) {
                System.out.println();
                for (int i1 = 0; i1 < i2; i1++) {
                    System.out.print(" ");
                }
                int k = 0;
                for (k = 0; k < 15; k++) {
                    if (k == numb && i2 != 6) {
                        System.out.print("|");
                    } else System.out.print("*");
                }
                numb--;
                int i1;
                for (i1 = 5; i1 > i2; i1--) {
                    System.out.print("'");
                }
                if (i1 == i2) System.out.print("|");
            }
            System.out.println();
            System.out.println("------------------------");
            System.out.println();
            --n;
            orthodox(n);
        }
    }

    public static void cripto(List<Integer> arr) {
        int balanse = 0;
        int min = arr.get(0);
        int minIndex = 0;
        int max = arr.get(0);
        int maxIndex = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
                minIndex = i;
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
                maxIndex = i;
            }
        }
        if (maxIndex == 0) {
            arr.remove(maxIndex);
            max = arr.get(0);
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) > max) max = arr.get(i);
                maxIndex = i;
            }
        }
        for (int j = 0; j < arr.size(); j++) {
            if (minIndex > maxIndex || minIndex == (arr.size() - 1)) {
                arr.remove(minIndex);
                if (arr.get(j) < min) {
                    min = arr.get(0);
                    min = arr.get(j);
                    minIndex = j;
                }
            }
        }
        for (int i = 1; i < arr.size() - 1; i++) {
            if (arr.get(i) < min) {
                min = arr.get(0);
                min = arr.get(i);
                minIndex = i;
            }
        }
        balanse = (balanse - min) + max;
        System.out.println("Your balans is: " + balanse);
    }


    public static void upperCase() {
        for (int i = 65; i < 91; i++) {
            char ch = (char) i;
            System.out.print(ch + ", ");
        }
        System.out.println();
    }

    public static boolean isFirstMax(int a, int b) {
        return a >= b;
    }

    public static char[] lowerCaseLetters(int from, int to) {
        char[] letters = new char[(to - from) + 1];
        int index = 0;
        for (int i = from; i <= to; i++) {
            letters[index] = (char) i;
            index++;
        }
        return letters;
    }

    public static void toUpperCase(char[] arr, int interval) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (arr[i] - interval);
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static boolean isContain(List<Integer> arr, int a) {
        for (int x : arr) {
            if (x == a) {
                return true;
            }
        }
        return false;
    }

    public static int num(List<Integer> arr, int k) {
        int sum = 0;
        if (!arr.contains(k)) {
            System.out.println("arr isn't contain k");
            return -1;
        }
        for (int x : arr) {
            if (x != k) {
                sum += x;
            }
        }
        return sum;
    }

    public static boolean ascending(List<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(i - 1)) return false;
        }
        return true;
    }

    public static void replace(int[] arr) {
        int[] arr1 = new int[arr.length];
        int index = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[index];
            --index;
            System.out.print(arr1[i] + ",");
        }
        System.out.println();
    }

    public static String onlyUpperCase(String str) {
        int size = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                size++;
            }
        }
        char[] arr = new char[size];
        for (int i = 0, j = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                arr[j] = str.charAt(i);
                j++;
            }
        }
        return Arrays.toString(arr);
    }

    public static void randomNumbers() {
        Random random = new Random();
        int[] arr = new int[10];
        int[] count = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 10);
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        int k;
        for (int j : arr) {
            for (k = 0; k < arr.length; k++) {
                if (j == k) {
                    count[k]++;
                }
            }
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println(i + " : " + count[i]);
        }
        System.out.println();
    }

    public static void mostRepeated() {
        Random random = new Random();
        int[] arr = new int[10];
        int[] count = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 10);
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        int k;
        for (int j : arr) {
            for (k = 0; k < arr.length; k++) {
                if (j == k) {
                    count[k]++;
                }
            }
        }
        int max = count[1];
        for (int j : count) {
            if (j > max) {
                max = j;
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (max == count[i]) {
                System.out.println("the most repeated number Is։ " + i + " : " + count[i]);
            }
        }
    }

    public static String theMostUpperCases(String[] arr) {
        String max = "";
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(arr[i - 1]) < 0) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int sunNumbersOfString(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                String s = String.valueOf(str.charAt(i));
                int a = Integer.parseInt(s);
                sum += a;
            }
        }
        return sum;
    }

    public static String secondToLast(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(str.length() - 1) == 32) {
                str = str.substring(0, str.length() - 1);
            }
            str1 += str.charAt(i);
            if (str.charAt(i) == 32) {
                str1 = "";
            }
        }
        return str1;
    }

    public static boolean armstrong(Integer num) {
        String str = num.toString();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int a = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += Math.pow(a, str.length());
        }
        return sum == num;
    }

    public static int theLargestProduct(int[] arr) {
        int sum = (arr[0] * arr[1]);
        for (int i = 1; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] * arr[j]) > sum) {
                    sum = (arr[i] * arr[j]);
                }
            }
        }
        return sum;
    }

    public static int sumOfNumbers(String str) {
        String s;
        int sum = 0;
        int j;
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                s = String.valueOf(str.charAt(i));
                for (j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) >= 48 && str.charAt(j) <= 57) {
                        s += str.charAt(j);
                    } else
                        break;
                }
                i += j - i;
                a = Integer.parseInt(s);
                sum += a;
            }
        }

        return sum;
    }


    public static void main(String[] args) {
//        List<Integer> arr = new ArrayList<>();
//        arr.add(54);
//        arr.add(99);
//        arr.add(100);
//        arr.add(101);
//        arr.add(666);
//
//        triangle(2);
//        orthodox(2);
//        square(2);
//        oddAndEven();
//        greaterThanOne();
//        upperCase();
//
//        System.out.println(isFirstMax(3, 2));
//        char[] letters = lowerCaseLetters(97, 122);
//        for (int i = 0; i < 26; i++) {
//            System.out.print(letters[i] + ", ");
//        }
//        System.out.println();
//
//        toUpperCase(letters, 32);
//        System.out.println(isContain(arr, 5));
//        System.out.println(num(arr, 7));
//        System.out.println(ascending(arr));
//
//        int[] arr1 = {5, 4, 8, 10, 44, 7, 5, 5};
//        replace(arr1);
//        System.out.println(onlyUpperCase("saA1548L;PPkAssa2A"));
//        randomNumbers();
//        mostRepeated();
//
//        String[] arr2 = {"Vardan", "VARDAN", "vardan"};
//        System.out.println(theMostUpperCases(arr2));
//        System.out.println(sunNumbersOfString("s80AL;P2Asa1A"));
        System.out.println(sumOfNumbers("18AL;P2As11A"));
//        List<Integer> arr = new ArrayList<>();
//        arr.add(54);
//        arr.add(99);
//        arr.add(100);
//        arr.add(101);
//        arr.add(666);
//
//        triangle(2);
//        orthodox(2);
//        square(2);
//        oddAndEven();
//        greaterThanOne();
//        upperCase();
//
//        System.out.println(isFirstMax(3, 2));
//        char[] letters = lowerCaseLetters(97, 122);
//        for (int i = 0; i < 26; i++) {
//            System.out.print(letters[i] + ", ");
//        }
//        System.out.println();
//
//        toUpperCase(letters, 32);
//        System.out.println(isContain(arr, 5));
//        System.out.println(num(arr, 7));
//        System.out.println(ascending(arr));
//
        int[] arr1 = {5, 44, 8, 10, 44, 7, 5, 55};
//        replace(arr1);
//        System.out.println(onlyUpperCase("saA1548L;PPkAssa2A"));
//        randomNumbers();
        mostRepeated();
//
//        String[] arr2 = {"Vardan", "VARDAN", "vardan"};
//        System.out.println(theMostUpperCases(arr2));
//        System.out.println(sumNumbersOfString("180AL;P2A2a15"));
        System.out.println(secondToLast("aaaaxxxx ahsk"));
        System.out.println(armstrong(8208));
        System.out.println(theLargestProduct(arr1));

    }
}