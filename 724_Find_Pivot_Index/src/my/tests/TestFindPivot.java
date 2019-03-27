package my.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import my.code.FindPivotIndex;
import my.code.FindPivotIndex2;

class TestFindPivot {

	@Test
	void testPivot1() {
		assertEquals(FindPivotIndex.solution(new int[] {1, 7, 3, 6, 5, 6}), 3); 
		assertEquals(FindPivotIndex.solution(new int[] {1,2,3}), -1);
	}
	
	@Test
	void testPivot2() {
		assertEquals(FindPivotIndex2.solution(new int[] {1, 7, 3, 6, 5, 6}), 3); 
		assertEquals(FindPivotIndex2.solution(new int[] {1,2,3}), -1);
	}
}
