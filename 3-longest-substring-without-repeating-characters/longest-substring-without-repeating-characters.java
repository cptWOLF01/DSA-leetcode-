class Solution {

    public int lengthOfLongestSubstring(String s) {

        if(s.isEmpty()){
            return 0;
        }
        int k=0;
        int highestCount=1;

        for(int i=0; i<s.length();i++){
            int count =1;

            for(int j=i-1;j>=k;j--){


                if(s.charAt(i)==s.charAt(j)){
                    k=j+1;
                    break;
                }

                else{
                    count = count+1;
                }

            }

            if(count>highestCount){
                highestCount = count;
            }
        }
        return highestCount;
    }
}