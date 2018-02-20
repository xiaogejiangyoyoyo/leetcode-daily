class Solution {
    private List<String> ret;
    public List<String> restoreIpAddresses(String s) {
        ret=new ArrayList<>();
        doRestore(0,"",s);
        return ret;
    }
    
    private void doRestore(int k,String path,String s){
        if(k==4||s.length()==0){
            if(k==4&&s.length()==0)
                ret.add(path);
            return;
        }
        for(int i=0;i<s.length()&&i<=2;i++){
            if(i!=0&&s.charAt(0)=='0')
                break;
            String part=s.substring(0,i+1);
            if(Integer.valueOf(part)<=255)
                doRestore(k+1,path.length()!=0?path+"."+part:part,s.substring(i+1));
        }
    }
}