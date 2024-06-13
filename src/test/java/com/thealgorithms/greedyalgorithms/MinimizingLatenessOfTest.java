// ********RoostGPT********
/*
Test generated by RoostGPT for test Java-repo-Azure-test using AI Type Azure Open AI and AI Model roostgpt-4-32k

ROOST_METHOD_HASH=of_eb8138c6bc
ROOST_METHOD_SIG_HASH=of_7a04d5363c

""" 
Scenario 1: Test to check a valid job creation with correct parameters

Details:  
  TestName: testValidJobCreation.
  Description: This test case validates the correct creation of Job objects when valid jobName, processingTime, and deadline values are provided. It checks if the method is correctly managing the instantiation with correct properties. 
Execution:
  Arrange: Initialize the jobName as "Job1", processingTime as 5 and deadline as 10.
  Act: Invoke Job.of("Job1",5,10).
  Assert: Use the respective getters to verify if the instantiated Job object has the correct jobName, processingTime and deadline.
Validation: 
  The test aims to verify correct instantiation of a job object by checking if expected and actual properties of the job coincide. Successful validation shows that the method can successfully instantiate the job object with correct properties. 

Scenario 2: Test to confirm IllegalArgumentException for deadline less than processingTime 

Details:  
  TestName: testDeadlineLessThanProcessingTime.
  Description: This test case checks whether the method throws IllegalArgumentException when input deadline is less than processingTime. 
Execution:
  Arrange: Initialize the jobName as "Job1", processingTime as 10 and deadline as 5.
  Act: Invoke Job.of("Job1",10,5).
  Assert: Expect the assertion to throw IllegalArgumentException.
Validation: 
  This test case validates that the method appropriately throws an exception for a deadline less than processingTime, which is expected as job cannot finish before its processingTime.

Scenario 3: Test to check IllegalArgumentException with null jobName 

Details:  
  TestName: testNullJobName.
  Description: This test case is intended to check if the method throws IllegalArgumentException when passed a null jobName.
Execution:
  Arrange: Initialize the jobName as null, processingTime as 5, and deadline as 10.
  Act: Invoke Job.of(null,5,10).
  Assert: Expect the assertion to throw IllegalArgumentException.
Validation: 
  The test validates if the method correctly rejects null jobName values by throwing an exception. Demonstrates the method's robustness and its adherence to input requirements.

Scenario 4: Test to verify the same instance for similar input parameters 

Details:  
  TestName: testSameInstanceCreation.
  Description: This test case checks whether the method returns the same Job instance for similar parameters, confirming the implementation of the Singleton design pattern(if Singleton design pattern is used in Job implementation).
Execution:
  Arrange: Initialize jobName as "Job1", processingTime as 5, and deadline as 10.
  Act: Invoke Job.of("Job1",5,10) twice.
  Assert: Check if the two Job objects created are the same using the assertSame() method.
Validation: 
  The test confirms the singleton design pattern of the Job class. Successful validation indicates that for similar input parameters, the method correctly reuses the existing Job instance. 

Note: For scenario 2, 3 and 4 to be valid, the implementation of the Job class must include necessary checks or Singleton implementation. Scenarios are solely based on the provided method and its parameters. 
"""
*/

// ********RoostGPT********
package com.thealgorithms.greedyalgorithms;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class MinimizingLatenessOfTest {
    @Test
    public void testValidJobCreation() {
        String jobName = "Job1";
        int processingTime = 5;
        int deadline = 10;
        
        MinimizingLateness.Job job = MinimizingLateness.Job.of(jobName, processingTime, deadline);
        
        assertEquals(jobName, job.jobName);
        assertEquals(processingTime, job.processingTime);
        assertEquals(deadline, job.deadline);
    }
    @Test
    public void testDeadlineLessThanProcessingTime() {
        String jobName = "Job1";
        int processingTime = 10;
        int deadline = 5;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MinimizingLateness.Job job = MinimizingLateness.Job.of(jobName, processingTime, deadline);
        });
        
        // TODO: Add your assertion message below
        String expectedMessage = "The deadline of the job cannot be less than its processing time";
        String actualMessage = exception.getMessage();
        
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void testNullJobName() {
        String jobName = null;
        int processingTime = 5;
        int deadline = 10;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MinimizingLateness.Job job = MinimizingLateness.Job.of(jobName, processingTime, deadline);
        });
        // TODO: Add your assertion message below
        String expectedMessage = "Job name cannot be null";
        String actualMessage = exception.getMessage();
        
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void testSameInstanceCreation() {
        String jobName = "Job1";
        int processingTime = 5;
        int deadline = 10;
        MinimizingLateness.Job job1 = MinimizingLateness.Job.of(jobName, processingTime, deadline);
        MinimizingLateness.Job job2 = MinimizingLateness.Job.of(jobName, processingTime, deadline);
        assertSame(job1, job2);
    }
}
