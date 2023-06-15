public static int findMajorityElement(int[] nums) {
    int count = 0;
    Integer candidate = null;
    for (int num : nums) {
        if (count == 0) {
            candidate = num;
        }
        count += num == candidate ? 1 : -1;
    }
    return count(candidate, nums) > nums.length / 2 ? candidate : -1;
}

private static int count(int num, int[] nums) {
    int count = 0;
    for (int n : nums) {
        if (n == num) {
            count++;
        }
    }
    return count;
}
