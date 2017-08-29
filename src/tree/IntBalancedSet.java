package tree;

import java.util.*;

public class IntBalancedSet implements Cloneable {

	// private final int MINIMUM = 200;
	private final int MINIMUM = 10;
	private final int MAXIMUM = 2 * MINIMUM;
	int dataCount;
	int[] data;
	int childCount;
	IntBalancedSet[] subset;

	// Initialize an empty set.
	public IntBalancedSet() {
		dataCount = 0;
		childCount = 0;
		data = new int[MAXIMUM + 1];
		subset = new IntBalancedSet[MAXIMUM + 2];
	}

	// Add a new element to this set.
	public void add(int element) {
		
		

	}

	// Generate a copy of this set.
	public IntBalancedSet clone() {
		IntBalancedSet answer;
		try {
			answer = (IntBalancedSet) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(
					"This class does not implement Cloneable.");
		}

		answer.data = data.clone();
		return answer;
	}

	// Accessor method to determine whether a particular element is in this set.
	public boolean contains(int target) {
		return false;

	}

	// Remove a specified element from this set.
	/*
	 * public boolean remove(int target) { boolean answer = looseRemove(target);
	 * if ((dataCount == 0) && (childCount == 1))// Fix the root of the entire
	 * tree so that it no longer has zero elements; { dataCount =
	 * subset[0].dataCount;
	 * 
	 * 
	 * 
	 * subset = subset[0].subset; } return answer; }
	 */

	public void print(int indent)
	// Print a representation of this set's B-tree, useful during debugging.
	{

	}

	private void looseAdd(int entry) {

	}

	private void fixExcess(int i) {
	}
}
