package com.github.ashikuzzaman.javaapichecks.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 * To compiple: javac -d . ListPerformanceTestSimple.java
 * To run: java com.github.ashikuzzaman.javaapichecks.collections.ListPerformanceTestSimple
 *
 * @author ashik
 */
public class ListPerformanceTestSimple {

	private int LOOP_COUNT = 5000;
	private List<String> firstList;
	private List<String> secondList;

	public ListPerformanceTestSimple() {
		firstList = new ArrayList<String>();
		secondList = new ArrayList<String>();
		for(int i = 0; i < LOOP_COUNT; i++) {
			if(i % 3 != 0) {
				firstList.add("ashik - " + i);
			}
			if(i % 9 != 0) {
				secondList.add("ashik - " + i);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("\nListPerformanceTest starts.....\n");
		ListPerformanceTestSimple perf = new ListPerformanceTestSimple();
		List<String> intersection = new ArrayList<String>();
		List<String> union = new ArrayList<String>();

		Date d1 = new Date(System.currentTimeMillis());
		System.out.println("d1 = " + d1);
		for(String value : perf.firstList) {
			System.out.println("value for firstList = " + value);
		}
		Date d2 = new Date(System.currentTimeMillis());
		System.out.println("d2 = " + d2);
		for(String value : perf.secondList) {
			System.out.println("value for secondList = " + value);
		}
		Date d3 = new Date(System.currentTimeMillis());
		System.out.println("d3 = " + d3);

		System.out.println("perf.firstList.size() = " + perf.firstList.size() + " and perf.secondList.size() = " + perf.secondList.size());

		if(perf.firstList.size() >= perf.secondList.size()) {
			intersection.addAll(perf.firstList);
			intersection.retainAll(perf.secondList);
		} else {
			intersection.addAll(perf.secondList);
			intersection.retainAll(perf.firstList);
		}
		System.out.println("intersection.size() = " + intersection.size());

		if(perf.firstList.size() >= perf.secondList.size()) {
			union.addAll(perf.firstList);
			union.removeAll(perf.secondList);
			union.addAll(perf.secondList);
		} else {
			union.addAll(perf.secondList);
			union.removeAll(perf.firstList);
			union.addAll(perf.firstList);
		}
		System.out.println("union.size() = " + union.size());

		System.out.println("\nListPerformanceTest ends.....\n");
	}

}

