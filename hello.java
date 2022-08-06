import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.DoubleToIntFunction;

import javax.imageio.plugins.tiff.ExifTIFFTagSet;

// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileWriter;
// import java.util.Scanner;

// public class hello {

// public static void main(String[] args) {

// // System.out.println("hey");

// // well, lets work with method

// add(5, 6);
// add(100, 60);
// divide(20, 10);
// // adding strings
// stringss("Hey Abul ", "Welcome");

// }

// public static void add(int a, int b) {
// System.out.println(a + b);
// }

// public static void divide(int a, int b) {
// System.out.println(a / b);

// }

// public static void stringss(String a, String b) {
// System.out.println(a + b);

// }
// }

// in this section, lets get current time using java

// public class hello {
// public static void main(String[] args) {

// Date time = new Date();
// System.out.println("The time is: " + time);

// }
// }

// now lets create a programs that reads and write to a text file

// public class hello {
// public static void main(String[] args) throws FileNotFoundException {

// File file = new File("C:/Users/akala/OneDrive/Documents/Java/captmidn.txt");
// // now lets scan throuh the file
// Scanner scan = new Scanner(file);

// String emptyFile = "";

// while (scan.hasNextLine()) {

// emptyFile = emptyFile.concat(scan.nextLine() + "\n");

// }

// System.out.println("value" + emptyFile);

// try {
// FileWriter newFile = new
// FileWriter("C:/Users/akala/OneDrive/Documents/Java/text.txt.txt");
// newFile.write(emptyFile);
// newFile.close();

// } catch (Exception e) {
// System.out.println("An error occurred.");
// e.printStackTrace();
// }

// }
// }

// // in this section we will prctice array
// public class hello {

// public static void main(String[] args) {

// // lets create an array
// int[] array = { 1, 2, 3, 4, 5 };

// int size = array.length;

// // System.out.println(size);
// for (int i = 0; i < size; i++) {
// System.out.println(array[i]);

// }

// }
// }

// in this section we will try to find maximum or minimum number in the list

// public class hello {

// public static void main(String[] args) {

// // lets create an array

// int[] array = { 10, 5, -8, 1, 2, 3, 4, 5 };
// int max = 0;

// // lets find tye smnallest number in the array
// for (int i = 0; i < array.length; i++) {
// if (array[i] > max) {
// max = array[i];

// }
// }
// System.out.println("The max num is: " + max);

// }
// }

// lets find the minimu of an array

// public class hello {

// public static void min(int[] array) {
// int min = 0;

// for (int i = 0; i < array.length; i++) {
// if (array[i] < min) {
// min = array[i];

// }
// }

// System.out.println("the min is: " + min);

// }

// public static void main(String[] args) {
// int[] myArray = { 10, 5, -8, 1, 2, 3, 4, 5 };

// // hello find_min = new hello();

// min(myArray);

// // System.out.println("the min is: " + find_min.min(myArray));

// }
// }

// well now lets work with array_list

// public class hello {
// public static void main(String[] args) {

// // lets create a arraylist

// ArrayList<String> myArrya = new ArrayList<>();

// myArrya.add("Abul");
// myArrya.add("kalam");
// myArrya.add("Abul");

// System.out.println(myArrya.size());

// System.out.println(myArrya.get(1));

// System.out.println(myArrya);

// for (int i = 0; i < myArrya.size(); i++) {

// // by per index
// System.out.println(myArrya.get(i));

// }

// // lets run this in fir each loop

// System.out.println("For Each loop");
// for (String names : myArrya) {
// System.out.println(names);

// }

// }
// }

// leetcode problem

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// public class hello {

// public int[] twoSum(int[] nums, int target) {

// int[] res = new int[2];

// for (int i = 0; i < nums.length; i++) {

// for (int j = 1 + i; j < nums.length; j++) {

// if (nums[i] + nums[j] == target) {

// res[0] = j;
// res[1] = i;

// }

// }

// }

// return res;

// }

// public static void main(String[] args) {
// int [] nums = {2,7,11,15};
// int target = 9;

// hello find_min = new hello();

// twoSum(nums, target);

// System.out.println("the min is: " + twoSum);

// }
// }

// public class hello {
// public static void main(String[] args) {
// // public static void fizzBuzz(int n) {

// // int n = 15;

// // for (int i = 1; i <= n; i++) {

