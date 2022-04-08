// https://practice.geeksforgeeks.org/problems/max-distance-between-same-elements/1/

class Solution
{
    int maxDistance(int arr[], int n)
    {
	// Your code here 
	    HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
	    int mx = 0;
	    for(int i = 0; i < n; i++){
	        if(!h.containsKey(arr[i])){
	            h.put(arr[i], i);
	        }
	        else {
	            mx = Math.max(mx, i - h.get(arr[i]));
	        }
	    }
	    
	    return mx;
    }
}
