/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.mycompany.mytestng.Grade;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author aperk
 */
public class GradeTest {
    
    Grade grade;
    
    
    public GradeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    
       grade = new Grade(60,80, 90);
    }
    
    
    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testMath(){
        assertEquals(grade.getMath(), 60);
        
    }
    
    @Test
    public void testEnglish(){
        assertEquals(grade.getEng(), 90);
    }
    
    @Test
    
    public void testTotal(){
        assertEquals(grade.getTotal(), 230);
    }
      @Test
    
    public void testGrade(){
        assertEquals(grade.getGrade(), "Pass");
}
    
    
    
    
}