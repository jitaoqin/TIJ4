//: net/mindview/util/CollectionData.java
// A Collection filled with data using a generator object.
package net.mindview.util;

import java.util.*;

public class CollectionData<T> extends ArrayList<T> {
	/**
	 * 适配器设计模式，将Generator适配到CollectionData
	 */
	private static final long serialVersionUID = -3054669664301200786L;

	public CollectionData(Generator<T> gen, int quantity) {
		for (int i = 0; i < quantity; i++)
			add(gen.next());
	}

	// A generic convenience method:
	public static <T> CollectionData<T> list(Generator<T> gen, int quantity) {
		return new CollectionData<T>(gen, quantity);
	}
} /// :~
