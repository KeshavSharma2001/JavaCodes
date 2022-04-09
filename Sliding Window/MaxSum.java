// https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1

static int maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        int i = 0, j = 0, sum = 0;
        int mx = Integer.MIN_VALUE;
        
    // till j reaches end of array
        while(j < N) {
            sum = sum + Arr.get(j);
            if((j-i+1) < K){  //window size (j-i+1) is less than the size of window given
                j++; //move j ahead(which makes window grow...increase window size)
            }
            else if((j-i+1) == K) { //if window is equal to size given i.e. K
                mx = Math.max(mx, sum); //max of current sum or the previous window sum
                sum = sum - Arr.get(i); //now window will move ahead so subtract element
                i++;
                j++;
            }
        }
        return mx;
    }
