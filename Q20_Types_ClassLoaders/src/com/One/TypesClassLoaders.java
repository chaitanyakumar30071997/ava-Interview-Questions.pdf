package com.One;

public class TypesClassLoaders {
    public static void main(String[] args) {
        // Get the ClassLoader of this class
        ClassLoader classLoader = ClassLoaderExample.class.getClassLoader();
        System.out.println("Application ClassLoader: " + classLoader);

        // Get the parent of Application ClassLoader (Extension ClassLoader)
        System.out.println("Extension ClassLoader: " + classLoader.getParent());

        // Get the parent of Extension ClassLoader (Bootstrap ClassLoader)
        System.out.println("Bootstrap ClassLoader: " + classLoader.getParent().getParent()); // Returns null
    }

}
