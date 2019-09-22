package com.itheima;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * @author LiTianLong
 * @Date 2019/7/11
 */
public class Demo01 {
    public static void main(String[] args) {
        Object obj = new Object();
        SoftReference<Object> sf = new SoftReference<Object>(obj);
        obj = null;
//有时候会返回null
        sf.get();;

}
}
