package com.info.details;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.AutoWired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner)
@ContextConfiguration(classes=StudentConfig.class)
public class StudentTest{
	
	@Autowired
	private Student s1;
	
	@Test
	public void studentShouldNotBeNull(){
		assertNotNull(s1);
	}
}