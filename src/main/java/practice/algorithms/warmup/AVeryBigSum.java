package practice.algorithms.warmup;

import java.util.stream.LongStream;

public class AVeryBigSum {

  public static void main(String[] args) {
    long[] intArray = new long[]{1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
    long sum = aVeryBigSum(intArray);
    System.out.println(sum);
  }

  private static long aVeryBigSum(long[] ar) {
    return LongStream.of(ar).sum();
  }
}
