package LeetCode;
public class String_to_Integer_atoi_08 {
	public int myAtoi(String str) {
		//符号？字母？越界？
		        if (str == null || str.length() == 0) return 0;
		        str = str.trim();
		        if (str.length() == 0) return 0;
		        //正负号
		        char firstChar = str.charAt(0);
		        int sign = 1;
		        int start = 0;
		        long res = 0;
		        if (firstChar == '+'){
		            sign = 1;
		            start ++;
		        }else if (firstChar == '-'){
		            sign = -1;
		            start++;
		        }
		        for (int i = start; i < str.length(); i++){
		            if (!Character.isDigit(str.charAt(i))){
		                return (int)res*sign;
		            }
		            res = res*10 + str.charAt(i) - '0'; //ASCII码
		            // System.out.println((int)str.charAt(i));
		            if(sign == 1 && res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
		            if(sign == -1 && res > Integer.MAX_VALUE) return Integer.MIN_VALUE;
		            
		        }
		        return (int) res*sign;
		    }
}
