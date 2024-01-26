package InteviewQuestions;

public class TrappingRainwater {

    public static int trappingRainWater(int[] height) {
        int n = height.length;
//        left Max
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
//        right Max
        int rightMax[] = new int[n];
        leftMax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

//        loop
        int waterTrapped = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            waterTrapped += waterLevel - height[i];
        }

        return waterTrapped;

    }

    public static int trap(int height[]) {
        int n = height.length;

//        left max
        int[] leftMax = new int[n];
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

//        right max
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }


//        loop
        int waterTrapped = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            waterTrapped += waterLevel - height[i];
        }

        return waterTrapped;

    }


    public static void main(String[] args) {
        int water[] = {4, 2, 0, 3, 2, 5};
        int water2[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappingRainWater(water));
//        System.out.println(trappingRainWater(water2));

    }


}
