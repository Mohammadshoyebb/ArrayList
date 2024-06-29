import java.util.ArrayList;
 public class ContainerWithMaximumWater{

    public static void main(String[] args) {
        ArrayList<Integer> lst =  new ArrayList<>();
        lst.add(1);
        lst.add(8);
        lst.add(6);
        lst.add(2);
        lst.add(5);
        lst.add(4);
        lst.add(8);
        lst.add(3);
        lst.add(7);
        int n = mostWater(lst); 
        System.out.println(n);
    }
    public static int mostWater(new ArrayList<Integer>()){
        ArrayList<Integer> lst = new ArrayList<>();
        int max = -1;
        int currMax = -1;
        int left = 0;
        int right = lst.size()-1;

        while(left<right){
            currMax = (Math.min(lst.get(left),lst.get(right))) * (right-left);

            if(left<right){
                left++;
            }else{
                right--;
            }
            max = Math.max(max,currMax);
        }
        return max;
    }  
 }