package de.neuefische;

public class Quersumme {
    public static int calculateQuersumme(int num){
        int result =0, digit=countDigits(num), factor=1, k=0;
        while (k<digit){
            for (int i=0; i<digit-k;i++){
                factor=factor*10;
            }
            result=result+(num%factor)/(factor/10);
            //result=...(num%10000)/1000+(num%1000)/100 +(num%100)/10 +(num%10)/1;
            k++;
            factor=1;
        }
        return result;
    }

    public static int countDigits(int num){
        int digit =0;
        if (num==0){
            return 1;
        }
        while (num!=0){
            num=num/10;
            digit++;
        }
        return digit;
    }


}
