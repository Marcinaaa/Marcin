package com.it.academy;

public class SecondSmallest {
    public static void main(String[] args)
    {
        int[] array = {4,2,11,5,1};
        int najmniejsza=Integer.MAX_VALUE;
        int prawieNajmniejsza=Integer.MAX_VALUE;
        for (int i=1; i<array.length; i++)
        {
            if(array[i]<najmniejsza){
                najmniejsza=array[i];
            }
            if(array[i]<prawieNajmniejsza){
                najmniejsza=prawieNajmniejsza;
                prawieNajmniejsza=array[i];
            }
        }
        System.out.println(prawieNajmniejsza);
    }
}
