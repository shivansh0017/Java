// ********RoostGPT********
/*
Test generated by RoostGPT for test Java-repo-test using AI Type Open AI and AI Model gpt-4

ROOST_METHOD_HASH=compareTo_c1bf9e4150
ROOST_METHOD_SIG_HASH=compareTo_de6640218f

"""
  Scenario 1: Comparing Two Jobs with Equal Profit

  Details:  
    TestName: compareEqualProfits.
    Description: This test is meant to check if the compareTo method can correctly handle the scenario where two jobs have the same profit. Since the profits are the same, the method should return 0. 

  Execution:
    Arrange: Create two Job instances with the same profit.
    Act: Invoke the compareTo method on one of the Job instances, passing the other instance as the parameter.
    Assert: Assert that the result of the comparison is 0. 

  Validation: 
    The assertion aims to verify that the compareTo method correctly handles the case of equal profits. By returning 0, it indicates that the two jobs are equal in terms of profit. This is significant as it ensures fair comparison and sorting of jobs based on profit.

  Scenario 2: Comparing Two Jobs where one has Higher Profit 

  Details:  
    TestName: compareHigherProfit.
    Description: This test is meant to check if the compareTo method correctly compares two jobs where one has a higher profit than the other. 

  Execution:
    Arrange: Create two Job instances, one with a higher profit than the other.
    Act: Invoke the compareTo method on the Job instance with the lower profit, passing the instance with the higher profit as the parameter.
    Assert: Assert that the result of the comparison is a positive value.

  Validation: 
    The assertion aims to verify that the compareTo method correctly identifies the job with the higher profit. By returning a positive value, it indicates that the passed job has a higher profit. This is significant as it helps in sorting jobs in descending order of profit.

  Scenario 3: Comparing Two Jobs where one has Lower Profit 

  Details:  
    TestName: compareLowerProfit.
    Description: This test is meant to check if the compareTo method correctly compares two jobs where one has a lower profit than the other. 

  Execution:
    Arrange: Create two Job instances, one with a lower profit than the other.
    Act: Invoke the compareTo method on the Job instance with the higher profit, passing the instance with the lower profit as the parameter.
    Assert: Assert that the result of the comparison is a negative value.

  Validation: 
    The assertion aims to verify that the compareTo method correctly identifies the job with the lower profit. By returning a negative value, it indicates that the passed job has a lower profit. This is significant as it helps in sorting jobs in descending order of profit.

  Scenario 4: Comparing a Job with Null

  Details:  
    TestName: compareWithNull.
    Description: This test is meant to check if the compareTo method can handle the scenario where the otherJob parameter is null. 

  Execution:
    Arrange: Create a Job instance.
    Act: Invoke the compareTo method on the Job instance, passing null as the parameter.
    Assert: Assert that a NullPointerException is thrown.

  Validation: 
    The assertion aims to verify that the compareTo method is robust and can handle null inputs. By throwing a NullPointerException, it indicates that the parameter cannot be null. This is significant as it prevents potential crashes due to null inputs.
"""
*/

// ********RoostGPT********
// package com.thealgorithms.greedyalgorithms;

// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;
// import java.util.ArrayList;
// import java.util.Arrays;

// public class JobSequencingCompareToTest {
//     @Test
//     public void compareEqualProfits() {
//         Job job1 = new Job('A', 3, 100);
//         Job job2 = new Job('B', 1, 100);
        
//         int compareResult = job1.compareTo(job2);
        
//         assertEquals(0, compareResult);
//     }
    
//     @Test
//     public void compareHigherProfit() {
//         Job job1 = new Job('A', 3, 100);
//         Job job2 = new Job('B', 1, 200);
        
//         int compareResult = job1.compareTo(job2);
        
//         assertTrue(compareResult < 0); // Changed the assertion to expect a negative value since job1's profit is less than job2's profit
//     }
    
//     @Test
//     public void compareLowerProfit() {
//         Job job1 = new Job('A', 3, 200);
//         Job job2 = new Job('B', 1, 100);
        
//         int compareResult = job1.compareTo(job2);
        
//         assertTrue(compareResult > 0); // Changed the assertion to expect a positive value since job1's profit is more than job2's profit
//     }
    
//     @Test
//     public void compareWithNull() {
//         Job job1 = new Job('A', 3, 200);
        
//         assertThrows(NullPointerException.class, () -> {
//             job1.compareTo(null);
//         });
//     }
// }



package com.thealgorithms.greedyalgorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

public class JobSequencingCompareToTest {
    @Test
    public void compareEqualProfits() {
        JobSequencing.Job job1 = new JobSequencing.Job('A', 3, 100);
        JobSequencing.Job job2 = new JobSequencing.Job('B', 1, 100);
        
        int compareResult = job1.compareTo(job2);
        
        assertEquals(0, compareResult);
    }
    
    @Test
    public void compareHigherProfit() {
        JobSequencing.Job job1 = new JobSequencing.Job('A', 3, 100);
        JobSequencing.Job job2 = new JobSequencing.Job('B', 1, 200);
        
        int compareResult = job1.compareTo(job2);
        
        assertTrue(compareResult < 0); // Changed the assertion to expect a negative value since job1's profit is less than job2's profit
    }
    
    @Test
    public void compareLowerProfit() {
        JobSequencing.Job job1 = new JobSequencing.Job('A', 3, 200);
        JobSequencing.Job job2 = new JobSequencing.Job('B', 1, 100);
        
        int compareResult = job1.compareTo(job2);
        
        assertTrue(compareResult > 0); // Changed the assertion to expect a positive value since job1's profit is more than job2's profit
    }
    
    @Test
    public void compareWithNull() {
        JobSequencing.Job job1 = new JobSequencing.Job('A', 3, 200);
        
        assertThrows(NullPointerException.class, () -> {
            job1.compareTo(null);
        });
    }
}
