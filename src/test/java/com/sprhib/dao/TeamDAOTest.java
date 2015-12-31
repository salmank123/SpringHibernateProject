/*package com.sprhib.dao;

import static org.junit.Assert.fail;

import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.sprhib.init.Initializer;
import com.sprhib.model.Team;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Initializer.class)
@TransactionConfiguration(defaultRollback = true)
@Transactional
public class TeamDAOTest {

	@Autowired
	private TeamDAOImpl teamDaoImpl;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		
		
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddTeam() {
		Team team =new Team();
		team.setName("raj");
		team.setRating(123);
		teamDaoImpl.addTeam(team);
		System.out.println("TestTeamAdd End");
		
	}

	@Test
	public void testUpdateTeam() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTeam() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteTeam() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTeams() {
		fail("Not yet implemented");
	}

}
*/