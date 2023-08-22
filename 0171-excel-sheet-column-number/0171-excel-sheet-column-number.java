class Solution {
    public int titleToNumber(String columnTitle) {
        int counter=-1, res=0;
    for(int i=columnTitle.length()-1; i>=0; i--){
        counter++;
        res+= (columnTitle.charAt(i)-'A'+1)*Math.pow(26,counter);
    }    
    return res;
    }
}