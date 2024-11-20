package easy;

public class ArithGeo {

    public static String checkGeoAndArith(int[] nums) {
        boolean isArithmetic = true;
        
        int constant = nums[1] - nums[0];

        for(int i  = 1; i < nums.length - 1; i++){
            if(nums[i+1] - nums[i] != constant)
                isArithmetic = false;
                break;
        }

        if(isArithmetic) return "Arithmetic";

        if(nums[0] != 0 ){
            double ratio = (double) nums[1] / nums[0];
            boolean isGeometric = true;
            for(int i  = 1; i < nums.length - 1; i++){
                if((double) nums[i+1] / nums[i] != ratio)
                    isGeometric = false;
                    break;
            }
            if(isGeometric) return "Geometric";
        }
        

        return "-1";
    }

    public static void main(String[] args) {
        System.out.println(checkGeoAndArith(new int[] { 2, 4, 6, 8 }));
        System.out.println(checkGeoAndArith(new int[] { 2, 6, 18, 54 }));
        System.out.println(checkGeoAndArith(new int[] { -3, -4, -5, -6, -7 }));
    }
}
