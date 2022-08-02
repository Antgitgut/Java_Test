public class arrays {
    public static void main(String[] args) {
        int num[];
        num = new int[4];

        int[] nums = new int[]{1, 2, 3, 4, 5}; //Quantity of array elements by adding
        int[] nums2 = {1, 3, 4, 5};
        int[] nums3 = new int[4]; //Array has 4 elements
        int[] nums4 = new int[]{0, 1, 2, 3, 4, 5};
        int[][] nums5 = new int[][]{{0, 1, 2}, {3, 4, 5}}; // Multidimensional array
        int[][] nums6 = new int[2][3]; //For output of 2 arrays
        nums3[0] = 1;
        nums3[1] = 2;
        nums3[2] = 3;
        nums3[3] = 4;

        for (int i = 0; i < nums4.length; i++) { // nums4 index loop
            System.out.println(nums4[i]);
        }


        for (int i = 0; i < nums5.length; i++) { // Multiloop. 1) For string; 2) For columns of 1) + format
            for (int j = 0; j <= nums5.length; j++) {
                System.out.printf("%d ", nums5[i][j]);
            }
            System.out.println();
        }


        System.out.println(nums[nums.length - 1]);
        System.out.println(nums3[2]);
        System.out.println(nums4[2]);
    }
}
