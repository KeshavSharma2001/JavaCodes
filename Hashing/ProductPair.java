boolean isProduct(int[] arr, int n, long x) {
        // code here
        HashSet<Long> ans = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            if(arr[i] == 0)
            {
                if(x == 0)
                    return true;
                else
                    continue;
            }
            if(x%arr[i] == 0){
                if(!ans.contains(x/arr[i])){
                ans.add((long)arr[i]);
                }
            else
                return true;
            }
        }
        
        return false;
    }
