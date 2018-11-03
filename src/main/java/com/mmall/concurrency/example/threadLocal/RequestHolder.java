package com.mmall.concurrency.example.threadLocal;

/**
 * 这个类用于存储我们希望绑定到线程上的信息，这里是ThreadLocal对象
 * 存储的long值，实际使用过程中，要存储已经登录的用户对象
 */
public class RequestHolder {

    private final static ThreadLocal<Long> requestHolder = new ThreadLocal<>();

    public static void add(Long id) {
        requestHolder.set(id);
    }

    public static Long getId() {
        return requestHolder.get();
    }

    public static void remove() {
        requestHolder.remove();
    }
}