// // // System.out.println("The n value is " + n);

// // if (i % 3 == 0 && i % 5 == 0) {
// // System.out.println("FizzBuzz");

// // } else if (i % 3 == 0) {
// // System.out.println("Fizz");

// // } else if (i % 5 == 0) {
// // System.out.println("Buzz");

// // } else {
// // }
// // System.out.println(i);
// // }

// String name = " Abul";

// System.out.println(name[1]);
// }
// }

// leetcode problem

// class hello {
// public int[] twoSum(int[] nums, int target) {

// // given array of integers called NUM also TARGET
// // add-up two NUMS to get TARGET

// /*
// *
// * Input: nums = [2,7,11,15], target = 9
// * Output: [0,1]
// * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// */

// // so add two nums from an array, we have create a loops that adds both index
// // and
// // checks if that matches with target

// int sums;
// int indexF;
// int indexL;

// int[] indexes = new int[2];

// // this will be start with first index
// for (int i = 0; i < nums.length; i++) {

// // while this loop will start with next index of first index,
// // lets say fisrt one is 1, second loop will be 2 and go on
// for (int j = i + 1; j < nums.length; j++) {

// indexF = nums[i];
// indexL = nums[j];
// sums = indexF + indexL;

// if (sums == target) {

// indexes[0] = i;
// indexes[1] = j;

// }

// }

// }

// return indexes;

// }
// }

// interview quetion
// you are given a two-digit integer n. return the sum of its digits.

// class hello {
// public static void main(String[] args) {

// int n = 123;

// String s = Integer.toString(n);

// int sum = 0;

// for (int i = 0; i < s.length(); i++) {
// char toChar = s.charAt(i);
// // this gettimg actual value of char
// int convertedChar = Character.getNumericValue(toChar);

// // lets convert it to a CHAR

// sum = sum + convertedChar;
// System.out.println("Convereted char is: " + toChar);

// }

// System.out.println("Added char: " + sum);

// }

// }

/*
 * For deposits = [9, 7, 12] and
 * 
 * operations = [
 * "buy 1 3 2",
 * "sell 1 4 10",
 * "deposit 2 12",
 * "buy 2 10 2",
 * "buy 2 6 3"
 * ]
 * the output should be solution(deposits, operations) = [3, 3, 19, 19, 1].
 */

// int[] solution(int[] deposits, String[] operations) {

// }

// remove duplicates from the an array

// class hello {

// public static void main(String[] args) {

// int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

// int[] temp = new int[nums.length];

// int y = 0;

// int k = 0; // this is for the tototal index on

// for (int i = 0; i < nums.length - 1; i++) {

// // int firstI = nums[i];
// // int secondI = nums[i + 1];

// if (nums[i] != nums[i + 1]) {

// temp[y++] = nums[i];
// }
// }

// temp[y++] = nums[nums.length - 1];

// for (int j = 0; j < y; j++) {
// // System.out.println(temp[j]);

// k++;
// }

// System.out.println("Length: " + k);

// }
// }

// HASHMAP in JAVA

// class hello {
// public static void main(String[] args) {

// HashMap<String, Integer> Map = new HashMap<>();

// Map.put("Abul", 1);
// Map.put("Kalam", 3);

// // here asking if its conrain key. if so it will return true..

// // System.out.println(Map.containsKey("Abul"));

// // this sattement getting value of key
// // System.out.println(Map.get("Abul"));

// // this statement checking if it contaijs valu

// // System.out.println(Map.containsValue(1));

// System.out.println(Map);

// System.out.println("The Value for Abul is: " + Map.get("Abul"));

// System.out.println("The added for Abul is: " + Map.get("Abul") + 1);

// }
// }

// HASPMAP CONTINUES, LETS FIND DUBLICATES OF NUMBERS

// class hello {
// public static void main(String[] args) {

// // initialized array, we will be using tghis array to find duplicates

// int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 0, 1, 4, 6, 8 };

// // declaring hasmap
// HashMap<Integer, Integer> array = new HashMap<>();

// int nLength = nums.length;

// for (int i = 0; i < nLength; i++) {
// // if the key contain values, we will add 1+1 to it

// if (array.containsValue(nums[i])) {

// array.put(nums[i], array.get(nums[i] + 1));
// // System.out.println(array.put(nums[i], array.get(nums[i] + 1)));
// // else we will just add value as one to each of the key and add to the
// } else {
// array.put(nums[i], 1);
// }

