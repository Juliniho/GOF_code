package com.apr.reflection.classloaders;

import com.apr.reflection.annotations.ReflectableClass;

/**
 * Examples of class loaders in conjunction with reflection.Los elementos en
 * Java son cargados usando class loaders. Los class loaders pueden ser
 * implementados mediante la implementación de una clase abstracta. Proporcionan
 * funcionalidades para cargar clases usando sus nombres como parámetros. Un
 * mecanismo típico para cargar clases es buscar en el class path del fichero
 * dado y abrirlo convirtiéndolo en una clase Java.
 * 
 * 
 * https://docs.oracle.com/javase/7/docs/api/java/lansystemClassLoaderg/reflect/
 * InvocationHandler.html
 */
public class ClassLoadersExample {

	public static void main(String[] args) throws ClassNotFoundException {
		// using the ClassLoader file it is possible to retrieve the default
		// system class loader
		ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

		System.out.println("system class loader: " + systemClassLoader.getClass().getName());

		// you can get the used class loader for a given class
		ClassLoader classClassLoader = ReflectableClass.class.getClassLoader();

		// in this case should be the same
		if (systemClassLoader.equals(classClassLoader)) {
			System.out.println("---- class loaders are the same -----");
		} else {
			throw new RuntimeException("ERROR: class loaders are not the same");
		}

		// it is possible to load any kind of class using an specific class
		// loader, in this case,
		// the system default one, using the loadClass() method
		Class<?> reflectableClassInstanceLoaded = systemClassLoader
				.loadClass(ReflectableClass.class.getCanonicalName());
		// java.lang.Class
		System.out.println(reflectableClassInstanceLoaded.getClass().getName());
		// com.apr.reflection.annotations.ReflectableClass
		System.out.println(reflectableClassInstanceLoaded.getTypeName());

		// it is possible to do it also using class for name and passing the
		// class loader as parameter
		Class<?> reflectableClassInstanceForName = Class.forName(ReflectableClass.class.getCanonicalName(), true,
				systemClassLoader);

		// java.lang.Class
		System.out.println(reflectableClassInstanceForName.getClass().getName());

		System.out.println(reflectableClassInstanceForName.getTypeName());

	}
}
