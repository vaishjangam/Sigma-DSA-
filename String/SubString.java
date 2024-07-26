public class SubString {
    public static String subString(String str, int si, int ei){  //si->starting index, ei->ending index
        String substr = ""; //empty string initialized
        for(int i = si; i<ei; i++){
            substr+= str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str = "VaishnaviJangam";
        System.out.println(subString(str, 0, 9));
    }
}