// // else we will just add value as one to each of the key and add to the

// }
// // this should get all the key in the haspmap that we just stored
// for (Integer key : array.keySet()) {

// System.out.println(key);

// }
// // System.out.println(array);

// }
// }

// class hello {
// public static void main(String[] args) {

// int[] nums = { 0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 0, 1, 4, 6, 8, 8, 8 };

// int n_length = nums.length;

// HashMap<Integer, Integer> array = new HashMap<>();

// for (int i = 0; i < n_length; i++) {
// // tryint to get the value of the key
// // int number = array.get(nums[i]);

// if (array.containsValue(nums[i] >= 3)) {

// System.out.println("This printing is: " + array.put(nums[i],
// array.get(nums[i]) + 1));

// } else {

// array.put(nums[i], 1);

// }
// }

// for (Integer key : array.keySet()) {
// // System.out.println(key);

// }

// System.out.println(array);

// }
// }

// class hello {

// public static void main(String[] args) {

// int[] nums = { 1, 1, 1, 2, 2, 3 };

// // 0 2

// int length = nums.length;

// int i = 2;

// for (int j = i; i < length; j++) {

// // in this case i is in the 2nd index 0 and j is in 0 index
// // if 0 = 0 not exual we will add to array if

// if (nums[j] != nums[i - 2]) {

// nums[i] = nums[j];

// }
// i++;

// }

// System.out.println(i - 1);

// }

// }

// leetcode

// public class hello {
// public static void main(String[] args) {
// int[] H = { 1, 1 };

// int ans = 0, i = 0, j = H.length - 1, res = 0;
// while (i < j) {
// if (H[i] <= H[j]) {
// // System.out.println("\n");

// // System.out.println("H[i] <= H[j]");

// // System.out.println(H[i] <= H[j]);

// res = H[i] * (j - i);

// // System.out.println(" res = H[i] * j-i ");
// // System.out.println("J is " + j);
// // System.out.println("-");
// // System.out.println("I is " + i);
// // System.out.println("\n");
// // System.out.println("H[i]: " + H[i]);
// // System.out.println((H[i]) + " * " + (j - i));

// // System.out.println(H[i] * (j - i));

// // System.out.println(" res = H[i] " + (H[i]) + " j-i " + (j - i));
// i++;

// // System.out.println("\n");
// // System.out.println("Now i is: " + i);

// // System.out.println("\n");
// // System.out.println("Ans is: " + res);
// } else {

// res = H[j] * (j - i);

// // System.out.println("\n");

// // System.out.println("Now else implementiong");

// // System.out.println(H[i] <= H[j]);

// // System.out.println(" res = H[i] * j-i ");
// // System.out.println("J is " + j);
// // System.out.println("-");
// // System.out.println("I is " + i);
// // System.out.println((H[i]) + " * " + (j - i));

// // System.out.println(H[i] * (j - i));

// // System.out.println("res = H[i] " + (H[i]) + " j-i " + (j - i));
// j--;

// // System.out.println("\n");
// // System.out.println("Now j is: " + j);

// // System.out.println("\n");
// // System.out.println("Ans is: " + res);
// }

// if (res > ans)
// ans = res;

// // System.out.println(ans = res);
// }
// // return ans;
// System.out.println("The ans is: " + ans);

// }
// }

// public class hello {
// public static void main(String[] args) {

// int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
// // length of the array
// int j = height.length - 1;
// int area = 0;
// // this idex will be used to compare the indexes along with j
// int i = 0;
// int ans = 0;

// // since we will compare thsese two indexes from both side, we have to make
// sure
// // they
// // stop in a way that they arent passing each other

// while (i < j) {

// if (height[i] <= height[j]) {

// // do the follwing formular to find the Area with most water

// // Area = Length * Distance/width
// // to find the distance we have to subtract the width/indexes

// area = height[i] * (j - i);

// i++;

// }

// else {
// area = height[i] * (j - i);

// j--;

// }

// if (area > ans)
// ans = area;

// }
// // return area;
// System.out.println(ans);

// }

// }

// leetcode

/*
 * You are given a large integer represented as an integer array digits, where
 * each digits[i] is the ith digit of the integer. The digits are ordered from
 * most significant to least significant in left-to-right order. The large
 * integer does not contain any leading 0's.
 * 
 * Increment the large integer by one and return the resulting array of digits.
 * 
 * 
 * Example 1:
 * 
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * 
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * 
 */

