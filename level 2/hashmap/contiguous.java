import java.util.*;

public class contiguous {

	public static int solution(int[] arr) {
		int ans = 0;
		for(int j=0;j<arr.length;j++){
			HashSet<Integer>set=new HashSet<>();
			int max = arr[j];
			int min = arr[j];
			set.add(arr[j]);
			for(int i=j+1;i<arr.length;i++){
				set.add(arr[i]);
				if(arr[i]>max) max = arr[i];
				if (arr[i]<min) min = arr[i];

				if(set.size()==i-j+1){
					if(max-min==i-j){
						if(i-j+1>ans) ans = i-j+1;
					}
				}
				else break;
			}
		}

		return ans;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(solution(arr));
		scn.close();
	}

}
