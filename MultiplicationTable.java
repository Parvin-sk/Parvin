

import java.io.*;
import java.util.*;
import java.lang.*;
public class MultiplicationTable
{
    public static void main(String[] args) {

        int num=8;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}