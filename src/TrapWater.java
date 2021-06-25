class TrapWater {
    public int trap(int[] height) {

        int ans = 0;
        //find each height, how much the water it ll hold
        for (int i=0; i< height.length; i ++) {
            int left_max = 0, right_max =0;
            int j = i;
            //for each height, find leftmax 0 -index
            while (j>=0) {
                left_max = Math.max(height[j], left_max);
                j--;
            }

            //foreach height, find rightmax index -> length

            int k = i;
            while (k<height.length) {
                right_max = Math.max(height[k], right_max);
                k++;
            }
            ans += Math.min(left_max, right_max) - height[i];
        }

        System.out.println(ans);
        return ans;

    }
}