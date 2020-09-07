package xin.jiuzhiqian.study.design.polymorphism;

import java.util.Iterator;

/**
 * @author : feng
 */
public class Array implements Iterator<String> {
    private String[] data;

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String next() {
        return null;
    }
}