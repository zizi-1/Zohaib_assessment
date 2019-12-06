package com.bae.assessment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Direction {
	
	

	
	
	// randomise user starting pos, where pos != to poi
	private static double[][] userPos = {{0,1}};

	//private static double closestPOS = Math.hypot(y, x);
	static double[][] poi = { { 1, 3 }, { 1, 5 }, { 3, 2 }, { 5, 5 } };
	private static int closestPOI;

	public static void north() {
		// calculate nearest poi via hypot

		System.out.println(Arrays.toString(poi[closestPOI]));

	}

	public static void south() {

	}

	public static void east() {

	}

	public static void west() {

	}


	}


