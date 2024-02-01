import java.util.*;
public class stairs
{
	void stair(int ind,ArrayList <Integer> list, int arr[]){

		if (ind == arr.length) {
            System.out.println(list.toString());
            return;
        }
        list.add(arr[ind]);
        stair(ind + 1,list,arr);
        list.remove(list.size() - 1);
        stair(ind + 1, list,arr);
    }

	public static void main(String args[]){
		// Scanner ay = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int arr[]={3,1,2};
		int n=3;
		stairs st = new stairs();
		st.stair(0,list,arr);
		
		

	}
}
		
