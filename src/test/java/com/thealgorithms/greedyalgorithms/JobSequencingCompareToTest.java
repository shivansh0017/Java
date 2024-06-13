// ********RoostGPT********
/*
Test generated by RoostGPT for test Java-repo-Claude-test using AI Type Claude AI and AI Model claude-3-opus-20240229

ROOST_METHOD_HASH=compareTo_c1bf9e4150
ROOST_METHOD_SIG_HASH=compareTo_de6640218f

Here are some JUnit test scenarios for the provided compareTo method:

Scenario 1: Comparing jobs with different profits

Details:
  TestName: compareJobsWithDifferentProfits()
  Description: This test verifies that the compareTo method correctly orders jobs based on their profit values in descending order.
Execution:
  Arrange:
    - Create two Job objects, job1 and job2, with different profit values.
    - Set job1's profit to 100 and job2's profit to 200.
  Act:
    - Invoke the compareTo method on job1, passing job2 as the argument.
  Assert:
    - Assert that the result of compareTo is positive, indicating that job2 should come before job1 in the ordering.
Validation:
  The assertion verifies that the compareTo method correctly compares the profit values of two jobs and returns a positive value when the compared job (job2) has a higher profit than the current job (job1). This test ensures that jobs are ordered in descending order based on their profit values, which is important for scenarios where jobs need to be prioritized based on profitability.

Scenario 2: Comparing jobs with equal profits

Details:
  TestName: compareJobsWithEqualProfits()
  Description: This test checks that the compareTo method correctly handles the case when two jobs have equal profit values.
Execution:
  Arrange:
    - Create two Job objects, job1 and job2, with the same profit value.
    - Set both job1's and job2's profit to 150.
  Act:
    - Invoke the compareTo method on job1, passing job2 as the argument.
  Assert:
    - Assert that the result of compareTo is zero, indicating that job1 and job2 are considered equal in terms of profit.
Validation:
  The assertion verifies that the compareTo method correctly handles the case when two jobs have equal profit values and returns zero. This test ensures that the compareTo method follows the contract of the Comparable interface, where a return value of zero signifies equality. It is important to handle this case correctly to maintain consistency in job ordering when multiple jobs have the same profitability.

Scenario 3: Comparing a job with itself

Details:
  TestName: compareJobWithItself()
  Description: This test verifies that the compareTo method correctly handles the case when a job is compared with itself.
Execution:
  Arrange:
    - Create a single Job object, job1.
    - Set job1's profit to any value.
  Act:
    - Invoke the compareTo method on job1, passing job1 itself as the argument.
  Assert:
    - Assert that the result of compareTo is zero, indicating that a job is considered equal to itself.
Validation:
  The assertion verifies that the compareTo method correctly handles the case when a job is compared with itself and returns zero. This test ensures that the compareTo method satisfies the reflexive property of equality, where an object is always equal to itself. Handling this case correctly is important for maintaining the consistency and reliability of job comparisons.

Scenario 4: Comparing jobs with negative profits

Details:
  TestName: compareJobsWithNegativeProfits()
  Description: This test checks that the compareTo method correctly orders jobs when one or both jobs have negative profit values.
Execution:
  Arrange:
    - Create two Job objects, job1 and job2, with negative profit values.
    - Set job1's profit to -50 and job2's profit to -100.
  Act:
    - Invoke the compareTo method on job1, passing job2 as the argument.
  Assert:
    - Assert that the result of compareTo is negative, indicating that job1 should come after job2 in the ordering.
Validation:
  The assertion verifies that the compareTo method correctly compares jobs with negative profit values and returns a negative value when the current job (job1) has a higher profit than the compared job (job2). This test ensures that the compareTo method handles negative values correctly and maintains the descending order of jobs based on their profitability, even when profits are negative.

These test scenarios cover different cases, including comparing jobs with different profits, equal profits, comparing a job with itself, and handling negative profit values. They ensure that the compareTo method behaves correctly in various situations and maintains the expected ordering of jobs based on their profitability.
*/

// ********RoostGPT********
package com.thealgorithms.greedyalgorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

class JobSequencingCompareToTest {
    @Test
    void compareJobsWithDifferentProfits() {
        JobSequencing.Job job1 = new JobSequencing.Job('A', 1, 100);
        JobSequencing.Job job2 = new JobSequencing.Job('B', 2, 200);
        int result = job1.compareTo(job2);
        assertTrue(result > 0, "Job with higher profit should come after job with lower profit");
    }

    @Test
    void compareJobsWithEqualProfits() {
      JobSequencing.Job job1 = new JobSequencing.Job('A', 1, 150);
      JobSequencing.Job job2 = new JobSequencing.Job('B', 2, 150);
        int result = job1.compareTo(job2);
        assertEquals(0, result, "Jobs with equal profit should be considered equal");
    }

    @Test
    void compareJobWithItself() {
      JobSequencing.Job job1 = new JobSequencing.Job('A', 1, 100);
        int result = job1.compareTo(job1);
        assertEquals(0, result, "Comparing a job with itself should return zero");
    }

    @Test
    void compareJobsWithNegativeProfits() {
        JobSequencing.Job job1 = new JobSequencing.Job('A', 1, -50);
        JobSequencing.Job job2 = new JobSequencing.Job('B', 2, -100);
        int result = job1.compareTo(job2);
        assertTrue(result < 0, "Job with higher negative profit should come before job with lower negative profit");
    }

    @Test
    void compareJobsWithZeroProfit() {
      JobSequencing.Job job1 = new JobSequencing.Job('A', 1, 0);
        JobSequencing.Job job2 = new JobSequencing.Job('B', 2, 100);
        int result = job1.compareTo(job2);
        assertTrue(result > 0, "Job with zero profit should come after job with positive profit");
    }

    @Test
    void compareJobsWithLargeProfit() {
        JobSequencing.Job job1 = new JobSequencing.Job('A', 1, Integer.MAX_VALUE);
        JobSequencing.Job job2 = new JobSequencing.Job('B', 2, Integer.MAX_VALUE - 1);
        int result = job1.compareTo(job2);
        assertTrue(result < 0, "Job with larger profit should come after job with smaller profit");
    }
}
