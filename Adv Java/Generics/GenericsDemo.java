package com.generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *1. Type can not extends more than one class
 *
 *2.Type should extends implents then after extends interfaces
 *
 *3.Can extends many intefaces
 *
 *4. Type camn not be a primitive or arrays
 *
 * <T extends List> -> Type is extends List and subtype only
 * 
 * <T extends List & Serializable> -> Type is extends List and also implements
 * serizable will accept only
 *
 *
 */
public class GenericsDemo<T extends List & Serializable> {

	public static void main(String[] args) {
		// GenericsDemo<List<Integer>> generic = new GenericsDemo<List<Integer>>();
		// GenericsDemo<Collection> genericColl=new GenericsDemo<>();
		GenericsDemo<ArrayList<Integer>> genericArray = new GenericsDemo<>();

	}
}