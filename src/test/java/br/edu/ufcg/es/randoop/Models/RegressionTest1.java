package br.edu.ufcg.es.randoop.Models;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getName();
    int i7 = user5.getTimesRated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    java.lang.String str8 = user5.getPassword();
    user5.setId((java.lang.Long)100L);
    user5.setTimesRated(100);
    user5.setFairPlayRating((float)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setFinished(false);
    java.util.ArrayList<java.lang.Long> arraylist_long17 = game5.getGuestsRequests();
    game5.setFinished(false);
    long long20 = game5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 0L);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long26 = user25.getGamesRequested();
    int i27 = user25.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user25.getFavoriteUsers();
    user5.setGames(arraylist_long28);
    user5.setAbilityRating((float)10L);
    user5.setEmail("hi!");
    java.lang.String str34 = user5.getEmail();
    float f35 = user5.getAbilityRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f35 == 10.0f);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setDescription("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    user0.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }

    br.edu.ufcg.es.model.Game game0 = new br.edu.ufcg.es.model.Game();
    long long1 = game0.getIdOwner();
    java.lang.String str2 = game0.getDate();
    java.lang.String str3 = game0.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    boolean b14 = game5.isFinished();
    br.edu.ufcg.es.model.User user15 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long16 = user15.getFavoriteUsers();
    br.edu.ufcg.es.model.Game game17 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long18 = game17.getGuests();
    br.edu.ufcg.es.model.User user24 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game30 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array34 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long35 = new java.util.ArrayList<java.lang.Long>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long35, long_array34);
    game30.setGuestRequests(arraylist_long35);
    user24.setGames(arraylist_long35);
    java.util.ArrayList<java.lang.Long> arraylist_long39 = user24.getMyGames();
    game17.setGuestRequests(arraylist_long39);
    user15.setGames(arraylist_long39);
    game5.setGuestRequests(arraylist_long39);
    game5.setId((long)(byte)0);
    game5.setLocal("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long39);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    user0.setEmail("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long3 = user0.getGames();
    user0.setFairPlayRating((float)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    boolean b14 = game5.isFinished();
    game5.setId((long)(byte)0);
    java.util.ArrayList<java.lang.Long> arraylist_long17 = game5.getGuestsRequests();
    java.util.ArrayList<java.lang.Long> arraylist_long18 = game5.getGuests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long18);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long long2 = user0.getId();
    br.edu.ufcg.es.model.User user3 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long4 = user3.getFavoriteUsers();
    br.edu.ufcg.es.model.User user10 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long11 = user10.getGamesRequested();
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    user10.setInvitesReceived(arraylist_long17);
    user10.setAddress("");
    br.edu.ufcg.es.model.User user27 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user27.getGamesRequested();
    user10.setGames(arraylist_long28);
    user3.setGamesRequested(arraylist_long28);
    user0.setGames(arraylist_long28);
    java.util.ArrayList<java.lang.Long> arraylist_long32 = user0.getInvitesReceived();
    user0.setName("hi!");
    br.edu.ufcg.es.model.User user40 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array42 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long43 = new java.util.ArrayList<java.lang.Long>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long43, long_array42);
    user40.setGamesRequested(arraylist_long43);
    user0.setInvitesReceived(arraylist_long43);
    java.lang.String str47 = user0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str47);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    java.lang.String str14 = game5.getDate();
    game5.setDate("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long17 = game5.getGuestsRequests();
    game5.setDate("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long17);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setDate("");
    game5.setIdOwner(0L);
    java.util.ArrayList<java.lang.Long> arraylist_long12 = game5.getGuestsRequests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long12);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user6 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game12 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    game12.setGuestRequests(arraylist_long17);
    user6.setGames(arraylist_long17);
    user0.setMyGames(arraylist_long17);
    user0.setPhone("");
    java.lang.String str24 = user0.getPassword();
    br.edu.ufcg.es.model.User user30 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long31 = user30.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long32 = user30.getInvitesReceived();
    java.util.ArrayList<java.lang.Long> arraylist_long33 = user30.getGamesRequested();
    user0.setMyGames(arraylist_long33);
    float f35 = user0.getFairPlayRating();
    java.lang.String str36 = user0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f35 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long long2 = user0.getId();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = user0.getGames();
    user0.setTimesRated((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long26 = user25.getGamesRequested();
    int i27 = user25.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user25.getFavoriteUsers();
    user5.setGames(arraylist_long28);
    user5.setId((java.lang.Long)52L);
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    boolean b14 = game5.isFinished();
    game5.setSport("");
    java.lang.String str17 = game5.getDate();
    java.lang.String str18 = game5.getDescription();
    java.lang.String str19 = game5.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setFinished(true);
    java.lang.String str17 = game5.getLocal();
    java.lang.String str18 = game5.getLocal();
    br.edu.ufcg.es.model.User user24 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long25 = user24.getGamesRequested();
    java.lang.Long[] long_array30 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long31 = new java.util.ArrayList<java.lang.Long>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long31, long_array30);
    user24.setInvitesReceived(arraylist_long31);
    java.lang.String str34 = user24.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long35 = user24.getFavoriteUsers();
    br.edu.ufcg.es.model.User user36 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long37 = user36.getFavoriteUsers();
    java.lang.Long[] long_array40 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long41 = new java.util.ArrayList<java.lang.Long>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long41, long_array40);
    user36.setFavoriteUsers(arraylist_long41);
    user24.setInvitesReceived(arraylist_long41);
    br.edu.ufcg.es.model.User user50 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long51 = user50.getGamesRequested();
    int i52 = user50.getTimesRated();
    int i53 = user50.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long54 = user50.getMyGames();
    user24.setInvitesReceived(arraylist_long54);
    game5.setGuestRequests(arraylist_long54);
    game5.setName("");
    long long59 = game5.getIdOwner();
    java.util.ArrayList<java.lang.Long> arraylist_long60 = game5.getGuestsRequests();
    java.lang.String str61 = game5.getSport();
    game5.setDescription("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long59 == 52L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + ""+ "'", str61.equals(""));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    br.edu.ufcg.es.model.User user7 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user7.getGamesRequested();
    java.lang.Long[] long_array13 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long14 = new java.util.ArrayList<java.lang.Long>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long14, long_array13);
    user7.setInvitesReceived(arraylist_long14);
    user7.setAddress("");
    br.edu.ufcg.es.model.User user24 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long25 = user24.getGamesRequested();
    user7.setGames(arraylist_long25);
    user0.setGamesRequested(arraylist_long25);
    br.edu.ufcg.es.model.User user33 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game39 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array43 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long44 = new java.util.ArrayList<java.lang.Long>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long44, long_array43);
    game39.setGuestRequests(arraylist_long44);
    user33.setGames(arraylist_long44);
    br.edu.ufcg.es.model.User user53 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long54 = user53.getGamesRequested();
    int i55 = user53.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long56 = user53.getFavoriteUsers();
    user33.setGames(arraylist_long56);
    user0.setGames(arraylist_long56);
    java.lang.Long long59 = user0.getId();
    java.lang.String str60 = user0.getEmail();
    java.lang.String str61 = user0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str61);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    boolean b14 = game5.isFinished();
    br.edu.ufcg.es.model.User user15 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long16 = user15.getFavoriteUsers();
    br.edu.ufcg.es.model.Game game17 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long18 = game17.getGuests();
    br.edu.ufcg.es.model.User user24 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game30 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array34 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long35 = new java.util.ArrayList<java.lang.Long>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long35, long_array34);
    game30.setGuestRequests(arraylist_long35);
    user24.setGames(arraylist_long35);
    java.util.ArrayList<java.lang.Long> arraylist_long39 = user24.getMyGames();
    game17.setGuestRequests(arraylist_long39);
    user15.setGames(arraylist_long39);
    game5.setGuestRequests(arraylist_long39);
    java.lang.String str43 = game5.getLocal();
    java.lang.String str44 = game5.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + ""+ "'", str43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!"+ "'", str44.equals("hi!"));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setLocal("hi!");
    game5.setIdOwner(100L);
    boolean b11 = game5.isFinished();
    boolean b12 = game5.isFinished();
    game5.setName("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long15 = game5.getGuestsRequests();
    game5.setIdOwner(10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long15);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    int i11 = user5.getTimesRated();
    java.lang.String str12 = user5.getPhone();
    java.util.ArrayList<java.lang.Long> arraylist_long13 = user5.getMyGames();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long13);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long26 = user25.getGamesRequested();
    int i27 = user25.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user25.getFavoriteUsers();
    user5.setGames(arraylist_long28);
    java.lang.String str30 = user5.getName();
    user5.setPassword("");
    user5.setId((java.lang.Long)(-1L));
    java.lang.String str35 = user5.getAddress();
    br.edu.ufcg.es.model.User user41 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long42 = user41.getGamesRequested();
    java.lang.String str43 = user41.getEmail();
    int i44 = user41.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long45 = user41.getGames();
    br.edu.ufcg.es.model.Game game46 = new br.edu.ufcg.es.model.Game();
    game46.setId((long)' ');
    br.edu.ufcg.es.model.User user54 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game60 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array64 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long65 = new java.util.ArrayList<java.lang.Long>();
    boolean b66 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long65, long_array64);
    game60.setGuestRequests(arraylist_long65);
    user54.setGames(arraylist_long65);
    br.edu.ufcg.es.model.User user74 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long75 = user74.getGamesRequested();
    int i76 = user74.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long77 = user74.getFavoriteUsers();
    user54.setGames(arraylist_long77);
    java.lang.String str79 = user54.getName();
    br.edu.ufcg.es.model.User user85 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long86 = user85.getGamesRequested();
    int i87 = user85.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long88 = user85.getGamesRequested();
    user54.setMyGames(arraylist_long88);
    game46.setGuestRequests(arraylist_long88);
    user41.setInvitesReceived(arraylist_long88);
    user5.setGamesRequested(arraylist_long88);
    user5.setAddress("hi!");
    user5.setId((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + ""+ "'", str43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + ""+ "'", str79.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long88);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((-1L));
    java.lang.String str15 = game5.getDescription();
    java.util.ArrayList<java.lang.Long> arraylist_long16 = game5.getGuestsRequests();
    game5.setDescription("hi!");
    game5.setName("");
    java.lang.String str21 = game5.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    user0.setId((java.lang.Long)100L);
    user0.setFairPlayRating((float)100);
    java.lang.String str5 = user0.getAddress();
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user0.getFavoriteUsers();
    java.lang.Long long7 = user0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L+ "'", long7.equals(100L));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    java.lang.String str13 = game5.getDate();
    game5.setIdOwner(0L);
    game5.setId((long)(byte)100);
    java.util.ArrayList<java.lang.Long> arraylist_long18 = game5.getGuestsRequests();
    game5.setId(35L);
    java.util.ArrayList<java.lang.Long> arraylist_long21 = game5.getGuestsRequests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long21);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setFinished(true);
    java.lang.String str17 = game5.getLocal();
    java.util.ArrayList<java.lang.Long> arraylist_long18 = game5.getGuests();
    boolean b19 = game5.isFinished();
    game5.setSport("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setGamesRequested(arraylist_long5);
    java.lang.Long long8 = user0.getId();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user0.getFavoriteUsers();
    java.lang.String str10 = user0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setLocal("hi!");
    game5.setIdOwner(100L);
    boolean b11 = game5.isFinished();
    boolean b12 = game5.isFinished();
    java.lang.String str13 = game5.getName();
    game5.setIdOwner((long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }

    br.edu.ufcg.es.model.Game game0 = new br.edu.ufcg.es.model.Game();
    long long1 = game0.getIdOwner();
    java.lang.String str2 = game0.getDate();
    boolean b3 = game0.isFinished();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long26 = user25.getGamesRequested();
    int i27 = user25.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user25.getFavoriteUsers();
    user5.setGames(arraylist_long28);
    user5.setAbilityRating((float)10L);
    java.util.ArrayList<java.lang.Long> arraylist_long32 = user5.getMyGames();
    br.edu.ufcg.es.model.User user33 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long34 = user33.getInvitesReceived();
    java.lang.Long[] long_array37 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long38 = new java.util.ArrayList<java.lang.Long>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long38, long_array37);
    user33.setGamesRequested(arraylist_long38);
    br.edu.ufcg.es.model.User user46 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "hi!", "");
    java.lang.Long long47 = user46.getId();
    user46.setAddress("");
    java.util.ArrayList<java.lang.Long> arraylist_long50 = user46.getFavoriteUsers();
    user33.setMyGames(arraylist_long50);
    br.edu.ufcg.es.model.User user57 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long58 = user57.getGamesRequested();
    int i59 = user57.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long60 = user57.getFavoriteUsers();
    java.lang.String str61 = user57.getAddress();
    java.util.ArrayList<java.lang.Long> arraylist_long62 = user57.getMyGames();
    user33.setGamesRequested(arraylist_long62);
    user5.setGamesRequested(arraylist_long62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!"+ "'", str61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long62);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "", "", "hi!", "hi!");
    long long6 = game5.getIdOwner();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    java.util.ArrayList<java.lang.Long> arraylist_long20 = user5.getMyGames();
    java.util.ArrayList<java.lang.Long> arraylist_long21 = user5.getMyGames();
    user5.setId((java.lang.Long)35L);
    br.edu.ufcg.es.model.User user24 = new br.edu.ufcg.es.model.User();
    user24.setId((java.lang.Long)100L);
    user24.setFairPlayRating((float)100);
    br.edu.ufcg.es.model.Game game34 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array38 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long39 = new java.util.ArrayList<java.lang.Long>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long39, long_array38);
    game34.setGuestRequests(arraylist_long39);
    java.lang.String str42 = game34.getDate();
    java.util.ArrayList<java.lang.Long> arraylist_long43 = game34.getGuestsRequests();
    user24.setFavoriteUsers(arraylist_long43);
    user5.setGames(arraylist_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!"+ "'", str42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long43);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.lang.String str2 = user0.getPhone();
    float f3 = user0.getFairPlayRating();
    float f4 = user0.getFairPlayRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setFavoriteUsers(arraylist_long5);
    br.edu.ufcg.es.model.User user8 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user8.getFavoriteUsers();
    java.lang.Long[] long_array12 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long13 = new java.util.ArrayList<java.lang.Long>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long13, long_array12);
    user8.setFavoriteUsers(arraylist_long13);
    user0.setFavoriteUsers(arraylist_long13);
    java.util.ArrayList<java.lang.Long> arraylist_long17 = user0.getInvitesReceived();
    user0.setFairPlayRating((float)'#');
    int i20 = user0.getTimesRated();
    int i21 = user0.getTimesRated();
    user0.computeRating((float)(byte)-1, (float)100);
    java.util.ArrayList<java.lang.Long> arraylist_long25 = user0.getFavoriteUsers();
    user0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long25);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long long2 = user0.getId();
    br.edu.ufcg.es.model.User user3 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long4 = user3.getFavoriteUsers();
    br.edu.ufcg.es.model.User user10 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long11 = user10.getGamesRequested();
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    user10.setInvitesReceived(arraylist_long17);
    user10.setAddress("");
    br.edu.ufcg.es.model.User user27 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user27.getGamesRequested();
    user10.setGames(arraylist_long28);
    user3.setGamesRequested(arraylist_long28);
    user0.setGames(arraylist_long28);
    java.util.ArrayList<java.lang.Long> arraylist_long32 = user0.getFavoriteUsers();
    user0.setAddress("");
    java.lang.Long long35 = user0.getId();
    user0.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long35);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "", "", "hi!");
    user5.setTimesRated(100);
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getMyGames();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user5.getFavoriteUsers();
    float f10 = user5.getAbilityRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f10 == 0.0f);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long26 = user25.getGamesRequested();
    int i27 = user25.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user25.getFavoriteUsers();
    user5.setGames(arraylist_long28);
    java.lang.String str30 = user5.getName();
    user5.setPassword("");
    user5.setTimesRated((int)(byte)100);
    br.edu.ufcg.es.model.User user35 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long36 = user35.getFavoriteUsers();
    java.lang.Long[] long_array39 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long40 = new java.util.ArrayList<java.lang.Long>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long40, long_array39);
    user35.setFavoriteUsers(arraylist_long40);
    br.edu.ufcg.es.model.User user43 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long44 = user43.getFavoriteUsers();
    java.lang.Long[] long_array47 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long48 = new java.util.ArrayList<java.lang.Long>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long48, long_array47);
    user43.setFavoriteUsers(arraylist_long48);
    user35.setFavoriteUsers(arraylist_long48);
    java.util.ArrayList<java.lang.Long> arraylist_long52 = user35.getInvitesReceived();
    user35.setFairPlayRating((float)'#');
    int i55 = user35.getTimesRated();
    int i56 = user35.getTimesRated();
    user35.computeRating((float)(byte)-1, (float)100);
    java.util.ArrayList<java.lang.Long> arraylist_long60 = user35.getFavoriteUsers();
    user5.setGamesRequested(arraylist_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long60);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    user5.setAddress("");
    float f17 = user5.getAbilityRating();
    user5.setPassword("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long20 = user5.getInvitesReceived();
    java.lang.String str21 = user5.getEmail();
    user5.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f17 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user6 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game12 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    game12.setGuestRequests(arraylist_long17);
    user6.setGames(arraylist_long17);
    user0.setMyGames(arraylist_long17);
    user0.setPhone("");
    br.edu.ufcg.es.model.User user29 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game35 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array39 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long40 = new java.util.ArrayList<java.lang.Long>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long40, long_array39);
    game35.setGuestRequests(arraylist_long40);
    user29.setGames(arraylist_long40);
    br.edu.ufcg.es.model.User user49 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long50 = user49.getGamesRequested();
    int i51 = user49.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long52 = user49.getFavoriteUsers();
    user29.setGames(arraylist_long52);
    user0.setMyGames(arraylist_long52);
    br.edu.ufcg.es.model.User user60 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long61 = user60.getGamesRequested();
    java.lang.Long[] long_array66 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long67 = new java.util.ArrayList<java.lang.Long>();
    boolean b68 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long67, long_array66);
    user60.setInvitesReceived(arraylist_long67);
    java.lang.String str70 = user60.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long71 = user60.getFavoriteUsers();
    user0.setGamesRequested(arraylist_long71);
    java.util.ArrayList<java.lang.Long> arraylist_long73 = user0.getInvitesReceived();
    float f74 = user0.getAbilityRating();
    java.util.ArrayList<java.lang.Long> arraylist_long75 = user0.getGamesRequested();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + ""+ "'", str70.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f74 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long75);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    user5.setAddress("");
    br.edu.ufcg.es.model.User user22 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long23 = user22.getGamesRequested();
    user5.setGames(arraylist_long23);
    br.edu.ufcg.es.model.User user30 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long31 = user30.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long32 = user30.getInvitesReceived();
    user5.setGamesRequested(arraylist_long32);
    java.lang.String str34 = user5.getEmail();
    float f35 = user5.getAbilityRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f35 == 0.0f);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    boolean b14 = game5.isFinished();
    game5.setId((long)(byte)0);
    java.util.ArrayList<java.lang.Long> arraylist_long17 = game5.getGuestsRequests();
    game5.setSport("");
    java.lang.String str20 = game5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getFavoriteUsers();
    br.edu.ufcg.es.model.User user14 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    user14.setGamesRequested(arraylist_long17);
    user5.setGames(arraylist_long17);
    float f21 = user5.getFairPlayRating();
    java.util.ArrayList<java.lang.Long> arraylist_long22 = user5.getGames();
    br.edu.ufcg.es.model.Game game23 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long24 = game23.getGuests();
    br.edu.ufcg.es.model.User user30 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game36 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array40 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long41 = new java.util.ArrayList<java.lang.Long>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long41, long_array40);
    game36.setGuestRequests(arraylist_long41);
    user30.setGames(arraylist_long41);
    java.util.ArrayList<java.lang.Long> arraylist_long45 = user30.getMyGames();
    game23.setGuestRequests(arraylist_long45);
    user5.setInvitesReceived(arraylist_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f21 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long45);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "", "", "hi!");
    java.lang.String str6 = user5.getPhone();
    int i7 = user5.getTimesRated();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setLocal("hi!");
    game5.setIdOwner(100L);
    boolean b11 = game5.isFinished();
    long long12 = game5.getIdOwner();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 100L);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    br.edu.ufcg.es.model.Game game18 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array22 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long23 = new java.util.ArrayList<java.lang.Long>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long23, long_array22);
    game18.setGuestRequests(arraylist_long23);
    java.lang.String str26 = game18.getDate();
    java.util.ArrayList<java.lang.Long> arraylist_long27 = game18.getGuestsRequests();
    game5.setGuestRequests(arraylist_long27);
    game5.setIdOwner((long)(short)100);
    game5.setDescription("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long27);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setDate("");
    game5.setIdOwner(0L);
    java.lang.String str12 = game5.getName();
    br.edu.ufcg.es.model.Game game18 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array22 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long23 = new java.util.ArrayList<java.lang.Long>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long23, long_array22);
    game18.setGuestRequests(arraylist_long23);
    boolean b26 = game18.isFinished();
    game18.setId((long)'#');
    br.edu.ufcg.es.model.User user34 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long35 = user34.getGamesRequested();
    java.lang.Long[] long_array40 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long41 = new java.util.ArrayList<java.lang.Long>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long41, long_array40);
    user34.setInvitesReceived(arraylist_long41);
    game18.setGuestRequests(arraylist_long41);
    game5.setGuests(arraylist_long41);
    java.lang.String str46 = game5.getLocal();
    game5.setLocal("hi!");
    game5.setId((long)10);
    java.lang.String str51 = game5.getDescription();
    java.lang.String str52 = game5.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + ""+ "'", str46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!"+ "'", str51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + ""+ "'", str52.equals(""));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    java.lang.String str15 = user5.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long16 = user5.getFavoriteUsers();
    int i17 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long18 = user5.getMyGames();
    br.edu.ufcg.es.model.User user19 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long20 = user19.getInvitesReceived();
    java.lang.Long long21 = user19.getId();
    br.edu.ufcg.es.model.User user22 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long23 = user22.getFavoriteUsers();
    br.edu.ufcg.es.model.User user29 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long30 = user29.getGamesRequested();
    java.lang.Long[] long_array35 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long36 = new java.util.ArrayList<java.lang.Long>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long36, long_array35);
    user29.setInvitesReceived(arraylist_long36);
    user29.setAddress("");
    br.edu.ufcg.es.model.User user46 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long47 = user46.getGamesRequested();
    user29.setGames(arraylist_long47);
    user22.setGamesRequested(arraylist_long47);
    user19.setGames(arraylist_long47);
    java.util.ArrayList<java.lang.Long> arraylist_long51 = user19.getInvitesReceived();
    user19.setName("hi!");
    br.edu.ufcg.es.model.User user59 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array61 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long62 = new java.util.ArrayList<java.lang.Long>();
    boolean b63 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long62, long_array61);
    user59.setGamesRequested(arraylist_long62);
    user19.setInvitesReceived(arraylist_long62);
    br.edu.ufcg.es.model.Game game71 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long72 = game71.getId();
    game71.setSport("hi!");
    game71.setName("");
    br.edu.ufcg.es.model.User user82 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long83 = user82.getGamesRequested();
    user82.setEmail("");
    java.util.ArrayList<java.lang.Long> arraylist_long86 = user82.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long87 = user82.getMyGames();
    game71.setGuestRequests(arraylist_long87);
    user19.setMyGames(arraylist_long87);
    user5.setGamesRequested(arraylist_long87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long72 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long87);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    int i11 = user5.getTimesRated();
    user5.computeRating((float)'4', (float)1);
    br.edu.ufcg.es.model.User user20 = new br.edu.ufcg.es.model.User("", "", "hi!", "hi!", "hi!");
    br.edu.ufcg.es.model.User user26 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game32 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array36 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long37 = new java.util.ArrayList<java.lang.Long>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long37, long_array36);
    game32.setGuestRequests(arraylist_long37);
    user26.setGames(arraylist_long37);
    br.edu.ufcg.es.model.User user46 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long47 = user46.getGamesRequested();
    int i48 = user46.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long49 = user46.getFavoriteUsers();
    user26.setGames(arraylist_long49);
    java.lang.String str51 = user26.getName();
    user26.setAbilityRating((float)0L);
    user26.setEmail("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long56 = user26.getFavoriteUsers();
    user20.setInvitesReceived(arraylist_long56);
    user5.setInvitesReceived(arraylist_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + ""+ "'", str51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long56);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    game5.setId((long)'#');
    java.util.ArrayList<java.lang.Long> arraylist_long16 = game5.getGuests();
    java.util.ArrayList<java.lang.Long> arraylist_long17 = game5.getGuests();
    java.lang.String str18 = game5.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user6 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game12 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    game12.setGuestRequests(arraylist_long17);
    user6.setGames(arraylist_long17);
    user0.setMyGames(arraylist_long17);
    user0.setPhone("");
    user0.setAbilityRating((float)(byte)1);
    user0.setPassword("");
    user0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    java.lang.String str13 = game5.getDescription();
    java.lang.String str14 = game5.getDescription();
    game5.setLocal("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    java.lang.String str14 = game5.getDate();
    game5.setDate("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long17 = game5.getGuestsRequests();
    java.util.ArrayList<java.lang.Long> arraylist_long18 = game5.getGuests();
    long long19 = game5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 0L);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getFavoriteUsers();
    br.edu.ufcg.es.model.User user14 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    user14.setGamesRequested(arraylist_long17);
    user5.setGames(arraylist_long17);
    user5.setPhone("hi!");
    user5.setName("");
    java.util.ArrayList<java.lang.Long> arraylist_long25 = user5.getInvitesReceived();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long25);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    br.edu.ufcg.es.model.Game game2 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = game2.getGuests();
    br.edu.ufcg.es.model.User user9 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game15 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array19 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long20 = new java.util.ArrayList<java.lang.Long>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long20, long_array19);
    game15.setGuestRequests(arraylist_long20);
    user9.setGames(arraylist_long20);
    java.util.ArrayList<java.lang.Long> arraylist_long24 = user9.getMyGames();
    game2.setGuestRequests(arraylist_long24);
    user0.setGames(arraylist_long24);
    float f27 = user0.getAbilityRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f27 == 0.0f);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setDescription("");
    game5.setIdOwner((long)(byte)0);
    br.edu.ufcg.es.model.User user19 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long20 = user19.getInvitesReceived();
    java.lang.Long[] long_array23 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long24 = new java.util.ArrayList<java.lang.Long>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long24, long_array23);
    user19.setGamesRequested(arraylist_long24);
    java.lang.String str27 = user19.getAddress();
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user19.getGamesRequested();
    game5.setGuests(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    java.lang.String str8 = game5.getSport();
    game5.setLocal("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    user0.setId((java.lang.Long)100L);
    user0.setFairPlayRating((float)100);
    java.lang.String str5 = user0.getAddress();
    user0.setPhone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long26 = user25.getGamesRequested();
    int i27 = user25.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user25.getFavoriteUsers();
    user5.setGames(arraylist_long28);
    java.lang.String str30 = user5.getName();
    br.edu.ufcg.es.model.User user36 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long37 = user36.getGamesRequested();
    int i38 = user36.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long39 = user36.getGamesRequested();
    user5.setMyGames(arraylist_long39);
    int i41 = user5.getTimesRated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    user5.setFairPlayRating((float)(byte)1);
    user5.setPassword("");
    java.lang.String str12 = user5.getAddress();
    java.util.ArrayList<java.lang.Long> arraylist_long13 = user5.getMyGames();
    user5.setPhone("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long16 = user5.getInvitesReceived();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long16);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    game5.setId((long)'#');
    java.lang.String str16 = game5.getDate();
    br.edu.ufcg.es.model.User user17 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long18 = user17.getFavoriteUsers();
    java.lang.Long[] long_array21 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long22 = new java.util.ArrayList<java.lang.Long>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long22, long_array21);
    user17.setFavoriteUsers(arraylist_long22);
    game5.setGuests(arraylist_long22);
    java.lang.String str26 = game5.getDate();
    java.lang.String str27 = game5.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    br.edu.ufcg.es.model.User user15 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long16 = user15.getFavoriteUsers();
    java.lang.Long[] long_array19 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long20 = new java.util.ArrayList<java.lang.Long>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long20, long_array19);
    user15.setFavoriteUsers(arraylist_long20);
    user5.setMyGames(arraylist_long20);
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    boolean b14 = game5.isFinished();
    game5.setFinished(false);
    boolean b17 = game5.isFinished();
    game5.setDescription("");
    game5.setDate("");
    long long22 = game5.getIdOwner();
    game5.setDate("hi!");
    game5.setId((long)(short)1);
    game5.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 0L);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    java.lang.String str8 = user5.getPassword();
    user5.setId((java.lang.Long)10L);
    java.lang.String str11 = user5.getAddress();
    java.lang.String str12 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getFavoriteUsers();
    br.edu.ufcg.es.model.User user14 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    user14.setGamesRequested(arraylist_long17);
    user5.setGames(arraylist_long17);
    user5.setPhone("hi!");
    user5.setPhone("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long25 = user5.getMyGames();
    java.util.ArrayList<java.lang.Long> arraylist_long26 = user5.getGamesRequested();
    user5.setTimesRated((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long26);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    java.util.ArrayList<java.lang.Long> arraylist_long20 = user5.getGamesRequested();
    user5.setPassword("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long23 = user5.getInvitesReceived();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long23);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((-1L));
    game5.setId(10L);
    long long17 = game5.getId();
    br.edu.ufcg.es.model.User user23 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long24 = user23.getGamesRequested();
    user23.setEmail("");
    java.util.ArrayList<java.lang.Long> arraylist_long27 = user23.getGamesRequested();
    game5.setGuests(arraylist_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long27);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    user5.setAddress("");
    float f17 = user5.getAbilityRating();
    user5.setPassword("hi!");
    user5.setPassword("");
    java.util.ArrayList<java.lang.Long> arraylist_long22 = user5.getFavoriteUsers();
    br.edu.ufcg.es.model.User user28 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long29 = user28.getGamesRequested();
    int i30 = user28.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long31 = user28.getFavoriteUsers();
    br.edu.ufcg.es.model.User user37 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array39 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long40 = new java.util.ArrayList<java.lang.Long>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long40, long_array39);
    user37.setGamesRequested(arraylist_long40);
    user28.setGames(arraylist_long40);
    user28.setPhone("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long46 = user28.getGamesRequested();
    user5.setMyGames(arraylist_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f17 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long46);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setGamesRequested(arraylist_long5);
    user0.setFairPlayRating(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    java.lang.Long long11 = user5.getId();
    float f12 = user5.getAbilityRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f12 == 0.0f);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getName();
    java.lang.String str8 = game5.getLocal();
    java.lang.String str9 = game5.getLocal();
    br.edu.ufcg.es.model.User user10 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user16 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game22 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array26 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long27 = new java.util.ArrayList<java.lang.Long>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long27, long_array26);
    game22.setGuestRequests(arraylist_long27);
    user16.setGames(arraylist_long27);
    user10.setMyGames(arraylist_long27);
    user10.setName("");
    java.lang.Long long34 = user10.getId();
    br.edu.ufcg.es.model.User user35 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long36 = user35.getFavoriteUsers();
    br.edu.ufcg.es.model.User user42 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long43 = user42.getGamesRequested();
    java.lang.Long[] long_array48 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long49 = new java.util.ArrayList<java.lang.Long>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long49, long_array48);
    user42.setInvitesReceived(arraylist_long49);
    user42.setAddress("");
    br.edu.ufcg.es.model.User user59 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long60 = user59.getGamesRequested();
    user42.setGames(arraylist_long60);
    user35.setGamesRequested(arraylist_long60);
    user10.setFavoriteUsers(arraylist_long60);
    game5.setGuests(arraylist_long60);
    java.util.ArrayList<java.lang.Long> arraylist_long65 = game5.getGuestsRequests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long65);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setFavoriteUsers(arraylist_long5);
    user0.setName("hi!");
    user0.setFairPlayRating((float)52L);
    user0.setAbilityRating((float)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "", "hi!");
    user5.setId((java.lang.Long)1L);
    int i8 = user5.getTimesRated();
    user5.setPhone("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    game5.setId((long)'#');
    java.util.ArrayList<java.lang.Long> arraylist_long16 = game5.getGuests();
    java.util.ArrayList<java.lang.Long> arraylist_long17 = game5.getGuests();
    game5.setSport("");
    java.lang.String str20 = game5.getName();
    java.lang.String str21 = game5.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    boolean b14 = game5.isFinished();
    game5.setSport("");
    game5.setSport("");
    br.edu.ufcg.es.model.User user19 = new br.edu.ufcg.es.model.User();
    user19.setEmail("hi!");
    user19.setFairPlayRating((float)'#');
    br.edu.ufcg.es.model.User user29 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long30 = user29.getGamesRequested();
    java.lang.String str31 = user29.getPassword();
    java.util.ArrayList<java.lang.Long> arraylist_long32 = user29.getFavoriteUsers();
    user29.setFairPlayRating((float)'4');
    java.util.ArrayList<java.lang.Long> arraylist_long35 = user29.getInvitesReceived();
    user19.setGames(arraylist_long35);
    game5.setGuestRequests(arraylist_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long35);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    user5.setFairPlayRating((float)(byte)1);
    java.util.ArrayList<java.lang.Long> arraylist_long10 = null;
    user5.setGamesRequested(arraylist_long10);
    user5.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    int i8 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user5.getMyGames();
    user5.setAddress("");
    java.lang.String str12 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "", "hi!", "", "hi!");
    game5.setDate("");

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "hi!", "");
    java.lang.Long long6 = user5.getId();
    java.lang.Long long7 = user5.getId();
    java.lang.String str8 = user5.getAddress();
    int i9 = user5.getTimesRated();
    java.lang.String str10 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    java.lang.String str8 = user5.getPassword();
    user5.setId((java.lang.Long)100L);
    user5.setPassword("");
    java.lang.String str13 = user5.getPhone();
    br.edu.ufcg.es.model.Game game19 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long20 = game19.getId();
    game19.setLocal("hi!");
    game19.setIdOwner(100L);
    boolean b25 = game19.isFinished();
    boolean b26 = game19.isFinished();
    java.util.ArrayList<java.lang.Long> arraylist_long27 = game19.getGuestsRequests();
    user5.setMyGames(arraylist_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long27);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setDate("");
    java.lang.String str10 = game5.getDate();
    game5.setSport("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long13 = game5.getGuests();
    br.edu.ufcg.es.model.Game game19 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array23 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long24 = new java.util.ArrayList<java.lang.Long>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long24, long_array23);
    game19.setGuestRequests(arraylist_long24);
    game19.setIdOwner((long)'4');
    game19.setFinished(true);
    java.lang.String str31 = game19.getLocal();
    java.lang.String str32 = game19.getLocal();
    java.lang.String str33 = game19.getSport();
    game19.setLocal("hi!");
    game19.setName("hi!");
    br.edu.ufcg.es.model.User user43 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array45 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long46 = new java.util.ArrayList<java.lang.Long>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long46, long_array45);
    user43.setGamesRequested(arraylist_long46);
    int i49 = user43.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long50 = user43.getFavoriteUsers();
    game19.setGuests(arraylist_long50);
    game5.setGuests(arraylist_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long50);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setDescription("");
    java.util.ArrayList<java.lang.Long> arraylist_long17 = null;
    game5.setGuests(arraylist_long17);
    long long19 = game5.getId();
    java.lang.String str20 = game5.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long26 = user25.getGamesRequested();
    int i27 = user25.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user25.getFavoriteUsers();
    user5.setGames(arraylist_long28);
    java.lang.String str30 = user5.getName();
    user5.setAbilityRating((float)0L);
    br.edu.ufcg.es.model.User user38 = new br.edu.ufcg.es.model.User("", "hi!", "", "", "hi!");
    br.edu.ufcg.es.model.Game game44 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array48 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long49 = new java.util.ArrayList<java.lang.Long>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long49, long_array48);
    game44.setGuestRequests(arraylist_long49);
    boolean b52 = game44.isFinished();
    game44.setId((long)'#');
    br.edu.ufcg.es.model.User user60 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long61 = user60.getGamesRequested();
    java.lang.Long[] long_array66 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long67 = new java.util.ArrayList<java.lang.Long>();
    boolean b68 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long67, long_array66);
    user60.setInvitesReceived(arraylist_long67);
    game44.setGuestRequests(arraylist_long67);
    java.util.ArrayList<java.lang.Long> arraylist_long71 = game44.getGuests();
    user38.setGamesRequested(arraylist_long71);
    user5.setFavoriteUsers(arraylist_long71);
    user5.setName("");
    user5.setName("");
    java.util.ArrayList<java.lang.Long> arraylist_long78 = user5.getFavoriteUsers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long78);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    br.edu.ufcg.es.model.User user2 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = user2.getInvitesReceived();
    java.lang.Long[] long_array6 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long7 = new java.util.ArrayList<java.lang.Long>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long7, long_array6);
    user2.setGamesRequested(arraylist_long7);
    user0.setGamesRequested(arraylist_long7);
    user0.setAbilityRating((float)(short)-1);
    java.lang.String str13 = user0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    game5.setId((long)'#');
    br.edu.ufcg.es.model.User user21 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long22 = user21.getGamesRequested();
    java.lang.Long[] long_array27 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long28 = new java.util.ArrayList<java.lang.Long>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long28, long_array27);
    user21.setInvitesReceived(arraylist_long28);
    game5.setGuestRequests(arraylist_long28);
    java.util.ArrayList<java.lang.Long> arraylist_long32 = game5.getGuests();
    java.util.ArrayList<java.lang.Long> arraylist_long33 = game5.getGuestsRequests();
    long long34 = game5.getIdOwner();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long34 == 0L);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setFavoriteUsers(arraylist_long5);
    br.edu.ufcg.es.model.User user8 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user8.getFavoriteUsers();
    java.lang.Long[] long_array12 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long13 = new java.util.ArrayList<java.lang.Long>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long13, long_array12);
    user8.setFavoriteUsers(arraylist_long13);
    user0.setFavoriteUsers(arraylist_long13);
    java.util.ArrayList<java.lang.Long> arraylist_long17 = user0.getInvitesReceived();
    user0.setFairPlayRating((float)'#');
    int i20 = user0.getTimesRated();
    int i21 = user0.getTimesRated();
    float f22 = user0.getFairPlayRating();
    float f23 = user0.getFairPlayRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f22 == 35.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f23 == 35.0f);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    user5.setAddress("");
    user5.setFairPlayRating((float)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setGamesRequested(arraylist_long5);
    java.lang.String str8 = user0.getAddress();
    java.lang.String str9 = user0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    java.lang.String str13 = game5.getDate();
    game5.setIdOwner(0L);
    long long16 = game5.getId();
    game5.setSport("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long26 = user25.getGamesRequested();
    int i27 = user25.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user25.getFavoriteUsers();
    user5.setGames(arraylist_long28);
    java.lang.String str30 = user5.getName();
    user5.setTimesRated((int)'#');
    java.lang.String str33 = user5.getEmail();
    java.util.ArrayList<java.lang.Long> arraylist_long34 = user5.getMyGames();
    user5.setTimesRated(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long34);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long26 = user25.getGamesRequested();
    int i27 = user25.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user25.getFavoriteUsers();
    user5.setGames(arraylist_long28);
    java.lang.String str30 = user5.getName();
    user5.setPassword("");
    user5.setId((java.lang.Long)(-1L));
    java.lang.String str35 = user5.getAddress();
    br.edu.ufcg.es.model.User user41 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long42 = user41.getGamesRequested();
    java.lang.String str43 = user41.getEmail();
    int i44 = user41.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long45 = user41.getGames();
    br.edu.ufcg.es.model.Game game46 = new br.edu.ufcg.es.model.Game();
    game46.setId((long)' ');
    br.edu.ufcg.es.model.User user54 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game60 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array64 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long65 = new java.util.ArrayList<java.lang.Long>();
    boolean b66 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long65, long_array64);
    game60.setGuestRequests(arraylist_long65);
    user54.setGames(arraylist_long65);
    br.edu.ufcg.es.model.User user74 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long75 = user74.getGamesRequested();
    int i76 = user74.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long77 = user74.getFavoriteUsers();
    user54.setGames(arraylist_long77);
    java.lang.String str79 = user54.getName();
    br.edu.ufcg.es.model.User user85 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long86 = user85.getGamesRequested();
    int i87 = user85.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long88 = user85.getGamesRequested();
    user54.setMyGames(arraylist_long88);
    game46.setGuestRequests(arraylist_long88);
    user41.setInvitesReceived(arraylist_long88);
    user5.setGamesRequested(arraylist_long88);
    user5.setAddress("hi!");
    java.lang.String str95 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + ""+ "'", str43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + ""+ "'", str79.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str95 + "' != '" + "hi!"+ "'", str95.equals("hi!"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    user5.setPassword("hi!");
    user5.setName("");
    user5.setAddress("");
    int i21 = user5.getTimesRated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user6 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game12 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    game12.setGuestRequests(arraylist_long17);
    user6.setGames(arraylist_long17);
    user0.setMyGames(arraylist_long17);
    user0.setName("");
    user0.setPassword("");
    user0.setPassword("");
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user0.getGames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long28);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    int i8 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user5.getFavoriteUsers();
    user5.setTimesRated((int)(byte)1);
    br.edu.ufcg.es.model.User user17 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long18 = user17.getGamesRequested();
    int i19 = user17.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long20 = user17.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long21 = user17.getInvitesReceived();
    user5.setMyGames(arraylist_long21);
    java.lang.String str23 = user5.getPhone();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setDate("hi!");
    game5.setLocal("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long10 = game5.getGuests();
    java.lang.String str11 = game5.getDate();
    long long12 = game5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    user5.setPassword("");
    user5.setPhone("hi!");
    br.edu.ufcg.es.model.Game game16 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array20 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long21 = new java.util.ArrayList<java.lang.Long>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long21, long_array20);
    game16.setGuestRequests(arraylist_long21);
    game16.setName("hi!");
    game16.setId((long)'#');
    long long28 = game16.getId();
    game16.setDescription("hi!");
    br.edu.ufcg.es.model.User user36 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array38 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long39 = new java.util.ArrayList<java.lang.Long>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long39, long_array38);
    user36.setGamesRequested(arraylist_long39);
    int i42 = user36.getTimesRated();
    java.lang.String str43 = user36.getPhone();
    java.util.ArrayList<java.lang.Long> arraylist_long44 = user36.getMyGames();
    game16.setGuestRequests(arraylist_long44);
    user5.setGamesRequested(arraylist_long44);
    user5.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long28 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + ""+ "'", str43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long44);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    game5.setId((long)'#');
    java.lang.String str16 = game5.getDate();
    game5.setId(10L);
    game5.setDate("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long26 = user25.getGamesRequested();
    int i27 = user25.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user25.getFavoriteUsers();
    user5.setGames(arraylist_long28);
    java.lang.String str30 = user5.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long31 = user5.getGamesRequested();
    float f32 = user5.getAbilityRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f32 == 0.0f);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    java.util.ArrayList<java.lang.Long> arraylist_long20 = user5.getMyGames();
    java.util.ArrayList<java.lang.Long> arraylist_long21 = user5.getMyGames();
    user5.setId((java.lang.Long)35L);
    java.util.ArrayList<java.lang.Long> arraylist_long24 = null;
    user5.setGames(arraylist_long24);
    user5.setPhone("hi!");
    user5.computeRating((float)35, (float)35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long21);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setDate("hi!");
    game5.setName("hi!");
    boolean b10 = game5.isFinished();
    boolean b11 = game5.isFinished();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    user5.setAddress("");
    float f17 = user5.getAbilityRating();
    java.lang.String str18 = user5.getEmail();
    user5.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f17 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }

    br.edu.ufcg.es.model.Game game0 = new br.edu.ufcg.es.model.Game();
    long long1 = game0.getIdOwner();
    java.lang.String str2 = game0.getDate();
    game0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setFinished(true);
    game5.setDate("hi!");
    game5.setFinished(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "", "", "");

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setDate("");
    game5.setIdOwner(0L);
    java.lang.String str12 = game5.getName();
    game5.setDescription("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    br.edu.ufcg.es.model.User user15 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long16 = user15.getFavoriteUsers();
    br.edu.ufcg.es.model.Game game17 = new br.edu.ufcg.es.model.Game();
    game17.setId((long)' ');
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game31 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array35 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long36 = new java.util.ArrayList<java.lang.Long>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long36, long_array35);
    game31.setGuestRequests(arraylist_long36);
    user25.setGames(arraylist_long36);
    br.edu.ufcg.es.model.User user45 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long46 = user45.getGamesRequested();
    int i47 = user45.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long48 = user45.getFavoriteUsers();
    user25.setGames(arraylist_long48);
    java.lang.String str50 = user25.getName();
    br.edu.ufcg.es.model.User user56 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long57 = user56.getGamesRequested();
    int i58 = user56.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long59 = user56.getGamesRequested();
    user25.setMyGames(arraylist_long59);
    game17.setGuestRequests(arraylist_long59);
    br.edu.ufcg.es.model.User user67 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long68 = user67.getGamesRequested();
    int i69 = user67.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long70 = user67.getFavoriteUsers();
    br.edu.ufcg.es.model.User user76 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array78 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long79 = new java.util.ArrayList<java.lang.Long>();
    boolean b80 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long79, long_array78);
    user76.setGamesRequested(arraylist_long79);
    user67.setGames(arraylist_long79);
    user67.setPhone("hi!");
    user67.setPhone("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long87 = user67.getMyGames();
    game17.setGuests(arraylist_long87);
    user15.setInvitesReceived(arraylist_long87);
    user5.setGames(arraylist_long87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + ""+ "'", str50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long87);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long26 = user25.getGamesRequested();
    int i27 = user25.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user25.getFavoriteUsers();
    user5.setGames(arraylist_long28);
    java.lang.String str30 = user5.getName();
    user5.setPassword("");
    java.lang.String str33 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    java.lang.String str13 = game5.getDescription();
    java.lang.String str14 = game5.getDescription();
    game5.setDate("");
    boolean b17 = game5.isFinished();
    game5.setName("");
    game5.setSport("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setDate("hi!");
    game5.setLocal("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long10 = game5.getGuests();
    java.lang.String str11 = game5.getDate();
    game5.setName("");
    java.lang.String str14 = game5.getDescription();
    br.edu.ufcg.es.model.Game game20 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array24 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long25 = new java.util.ArrayList<java.lang.Long>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long25, long_array24);
    game20.setGuestRequests(arraylist_long25);
    boolean b28 = game20.isFinished();
    game20.setId((long)'#');
    java.util.ArrayList<java.lang.Long> arraylist_long31 = game20.getGuests();
    java.util.ArrayList<java.lang.Long> arraylist_long32 = game20.getGuests();
    game5.setGuests(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long32);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user6 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game12 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    game12.setGuestRequests(arraylist_long17);
    user6.setGames(arraylist_long17);
    user0.setMyGames(arraylist_long17);
    user0.setPhone("");
    java.lang.String str24 = user0.getPassword();
    br.edu.ufcg.es.model.User user30 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long31 = user30.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long32 = user30.getInvitesReceived();
    java.util.ArrayList<java.lang.Long> arraylist_long33 = user30.getGamesRequested();
    user0.setMyGames(arraylist_long33);
    user0.computeRating((float)(short)1, (float)(byte)-1);
    float f38 = user0.getFairPlayRating();
    java.util.ArrayList<java.lang.Long> arraylist_long39 = user0.getMyGames();
    java.lang.String str40 = user0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f38 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str40);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    user5.setTimesRated((int)(byte)-1);
    java.lang.String str13 = user5.getEmail();
    user5.setPassword("");
    int i16 = user5.getTimesRated();
    br.edu.ufcg.es.model.User user17 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long18 = null;
    user17.setGames(arraylist_long18);
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game31 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array35 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long36 = new java.util.ArrayList<java.lang.Long>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long36, long_array35);
    game31.setGuestRequests(arraylist_long36);
    user25.setGames(arraylist_long36);
    java.util.ArrayList<java.lang.Long> arraylist_long40 = user25.getMyGames();
    user17.setGames(arraylist_long40);
    user5.setGamesRequested(arraylist_long40);
    java.util.ArrayList<java.lang.Long> arraylist_long43 = user5.getGames();
    float f44 = user5.getFairPlayRating();
    user5.computeRating((float)(short)100, (float)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f44 == 0.0f);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setLocal("hi!");
    game5.setIdOwner(100L);
    boolean b11 = game5.isFinished();
    boolean b12 = game5.isFinished();
    long long13 = game5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getPassword();
    java.lang.String str8 = user5.getPassword();
    user5.computeRating((float)'a', (-1.0f));
    user5.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "");
    user5.setAbilityRating((float)35);
    user5.setPassword("");

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user6 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game12 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    game12.setGuestRequests(arraylist_long17);
    user6.setGames(arraylist_long17);
    user0.setMyGames(arraylist_long17);
    user0.setName("");
    user0.setPassword("");
    float f26 = user0.getFairPlayRating();
    java.util.ArrayList<java.lang.Long> arraylist_long27 = user0.getInvitesReceived();
    user0.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f26 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long27);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setSport("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long9 = game5.getGuestsRequests();
    br.edu.ufcg.es.model.User user10 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user16 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game22 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array26 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long27 = new java.util.ArrayList<java.lang.Long>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long27, long_array26);
    game22.setGuestRequests(arraylist_long27);
    user16.setGames(arraylist_long27);
    user10.setMyGames(arraylist_long27);
    user10.setPhone("");
    br.edu.ufcg.es.model.User user39 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game45 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array49 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long50 = new java.util.ArrayList<java.lang.Long>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long50, long_array49);
    game45.setGuestRequests(arraylist_long50);
    user39.setGames(arraylist_long50);
    br.edu.ufcg.es.model.User user59 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long60 = user59.getGamesRequested();
    int i61 = user59.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long62 = user59.getFavoriteUsers();
    user39.setGames(arraylist_long62);
    user10.setMyGames(arraylist_long62);
    game5.setGuestRequests(arraylist_long62);
    game5.setIdOwner((long)(-1));
    br.edu.ufcg.es.model.User user73 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long74 = user73.getGamesRequested();
    java.lang.String str75 = user73.getPassword();
    java.util.ArrayList<java.lang.Long> arraylist_long76 = user73.getFavoriteUsers();
    game5.setGuestRequests(arraylist_long76);
    br.edu.ufcg.es.model.User user83 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long84 = user83.getGamesRequested();
    java.lang.String str85 = user83.getPassword();
    java.util.ArrayList<java.lang.Long> arraylist_long86 = user83.getFavoriteUsers();
    java.util.ArrayList<java.lang.Long> arraylist_long87 = user83.getGames();
    game5.setGuestRequests(arraylist_long87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + ""+ "'", str75.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str85 + "' != '" + ""+ "'", str85.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long87);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user6 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game12 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    game12.setGuestRequests(arraylist_long17);
    user6.setGames(arraylist_long17);
    user0.setMyGames(arraylist_long17);
    user0.setPhone("");
    java.lang.String str24 = user0.getPassword();
    br.edu.ufcg.es.model.User user30 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long31 = user30.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long32 = user30.getInvitesReceived();
    java.util.ArrayList<java.lang.Long> arraylist_long33 = user30.getGamesRequested();
    user0.setMyGames(arraylist_long33);
    java.lang.String str35 = user0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user6 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game12 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    game12.setGuestRequests(arraylist_long17);
    user6.setGames(arraylist_long17);
    user0.setMyGames(arraylist_long17);
    user0.setPhone("");
    br.edu.ufcg.es.model.User user29 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game35 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array39 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long40 = new java.util.ArrayList<java.lang.Long>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long40, long_array39);
    game35.setGuestRequests(arraylist_long40);
    user29.setGames(arraylist_long40);
    br.edu.ufcg.es.model.User user49 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long50 = user49.getGamesRequested();
    int i51 = user49.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long52 = user49.getFavoriteUsers();
    user29.setGames(arraylist_long52);
    user0.setMyGames(arraylist_long52);
    br.edu.ufcg.es.model.User user60 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long61 = user60.getGamesRequested();
    java.lang.Long[] long_array66 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long67 = new java.util.ArrayList<java.lang.Long>();
    boolean b68 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long67, long_array66);
    user60.setInvitesReceived(arraylist_long67);
    java.lang.String str70 = user60.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long71 = user60.getFavoriteUsers();
    user0.setGamesRequested(arraylist_long71);
    float f73 = user0.getFairPlayRating();
    java.util.ArrayList<java.lang.Long> arraylist_long74 = user0.getMyGames();
    java.lang.String str75 = user0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + ""+ "'", str70.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f73 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + ""+ "'", str75.equals(""));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    game5.setId((long)'#');
    java.lang.String str16 = game5.getDate();
    br.edu.ufcg.es.model.User user22 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long23 = user22.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long24 = user22.getInvitesReceived();
    game5.setGuests(arraylist_long24);
    game5.setId((long)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long24);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setFinished(true);
    java.lang.String str17 = game5.getLocal();
    java.lang.String str18 = game5.getLocal();
    java.lang.String str19 = game5.getSport();
    game5.setLocal("hi!");
    java.lang.String str22 = game5.getName();
    br.edu.ufcg.es.model.User user23 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long24 = user23.getFavoriteUsers();
    br.edu.ufcg.es.model.User user30 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long31 = user30.getGamesRequested();
    java.lang.Long[] long_array36 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long37 = new java.util.ArrayList<java.lang.Long>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long37, long_array36);
    user30.setInvitesReceived(arraylist_long37);
    user30.setAddress("");
    br.edu.ufcg.es.model.User user47 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long48 = user47.getGamesRequested();
    user30.setGames(arraylist_long48);
    user23.setGamesRequested(arraylist_long48);
    br.edu.ufcg.es.model.User user56 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game62 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array66 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long67 = new java.util.ArrayList<java.lang.Long>();
    boolean b68 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long67, long_array66);
    game62.setGuestRequests(arraylist_long67);
    user56.setGames(arraylist_long67);
    br.edu.ufcg.es.model.User user76 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long77 = user76.getGamesRequested();
    int i78 = user76.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long79 = user76.getFavoriteUsers();
    user56.setGames(arraylist_long79);
    user23.setGames(arraylist_long79);
    game5.setGuestRequests(arraylist_long79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long79);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    user5.setEmail("");
    user5.setAbilityRating((float)'4');
    java.lang.String str11 = user5.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((-1L));
    game5.setId(10L);
    long long17 = game5.getId();
    game5.setIdOwner((long)(short)100);
    java.lang.String str20 = game5.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user6 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game12 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    game12.setGuestRequests(arraylist_long17);
    user6.setGames(arraylist_long17);
    user0.setMyGames(arraylist_long17);
    user0.setName("");
    user0.setPassword("");
    br.edu.ufcg.es.model.User user31 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long32 = user31.getGamesRequested();
    java.lang.Long[] long_array37 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long38 = new java.util.ArrayList<java.lang.Long>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long38, long_array37);
    user31.setInvitesReceived(arraylist_long38);
    java.lang.String str41 = user31.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long42 = user31.getFavoriteUsers();
    br.edu.ufcg.es.model.User user43 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long44 = user43.getFavoriteUsers();
    java.lang.Long[] long_array47 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long48 = new java.util.ArrayList<java.lang.Long>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long48, long_array47);
    user43.setFavoriteUsers(arraylist_long48);
    user31.setInvitesReceived(arraylist_long48);
    user0.setGamesRequested(arraylist_long48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + ""+ "'", str41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setFavoriteUsers(arraylist_long5);
    br.edu.ufcg.es.model.User user8 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user8.getFavoriteUsers();
    java.lang.Long[] long_array12 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long13 = new java.util.ArrayList<java.lang.Long>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long13, long_array12);
    user8.setFavoriteUsers(arraylist_long13);
    user0.setFavoriteUsers(arraylist_long13);
    java.lang.String str17 = user0.getAddress();
    user0.setAbilityRating((float)'#');
    user0.setTimesRated(10);
    java.util.ArrayList<java.lang.Long> arraylist_long22 = user0.getFavoriteUsers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long22);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    java.lang.String str15 = user5.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long16 = user5.getFavoriteUsers();
    br.edu.ufcg.es.model.User user17 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long18 = user17.getFavoriteUsers();
    java.lang.Long[] long_array21 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long22 = new java.util.ArrayList<java.lang.Long>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long22, long_array21);
    user17.setFavoriteUsers(arraylist_long22);
    user5.setInvitesReceived(arraylist_long22);
    java.util.ArrayList<java.lang.Long> arraylist_long26 = user5.getGamesRequested();
    java.lang.String str27 = user5.getName();
    user5.setId((java.lang.Long)52L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long26 = user25.getGamesRequested();
    int i27 = user25.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user25.getFavoriteUsers();
    user5.setGames(arraylist_long28);
    java.lang.String str30 = user5.getName();
    user5.setPassword("");
    user5.setTimesRated((int)(byte)100);
    float f35 = user5.getAbilityRating();
    float f36 = user5.getFairPlayRating();
    user5.setFairPlayRating((float)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f35 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f36 == 0.0f);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setFavoriteUsers(arraylist_long5);
    br.edu.ufcg.es.model.User user8 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user8.getFavoriteUsers();
    java.lang.Long[] long_array12 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long13 = new java.util.ArrayList<java.lang.Long>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long13, long_array12);
    user8.setFavoriteUsers(arraylist_long13);
    user0.setFavoriteUsers(arraylist_long13);
    java.util.ArrayList<java.lang.Long> arraylist_long17 = user0.getGamesRequested();
    float f18 = user0.getAbilityRating();
    float f19 = user0.getAbilityRating();
    float f20 = user0.getAbilityRating();
    user0.setAddress("hi!");
    java.lang.String str23 = user0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f18 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f19 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f20 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "", "hi!", "", "hi!");
    boolean b6 = game5.isFinished();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    br.edu.ufcg.es.model.Game game13 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long14 = game13.getId();
    game13.setSport("hi!");
    game13.setFinished(false);
    br.edu.ufcg.es.model.Game game24 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array28 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long29 = new java.util.ArrayList<java.lang.Long>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long29, long_array28);
    game24.setGuestRequests(arraylist_long29);
    boolean b32 = game24.isFinished();
    boolean b33 = game24.isFinished();
    br.edu.ufcg.es.model.User user34 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long35 = user34.getFavoriteUsers();
    br.edu.ufcg.es.model.Game game36 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long37 = game36.getGuests();
    br.edu.ufcg.es.model.User user43 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game49 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array53 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long54 = new java.util.ArrayList<java.lang.Long>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long54, long_array53);
    game49.setGuestRequests(arraylist_long54);
    user43.setGames(arraylist_long54);
    java.util.ArrayList<java.lang.Long> arraylist_long58 = user43.getMyGames();
    game36.setGuestRequests(arraylist_long58);
    user34.setGames(arraylist_long58);
    game24.setGuestRequests(arraylist_long58);
    br.edu.ufcg.es.model.User user67 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game73 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array77 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long78 = new java.util.ArrayList<java.lang.Long>();
    boolean b79 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long78, long_array77);
    game73.setGuestRequests(arraylist_long78);
    user67.setGames(arraylist_long78);
    br.edu.ufcg.es.model.User user87 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long88 = user87.getGamesRequested();
    int i89 = user87.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long90 = user87.getFavoriteUsers();
    user67.setGames(arraylist_long90);
    game24.setGuests(arraylist_long90);
    game13.setGuestRequests(arraylist_long90);
    user5.setInvitesReceived(arraylist_long90);
    int i95 = user5.getTimesRated();
    user5.setFairPlayRating((float)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 0);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "hi!", "", "hi!");

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }

    br.edu.ufcg.es.model.Game game0 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = game0.getGuests();
    br.edu.ufcg.es.model.User user7 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game13 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array17 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long18 = new java.util.ArrayList<java.lang.Long>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long18, long_array17);
    game13.setGuestRequests(arraylist_long18);
    user7.setGames(arraylist_long18);
    java.util.ArrayList<java.lang.Long> arraylist_long22 = user7.getMyGames();
    game0.setGuestRequests(arraylist_long22);
    game0.setSport("hi!");
    br.edu.ufcg.es.model.User user31 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "", "hi!");
    java.lang.String str32 = user31.getPassword();
    float f33 = user31.getAbilityRating();
    br.edu.ufcg.es.model.User user39 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long40 = user39.getGamesRequested();
    java.lang.Long[] long_array45 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long46 = new java.util.ArrayList<java.lang.Long>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long46, long_array45);
    user39.setInvitesReceived(arraylist_long46);
    user39.setAddress("");
    br.edu.ufcg.es.model.User user56 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long57 = user56.getGamesRequested();
    user39.setGames(arraylist_long57);
    br.edu.ufcg.es.model.User user64 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long65 = user64.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long66 = user64.getInvitesReceived();
    user39.setGamesRequested(arraylist_long66);
    user31.setFavoriteUsers(arraylist_long66);
    java.util.ArrayList<java.lang.Long> arraylist_long69 = user31.getInvitesReceived();
    game0.setGuests(arraylist_long69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f33 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long69);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    java.lang.String str15 = user5.getName();
    br.edu.ufcg.es.model.User user21 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game27 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array31 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long32 = new java.util.ArrayList<java.lang.Long>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long32, long_array31);
    game27.setGuestRequests(arraylist_long32);
    user21.setGames(arraylist_long32);
    br.edu.ufcg.es.model.User user41 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long42 = user41.getGamesRequested();
    int i43 = user41.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long44 = user41.getFavoriteUsers();
    user21.setGames(arraylist_long44);
    java.lang.String str46 = user21.getName();
    user21.setTimesRated((int)'#');
    java.lang.String str49 = user21.getEmail();
    java.util.ArrayList<java.lang.Long> arraylist_long50 = user21.getMyGames();
    user5.setGamesRequested(arraylist_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + ""+ "'", str46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ""+ "'", str49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long50);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setFinished(true);
    java.lang.String str17 = game5.getLocal();
    java.lang.String str18 = game5.getLocal();
    br.edu.ufcg.es.model.User user24 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long25 = user24.getGamesRequested();
    java.lang.Long[] long_array30 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long31 = new java.util.ArrayList<java.lang.Long>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long31, long_array30);
    user24.setInvitesReceived(arraylist_long31);
    java.lang.String str34 = user24.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long35 = user24.getFavoriteUsers();
    br.edu.ufcg.es.model.User user36 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long37 = user36.getFavoriteUsers();
    java.lang.Long[] long_array40 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long41 = new java.util.ArrayList<java.lang.Long>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long41, long_array40);
    user36.setFavoriteUsers(arraylist_long41);
    user24.setInvitesReceived(arraylist_long41);
    br.edu.ufcg.es.model.User user50 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long51 = user50.getGamesRequested();
    int i52 = user50.getTimesRated();
    int i53 = user50.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long54 = user50.getMyGames();
    user24.setInvitesReceived(arraylist_long54);
    game5.setGuestRequests(arraylist_long54);
    game5.setSport("");
    game5.setFinished(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long54);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long long2 = user0.getId();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = user0.getGames();
    user0.setId((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    int i15 = user5.getTimesRated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setFinished(true);
    java.lang.String str17 = game5.getLocal();
    java.lang.String str18 = game5.getLocal();
    br.edu.ufcg.es.model.User user24 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long25 = user24.getGamesRequested();
    java.lang.Long[] long_array30 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long31 = new java.util.ArrayList<java.lang.Long>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long31, long_array30);
    user24.setInvitesReceived(arraylist_long31);
    java.lang.String str34 = user24.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long35 = user24.getFavoriteUsers();
    br.edu.ufcg.es.model.User user36 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long37 = user36.getFavoriteUsers();
    java.lang.Long[] long_array40 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long41 = new java.util.ArrayList<java.lang.Long>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long41, long_array40);
    user36.setFavoriteUsers(arraylist_long41);
    user24.setInvitesReceived(arraylist_long41);
    br.edu.ufcg.es.model.User user50 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long51 = user50.getGamesRequested();
    int i52 = user50.getTimesRated();
    int i53 = user50.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long54 = user50.getMyGames();
    user24.setInvitesReceived(arraylist_long54);
    game5.setGuestRequests(arraylist_long54);
    game5.setName("");
    java.lang.String str59 = game5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + ""+ "'", str59.equals(""));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    boolean b14 = game5.isFinished();
    game5.setId((long)(byte)0);
    java.util.ArrayList<java.lang.Long> arraylist_long17 = game5.getGuestsRequests();
    game5.setFinished(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long17);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    boolean b14 = game5.isFinished();
    game5.setName("hi!");
    game5.setId((long)(short)10);
    br.edu.ufcg.es.model.User user19 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long20 = user19.getFavoriteUsers();
    java.lang.Long[] long_array23 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long24 = new java.util.ArrayList<java.lang.Long>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long24, long_array23);
    user19.setFavoriteUsers(arraylist_long24);
    br.edu.ufcg.es.model.User user27 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user27.getFavoriteUsers();
    java.lang.Long[] long_array31 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long32 = new java.util.ArrayList<java.lang.Long>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long32, long_array31);
    user27.setFavoriteUsers(arraylist_long32);
    user19.setFavoriteUsers(arraylist_long32);
    java.util.ArrayList<java.lang.Long> arraylist_long36 = user19.getGamesRequested();
    user19.computeRating((float)'a', (float)'#');
    br.edu.ufcg.es.model.Game game45 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array49 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long50 = new java.util.ArrayList<java.lang.Long>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long50, long_array49);
    game45.setGuestRequests(arraylist_long50);
    boolean b53 = game45.isFinished();
    boolean b54 = game45.isFinished();
    br.edu.ufcg.es.model.User user55 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long56 = user55.getFavoriteUsers();
    br.edu.ufcg.es.model.Game game57 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long58 = game57.getGuests();
    br.edu.ufcg.es.model.User user64 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game70 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array74 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long75 = new java.util.ArrayList<java.lang.Long>();
    boolean b76 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long75, long_array74);
    game70.setGuestRequests(arraylist_long75);
    user64.setGames(arraylist_long75);
    java.util.ArrayList<java.lang.Long> arraylist_long79 = user64.getMyGames();
    game57.setGuestRequests(arraylist_long79);
    user55.setGames(arraylist_long79);
    game45.setGuestRequests(arraylist_long79);
    user19.setInvitesReceived(arraylist_long79);
    game5.setGuests(arraylist_long79);
    boolean b85 = game5.isFinished();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    game5.setId((long)'#');
    br.edu.ufcg.es.model.User user21 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long22 = user21.getGamesRequested();
    java.lang.Long[] long_array27 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long28 = new java.util.ArrayList<java.lang.Long>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long28, long_array27);
    user21.setInvitesReceived(arraylist_long28);
    game5.setGuestRequests(arraylist_long28);
    java.util.ArrayList<java.lang.Long> arraylist_long32 = game5.getGuests();
    br.edu.ufcg.es.model.User user38 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long39 = user38.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long40 = user38.getInvitesReceived();
    game5.setGuestRequests(arraylist_long40);
    game5.setId((long)(byte)10);
    java.lang.String str44 = game5.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!"+ "'", str44.equals("hi!"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setDate("hi!");
    game5.setSport("");
    boolean b10 = game5.isFinished();
    boolean b11 = game5.isFinished();
    java.lang.String str12 = game5.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    java.util.ArrayList<java.lang.Long> arraylist_long20 = user5.getGamesRequested();
    user5.setPassword("hi!");
    java.lang.String str23 = user5.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "", "", "hi!", "hi!");
    game5.setFinished(true);
    game5.setId((long)(short)100);
    br.edu.ufcg.es.model.User user15 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game21 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array25 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long26 = new java.util.ArrayList<java.lang.Long>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long26, long_array25);
    game21.setGuestRequests(arraylist_long26);
    user15.setGames(arraylist_long26);
    java.util.ArrayList<java.lang.Long> arraylist_long30 = user15.getGamesRequested();
    game5.setGuestRequests(arraylist_long30);
    game5.setFinished(true);
    java.lang.String str34 = game5.getSport();
    game5.setLocal("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    java.lang.String str15 = user5.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long16 = user5.getFavoriteUsers();
    java.lang.String str17 = user5.getPassword();
    user5.setPhone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    user5.setAddress("");
    user5.setId((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getFavoriteUsers();
    user5.setFairPlayRating((float)(-1));
    float f11 = user5.getAbilityRating();
    int i12 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long13 = user5.getGames();
    user5.setPhone("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long13);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    java.util.ArrayList<java.lang.Long> arraylist_long15 = user5.getInvitesReceived();
    java.lang.String str16 = user5.getEmail();
    float f17 = user5.getFairPlayRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f17 == 0.0f);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user6 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game12 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    game12.setGuestRequests(arraylist_long17);
    user6.setGames(arraylist_long17);
    user0.setMyGames(arraylist_long17);
    user0.setPhone("");
    br.edu.ufcg.es.model.User user29 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game35 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array39 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long40 = new java.util.ArrayList<java.lang.Long>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long40, long_array39);
    game35.setGuestRequests(arraylist_long40);
    user29.setGames(arraylist_long40);
    br.edu.ufcg.es.model.User user49 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long50 = user49.getGamesRequested();
    int i51 = user49.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long52 = user49.getFavoriteUsers();
    user29.setGames(arraylist_long52);
    user0.setMyGames(arraylist_long52);
    br.edu.ufcg.es.model.User user60 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long61 = user60.getGamesRequested();
    java.lang.Long[] long_array66 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long67 = new java.util.ArrayList<java.lang.Long>();
    boolean b68 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long67, long_array66);
    user60.setInvitesReceived(arraylist_long67);
    java.lang.String str70 = user60.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long71 = user60.getFavoriteUsers();
    user0.setGamesRequested(arraylist_long71);
    java.util.ArrayList<java.lang.Long> arraylist_long73 = user0.getInvitesReceived();
    java.util.ArrayList<java.lang.Long> arraylist_long74 = null;
    user0.setGamesRequested(arraylist_long74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + ""+ "'", str70.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long73);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setDate("hi!");
    game5.setLocal("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long10 = game5.getGuests();
    java.lang.String str11 = game5.getName();
    br.edu.ufcg.es.model.User user12 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long13 = user12.getFavoriteUsers();
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    user12.setFavoriteUsers(arraylist_long17);
    br.edu.ufcg.es.model.Game game20 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long21 = game20.getGuests();
    br.edu.ufcg.es.model.User user27 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game33 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array37 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long38 = new java.util.ArrayList<java.lang.Long>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long38, long_array37);
    game33.setGuestRequests(arraylist_long38);
    user27.setGames(arraylist_long38);
    java.util.ArrayList<java.lang.Long> arraylist_long42 = user27.getMyGames();
    game20.setGuestRequests(arraylist_long42);
    game20.setSport("hi!");
    game20.setSport("hi!");
    java.lang.String str48 = game20.getDate();
    br.edu.ufcg.es.model.Game game49 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long50 = game49.getGuests();
    br.edu.ufcg.es.model.User user56 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game62 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array66 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long67 = new java.util.ArrayList<java.lang.Long>();
    boolean b68 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long67, long_array66);
    game62.setGuestRequests(arraylist_long67);
    user56.setGames(arraylist_long67);
    java.util.ArrayList<java.lang.Long> arraylist_long71 = user56.getMyGames();
    game49.setGuestRequests(arraylist_long71);
    game20.setGuests(arraylist_long71);
    br.edu.ufcg.es.model.User user79 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game85 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array89 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long90 = new java.util.ArrayList<java.lang.Long>();
    boolean b91 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long90, long_array89);
    game85.setGuestRequests(arraylist_long90);
    user79.setGames(arraylist_long90);
    java.util.ArrayList<java.lang.Long> arraylist_long94 = user79.getMyGames();
    game20.setGuests(arraylist_long94);
    user12.setMyGames(arraylist_long94);
    game5.setGuests(arraylist_long94);
    game5.setLocal("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long94);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    user5.setTimesRated((int)(byte)-1);
    java.lang.String str13 = user5.getPassword();
    user5.setPhone("");
    java.lang.Long long16 = user5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long16);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setDate("");
    java.lang.String str10 = game5.getDate();
    long long11 = game5.getId();
    boolean b12 = game5.isFinished();
    game5.setFinished(true);
    java.util.ArrayList<java.lang.Long> arraylist_long15 = game5.getGuests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long15);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    user5.setPassword("hi!");
    user5.setName("");
    user5.setAddress("");
    user5.setFairPlayRating((float)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setSport("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long9 = game5.getGuestsRequests();
    br.edu.ufcg.es.model.User user10 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user16 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game22 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array26 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long27 = new java.util.ArrayList<java.lang.Long>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long27, long_array26);
    game22.setGuestRequests(arraylist_long27);
    user16.setGames(arraylist_long27);
    user10.setMyGames(arraylist_long27);
    user10.setPhone("");
    br.edu.ufcg.es.model.User user39 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game45 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array49 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long50 = new java.util.ArrayList<java.lang.Long>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long50, long_array49);
    game45.setGuestRequests(arraylist_long50);
    user39.setGames(arraylist_long50);
    br.edu.ufcg.es.model.User user59 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long60 = user59.getGamesRequested();
    int i61 = user59.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long62 = user59.getFavoriteUsers();
    user39.setGames(arraylist_long62);
    user10.setMyGames(arraylist_long62);
    game5.setGuestRequests(arraylist_long62);
    game5.setIdOwner((long)(-1));
    br.edu.ufcg.es.model.User user73 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long74 = user73.getGamesRequested();
    java.lang.String str75 = user73.getPassword();
    java.util.ArrayList<java.lang.Long> arraylist_long76 = user73.getFavoriteUsers();
    game5.setGuestRequests(arraylist_long76);
    java.util.ArrayList<java.lang.Long> arraylist_long78 = game5.getGuests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + ""+ "'", str75.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long78);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setFavoriteUsers(arraylist_long5);
    br.edu.ufcg.es.model.User user8 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user8.getFavoriteUsers();
    java.lang.Long[] long_array12 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long13 = new java.util.ArrayList<java.lang.Long>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long13, long_array12);
    user8.setFavoriteUsers(arraylist_long13);
    user0.setFavoriteUsers(arraylist_long13);
    java.util.ArrayList<java.lang.Long> arraylist_long17 = user0.getInvitesReceived();
    user0.setFairPlayRating((float)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long17);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    user5.setFairPlayRating((float)(byte)1);
    java.util.ArrayList<java.lang.Long> arraylist_long10 = null;
    user5.setGamesRequested(arraylist_long10);
    java.util.ArrayList<java.lang.Long> arraylist_long12 = user5.getInvitesReceived();
    br.edu.ufcg.es.model.User user18 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long19 = user18.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long20 = user18.getInvitesReceived();
    java.lang.String str21 = user18.getPassword();
    user18.setId((java.lang.Long)10L);
    br.edu.ufcg.es.model.User user29 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game35 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array39 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long40 = new java.util.ArrayList<java.lang.Long>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long40, long_array39);
    game35.setGuestRequests(arraylist_long40);
    user29.setGames(arraylist_long40);
    java.util.ArrayList<java.lang.Long> arraylist_long44 = user29.getGamesRequested();
    user18.setGames(arraylist_long44);
    user18.computeRating((float)(short)100, (float)'#');
    java.util.ArrayList<java.lang.Long> arraylist_long49 = user18.getGamesRequested();
    user5.setFavoriteUsers(arraylist_long49);
    java.util.ArrayList<java.lang.Long> arraylist_long51 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long52 = user5.getInvitesReceived();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long52);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setSport("hi!");
    game5.setSport("hi!");
    game5.setFinished(false);
    long long13 = game5.getIdOwner();
    game5.setIdOwner((long)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    java.lang.String str13 = game5.getDescription();
    java.util.ArrayList<java.lang.Long> arraylist_long14 = game5.getGuestsRequests();
    game5.setSport("");
    java.lang.String str17 = game5.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "hi!", "hi!", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = game5.getGuests();
    game5.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setSport("hi!");
    game5.setFinished(false);
    long long11 = game5.getId();
    game5.setDate("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user6 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game12 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    game12.setGuestRequests(arraylist_long17);
    user6.setGames(arraylist_long17);
    user0.setMyGames(arraylist_long17);
    user0.setName("");
    br.edu.ufcg.es.model.Game game29 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array33 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long34 = new java.util.ArrayList<java.lang.Long>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long34, long_array33);
    game29.setGuestRequests(arraylist_long34);
    boolean b37 = game29.isFinished();
    game29.setId((long)'#');
    java.lang.String str40 = game29.getDate();
    br.edu.ufcg.es.model.User user46 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long47 = user46.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long48 = user46.getInvitesReceived();
    game29.setGuests(arraylist_long48);
    user0.setGames(arraylist_long48);
    java.util.ArrayList<java.lang.Long> arraylist_long51 = user0.getInvitesReceived();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!"+ "'", str40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long51);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }

    br.edu.ufcg.es.model.Game game0 = new br.edu.ufcg.es.model.Game();
    java.lang.String str1 = game0.getDate();
    java.lang.String str2 = game0.getDescription();
    java.lang.String str3 = game0.getDescription();
    long long4 = game0.getIdOwner();
    java.lang.String str5 = game0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    user0.setEmail("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long3 = user0.getGames();
    java.util.ArrayList<java.lang.Long> arraylist_long4 = user0.getInvitesReceived();
    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getFavoriteUsers();
    br.edu.ufcg.es.model.User user12 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long13 = user12.getGamesRequested();
    java.lang.Long[] long_array18 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long19 = new java.util.ArrayList<java.lang.Long>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long19, long_array18);
    user12.setInvitesReceived(arraylist_long19);
    user12.setAddress("");
    br.edu.ufcg.es.model.User user29 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long30 = user29.getGamesRequested();
    user12.setGames(arraylist_long30);
    user5.setGamesRequested(arraylist_long30);
    java.util.ArrayList<java.lang.Long> arraylist_long33 = user5.getGames();
    java.util.ArrayList<java.lang.Long> arraylist_long34 = user5.getGamesRequested();
    user0.setFavoriteUsers(arraylist_long34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long34);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "", "", "hi!");
    user5.setTimesRated(100);
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getMyGames();
    br.edu.ufcg.es.model.User user9 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user15 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game21 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array25 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long26 = new java.util.ArrayList<java.lang.Long>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long26, long_array25);
    game21.setGuestRequests(arraylist_long26);
    user15.setGames(arraylist_long26);
    user9.setMyGames(arraylist_long26);
    user9.setPhone("");
    br.edu.ufcg.es.model.User user38 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game44 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array48 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long49 = new java.util.ArrayList<java.lang.Long>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long49, long_array48);
    game44.setGuestRequests(arraylist_long49);
    user38.setGames(arraylist_long49);
    br.edu.ufcg.es.model.User user58 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long59 = user58.getGamesRequested();
    int i60 = user58.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long61 = user58.getFavoriteUsers();
    user38.setGames(arraylist_long61);
    user9.setMyGames(arraylist_long61);
    user5.setMyGames(arraylist_long61);
    java.lang.String str65 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "hi!"+ "'", str65.equals("hi!"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "", "", "hi!");
    java.lang.String str6 = user5.getName();
    br.edu.ufcg.es.model.User user12 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long13 = user12.getGamesRequested();
    int i14 = user12.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long15 = user12.getFavoriteUsers();
    user5.setInvitesReceived(arraylist_long15);
    java.lang.String str17 = user5.getPhone();
    java.util.ArrayList<java.lang.Long> arraylist_long18 = user5.getMyGames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long18);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setDescription("");
    java.lang.String str17 = game5.getSport();
    game5.setSport("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    java.lang.String str13 = game5.getDate();
    br.edu.ufcg.es.model.Game game19 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array23 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long24 = new java.util.ArrayList<java.lang.Long>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long24, long_array23);
    game19.setGuestRequests(arraylist_long24);
    java.lang.String str27 = game19.getDescription();
    java.util.ArrayList<java.lang.Long> arraylist_long28 = game19.getGuestsRequests();
    game5.setGuests(arraylist_long28);
    game5.setLocal("hi!");
    java.lang.String str32 = game5.getLocal();
    game5.setIdOwner((long)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getFavoriteUsers();
    br.edu.ufcg.es.model.User user14 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    user14.setGamesRequested(arraylist_long17);
    user5.setGames(arraylist_long17);
    user5.setPhone("hi!");
    user5.setPhone("hi!");
    br.edu.ufcg.es.model.User user30 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long31 = user30.getGamesRequested();
    int i32 = user30.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long33 = user30.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long34 = user30.getInvitesReceived();
    user5.setFavoriteUsers(arraylist_long34);
    br.edu.ufcg.es.model.Game game41 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array45 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long46 = new java.util.ArrayList<java.lang.Long>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long46, long_array45);
    game41.setGuestRequests(arraylist_long46);
    boolean b49 = game41.isFinished();
    game41.setId((long)'#');
    java.lang.String str52 = game41.getDate();
    br.edu.ufcg.es.model.User user58 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long59 = user58.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long60 = user58.getInvitesReceived();
    game41.setGuests(arraylist_long60);
    user5.setFavoriteUsers(arraylist_long60);
    java.lang.String str63 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!"+ "'", str52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + ""+ "'", str63.equals(""));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    java.lang.String str13 = game5.getDescription();
    java.util.ArrayList<java.lang.Long> arraylist_long14 = game5.getGuestsRequests();
    long long15 = game5.getIdOwner();
    java.lang.String str16 = game5.getName();
    java.lang.String str17 = game5.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setFavoriteUsers(arraylist_long5);
    float f8 = user0.getAbilityRating();
    float f9 = user0.getFairPlayRating();
    user0.setAbilityRating(1.0f);
    user0.setEmail("hi!");
    user0.setAbilityRating((float)(-1L));
    java.lang.String str16 = user0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getFavoriteUsers();
    java.lang.String str9 = user5.getAddress();
    br.edu.ufcg.es.model.User user10 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long11 = user10.getInvitesReceived();
    java.lang.Long long12 = user10.getId();
    br.edu.ufcg.es.model.User user13 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long14 = user13.getFavoriteUsers();
    br.edu.ufcg.es.model.User user20 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long21 = user20.getGamesRequested();
    java.lang.Long[] long_array26 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long27 = new java.util.ArrayList<java.lang.Long>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long27, long_array26);
    user20.setInvitesReceived(arraylist_long27);
    user20.setAddress("");
    br.edu.ufcg.es.model.User user37 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long38 = user37.getGamesRequested();
    user20.setGames(arraylist_long38);
    user13.setGamesRequested(arraylist_long38);
    user10.setGames(arraylist_long38);
    java.util.ArrayList<java.lang.Long> arraylist_long42 = user10.getInvitesReceived();
    java.lang.String str43 = user10.getAddress();
    user10.setAbilityRating((float)(short)100);
    br.edu.ufcg.es.model.User user51 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long52 = user51.getGamesRequested();
    java.lang.Long[] long_array57 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long58 = new java.util.ArrayList<java.lang.Long>();
    boolean b59 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long58, long_array57);
    user51.setInvitesReceived(arraylist_long58);
    java.lang.String str61 = user51.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long62 = user51.getFavoriteUsers();
    br.edu.ufcg.es.model.User user63 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long64 = user63.getFavoriteUsers();
    java.lang.Long[] long_array67 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long68 = new java.util.ArrayList<java.lang.Long>();
    boolean b69 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long68, long_array67);
    user63.setFavoriteUsers(arraylist_long68);
    user51.setInvitesReceived(arraylist_long68);
    java.util.ArrayList<java.lang.Long> arraylist_long72 = user51.getGamesRequested();
    user10.setInvitesReceived(arraylist_long72);
    user5.setGames(arraylist_long72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + ""+ "'", str61.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long72);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    user0.setId((java.lang.Long)1L);
    user0.setPhone("");

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    java.lang.String str15 = user5.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long16 = user5.getFavoriteUsers();
    java.lang.String str17 = user5.getPassword();
    user5.computeRating((float)'4', 100.0f);
    java.lang.Long long21 = user5.getId();
    user5.setId((java.lang.Long)0L);
    user5.setFairPlayRating((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long21);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    java.util.ArrayList<java.lang.Long> arraylist_long11 = user5.getGames();
    user5.setFairPlayRating(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long11);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    game5.setId((long)'#');
    java.lang.String str16 = game5.getDate();
    br.edu.ufcg.es.model.User user17 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long18 = user17.getFavoriteUsers();
    java.lang.Long[] long_array21 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long22 = new java.util.ArrayList<java.lang.Long>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long22, long_array21);
    user17.setFavoriteUsers(arraylist_long22);
    game5.setGuests(arraylist_long22);
    java.lang.String str26 = game5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    user0.setId((java.lang.Long)1L);
    java.lang.String str3 = user0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setFinished(true);
    java.lang.String str17 = game5.getLocal();
    java.lang.String str18 = game5.getLocal();
    br.edu.ufcg.es.model.User user24 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long25 = user24.getGamesRequested();
    java.lang.Long[] long_array30 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long31 = new java.util.ArrayList<java.lang.Long>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long31, long_array30);
    user24.setInvitesReceived(arraylist_long31);
    java.lang.String str34 = user24.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long35 = user24.getFavoriteUsers();
    br.edu.ufcg.es.model.User user36 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long37 = user36.getFavoriteUsers();
    java.lang.Long[] long_array40 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long41 = new java.util.ArrayList<java.lang.Long>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long41, long_array40);
    user36.setFavoriteUsers(arraylist_long41);
    user24.setInvitesReceived(arraylist_long41);
    br.edu.ufcg.es.model.User user50 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long51 = user50.getGamesRequested();
    int i52 = user50.getTimesRated();
    int i53 = user50.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long54 = user50.getMyGames();
    user24.setInvitesReceived(arraylist_long54);
    game5.setGuestRequests(arraylist_long54);
    game5.setName("");
    java.lang.String str59 = game5.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!"+ "'", str59.equals("hi!"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    java.lang.String str13 = game5.getDescription();
    java.util.ArrayList<java.lang.Long> arraylist_long14 = game5.getGuestsRequests();
    game5.setName("");
    game5.setSport("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long14);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long26 = user25.getGamesRequested();
    int i27 = user25.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user25.getFavoriteUsers();
    user5.setGames(arraylist_long28);
    java.lang.String str30 = user5.getName();
    user5.setPassword("");
    user5.setTimesRated((int)(byte)100);
    float f35 = user5.getAbilityRating();
    user5.setAbilityRating((float)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f35 == 0.0f);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "hi!", "");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    game5.setDate("");
    boolean b16 = game5.isFinished();
    br.edu.ufcg.es.model.User user22 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long23 = user22.getGamesRequested();
    java.lang.Long[] long_array28 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long29 = new java.util.ArrayList<java.lang.Long>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long29, long_array28);
    user22.setInvitesReceived(arraylist_long29);
    user22.setAddress("");
    float f34 = user22.getAbilityRating();
    user22.setPassword("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long37 = user22.getInvitesReceived();
    java.util.ArrayList<java.lang.Long> arraylist_long38 = user22.getGamesRequested();
    game5.setGuests(arraylist_long38);
    java.util.ArrayList<java.lang.Long> arraylist_long40 = game5.getGuests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f34 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long40);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long long2 = user0.getId();
    br.edu.ufcg.es.model.User user3 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long4 = user3.getFavoriteUsers();
    br.edu.ufcg.es.model.User user10 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long11 = user10.getGamesRequested();
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    user10.setInvitesReceived(arraylist_long17);
    user10.setAddress("");
    br.edu.ufcg.es.model.User user27 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user27.getGamesRequested();
    user10.setGames(arraylist_long28);
    user3.setGamesRequested(arraylist_long28);
    user0.setGames(arraylist_long28);
    user0.setName("");
    user0.setFairPlayRating((float)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    game5.setId((long)'#');
    br.edu.ufcg.es.model.User user21 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long22 = user21.getGamesRequested();
    java.lang.Long[] long_array27 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long28 = new java.util.ArrayList<java.lang.Long>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long28, long_array27);
    user21.setInvitesReceived(arraylist_long28);
    game5.setGuestRequests(arraylist_long28);
    java.lang.String str32 = game5.getDescription();
    br.edu.ufcg.es.model.Game game38 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game38.setDate("hi!");
    game38.setSport("");
    game38.setDate("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long45 = game38.getGuests();
    game5.setGuestRequests(arraylist_long45);
    boolean b47 = game5.isFinished();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.util.ArrayList<java.lang.Long> arraylist_long2 = null;
    user0.setGamesRequested(arraylist_long2);
    java.util.ArrayList<java.lang.Long> arraylist_long4 = null;
    user0.setMyGames(arraylist_long4);
    user0.setFairPlayRating(52.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    game5.setId((long)'#');
    java.util.ArrayList<java.lang.Long> arraylist_long16 = game5.getGuests();
    java.lang.String str17 = game5.getSport();
    game5.setLocal("");
    game5.setIdOwner((long)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getPassword();
    java.lang.String str8 = user5.getPassword();
    float f9 = user5.getFairPlayRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == 0.0f);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    boolean b14 = game5.isFinished();
    game5.setFinished(false);
    boolean b17 = game5.isFinished();
    game5.setDescription("");
    game5.setIdOwner(100L);
    java.lang.String str22 = game5.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long26 = user25.getGamesRequested();
    int i27 = user25.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user25.getFavoriteUsers();
    user5.setGames(arraylist_long28);
    java.lang.String str30 = user5.getName();
    user5.setAbilityRating((float)0L);
    user5.setEmail("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long35 = user5.getFavoriteUsers();
    float f36 = user5.getAbilityRating();
    java.lang.String str37 = user5.getPhone();
    user5.setPhone("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f36 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + ""+ "'", str37.equals(""));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }

    br.edu.ufcg.es.model.Game game0 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = game0.getGuests();
    br.edu.ufcg.es.model.User user7 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game13 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array17 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long18 = new java.util.ArrayList<java.lang.Long>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long18, long_array17);
    game13.setGuestRequests(arraylist_long18);
    user7.setGames(arraylist_long18);
    java.util.ArrayList<java.lang.Long> arraylist_long22 = user7.getMyGames();
    game0.setGuestRequests(arraylist_long22);
    game0.setSport("hi!");
    java.lang.String str26 = game0.getSport();
    game0.setFinished(false);
    game0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long long2 = user0.getId();
    br.edu.ufcg.es.model.User user3 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long4 = user3.getFavoriteUsers();
    br.edu.ufcg.es.model.User user10 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long11 = user10.getGamesRequested();
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    user10.setInvitesReceived(arraylist_long17);
    user10.setAddress("");
    br.edu.ufcg.es.model.User user27 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user27.getGamesRequested();
    user10.setGames(arraylist_long28);
    user3.setGamesRequested(arraylist_long28);
    user0.setGames(arraylist_long28);
    java.util.ArrayList<java.lang.Long> arraylist_long32 = user0.getInvitesReceived();
    java.lang.String str33 = user0.getAddress();
    user0.setAbilityRating((float)(short)100);
    java.lang.String str36 = user0.getPhone();
    br.edu.ufcg.es.model.User user42 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long43 = user42.getGamesRequested();
    java.lang.Long[] long_array48 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long49 = new java.util.ArrayList<java.lang.Long>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long49, long_array48);
    user42.setInvitesReceived(arraylist_long49);
    user42.setAddress("");
    user42.setEmail("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long56 = user42.getGames();
    user0.setInvitesReceived(arraylist_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long56);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((-1L));
    game5.setId(10L);
    long long17 = game5.getId();
    game5.setId(10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 10L);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }

    br.edu.ufcg.es.model.Game game0 = new br.edu.ufcg.es.model.Game();
    game0.setId((long)' ');
    java.lang.String str3 = game0.getDescription();
    boolean b4 = game0.isFinished();
    java.lang.String str5 = game0.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setFavoriteUsers(arraylist_long5);
    float f8 = user0.getAbilityRating();
    float f9 = user0.getFairPlayRating();
    user0.setAbilityRating(1.0f);
    user0.setEmail("hi!");
    br.edu.ufcg.es.model.User user19 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array21 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long22 = new java.util.ArrayList<java.lang.Long>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long22, long_array21);
    user19.setGamesRequested(arraylist_long22);
    user19.setTimesRated((int)(byte)-1);
    java.lang.String str27 = user19.getEmail();
    br.edu.ufcg.es.model.User user33 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long34 = user33.getGamesRequested();
    int i35 = user33.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long36 = user33.getFavoriteUsers();
    user33.setFairPlayRating((float)(-1));
    float f39 = user33.getAbilityRating();
    int i40 = user33.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long41 = user33.getGames();
    user19.setGamesRequested(arraylist_long41);
    user0.setMyGames(arraylist_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f39 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long41);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    boolean b14 = game5.isFinished();
    game5.setSport("");
    java.lang.String str17 = game5.getDate();
    java.lang.String str18 = game5.getDescription();
    boolean b19 = game5.isFinished();
    java.lang.String str20 = game5.getDate();
    game5.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "hi!", "", "", "");
    game5.setSport("");

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setFinished(true);
    java.lang.String str17 = game5.getLocal();
    java.lang.String str18 = game5.getLocal();
    br.edu.ufcg.es.model.User user24 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long25 = user24.getGamesRequested();
    java.lang.Long[] long_array30 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long31 = new java.util.ArrayList<java.lang.Long>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long31, long_array30);
    user24.setInvitesReceived(arraylist_long31);
    java.lang.String str34 = user24.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long35 = user24.getFavoriteUsers();
    br.edu.ufcg.es.model.User user36 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long37 = user36.getFavoriteUsers();
    java.lang.Long[] long_array40 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long41 = new java.util.ArrayList<java.lang.Long>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long41, long_array40);
    user36.setFavoriteUsers(arraylist_long41);
    user24.setInvitesReceived(arraylist_long41);
    br.edu.ufcg.es.model.User user50 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long51 = user50.getGamesRequested();
    int i52 = user50.getTimesRated();
    int i53 = user50.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long54 = user50.getMyGames();
    user24.setInvitesReceived(arraylist_long54);
    game5.setGuestRequests(arraylist_long54);
    br.edu.ufcg.es.model.User user62 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long63 = user62.getGamesRequested();
    int i64 = user62.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long65 = user62.getFavoriteUsers();
    br.edu.ufcg.es.model.User user71 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array73 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long74 = new java.util.ArrayList<java.lang.Long>();
    boolean b75 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long74, long_array73);
    user71.setGamesRequested(arraylist_long74);
    user62.setGames(arraylist_long74);
    user62.setPhone("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long80 = user62.getGamesRequested();
    game5.setGuests(arraylist_long80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long80);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getMyGames();
    br.edu.ufcg.es.model.Game game14 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array18 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long19 = new java.util.ArrayList<java.lang.Long>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long19, long_array18);
    game14.setGuestRequests(arraylist_long19);
    boolean b22 = game14.isFinished();
    game14.setId((long)'#');
    br.edu.ufcg.es.model.User user30 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long31 = user30.getGamesRequested();
    java.lang.Long[] long_array36 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long37 = new java.util.ArrayList<java.lang.Long>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long37, long_array36);
    user30.setInvitesReceived(arraylist_long37);
    game14.setGuestRequests(arraylist_long37);
    java.util.ArrayList<java.lang.Long> arraylist_long41 = game14.getGuests();
    user5.setGamesRequested(arraylist_long41);
    user5.setEmail("");
    float f45 = user5.getFairPlayRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f45 == 0.0f);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setLocal("hi!");
    game5.setId((long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    java.lang.String str8 = user5.getPassword();
    user5.setId((java.lang.Long)100L);
    java.lang.String str11 = user5.getPassword();
    java.util.ArrayList<java.lang.Long> arraylist_long12 = user5.getGames();
    user5.computeRating((float)'a', (float)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long12);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setFinished(false);
    game5.setSport("");
    br.edu.ufcg.es.model.Game game24 = new br.edu.ufcg.es.model.Game("", "hi!", "hi!", "", "");
    br.edu.ufcg.es.model.User user30 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long31 = user30.getGamesRequested();
    int i32 = user30.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long33 = user30.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long34 = user30.getInvitesReceived();
    java.util.ArrayList<java.lang.Long> arraylist_long35 = user30.getGamesRequested();
    game24.setGuestRequests(arraylist_long35);
    game5.setGuests(arraylist_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long35);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    int i8 = user5.getTimesRated();
    user5.setAddress("");
    java.lang.String str11 = user5.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    java.util.ArrayList<java.lang.Long> arraylist_long15 = user5.getInvitesReceived();
    java.util.ArrayList<java.lang.Long> arraylist_long16 = user5.getInvitesReceived();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long16);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setDescription("");
    java.util.ArrayList<java.lang.Long> arraylist_long10 = game5.getGuests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long10);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "hi!", "", "", "hi!");
    game5.setIdOwner((long)10);
    game5.setDescription("hi!");
    game5.setFinished(false);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long26 = user25.getGamesRequested();
    int i27 = user25.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user25.getFavoriteUsers();
    user5.setGames(arraylist_long28);
    java.lang.String str30 = user5.getName();
    br.edu.ufcg.es.model.Game game36 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array40 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long41 = new java.util.ArrayList<java.lang.Long>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long41, long_array40);
    game36.setGuestRequests(arraylist_long41);
    boolean b44 = game36.isFinished();
    game36.setId((long)'#');
    java.lang.String str47 = game36.getDate();
    br.edu.ufcg.es.model.User user53 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long54 = user53.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long55 = user53.getInvitesReceived();
    game36.setGuests(arraylist_long55);
    user5.setFavoriteUsers(arraylist_long55);
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!"+ "'", str47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long55);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setSport("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long9 = game5.getGuestsRequests();
    br.edu.ufcg.es.model.User user10 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user16 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game22 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array26 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long27 = new java.util.ArrayList<java.lang.Long>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long27, long_array26);
    game22.setGuestRequests(arraylist_long27);
    user16.setGames(arraylist_long27);
    user10.setMyGames(arraylist_long27);
    user10.setPhone("");
    br.edu.ufcg.es.model.User user39 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game45 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array49 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long50 = new java.util.ArrayList<java.lang.Long>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long50, long_array49);
    game45.setGuestRequests(arraylist_long50);
    user39.setGames(arraylist_long50);
    br.edu.ufcg.es.model.User user59 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long60 = user59.getGamesRequested();
    int i61 = user59.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long62 = user59.getFavoriteUsers();
    user39.setGames(arraylist_long62);
    user10.setMyGames(arraylist_long62);
    game5.setGuestRequests(arraylist_long62);
    game5.setIdOwner((long)(-1));
    long long68 = game5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long68 == 0L);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }

    br.edu.ufcg.es.model.Game game0 = new br.edu.ufcg.es.model.Game();
    game0.setSport("hi!");
    game0.setName("hi!");

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    user5.setPassword("hi!");
    user5.setAddress("hi!");
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("hi!", "hi!", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getFavoriteUsers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    int i11 = user5.getTimesRated();
    java.lang.String str12 = user5.getPhone();
    java.util.ArrayList<java.lang.Long> arraylist_long13 = user5.getMyGames();
    user5.setId((java.lang.Long)10L);
    int i16 = user5.getTimesRated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test209"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    user0.setEmail("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long3 = user0.getGames();
    java.util.ArrayList<java.lang.Long> arraylist_long4 = user0.getInvitesReceived();
    user0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long4);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test210"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "", "", "hi!", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = game5.getGuestsRequests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test211"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "hi!", "hi!", "hi!");
    br.edu.ufcg.es.model.User user11 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game17 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array21 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long22 = new java.util.ArrayList<java.lang.Long>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long22, long_array21);
    game17.setGuestRequests(arraylist_long22);
    user11.setGames(arraylist_long22);
    br.edu.ufcg.es.model.User user31 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long32 = user31.getGamesRequested();
    int i33 = user31.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long34 = user31.getFavoriteUsers();
    user11.setGames(arraylist_long34);
    java.lang.String str36 = user11.getName();
    user11.setAbilityRating((float)0L);
    user11.setEmail("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long41 = user11.getFavoriteUsers();
    user5.setInvitesReceived(arraylist_long41);
    user5.setPhone("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long45 = user5.getFavoriteUsers();
    br.edu.ufcg.es.model.Game game51 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array55 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long56 = new java.util.ArrayList<java.lang.Long>();
    boolean b57 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long56, long_array55);
    game51.setGuestRequests(arraylist_long56);
    boolean b59 = game51.isFinished();
    boolean b60 = game51.isFinished();
    br.edu.ufcg.es.model.User user61 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long62 = user61.getFavoriteUsers();
    br.edu.ufcg.es.model.Game game63 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long64 = game63.getGuests();
    br.edu.ufcg.es.model.User user70 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game76 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array80 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long81 = new java.util.ArrayList<java.lang.Long>();
    boolean b82 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long81, long_array80);
    game76.setGuestRequests(arraylist_long81);
    user70.setGames(arraylist_long81);
    java.util.ArrayList<java.lang.Long> arraylist_long85 = user70.getMyGames();
    game63.setGuestRequests(arraylist_long85);
    user61.setGames(arraylist_long85);
    game51.setGuestRequests(arraylist_long85);
    user5.setFavoriteUsers(arraylist_long85);
    user5.setTimesRated((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long85);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test212"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    java.lang.String str8 = game5.getSport();
    long long9 = game5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test213"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setDescription("");
    java.util.ArrayList<java.lang.Long> arraylist_long17 = null;
    game5.setGuests(arraylist_long17);
    long long19 = game5.getId();
    game5.setDate("hi!");
    java.lang.String str22 = game5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test214"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    long long14 = game5.getIdOwner();
    game5.setDate("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test215"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setFavoriteUsers(arraylist_long5);
    br.edu.ufcg.es.model.User user8 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user8.getFavoriteUsers();
    java.lang.Long[] long_array12 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long13 = new java.util.ArrayList<java.lang.Long>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long13, long_array12);
    user8.setFavoriteUsers(arraylist_long13);
    user0.setFavoriteUsers(arraylist_long13);
    java.util.ArrayList<java.lang.Long> arraylist_long17 = user0.getInvitesReceived();
    user0.setFairPlayRating((float)'#');
    int i20 = user0.getTimesRated();
    java.lang.String str21 = user0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test216"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    int i11 = user5.getTimesRated();
    user5.setPassword("hi!");
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test217"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getGamesRequested();
    java.lang.String str9 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test218"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setFinished(true);
    java.lang.String str17 = game5.getLocal();
    java.lang.String str18 = game5.getLocal();
    java.lang.String str19 = game5.getSport();
    game5.setLocal("hi!");
    game5.setName("hi!");
    br.edu.ufcg.es.model.User user29 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array31 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long32 = new java.util.ArrayList<java.lang.Long>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long32, long_array31);
    user29.setGamesRequested(arraylist_long32);
    int i35 = user29.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long36 = user29.getFavoriteUsers();
    game5.setGuests(arraylist_long36);
    game5.setDate("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long36);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test219"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setFavoriteUsers(arraylist_long5);
    br.edu.ufcg.es.model.User user8 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user8.getFavoriteUsers();
    java.lang.Long[] long_array12 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long13 = new java.util.ArrayList<java.lang.Long>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long13, long_array12);
    user8.setFavoriteUsers(arraylist_long13);
    user0.setFavoriteUsers(arraylist_long13);
    java.util.ArrayList<java.lang.Long> arraylist_long17 = user0.getGamesRequested();
    float f18 = user0.getAbilityRating();
    int i19 = user0.getTimesRated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f18 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test220"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setSport("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long9 = game5.getGuestsRequests();
    br.edu.ufcg.es.model.User user10 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user16 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game22 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array26 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long27 = new java.util.ArrayList<java.lang.Long>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long27, long_array26);
    game22.setGuestRequests(arraylist_long27);
    user16.setGames(arraylist_long27);
    user10.setMyGames(arraylist_long27);
    user10.setPhone("");
    br.edu.ufcg.es.model.User user39 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game45 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array49 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long50 = new java.util.ArrayList<java.lang.Long>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long50, long_array49);
    game45.setGuestRequests(arraylist_long50);
    user39.setGames(arraylist_long50);
    br.edu.ufcg.es.model.User user59 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long60 = user59.getGamesRequested();
    int i61 = user59.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long62 = user59.getFavoriteUsers();
    user39.setGames(arraylist_long62);
    user10.setMyGames(arraylist_long62);
    game5.setGuestRequests(arraylist_long62);
    game5.setIdOwner((long)(-1));
    game5.setIdOwner((-1L));
    boolean b70 = game5.isFinished();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test221"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    float f8 = user5.getAbilityRating();
    user5.setPassword("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long11 = user5.getGames();
    java.util.ArrayList<java.lang.Long> arraylist_long12 = user5.getInvitesReceived();
    java.util.ArrayList<java.lang.Long> arraylist_long13 = user5.getGames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long13);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test222"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    game5.setId((long)'#');
    java.lang.String str16 = game5.getDate();
    br.edu.ufcg.es.model.User user17 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long18 = user17.getFavoriteUsers();
    java.lang.Long[] long_array21 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long22 = new java.util.ArrayList<java.lang.Long>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long22, long_array21);
    user17.setFavoriteUsers(arraylist_long22);
    game5.setGuests(arraylist_long22);
    java.lang.String str26 = game5.getDate();
    game5.setSport("hi!");
    game5.setName("");
    long long31 = game5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long31 == 35L);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test223"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    int i8 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user5.getMyGames();
    user5.setAddress("");
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long9);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test224"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setFinished(true);
    java.lang.String str17 = game5.getLocal();
    java.lang.String str18 = game5.getLocal();
    br.edu.ufcg.es.model.User user24 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long25 = user24.getGamesRequested();
    java.lang.Long[] long_array30 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long31 = new java.util.ArrayList<java.lang.Long>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long31, long_array30);
    user24.setInvitesReceived(arraylist_long31);
    java.lang.String str34 = user24.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long35 = user24.getFavoriteUsers();
    br.edu.ufcg.es.model.User user36 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long37 = user36.getFavoriteUsers();
    java.lang.Long[] long_array40 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long41 = new java.util.ArrayList<java.lang.Long>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long41, long_array40);
    user36.setFavoriteUsers(arraylist_long41);
    user24.setInvitesReceived(arraylist_long41);
    br.edu.ufcg.es.model.User user50 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long51 = user50.getGamesRequested();
    int i52 = user50.getTimesRated();
    int i53 = user50.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long54 = user50.getMyGames();
    user24.setInvitesReceived(arraylist_long54);
    game5.setGuestRequests(arraylist_long54);
    game5.setSport("");
    game5.setName("");
    game5.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long54);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test225"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    user5.setTimesRated((int)(byte)-1);
    java.lang.String str13 = user5.getEmail();
    user5.setPassword("");
    int i16 = user5.getTimesRated();
    br.edu.ufcg.es.model.User user17 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long18 = null;
    user17.setGames(arraylist_long18);
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game31 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array35 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long36 = new java.util.ArrayList<java.lang.Long>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long36, long_array35);
    game31.setGuestRequests(arraylist_long36);
    user25.setGames(arraylist_long36);
    java.util.ArrayList<java.lang.Long> arraylist_long40 = user25.getMyGames();
    user17.setGames(arraylist_long40);
    user5.setGamesRequested(arraylist_long40);
    user5.setAbilityRating((float)52L);
    user5.setName("");
    user5.setPhone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long40);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test226"); }

    br.edu.ufcg.es.model.Game game0 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = game0.getGuests();
    br.edu.ufcg.es.model.User user7 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game13 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array17 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long18 = new java.util.ArrayList<java.lang.Long>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long18, long_array17);
    game13.setGuestRequests(arraylist_long18);
    user7.setGames(arraylist_long18);
    java.util.ArrayList<java.lang.Long> arraylist_long22 = user7.getMyGames();
    game0.setGuestRequests(arraylist_long22);
    game0.setSport("hi!");
    game0.setSport("hi!");
    java.lang.String str28 = game0.getDate();
    br.edu.ufcg.es.model.Game game29 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long30 = game29.getGuests();
    br.edu.ufcg.es.model.User user36 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game42 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array46 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long47 = new java.util.ArrayList<java.lang.Long>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long47, long_array46);
    game42.setGuestRequests(arraylist_long47);
    user36.setGames(arraylist_long47);
    java.util.ArrayList<java.lang.Long> arraylist_long51 = user36.getMyGames();
    game29.setGuestRequests(arraylist_long51);
    game0.setGuests(arraylist_long51);
    br.edu.ufcg.es.model.User user59 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game65 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array69 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long70 = new java.util.ArrayList<java.lang.Long>();
    boolean b71 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long70, long_array69);
    game65.setGuestRequests(arraylist_long70);
    user59.setGames(arraylist_long70);
    java.util.ArrayList<java.lang.Long> arraylist_long74 = user59.getMyGames();
    game0.setGuests(arraylist_long74);
    java.util.ArrayList<java.lang.Long> arraylist_long76 = game0.getGuestsRequests();
    long long77 = game0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long77 == 0L);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test227"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("hi!", "hi!", "", "", "");
    user5.computeRating(0.0f, 0.0f);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test228"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getFavoriteUsers();
    user5.setFairPlayRating((float)(-1));
    float f11 = user5.getAbilityRating();
    int i12 = user5.getTimesRated();
    java.lang.String str13 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test229"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setDate("hi!");
    game5.setLocal("hi!");
    game5.setName("hi!");
    java.lang.String str12 = game5.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test230"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    br.edu.ufcg.es.model.User user2 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = user2.getInvitesReceived();
    java.lang.Long[] long_array6 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long7 = new java.util.ArrayList<java.lang.Long>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long7, long_array6);
    user2.setGamesRequested(arraylist_long7);
    user0.setGamesRequested(arraylist_long7);
    java.util.ArrayList<java.lang.Long> arraylist_long11 = user0.getGames();
    float f12 = user0.getAbilityRating();
    java.lang.String str13 = user0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f12 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test231"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getFavoriteUsers();
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getAddress();
    float f11 = user5.getAbilityRating();
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 0.0f);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test232"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    boolean b14 = game5.isFinished();
    game5.setSport("");
    java.lang.String str17 = game5.getDate();
    game5.setDate("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test233"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long26 = user25.getGamesRequested();
    int i27 = user25.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user25.getFavoriteUsers();
    user5.setGames(arraylist_long28);
    java.lang.String str30 = user5.getName();
    user5.setPassword("");
    user5.setTimesRated((int)(byte)100);
    java.util.ArrayList<java.lang.Long> arraylist_long35 = user5.getGames();
    user5.setEmail("hi!");
    int i38 = user5.getTimesRated();
    int i39 = user5.getTimesRated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 100);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test234"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user6 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game12 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    game12.setGuestRequests(arraylist_long17);
    user6.setGames(arraylist_long17);
    user0.setMyGames(arraylist_long17);
    user0.setPhone("");
    java.lang.String str24 = user0.getPassword();
    float f25 = user0.getFairPlayRating();
    user0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f25 == 0.0f);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test235"); }

    br.edu.ufcg.es.model.Game game0 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = game0.getGuests();
    br.edu.ufcg.es.model.User user7 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game13 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array17 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long18 = new java.util.ArrayList<java.lang.Long>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long18, long_array17);
    game13.setGuestRequests(arraylist_long18);
    user7.setGames(arraylist_long18);
    java.util.ArrayList<java.lang.Long> arraylist_long22 = user7.getMyGames();
    game0.setGuestRequests(arraylist_long22);
    game0.setSport("hi!");
    java.lang.String str26 = game0.getDescription();
    java.util.ArrayList<java.lang.Long> arraylist_long27 = game0.getGuestsRequests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long27);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test236"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    user5.setFairPlayRating((float)(byte)1);
    java.util.ArrayList<java.lang.Long> arraylist_long10 = user5.getFavoriteUsers();
    java.lang.String str11 = user5.getPassword();
    br.edu.ufcg.es.model.User user17 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long18 = user17.getGamesRequested();
    java.lang.String str19 = user17.getPassword();
    java.util.ArrayList<java.lang.Long> arraylist_long20 = user17.getFavoriteUsers();
    java.util.ArrayList<java.lang.Long> arraylist_long21 = user17.getGames();
    float f22 = user17.getFairPlayRating();
    user17.setPhone("");
    java.util.ArrayList<java.lang.Long> arraylist_long25 = user17.getMyGames();
    user5.setFavoriteUsers(arraylist_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f22 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long25);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test237"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    int i11 = user5.getTimesRated();
    user5.setAbilityRating(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test238"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setName("hi!");
    game5.setId((long)'#');
    long long17 = game5.getId();
    game5.setDescription("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long20 = game5.getGuestsRequests();
    br.edu.ufcg.es.model.Game game26 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array30 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long31 = new java.util.ArrayList<java.lang.Long>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long31, long_array30);
    game26.setGuestRequests(arraylist_long31);
    br.edu.ufcg.es.model.Game game39 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array43 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long44 = new java.util.ArrayList<java.lang.Long>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long44, long_array43);
    game39.setGuestRequests(arraylist_long44);
    java.lang.String str47 = game39.getDate();
    java.util.ArrayList<java.lang.Long> arraylist_long48 = game39.getGuestsRequests();
    game26.setGuestRequests(arraylist_long48);
    game5.setGuests(arraylist_long48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!"+ "'", str47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long48);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test239"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setDate("hi!");
    game5.setSport("");
    game5.setDate("hi!");
    game5.setFinished(false);
    game5.setSport("");
    java.lang.String str16 = game5.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test240"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setDate("hi!");
    game5.setSport("");
    game5.setDate("hi!");
    game5.setFinished(false);
    game5.setSport("");
    java.lang.String str16 = game5.getDescription();
    java.util.ArrayList<java.lang.Long> arraylist_long17 = game5.getGuestsRequests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long17);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test241"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "", "", "hi!", "hi!");
    game5.setFinished(true);
    game5.setId((long)(short)100);
    br.edu.ufcg.es.model.User user15 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game21 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array25 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long26 = new java.util.ArrayList<java.lang.Long>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long26, long_array25);
    game21.setGuestRequests(arraylist_long26);
    user15.setGames(arraylist_long26);
    java.util.ArrayList<java.lang.Long> arraylist_long30 = user15.getGamesRequested();
    game5.setGuestRequests(arraylist_long30);
    game5.setFinished(true);
    boolean b34 = game5.isFinished();
    long long35 = game5.getIdOwner();
    br.edu.ufcg.es.model.User user41 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array43 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long44 = new java.util.ArrayList<java.lang.Long>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long44, long_array43);
    user41.setGamesRequested(arraylist_long44);
    user41.setTimesRated((int)(byte)-1);
    java.util.ArrayList<java.lang.Long> arraylist_long49 = user41.getGames();
    game5.setGuests(arraylist_long49);
    game5.setId(100L);
    game5.setSport("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long35 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long49);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test242"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getFavoriteUsers();
    user5.setFairPlayRating((float)(-1));
    float f11 = user5.getAbilityRating();
    int i12 = user5.getTimesRated();
    br.edu.ufcg.es.model.User user18 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long19 = user18.getGamesRequested();
    java.lang.String str20 = user18.getEmail();
    int i21 = user18.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long22 = user18.getFavoriteUsers();
    user18.setTimesRated((int)(byte)1);
    java.lang.String str25 = user18.getPhone();
    user18.setAddress("hi!");
    br.edu.ufcg.es.model.User user28 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long29 = user28.getInvitesReceived();
    java.lang.Long long30 = user28.getId();
    br.edu.ufcg.es.model.User user31 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long32 = user31.getFavoriteUsers();
    br.edu.ufcg.es.model.User user38 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long39 = user38.getGamesRequested();
    java.lang.Long[] long_array44 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long45 = new java.util.ArrayList<java.lang.Long>();
    boolean b46 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long45, long_array44);
    user38.setInvitesReceived(arraylist_long45);
    user38.setAddress("");
    br.edu.ufcg.es.model.User user55 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long56 = user55.getGamesRequested();
    user38.setGames(arraylist_long56);
    user31.setGamesRequested(arraylist_long56);
    user28.setGames(arraylist_long56);
    br.edu.ufcg.es.model.User user65 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long66 = user65.getGamesRequested();
    java.lang.String str67 = user65.getEmail();
    user65.setFairPlayRating((float)(byte)1);
    java.util.ArrayList<java.lang.Long> arraylist_long70 = null;
    user65.setGamesRequested(arraylist_long70);
    java.util.ArrayList<java.lang.Long> arraylist_long72 = user65.getInvitesReceived();
    user28.setMyGames(arraylist_long72);
    user18.setMyGames(arraylist_long72);
    user5.setInvitesReceived(arraylist_long72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + ""+ "'", str67.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long72);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test243"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    int i8 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user5.getFavoriteUsers();
    user5.setTimesRated((int)(byte)1);
    java.lang.String str12 = user5.getPhone();
    java.lang.String str13 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test244"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    br.edu.ufcg.es.model.Game game2 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = game2.getGuests();
    br.edu.ufcg.es.model.User user9 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game15 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array19 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long20 = new java.util.ArrayList<java.lang.Long>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long20, long_array19);
    game15.setGuestRequests(arraylist_long20);
    user9.setGames(arraylist_long20);
    java.util.ArrayList<java.lang.Long> arraylist_long24 = user9.getMyGames();
    game2.setGuestRequests(arraylist_long24);
    user0.setGames(arraylist_long24);
    user0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long24);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test245"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getFavoriteUsers();
    user5.setFairPlayRating((float)(-1));
    br.edu.ufcg.es.model.User user16 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game22 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array26 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long27 = new java.util.ArrayList<java.lang.Long>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long27, long_array26);
    game22.setGuestRequests(arraylist_long27);
    user16.setGames(arraylist_long27);
    br.edu.ufcg.es.model.User user36 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long37 = user36.getGamesRequested();
    int i38 = user36.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long39 = user36.getFavoriteUsers();
    user16.setGames(arraylist_long39);
    java.lang.String str41 = user16.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long42 = user16.getGamesRequested();
    user5.setFavoriteUsers(arraylist_long42);
    br.edu.ufcg.es.model.Game game49 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array53 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long54 = new java.util.ArrayList<java.lang.Long>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long54, long_array53);
    game49.setGuestRequests(arraylist_long54);
    boolean b57 = game49.isFinished();
    game49.setId((long)'#');
    java.lang.String str60 = game49.getDate();
    br.edu.ufcg.es.model.User user61 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long62 = user61.getFavoriteUsers();
    java.lang.Long[] long_array65 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long66 = new java.util.ArrayList<java.lang.Long>();
    boolean b67 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long66, long_array65);
    user61.setFavoriteUsers(arraylist_long66);
    game49.setGuests(arraylist_long66);
    java.lang.String str70 = game49.getDate();
    game49.setSport("hi!");
    br.edu.ufcg.es.model.User user78 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long79 = user78.getGamesRequested();
    java.lang.String str80 = user78.getEmail();
    int i81 = user78.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long82 = user78.getGames();
    game49.setGuestRequests(arraylist_long82);
    user5.setMyGames(arraylist_long82);
    br.edu.ufcg.es.model.User user90 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long91 = user90.getGamesRequested();
    java.lang.String str92 = user90.getPassword();
    java.util.ArrayList<java.lang.Long> arraylist_long93 = user90.getFavoriteUsers();
    user5.setGamesRequested(arraylist_long93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + ""+ "'", str41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!"+ "'", str60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "hi!"+ "'", str70.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + ""+ "'", str80.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str92 + "' != '" + ""+ "'", str92.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long93);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test246"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setFavoriteUsers(arraylist_long5);
    br.edu.ufcg.es.model.User user8 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user8.getFavoriteUsers();
    java.lang.Long[] long_array12 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long13 = new java.util.ArrayList<java.lang.Long>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long13, long_array12);
    user8.setFavoriteUsers(arraylist_long13);
    user0.setFavoriteUsers(arraylist_long13);
    java.lang.String str17 = user0.getAddress();
    java.util.ArrayList<java.lang.Long> arraylist_long18 = user0.getFavoriteUsers();
    user0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long18);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test247"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setDate("");
    game5.setIdOwner(0L);
    java.lang.String str12 = game5.getName();
    br.edu.ufcg.es.model.Game game18 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array22 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long23 = new java.util.ArrayList<java.lang.Long>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long23, long_array22);
    game18.setGuestRequests(arraylist_long23);
    boolean b26 = game18.isFinished();
    game18.setId((long)'#');
    br.edu.ufcg.es.model.User user34 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long35 = user34.getGamesRequested();
    java.lang.Long[] long_array40 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long41 = new java.util.ArrayList<java.lang.Long>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long41, long_array40);
    user34.setInvitesReceived(arraylist_long41);
    game18.setGuestRequests(arraylist_long41);
    game5.setGuests(arraylist_long41);
    java.lang.String str46 = game5.getLocal();
    game5.setLocal("hi!");
    java.lang.String str49 = game5.getSport();
    java.lang.String str50 = game5.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + ""+ "'", str46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ""+ "'", str49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + ""+ "'", str50.equals(""));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test248"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    java.lang.String str13 = game5.getDescription();
    java.lang.String str14 = game5.getName();
    game5.setIdOwner(0L);
    java.lang.String str17 = game5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test249"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setGamesRequested(arraylist_long5);
    float f8 = user0.getFairPlayRating();
    int i9 = user0.getTimesRated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test250"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "hi!", "", "hi!", "");
    java.lang.String str6 = game5.getDescription();
    game5.setFinished(false);
    game5.setSport("");
    game5.setLocal("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test251"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long long2 = user0.getId();
    br.edu.ufcg.es.model.User user3 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long4 = user3.getFavoriteUsers();
    br.edu.ufcg.es.model.User user10 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long11 = user10.getGamesRequested();
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    user10.setInvitesReceived(arraylist_long17);
    user10.setAddress("");
    br.edu.ufcg.es.model.User user27 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user27.getGamesRequested();
    user10.setGames(arraylist_long28);
    user3.setGamesRequested(arraylist_long28);
    user0.setGames(arraylist_long28);
    java.util.ArrayList<java.lang.Long> arraylist_long32 = user0.getFavoriteUsers();
    user0.setAddress("");
    java.util.ArrayList<java.lang.Long> arraylist_long35 = user0.getMyGames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long35);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test252"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "", "", "hi!");
    java.lang.String str6 = user5.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getMyGames();
    user5.setTimesRated((-1));
    br.edu.ufcg.es.model.Game game15 = new br.edu.ufcg.es.model.Game("", "", "", "hi!", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long16 = game15.getGuests();
    user5.setGames(arraylist_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long16);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test253"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user6 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game12 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    game12.setGuestRequests(arraylist_long17);
    user6.setGames(arraylist_long17);
    user0.setMyGames(arraylist_long17);
    user0.setName("");
    java.lang.Long long24 = user0.getId();
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long26 = user25.getFavoriteUsers();
    br.edu.ufcg.es.model.User user32 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long33 = user32.getGamesRequested();
    java.lang.Long[] long_array38 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long39 = new java.util.ArrayList<java.lang.Long>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long39, long_array38);
    user32.setInvitesReceived(arraylist_long39);
    user32.setAddress("");
    br.edu.ufcg.es.model.User user49 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long50 = user49.getGamesRequested();
    user32.setGames(arraylist_long50);
    user25.setGamesRequested(arraylist_long50);
    user0.setFavoriteUsers(arraylist_long50);
    java.lang.String str54 = user0.getEmail();
    float f55 = user0.getFairPlayRating();
    user0.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f55 == 0.0f);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test254"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    java.lang.String str15 = game5.getDate();
    game5.setDescription("");
    game5.setDescription("hi!");
    game5.setSport("");
    java.util.ArrayList<java.lang.Long> arraylist_long22 = game5.getGuests();
    game5.setName("");
    java.lang.String str25 = game5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test255"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    java.util.ArrayList<java.lang.Long> arraylist_long13 = game5.getGuestsRequests();
    java.lang.String str14 = game5.getDate();
    game5.setSport("hi!");
    java.lang.String str17 = game5.getLocal();
    game5.setId(1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test256"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    br.edu.ufcg.es.model.Game game18 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array22 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long23 = new java.util.ArrayList<java.lang.Long>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long23, long_array22);
    game18.setGuestRequests(arraylist_long23);
    java.lang.String str26 = game18.getDate();
    java.util.ArrayList<java.lang.Long> arraylist_long27 = game18.getGuestsRequests();
    game5.setGuestRequests(arraylist_long27);
    br.edu.ufcg.es.model.User user34 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long35 = user34.getGamesRequested();
    java.lang.String str36 = user34.getPassword();
    java.util.ArrayList<java.lang.Long> arraylist_long37 = user34.getFavoriteUsers();
    game5.setGuests(arraylist_long37);
    java.util.ArrayList<java.lang.Long> arraylist_long39 = null;
    game5.setGuestRequests(arraylist_long39);
    long long41 = game5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long41 == 0L);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test257"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setFinished(true);
    java.util.ArrayList<java.lang.Long> arraylist_long10 = game5.getGuestsRequests();
    java.lang.String str11 = game5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test258"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    br.edu.ufcg.es.model.Game game2 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = game2.getGuests();
    br.edu.ufcg.es.model.User user9 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game15 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array19 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long20 = new java.util.ArrayList<java.lang.Long>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long20, long_array19);
    game15.setGuestRequests(arraylist_long20);
    user9.setGames(arraylist_long20);
    java.util.ArrayList<java.lang.Long> arraylist_long24 = user9.getMyGames();
    game2.setGuestRequests(arraylist_long24);
    user0.setGames(arraylist_long24);
    user0.setEmail("hi!");
    br.edu.ufcg.es.model.User user34 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "hi!", "");
    java.lang.Long long35 = user34.getId();
    user34.setAddress("");
    java.util.ArrayList<java.lang.Long> arraylist_long38 = user34.getFavoriteUsers();
    user0.setMyGames(arraylist_long38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long38);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test259"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    java.lang.String str15 = user5.getName();
    user5.setId((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test260"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setDescription("");
    java.lang.String str10 = game5.getDate();
    br.edu.ufcg.es.model.User user16 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long17 = user16.getGamesRequested();
    java.lang.String str18 = user16.getEmail();
    user16.setFairPlayRating((float)(byte)1);
    java.util.ArrayList<java.lang.Long> arraylist_long21 = user16.getFavoriteUsers();
    game5.setGuests(arraylist_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long21);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test261"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    long long7 = game5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test262"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test263"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    br.edu.ufcg.es.model.Game game2 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = game2.getGuests();
    br.edu.ufcg.es.model.User user9 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game15 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array19 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long20 = new java.util.ArrayList<java.lang.Long>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long20, long_array19);
    game15.setGuestRequests(arraylist_long20);
    user9.setGames(arraylist_long20);
    java.util.ArrayList<java.lang.Long> arraylist_long24 = user9.getMyGames();
    game2.setGuestRequests(arraylist_long24);
    user0.setGames(arraylist_long24);
    user0.setEmail("hi!");
    user0.setTimesRated((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long24);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test264"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getFavoriteUsers();
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getAddress();
    int i11 = user5.getTimesRated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test265"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    br.edu.ufcg.es.model.Game game13 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array17 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long18 = new java.util.ArrayList<java.lang.Long>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long18, long_array17);
    game13.setGuestRequests(arraylist_long18);
    boolean b21 = game13.isFinished();
    game13.setId((long)'#');
    br.edu.ufcg.es.model.User user29 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long30 = user29.getGamesRequested();
    java.lang.Long[] long_array35 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long36 = new java.util.ArrayList<java.lang.Long>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long36, long_array35);
    user29.setInvitesReceived(arraylist_long36);
    game13.setGuestRequests(arraylist_long36);
    user5.setFavoriteUsers(arraylist_long36);
    java.lang.Long long41 = user5.getId();
    java.util.ArrayList<java.lang.Long> arraylist_long42 = user5.getGames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long42);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test266"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setSport("hi!");
    game5.setName("");
    br.edu.ufcg.es.model.User user16 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long17 = user16.getGamesRequested();
    user16.setEmail("");
    java.util.ArrayList<java.lang.Long> arraylist_long20 = user16.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long21 = user16.getMyGames();
    game5.setGuestRequests(arraylist_long21);
    game5.setId((long)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long21);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test267"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "", "hi!");
    user5.setId((java.lang.Long)1L);
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getGamesRequested();
    java.lang.String str9 = user5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test268"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    java.lang.String str13 = game5.getDate();
    game5.setIdOwner(0L);
    long long16 = game5.getId();
    game5.setDescription("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test269"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    game5.setId((long)'#');
    java.util.ArrayList<java.lang.Long> arraylist_long16 = game5.getGuests();
    java.util.ArrayList<java.lang.Long> arraylist_long17 = game5.getGuests();
    long long18 = game5.getIdOwner();
    java.lang.String str19 = game5.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test270"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    user5.setAddress("");
    float f17 = user5.getAbilityRating();
    java.util.ArrayList<java.lang.Long> arraylist_long18 = user5.getMyGames();
    java.lang.String str19 = user5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f17 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test271"); }

    br.edu.ufcg.es.model.Game game0 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = game0.getGuests();
    br.edu.ufcg.es.model.User user7 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game13 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array17 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long18 = new java.util.ArrayList<java.lang.Long>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long18, long_array17);
    game13.setGuestRequests(arraylist_long18);
    user7.setGames(arraylist_long18);
    java.util.ArrayList<java.lang.Long> arraylist_long22 = user7.getMyGames();
    game0.setGuestRequests(arraylist_long22);
    game0.setSport("hi!");
    game0.setSport("hi!");
    java.lang.String str28 = game0.getDate();
    game0.setIdOwner((-1L));
    br.edu.ufcg.es.model.Game game36 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array40 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long41 = new java.util.ArrayList<java.lang.Long>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long41, long_array40);
    game36.setGuestRequests(arraylist_long41);
    boolean b44 = game36.isFinished();
    game36.setId((long)'#');
    br.edu.ufcg.es.model.User user52 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long53 = user52.getGamesRequested();
    java.lang.Long[] long_array58 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long59 = new java.util.ArrayList<java.lang.Long>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long59, long_array58);
    user52.setInvitesReceived(arraylist_long59);
    game36.setGuestRequests(arraylist_long59);
    java.lang.String str63 = game36.getDescription();
    game36.setLocal("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long66 = game36.getGuestsRequests();
    game0.setGuests(arraylist_long66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "hi!"+ "'", str63.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long66);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test272"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    br.edu.ufcg.es.model.User user2 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = user2.getInvitesReceived();
    java.lang.Long[] long_array6 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long7 = new java.util.ArrayList<java.lang.Long>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long7, long_array6);
    user2.setGamesRequested(arraylist_long7);
    user0.setGamesRequested(arraylist_long7);
    java.util.ArrayList<java.lang.Long> arraylist_long11 = user0.getFavoriteUsers();
    user0.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long11);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test273"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user6 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game12 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    game12.setGuestRequests(arraylist_long17);
    user6.setGames(arraylist_long17);
    user0.setMyGames(arraylist_long17);
    user0.setTimesRated(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test274"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user6 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game12 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    game12.setGuestRequests(arraylist_long17);
    user6.setGames(arraylist_long17);
    user0.setMyGames(arraylist_long17);
    user0.setName("");
    user0.setPassword("");
    float f26 = user0.getFairPlayRating();
    java.util.ArrayList<java.lang.Long> arraylist_long27 = user0.getGames();
    br.edu.ufcg.es.model.User user28 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long29 = user28.getFavoriteUsers();
    java.lang.Long[] long_array32 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long33 = new java.util.ArrayList<java.lang.Long>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long33, long_array32);
    user28.setFavoriteUsers(arraylist_long33);
    float f36 = user28.getAbilityRating();
    float f37 = user28.getFairPlayRating();
    user28.setAbilityRating(1.0f);
    br.edu.ufcg.es.model.User user45 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long46 = user45.getGamesRequested();
    java.lang.Long[] long_array51 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long52 = new java.util.ArrayList<java.lang.Long>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long52, long_array51);
    user45.setInvitesReceived(arraylist_long52);
    user45.setAddress("");
    br.edu.ufcg.es.model.User user62 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long63 = user62.getGamesRequested();
    user45.setGames(arraylist_long63);
    br.edu.ufcg.es.model.User user70 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long71 = user70.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long72 = user70.getInvitesReceived();
    user45.setGamesRequested(arraylist_long72);
    java.util.ArrayList<java.lang.Long> arraylist_long74 = user45.getGames();
    user28.setInvitesReceived(arraylist_long74);
    user0.setInvitesReceived(arraylist_long74);
    java.lang.String str77 = user0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f26 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f36 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f37 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str77);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test275"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "", "hi!");
    java.lang.String str6 = user5.getPassword();
    float f7 = user5.getAbilityRating();
    br.edu.ufcg.es.model.User user13 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long14 = user13.getGamesRequested();
    java.lang.Long[] long_array19 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long20 = new java.util.ArrayList<java.lang.Long>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long20, long_array19);
    user13.setInvitesReceived(arraylist_long20);
    user13.setAddress("");
    br.edu.ufcg.es.model.User user30 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long31 = user30.getGamesRequested();
    user13.setGames(arraylist_long31);
    br.edu.ufcg.es.model.User user38 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long39 = user38.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long40 = user38.getInvitesReceived();
    user13.setGamesRequested(arraylist_long40);
    user5.setFavoriteUsers(arraylist_long40);
    java.util.ArrayList<java.lang.Long> arraylist_long43 = user5.getInvitesReceived();
    user5.setEmail("hi!");
    br.edu.ufcg.es.model.User user51 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "hi!", "");
    java.lang.Long long52 = user51.getId();
    user51.setAddress("");
    java.util.ArrayList<java.lang.Long> arraylist_long55 = user51.getFavoriteUsers();
    user5.setFavoriteUsers(arraylist_long55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long55);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test276"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    boolean b14 = game5.isFinished();
    game5.setFinished(false);
    boolean b17 = game5.isFinished();
    long long18 = game5.getId();
    game5.setDate("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test277"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long long2 = user0.getId();
    user0.setTimesRated((int)(byte)100);
    java.util.ArrayList<java.lang.Long> arraylist_long5 = user0.getGames();
    int i6 = user0.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = null;
    user0.setGames(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test278"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    long long7 = game5.getIdOwner();
    game5.setLocal("");
    java.lang.String str10 = game5.getDate();
    java.util.ArrayList<java.lang.Long> arraylist_long11 = game5.getGuests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long11);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test279"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setDescription("");
    java.util.ArrayList<java.lang.Long> arraylist_long17 = null;
    game5.setGuests(arraylist_long17);
    br.edu.ufcg.es.model.User user19 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long20 = user19.getInvitesReceived();
    java.lang.Long long21 = user19.getId();
    br.edu.ufcg.es.model.User user22 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long23 = user22.getFavoriteUsers();
    br.edu.ufcg.es.model.User user29 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long30 = user29.getGamesRequested();
    java.lang.Long[] long_array35 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long36 = new java.util.ArrayList<java.lang.Long>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long36, long_array35);
    user29.setInvitesReceived(arraylist_long36);
    user29.setAddress("");
    br.edu.ufcg.es.model.User user46 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long47 = user46.getGamesRequested();
    user29.setGames(arraylist_long47);
    user22.setGamesRequested(arraylist_long47);
    user19.setGames(arraylist_long47);
    java.util.ArrayList<java.lang.Long> arraylist_long51 = user19.getInvitesReceived();
    user19.setName("hi!");
    br.edu.ufcg.es.model.Game game59 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array63 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long64 = new java.util.ArrayList<java.lang.Long>();
    boolean b65 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long64, long_array63);
    game59.setGuestRequests(arraylist_long64);
    boolean b67 = game59.isFinished();
    game59.setId((long)'#');
    java.util.ArrayList<java.lang.Long> arraylist_long70 = game59.getGuests();
    user19.setGames(arraylist_long70);
    game5.setGuestRequests(arraylist_long70);
    java.util.ArrayList<java.lang.Long> arraylist_long73 = game5.getGuestsRequests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long73);

  }

}
