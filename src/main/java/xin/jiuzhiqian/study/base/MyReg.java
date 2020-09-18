package xin.jiuzhiqian.study.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : feng
 */
public class MyReg {
    public static void main(String[] args) {
        String regex = "cat[0-9]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("hello cat1 cat2");
        while (matcher.find()) {
            System.out.println(matcher.find());
            System.out.println(matcher.start());
            System.out.println(matcher.end());
        }

        /*String content = "Hello world zhouzhidao";
        String pattern = "^He[a-z]*";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println(isMatch);*/
    }
}