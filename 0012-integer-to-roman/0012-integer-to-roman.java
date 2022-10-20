class Solution {
    public String intToRoman(int num) {
        String res = "";
        int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] rom_val = {"M", "CM" ,"D" ,"CD" ,"C" ,"XC" ,"L" ,"XL" ,"X" ,"IX" ,"V","IV" ,"I"};
        for(int i=0;i<val.length && num >0; i++){
            while(num >= val[i]){
                res += rom_val[i];
                num-=val[i];
            }
        }
        return res;
    }
}