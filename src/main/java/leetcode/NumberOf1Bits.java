package leetcode;
//https://leetcode.com/explore/challenge/card/february-leetcoding-challenge-2021/584/week-1-february-1st-february-7th/3625/
//Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
//
//Note:
//Note that in some languages such as Java, there is no unsigned integer type.
// In this case, the input will be given as a signed integer type.
// It should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
//In Java, the compiler represents the signed integers using 2's complement notation.
// Therefore, in Example 3 above, the input represents the signed integer. -3.
//Follow up: If this function is called many times, how would you optimize it?
//
//Example 1:
//
//Input: n = 00000000000000000000000000001011
//Output: 3
//Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
public class NumberOf1Bits {
    public static void main(String[] args) {
        int output = hammingWeight2(00000000000000000000000000001011);
        System.out.println(output);
    }

    // you need to treat n as an unsigned value
    public static int hammingWeight1(int n) {
        return Integer.bitCount(n);
    }

    public static int hammingWeight2(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n = n >>> 1;
        }
        return count;
    }
}