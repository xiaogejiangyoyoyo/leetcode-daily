class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> ret=new ArrayList<>();
        int[] lastIndexes=new int[26];
        for(int i=0;i<S.length();i++)
            lastIndexes[S.charAt(i)-'a']=i;
        int startIndex=0;
        while(startIndex<S.length()){
            int endIndex=startIndex;
            for(int i=startIndex;i<S.length()&&i<=endIndex;i++){
                int lastIndex=lastIndexes[S.charAt(i)-'a'];
                if(lastIndex==i)
                    continue;
                if(lastIndex>endIndex)
                    endIndex=lastIndex;
            }
            ret.add(endIndex-startIndex+1);
            startIndex=endIndex+1;
        }
        return ret;
    }
}