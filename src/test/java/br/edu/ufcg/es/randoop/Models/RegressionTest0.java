package br.edu.ufcg.es.randoop.Models;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    user5.setFairPlayRating((float)(short)-1);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((-1L));
    long long15 = game5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

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
    int i18 = user0.getTimesRated();
    
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
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "hi!", "", "hi!");

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    java.lang.String str8 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setName("hi!");
    game5.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    user5.setTimesRated((int)(byte)-1);
    java.lang.String str13 = user5.getEmail();
    user5.setPassword("");
    java.lang.String str16 = user5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "hi!", "", "", "");
    java.lang.String str6 = game5.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    int i11 = user5.getTimesRated();
    user5.computeRating((float)'4', (float)1);
    user5.setFairPlayRating(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setDate("hi!");
    game5.setSport("");
    game5.setDate("hi!");
    boolean b12 = game5.isFinished();
    game5.setDate("");
    game5.setSport("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long17 = game5.getGuestsRequests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long17);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

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
    user5.computeRating((float)'#', (float)(short)100);
    
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

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

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
    game5.setIdOwner((-1L));
    
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

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("hi!", "", "", "", "");

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getGamesRequested();
    java.lang.String str9 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

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
    java.lang.String str33 = game5.getDescription();
    
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
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    boolean b19 = game11.isFinished();
    game11.setId((long)'#');
    br.edu.ufcg.es.model.User user27 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user27.getGamesRequested();
    java.lang.Long[] long_array33 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long34 = new java.util.ArrayList<java.lang.Long>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long34, long_array33);
    user27.setInvitesReceived(arraylist_long34);
    game11.setGuestRequests(arraylist_long34);
    java.util.ArrayList<java.lang.Long> arraylist_long38 = game11.getGuests();
    user5.setGamesRequested(arraylist_long38);
    br.edu.ufcg.es.model.Game game45 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array49 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long50 = new java.util.ArrayList<java.lang.Long>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long50, long_array49);
    game45.setGuestRequests(arraylist_long50);
    boolean b53 = game45.isFinished();
    game45.setId((long)'#');
    java.util.ArrayList<java.lang.Long> arraylist_long56 = game45.getGuests();
    java.util.ArrayList<java.lang.Long> arraylist_long57 = game45.getGuests();
    user5.setGamesRequested(arraylist_long57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long57);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

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
    java.lang.String str33 = game5.getDate();
    
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
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getFavoriteUsers();
    float f9 = user5.getAbilityRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == 0.0f);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setDate("hi!");
    game5.setLocal("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long10 = game5.getGuests();
    java.lang.String str11 = game5.getDate();
    game5.setName("");
    game5.setFinished(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getPassword();
    java.lang.String str8 = user5.getPassword();
    user5.computeRating((float)100L, (float)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

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
    user0.setAddress("");
    
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

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((-1L));
    java.lang.String str15 = game5.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    int i8 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user5.getFavoriteUsers();
    java.util.ArrayList<java.lang.Long> arraylist_long10 = user5.getMyGames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long10);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    br.edu.ufcg.es.model.User user2 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = user2.getInvitesReceived();
    java.lang.Long[] long_array6 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long7 = new java.util.ArrayList<java.lang.Long>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long7, long_array6);
    user2.setGamesRequested(arraylist_long7);
    user0.setGamesRequested(arraylist_long7);
    java.lang.String str11 = user0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

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
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user0.getGames();
    java.lang.String str29 = user0.getPassword();
    
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
    org.junit.Assert.assertNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    int i8 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user5.getMyGames();
    br.edu.ufcg.es.model.User user10 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long11 = user10.getFavoriteUsers();
    br.edu.ufcg.es.model.User user17 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long18 = user17.getGamesRequested();
    java.lang.Long[] long_array23 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long24 = new java.util.ArrayList<java.lang.Long>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long24, long_array23);
    user17.setInvitesReceived(arraylist_long24);
    user17.setAddress("");
    br.edu.ufcg.es.model.User user34 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long35 = user34.getGamesRequested();
    user17.setGames(arraylist_long35);
    user10.setGamesRequested(arraylist_long35);
    br.edu.ufcg.es.model.User user43 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game49 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array53 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long54 = new java.util.ArrayList<java.lang.Long>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long54, long_array53);
    game49.setGuestRequests(arraylist_long54);
    user43.setGames(arraylist_long54);
    br.edu.ufcg.es.model.User user63 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long64 = user63.getGamesRequested();
    int i65 = user63.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long66 = user63.getFavoriteUsers();
    user43.setGames(arraylist_long66);
    user10.setGames(arraylist_long66);
    user5.setInvitesReceived(arraylist_long66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long66);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    java.lang.String str13 = game5.getDate();
    game5.setIdOwner(0L);
    game5.setId((long)(byte)100);
    game5.setFinished(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setDate("hi!");
    game5.setSport("");
    game5.setDate("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long12 = game5.getGuests();
    long long13 = game5.getIdOwner();
    long long14 = game5.getIdOwner();
    game5.setLocal("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    java.util.ArrayList<java.lang.Long> arraylist_long20 = user5.getGamesRequested();
    user5.setId((java.lang.Long)(-1L));
    user5.setId((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long20);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

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
    user0.setFairPlayRating(1.0f);
    
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

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setFavoriteUsers(arraylist_long5);
    java.lang.String str8 = user0.getName();
    br.edu.ufcg.es.model.User user14 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long15 = user14.getGamesRequested();
    java.lang.String str16 = user14.getEmail();
    user14.setFairPlayRating((float)(byte)1);
    java.util.ArrayList<java.lang.Long> arraylist_long19 = user14.getFavoriteUsers();
    user0.setFavoriteUsers(arraylist_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long19);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setGamesRequested(arraylist_long5);
    java.lang.String str8 = user0.getAddress();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user0.getMyGames();
    java.util.ArrayList<java.lang.Long> arraylist_long10 = user0.getInvitesReceived();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long10);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    user5.setAddress("");
    int i17 = user5.getTimesRated();
    int i18 = user5.getTimesRated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    user5.setPassword("hi!");
    java.lang.String str17 = user5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setGamesRequested(arraylist_long5);
    java.lang.String str8 = user0.getAddress();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user0.getMyGames();
    java.util.ArrayList<java.lang.Long> arraylist_long10 = user0.getMyGames();
    user0.setTimesRated((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long10);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("hi!", "", "hi!", "", "hi!");

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    br.edu.ufcg.es.model.Game game0 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = game0.getGuests();
    java.lang.String str2 = game0.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    int i11 = user5.getTimesRated();
    user5.setPassword("hi!");
    java.lang.String str14 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setGamesRequested(arraylist_long5);
    java.lang.String str8 = user0.getAddress();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user0.getMyGames();
    java.util.ArrayList<java.lang.Long> arraylist_long10 = user0.getMyGames();
    java.util.ArrayList<java.lang.Long> arraylist_long11 = user0.getFavoriteUsers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long11);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

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
    java.lang.String str27 = user0.getPhone();
    
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
    org.junit.Assert.assertNull(str27);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "hi!", "");
    java.lang.Long long6 = user5.getId();
    java.lang.Long long7 = user5.getId();
    java.lang.String str8 = user5.getAddress();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    java.lang.String str14 = game5.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    user5.setAddress("");
    int i17 = user5.getTimesRated();
    java.lang.String str18 = user5.getAddress();
    java.lang.String str19 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    game5.setId((long)'#');
    game5.setIdOwner((long)(byte)0);
    game5.setDescription("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    java.util.ArrayList<java.lang.Long> arraylist_long11 = user5.getGames();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long11);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    br.edu.ufcg.es.model.User user2 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = user2.getInvitesReceived();
    java.lang.Long[] long_array6 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long7 = new java.util.ArrayList<java.lang.Long>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long7, long_array6);
    user2.setGamesRequested(arraylist_long7);
    user0.setGamesRequested(arraylist_long7);
    java.lang.String str11 = user0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    user5.setTimesRated((int)(byte)-1);
    java.lang.String str13 = user5.getPassword();
    user5.setPhone("");
    br.edu.ufcg.es.model.User user21 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long22 = user21.getGamesRequested();
    user21.setPassword("");
    user21.setPhone("hi!");
    br.edu.ufcg.es.model.Game game32 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array36 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long37 = new java.util.ArrayList<java.lang.Long>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long37, long_array36);
    game32.setGuestRequests(arraylist_long37);
    game32.setName("hi!");
    game32.setId((long)'#');
    long long44 = game32.getId();
    game32.setDescription("hi!");
    br.edu.ufcg.es.model.User user52 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array54 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long55 = new java.util.ArrayList<java.lang.Long>();
    boolean b56 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long55, long_array54);
    user52.setGamesRequested(arraylist_long55);
    int i58 = user52.getTimesRated();
    java.lang.String str59 = user52.getPhone();
    java.util.ArrayList<java.lang.Long> arraylist_long60 = user52.getMyGames();
    game32.setGuestRequests(arraylist_long60);
    user21.setGamesRequested(arraylist_long60);
    user5.setGamesRequested(arraylist_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long44 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + ""+ "'", str59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long60);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "hi!", "", "", "hi!");
    game5.setLocal("hi!");
    long long8 = game5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    user5.setTimesRated((int)(byte)-1);
    java.lang.String str13 = user5.getEmail();
    user5.setPassword("");
    java.lang.Long long16 = user5.getId();
    br.edu.ufcg.es.model.User user17 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long18 = user17.getFavoriteUsers();
    br.edu.ufcg.es.model.User user24 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long25 = user24.getGamesRequested();
    java.lang.Long[] long_array30 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long31 = new java.util.ArrayList<java.lang.Long>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long31, long_array30);
    user24.setInvitesReceived(arraylist_long31);
    user24.setAddress("");
    br.edu.ufcg.es.model.User user41 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long42 = user41.getGamesRequested();
    user24.setGames(arraylist_long42);
    user17.setGamesRequested(arraylist_long42);
    user5.setFavoriteUsers(arraylist_long42);
    int i46 = user5.getTimesRated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == (-1));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

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
    float f76 = user5.getAbilityRating();
    
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
    org.junit.Assert.assertTrue(f76 == 0.0f);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "hi!", "", "hi!", "hi!");

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

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
    boolean b35 = game5.isFinished();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setGamesRequested(arraylist_long5);
    java.lang.Long long8 = user0.getId();
    user0.setTimesRated(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long8);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setDate("");
    java.lang.String str10 = game5.getDate();
    long long11 = game5.getId();
    boolean b12 = game5.isFinished();
    java.lang.String str13 = game5.getSport();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    user0.setPhone("");

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long long2 = user0.getId();
    user0.computeRating((float)100L, (float)35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user6 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game12 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    game12.setGuestRequests(arraylist_long17);
    user6.setGames(arraylist_long17);
    user0.setMyGames(arraylist_long17);
    float f22 = user0.getFairPlayRating();
    user0.setTimesRated(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f22 == 0.0f);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "hi!", "");
    java.lang.Long long6 = user5.getId();
    int i7 = user5.getTimesRated();
    java.lang.String str8 = user5.getPhone();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    java.lang.Long[] long_array12 = new java.lang.Long[] { (-1L), 1L, 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long13 = new java.util.ArrayList<java.lang.Long>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long13, long_array12);
    user5.setInvitesReceived(arraylist_long13);
    user5.setId((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setFavoriteUsers(arraylist_long5);
    user0.setPhone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("hi!", "", "", "", "hi!");

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

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
    java.util.ArrayList<java.lang.Long> arraylist_long27 = null;
    user0.setGames(arraylist_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f26 == 0.0f);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

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
    user5.setPhone("hi!");
    
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
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long10 = null;
    user5.setMyGames(arraylist_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setGamesRequested(arraylist_long5);
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user0.getGames();
    br.edu.ufcg.es.model.Game game14 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array18 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long19 = new java.util.ArrayList<java.lang.Long>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long19, long_array18);
    game14.setGuestRequests(arraylist_long19);
    boolean b22 = game14.isFinished();
    game14.setId((long)'#');
    java.lang.String str25 = game14.getDate();
    br.edu.ufcg.es.model.User user26 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long27 = user26.getFavoriteUsers();
    java.lang.Long[] long_array30 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long31 = new java.util.ArrayList<java.lang.Long>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long31, long_array30);
    user26.setFavoriteUsers(arraylist_long31);
    game14.setGuests(arraylist_long31);
    user0.setGamesRequested(arraylist_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "hi!", "", "hi!", "");
    java.lang.String str6 = game5.getDescription();
    java.lang.String str7 = game5.getDate();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = game5.getGuestsRequests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

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
    user5.setAbilityRating((float)10);
    user5.setFairPlayRating((float)10L);
    
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
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    br.edu.ufcg.es.model.Game game0 = new br.edu.ufcg.es.model.Game();
    game0.setId((long)' ');
    java.lang.String str3 = game0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    int i8 = user5.getTimesRated();
    java.lang.String str9 = user5.getName();
    br.edu.ufcg.es.model.User user15 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long16 = user15.getGamesRequested();
    java.lang.String str17 = user15.getEmail();
    int i18 = user15.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long19 = user15.getGames();
    user5.setMyGames(arraylist_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long19);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    br.edu.ufcg.es.model.User user2 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = user2.getInvitesReceived();
    java.lang.Long[] long_array6 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long7 = new java.util.ArrayList<java.lang.Long>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long7, long_array6);
    user2.setGamesRequested(arraylist_long7);
    user0.setGamesRequested(arraylist_long7);
    float f11 = user0.getFairPlayRating();
    java.util.ArrayList<java.lang.Long> arraylist_long12 = user0.getMyGames();
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
    user0.setGamesRequested(arraylist_long41);
    java.lang.String str46 = user0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long12);
    
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
    org.junit.Assert.assertNull(str46);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

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
    game0.setId(1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long22);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    user0.setId((java.lang.Long)100L);
    user0.setFairPlayRating((float)100);
    java.lang.String str5 = user0.getAddress();
    user0.setId((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

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
    br.edu.ufcg.es.model.User user30 = new br.edu.ufcg.es.model.User("", "hi!", "", "", "hi!");
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
    java.util.ArrayList<java.lang.Long> arraylist_long63 = game36.getGuests();
    user30.setGamesRequested(arraylist_long63);
    user0.setInvitesReceived(arraylist_long63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long24);
    
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
    org.junit.Assert.assertNotNull(arraylist_long63);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "", "hi!");
    java.lang.String str6 = user5.getPassword();
    float f7 = user5.getAbilityRating();
    br.edu.ufcg.es.model.Game game13 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array17 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long18 = new java.util.ArrayList<java.lang.Long>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long18, long_array17);
    game13.setGuestRequests(arraylist_long18);
    game13.setIdOwner((long)'4');
    game13.setFinished(true);
    java.lang.String str25 = game13.getLocal();
    java.util.ArrayList<java.lang.Long> arraylist_long26 = game13.getGuests();
    user5.setGames(arraylist_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long26);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    boolean b14 = game5.isFinished();
    game5.setFinished(false);
    boolean b17 = game5.isFinished();
    game5.setFinished(false);
    
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

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setDate("");
    java.lang.String str10 = game5.getDate();
    long long11 = game5.getId();
    boolean b12 = game5.isFinished();
    java.util.ArrayList<java.lang.Long> arraylist_long13 = game5.getGuestsRequests();
    
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
    org.junit.Assert.assertNotNull(arraylist_long13);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "", "", "hi!", "hi!");
    game5.setFinished(true);
    game5.setId((long)(short)100);
    java.lang.String str10 = game5.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    boolean b15 = game5.isFinished();
    game5.setFinished(true);
    game5.setName("hi!");
    game5.setSport("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.util.ArrayList<java.lang.Long> arraylist_long2 = null;
    user0.setGamesRequested(arraylist_long2);
    br.edu.ufcg.es.model.Game game9 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array13 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long14 = new java.util.ArrayList<java.lang.Long>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long14, long_array13);
    game9.setGuestRequests(arraylist_long14);
    br.edu.ufcg.es.model.Game game22 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array26 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long27 = new java.util.ArrayList<java.lang.Long>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long27, long_array26);
    game22.setGuestRequests(arraylist_long27);
    java.lang.String str30 = game22.getDate();
    java.util.ArrayList<java.lang.Long> arraylist_long31 = game22.getGuestsRequests();
    game9.setGuestRequests(arraylist_long31);
    user0.setInvitesReceived(arraylist_long31);
    int i34 = user0.getTimesRated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setSport("hi!");
    game5.setId((long)(byte)100);
    long long11 = game5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 100L);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    user5.setId((java.lang.Long)10L);
    user5.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

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
    java.lang.String str25 = user0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

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
    user5.setId((java.lang.Long)0L);
    
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

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setLocal("hi!");
    game5.setIdOwner(100L);
    boolean b11 = game5.isFinished();
    game5.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    boolean b15 = game5.isFinished();
    game5.setId(35L);
    game5.setIdOwner((-1L));
    game5.setId((long)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    br.edu.ufcg.es.model.Game game0 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = game0.getGuests();
    game0.setName("");
    game0.setDate("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    float f8 = user5.getAbilityRating();
    user5.setPassword("hi!");
    user5.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    user5.setFairPlayRating((float)(byte)1);
    user5.setPassword("");
    br.edu.ufcg.es.model.User user17 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long18 = user17.getGamesRequested();
    user17.setPassword("");
    user17.setPhone("hi!");
    br.edu.ufcg.es.model.Game game28 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array32 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long33 = new java.util.ArrayList<java.lang.Long>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long33, long_array32);
    game28.setGuestRequests(arraylist_long33);
    game28.setName("hi!");
    game28.setId((long)'#');
    long long40 = game28.getId();
    game28.setDescription("hi!");
    br.edu.ufcg.es.model.User user48 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array50 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long51 = new java.util.ArrayList<java.lang.Long>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long51, long_array50);
    user48.setGamesRequested(arraylist_long51);
    int i54 = user48.getTimesRated();
    java.lang.String str55 = user48.getPhone();
    java.util.ArrayList<java.lang.Long> arraylist_long56 = user48.getMyGames();
    game28.setGuestRequests(arraylist_long56);
    user17.setGamesRequested(arraylist_long56);
    user5.setGames(arraylist_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long40 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + ""+ "'", str55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long56);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    user5.setFairPlayRating((float)(byte)1);
    user5.setPassword("");
    br.edu.ufcg.es.model.User user12 = new br.edu.ufcg.es.model.User();
    user12.setEmail("hi!");
    br.edu.ufcg.es.model.User user20 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long21 = user20.getGamesRequested();
    java.lang.Long[] long_array26 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long27 = new java.util.ArrayList<java.lang.Long>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long27, long_array26);
    user20.setInvitesReceived(arraylist_long27);
    user12.setGamesRequested(arraylist_long27);
    user5.setInvitesReceived(arraylist_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

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
    br.edu.ufcg.es.model.Game game30 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array34 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long35 = new java.util.ArrayList<java.lang.Long>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long35, long_array34);
    game30.setGuestRequests(arraylist_long35);
    game30.setIdOwner((-1L));
    java.lang.String str40 = game30.getDescription();
    java.util.ArrayList<java.lang.Long> arraylist_long41 = game30.getGuestsRequests();
    user5.setGames(arraylist_long41);
    
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
    org.junit.Assert.assertNotNull(long_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!"+ "'", str40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long41);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setDate("hi!");
    game5.setSport("");
    game5.setDate("hi!");
    boolean b12 = game5.isFinished();
    boolean b13 = game5.isFinished();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

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
    user5.setPassword("");
    
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

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

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
    br.edu.ufcg.es.model.Game game26 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array30 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long31 = new java.util.ArrayList<java.lang.Long>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long31, long_array30);
    game26.setGuestRequests(arraylist_long31);
    boolean b34 = game26.isFinished();
    game26.setId((long)'#');
    java.lang.String str37 = game26.getDate();
    br.edu.ufcg.es.model.User user43 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long44 = user43.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long45 = user43.getInvitesReceived();
    game26.setGuests(arraylist_long45);
    user0.setInvitesReceived(arraylist_long45);
    java.lang.Long long48 = user0.getId();
    
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
    org.junit.Assert.assertNotNull(long_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long48);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

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
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    boolean b15 = game5.isFinished();
    game5.setDescription("");
    game5.setDescription("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setDate("hi!");
    game5.setSport("");
    game5.setDate("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long12 = game5.getGuests();
    long long13 = game5.getIdOwner();
    br.edu.ufcg.es.model.Game game19 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game19.setDate("hi!");
    game19.setLocal("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long24 = game19.getGuests();
    game5.setGuestRequests(arraylist_long24);
    game5.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long24);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    java.lang.Long[] long_array12 = new java.lang.Long[] { (-1L), 1L, 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long13 = new java.util.ArrayList<java.lang.Long>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long13, long_array12);
    user5.setInvitesReceived(arraylist_long13);
    java.lang.String str16 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    java.lang.String str15 = game5.getDate();
    game5.setDescription("");
    br.edu.ufcg.es.model.User user23 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long24 = user23.getGamesRequested();
    java.lang.String str25 = user23.getEmail();
    user23.setFairPlayRating((float)(byte)1);
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user23.getFavoriteUsers();
    game5.setGuests(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    java.lang.String str8 = user5.getPassword();
    user5.setId((java.lang.Long)10L);
    br.edu.ufcg.es.model.User user16 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game22 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array26 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long27 = new java.util.ArrayList<java.lang.Long>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long27, long_array26);
    game22.setGuestRequests(arraylist_long27);
    user16.setGames(arraylist_long27);
    java.util.ArrayList<java.lang.Long> arraylist_long31 = user16.getGamesRequested();
    user5.setGames(arraylist_long31);
    user5.computeRating((float)(short)100, (float)'#');
    java.lang.String str36 = user5.getEmail();
    java.util.ArrayList<java.lang.Long> arraylist_long37 = user5.getInvitesReceived();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long37);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

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
    br.edu.ufcg.es.model.User user37 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "", "hi!");
    java.lang.String str38 = user37.getPassword();
    float f39 = user37.getAbilityRating();
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
    user37.setFavoriteUsers(arraylist_long72);
    user0.setMyGames(arraylist_long72);
    
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
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!"+ "'", str38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f39 == 0.0f);
    
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

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

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
    user0.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

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
    br.edu.ufcg.es.model.User user31 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long32 = user31.getGamesRequested();
    int i33 = user31.getTimesRated();
    int i34 = user31.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long35 = user31.getMyGames();
    user5.setInvitesReceived(arraylist_long35);
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
    org.junit.Assert.assertNull(arraylist_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long35);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setSport("hi!");
    game5.setFinished(false);
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
    user16.setPassword("");
    user16.setTimesRated((int)(byte)100);
    java.util.ArrayList<java.lang.Long> arraylist_long46 = user16.getGames();
    game5.setGuests(arraylist_long46);
    java.lang.String str48 = game5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
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
    org.junit.Assert.assertNotNull(arraylist_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + ""+ "'", str48.equals(""));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setGamesRequested(arraylist_long5);
    float f8 = user0.getFairPlayRating();
    user0.setId((java.lang.Long)0L);
    user0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "hi!", "");
    java.lang.Long long6 = user5.getId();
    java.lang.String str7 = user5.getPassword();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getFavoriteUsers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    game5.setDate("");
    boolean b16 = game5.isFinished();
    game5.setDescription("hi!");
    java.lang.String str19 = game5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

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
    user0.setFairPlayRating(0.0f);
    
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

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

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
    user5.setAbilityRating((float)' ');
    
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

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getGamesRequested();
    user5.setAddress("");
    br.edu.ufcg.es.model.User user16 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long17 = user16.getGamesRequested();
    int i18 = user16.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long19 = user16.getFavoriteUsers();
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array27 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long28 = new java.util.ArrayList<java.lang.Long>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long28, long_array27);
    user25.setGamesRequested(arraylist_long28);
    user16.setGames(arraylist_long28);
    float f32 = user16.getFairPlayRating();
    java.util.ArrayList<java.lang.Long> arraylist_long33 = user16.getGames();
    user5.setGamesRequested(arraylist_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f32 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long33);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    java.util.ArrayList<java.lang.Long> arraylist_long15 = user5.getInvitesReceived();
    user5.setPassword("");
    float f18 = user5.getFairPlayRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f18 == 0.0f);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

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
    java.util.ArrayList<java.lang.Long> arraylist_long22 = user5.getGamesRequested();
    
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

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "hi!", "", "hi!", "");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = game5.getGuests();
    java.lang.String str7 = game5.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "hi!", "");
    java.lang.Long long6 = user5.getId();
    int i7 = user5.getTimesRated();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    boolean b14 = game5.isFinished();
    java.lang.String str15 = game5.getDate();
    game5.setFinished(false);
    br.edu.ufcg.es.model.Game game23 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array27 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long28 = new java.util.ArrayList<java.lang.Long>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long28, long_array27);
    game23.setGuestRequests(arraylist_long28);
    boolean b31 = game23.isFinished();
    boolean b32 = game23.isFinished();
    br.edu.ufcg.es.model.User user33 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long34 = user33.getFavoriteUsers();
    br.edu.ufcg.es.model.Game game35 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long36 = game35.getGuests();
    br.edu.ufcg.es.model.User user42 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game48 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array52 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long53 = new java.util.ArrayList<java.lang.Long>();
    boolean b54 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long53, long_array52);
    game48.setGuestRequests(arraylist_long53);
    user42.setGames(arraylist_long53);
    java.util.ArrayList<java.lang.Long> arraylist_long57 = user42.getMyGames();
    game35.setGuestRequests(arraylist_long57);
    user33.setGames(arraylist_long57);
    game23.setGuestRequests(arraylist_long57);
    br.edu.ufcg.es.model.User user66 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game72 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array76 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long77 = new java.util.ArrayList<java.lang.Long>();
    boolean b78 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long77, long_array76);
    game72.setGuestRequests(arraylist_long77);
    user66.setGames(arraylist_long77);
    br.edu.ufcg.es.model.User user86 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long87 = user86.getGamesRequested();
    int i88 = user86.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long89 = user86.getFavoriteUsers();
    user66.setGames(arraylist_long89);
    game23.setGuests(arraylist_long89);
    game5.setGuests(arraylist_long89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long89);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    user5.setTimesRated((int)(byte)-1);
    java.util.ArrayList<java.lang.Long> arraylist_long13 = user5.getGames();
    user5.setTimesRated(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long13);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setSport("hi!");
    game5.setFinished(false);
    java.lang.String str11 = game5.getDate();
    game5.setSport("");
    java.lang.String str14 = game5.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    br.edu.ufcg.es.model.User user2 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = user2.getInvitesReceived();
    java.lang.Long[] long_array6 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long7 = new java.util.ArrayList<java.lang.Long>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long7, long_array6);
    user2.setGamesRequested(arraylist_long7);
    user0.setGamesRequested(arraylist_long7);
    float f11 = user0.getFairPlayRating();
    user0.setPassword("hi!");
    java.lang.Long long14 = user0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long14);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

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
    user0.setPhone("");
    user0.setId((java.lang.Long)(-1L));
    
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

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getGamesRequested();
    int i9 = user5.getTimesRated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    user5.setTimesRated((int)(byte)-1);
    java.lang.String str13 = user5.getEmail();
    user5.setPassword("");
    java.lang.Long long16 = user5.getId();
    java.lang.String str17 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

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
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    game5.setId((long)'#');
    java.lang.String str16 = game5.getDate();
    java.lang.String str17 = game5.getDescription();
    java.lang.String str18 = game5.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

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
    java.util.ArrayList<java.lang.Long> arraylist_long33 = user5.getFavoriteUsers();
    
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
    org.junit.Assert.assertNotNull(arraylist_long33);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

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
    br.edu.ufcg.es.model.User user34 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long35 = user34.getGamesRequested();
    java.lang.String str36 = user34.getEmail();
    int i37 = user34.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long38 = user34.getGames();
    game5.setGuestRequests(arraylist_long38);
    game5.setName("");
    
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
    org.junit.Assert.assertNotNull(arraylist_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long38);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

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
    game5.setDate("");
    
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

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setFinished(true);
    java.lang.String str10 = game5.getName();
    java.lang.String str11 = game5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "hi!", "", "hi!", "");
    java.lang.String str6 = game5.getDescription();
    java.lang.String str7 = game5.getDate();
    game5.setIdOwner((long)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

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
    java.util.ArrayList<java.lang.Long> arraylist_long26 = game0.getGuests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long26);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    br.edu.ufcg.es.model.User user2 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = user2.getInvitesReceived();
    java.lang.Long[] long_array6 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long7 = new java.util.ArrayList<java.lang.Long>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long7, long_array6);
    user2.setGamesRequested(arraylist_long7);
    user0.setGamesRequested(arraylist_long7);
    float f11 = user0.getFairPlayRating();
    java.util.ArrayList<java.lang.Long> arraylist_long12 = user0.getMyGames();
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
    user0.setGamesRequested(arraylist_long41);
    java.lang.Long long46 = user0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long12);
    
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
    org.junit.Assert.assertNull(long46);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

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
    user0.setPassword("hi!");
    
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

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

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
    game5.setId((long)'a');
    java.lang.String str24 = game5.getDate();
    
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
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setGamesRequested(arraylist_long5);
    java.lang.String str8 = user0.getAddress();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user0.getFavoriteUsers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long9);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

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
    br.edu.ufcg.es.model.User user26 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "hi!", "");
    java.lang.String str27 = user26.getAddress();
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user26.getMyGames();
    user5.setFavoriteUsers(arraylist_long28);
    
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
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

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
    br.edu.ufcg.es.model.User user29 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array31 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long32 = new java.util.ArrayList<java.lang.Long>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long32, long_array31);
    user29.setGamesRequested(arraylist_long32);
    user29.setTimesRated((int)(byte)-1);
    java.lang.String str37 = user29.getEmail();
    user29.setPassword("");
    java.lang.Long long40 = user29.getId();
    br.edu.ufcg.es.model.User user41 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long42 = user41.getFavoriteUsers();
    br.edu.ufcg.es.model.User user48 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long49 = user48.getGamesRequested();
    java.lang.Long[] long_array54 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long55 = new java.util.ArrayList<java.lang.Long>();
    boolean b56 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long55, long_array54);
    user48.setInvitesReceived(arraylist_long55);
    user48.setAddress("");
    br.edu.ufcg.es.model.User user65 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long66 = user65.getGamesRequested();
    user48.setGames(arraylist_long66);
    user41.setGamesRequested(arraylist_long66);
    user29.setFavoriteUsers(arraylist_long66);
    user5.setMyGames(arraylist_long66);
    float f71 = user5.getFairPlayRating();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + ""+ "'", str37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f71 == 0.0f);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

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
    float f35 = user0.getAbilityRating();
    
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
    org.junit.Assert.assertTrue(f35 == 0.0f);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    long long15 = game5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setDescription("");
    java.lang.String str10 = game5.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    java.lang.String str8 = user5.getPassword();
    user5.setId((java.lang.Long)10L);
    br.edu.ufcg.es.model.User user16 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game22 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array26 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long27 = new java.util.ArrayList<java.lang.Long>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long27, long_array26);
    game22.setGuestRequests(arraylist_long27);
    user16.setGames(arraylist_long27);
    java.util.ArrayList<java.lang.Long> arraylist_long31 = user16.getGamesRequested();
    user5.setGames(arraylist_long31);
    java.lang.String str33 = user5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    user5.setFairPlayRating(100.0f);
    java.lang.String str10 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

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
    java.lang.String str28 = game0.getDescription();
    java.lang.String str29 = game0.getDate();
    
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
    org.junit.Assert.assertNull(str29);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setFinished(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "", "", "", "hi!");

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "", "hi!", "", "");

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    user5.setTimesRated((int)(byte)-1);
    java.lang.String str13 = user5.getEmail();
    user5.setPassword("");
    int i16 = user5.getTimesRated();
    user5.setFairPlayRating((float)(short)100);
    float f19 = user5.getAbilityRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f19 == 0.0f);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "hi!", "hi!", "hi!", "hi!");

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "", "hi!", "hi!", "hi!");

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "hi!", "");
    java.lang.String str6 = user5.getAddress();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getMyGames();
    java.lang.String str8 = user5.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    float f8 = user5.getAbilityRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

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
    java.util.ArrayList<java.lang.Long> arraylist_long36 = user5.getGamesRequested();
    br.edu.ufcg.es.model.User user42 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long43 = user42.getGamesRequested();
    int i44 = user42.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long45 = user42.getFavoriteUsers();
    br.edu.ufcg.es.model.User user51 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array53 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long54 = new java.util.ArrayList<java.lang.Long>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long54, long_array53);
    user51.setGamesRequested(arraylist_long54);
    user42.setGames(arraylist_long54);
    user5.setFavoriteUsers(arraylist_long54);
    
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
    org.junit.Assert.assertNotNull(arraylist_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "hi!", "hi!", "", "");
    long long6 = game5.getIdOwner();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "", "hi!");
    java.lang.Long long6 = user5.getId();
    java.lang.String str7 = user5.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

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
    br.edu.ufcg.es.model.Game game42 = new br.edu.ufcg.es.model.Game("", "hi!", "", "hi!", "");
    game42.setSport("");
    java.util.ArrayList<java.lang.Long> arraylist_long45 = null;
    game42.setGuests(arraylist_long45);
    br.edu.ufcg.es.model.User user52 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long53 = user52.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long54 = user52.getInvitesReceived();
    game42.setGuestRequests(arraylist_long54);
    user5.setInvitesReceived(arraylist_long54);
    
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
    org.junit.Assert.assertNotNull(arraylist_long53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long54);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "hi!", "");
    java.lang.Long long6 = user5.getId();
    java.lang.String str7 = user5.getPassword();
    user5.computeRating((float)10L, (float)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setSport("hi!");
    game5.setFinished(false);
    long long11 = game5.getId();
    br.edu.ufcg.es.model.User user12 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long13 = user12.getInvitesReceived();
    java.lang.Long long14 = user12.getId();
    br.edu.ufcg.es.model.User user15 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long16 = user15.getFavoriteUsers();
    br.edu.ufcg.es.model.User user22 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long23 = user22.getGamesRequested();
    java.lang.Long[] long_array28 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long29 = new java.util.ArrayList<java.lang.Long>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long29, long_array28);
    user22.setInvitesReceived(arraylist_long29);
    user22.setAddress("");
    br.edu.ufcg.es.model.User user39 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long40 = user39.getGamesRequested();
    user22.setGames(arraylist_long40);
    user15.setGamesRequested(arraylist_long40);
    user12.setGames(arraylist_long40);
    br.edu.ufcg.es.model.User user49 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long50 = user49.getGamesRequested();
    java.lang.String str51 = user49.getEmail();
    user49.setFairPlayRating((float)(byte)1);
    java.util.ArrayList<java.lang.Long> arraylist_long54 = null;
    user49.setGamesRequested(arraylist_long54);
    java.util.ArrayList<java.lang.Long> arraylist_long56 = user49.getInvitesReceived();
    user12.setMyGames(arraylist_long56);
    game5.setGuestRequests(arraylist_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + ""+ "'", str51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long56);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("hi!", "hi!", "", "hi!", "hi!");
    int i6 = user5.getTimesRated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setDate("hi!");
    game5.setSport("");
    game5.setDate("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long12 = game5.getGuests();
    long long13 = game5.getIdOwner();
    long long14 = game5.getIdOwner();
    java.lang.String str15 = game5.getDescription();
    long long16 = game5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

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
    java.util.ArrayList<java.lang.Long> arraylist_long34 = user5.getFavoriteUsers();
    
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
    org.junit.Assert.assertNotNull(arraylist_long34);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setFavoriteUsers(arraylist_long5);
    java.lang.String str8 = user0.getName();
    user0.setId((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getFavoriteUsers();
    java.lang.String str9 = user5.getAddress();
    java.util.ArrayList<java.lang.Long> arraylist_long10 = user5.getMyGames();
    user5.computeRating((float)(byte)100, (float)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long10);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    game5.setId((long)'#');
    java.lang.String str16 = game5.getDate();
    java.lang.String str17 = game5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

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
    java.lang.String str26 = user5.getAddress();
    
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
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    br.edu.ufcg.es.model.Game game0 = new br.edu.ufcg.es.model.Game();
    game0.setId((long)(short)100);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    java.lang.String str13 = game5.getDate();
    game5.setIdOwner(0L);
    long long16 = game5.getId();
    game5.setDate("hi!");
    game5.setLocal("");
    
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
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

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
    java.lang.String str25 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

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
    java.lang.String str26 = user0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f25 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    java.lang.Long[] long_array12 = new java.lang.Long[] { (-1L), 1L, 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long13 = new java.util.ArrayList<java.lang.Long>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long13, long_array12);
    user5.setInvitesReceived(arraylist_long13);
    java.lang.Long long16 = user5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long16);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    java.lang.String str13 = game5.getDescription();
    boolean b14 = game5.isFinished();
    game5.setFinished(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    br.edu.ufcg.es.model.Game game0 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = game0.getGuests();
    java.lang.String str2 = game0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

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
    br.edu.ufcg.es.model.Game game79 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array83 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long84 = new java.util.ArrayList<java.lang.Long>();
    boolean b85 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long84, long_array83);
    game79.setGuestRequests(arraylist_long84);
    game79.setIdOwner((long)'4');
    boolean b89 = game79.isFinished();
    java.lang.String str90 = game79.getSport();
    java.util.ArrayList<java.lang.Long> arraylist_long91 = game79.getGuestsRequests();
    user0.setGamesRequested(arraylist_long91);
    
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
    org.junit.Assert.assertNotNull(long_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str90 + "' != '" + ""+ "'", str90.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long91);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

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
    long long45 = game5.getIdOwner();
    
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
    org.junit.Assert.assertTrue(long45 == 0L);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setDate("hi!");
    game5.setSport("");
    boolean b10 = game5.isFinished();
    java.lang.String str11 = game5.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    user5.setPassword("hi!");
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

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
    user0.setAbilityRating((float)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

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
    java.lang.String str35 = user5.getEmail();
    
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
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

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
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.util.ArrayList<java.lang.Long> arraylist_long2 = null;
    user0.setGamesRequested(arraylist_long2);
    java.lang.String str4 = user0.getName();
    java.lang.String str5 = user0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

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
    int i43 = user5.getTimesRated();
    
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
    org.junit.Assert.assertTrue(i43 == 0);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    int i8 = user5.getTimesRated();
    user5.setTimesRated((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "hi!", "", "", "hi!");
    game5.setLocal("hi!");
    game5.setName("hi!");

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getPassword();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getFavoriteUsers();
    float f9 = user5.getFairPlayRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == 0.0f);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

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
    user0.setPhone("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.util.ArrayList<java.lang.Long> arraylist_long2 = null;
    user0.setGamesRequested(arraylist_long2);
    br.edu.ufcg.es.model.Game game9 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array13 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long14 = new java.util.ArrayList<java.lang.Long>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long14, long_array13);
    game9.setGuestRequests(arraylist_long14);
    br.edu.ufcg.es.model.Game game22 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array26 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long27 = new java.util.ArrayList<java.lang.Long>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long27, long_array26);
    game22.setGuestRequests(arraylist_long27);
    java.lang.String str30 = game22.getDate();
    java.util.ArrayList<java.lang.Long> arraylist_long31 = game22.getGuestsRequests();
    game9.setGuestRequests(arraylist_long31);
    user0.setInvitesReceived(arraylist_long31);
    user0.computeRating((float)0L, (float)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long31);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

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
    java.lang.String str85 = user5.getAddress();
    
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
    org.junit.Assert.assertTrue("'" + str85 + "' != '" + "hi!"+ "'", str85.equals("hi!"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

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
    long long19 = game5.getId();
    
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
    org.junit.Assert.assertTrue(long19 == 0L);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

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
    user5.setEmail("");
    java.lang.String str38 = user5.getName();
    
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
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + ""+ "'", str38.equals(""));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

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
    game0.setDate("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long22);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    int i11 = user5.getTimesRated();
    java.lang.String str12 = user5.getPhone();
    user5.setPhone("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getName();
    java.lang.String str8 = game5.getLocal();
    java.lang.String str9 = game5.getLocal();
    java.util.ArrayList<java.lang.Long> arraylist_long10 = game5.getGuests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long10);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

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
    game5.setIdOwner((long)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 0L);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    game5.setId((long)'#');
    java.lang.String str16 = game5.getDate();
    game5.setLocal("hi!");
    
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
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    br.edu.ufcg.es.model.Game game0 = new br.edu.ufcg.es.model.Game();
    game0.setId((long)' ');
    game0.setDescription("hi!");

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    int i11 = user5.getTimesRated();
    user5.setPassword("hi!");
    user5.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

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
    game5.setId((long)'a');
    java.util.ArrayList<java.lang.Long> arraylist_long24 = game5.getGuestsRequests();
    
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
    org.junit.Assert.assertNotNull(arraylist_long24);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setDate("");
    java.lang.String str10 = game5.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

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
    java.util.ArrayList<java.lang.Long> arraylist_long36 = user5.getGamesRequested();
    int i37 = user5.getTimesRated();
    
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
    org.junit.Assert.assertNotNull(arraylist_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 100);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

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
    br.edu.ufcg.es.model.User user54 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long55 = user54.getFavoriteUsers();
    br.edu.ufcg.es.model.User user61 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long62 = user61.getGamesRequested();
    java.lang.Long[] long_array67 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long68 = new java.util.ArrayList<java.lang.Long>();
    boolean b69 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long68, long_array67);
    user61.setInvitesReceived(arraylist_long68);
    user61.setAddress("");
    br.edu.ufcg.es.model.User user78 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long79 = user78.getGamesRequested();
    user61.setGames(arraylist_long79);
    user54.setGamesRequested(arraylist_long79);
    game0.setGuestRequests(arraylist_long79);
    game0.setFinished(true);
    
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
    org.junit.Assert.assertNull(arraylist_long55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long79);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    user5.setFairPlayRating((float)(byte)1);
    java.util.ArrayList<java.lang.Long> arraylist_long10 = null;
    user5.setGamesRequested(arraylist_long10);
    float f12 = user5.getAbilityRating();
    float f13 = user5.getAbilityRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f12 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f13 == 0.0f);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    int i11 = user5.getTimesRated();
    user5.computeRating((float)'4', (float)1);
    float f15 = user5.getAbilityRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f15 == 52.0f);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    int i8 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user5.getFavoriteUsers();
    user5.setTimesRated((int)(byte)1);
    java.lang.String str12 = user5.getPhone();
    java.util.ArrayList<java.lang.Long> arraylist_long13 = user5.getFavoriteUsers();
    br.edu.ufcg.es.model.User user14 = new br.edu.ufcg.es.model.User();
    user14.setId((java.lang.Long)100L);
    user14.setFairPlayRating((float)100);
    br.edu.ufcg.es.model.Game game24 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array28 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long29 = new java.util.ArrayList<java.lang.Long>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long29, long_array28);
    game24.setGuestRequests(arraylist_long29);
    java.lang.String str32 = game24.getDate();
    java.util.ArrayList<java.lang.Long> arraylist_long33 = game24.getGuestsRequests();
    user14.setFavoriteUsers(arraylist_long33);
    user5.setFavoriteUsers(arraylist_long33);
    
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
    org.junit.Assert.assertNotNull(arraylist_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long33);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

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
    int i33 = user5.getTimesRated();
    user5.setEmail("");
    
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
    org.junit.Assert.assertTrue(i33 == 35);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    int i11 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long12 = user5.getFavoriteUsers();
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    user0.setId((java.lang.Long)100L);
    user0.setFairPlayRating((float)100);
    java.lang.String str5 = user0.getAddress();
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user0.getFavoriteUsers();
    br.edu.ufcg.es.model.Game game12 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array16 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long17, long_array16);
    game12.setGuestRequests(arraylist_long17);
    boolean b20 = game12.isFinished();
    game12.setId((long)'#');
    br.edu.ufcg.es.model.User user28 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long29 = user28.getGamesRequested();
    java.lang.Long[] long_array34 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long35 = new java.util.ArrayList<java.lang.Long>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long35, long_array34);
    user28.setInvitesReceived(arraylist_long35);
    game12.setGuestRequests(arraylist_long35);
    user0.setInvitesReceived(arraylist_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

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
    java.lang.String str32 = user0.getPhone();
    user0.computeRating(100.0f, (float)10);
    
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
    org.junit.Assert.assertNull(str32);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setDate("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long8 = game5.getGuestsRequests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((-1L));
    java.lang.String str15 = game5.getDescription();
    java.lang.String str16 = game5.getName();
    game5.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

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
    user0.setAddress("");
    java.util.ArrayList<java.lang.Long> arraylist_long27 = user0.getGamesRequested();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long27);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "hi!", "", "");

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getPassword();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getFavoriteUsers();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user5.getGames();
    user5.setFairPlayRating(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long9);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

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
    java.lang.String str29 = game5.getLocal();
    game5.setFinished(false);
    
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
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    br.edu.ufcg.es.model.User user2 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = user2.getInvitesReceived();
    java.lang.Long[] long_array6 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long7 = new java.util.ArrayList<java.lang.Long>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long7, long_array6);
    user2.setGamesRequested(arraylist_long7);
    user0.setGamesRequested(arraylist_long7);
    float f11 = user0.getFairPlayRating();
    user0.setPassword("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long14 = user0.getInvitesReceived();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long14);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((-1L));
    game5.setId(10L);
    game5.setDescription("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    user0.setId((java.lang.Long)100L);
    int i3 = user0.getTimesRated();
    user0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    br.edu.ufcg.es.model.User user2 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = user2.getInvitesReceived();
    java.lang.Long[] long_array6 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long7 = new java.util.ArrayList<java.lang.Long>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long7, long_array6);
    user2.setGamesRequested(arraylist_long7);
    user0.setGamesRequested(arraylist_long7);
    float f11 = user0.getFairPlayRating();
    java.util.ArrayList<java.lang.Long> arraylist_long12 = user0.getMyGames();
    java.lang.String str13 = user0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "hi!", "hi!", "", "hi!");
    long long6 = game5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    user5.setEmail("");
    user5.setAbilityRating((float)'4');
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    user5.setTimesRated((int)(byte)-1);
    java.lang.String str13 = user5.getEmail();
    user5.setPassword("");
    user5.setName("");
    user5.setPhone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("hi!", "", "", "hi!", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGames();
    java.lang.String str7 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

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
    user0.setName("hi!");
    
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

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "hi!", "hi!", "");

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setDate("");
    java.lang.String str10 = game5.getDate();
    game5.setDescription("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    java.lang.String str15 = game5.getDate();
    game5.setIdOwner((long)0);
    java.lang.String str18 = game5.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

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
    user0.computeRating((float)(short)0, (float)1);
    java.lang.String str41 = user0.getName();
    user0.computeRating(52.0f, 10.0f);
    
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
    org.junit.Assert.assertNull(str41);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "", "hi!", "hi!");

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setName("hi!");
    game5.setId((long)'#');
    long long17 = game5.getId();
    game5.setDescription("hi!");
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array27 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long28 = new java.util.ArrayList<java.lang.Long>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long28, long_array27);
    user25.setGamesRequested(arraylist_long28);
    int i31 = user25.getTimesRated();
    java.lang.String str32 = user25.getPhone();
    java.util.ArrayList<java.lang.Long> arraylist_long33 = user25.getMyGames();
    game5.setGuestRequests(arraylist_long33);
    game5.setFinished(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long33);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    java.lang.String str13 = game5.getDescription();
    java.lang.String str14 = game5.getName();
    game5.setIdOwner(0L);
    game5.setDate("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    boolean b15 = game5.isFinished();
    java.lang.String str16 = game5.getSport();
    java.util.ArrayList<java.lang.Long> arraylist_long17 = game5.getGuestsRequests();
    java.lang.String str18 = game5.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

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
    user5.setAddress("");
    
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

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long long2 = user0.getId();
    user0.setTimesRated((int)(byte)100);
    user0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    boolean b15 = game5.isFinished();
    game5.setSport("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

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
    user5.setAddress("");
    
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
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setDate("");
    java.lang.String str10 = game5.getDate();
    game5.setSport("hi!");
    game5.setLocal("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

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
    java.util.ArrayList<java.lang.Long> arraylist_long36 = user5.getMyGames();
    user5.computeRating((float)(byte)0, (float)1L);
    
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
    org.junit.Assert.assertNotNull(arraylist_long36);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    user5.setFairPlayRating((float)(byte)1);
    java.util.ArrayList<java.lang.Long> arraylist_long10 = null;
    user5.setGamesRequested(arraylist_long10);
    java.util.ArrayList<java.lang.Long> arraylist_long12 = user5.getInvitesReceived();
    java.lang.String str13 = user5.getPhone();
    float f14 = user5.getFairPlayRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f14 == 1.0f);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    java.lang.String str8 = user5.getPassword();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user5.getMyGames();
    user5.setTimesRated((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long9);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setLocal("hi!");
    game5.setIdOwner(100L);
    boolean b11 = game5.isFinished();
    boolean b12 = game5.isFinished();
    java.lang.String str13 = game5.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long14 = game5.getGuests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long14);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

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
    game5.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long30);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    float f8 = user5.getAbilityRating();
    user5.setPassword("hi!");
    br.edu.ufcg.es.model.Game game16 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long17 = game16.getId();
    java.lang.String str18 = game16.getLocal();
    java.lang.String str19 = game16.getSport();
    java.util.ArrayList<java.lang.Long> arraylist_long20 = game16.getGuests();
    user5.setGamesRequested(arraylist_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long20);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

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
    java.lang.String str22 = game5.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getFavoriteUsers();
    java.lang.String str9 = user5.getAddress();
    java.util.ArrayList<java.lang.Long> arraylist_long10 = user5.getMyGames();
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
    org.junit.Assert.assertNotNull(arraylist_long10);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    int i11 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long12 = user5.getFavoriteUsers();
    java.lang.String str13 = user5.getEmail();
    user5.setAbilityRating((float)35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.util.ArrayList<java.lang.Long> arraylist_long2 = null;
    user0.setGamesRequested(arraylist_long2);
    java.lang.String str4 = user0.getName();
    user0.setAbilityRating((float)52L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

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
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    int i11 = user5.getTimesRated();
    java.lang.String str12 = user5.getPhone();
    java.util.ArrayList<java.lang.Long> arraylist_long13 = user5.getMyGames();
    user5.setId((java.lang.Long)10L);
    java.lang.String str16 = user5.getAddress();
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getGamesRequested();
    user5.setId((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

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
    user5.setName("");
    
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

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "", "hi!");
    java.lang.String str6 = user5.getPassword();
    float f7 = user5.getAbilityRating();
    user5.setAbilityRating((float)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.0f);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "", "hi!");

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

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
    org.junit.Assert.assertNull(str26);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    br.edu.ufcg.es.model.User user2 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = user2.getInvitesReceived();
    java.lang.Long[] long_array6 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long7 = new java.util.ArrayList<java.lang.Long>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long7, long_array6);
    user2.setGamesRequested(arraylist_long7);
    user0.setGamesRequested(arraylist_long7);
    int i11 = user0.getTimesRated();
    user0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "hi!", "");
    java.lang.Long long6 = user5.getId();
    user5.setAddress("");
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user5.getFavoriteUsers();
    java.util.ArrayList<java.lang.Long> arraylist_long10 = user5.getGames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long10);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    user5.setAddress("");
    java.lang.Long long17 = user5.getId();
    java.util.ArrayList<java.lang.Long> arraylist_long18 = user5.getMyGames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long18);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("hi!", "", "", "hi!", "");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getInvitesReceived();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }

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
    user0.setPassword("");
    
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

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

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
    java.util.ArrayList<java.lang.Long> arraylist_long27 = user0.getMyGames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f26 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long27);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

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
    java.lang.String str28 = game0.getDescription();
    game0.setDate("");
    
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

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    user5.setEmail("");
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long10 = user5.getMyGames();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long10);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setFavoriteUsers(arraylist_long5);
    user0.setName("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long10 = user0.getGamesRequested();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long10);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "hi!", "", "", "");
    java.lang.String str6 = game5.getSport();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = game5.getGuests();
    game5.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    boolean b14 = game5.isFinished();
    java.lang.String str15 = game5.getDate();
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "", "hi!");
    java.lang.Long long6 = user5.getId();
    java.lang.String str7 = user5.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getInvitesReceived();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    java.lang.String str13 = game5.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    br.edu.ufcg.es.model.User user2 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = user2.getInvitesReceived();
    java.lang.Long[] long_array6 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long7 = new java.util.ArrayList<java.lang.Long>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long7, long_array6);
    user2.setGamesRequested(arraylist_long7);
    user0.setGamesRequested(arraylist_long7);
    user0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }

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
    java.util.ArrayList<java.lang.Long> arraylist_long55 = user0.getGames();
    
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
    org.junit.Assert.assertNull(arraylist_long55);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    user5.setEmail("");
    user5.setId((java.lang.Long)52L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

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
    game5.setId((long)(byte)0);
    
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

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

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
    user5.setAddress("");
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user31 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game37 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array41 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long42 = new java.util.ArrayList<java.lang.Long>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long42, long_array41);
    game37.setGuestRequests(arraylist_long42);
    user31.setGames(arraylist_long42);
    user25.setMyGames(arraylist_long42);
    user25.setName("");
    java.lang.Long long49 = user25.getId();
    br.edu.ufcg.es.model.User user50 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long51 = user50.getFavoriteUsers();
    br.edu.ufcg.es.model.User user57 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long58 = user57.getGamesRequested();
    java.lang.Long[] long_array63 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long64 = new java.util.ArrayList<java.lang.Long>();
    boolean b65 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long64, long_array63);
    user57.setInvitesReceived(arraylist_long64);
    user57.setAddress("");
    br.edu.ufcg.es.model.User user74 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long75 = user74.getGamesRequested();
    user57.setGames(arraylist_long75);
    user50.setGamesRequested(arraylist_long75);
    user25.setFavoriteUsers(arraylist_long75);
    user5.setInvitesReceived(arraylist_long75);
    
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
    org.junit.Assert.assertNotNull(long_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long75);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

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
    user0.setAddress("hi!");
    
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
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

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
    int i75 = user73.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long76 = user73.getFavoriteUsers();
    br.edu.ufcg.es.model.User user82 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array84 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long85 = new java.util.ArrayList<java.lang.Long>();
    boolean b86 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long85, long_array84);
    user82.setGamesRequested(arraylist_long85);
    user73.setGames(arraylist_long85);
    game5.setGuestRequests(arraylist_long85);
    
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
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setFinished(true);
    java.lang.String str17 = game5.getLocal();
    java.lang.String str18 = game5.getLocal();
    game5.setSport("hi!");
    long long21 = game5.getId();
    game5.setLocal("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 0L);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    float f20 = user5.getAbilityRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f20 == 0.0f);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    float f2 = user0.getFairPlayRating();
    java.lang.Long long3 = user0.getId();
    java.lang.String str4 = user0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setDate("hi!");
    game5.setSport("hi!");

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setDate("hi!");
    game5.setSport("");
    game5.setDate("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long12 = game5.getGuests();
    long long13 = game5.getIdOwner();
    br.edu.ufcg.es.model.Game game19 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game19.setDate("hi!");
    game19.setLocal("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long24 = game19.getGuests();
    game5.setGuestRequests(arraylist_long24);
    java.lang.String str26 = game5.getDate();
    long long27 = game5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 0L);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

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
    br.edu.ufcg.es.model.User user56 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "hi!", "");
    java.lang.Long long57 = user56.getId();
    java.lang.Long long58 = user56.getId();
    java.lang.String str59 = user56.getAddress();
    int i60 = user56.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long61 = user56.getMyGames();
    game5.setGuestRequests(arraylist_long61);
    
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
    org.junit.Assert.assertNull(long57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + ""+ "'", str59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long61);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

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
    java.util.ArrayList<java.lang.Long> arraylist_long20 = game5.getGuestsRequests();
    
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
    org.junit.Assert.assertNotNull(arraylist_long20);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    java.lang.String str8 = game5.getSport();
    long long9 = game5.getIdOwner();
    java.util.ArrayList<java.lang.Long> arraylist_long10 = game5.getGuestsRequests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long10);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

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
    java.lang.String str12 = user0.getPassword();
    
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
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setDate("hi!");
    game5.setSport("");
    game5.setDate("hi!");
    boolean b12 = game5.isFinished();
    game5.setDate("");
    game5.setDescription("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

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
    user5.setPhone("");
    
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

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    int i11 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long12 = user5.getFavoriteUsers();
    java.lang.String str13 = user5.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.lang.String str2 = user0.getPhone();
    user0.computeRating(100.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

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
    br.edu.ufcg.es.model.User user44 = new br.edu.ufcg.es.model.User("", "hi!", "", "", "hi!");
    br.edu.ufcg.es.model.Game game50 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array54 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long55 = new java.util.ArrayList<java.lang.Long>();
    boolean b56 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long55, long_array54);
    game50.setGuestRequests(arraylist_long55);
    boolean b58 = game50.isFinished();
    game50.setId((long)'#');
    br.edu.ufcg.es.model.User user66 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long67 = user66.getGamesRequested();
    java.lang.Long[] long_array72 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long73 = new java.util.ArrayList<java.lang.Long>();
    boolean b74 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long73, long_array72);
    user66.setInvitesReceived(arraylist_long73);
    game50.setGuestRequests(arraylist_long73);
    java.util.ArrayList<java.lang.Long> arraylist_long77 = game50.getGuests();
    user44.setGamesRequested(arraylist_long77);
    user5.setMyGames(arraylist_long77);
    
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
    org.junit.Assert.assertNotNull(long_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long77);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "hi!", "hi!", "", "hi!");
    br.edu.ufcg.es.model.User user11 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long12 = user11.getGamesRequested();
    int i13 = user11.getTimesRated();
    int i14 = user11.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long15 = user11.getMyGames();
    game5.setGuests(arraylist_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long15);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long long2 = user0.getId();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = user0.getGames();
    br.edu.ufcg.es.model.User user4 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long5 = user4.getInvitesReceived();
    java.lang.Long long6 = user4.getId();
    br.edu.ufcg.es.model.User user7 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user7.getFavoriteUsers();
    br.edu.ufcg.es.model.User user14 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long15 = user14.getGamesRequested();
    java.lang.Long[] long_array20 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long21 = new java.util.ArrayList<java.lang.Long>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long21, long_array20);
    user14.setInvitesReceived(arraylist_long21);
    user14.setAddress("");
    br.edu.ufcg.es.model.User user31 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long32 = user31.getGamesRequested();
    user14.setGames(arraylist_long32);
    user7.setGamesRequested(arraylist_long32);
    user4.setGames(arraylist_long32);
    user0.setGames(arraylist_long32);
    java.util.ArrayList<java.lang.Long> arraylist_long37 = user0.getFavoriteUsers();
    java.lang.String str38 = user0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

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
    java.lang.String str35 = game5.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    int i8 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user5.getGames();
    br.edu.ufcg.es.model.Game game10 = new br.edu.ufcg.es.model.Game();
    game10.setId((long)' ');
    br.edu.ufcg.es.model.User user18 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game24 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array28 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long29 = new java.util.ArrayList<java.lang.Long>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long29, long_array28);
    game24.setGuestRequests(arraylist_long29);
    user18.setGames(arraylist_long29);
    br.edu.ufcg.es.model.User user38 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long39 = user38.getGamesRequested();
    int i40 = user38.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long41 = user38.getFavoriteUsers();
    user18.setGames(arraylist_long41);
    java.lang.String str43 = user18.getName();
    br.edu.ufcg.es.model.User user49 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long50 = user49.getGamesRequested();
    int i51 = user49.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long52 = user49.getGamesRequested();
    user18.setMyGames(arraylist_long52);
    game10.setGuestRequests(arraylist_long52);
    user5.setInvitesReceived(arraylist_long52);
    java.lang.String str56 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + ""+ "'", str43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + ""+ "'", str56.equals(""));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

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
    user0.setTimesRated((int)(byte)1);
    br.edu.ufcg.es.model.Game game42 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array46 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long47 = new java.util.ArrayList<java.lang.Long>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long47, long_array46);
    game42.setGuestRequests(arraylist_long47);
    java.lang.String str50 = game42.getDate();
    br.edu.ufcg.es.model.Game game56 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array60 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long61 = new java.util.ArrayList<java.lang.Long>();
    boolean b62 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long61, long_array60);
    game56.setGuestRequests(arraylist_long61);
    java.lang.String str64 = game56.getDescription();
    java.util.ArrayList<java.lang.Long> arraylist_long65 = game56.getGuestsRequests();
    game42.setGuests(arraylist_long65);
    user0.setGames(arraylist_long65);
    
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
    org.junit.Assert.assertNotNull(long_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!"+ "'", str64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long65);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    user0.computeRating((float)10L, (float)10);
    user0.computeRating(100.0f, (float)52L);
    java.lang.String str8 = user0.getAddress();
    user0.setTimesRated(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "", "", "hi!", "");

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setName("hi!");
    game5.setDate("");
    java.lang.String str17 = game5.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setDate("hi!");
    game5.setLocal("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long10 = game5.getGuests();
    java.lang.String str11 = game5.getDate();
    game5.setName("");
    java.lang.String str14 = game5.getDescription();
    boolean b15 = game5.isFinished();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }

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
    java.util.ArrayList<java.lang.Long> arraylist_long32 = user0.getGamesRequested();
    java.lang.Long long33 = user0.getId();
    
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
    org.junit.Assert.assertNull(long33);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    java.lang.String str15 = user5.getName();
    user5.setAbilityRating((float)100L);
    
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
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }

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
    br.edu.ufcg.es.model.User user32 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long33 = user32.getFavoriteUsers();
    br.edu.ufcg.es.model.Game game34 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long35 = game34.getGuests();
    br.edu.ufcg.es.model.User user41 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game47 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array51 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long52 = new java.util.ArrayList<java.lang.Long>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long52, long_array51);
    game47.setGuestRequests(arraylist_long52);
    user41.setGames(arraylist_long52);
    java.util.ArrayList<java.lang.Long> arraylist_long56 = user41.getMyGames();
    game34.setGuestRequests(arraylist_long56);
    user32.setGames(arraylist_long56);
    game5.setGuests(arraylist_long56);
    long long60 = game5.getIdOwner();
    
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
    org.junit.Assert.assertNull(arraylist_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long60 == 0L);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setGamesRequested(arraylist_long5);
    float f8 = user0.getFairPlayRating();
    java.lang.String str9 = user0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "hi!", "", "hi!", "");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = game5.getGuests();
    long long7 = game5.getIdOwner();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }

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
    br.edu.ufcg.es.model.User user18 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long19 = user18.getInvitesReceived();
    java.lang.Long long20 = user18.getId();
    br.edu.ufcg.es.model.User user21 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long22 = user21.getFavoriteUsers();
    br.edu.ufcg.es.model.User user28 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long29 = user28.getGamesRequested();
    java.lang.Long[] long_array34 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long35 = new java.util.ArrayList<java.lang.Long>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long35, long_array34);
    user28.setInvitesReceived(arraylist_long35);
    user28.setAddress("");
    br.edu.ufcg.es.model.User user45 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long46 = user45.getGamesRequested();
    user28.setGames(arraylist_long46);
    user21.setGamesRequested(arraylist_long46);
    user18.setGames(arraylist_long46);
    java.util.ArrayList<java.lang.Long> arraylist_long50 = user18.getFavoriteUsers();
    user18.setAddress("");
    java.lang.Long long53 = user18.getId();
    java.util.ArrayList<java.lang.Long> arraylist_long54 = user18.getGames();
    user0.setMyGames(arraylist_long54);
    
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
    org.junit.Assert.assertNull(arraylist_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long54);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }

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
    long long21 = game5.getIdOwner();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == (-1L));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }

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
    user0.setFairPlayRating((float)(short)10);
    user0.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    java.lang.String str15 = user5.getName();
    user5.setName("");
    
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
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }

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
    user0.computeRating((float)'a', (float)'#');
    user0.setPhone("");
    
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
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }

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
    game5.setIdOwner(0L);
    game5.setSport("hi!");
    
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
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "hi!", "", "hi!", "");
    java.lang.String str6 = game5.getDescription();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = game5.getGuestsRequests();
    long long8 = game5.getIdOwner();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    game5.setDate("");
    game5.setDate("hi!");
    java.lang.String str18 = game5.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }

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
    br.edu.ufcg.es.model.User user32 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long33 = user32.getFavoriteUsers();
    br.edu.ufcg.es.model.Game game34 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long35 = game34.getGuests();
    br.edu.ufcg.es.model.User user41 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game47 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array51 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long52 = new java.util.ArrayList<java.lang.Long>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long52, long_array51);
    game47.setGuestRequests(arraylist_long52);
    user41.setGames(arraylist_long52);
    java.util.ArrayList<java.lang.Long> arraylist_long56 = user41.getMyGames();
    game34.setGuestRequests(arraylist_long56);
    user32.setGames(arraylist_long56);
    game5.setGuests(arraylist_long56);
    game5.setDescription("");
    
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
    org.junit.Assert.assertNull(arraylist_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long56);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getPassword();
    user5.setFairPlayRating((float)0);
    java.util.ArrayList<java.lang.Long> arraylist_long10 = user5.getFavoriteUsers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long10);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }

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
    java.util.ArrayList<java.lang.Long> arraylist_long21 = user5.getGamesRequested();
    
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
    org.junit.Assert.assertNotNull(arraylist_long21);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setFinished(true);
    java.lang.String str17 = game5.getLocal();
    game5.setIdOwner((long)(short)-1);
    game5.setIdOwner((long)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }

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
    user5.setName("");
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

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    java.lang.String str8 = user5.getPassword();
    user5.setId((java.lang.Long)10L);
    br.edu.ufcg.es.model.User user16 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game22 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array26 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long27 = new java.util.ArrayList<java.lang.Long>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long27, long_array26);
    game22.setGuestRequests(arraylist_long27);
    user16.setGames(arraylist_long27);
    java.util.ArrayList<java.lang.Long> arraylist_long31 = user16.getGamesRequested();
    user5.setGames(arraylist_long31);
    user5.computeRating((float)(short)100, (float)'#');
    java.lang.String str36 = user5.getEmail();
    int i37 = user5.getTimesRated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    user0.computeRating((float)10L, (float)10);
    user0.computeRating(100.0f, (float)52L);
    java.lang.String str8 = user0.getAddress();
    user0.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setFavoriteUsers(arraylist_long5);
    user0.setName("hi!");
    user0.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }

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
    user0.setEmail("hi!");
    java.lang.String str15 = user0.getName();
    
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
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setSport("hi!");
    game5.setId((long)(byte)100);
    java.lang.String str11 = game5.getLocal();
    boolean b12 = game5.isFinished();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getPassword();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getFavoriteUsers();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user5.getGames();
    float f10 = user5.getFairPlayRating();
    br.edu.ufcg.es.model.User user16 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array18 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long19 = new java.util.ArrayList<java.lang.Long>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long19, long_array18);
    user16.setGamesRequested(arraylist_long19);
    int i22 = user16.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long23 = user16.getFavoriteUsers();
    user5.setGamesRequested(arraylist_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f10 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long23);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }

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
    int i12 = user0.getTimesRated();
    
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
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    java.lang.String str8 = user5.getPassword();
    user5.setId((java.lang.Long)10L);
    br.edu.ufcg.es.model.User user16 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game22 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array26 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long27 = new java.util.ArrayList<java.lang.Long>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long27, long_array26);
    game22.setGuestRequests(arraylist_long27);
    user16.setGames(arraylist_long27);
    java.util.ArrayList<java.lang.Long> arraylist_long31 = user16.getGamesRequested();
    user5.setGames(arraylist_long31);
    user5.computeRating((float)(short)100, (float)'#');
    java.util.ArrayList<java.lang.Long> arraylist_long36 = user5.getFavoriteUsers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long36);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }

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
    java.lang.String str96 = user5.getPhone();
    user5.setEmail("hi!");
    java.lang.String str99 = user5.getEmail();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str96 + "' != '" + ""+ "'", str96.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str99 + "' != '" + "hi!"+ "'", str99.equals("hi!"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    boolean b19 = game11.isFinished();
    game11.setId((long)'#');
    br.edu.ufcg.es.model.User user27 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long28 = user27.getGamesRequested();
    java.lang.Long[] long_array33 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long34 = new java.util.ArrayList<java.lang.Long>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long34, long_array33);
    user27.setInvitesReceived(arraylist_long34);
    game11.setGuestRequests(arraylist_long34);
    java.util.ArrayList<java.lang.Long> arraylist_long38 = game11.getGuests();
    user5.setGamesRequested(arraylist_long38);
    br.edu.ufcg.es.model.Game game45 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array49 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long50 = new java.util.ArrayList<java.lang.Long>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long50, long_array49);
    game45.setGuestRequests(arraylist_long50);
    boolean b53 = game45.isFinished();
    boolean b54 = game45.isFinished();
    game45.setId((long)(byte)0);
    java.util.ArrayList<java.lang.Long> arraylist_long57 = game45.getGuestsRequests();
    user5.setFavoriteUsers(arraylist_long57);
    java.util.ArrayList<java.lang.Long> arraylist_long59 = user5.getMyGames();
    java.lang.Long long60 = user5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long60);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }

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
    java.lang.String str60 = game5.getSport();
    
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
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + ""+ "'", str60.equals(""));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }

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
    float f32 = user0.getFairPlayRating();
    java.lang.String str33 = user0.getName();
    
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
    org.junit.Assert.assertTrue(f32 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }

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
    boolean b31 = game5.isFinished();
    
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
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("hi!", "hi!", "hi!", "", "");
    user5.computeRating((float)100, 0.0f);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }

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
    user0.computeRating((float)(short)0, (float)1);
    java.lang.String str41 = user0.getName();
    java.lang.Long long42 = user0.getId();
    
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
    org.junit.Assert.assertNull(str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long42);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }

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
    game5.setLocal("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long35 = game5.getGuestsRequests();
    game5.setName("");
    
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
    org.junit.Assert.assertNotNull(arraylist_long35);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }

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
    float f32 = user0.getFairPlayRating();
    br.edu.ufcg.es.model.User user38 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game44 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array48 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long49 = new java.util.ArrayList<java.lang.Long>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long49, long_array48);
    game44.setGuestRequests(arraylist_long49);
    user38.setGames(arraylist_long49);
    java.util.ArrayList<java.lang.Long> arraylist_long53 = user38.getGamesRequested();
    user0.setFavoriteUsers(arraylist_long53);
    user0.setEmail("hi!");
    
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
    org.junit.Assert.assertTrue(f32 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long53);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    int i11 = user5.getTimesRated();
    user5.setPassword("hi!");
    br.edu.ufcg.es.model.User user19 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long20 = user19.getGamesRequested();
    java.lang.Long[] long_array25 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long26 = new java.util.ArrayList<java.lang.Long>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long26, long_array25);
    user19.setInvitesReceived(arraylist_long26);
    java.lang.String str29 = user19.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long30 = user19.getFavoriteUsers();
    br.edu.ufcg.es.model.User user31 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long32 = user31.getFavoriteUsers();
    java.lang.Long[] long_array35 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long36 = new java.util.ArrayList<java.lang.Long>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long36, long_array35);
    user31.setFavoriteUsers(arraylist_long36);
    user19.setInvitesReceived(arraylist_long36);
    br.edu.ufcg.es.model.User user45 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long46 = user45.getGamesRequested();
    int i47 = user45.getTimesRated();
    int i48 = user45.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long49 = user45.getMyGames();
    user19.setInvitesReceived(arraylist_long49);
    user5.setInvitesReceived(arraylist_long49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long49);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }

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
    float f65 = user5.getFairPlayRating();
    
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
    org.junit.Assert.assertTrue(f65 == 0.0f);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    user5.setEmail("");
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user5.getGamesRequested();
    user5.setFairPlayRating((float)' ');
    user5.setFairPlayRating((float)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long9);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }

    br.edu.ufcg.es.model.Game game0 = new br.edu.ufcg.es.model.Game();
    java.lang.String str1 = game0.getDate();
    java.lang.String str2 = game0.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((-1L));
    java.util.ArrayList<java.lang.Long> arraylist_long15 = game5.getGuests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long15);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "hi!", "", "hi!", "");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = game5.getGuests();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = game5.getGuestsRequests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setGamesRequested(arraylist_long5);
    java.lang.Long long8 = user0.getId();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user0.getMyGames();
    int i10 = user0.getTimesRated();
    
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
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }

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
    java.lang.String str28 = user0.getAddress();
    user0.setTimesRated((int)'4');
    user0.computeRating((float)100, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }

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
    game0.setIdOwner((long)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long22);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "", "", "hi!");
    float f6 = user5.getAbilityRating();
    br.edu.ufcg.es.model.User user12 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array14 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long15 = new java.util.ArrayList<java.lang.Long>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long15, long_array14);
    user12.setGamesRequested(arraylist_long15);
    user12.setTimesRated((int)(byte)-1);
    java.lang.String str20 = user12.getEmail();
    user12.setPassword("");
    java.lang.Long long23 = user12.getId();
    br.edu.ufcg.es.model.User user24 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long25 = user24.getFavoriteUsers();
    br.edu.ufcg.es.model.User user31 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long32 = user31.getGamesRequested();
    java.lang.Long[] long_array37 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long38 = new java.util.ArrayList<java.lang.Long>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long38, long_array37);
    user31.setInvitesReceived(arraylist_long38);
    user31.setAddress("");
    br.edu.ufcg.es.model.User user48 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long49 = user48.getGamesRequested();
    user31.setGames(arraylist_long49);
    user24.setGamesRequested(arraylist_long49);
    user12.setFavoriteUsers(arraylist_long49);
    user5.setGamesRequested(arraylist_long49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long49);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    boolean b15 = game5.isFinished();
    game5.setDescription("");
    game5.setDescription("hi!");
    game5.setLocal("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setIdOwner((long)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }

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
    float f27 = user5.getAbilityRating();
    
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
    org.junit.Assert.assertTrue(f27 == 0.0f);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }

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
    java.util.ArrayList<java.lang.Long> arraylist_long27 = user0.getInvitesReceived();
    user0.setTimesRated((int)'#');
    
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
    org.junit.Assert.assertNull(arraylist_long27);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getGamesRequested();
    user5.setAddress("");
    user5.setFairPlayRating((float)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    user5.setTimesRated((int)(byte)-1);
    user5.setPhone("");
    br.edu.ufcg.es.model.User user20 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long21 = user20.getGamesRequested();
    int i22 = user20.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long23 = user20.getFavoriteUsers();
    br.edu.ufcg.es.model.User user29 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array31 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long32 = new java.util.ArrayList<java.lang.Long>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long32, long_array31);
    user29.setGamesRequested(arraylist_long32);
    user20.setGames(arraylist_long32);
    user20.setPhone("hi!");
    user20.setPhone("hi!");
    br.edu.ufcg.es.model.User user45 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long46 = user45.getGamesRequested();
    int i47 = user45.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long48 = user45.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long49 = user45.getInvitesReceived();
    user20.setFavoriteUsers(arraylist_long49);
    user5.setGames(arraylist_long49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long49);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    boolean b14 = game5.isFinished();
    game5.setName("hi!");
    java.lang.String str17 = game5.getLocal();
    game5.setDate("");
    long long20 = game5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 0L);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setDate("hi!");
    game5.setLocal("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long10 = game5.getGuests();
    java.lang.String str11 = game5.getDate();
    game5.setName("");
    java.lang.String str14 = game5.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setIdOwner((long)(byte)10);
    game5.setFinished(false);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    boolean b14 = game5.isFinished();
    game5.setSport("");
    java.lang.String str17 = game5.getDate();
    java.lang.String str18 = game5.getName();
    java.lang.String str19 = game5.getName();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }

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
    java.lang.String str13 = user0.getName();
    user0.setAbilityRating((-1.0f));
    
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
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }

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
    user5.setAbilityRating((float)10);
    java.util.ArrayList<java.lang.Long> arraylist_long98 = user5.getInvitesReceived();
    float f99 = user5.getAbilityRating();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f99 == 10.0f);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }

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
    java.util.ArrayList<java.lang.Long> arraylist_long22 = user0.getGamesRequested();
    
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
    org.junit.Assert.assertNull(arraylist_long22);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    long long15 = game5.getIdOwner();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 52L);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setFavoriteUsers(arraylist_long5);
    float f8 = user0.getAbilityRating();
    float f9 = user0.getFairPlayRating();
    br.edu.ufcg.es.model.User user10 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long11 = user10.getFavoriteUsers();
    java.lang.Long[] long_array14 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long15 = new java.util.ArrayList<java.lang.Long>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long15, long_array14);
    user10.setFavoriteUsers(arraylist_long15);
    br.edu.ufcg.es.model.User user18 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long19 = user18.getFavoriteUsers();
    java.lang.Long[] long_array22 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long23 = new java.util.ArrayList<java.lang.Long>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long23, long_array22);
    user18.setFavoriteUsers(arraylist_long23);
    user10.setFavoriteUsers(arraylist_long23);
    user0.setInvitesReceived(arraylist_long23);
    
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
    org.junit.Assert.assertNull(arraylist_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }

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
    int i55 = user0.getTimesRated();
    
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
    org.junit.Assert.assertTrue(i55 == 0);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    boolean b15 = game5.isFinished();
    game5.setDescription("");
    game5.setDescription("hi!");
    game5.setIdOwner((long)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    boolean b15 = game5.isFinished();
    java.lang.String str16 = game5.getSport();
    java.util.ArrayList<java.lang.Long> arraylist_long17 = game5.getGuestsRequests();
    boolean b18 = game5.isFinished();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    boolean b14 = game5.isFinished();
    game5.setName("hi!");
    java.lang.String str17 = game5.getLocal();
    game5.setId(100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }

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
    br.edu.ufcg.es.model.User user37 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long38 = user37.getGamesRequested();
    java.lang.Long[] long_array43 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long44 = new java.util.ArrayList<java.lang.Long>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long44, long_array43);
    user37.setInvitesReceived(arraylist_long44);
    java.lang.String str47 = user37.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long48 = user37.getFavoriteUsers();
    br.edu.ufcg.es.model.User user49 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long50 = user49.getFavoriteUsers();
    java.lang.Long[] long_array53 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long54 = new java.util.ArrayList<java.lang.Long>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long54, long_array53);
    user49.setFavoriteUsers(arraylist_long54);
    user37.setInvitesReceived(arraylist_long54);
    br.edu.ufcg.es.model.User user63 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long64 = user63.getGamesRequested();
    int i65 = user63.getTimesRated();
    int i66 = user63.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long67 = user63.getMyGames();
    user37.setInvitesReceived(arraylist_long67);
    user0.setMyGames(arraylist_long67);
    
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
    org.junit.Assert.assertNotNull(arraylist_long38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + ""+ "'", str47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long67);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.String str6 = game5.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setDescription("");
    java.lang.String str10 = game5.getDate();
    br.edu.ufcg.es.model.User user16 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long17 = user16.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long18 = user16.getInvitesReceived();
    java.util.ArrayList<java.lang.Long> arraylist_long19 = user16.getMyGames();
    game5.setGuestRequests(arraylist_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long19);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "hi!", "");
    java.lang.Long long6 = user5.getId();
    java.lang.Long long7 = user5.getId();
    java.lang.String str8 = user5.getAddress();
    int i9 = user5.getTimesRated();
    user5.setAbilityRating(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }

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
    float f22 = user0.getFairPlayRating();
    
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
    org.junit.Assert.assertTrue(f22 == 0.0f);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }

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
    java.lang.String str32 = game5.getLocal();
    
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
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }

    br.edu.ufcg.es.model.Game game0 = new br.edu.ufcg.es.model.Game();
    game0.setSport("hi!");
    java.lang.String str3 = game0.getSport();
    game0.setSport("hi!");
    game0.setIdOwner(35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    boolean b14 = game5.isFinished();
    game5.setName("hi!");
    java.lang.String str17 = game5.getLocal();
    long long18 = game5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }

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
    long long25 = game5.getId();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 0L);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }

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
    java.lang.Long long58 = user5.getId();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long58);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    java.lang.String str15 = game5.getDate();
    game5.setDescription("");
    game5.setLocal("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }

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
    java.util.ArrayList<java.lang.Long> arraylist_long38 = user0.getGames();
    
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
    org.junit.Assert.assertNull(arraylist_long38);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    java.lang.String str8 = user5.getPassword();
    user5.setId((java.lang.Long)100L);
    java.lang.String str11 = user5.getPassword();
    java.util.ArrayList<java.lang.Long> arraylist_long12 = user5.getGames();
    java.util.ArrayList<java.lang.Long> arraylist_long13 = user5.getMyGames();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long13);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    user5.setTimesRated((int)(byte)-1);
    java.util.ArrayList<java.lang.Long> arraylist_long13 = user5.getGames();
    user5.setFairPlayRating((float)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long13);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }

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
    java.lang.Long long33 = user0.getId();
    
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
    org.junit.Assert.assertNull(long33);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    java.lang.String str8 = game5.getSport();
    long long9 = game5.getIdOwner();
    boolean b10 = game5.isFinished();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    long long7 = game5.getIdOwner();
    java.lang.String str8 = game5.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long long2 = user0.getId();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = user0.getGames();
    java.lang.Long long4 = user0.getId();
    java.lang.String str5 = user0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }

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
    java.lang.String str26 = game0.getLocal();
    java.lang.String str27 = game0.getSport();
    game0.setIdOwner(100L);
    
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
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "hi!", "");
    java.lang.Long long6 = user5.getId();
    java.lang.String str7 = user5.getPassword();
    user5.setFairPlayRating((float)(short)-1);
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    game5.setDate("");
    boolean b16 = game5.isFinished();
    game5.setDescription("hi!");
    game5.setName("hi!");
    java.lang.String str21 = game5.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }

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
    user0.setFairPlayRating((float)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    br.edu.ufcg.es.model.Game game19 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array23 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long24 = new java.util.ArrayList<java.lang.Long>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long24, long_array23);
    game19.setGuestRequests(arraylist_long24);
    boolean b27 = game19.isFinished();
    game19.setId((long)'#');
    br.edu.ufcg.es.model.User user35 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long36 = user35.getGamesRequested();
    java.lang.Long[] long_array41 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long42 = new java.util.ArrayList<java.lang.Long>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long42, long_array41);
    user35.setInvitesReceived(arraylist_long42);
    game19.setGuestRequests(arraylist_long42);
    java.util.ArrayList<java.lang.Long> arraylist_long46 = game19.getGuests();
    br.edu.ufcg.es.model.User user52 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long53 = user52.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long54 = user52.getInvitesReceived();
    game19.setGuestRequests(arraylist_long54);
    game5.setGuests(arraylist_long54);
    br.edu.ufcg.es.model.User user62 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long63 = user62.getGamesRequested();
    java.lang.Long[] long_array68 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long69 = new java.util.ArrayList<java.lang.Long>();
    boolean b70 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long69, long_array68);
    user62.setInvitesReceived(arraylist_long69);
    user62.setAddress("");
    br.edu.ufcg.es.model.User user79 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long80 = user79.getGamesRequested();
    user62.setGames(arraylist_long80);
    br.edu.ufcg.es.model.User user87 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long88 = user87.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long89 = user87.getInvitesReceived();
    user62.setGamesRequested(arraylist_long89);
    game5.setGuestRequests(arraylist_long89);
    game5.setLocal("");
    java.lang.String str94 = game5.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str94 + "' != '" + "hi!"+ "'", str94.equals("hi!"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getFavoriteUsers();
    user5.setFairPlayRating((float)(-1));
    java.lang.String str11 = user5.getAddress();
    float f12 = user5.getFairPlayRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f12 == (-1.0f));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }

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
    float f41 = user5.getAbilityRating();
    br.edu.ufcg.es.model.Game game47 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long48 = game47.getId();
    game47.setSport("hi!");
    game47.setFinished(false);
    br.edu.ufcg.es.model.User user58 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game64 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array68 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long69 = new java.util.ArrayList<java.lang.Long>();
    boolean b70 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long69, long_array68);
    game64.setGuestRequests(arraylist_long69);
    user58.setGames(arraylist_long69);
    br.edu.ufcg.es.model.User user78 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long79 = user78.getGamesRequested();
    int i80 = user78.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long81 = user78.getFavoriteUsers();
    user58.setGames(arraylist_long81);
    java.lang.String str83 = user58.getName();
    user58.setPassword("");
    user58.setTimesRated((int)(byte)100);
    java.util.ArrayList<java.lang.Long> arraylist_long88 = user58.getGames();
    game47.setGuests(arraylist_long88);
    user5.setInvitesReceived(arraylist_long88);
    java.lang.String str91 = user5.getEmail();
    
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
    org.junit.Assert.assertTrue(f41 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long48 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str83 + "' != '" + ""+ "'", str83.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str91 + "' != '" + ""+ "'", str91.equals(""));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }

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
    game5.setLocal("hi!");
    
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
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }

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
    user5.setId((java.lang.Long)52L);
    float f39 = user5.getFairPlayRating();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f39 == 0.0f);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "hi!", "");
    java.lang.Long long6 = user5.getId();
    int i7 = user5.getTimesRated();
    java.lang.String str8 = user5.getPhone();
    user5.setFairPlayRating(52.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    java.lang.String str8 = user5.getPassword();
    user5.setId((java.lang.Long)100L);
    user5.setTimesRated(100);
    java.util.ArrayList<java.lang.Long> arraylist_long13 = null;
    user5.setGamesRequested(arraylist_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }

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
    java.util.ArrayList<java.lang.Long> arraylist_long45 = user5.getInvitesReceived();
    
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

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setDate("");
    java.lang.String str10 = game5.getDate();
    long long11 = game5.getId();
    boolean b12 = game5.isFinished();
    java.lang.String str13 = game5.getName();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getFavoriteUsers();
    user5.setFairPlayRating((float)(-1));
    float f11 = user5.getAbilityRating();
    user5.setFairPlayRating((float)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 0.0f);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("hi!", "hi!", "hi!", "hi!", "");

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    int i11 = user5.getTimesRated();
    java.lang.String str12 = user5.getPhone();
    java.util.ArrayList<java.lang.Long> arraylist_long13 = user5.getMyGames();
    java.util.ArrayList<java.lang.Long> arraylist_long14 = user5.getFavoriteUsers();
    
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
    org.junit.Assert.assertNotNull(arraylist_long14);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setName("hi!");
    game5.setId((long)'#');
    long long17 = game5.getId();
    game5.setDescription("hi!");
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array27 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long28 = new java.util.ArrayList<java.lang.Long>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long28, long_array27);
    user25.setGamesRequested(arraylist_long28);
    int i31 = user25.getTimesRated();
    java.lang.String str32 = user25.getPhone();
    java.util.ArrayList<java.lang.Long> arraylist_long33 = user25.getMyGames();
    game5.setGuestRequests(arraylist_long33);
    game5.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long33);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    java.lang.String str13 = game5.getDescription();
    java.lang.String str14 = game5.getName();
    game5.setIdOwner((long)(short)-1);
    game5.setDate("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setFinished(true);
    java.lang.String str17 = game5.getLocal();
    game5.setIdOwner((long)(short)-1);
    game5.setFinished(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setGamesRequested(arraylist_long5);
    br.edu.ufcg.es.model.User user13 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "hi!", "");
    java.lang.Long long14 = user13.getId();
    user13.setAddress("");
    java.util.ArrayList<java.lang.Long> arraylist_long17 = user13.getFavoriteUsers();
    user0.setMyGames(arraylist_long17);
    java.lang.String str19 = user0.getEmail();
    java.util.ArrayList<java.lang.Long> arraylist_long20 = user0.getGames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long20);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setLocal("hi!");
    game5.setIdOwner(100L);
    boolean b11 = game5.isFinished();
    boolean b12 = game5.isFinished();
    java.lang.String str13 = game5.getName();
    game5.setFinished(true);
    
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
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    int i8 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user5.getFavoriteUsers();
    user5.setTimesRated((int)(byte)1);
    java.lang.String str12 = user5.getPhone();
    java.util.ArrayList<java.lang.Long> arraylist_long13 = user5.getFavoriteUsers();
    java.lang.String str14 = user5.getPhone();
    
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
    org.junit.Assert.assertNotNull(arraylist_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    user5.setPhone("");
    java.util.ArrayList<java.lang.Long> arraylist_long13 = user5.getGamesRequested();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long13);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    game11.setGuestRequests(arraylist_long16);
    user5.setGames(arraylist_long16);
    java.util.ArrayList<java.lang.Long> arraylist_long20 = user5.getMyGames();
    java.util.ArrayList<java.lang.Long> arraylist_long21 = user5.getMyGames();
    br.edu.ufcg.es.model.Game game27 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long28 = game27.getId();
    game27.setSport("hi!");
    game27.setName("");
    br.edu.ufcg.es.model.User user38 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long39 = user38.getGamesRequested();
    user38.setEmail("");
    java.util.ArrayList<java.lang.Long> arraylist_long42 = user38.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long43 = user38.getMyGames();
    game27.setGuestRequests(arraylist_long43);
    user5.setInvitesReceived(arraylist_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long28 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long43);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    user5.setFairPlayRating((float)(byte)1);
    java.util.ArrayList<java.lang.Long> arraylist_long10 = null;
    user5.setGamesRequested(arraylist_long10);
    java.util.ArrayList<java.lang.Long> arraylist_long12 = user5.getInvitesReceived();
    user5.setFairPlayRating((float)1L);
    br.edu.ufcg.es.model.User user15 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long16 = user15.getInvitesReceived();
    br.edu.ufcg.es.model.User user17 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long18 = user17.getInvitesReceived();
    java.lang.Long[] long_array21 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long22 = new java.util.ArrayList<java.lang.Long>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long22, long_array21);
    user17.setGamesRequested(arraylist_long22);
    user15.setGamesRequested(arraylist_long22);
    float f26 = user15.getFairPlayRating();
    user15.setPassword("hi!");
    user15.setId((java.lang.Long)1L);
    br.edu.ufcg.es.model.User user36 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long37 = user36.getGamesRequested();
    java.lang.String str38 = user36.getEmail();
    int i39 = user36.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long40 = user36.getFavoriteUsers();
    user15.setMyGames(arraylist_long40);
    user5.setGames(arraylist_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f26 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + ""+ "'", str38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long40);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }

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
    java.lang.String str43 = user5.getName();
    java.lang.Long long44 = user5.getId();
    
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
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + ""+ "'", str43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long44);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    int i8 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user5.getFavoriteUsers();
    user5.setTimesRated((int)(byte)1);
    user5.setFairPlayRating((float)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long9);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "", "", "hi!");
    user5.setTimesRated(100);
    br.edu.ufcg.es.model.Game game13 = new br.edu.ufcg.es.model.Game("", "hi!", "", "hi!", "");
    java.util.ArrayList<java.lang.Long> arraylist_long14 = game13.getGuests();
    user5.setGames(arraylist_long14);
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long14);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setSport("hi!");
    game5.setFinished(false);
    br.edu.ufcg.es.model.Game game16 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array20 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long21 = new java.util.ArrayList<java.lang.Long>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long21, long_array20);
    game16.setGuestRequests(arraylist_long21);
    boolean b24 = game16.isFinished();
    boolean b25 = game16.isFinished();
    br.edu.ufcg.es.model.User user26 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long27 = user26.getFavoriteUsers();
    br.edu.ufcg.es.model.Game game28 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long29 = game28.getGuests();
    br.edu.ufcg.es.model.User user35 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game41 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array45 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long46 = new java.util.ArrayList<java.lang.Long>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long46, long_array45);
    game41.setGuestRequests(arraylist_long46);
    user35.setGames(arraylist_long46);
    java.util.ArrayList<java.lang.Long> arraylist_long50 = user35.getMyGames();
    game28.setGuestRequests(arraylist_long50);
    user26.setGames(arraylist_long50);
    game16.setGuestRequests(arraylist_long50);
    br.edu.ufcg.es.model.User user59 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game65 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array69 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long70 = new java.util.ArrayList<java.lang.Long>();
    boolean b71 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long70, long_array69);
    game65.setGuestRequests(arraylist_long70);
    user59.setGames(arraylist_long70);
    br.edu.ufcg.es.model.User user79 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long80 = user79.getGamesRequested();
    int i81 = user79.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long82 = user79.getFavoriteUsers();
    user59.setGames(arraylist_long82);
    game16.setGuests(arraylist_long82);
    game5.setGuestRequests(arraylist_long82);
    java.lang.String str86 = game5.getSport();
    game5.setIdOwner((long)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str86 + "' != '" + "hi!"+ "'", str86.equals("hi!"));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }

    br.edu.ufcg.es.model.Game game0 = new br.edu.ufcg.es.model.Game();
    game0.setSport("hi!");
    java.lang.String str3 = game0.getSport();
    game0.setSport("hi!");
    java.lang.String str6 = game0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    float f8 = user5.getAbilityRating();
    user5.setPassword("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long11 = user5.getGames();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long11);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getPassword();
    br.edu.ufcg.es.model.User user13 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array15 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    user13.setGamesRequested(arraylist_long16);
    user5.setGames(arraylist_long16);
    java.lang.String str20 = user5.getPassword();
    int i21 = user5.getTimesRated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }

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
    java.lang.String str28 = user0.getAddress();
    java.lang.String str29 = user0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "hi!", "hi!", "", "hi!");
    game5.setSport("hi!");

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setFinished(true);
    java.lang.String str10 = game5.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long11 = null;
    game5.setGuestRequests(arraylist_long11);
    game5.setDescription("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    boolean b14 = game5.isFinished();
    game5.setFinished(false);
    boolean b17 = game5.isFinished();
    java.lang.String str18 = game5.getDate();
    java.lang.String str19 = game5.getName();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setFinished(true);
    game5.setSport("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    java.lang.Long long11 = user5.getId();
    java.lang.Long long12 = user5.getId();
    java.util.ArrayList<java.lang.Long> arraylist_long13 = user5.getGamesRequested();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long13);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long long2 = user0.getId();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = user0.getGames();
    br.edu.ufcg.es.model.User user4 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long5 = user4.getInvitesReceived();
    java.lang.Long long6 = user4.getId();
    br.edu.ufcg.es.model.User user7 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user7.getFavoriteUsers();
    br.edu.ufcg.es.model.User user14 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long15 = user14.getGamesRequested();
    java.lang.Long[] long_array20 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long21 = new java.util.ArrayList<java.lang.Long>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long21, long_array20);
    user14.setInvitesReceived(arraylist_long21);
    user14.setAddress("");
    br.edu.ufcg.es.model.User user31 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long32 = user31.getGamesRequested();
    user14.setGames(arraylist_long32);
    user7.setGamesRequested(arraylist_long32);
    user4.setGames(arraylist_long32);
    user0.setGames(arraylist_long32);
    float f37 = user0.getAbilityRating();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f37 == 0.0f);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    br.edu.ufcg.es.model.User user2 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = user2.getInvitesReceived();
    java.lang.Long[] long_array6 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long7 = new java.util.ArrayList<java.lang.Long>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long7, long_array6);
    user2.setGamesRequested(arraylist_long7);
    user0.setGamesRequested(arraylist_long7);
    float f11 = user0.getFairPlayRating();
    user0.setPassword("hi!");
    user0.setId((java.lang.Long)1L);
    br.edu.ufcg.es.model.User user21 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long22 = user21.getGamesRequested();
    java.lang.String str23 = user21.getEmail();
    int i24 = user21.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long25 = user21.getFavoriteUsers();
    user0.setMyGames(arraylist_long25);
    java.util.ArrayList<java.lang.Long> arraylist_long27 = user0.getGames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long27);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    game5.setDescription("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("hi!", "", "", "hi!", "hi!");
    br.edu.ufcg.es.model.Game game11 = new br.edu.ufcg.es.model.Game("", "hi!", "", "hi!", "");
    game11.setSport("");
    br.edu.ufcg.es.model.User user14 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long15 = user14.getFavoriteUsers();
    java.lang.Long[] long_array18 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long19 = new java.util.ArrayList<java.lang.Long>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long19, long_array18);
    user14.setFavoriteUsers(arraylist_long19);
    br.edu.ufcg.es.model.User user27 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game33 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array37 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long38 = new java.util.ArrayList<java.lang.Long>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long38, long_array37);
    game33.setGuestRequests(arraylist_long38);
    user27.setGames(arraylist_long38);
    br.edu.ufcg.es.model.User user47 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long48 = user47.getGamesRequested();
    int i49 = user47.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long50 = user47.getFavoriteUsers();
    user27.setGames(arraylist_long50);
    java.lang.String str52 = user27.getName();
    user27.setAbilityRating((float)0L);
    br.edu.ufcg.es.model.User user60 = new br.edu.ufcg.es.model.User("", "hi!", "", "", "hi!");
    br.edu.ufcg.es.model.Game game66 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array70 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long71 = new java.util.ArrayList<java.lang.Long>();
    boolean b72 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long71, long_array70);
    game66.setGuestRequests(arraylist_long71);
    boolean b74 = game66.isFinished();
    game66.setId((long)'#');
    br.edu.ufcg.es.model.User user82 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long83 = user82.getGamesRequested();
    java.lang.Long[] long_array88 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long89 = new java.util.ArrayList<java.lang.Long>();
    boolean b90 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long89, long_array88);
    user82.setInvitesReceived(arraylist_long89);
    game66.setGuestRequests(arraylist_long89);
    java.util.ArrayList<java.lang.Long> arraylist_long93 = game66.getGuests();
    user60.setGamesRequested(arraylist_long93);
    user27.setFavoriteUsers(arraylist_long93);
    user14.setFavoriteUsers(arraylist_long93);
    game11.setGuestRequests(arraylist_long93);
    user5.setFavoriteUsers(arraylist_long93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + ""+ "'", str52.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long93);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "", "", "hi!", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = game5.getGuests();
    game5.setId((long)(short)0);
    java.lang.String str9 = game5.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    java.util.ArrayList<java.lang.Long> arraylist_long13 = game5.getGuestsRequests();
    java.lang.String str14 = game5.getDate();
    game5.setId((long)(byte)0);
    game5.setId(100L);
    br.edu.ufcg.es.model.User user19 = new br.edu.ufcg.es.model.User();
    br.edu.ufcg.es.model.User user25 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game31 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array35 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long36 = new java.util.ArrayList<java.lang.Long>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long36, long_array35);
    game31.setGuestRequests(arraylist_long36);
    user25.setGames(arraylist_long36);
    user19.setMyGames(arraylist_long36);
    user19.setName("");
    java.lang.Long long43 = user19.getId();
    br.edu.ufcg.es.model.User user44 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long45 = user44.getFavoriteUsers();
    br.edu.ufcg.es.model.User user51 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long52 = user51.getGamesRequested();
    java.lang.Long[] long_array57 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long58 = new java.util.ArrayList<java.lang.Long>();
    boolean b59 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long58, long_array57);
    user51.setInvitesReceived(arraylist_long58);
    user51.setAddress("");
    br.edu.ufcg.es.model.User user68 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long69 = user68.getGamesRequested();
    user51.setGames(arraylist_long69);
    user44.setGamesRequested(arraylist_long69);
    user19.setFavoriteUsers(arraylist_long69);
    game5.setGuestRequests(arraylist_long69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long69);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    java.util.ArrayList<java.lang.Long> arraylist_long13 = game5.getGuestsRequests();
    java.lang.String str14 = game5.getDate();
    game5.setSport("hi!");
    java.lang.String str17 = game5.getLocal();
    game5.setIdOwner((long)(short)10);
    game5.setDescription("");
    br.edu.ufcg.es.model.User user27 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game33 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array37 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long38 = new java.util.ArrayList<java.lang.Long>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long38, long_array37);
    game33.setGuestRequests(arraylist_long38);
    user27.setGames(arraylist_long38);
    br.edu.ufcg.es.model.User user47 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long48 = user47.getGamesRequested();
    int i49 = user47.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long50 = user47.getFavoriteUsers();
    user27.setGames(arraylist_long50);
    java.lang.String str52 = user27.getName();
    br.edu.ufcg.es.model.User user58 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long59 = user58.getGamesRequested();
    int i60 = user58.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long61 = user58.getGamesRequested();
    user27.setMyGames(arraylist_long61);
    game5.setGuests(arraylist_long61);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + ""+ "'", str52.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long61);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }

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
    java.lang.String str29 = game5.getDescription();
    game5.setName("");
    
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
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setDate("");
    game5.setIdOwner(0L);
    java.lang.String str12 = game5.getName();
    game5.setIdOwner((long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }

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
    java.util.ArrayList<java.lang.Long> arraylist_long63 = user5.getGames();
    
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
    org.junit.Assert.assertNotNull(arraylist_long63);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }

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
    user5.setFairPlayRating((float)0);
    
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

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }

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
    user5.setFairPlayRating((float)(byte)-1);
    
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

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getFavoriteUsers();
    user0.computeRating((float)10L, (float)10);
    user0.computeRating(100.0f, (float)52L);
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user0.getGames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long8);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    user5.setAddress("");
    user5.setEmail("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long19 = null;
    user5.setInvitesReceived(arraylist_long19);
    java.lang.String str21 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    boolean b15 = game5.isFinished();
    game5.setId(35L);
    game5.setIdOwner((-1L));
    java.lang.String str20 = game5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "hi!", "", "hi!");
    java.lang.String str6 = user5.getPassword();
    float f7 = user5.getAbilityRating();
    int i8 = user5.getTimesRated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    user5.setEmail("");
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user5.getGamesRequested();
    user5.setPhone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long9);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    user5.setAddress("");
    int i17 = user5.getTimesRated();
    java.lang.String str18 = user5.getAddress();
    java.lang.String str19 = user5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    java.lang.String str15 = user5.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long16 = user5.getFavoriteUsers();
    java.lang.String str17 = user5.getPassword();
    user5.setTimesRated(100);
    
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
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setFinished(true);
    java.lang.String str10 = game5.getDate();
    java.lang.String str11 = game5.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    java.lang.String str7 = game5.getLocal();
    game5.setDate("");
    game5.setDate("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setFinished(true);
    java.lang.String str17 = game5.getLocal();
    java.lang.String str18 = game5.getLocal();
    java.lang.String str19 = game5.getDescription();
    game5.setName("");
    game5.setId(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }

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
    float f96 = user5.getAbilityRating();
    float f97 = user5.getFairPlayRating();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f96 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f97 == 0.0f);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }

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
    game5.setDescription("hi!");
    br.edu.ufcg.es.model.Game game52 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array56 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long57 = new java.util.ArrayList<java.lang.Long>();
    boolean b58 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long57, long_array56);
    game52.setGuestRequests(arraylist_long57);
    br.edu.ufcg.es.model.Game game65 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array69 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long70 = new java.util.ArrayList<java.lang.Long>();
    boolean b71 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long70, long_array69);
    game65.setGuestRequests(arraylist_long70);
    java.lang.String str73 = game65.getDate();
    java.util.ArrayList<java.lang.Long> arraylist_long74 = game65.getGuestsRequests();
    game52.setGuestRequests(arraylist_long74);
    br.edu.ufcg.es.model.User user81 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long82 = user81.getGamesRequested();
    java.lang.String str83 = user81.getPassword();
    java.util.ArrayList<java.lang.Long> arraylist_long84 = user81.getFavoriteUsers();
    game52.setGuests(arraylist_long84);
    game5.setGuestRequests(arraylist_long84);
    
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
    org.junit.Assert.assertNotNull(long_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + "hi!"+ "'", str73.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str83 + "' != '" + ""+ "'", str83.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long84);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }

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
    game5.setFinished(true);
    
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

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((-1L));
    java.lang.String str15 = game5.getDescription();
    java.util.ArrayList<java.lang.Long> arraylist_long16 = game5.getGuestsRequests();
    game5.setDescription("hi!");
    game5.setIdOwner((long)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long16);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "hi!", "", "hi!", "");
    java.lang.String str6 = game5.getDescription();
    long long7 = game5.getId();
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
    game5.setGuests(arraylist_long90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
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

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    java.lang.String str13 = game5.getDate();
    game5.setIdOwner(0L);
    game5.setId((long)(byte)100);
    java.util.ArrayList<java.lang.Long> arraylist_long18 = game5.getGuestsRequests();
    java.lang.String str19 = game5.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array7 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    user5.setGamesRequested(arraylist_long8);
    user5.setTimesRated((int)(byte)-1);
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getPassword();
    java.util.ArrayList<java.lang.Long> arraylist_long15 = user5.getGamesRequested();
    java.lang.String str16 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    java.lang.String str13 = game5.getDate();
    game5.setIdOwner(0L);
    java.lang.String str16 = game5.getSport();
    game5.setDescription("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    game5.setDate("");
    game5.setDate("hi!");
    game5.setDate("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    user5.setAddress("");
    float f17 = user5.getAbilityRating();
    java.lang.String str18 = user5.getEmail();
    java.lang.String str19 = user5.getPassword();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "hi!", "");
    user5.setTimesRated((int)(short)0);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }

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
    br.edu.ufcg.es.model.User user43 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array45 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long46 = new java.util.ArrayList<java.lang.Long>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long46, long_array45);
    user43.setGamesRequested(arraylist_long46);
    int i49 = user43.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long50 = user43.getFavoriteUsers();
    user0.setMyGames(arraylist_long50);
    user0.setPassword("hi!");
    
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
    org.junit.Assert.assertNotNull(long_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long50);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "", "hi!", "hi!", "");
    java.lang.String str6 = game5.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setFinished(true);
    java.lang.String str17 = game5.getLocal();
    java.util.ArrayList<java.lang.Long> arraylist_long18 = game5.getGuests();
    game5.setLocal("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long18);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    user0.setEmail("hi!");
    br.edu.ufcg.es.model.User user8 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user8.getGamesRequested();
    java.lang.Long[] long_array14 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long15 = new java.util.ArrayList<java.lang.Long>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long15, long_array14);
    user8.setInvitesReceived(arraylist_long15);
    user0.setGamesRequested(arraylist_long15);
    user0.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    boolean b13 = game5.isFinished();
    boolean b14 = game5.isFinished();
    long long15 = game5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }

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
    java.util.ArrayList<java.lang.Long> arraylist_long32 = user0.getGamesRequested();
    user0.setAddress("");
    
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

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    user5.setFairPlayRating((float)(byte)1);
    java.util.ArrayList<java.lang.Long> arraylist_long10 = user5.getFavoriteUsers();
    br.edu.ufcg.es.model.User user16 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long17 = user16.getGamesRequested();
    java.lang.Long[] long_array22 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long23 = new java.util.ArrayList<java.lang.Long>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long23, long_array22);
    user16.setInvitesReceived(arraylist_long23);
    user16.setAddress("");
    br.edu.ufcg.es.model.User user33 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long34 = user33.getGamesRequested();
    user16.setGames(arraylist_long34);
    br.edu.ufcg.es.model.User user41 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long42 = user41.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long43 = user41.getInvitesReceived();
    user16.setGamesRequested(arraylist_long43);
    user5.setFavoriteUsers(arraylist_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long43);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long[] long_array4 = new java.lang.Long[] { 10L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long5, long_array4);
    user0.setGamesRequested(arraylist_long5);
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user0.getGames();
    java.lang.Long long9 = user0.getId();
    java.util.ArrayList<java.lang.Long> arraylist_long10 = user0.getGamesRequested();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long10);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }

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
    game5.setDescription("hi!");
    
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

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setSport("hi!");
    game5.setFinished(false);
    br.edu.ufcg.es.model.Game game16 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array20 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long21 = new java.util.ArrayList<java.lang.Long>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long21, long_array20);
    game16.setGuestRequests(arraylist_long21);
    boolean b24 = game16.isFinished();
    boolean b25 = game16.isFinished();
    br.edu.ufcg.es.model.User user26 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long27 = user26.getFavoriteUsers();
    br.edu.ufcg.es.model.Game game28 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long29 = game28.getGuests();
    br.edu.ufcg.es.model.User user35 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game41 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array45 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long46 = new java.util.ArrayList<java.lang.Long>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long46, long_array45);
    game41.setGuestRequests(arraylist_long46);
    user35.setGames(arraylist_long46);
    java.util.ArrayList<java.lang.Long> arraylist_long50 = user35.getMyGames();
    game28.setGuestRequests(arraylist_long50);
    user26.setGames(arraylist_long50);
    game16.setGuestRequests(arraylist_long50);
    br.edu.ufcg.es.model.User user59 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game65 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array69 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long70 = new java.util.ArrayList<java.lang.Long>();
    boolean b71 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long70, long_array69);
    game65.setGuestRequests(arraylist_long70);
    user59.setGames(arraylist_long70);
    br.edu.ufcg.es.model.User user79 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long80 = user79.getGamesRequested();
    int i81 = user79.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long82 = user79.getFavoriteUsers();
    user59.setGames(arraylist_long82);
    game16.setGuests(arraylist_long82);
    game5.setGuestRequests(arraylist_long82);
    java.lang.String str86 = game5.getSport();
    game5.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str86 + "' != '" + "hi!"+ "'", str86.equals("hi!"));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "hi!", "", "hi!", "");
    game5.setIdOwner((long)(short)0);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setLocal("hi!");
    game5.setIdOwner(100L);
    boolean b11 = game5.isFinished();
    boolean b12 = game5.isFinished();
    game5.setName("hi!");
    game5.setFinished(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("hi!", "", "hi!", "", "");

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }

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
    java.lang.String str20 = game5.getDate();
    game5.setSport("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("", "hi!", "hi!", "hi!", "");

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    java.lang.String str15 = user5.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long16 = user5.getFavoriteUsers();
    java.lang.String str17 = user5.getPassword();
    java.util.ArrayList<java.lang.Long> arraylist_long18 = user5.getGamesRequested();
    user5.setTimesRated((int)(byte)0);
    
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
    org.junit.Assert.assertNotNull(arraylist_long18);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setSport("hi!");
    game5.setFinished(false);
    long long11 = game5.getId();
    java.lang.String str12 = game5.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    java.util.ArrayList<java.lang.Long> arraylist_long13 = game5.getGuestsRequests();
    java.lang.String str14 = game5.getDate();
    game5.setSport("hi!");
    game5.setSport("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long19 = game5.getGuests();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long19);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }

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
    game0.setDate("hi!");
    boolean b56 = game0.isFinished();
    
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
    org.junit.Assert.assertTrue(b56 == false);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }

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
    game5.setSport("");
    
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

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    user5.setFairPlayRating((float)(byte)1);
    java.util.ArrayList<java.lang.Long> arraylist_long10 = null;
    user5.setGamesRequested(arraylist_long10);
    java.util.ArrayList<java.lang.Long> arraylist_long12 = user5.getInvitesReceived();
    java.lang.String str13 = user5.getPhone();
    java.util.ArrayList<java.lang.Long> arraylist_long14 = null;
    user5.setGames(arraylist_long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    user5.setFairPlayRating((float)(byte)1);
    java.util.ArrayList<java.lang.Long> arraylist_long10 = null;
    user5.setGamesRequested(arraylist_long10);
    java.util.ArrayList<java.lang.Long> arraylist_long12 = user5.getInvitesReceived();
    java.util.ArrayList<java.lang.Long> arraylist_long13 = user5.getFavoriteUsers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long13);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    long long6 = game5.getId();
    game5.setLocal("hi!");
    game5.setIdOwner(100L);
    boolean b11 = game5.isFinished();
    boolean b12 = game5.isFinished();
    br.edu.ufcg.es.model.Game game18 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array22 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long23 = new java.util.ArrayList<java.lang.Long>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long23, long_array22);
    game18.setGuestRequests(arraylist_long23);
    boolean b26 = game18.isFinished();
    boolean b27 = game18.isFinished();
    game18.setId((long)(byte)0);
    java.util.ArrayList<java.lang.Long> arraylist_long30 = game18.getGuestsRequests();
    game5.setGuests(arraylist_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long30);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }

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
    br.edu.ufcg.es.model.Game game26 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array30 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long31 = new java.util.ArrayList<java.lang.Long>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long31, long_array30);
    game26.setGuestRequests(arraylist_long31);
    boolean b34 = game26.isFinished();
    game26.setId((long)'#');
    java.lang.String str37 = game26.getDate();
    br.edu.ufcg.es.model.User user43 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long44 = user43.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long45 = user43.getInvitesReceived();
    game26.setGuests(arraylist_long45);
    user0.setInvitesReceived(arraylist_long45);
    java.lang.String str48 = user0.getEmail();
    
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
    org.junit.Assert.assertNotNull(long_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }

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
    java.util.ArrayList<java.lang.Long> arraylist_long74 = user0.getGamesRequested();
    user0.setTimesRated((int)(byte)-1);
    
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
    org.junit.Assert.assertNotNull(arraylist_long74);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    int i7 = user5.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long9 = user5.getInvitesReceived();
    user5.setAddress("");
    user5.setAbilityRating((float)52L);
    br.edu.ufcg.es.model.User user14 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long15 = user14.getFavoriteUsers();
    java.lang.Long[] long_array18 = new java.lang.Long[] { 10L, (-1L) };
    java.util.ArrayList<java.lang.Long> arraylist_long19 = new java.util.ArrayList<java.lang.Long>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long19, long_array18);
    user14.setFavoriteUsers(arraylist_long19);
    br.edu.ufcg.es.model.Game game22 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long23 = game22.getGuests();
    br.edu.ufcg.es.model.User user29 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game35 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array39 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long40 = new java.util.ArrayList<java.lang.Long>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long40, long_array39);
    game35.setGuestRequests(arraylist_long40);
    user29.setGames(arraylist_long40);
    java.util.ArrayList<java.lang.Long> arraylist_long44 = user29.getMyGames();
    game22.setGuestRequests(arraylist_long44);
    game22.setSport("hi!");
    game22.setSport("hi!");
    java.lang.String str50 = game22.getDate();
    br.edu.ufcg.es.model.Game game51 = new br.edu.ufcg.es.model.Game();
    java.util.ArrayList<java.lang.Long> arraylist_long52 = game51.getGuests();
    br.edu.ufcg.es.model.User user58 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game64 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array68 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long69 = new java.util.ArrayList<java.lang.Long>();
    boolean b70 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long69, long_array68);
    game64.setGuestRequests(arraylist_long69);
    user58.setGames(arraylist_long69);
    java.util.ArrayList<java.lang.Long> arraylist_long73 = user58.getMyGames();
    game51.setGuestRequests(arraylist_long73);
    game22.setGuests(arraylist_long73);
    br.edu.ufcg.es.model.User user81 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game87 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array91 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long92 = new java.util.ArrayList<java.lang.Long>();
    boolean b93 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long92, long_array91);
    game87.setGuestRequests(arraylist_long92);
    user81.setGames(arraylist_long92);
    java.util.ArrayList<java.lang.Long> arraylist_long96 = user81.getMyGames();
    game22.setGuests(arraylist_long96);
    user14.setMyGames(arraylist_long96);
    user5.setFavoriteUsers(arraylist_long96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long96);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = null;
    user0.setGames(arraylist_long1);
    br.edu.ufcg.es.model.User user8 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game14 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array18 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long19 = new java.util.ArrayList<java.lang.Long>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long19, long_array18);
    game14.setGuestRequests(arraylist_long19);
    user8.setGames(arraylist_long19);
    java.util.ArrayList<java.lang.Long> arraylist_long23 = user8.getMyGames();
    user0.setGames(arraylist_long23);
    float f25 = user0.getAbilityRating();
    user0.setPhone("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f25 == 0.0f);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }

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
    float f95 = user5.getFairPlayRating();
    
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
    org.junit.Assert.assertTrue(f95 == 0.0f);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = null;
    user0.setGames(arraylist_long1);
    br.edu.ufcg.es.model.User user8 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game14 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array18 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long19 = new java.util.ArrayList<java.lang.Long>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long19, long_array18);
    game14.setGuestRequests(arraylist_long19);
    user8.setGames(arraylist_long19);
    java.util.ArrayList<java.lang.Long> arraylist_long23 = user8.getMyGames();
    user0.setGames(arraylist_long23);
    br.edu.ufcg.es.model.User user30 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long31 = user30.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long32 = user30.getInvitesReceived();
    java.lang.String str33 = user30.getPassword();
    user30.setId((java.lang.Long)10L);
    br.edu.ufcg.es.model.User user41 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    br.edu.ufcg.es.model.Game game47 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array51 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long52 = new java.util.ArrayList<java.lang.Long>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long52, long_array51);
    game47.setGuestRequests(arraylist_long52);
    user41.setGames(arraylist_long52);
    java.util.ArrayList<java.lang.Long> arraylist_long56 = user41.getGamesRequested();
    user30.setGames(arraylist_long56);
    user0.setFavoriteUsers(arraylist_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long56);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setFinished(false);
    java.util.ArrayList<java.lang.Long> arraylist_long17 = game5.getGuestsRequests();
    game5.setLocal("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long17);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }

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
    br.edu.ufcg.es.model.User user43 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array45 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long46 = new java.util.ArrayList<java.lang.Long>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long46, long_array45);
    user43.setGamesRequested(arraylist_long46);
    int i49 = user43.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long50 = user43.getFavoriteUsers();
    user0.setMyGames(arraylist_long50);
    java.lang.String str52 = user0.getAddress();
    
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
    org.junit.Assert.assertNotNull(long_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str52);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.util.ArrayList<java.lang.Long> arraylist_long7 = user5.getInvitesReceived();
    java.lang.String str8 = user5.getPassword();
    user5.setId((java.lang.Long)10L);
    user5.setTimesRated((int)'#');
    java.util.ArrayList<java.lang.Long> arraylist_long13 = user5.getInvitesReceived();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long13);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    game5.setDate("hi!");
    br.edu.ufcg.es.model.User user13 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long14 = user13.getGamesRequested();
    java.lang.String str15 = user13.getEmail();
    user13.setFairPlayRating((float)(byte)1);
    user13.setPassword("");
    java.lang.String str20 = user13.getAddress();
    java.util.ArrayList<java.lang.Long> arraylist_long21 = user13.getMyGames();
    game5.setGuestRequests(arraylist_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long21);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }

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
    br.edu.ufcg.es.model.User user40 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long41 = user40.getGamesRequested();
    java.lang.Long[] long_array46 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long47 = new java.util.ArrayList<java.lang.Long>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long47, long_array46);
    user40.setInvitesReceived(arraylist_long47);
    user0.setMyGames(arraylist_long47);
    
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
    org.junit.Assert.assertNotNull(arraylist_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((-1L));
    game5.setId(10L);
    game5.setIdOwner((long)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    java.lang.String str15 = user5.getName();
    java.util.ArrayList<java.lang.Long> arraylist_long16 = user5.getFavoriteUsers();
    user5.setAddress("");
    user5.computeRating((float)(byte)-1, (float)100);
    
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

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }

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
    br.edu.ufcg.es.model.User user38 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long39 = user38.getGamesRequested();
    java.lang.String str40 = user38.getPassword();
    br.edu.ufcg.es.model.User user46 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array48 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long49 = new java.util.ArrayList<java.lang.Long>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long49, long_array48);
    user46.setGamesRequested(arraylist_long49);
    user38.setGames(arraylist_long49);
    user5.setInvitesReceived(arraylist_long49);
    
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
    org.junit.Assert.assertNotNull(arraylist_long39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + ""+ "'", str40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }

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
    user0.setAbilityRating((float)(short)0);
    java.lang.String str38 = user0.getPassword();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }

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
    java.util.ArrayList<java.lang.Long> arraylist_long68 = game5.getGuestsRequests();
    
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
    org.junit.Assert.assertNotNull(arraylist_long68);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    game5.setSport("hi!");
    long long17 = game5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 0L);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }

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
    java.lang.String str23 = game5.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }

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
    java.lang.String str36 = game5.getName();
    
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
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    user5.setAddress("");
    int i17 = user5.getTimesRated();
    java.lang.String str18 = user5.getPassword();
    user5.setPassword("");
    user5.setPhone("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }

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
    game5.setId((long)(-1));
    
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

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.String str7 = user5.getEmail();
    user5.setFairPlayRating((float)(byte)1);
    java.util.ArrayList<java.lang.Long> arraylist_long10 = user5.getFavoriteUsers();
    java.lang.String str11 = user5.getPassword();
    java.lang.String str12 = user5.getName();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }

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
    game5.setIdOwner((long)(-1));
    
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

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }

    br.edu.ufcg.es.model.Game game5 = new br.edu.ufcg.es.model.Game("hi!", "", "", "hi!", "");
    java.lang.Long[] long_array9 = new java.lang.Long[] { 10L, (-1L), 1L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    game5.setGuestRequests(arraylist_long10);
    game5.setIdOwner((long)'4');
    java.lang.String str15 = game5.getDate();
    game5.setIdOwner((long)0);
    java.lang.String str18 = game5.getName();
    game5.setSport("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "", "", "hi!");
    java.lang.String str6 = user5.getName();
    br.edu.ufcg.es.model.User user12 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long13 = user12.getGamesRequested();
    int i14 = user12.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long15 = user12.getFavoriteUsers();
    user5.setInvitesReceived(arraylist_long15);
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long15);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }

    br.edu.ufcg.es.model.User user0 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long1 = user0.getInvitesReceived();
    java.lang.Long long2 = user0.getId();
    java.util.ArrayList<java.lang.Long> arraylist_long3 = user0.getGames();
    br.edu.ufcg.es.model.User user4 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long5 = user4.getInvitesReceived();
    java.lang.Long long6 = user4.getId();
    br.edu.ufcg.es.model.User user7 = new br.edu.ufcg.es.model.User();
    java.util.ArrayList<java.lang.Long> arraylist_long8 = user7.getFavoriteUsers();
    br.edu.ufcg.es.model.User user14 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long15 = user14.getGamesRequested();
    java.lang.Long[] long_array20 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long21 = new java.util.ArrayList<java.lang.Long>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long21, long_array20);
    user14.setInvitesReceived(arraylist_long21);
    user14.setAddress("");
    br.edu.ufcg.es.model.User user31 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long32 = user31.getGamesRequested();
    user14.setGames(arraylist_long32);
    user7.setGamesRequested(arraylist_long32);
    user4.setGames(arraylist_long32);
    user0.setGames(arraylist_long32);
    java.lang.String str37 = user0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(arraylist_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str37);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long6 = user5.getGamesRequested();
    java.lang.Long[] long_array11 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long12, long_array11);
    user5.setInvitesReceived(arraylist_long12);
    java.util.ArrayList<java.lang.Long> arraylist_long15 = user5.getInvitesReceived();
    user5.setTimesRated(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long15);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }

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
    boolean b20 = game5.isFinished();
    java.lang.String str21 = game5.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }

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
    float f47 = user5.getAbilityRating();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f47 == 0.0f);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }

    br.edu.ufcg.es.model.User user5 = new br.edu.ufcg.es.model.User("", "hi!", "", "", "hi!");
    user5.setTimesRated(100);
    br.edu.ufcg.es.model.User user13 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long14 = user13.getGamesRequested();
    int i15 = user13.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long16 = user13.getFavoriteUsers();
    br.edu.ufcg.es.model.User user22 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array24 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long25 = new java.util.ArrayList<java.lang.Long>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long25, long_array24);
    user22.setGamesRequested(arraylist_long25);
    user13.setGames(arraylist_long25);
    user13.setPhone("hi!");
    user13.setPhone("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long33 = user13.getMyGames();
    user5.setGames(arraylist_long33);
    br.edu.ufcg.es.model.User user40 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long41 = user40.getGamesRequested();
    int i42 = user40.getTimesRated();
    java.util.ArrayList<java.lang.Long> arraylist_long43 = user40.getFavoriteUsers();
    br.edu.ufcg.es.model.User user49 = new br.edu.ufcg.es.model.User("", "", "", "", "hi!");
    java.lang.Long[] long_array51 = new java.lang.Long[] { 10L };
    java.util.ArrayList<java.lang.Long> arraylist_long52 = new java.util.ArrayList<java.lang.Long>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long52, long_array51);
    user49.setGamesRequested(arraylist_long52);
    user40.setGames(arraylist_long52);
    user40.setPhone("hi!");
    user40.setPhone("hi!");
    java.util.ArrayList<java.lang.Long> arraylist_long60 = user40.getMyGames();
    java.util.ArrayList<java.lang.Long> arraylist_long61 = user40.getGamesRequested();
    user5.setGamesRequested(arraylist_long61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long61);

  }

}
