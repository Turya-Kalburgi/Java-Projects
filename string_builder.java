import java.util.*;
public class string_builder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
            //026
        } //abcdefghijklmnopqrstuvwxyz
        System.out.println(sb);
    }
    
    
}
