public class _4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i1 = 0, i2 = 0, max = nums1.length + nums2.length;
        int[] nums = new int[max];
        
        for (int i = 0; i<max; i++) {
            if (i1 == nums1.length) {
                nums = appendArray(nums, nums2, i, i2);
                break;
            }
            if (i2 == nums2.length) {
                nums = appendArray(nums, nums1, i, i1);
                break;
            }
            if (nums1[i1] < nums2[i2]) {
                nums[i] = nums1[i1];
                ++i1;
            } else {
                nums[i] = nums2[i2];
                ++i2;
            }
        }  
        
        if (nums.length % 2 == 0) {
            return ((double) nums[(nums.length/2)-1] + nums[(nums.length/2)])/2;
        } else {
            return nums[nums.length/2];
        }
    }
    
    private int[] appendArray(int[] arr1, int[] arr2, int i1, int i2) {
        for (int i = 0; i<arr2.length-i2; i++) {
            arr1[i+i1] = arr2[i+i2];
        }
        return arr1;
    }
}
