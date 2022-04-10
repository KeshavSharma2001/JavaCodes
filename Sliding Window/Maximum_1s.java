// https://practice.geeksforgeeks.org/problems/maximize-number-of-1s0905/1

int findZeroes(int arr[], int n, int m) {
        /* we wrote code by thinking that there is zero and it would be flipped
            not by actually flipping it*/
            
        int i=0, j=0, zeros=0, mx=0;
        while(j<n){
            if(arr[j] == 0)  //if current element is zero
                zeros++;
            if(zeros <= m){  //check for zeros...so that we can maintain m zeros for a window
                mx = Math.max(mx, j-i+1);
                j++;
            }
            else if(zeros > m){ //if zeros are more than m..we control number of zeros
                while(zeros > m){
                    if(arr[i] == 0) //if we had a zero at start of window..remove that
                        zeros--;
                    i++; //move window ahead
                }
                j++; //move window
            }
        }
        return mx;
    }
