public class BuilderString {
        public static void main(String args[]){
            StringBuilder sb = new StringBuilder(""); //initializing with empty string
            for(char ch = 'a'; ch<='z'; ch++){
                sb.append(ch);
            }
           // System.out.println(sb.length()); //o/p :26
           System.out.println(sb);
        }   
}
