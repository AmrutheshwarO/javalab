public class Prog6_Exe {
    public static void main(String[] args) {
        String str = "Hello world";
        String str2 = "my house, my car, my degree, my job, my money, my spouse, my children, my family, my death, my funeral";
        //a. Extract substring
        System.out.println(Prog6_Strings.extract(str,4    ,6));
        //b. Count occurrence of a word
        System.out.println(Prog6_Strings.countAWord(str2,"my"));
        //c. Replace a string with other
        str2 = str2.replace("my", "our");  //String type is immutable, hence store back value in other object
        System.out.println(str2);
        //d. rearrange a string in alphabetical order
        System.out.println(Prog6_Strings.reArrange("OOPSwithJava"));
        // e. compare strings ignoring case
        String str3 = "hello";
        String str4 = "HeLLo";
        System.out.println(str3.equalsIgnoreCase(str4));
        //f. concatenate 2 strings (instead of +)
        System.out.println(str.concat(str3));
    }
}

