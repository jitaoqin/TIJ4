//: net/mindview/util/Sets.java
package net.mindview.util;

import java.util.*;

public class Sets {
	//在前三个方法中，都将第一个参数Set复制了一份，将Set中的所有引用都存入一个新的HashSet对象，因此并未直接修改参数中的Set，返回值是一个全新的对象。
	
	public static <T> Set<T> union(Set<T> a, Set<T> b) {
		Set<T> result = new HashSet<T>(a);
		result.addAll(b);
		return result;
	}

	public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
		Set<T> result = new HashSet<T>(a);
		result.retainAll(b);
		return result;
	}

	// Subtract subset from superset:
	public static <T> Set<T> difference(Set<T> superset, Set<T> subset) {
		Set<T> result = new HashSet<T>(superset);
		result.removeAll(subset);
		return result;
	}

	// Reflexive--everything not in the intersection:
	public static <T> Set<T> complement(Set<T> a, Set<T> b) {
		return difference(union(a, b), intersection(a, b));
	}
} /// :~
