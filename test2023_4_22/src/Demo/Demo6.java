package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-22 20:23
 **/
//有效的括号
public class Demo6 {
    public boolean isValid(String s) {
        //contains() 方法用于判断字符串中是否包含指定的字符或字符串。
        //replace() 方法通过用 newChar 字符替换字符串中出现的所有 searchChar 字符，并返回替换后的新字符串。
        /*
        public String replace(CharSequence target, CharSequence replacement) {
                return Pattern.compile(target.toString(), Pattern.LITERAL).matcher(
                this).replaceAll(Matcher.quoteReplacement(replacement.toString()));
        }
         */
        while(s.contains("()") || s.contains("{}") || s.contains("[]")){
            s = s.replace("()","").replace("[]","").replace("{}","");
        }
        return s.equals("");
    }
}
