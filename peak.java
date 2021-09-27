import java.util.Scanner;

public class peak {
    public static int main(String args[]){
        Scanner sc = new Scanner(System.in);
        int []nums = sc.next();
        System.out.println("/nEnter a number "+nums);
        int left = 0;
        int right = nums.length-1;

        while(left<right){
            int mid = left + (right-left)/2;
            if(nums[mid]<nums[mid+1]){

                left = mid + 1;

            }else{
                right = mid;
            }

        }
return left;
    }
}
