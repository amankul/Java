package algorithmic;


import java.util.*;

public class ArrayPermutations {

  private Set<List<Integer>> permList = new LinkedHashSet<>();

  public static void main(String[] args) {
    ArrayPermutations ap = new ArrayPermutations();
    Integer[] nums = { 1, 2, 3 };
    ap.permute(nums);
    System.out.println(ap.permList);
  }

  public void permute(Integer[] nums) {
    permutation(0, nums.length - 1, nums);
  }

  public void permutation(int start, int end, Integer[] nums) {
    if (start == end) {
      permList.add(new ArrayList<Integer>(Arrays.asList(nums)));
    }
    for (int i = start; i <= end; i++) {
      nums = (swap(nums, start, i));
      permutation(start + 1, end, nums);
      nums = (swap(nums, start, i));
    }
  }

  private Integer[] swap(Integer[] arr, int a, int b) {

    Integer temp = arr[b];
    arr[b] = arr[a];
    arr[a] = temp;
    return arr;

  }
}