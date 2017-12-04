package com.my.java8;

/**
 * @auther cuimiao
 * @date 2017/12/4/004  21:20
 * @deprecated 查看本地处理器以及java内存demo.
 */
public class ProcessorsNumDemo {
    public static void main(String[] args) {
        System.out.println("您的处理器数量：" + Runtime.getRuntime().availableProcessors() + " 个");
        System.out.println("Java虚拟机中的可用内存量 :" + Runtime.getRuntime().freeMemory()/1024/1024 + " M");
        System.out.println("Java虚拟机中的当前可用的总内存量 :" + Runtime.getRuntime().totalMemory()/1024/1024 + " M");
        System.out.println("Java虚拟机中的可能使用的最大使用内存量 :" + Runtime.getRuntime().maxMemory()/1024/1024 + " M");
    }
}
