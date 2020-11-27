import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ContainString {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        HashMap<String,Integer> t1 = new HashMap<String,Integer>();
        HashMap<String,Integer> t2 = new HashMap<String,Integer>();
        Integer occ = null;
        for(int i = 0 ; i <s1.length() ; i++) {
        	
        	if(t1.containsKey(s1.substring(i, i+1))) {
        		t1.put(s1.substring(i, i+1),occ+1);
        	}else {
        		t1.put(s1.substring(i, i+1),1);
        		occ=1;
        	}	
        }
        for(int i = 0 ; i <s2.length() ; i++) {
        	if(t2.containsKey(s2.substring(i, i+1))) {
        		t2.put(s2.substring(i, i+1),occ+1);
        	}else {
        		t2.put(s2.substring(i, i+1),1);
        		occ=1;
        	}	
        }
        boolean result=false;
        for(String s: t2.keySet()) {
        	if(t1.containsKey(s)) {
        		result=true;
        	}
        }
        
        return result==true?"YES":"NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

            String result = twoStrings("hello", "hi");
            System.out.println("YES - "+result);
            
            String result1 = twoStrings("hello", "ab");
            System.out.println("NO - "+result1);

    }
}
