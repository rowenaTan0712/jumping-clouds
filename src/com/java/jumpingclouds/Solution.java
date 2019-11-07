package com.java.jumpingclouds;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int count = 0;
        int next = 0;
        int past = 0;
        for(int x=1; x < c.length; x++) { 
        	next=x+1;
        	boolean res = false;
        	if(c[x] == 0 && c[past] != 0) {
        		count++;
        	}else if(next < c.length) {
    			if(c[x] == 0 &&
    					c[next] == 0) {
    				count++;
    				res = true;
    			}else if(c[x] == 0) {
    				count++;
    			}
    		}else if(c[x]==0){
    			count++;
    		}
    		past = x;
    		
    		if(res == true) {
    			x = next;
    			past = x;
    		}
	   	}
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);
        
        System.out.println("result : " + result);

       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

       // bufferedWriter.close();

        scanner.close();
    }
}