// public class hello {
// public static void main(String[] args) {

// // byte ak[] = { 71, 101, 101, 107, 115 };

// // String s1 = new String(ak);
// // System.out.println(s1);

// // String s2 = new String(ak, 0, 2);
// // System.out.println(s2);

// // stringbuffers

// // StringBuffer s = new StringBuffer("GeeksforGeeks");

// // System.out.println(s);

// // s.append("yup");
// // System.out.println(s);

// // // s.delete(0, 1);
// // // System.out.println(s);

// // s.insert(1, "ayo");
// // System.out.println(s);

// // s.reverse();
// // System.out.println(s);
// // s.reverse();
// // System.out.println(s);
// // s.replace(1, 4, "");
// // System.out.println(s);

// StringBuffer s = new StringBuffer("GeeksforGeeks");
// // letws check the length of it
// int length = s.length();

// System.out.println(length);

// int q = s.capacity();
// System.out.println(q);
// }

// }

//string builder, 
//the big difference between string builder and stringbuffer is that stringbuffer is secure and gd for multithread 
//and stringbuilder is faster 
// public class hello {
//     public static void main(String[] args) {

//         StringBuilder str = new StringBuilder();
//         str.append("HEY");

//         System.out.println(str);
//         System.out.println(str.toString());

//     }
// }

// lets review java a bit 
//multidimensional Array
// public class hello {
//     public static void main(String[] args) {
//         int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
//         // int x = myNumbers[1][3];

//         // System.out.println(x); // Outputs 7

//         for (int i = 0; i < myNumbers.length; ++i) {
//             for (int j = 0; j < myNumbers[i].length; ++j) {
//                 System.out.println(myNumbers[i][j]);
//             }
//         }

//     }

// }
//methods 
// public class hello {

//     public static void mymethod() {

//         System.out.println("The method is working");

//     }

//     public static void main(String[] args) {

//         mymethod();
//         mymethod();
//         mymethod();
//     }
// }

// Java Method Parameters

// public class hello {

//     public static void myMrthod(int num1, int age) {

//         int total = num1 + age;

//         System.out.println("The total num is " + total);

//     }

//     public static void main(String[] args) {

//         myMrthod(1, 19);
//         myMrthod(2, 19);
//         myMrthod(3, 19);
//     }
// }

//recursive

// public class hello {

//     public static void main(String[] args) {

//         int result = mymethod(10);

//         System.out.println(result);
//     }

//     public static int mymethod(int k) {

//         if (k > 0) {
//             return k + mymethod(k - 1);
//         } else {
//             return 0;
//         }
//     }
// }

// public class hello {

//     final int x = 5;
//     int y = 10;

//     public static void main(String[] args) {

//         // accesing the class

//         hello myobj = new hello();

//         // myobj.x = 20;

//         // lets print ot from the class
//         // we acessing from the class by using the dot
//         System.out.println(myobj.x);
//         System.out.println(myobj.y);

//     }
// }

//polymorphism

// class Animal {
//     public void mysound() {
//         System.out.println("Animal sounds like.....");
//     }
// }

// class cat extends Animal {
//     public void mysound() {
//         System.out.println("mew mew");
//     }
// }

// class cow extends Animal {
//     public void mysound() {
//         System.out.println("hughh, hughhh");
//     }
// }

// public class hello {

//     public static void main(String[] args) {
//         // lets creat an objects for the animal so we can them

//         Animal myAnumAnimal = new Animal(); /// created an objextsa for ANIMAL
//         Animal mycat = new cat();
//         Animal mycow = new cow();

//         myAnumAnimal.mysound();
//         mycat.mysound();
//         mycow.mysound();

//     }
// }

// interface

interface Animal {
    public void catSound();

    public void dogSound();
}

class cat implements Animal {

    // lets inherit and give body to catSount();
    public void catSound() {
        System.out.println(" Cat makes noice like: mewwww, mewwww, mewwww");
    }

    // lets inherit and give body to dogsound();

    public void dogSound() {
        System.out.println(" Dogas sounds like:  poww, powwww, powwww");
    }

}

public class hello {

    public static void main(String[] args) {

        cat catanddog = new cat();

        catanddog.catSound();
        catanddog.dogSound();
    }
}