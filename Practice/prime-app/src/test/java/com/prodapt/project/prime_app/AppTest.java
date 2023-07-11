package com.prodapt.project.prime_app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
     public void MovieTheatre2()
    {
      int result = MovieTheatre.getNumberOfLower(77);
      assertEquals(18,result);
    }
    
}
