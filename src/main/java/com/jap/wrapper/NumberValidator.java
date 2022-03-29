package com.jap.wrapper;

public class NumberValidator {

    //validation rules to be written
    public int validateNumber(String input) {
        if(input.length()==0) return -1;
        Double d=Double.parseDouble(input);
        if (input.length()==10){
            int num = 0;
            for(int i=0; i<input.length(); i++) num += Integer.parseInt(String.valueOf(input.charAt(i)))*(10-i);
            if(num%11==0) return 1;
        }
      return 0;
    }
}
