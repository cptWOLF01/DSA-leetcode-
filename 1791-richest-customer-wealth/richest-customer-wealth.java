class Solution {
    public int maximumWealth(int[][] accounts) {
     
        int max=0;
       
        for(int i=0; i < accounts.length; i++){
             int cost=0;
            for(int j=0 ; j < accounts[i].length; j++){
                cost = cost + accounts[i][j];
            }
            if (cost > max ) {
                max = cost;
            }
        }

    return max;   
    }
}