package br.edu.ufcg.es.randoop.DTO;



import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test001"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    registerGame0.setLocal("");
    java.lang.String str5 = registerGame0.getLocal();
    registerGame0.setName("");
    java.lang.String str8 = registerGame0.getDescription();
    registerGame0.setDescription("hi!");
    registerGame0.setDescription("hi!");
    java.lang.String str13 = registerGame0.getDescription();
    java.lang.String str14 = registerGame0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test002"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    java.lang.String str3 = registerGame0.getSport();
    java.lang.String str4 = registerGame0.getName();
    registerGame0.setDate("");
    java.lang.String str7 = registerGame0.getDescription();
    registerGame0.setLocal("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test003"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDate("");
    java.lang.String str5 = registerGame0.getSport();
    java.lang.String str6 = registerGame0.getDescription();
    java.lang.String str7 = registerGame0.getName();
    registerGame0.setSport("");
    java.lang.String str10 = registerGame0.getName();
    java.lang.String str11 = registerGame0.getSport();
    registerGame0.setName("hi!");
    registerGame0.setDescription("");
    java.lang.String str16 = registerGame0.getDate();
    registerGame0.setDescription("");
    java.lang.String str19 = registerGame0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test004"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    java.lang.String str6 = registerUser0.getPhone();
    java.lang.String str7 = registerUser0.getPassword();
    registerUser0.setAddress("hi!");
    java.lang.String str10 = registerUser0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test005"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    int i1 = ratingParameters0.getAbility();
    int i2 = ratingParameters0.getAbility();
    ratingParameters0.setAbility((int)'a');
    ratingParameters0.setAbility(100);
    ratingParameters0.setAbility((int)(byte)1);
    ratingParameters0.setFairPlay(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test006"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("hi!");
    java.lang.String str3 = authDTO0.getEmail();
    authDTO0.setPassword("");
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("hi!");
    java.lang.String str10 = authDTO0.getEmail();
    authDTO0.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test007"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)10L);
    loginDTO2.setUserId((java.lang.Long)1L);
    loginDTO2.setToken("hi!");
    loginDTO2.setUserId((java.lang.Long)1L);
    loginDTO2.setToken("");
    loginDTO2.setUserId((java.lang.Long)(-1L));
    loginDTO2.setToken("");
    loginDTO2.setUserId((java.lang.Long)1L);
    loginDTO2.setToken("hi!");

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test008"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPhone();
    java.lang.String str5 = registerUser0.getAddress();
    registerUser0.setAddress("hi!");
    registerUser0.setPassword("");
    registerUser0.setPassword("");
    registerUser0.setPassword("hi!");
    java.lang.String str14 = registerUser0.getPassword();
    java.lang.String str15 = registerUser0.getPassword();
    registerUser0.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test009"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    int i5 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay(97);
    ratingParameters0.setAbility((int)'a');
    ratingParameters0.setFairPlay(32);
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay(52);
    ratingParameters0.setFairPlay(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test010"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getName();
    registerGame0.setLocal("");
    java.lang.String str5 = registerGame0.getDate();
    registerGame0.setName("hi!");
    registerGame0.setSport("");
    registerGame0.setLocal("hi!");
    registerGame0.setDescription("hi!");
    registerGame0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test011"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDate("");
    registerGame0.setName("hi!");
    java.lang.String str7 = registerGame0.getDescription();
    java.lang.String str8 = registerGame0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test012"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    ratingParameters0.setFairPlay((int)(short)100);
    int i5 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay((int)'a');
    int i8 = ratingParameters0.getFairPlay();
    int i9 = ratingParameters0.getAbility();
    ratingParameters0.setAbility((int)'#');
    ratingParameters0.setFairPlay((int)' ');
    int i14 = ratingParameters0.getFairPlay();
    int i15 = ratingParameters0.getAbility();
    int i16 = ratingParameters0.getAbility();
    ratingParameters0.setAbility(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 35);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test013"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    registerGame0.setDate("");
    registerGame0.setDescription("hi!");
    registerGame0.setLocal("");
    registerGame0.setLocal("");
    java.lang.String str11 = registerGame0.getSport();
    java.lang.String str12 = registerGame0.getSport();
    java.lang.String str13 = registerGame0.getSport();
    java.lang.String str14 = registerGame0.getDate();
    registerGame0.setDate("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test014"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    java.lang.String str5 = registerGame0.getDescription();
    java.lang.String str6 = registerGame0.getDate();
    java.lang.String str7 = registerGame0.getLocal();
    java.lang.String str8 = registerGame0.getName();
    registerGame0.setSport("");
    registerGame0.setDescription("");
    java.lang.String str13 = registerGame0.getDate();
    registerGame0.setDescription("");
    java.lang.String str16 = registerGame0.getName();
    java.lang.String str17 = registerGame0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test015"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    registerGame0.setSport("hi!");
    java.lang.String str5 = registerGame0.getSport();
    registerGame0.setDate("");
    java.lang.String str8 = registerGame0.getLocal();
    java.lang.String str9 = registerGame0.getSport();
    java.lang.String str10 = registerGame0.getDate();
    registerGame0.setDate("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test016"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setEmail("");
    registerUser0.setPhone("");
    registerUser0.setEmail("");
    registerUser0.setPhone("");
    java.lang.String str14 = registerUser0.getEmail();
    registerUser0.setPhone("hi!");
    java.lang.String str17 = registerUser0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test017"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getAddress();
    registerUser0.setAddress("");
    registerUser0.setAddress("");
    registerUser0.setEmail("hi!");
    registerUser0.setAddress("");
    java.lang.String str16 = registerUser0.getAddress();
    java.lang.String str17 = registerUser0.getPassword();
    java.lang.String str18 = registerUser0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test018"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("hi!", (java.lang.Long)(-1L));
    java.lang.Long long3 = loginDTO2.getUserId();
    java.lang.Long long4 = loginDTO2.getUserId();
    java.lang.String str5 = loginDTO2.getToken();
    java.lang.String str6 = loginDTO2.getToken();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L)+ "'", long3.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L)+ "'", long4.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test019"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    ratingParameters0.setFairPlay((int)(short)100);
    int i5 = ratingParameters0.getFairPlay();
    int i6 = ratingParameters0.getAbility();
    int i7 = ratingParameters0.getFairPlay();
    ratingParameters0.setAbility((int)(byte)100);
    ratingParameters0.setFairPlay((int)(byte)10);
    ratingParameters0.setFairPlay(32);
    int i14 = ratingParameters0.getFairPlay();
    int i15 = ratingParameters0.getFairPlay();
    ratingParameters0.setAbility(35);
    int i18 = ratingParameters0.getFairPlay();
    ratingParameters0.setAbility(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 32);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test020"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getDate();
    registerGame0.setSport("");
    java.lang.String str4 = registerGame0.getDate();
    java.lang.String str5 = registerGame0.getDate();
    java.lang.String str6 = registerGame0.getLocal();
    registerGame0.setDate("hi!");
    java.lang.String str9 = registerGame0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test021"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    java.lang.String str3 = registerUser0.getEmail();
    registerUser0.setEmail("");
    java.lang.String str6 = registerUser0.getEmail();
    java.lang.String str7 = registerUser0.getEmail();
    registerUser0.setEmail("");
    registerUser0.setName("hi!");
    java.lang.String str12 = registerUser0.getEmail();
    java.lang.String str13 = registerUser0.getPassword();
    registerUser0.setEmail("hi!");
    registerUser0.setPassword("");
    registerUser0.setEmail("");
    registerUser0.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test022"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getName();
    java.lang.String str3 = registerGame0.getDescription();
    registerGame0.setLocal("hi!");
    java.lang.String str6 = registerGame0.getDescription();
    registerGame0.setDate("");
    registerGame0.setName("hi!");
    registerGame0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test023"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setPassword("");
    registerUser0.setName("");
    java.lang.String str10 = registerUser0.getEmail();
    registerUser0.setName("");
    registerUser0.setEmail("");
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str19 = registerUser0.getPhone();
    registerUser0.setPassword("");
    registerUser0.setAddress("hi!");
    java.lang.String str24 = registerUser0.getAddress();
    java.lang.String str25 = registerUser0.getPhone();
    java.lang.String str26 = registerUser0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test024"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    java.lang.String str3 = loginDTO2.getToken();
    loginDTO2.setUserId((java.lang.Long)10L);
    java.lang.Long long6 = loginDTO2.getUserId();
    loginDTO2.setToken("hi!");
    loginDTO2.setUserId((java.lang.Long)1L);
    java.lang.String str11 = loginDTO2.getToken();
    java.lang.String str12 = loginDTO2.getToken();
    loginDTO2.setToken("hi!");
    java.lang.Long long15 = loginDTO2.getUserId();
    loginDTO2.setUserId((java.lang.Long)10L);
    java.lang.String str18 = loginDTO2.getToken();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L+ "'", long6.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L+ "'", long15.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test025"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    ratingParameters0.setFairPlay((int)(byte)1);
    ratingParameters0.setAbility(0);
    ratingParameters0.setAbility((int)(byte)0);
    int i11 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay((int)(byte)10);
    ratingParameters0.setFairPlay((int)(byte)10);
    ratingParameters0.setFairPlay(100);
    int i18 = ratingParameters0.getAbility();
    int i19 = ratingParameters0.getAbility();
    int i20 = ratingParameters0.getAbility();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test026"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getName();
    registerGame0.setSport("");
    registerGame0.setDescription("hi!");
    registerGame0.setDate("");
    registerGame0.setDate("");
    java.lang.String str12 = registerGame0.getLocal();
    java.lang.String str13 = registerGame0.getDescription();
    registerGame0.setSport("");
    registerGame0.setLocal("");
    java.lang.String str18 = registerGame0.getName();
    registerGame0.setDescription("");
    java.lang.String str21 = registerGame0.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test027"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    int i3 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay(1);
    int i6 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay(1);
    int i9 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay((int)(byte)10);
    int i12 = ratingParameters0.getFairPlay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test028"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)(-1L));
    java.lang.String str3 = loginDTO2.getToken();
    loginDTO2.setToken("");
    loginDTO2.setUserId((java.lang.Long)0L);
    loginDTO2.setToken("hi!");
    loginDTO2.setToken("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test029"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getAddress();
    registerUser0.setAddress("");
    registerUser0.setAddress("");
    registerUser0.setPhone("");
    java.lang.String str14 = registerUser0.getPassword();
    java.lang.String str15 = registerUser0.getEmail();
    java.lang.String str16 = registerUser0.getPhone();
    registerUser0.setAddress("");
    java.lang.String str19 = registerUser0.getPassword();
    registerUser0.setPassword("hi!");
    java.lang.String str22 = registerUser0.getEmail();
    registerUser0.setPhone("hi!");
    java.lang.String str25 = registerUser0.getPassword();
    java.lang.String str26 = registerUser0.getPhone();
    registerUser0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test030"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getDescription();
    registerGame0.setName("hi!");
    registerGame0.setDate("");
    registerGame0.setDate("hi!");
    java.lang.String str8 = registerGame0.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test031"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    java.lang.Long long3 = loginDTO2.getUserId();
    java.lang.Long long4 = loginDTO2.getUserId();
    java.lang.String str5 = loginDTO2.getToken();
    loginDTO2.setToken("hi!");
    java.lang.String str8 = loginDTO2.getToken();
    loginDTO2.setToken("hi!");
    loginDTO2.setUserId((java.lang.Long)10L);
    loginDTO2.setToken("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L+ "'", long3.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L+ "'", long4.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test032"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setPassword("");
    java.lang.String str8 = registerUser0.getEmail();
    registerUser0.setPhone("hi!");
    java.lang.String str11 = registerUser0.getAddress();
    registerUser0.setAddress("hi!");
    java.lang.String str14 = registerUser0.getPassword();
    registerUser0.setAddress("");
    java.lang.String str17 = registerUser0.getPhone();
    java.lang.String str18 = registerUser0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test033"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    java.lang.String str5 = registerGame0.getDescription();
    java.lang.String str6 = registerGame0.getDescription();
    registerGame0.setName("");
    registerGame0.setDate("");
    registerGame0.setDate("");
    java.lang.String str13 = registerGame0.getSport();
    registerGame0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test034"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getDate();
    java.lang.String str2 = registerGame0.getName();
    java.lang.String str3 = registerGame0.getSport();
    java.lang.String str4 = registerGame0.getLocal();
    java.lang.String str5 = registerGame0.getSport();
    java.lang.String str6 = registerGame0.getLocal();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test035"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setPassword("hi!");
    java.lang.String str8 = registerUser0.getName();
    java.lang.String str9 = registerUser0.getName();
    registerUser0.setEmail("");
    java.lang.String str12 = registerUser0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test036"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    java.lang.String str3 = registerGame0.getSport();
    java.lang.String str4 = registerGame0.getSport();
    java.lang.String str5 = registerGame0.getSport();
    registerGame0.setName("hi!");
    registerGame0.setLocal("");
    java.lang.String str10 = registerGame0.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test037"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    java.lang.String str5 = registerGame0.getDescription();
    java.lang.String str6 = registerGame0.getDate();
    java.lang.String str7 = registerGame0.getDescription();
    java.lang.String str8 = registerGame0.getLocal();
    registerGame0.setName("hi!");
    java.lang.String str11 = registerGame0.getName();
    java.lang.String str12 = registerGame0.getDate();
    java.lang.String str13 = registerGame0.getLocal();
    java.lang.String str14 = registerGame0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test038"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    ratingParameters0.setFairPlay((-1));
    ratingParameters0.setAbility((int)(byte)10);
    ratingParameters0.setAbility((int)(short)0);
    int i11 = ratingParameters0.getAbility();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test039"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    java.lang.String str3 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("hi!");
    authDTO0.setEmail("");
    java.lang.String str12 = authDTO0.getPassword();
    java.lang.String str13 = authDTO0.getPassword();
    java.lang.String str14 = authDTO0.getEmail();
    authDTO0.setPassword("");
    authDTO0.setPassword("");
    java.lang.String str19 = authDTO0.getEmail();
    authDTO0.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test040"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getDescription();
    registerGame0.setLocal("");
    registerGame0.setName("hi!");
    java.lang.String str8 = registerGame0.getDate();
    registerGame0.setLocal("hi!");
    registerGame0.setDescription("hi!");
    registerGame0.setName("hi!");
    registerGame0.setLocal("");
    registerGame0.setDescription("");
    registerGame0.setDescription("");
    registerGame0.setSport("");
    registerGame0.setLocal("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test041"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    loginDTO2.setUserId((java.lang.Long)(-1L));
    java.lang.String str5 = loginDTO2.getToken();
    loginDTO2.setUserId((java.lang.Long)1L);
    java.lang.String str8 = loginDTO2.getToken();
    loginDTO2.setUserId((java.lang.Long)10L);
    java.lang.String str11 = loginDTO2.getToken();
    loginDTO2.setUserId((java.lang.Long)1L);
    java.lang.Long long14 = loginDTO2.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L+ "'", long14.equals(1L));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test042"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    ratingParameters0.setFairPlay((int)(byte)1);
    ratingParameters0.setAbility(0);
    ratingParameters0.setAbility((int)(byte)0);
    int i11 = ratingParameters0.getAbility();
    int i12 = ratingParameters0.getFairPlay();
    int i13 = ratingParameters0.getAbility();
    ratingParameters0.setAbility(52);
    ratingParameters0.setAbility((int)'a');
    ratingParameters0.setAbility((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test043"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    java.lang.String str1 = registerUser0.getPassword();
    java.lang.String str2 = registerUser0.getPhone();
    java.lang.String str3 = registerUser0.getPassword();
    java.lang.String str4 = registerUser0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test044"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO0 = new br.edu.ufcg.es.model.DTO.LoginDTO();
    java.lang.Long long1 = loginDTO0.getUserId();
    java.lang.Long long2 = loginDTO0.getUserId();
    loginDTO0.setToken("");
    loginDTO0.setUserId((java.lang.Long)1L);
    java.lang.Long long7 = loginDTO0.getUserId();
    loginDTO0.setToken("");
    loginDTO0.setToken("hi!");
    loginDTO0.setToken("");
    java.lang.Long long14 = loginDTO0.getUserId();
    java.lang.String str15 = loginDTO0.getToken();
    java.lang.String str16 = loginDTO0.getToken();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L+ "'", long7.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L+ "'", long14.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test045"); }

    br.edu.ufcg.es.model.DTO.SearchDTO searchDTO1 = new br.edu.ufcg.es.model.DTO.SearchDTO("");
    searchDTO1.setName("");
    searchDTO1.setName("hi!");
    java.lang.String str6 = searchDTO1.getName();
    java.lang.String str7 = searchDTO1.getName();
    java.lang.String str8 = searchDTO1.getName();
    java.lang.String str9 = searchDTO1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test046"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getDescription();
    java.lang.String str2 = registerGame0.getName();
    java.lang.String str3 = registerGame0.getSport();
    registerGame0.setLocal("");
    registerGame0.setSport("");
    registerGame0.setLocal("hi!");
    registerGame0.setName("hi!");
    registerGame0.setDate("hi!");
    java.lang.String str14 = registerGame0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test047"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    registerUser0.setPassword("");
    registerUser0.setAddress("hi!");
    registerUser0.setAddress("");
    java.lang.String str11 = registerUser0.getPhone();
    registerUser0.setPhone("");
    java.lang.String str14 = registerUser0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test048"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("hi!", (java.lang.Long)100L);
    loginDTO2.setToken("");
    java.lang.String str5 = loginDTO2.getToken();
    loginDTO2.setToken("");
    java.lang.String str8 = loginDTO2.getToken();
    java.lang.String str9 = loginDTO2.getToken();
    loginDTO2.setToken("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test049"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    registerUser0.setPassword("");
    registerUser0.setName("");
    java.lang.String str9 = registerUser0.getPhone();
    java.lang.String str10 = registerUser0.getAddress();
    java.lang.String str11 = registerUser0.getAddress();
    registerUser0.setPhone("hi!");
    java.lang.String str14 = registerUser0.getPassword();
    java.lang.String str15 = registerUser0.getPassword();
    registerUser0.setPassword("hi!");
    registerUser0.setAddress("");
    java.lang.String str20 = registerUser0.getPassword();
    java.lang.String str21 = registerUser0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test050"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getAddress();
    java.lang.String str8 = registerUser0.getEmail();
    java.lang.String str9 = registerUser0.getPassword();
    java.lang.String str10 = registerUser0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test051"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getDescription();
    java.lang.String str4 = registerGame0.getSport();
    java.lang.String str5 = registerGame0.getDate();
    registerGame0.setDate("hi!");
    registerGame0.setSport("");
    java.lang.String str10 = registerGame0.getSport();
    java.lang.String str11 = registerGame0.getLocal();
    registerGame0.setDate("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test052"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    registerGame0.setDate("hi!");
    java.lang.String str5 = registerGame0.getLocal();
    registerGame0.setName("hi!");
    java.lang.String str8 = registerGame0.getLocal();
    registerGame0.setDate("");
    java.lang.String str11 = registerGame0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test053"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    int i5 = ratingParameters0.getFairPlay();
    int i6 = ratingParameters0.getAbility();
    ratingParameters0.setAbility(35);
    int i9 = ratingParameters0.getFairPlay();
    ratingParameters0.setAbility((int)(short)100);
    int i12 = ratingParameters0.getAbility();
    ratingParameters0.setAbility((int)' ');
    int i15 = ratingParameters0.getFairPlay();
    int i16 = ratingParameters0.getAbility();
    ratingParameters0.setAbility(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test054"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    int i3 = ratingParameters0.getFairPlay();
    int i4 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay(0);
    ratingParameters0.setFairPlay(0);
    ratingParameters0.setFairPlay(0);
    ratingParameters0.setAbility(35);
    ratingParameters0.setAbility((int)' ');
    ratingParameters0.setAbility((int)(byte)10);
    ratingParameters0.setAbility((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test055"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setPassword("");
    registerUser0.setName("");
    java.lang.String str10 = registerUser0.getEmail();
    registerUser0.setPhone("");
    java.lang.String str13 = registerUser0.getPhone();
    java.lang.String str14 = registerUser0.getPhone();
    java.lang.String str15 = registerUser0.getPhone();
    java.lang.String str16 = registerUser0.getName();
    java.lang.String str17 = registerUser0.getPhone();
    registerUser0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test056"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setAddress("hi!");
    registerUser0.setName("hi!");
    java.lang.String str8 = registerUser0.getPassword();
    registerUser0.setAddress("");
    registerUser0.setPassword("hi!");
    registerUser0.setPassword("");
    registerUser0.setPhone("hi!");
    registerUser0.setEmail("hi!");
    registerUser0.setPhone("hi!");
    registerUser0.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test057"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    java.lang.String str6 = registerUser0.getEmail();
    registerUser0.setEmail("hi!");
    registerUser0.setPassword("");
    java.lang.String str11 = registerUser0.getAddress();
    java.lang.String str12 = registerUser0.getName();
    java.lang.String str13 = registerUser0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test058"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    ratingParameters0.setFairPlay((int)(short)100);
    int i5 = ratingParameters0.getFairPlay();
    int i6 = ratingParameters0.getAbility();
    int i7 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay((int)(short)1);
    ratingParameters0.setAbility((int)'4');
    ratingParameters0.setFairPlay((int)(byte)-1);
    int i14 = ratingParameters0.getAbility();
    ratingParameters0.setAbility((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 52);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test059"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    int i1 = ratingParameters0.getAbility();
    int i2 = ratingParameters0.getAbility();
    ratingParameters0.setAbility((int)'a');
    ratingParameters0.setFairPlay(35);
    int i7 = ratingParameters0.getFairPlay();
    ratingParameters0.setAbility((int)' ');
    ratingParameters0.setAbility(1);
    ratingParameters0.setAbility(10);
    ratingParameters0.setFairPlay(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test060"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setPhone("");
    registerUser0.setEmail("hi!");
    registerUser0.setAddress("hi!");
    java.lang.String str12 = registerUser0.getAddress();
    java.lang.String str13 = registerUser0.getEmail();
    java.lang.String str14 = registerUser0.getName();
    registerUser0.setName("");
    registerUser0.setAddress("hi!");
    java.lang.String str19 = registerUser0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test061"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    ratingParameters0.setAbility((int)(byte)-1);
    ratingParameters0.setAbility((int)'a');
    ratingParameters0.setAbility((int)(short)1);
    ratingParameters0.setFairPlay(35);
    ratingParameters0.setAbility(35);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test062"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    java.lang.String str6 = registerUser0.getPassword();
    registerUser0.setPassword("");
    registerUser0.setPassword("hi!");
    java.lang.String str11 = registerUser0.getEmail();
    registerUser0.setAddress("hi!");
    registerUser0.setPhone("");
    java.lang.String str16 = registerUser0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test063"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    java.lang.String str6 = registerUser0.getPassword();
    registerUser0.setAddress("hi!");
    java.lang.String str9 = registerUser0.getAddress();
    registerUser0.setName("");
    registerUser0.setPhone("");
    java.lang.String str14 = registerUser0.getAddress();
    java.lang.String str15 = registerUser0.getPassword();
    registerUser0.setName("");
    registerUser0.setAddress("");
    registerUser0.setPhone("hi!");
    java.lang.String str22 = registerUser0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test064"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    loginDTO2.setUserId((java.lang.Long)(-1L));
    java.lang.String str5 = loginDTO2.getToken();
    java.lang.String str6 = loginDTO2.getToken();
    loginDTO2.setUserId((java.lang.Long)1L);
    loginDTO2.setToken("hi!");
    java.lang.Long long11 = loginDTO2.getUserId();
    loginDTO2.setToken("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L+ "'", long11.equals(1L));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test065"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    java.lang.String str3 = registerGame0.getDescription();
    registerGame0.setLocal("");
    registerGame0.setName("");
    registerGame0.setDate("hi!");
    registerGame0.setDate("hi!");
    java.lang.String str12 = registerGame0.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test066"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    ratingParameters0.setFairPlay((int)(byte)1);
    ratingParameters0.setAbility(0);
    ratingParameters0.setAbility((int)(byte)0);
    int i11 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay(52);
    int i14 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay(0);
    int i17 = ratingParameters0.getFairPlay();
    int i18 = ratingParameters0.getAbility();
    int i19 = ratingParameters0.getFairPlay();
    int i20 = ratingParameters0.getAbility();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test067"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    registerGame0.setDate("");
    java.lang.String str4 = registerGame0.getDate();
    registerGame0.setLocal("");
    java.lang.String str7 = registerGame0.getDate();
    java.lang.String str8 = registerGame0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test068"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setPassword("");
    registerUser0.setEmail("");
    registerUser0.setName("");
    java.lang.String str12 = registerUser0.getName();
    java.lang.String str13 = registerUser0.getEmail();
    java.lang.String str14 = registerUser0.getName();
    java.lang.String str15 = registerUser0.getEmail();
    java.lang.String str16 = registerUser0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test069"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    int i5 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay(97);
    int i8 = ratingParameters0.getFairPlay();
    int i9 = ratingParameters0.getFairPlay();
    ratingParameters0.setAbility((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test070"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    java.lang.String str6 = registerUser0.getEmail();
    java.lang.String str7 = registerUser0.getName();
    registerUser0.setPhone("");
    registerUser0.setEmail("");
    registerUser0.setPassword("hi!");
    java.lang.String str14 = registerUser0.getPhone();
    java.lang.String str15 = registerUser0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test071"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    registerGame0.setDate("");
    java.lang.String str5 = registerGame0.getLocal();
    registerGame0.setLocal("");
    java.lang.String str8 = registerGame0.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test072"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    java.lang.String str5 = registerGame0.getDescription();
    java.lang.String str6 = registerGame0.getDate();
    registerGame0.setLocal("hi!");
    registerGame0.setDate("hi!");
    registerGame0.setSport("");
    registerGame0.setDate("");
    registerGame0.setName("hi!");
    registerGame0.setLocal("");
    registerGame0.setSport("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test073"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("hi!", (java.lang.Long)0L);
    loginDTO2.setToken("hi!");
    loginDTO2.setUserId((java.lang.Long)1L);
    java.lang.Long long7 = loginDTO2.getUserId();
    java.lang.String str8 = loginDTO2.getToken();
    loginDTO2.setUserId((java.lang.Long)0L);
    loginDTO2.setUserId((java.lang.Long)10L);
    java.lang.String str13 = loginDTO2.getToken();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L+ "'", long7.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test074"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPassword("hi!");
    registerUser0.setPhone("");
    registerUser0.setPhone("hi!");
    registerUser0.setAddress("hi!");
    java.lang.String str13 = registerUser0.getAddress();
    java.lang.String str14 = registerUser0.getPhone();
    java.lang.String str15 = registerUser0.getAddress();
    registerUser0.setName("hi!");
    registerUser0.setEmail("");
    java.lang.String str20 = registerUser0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test075"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)10L);
    loginDTO2.setUserId((java.lang.Long)1L);
    loginDTO2.setToken("hi!");
    loginDTO2.setUserId((java.lang.Long)1L);
    loginDTO2.setToken("");
    loginDTO2.setUserId((java.lang.Long)(-1L));
    java.lang.String str13 = loginDTO2.getToken();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test076"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO2 = new br.edu.ufcg.es.model.DTO.AuthDTO("hi!", "");
    java.lang.String str3 = authDTO2.getEmail();
    authDTO2.setEmail("hi!");
    authDTO2.setEmail("hi!");
    authDTO2.setPassword("");
    java.lang.String str10 = authDTO2.getEmail();
    java.lang.String str11 = authDTO2.getPassword();
    authDTO2.setPassword("");
    java.lang.String str14 = authDTO2.getPassword();
    authDTO2.setEmail("hi!");
    authDTO2.setEmail("");
    authDTO2.setEmail("");
    java.lang.String str21 = authDTO2.getPassword();
    authDTO2.setEmail("");
    java.lang.String str24 = authDTO2.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test077"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    java.lang.String str6 = registerUser0.getName();
    java.lang.String str7 = registerUser0.getPassword();
    java.lang.String str8 = registerUser0.getEmail();
    registerUser0.setPassword("");
    java.lang.String str11 = registerUser0.getName();
    registerUser0.setEmail("");
    registerUser0.setAddress("");
    registerUser0.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test078"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    java.lang.String str5 = registerGame0.getDate();
    java.lang.String str6 = registerGame0.getDescription();
    java.lang.String str7 = registerGame0.getSport();
    registerGame0.setDescription("hi!");
    java.lang.String str10 = registerGame0.getName();
    java.lang.String str11 = registerGame0.getDescription();
    java.lang.String str12 = registerGame0.getName();
    java.lang.String str13 = registerGame0.getName();
    java.lang.String str14 = registerGame0.getName();
    java.lang.String str15 = registerGame0.getLocal();
    java.lang.String str16 = registerGame0.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test079"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    ratingParameters0.setFairPlay((int)(short)100);
    int i5 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay((int)'a');
    int i8 = ratingParameters0.getFairPlay();
    int i9 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay(0);
    ratingParameters0.setFairPlay((int)(byte)100);
    ratingParameters0.setAbility(0);
    ratingParameters0.setAbility((int)(byte)0);
    ratingParameters0.setAbility((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test080"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    loginDTO2.setUserId((java.lang.Long)(-1L));
    loginDTO2.setToken("hi!");
    loginDTO2.setUserId((java.lang.Long)100L);
    loginDTO2.setUserId((java.lang.Long)1L);
    java.lang.String str11 = loginDTO2.getToken();
    java.lang.Long long12 = loginDTO2.getUserId();
    loginDTO2.setUserId((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L+ "'", long12.equals(1L));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test081"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("hi!", (java.lang.Long)100L);
    loginDTO2.setUserId((java.lang.Long)(-1L));
    java.lang.Long long5 = loginDTO2.getUserId();
    loginDTO2.setToken("hi!");
    java.lang.String str8 = loginDTO2.getToken();
    java.lang.String str9 = loginDTO2.getToken();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L)+ "'", long5.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test082"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPhone();
    java.lang.String str5 = registerUser0.getAddress();
    registerUser0.setEmail("");
    java.lang.String str8 = registerUser0.getAddress();
    java.lang.String str9 = registerUser0.getName();
    java.lang.String str10 = registerUser0.getName();
    registerUser0.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test083"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    int i3 = ratingParameters0.getFairPlay();
    ratingParameters0.setAbility((int)' ');
    ratingParameters0.setAbility(97);
    int i8 = ratingParameters0.getAbility();
    ratingParameters0.setAbility(52);
    ratingParameters0.setAbility((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test084"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setEmail("");
    java.lang.String str8 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setAddress("");
    registerUser0.setPhone("");
    java.lang.String str15 = registerUser0.getPassword();
    registerUser0.setPassword("");
    registerUser0.setPhone("");
    java.lang.String str20 = registerUser0.getPhone();
    registerUser0.setName("");
    registerUser0.setAddress("hi!");
    registerUser0.setPhone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test085"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    registerGame0.setLocal("");
    java.lang.String str5 = registerGame0.getLocal();
    registerGame0.setDate("hi!");
    java.lang.String str8 = registerGame0.getSport();
    registerGame0.setName("hi!");
    java.lang.String str11 = registerGame0.getName();
    java.lang.String str12 = registerGame0.getDate();
    registerGame0.setName("hi!");
    registerGame0.setSport("hi!");
    registerGame0.setDate("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test086"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    java.lang.Long long3 = loginDTO2.getUserId();
    loginDTO2.setUserId((java.lang.Long)0L);
    loginDTO2.setUserId((java.lang.Long)10L);
    loginDTO2.setToken("hi!");
    loginDTO2.setUserId((java.lang.Long)100L);
    java.lang.String str12 = loginDTO2.getToken();
    java.lang.String str13 = loginDTO2.getToken();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L+ "'", long3.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test087"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    java.lang.Long long3 = loginDTO2.getUserId();
    loginDTO2.setUserId((java.lang.Long)0L);
    java.lang.Long long6 = loginDTO2.getUserId();
    loginDTO2.setUserId((java.lang.Long)(-1L));
    loginDTO2.setToken("hi!");
    java.lang.Long long11 = loginDTO2.getUserId();
    java.lang.Long long12 = loginDTO2.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L+ "'", long3.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L+ "'", long6.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L)+ "'", long11.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L)+ "'", long12.equals((-1L)));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test088"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getAddress();
    registerUser0.setAddress("");
    registerUser0.setAddress("");
    registerUser0.setPhone("");
    java.lang.String str14 = registerUser0.getPassword();
    java.lang.String str15 = registerUser0.getAddress();
    java.lang.String str16 = registerUser0.getName();
    java.lang.String str17 = registerUser0.getEmail();
    java.lang.String str18 = registerUser0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test089"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getLocal();
    registerGame0.setDescription("hi!");
    java.lang.String str6 = registerGame0.getDate();
    registerGame0.setSport("hi!");
    java.lang.String str9 = registerGame0.getSport();
    java.lang.String str10 = registerGame0.getSport();
    java.lang.String str11 = registerGame0.getSport();
    java.lang.String str12 = registerGame0.getDescription();
    java.lang.String str13 = registerGame0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test090"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    java.lang.String str5 = registerGame0.getDescription();
    java.lang.String str6 = registerGame0.getDate();
    registerGame0.setLocal("hi!");
    registerGame0.setDescription("hi!");
    registerGame0.setName("");
    java.lang.String str13 = registerGame0.getDescription();
    java.lang.String str14 = registerGame0.getDescription();
    java.lang.String str15 = registerGame0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test091"); }

    br.edu.ufcg.es.model.DTO.SearchDTO searchDTO0 = new br.edu.ufcg.es.model.DTO.SearchDTO();
    java.lang.String str1 = searchDTO0.getName();
    java.lang.String str2 = searchDTO0.getName();
    java.lang.String str3 = searchDTO0.getName();
    java.lang.String str4 = searchDTO0.getName();
    searchDTO0.setName("hi!");
    java.lang.String str7 = searchDTO0.getName();
    java.lang.String str8 = searchDTO0.getName();
    java.lang.String str9 = searchDTO0.getName();
    java.lang.String str10 = searchDTO0.getName();
    java.lang.String str11 = searchDTO0.getName();
    searchDTO0.setName("hi!");
    java.lang.String str14 = searchDTO0.getName();
    searchDTO0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test092"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("hi!", (java.lang.Long)100L);
    loginDTO2.setToken("");
    loginDTO2.setUserId((java.lang.Long)1L);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test093"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    java.lang.String str3 = loginDTO2.getToken();
    loginDTO2.setUserId((java.lang.Long)10L);
    java.lang.Long long6 = loginDTO2.getUserId();
    loginDTO2.setToken("");
    loginDTO2.setUserId((java.lang.Long)(-1L));
    loginDTO2.setUserId((java.lang.Long)10L);
    java.lang.Long long13 = loginDTO2.getUserId();
    java.lang.Long long14 = loginDTO2.getUserId();
    loginDTO2.setUserId((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L+ "'", long6.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L+ "'", long13.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L+ "'", long14.equals(10L));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test094"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDate("");
    java.lang.String str5 = registerGame0.getSport();
    java.lang.String str6 = registerGame0.getDescription();
    java.lang.String str7 = registerGame0.getName();
    registerGame0.setSport("");
    java.lang.String str10 = registerGame0.getDate();
    java.lang.String str11 = registerGame0.getSport();
    java.lang.String str12 = registerGame0.getLocal();
    registerGame0.setLocal("");
    java.lang.String str15 = registerGame0.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test095"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setEmail("");
    java.lang.String str8 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setName("hi!");
    registerUser0.setAddress("hi!");
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    java.lang.String str19 = registerUser0.getAddress();
    registerUser0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test096"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getLocal();
    java.lang.String str4 = registerGame0.getDate();
    java.lang.String str5 = registerGame0.getSport();
    registerGame0.setSport("hi!");
    registerGame0.setSport("hi!");
    registerGame0.setDate("");
    registerGame0.setDescription("");
    registerGame0.setDescription("hi!");
    java.lang.String str16 = registerGame0.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test097"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getName();
    registerUser0.setAddress("");
    registerUser0.setAddress("hi!");
    registerUser0.setAddress("");
    registerUser0.setPhone("hi!");
    java.lang.String str16 = registerUser0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test098"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    ratingParameters0.setAbility((int)(byte)-1);
    int i7 = ratingParameters0.getAbility();
    int i8 = ratingParameters0.getFairPlay();
    ratingParameters0.setAbility((int)(byte)0);
    int i11 = ratingParameters0.getFairPlay();
    ratingParameters0.setAbility((int)(byte)10);
    ratingParameters0.setFairPlay((int)(short)10);
    ratingParameters0.setAbility((int)'#');
    ratingParameters0.setAbility((int)' ');
    int i20 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay((int)(byte)0);
    int i23 = ratingParameters0.getAbility();
    ratingParameters0.setAbility(52);
    int i26 = ratingParameters0.getFairPlay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test099"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO2 = new br.edu.ufcg.es.model.DTO.AuthDTO("hi!", "");
    java.lang.String str3 = authDTO2.getPassword();
    authDTO2.setEmail("hi!");
    authDTO2.setEmail("hi!");
    authDTO2.setPassword("");
    authDTO2.setPassword("");
    authDTO2.setEmail("hi!");
    authDTO2.setPassword("hi!");
    authDTO2.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test100"); }

    br.edu.ufcg.es.model.DTO.SearchDTO searchDTO1 = new br.edu.ufcg.es.model.DTO.SearchDTO("hi!");
    searchDTO1.setName("hi!");
    searchDTO1.setName("hi!");
    searchDTO1.setName("");
    searchDTO1.setName("hi!");

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test101"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    registerGame0.setDate("");
    registerGame0.setDescription("hi!");
    registerGame0.setDescription("hi!");
    registerGame0.setDescription("");
    registerGame0.setDate("hi!");
    registerGame0.setDescription("hi!");
    registerGame0.setDate("");
    java.lang.String str17 = registerGame0.getName();
    java.lang.String str18 = registerGame0.getDescription();
    java.lang.String str19 = registerGame0.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test102"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getDate();
    registerGame0.setDate("");
    java.lang.String str6 = registerGame0.getLocal();
    registerGame0.setDate("hi!");
    registerGame0.setSport("hi!");
    registerGame0.setSport("");
    registerGame0.setDescription("");
    registerGame0.setDescription("");
    registerGame0.setName("hi!");
    java.lang.String str19 = registerGame0.getDescription();
    java.lang.String str20 = registerGame0.getDescription();
    java.lang.String str21 = registerGame0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test103"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getAddress();
    registerUser0.setAddress("");
    registerUser0.setEmail("hi!");
    java.lang.String str12 = registerUser0.getEmail();
    java.lang.String str13 = registerUser0.getAddress();
    registerUser0.setEmail("");
    java.lang.String str16 = registerUser0.getPassword();
    java.lang.String str17 = registerUser0.getEmail();
    registerUser0.setPassword("hi!");
    registerUser0.setName("");
    java.lang.String str22 = registerUser0.getName();
    registerUser0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test104"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getDate();
    registerGame0.setName("");
    java.lang.String str6 = registerGame0.getDescription();
    java.lang.String str7 = registerGame0.getName();
    registerGame0.setSport("");
    java.lang.String str10 = registerGame0.getName();
    java.lang.String str11 = registerGame0.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test105"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDate("");
    java.lang.String str5 = registerGame0.getSport();
    registerGame0.setDate("");
    registerGame0.setLocal("");
    java.lang.String str10 = registerGame0.getName();
    java.lang.String str11 = registerGame0.getDescription();
    registerGame0.setDescription("hi!");
    registerGame0.setSport("");
    registerGame0.setDate("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test106"); }

    br.edu.ufcg.es.model.DTO.SearchDTO searchDTO1 = new br.edu.ufcg.es.model.DTO.SearchDTO("");
    java.lang.String str2 = searchDTO1.getName();
    java.lang.String str3 = searchDTO1.getName();
    searchDTO1.setName("hi!");
    searchDTO1.setName("");
    searchDTO1.setName("hi!");
    java.lang.String str10 = searchDTO1.getName();
    searchDTO1.setName("");
    java.lang.String str13 = searchDTO1.getName();
    searchDTO1.setName("hi!");
    searchDTO1.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test107"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    registerUser0.setPassword("");
    registerUser0.setName("");
    java.lang.String str9 = registerUser0.getPhone();
    registerUser0.setName("hi!");
    registerUser0.setName("");
    java.lang.String str14 = registerUser0.getEmail();
    java.lang.String str15 = registerUser0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test108"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO2 = new br.edu.ufcg.es.model.DTO.AuthDTO("hi!", "");
    java.lang.String str3 = authDTO2.getEmail();
    authDTO2.setEmail("");
    authDTO2.setEmail("hi!");
    java.lang.String str8 = authDTO2.getPassword();
    authDTO2.setPassword("");
    authDTO2.setPassword("");
    authDTO2.setPassword("");
    authDTO2.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test109"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay(100);
    ratingParameters0.setAbility(32);
    int i7 = ratingParameters0.getFairPlay();
    ratingParameters0.setAbility((-1));
    ratingParameters0.setFairPlay((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test110"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setPhone("");
    registerUser0.setPhone("");
    java.lang.String str10 = registerUser0.getPhone();
    java.lang.String str11 = registerUser0.getPassword();
    registerUser0.setName("");
    java.lang.String str14 = registerUser0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test111"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setEmail("");
    registerUser0.setPassword("hi!");
    registerUser0.setName("hi!");
    java.lang.String str12 = registerUser0.getName();
    java.lang.String str13 = registerUser0.getPassword();
    registerUser0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test112"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setName("hi!");
    java.lang.String str8 = registerUser0.getPassword();
    java.lang.String str9 = registerUser0.getPassword();
    registerUser0.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test113"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getName();
    java.lang.String str4 = registerGame0.getDescription();
    java.lang.String str5 = registerGame0.getSport();
    registerGame0.setDate("hi!");
    registerGame0.setSport("");
    java.lang.String str10 = registerGame0.getSport();
    registerGame0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test114"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setName("hi!");
    java.lang.String str7 = registerUser0.getAddress();
    registerUser0.setAddress("");
    registerUser0.setPhone("");
    java.lang.String str12 = registerUser0.getPhone();
    registerUser0.setPhone("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test115"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    java.lang.String str6 = registerUser0.getEmail();
    java.lang.String str7 = registerUser0.getName();
    java.lang.String str8 = registerUser0.getPhone();
    registerUser0.setEmail("");
    registerUser0.setName("");
    registerUser0.setPhone("");
    java.lang.String str15 = registerUser0.getEmail();
    java.lang.String str16 = registerUser0.getPassword();
    java.lang.String str17 = registerUser0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test116"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getAddress();
    java.lang.String str8 = registerUser0.getEmail();
    registerUser0.setEmail("hi!");
    java.lang.String str11 = registerUser0.getPhone();
    registerUser0.setPhone("hi!");
    registerUser0.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test117"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getDescription();
    registerGame0.setName("hi!");
    registerGame0.setDate("");
    registerGame0.setDate("hi!");
    java.lang.String str8 = registerGame0.getDate();
    java.lang.String str9 = registerGame0.getLocal();
    java.lang.String str10 = registerGame0.getLocal();
    registerGame0.setDate("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test118"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    registerUser0.setPassword("");
    registerUser0.setName("");
    java.lang.String str9 = registerUser0.getPhone();
    java.lang.String str10 = registerUser0.getAddress();
    java.lang.String str11 = registerUser0.getAddress();
    registerUser0.setPassword("hi!");
    registerUser0.setName("");
    java.lang.String str16 = registerUser0.getPassword();
    java.lang.String str17 = registerUser0.getName();
    java.lang.String str18 = registerUser0.getPassword();
    java.lang.String str19 = registerUser0.getEmail();
    registerUser0.setPassword("hi!");
    registerUser0.setName("hi!");
    java.lang.String str24 = registerUser0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test119"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    java.lang.String str3 = registerGame0.getSport();
    registerGame0.setDescription("");
    registerGame0.setName("hi!");
    java.lang.String str8 = registerGame0.getLocal();
    java.lang.String str9 = registerGame0.getDate();
    registerGame0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test120"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    int i3 = ratingParameters0.getFairPlay();
    int i4 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay(32);
    ratingParameters0.setFairPlay(1);
    int i9 = ratingParameters0.getAbility();
    ratingParameters0.setAbility((int)'#');
    int i12 = ratingParameters0.getFairPlay();
    int i13 = ratingParameters0.getAbility();
    int i14 = ratingParameters0.getAbility();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 35);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test121"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    java.lang.String str3 = registerGame0.getLocal();
    java.lang.String str4 = registerGame0.getDate();
    java.lang.String str5 = registerGame0.getDate();
    java.lang.String str6 = registerGame0.getLocal();
    java.lang.String str7 = registerGame0.getDate();
    registerGame0.setLocal("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test122"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setEmail("");
    java.lang.String str8 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setName("hi!");
    registerUser0.setAddress("hi!");
    registerUser0.setAddress("hi!");
    java.lang.String str17 = registerUser0.getName();
    java.lang.String str18 = registerUser0.getPhone();
    registerUser0.setPassword("");
    java.lang.String str21 = registerUser0.getPhone();
    registerUser0.setPassword("hi!");
    java.lang.String str24 = registerUser0.getName();
    java.lang.String str25 = registerUser0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test123"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    loginDTO2.setUserId((java.lang.Long)(-1L));
    java.lang.Long long5 = loginDTO2.getUserId();
    java.lang.Long long6 = loginDTO2.getUserId();
    java.lang.Long long7 = loginDTO2.getUserId();
    java.lang.Long long8 = loginDTO2.getUserId();
    java.lang.Long long9 = loginDTO2.getUserId();
    java.lang.String str10 = loginDTO2.getToken();
    loginDTO2.setToken("hi!");
    loginDTO2.setUserId((java.lang.Long)10L);
    loginDTO2.setToken("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L)+ "'", long5.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L)+ "'", long6.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L)+ "'", long7.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L)+ "'", long8.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L)+ "'", long9.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test124"); }

    br.edu.ufcg.es.model.DTO.SearchDTO searchDTO1 = new br.edu.ufcg.es.model.DTO.SearchDTO("");
    searchDTO1.setName("");
    searchDTO1.setName("hi!");
    searchDTO1.setName("");
    java.lang.String str8 = searchDTO1.getName();
    searchDTO1.setName("");
    searchDTO1.setName("hi!");
    searchDTO1.setName("");
    java.lang.String str15 = searchDTO1.getName();
    searchDTO1.setName("");
    searchDTO1.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test125"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setName("hi!");
    registerUser0.setAddress("");
    java.lang.String str10 = registerUser0.getEmail();
    java.lang.String str11 = registerUser0.getEmail();
    registerUser0.setEmail("hi!");
    java.lang.String str14 = registerUser0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test126"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    int i5 = ratingParameters0.getFairPlay();
    int i6 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay((int)(short)1);
    int i9 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay(0);
    int i12 = ratingParameters0.getAbility();
    ratingParameters0.setAbility((int)(short)-1);
    int i15 = ratingParameters0.getFairPlay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test127"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    java.lang.String str3 = registerGame0.getDate();
    java.lang.String str4 = registerGame0.getDate();
    registerGame0.setDate("hi!");
    registerGame0.setDescription("hi!");
    java.lang.String str9 = registerGame0.getSport();
    registerGame0.setSport("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test128"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    java.lang.String str3 = registerGame0.getSport();
    java.lang.String str4 = registerGame0.getLocal();
    registerGame0.setDescription("");
    registerGame0.setSport("hi!");
    java.lang.String str9 = registerGame0.getDate();
    java.lang.String str10 = registerGame0.getSport();
    java.lang.String str11 = registerGame0.getDescription();
    java.lang.String str12 = registerGame0.getSport();
    java.lang.String str13 = registerGame0.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test129"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    java.lang.String str6 = registerUser0.getName();
    java.lang.String str7 = registerUser0.getPassword();
    java.lang.String str8 = registerUser0.getAddress();
    registerUser0.setPhone("");
    registerUser0.setPhone("");
    registerUser0.setPhone("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test130"); }

    br.edu.ufcg.es.model.DTO.SearchDTO searchDTO1 = new br.edu.ufcg.es.model.DTO.SearchDTO("");
    searchDTO1.setName("hi!");
    searchDTO1.setName("");
    searchDTO1.setName("");
    java.lang.String str8 = searchDTO1.getName();
    java.lang.String str9 = searchDTO1.getName();
    searchDTO1.setName("hi!");
    java.lang.String str12 = searchDTO1.getName();
    searchDTO1.setName("hi!");
    searchDTO1.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test131"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getName();
    registerGame0.setDescription("hi!");
    java.lang.String str6 = registerGame0.getName();
    java.lang.String str7 = registerGame0.getDate();
    java.lang.String str8 = registerGame0.getDate();
    java.lang.String str9 = registerGame0.getName();
    registerGame0.setName("hi!");
    java.lang.String str12 = registerGame0.getLocal();
    registerGame0.setDate("hi!");
    java.lang.String str15 = registerGame0.getDate();
    registerGame0.setName("");
    registerGame0.setSport("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test132"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    java.lang.String str5 = registerGame0.getDescription();
    java.lang.String str6 = registerGame0.getDate();
    registerGame0.setLocal("hi!");
    registerGame0.setDescription("hi!");
    registerGame0.setName("");
    java.lang.String str13 = registerGame0.getDescription();
    registerGame0.setName("hi!");
    java.lang.String str16 = registerGame0.getDescription();
    registerGame0.setDate("hi!");
    registerGame0.setDate("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test133"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    java.lang.String str5 = registerGame0.getDescription();
    java.lang.String str6 = registerGame0.getDate();
    registerGame0.setLocal("hi!");
    registerGame0.setDate("hi!");
    registerGame0.setSport("");
    registerGame0.setDate("");
    registerGame0.setSport("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test134"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    ratingParameters0.setAbility(0);
    int i7 = ratingParameters0.getFairPlay();
    int i8 = ratingParameters0.getAbility();
    int i9 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay(1);
    int i12 = ratingParameters0.getAbility();
    ratingParameters0.setAbility((int)(byte)-1);
    ratingParameters0.setFairPlay((int)'4');
    int i17 = ratingParameters0.getFairPlay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 52);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test135"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    registerGame0.setDate("");
    java.lang.String str7 = registerGame0.getDate();
    java.lang.String str8 = registerGame0.getLocal();
    registerGame0.setName("hi!");
    java.lang.String str11 = registerGame0.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test136"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO2 = new br.edu.ufcg.es.model.DTO.AuthDTO("hi!", "");
    java.lang.String str3 = authDTO2.getEmail();
    authDTO2.setEmail("hi!");
    authDTO2.setPassword("hi!");
    java.lang.String str8 = authDTO2.getPassword();
    java.lang.String str9 = authDTO2.getEmail();
    java.lang.String str10 = authDTO2.getPassword();
    authDTO2.setPassword("");
    java.lang.String str13 = authDTO2.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test137"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    registerGame0.setLocal("");
    java.lang.String str5 = registerGame0.getLocal();
    registerGame0.setDate("hi!");
    java.lang.String str8 = registerGame0.getLocal();
    java.lang.String str9 = registerGame0.getSport();
    registerGame0.setDescription("hi!");
    registerGame0.setLocal("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test138"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    java.lang.String str3 = registerGame0.getDate();
    java.lang.String str4 = registerGame0.getDate();
    registerGame0.setDate("hi!");
    registerGame0.setDescription("hi!");
    java.lang.String str9 = registerGame0.getSport();
    java.lang.String str10 = registerGame0.getDate();
    registerGame0.setDescription("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test139"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    java.lang.String str6 = registerUser0.getEmail();
    registerUser0.setEmail("hi!");
    registerUser0.setAddress("");
    java.lang.String str11 = registerUser0.getPassword();
    registerUser0.setName("hi!");
    registerUser0.setPhone("");
    registerUser0.setPhone("hi!");
    java.lang.String str18 = registerUser0.getName();
    registerUser0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test140"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    int i3 = ratingParameters0.getFairPlay();
    int i4 = ratingParameters0.getAbility();
    ratingParameters0.setAbility(35);
    ratingParameters0.setAbility((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test141"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getName();
    java.lang.String str4 = registerGame0.getDescription();
    java.lang.String str5 = registerGame0.getSport();
    registerGame0.setDate("hi!");
    registerGame0.setSport("");
    java.lang.String str10 = registerGame0.getDate();
    registerGame0.setLocal("hi!");
    java.lang.String str13 = registerGame0.getSport();
    registerGame0.setDate("hi!");
    java.lang.String str16 = registerGame0.getSport();
    registerGame0.setDescription("");
    registerGame0.setLocal("");
    java.lang.String str21 = registerGame0.getName();
    registerGame0.setDate("hi!");
    java.lang.String str24 = registerGame0.getDate();
    registerGame0.setDescription("hi!");
    registerGame0.setDate("");
    java.lang.String str29 = registerGame0.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test142"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getDate();
    registerGame0.setDescription("");
    java.lang.String str6 = registerGame0.getSport();
    java.lang.String str7 = registerGame0.getDate();
    registerGame0.setName("hi!");
    registerGame0.setDescription("hi!");
    registerGame0.setName("hi!");
    registerGame0.setSport("hi!");
    registerGame0.setDate("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test143"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    java.lang.String str6 = registerUser0.getName();
    java.lang.String str7 = registerUser0.getPassword();
    java.lang.String str8 = registerUser0.getAddress();
    java.lang.String str9 = registerUser0.getAddress();
    registerUser0.setEmail("");
    java.lang.String str12 = registerUser0.getName();
    registerUser0.setName("");
    registerUser0.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test144"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)10L);
    loginDTO2.setUserId((java.lang.Long)1L);
    loginDTO2.setToken("hi!");
    loginDTO2.setUserId((java.lang.Long)1L);
    loginDTO2.setToken("hi!");
    loginDTO2.setUserId((java.lang.Long)(-1L));
    java.lang.Long long13 = loginDTO2.getUserId();
    loginDTO2.setUserId((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L)+ "'", long13.equals((-1L)));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test145"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    java.lang.String str5 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    authDTO0.setEmail("hi!");
    java.lang.String str10 = authDTO0.getEmail();
    java.lang.String str11 = authDTO0.getEmail();
    java.lang.String str12 = authDTO0.getEmail();
    java.lang.String str13 = authDTO0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test146"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getDate();
    java.lang.String str2 = registerGame0.getName();
    java.lang.String str3 = registerGame0.getSport();
    java.lang.String str4 = registerGame0.getLocal();
    registerGame0.setDate("");
    java.lang.String str7 = registerGame0.getDate();
    registerGame0.setSport("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test147"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    ratingParameters0.setFairPlay((int)(short)100);
    ratingParameters0.setFairPlay((int)(byte)1);
    ratingParameters0.setFairPlay((int)(short)0);
    int i9 = ratingParameters0.getAbility();
    ratingParameters0.setAbility((int)'4');
    ratingParameters0.setFairPlay((int)(short)1);
    int i14 = ratingParameters0.getAbility();
    int i15 = ratingParameters0.getAbility();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test148"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    ratingParameters0.setFairPlay((int)(short)100);
    int i5 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay(97);
    int i8 = ratingParameters0.getAbility();
    int i9 = ratingParameters0.getFairPlay();
    int i10 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay((int)(byte)0);
    int i13 = ratingParameters0.getAbility();
    ratingParameters0.setAbility(0);
    ratingParameters0.setAbility((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test149"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    registerGame0.setName("hi!");
    registerGame0.setDate("");
    registerGame0.setDescription("hi!");
    java.lang.String str9 = registerGame0.getName();
    registerGame0.setSport("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test150"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    java.lang.String str3 = registerGame0.getName();
    java.lang.String str4 = registerGame0.getDescription();
    java.lang.String str5 = registerGame0.getDescription();
    java.lang.String str6 = registerGame0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test151"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("hi!");
    java.lang.String str5 = authDTO0.getPassword();
    authDTO0.setPassword("");
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("hi!");
    java.lang.String str12 = authDTO0.getPassword();
    authDTO0.setPassword("");
    java.lang.String str15 = authDTO0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test152"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    java.lang.String str6 = registerUser0.getPhone();
    registerUser0.setAddress("");
    java.lang.String str9 = registerUser0.getPhone();
    registerUser0.setPhone("");
    registerUser0.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test153"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    registerGame0.setSport("hi!");
    java.lang.String str5 = registerGame0.getSport();
    registerGame0.setLocal("");
    registerGame0.setDescription("hi!");
    registerGame0.setSport("");
    java.lang.String str12 = registerGame0.getDescription();
    java.lang.String str13 = registerGame0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test154"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO2 = new br.edu.ufcg.es.model.DTO.AuthDTO("hi!", "");
    java.lang.String str3 = authDTO2.getPassword();
    authDTO2.setEmail("hi!");
    authDTO2.setEmail("hi!");
    authDTO2.setPassword("");
    authDTO2.setPassword("");
    authDTO2.setPassword("");
    authDTO2.setPassword("");
    authDTO2.setPassword("");
    authDTO2.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test155"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getAddress();
    registerUser0.setAddress("");
    registerUser0.setAddress("");
    registerUser0.setPhone("");
    java.lang.String str14 = registerUser0.getPassword();
    java.lang.String str15 = registerUser0.getEmail();
    java.lang.String str16 = registerUser0.getPhone();
    registerUser0.setAddress("");
    java.lang.String str19 = registerUser0.getPassword();
    registerUser0.setPassword("hi!");
    java.lang.String str22 = registerUser0.getEmail();
    registerUser0.setPhone("hi!");
    java.lang.String str25 = registerUser0.getEmail();
    registerUser0.setName("hi!");
    java.lang.String str28 = registerUser0.getPassword();
    registerUser0.setPhone("hi!");
    registerUser0.setEmail("");
    java.lang.String str33 = registerUser0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test156"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    java.lang.String str3 = registerGame0.getSport();
    registerGame0.setDescription("hi!");
    registerGame0.setDescription("hi!");
    java.lang.String str8 = registerGame0.getName();
    java.lang.String str9 = registerGame0.getDescription();
    registerGame0.setSport("");
    java.lang.String str12 = registerGame0.getLocal();
    registerGame0.setDescription("hi!");
    java.lang.String str15 = registerGame0.getLocal();
    registerGame0.setDate("hi!");
    java.lang.String str18 = registerGame0.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test157"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO2 = new br.edu.ufcg.es.model.DTO.AuthDTO("", "");
    authDTO2.setEmail("");
    authDTO2.setPassword("");
    authDTO2.setPassword("");
    authDTO2.setEmail("");
    authDTO2.setPassword("hi!");

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test158"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getDescription();
    registerGame0.setLocal("");
    registerGame0.setName("hi!");
    java.lang.String str8 = registerGame0.getDate();
    registerGame0.setLocal("hi!");
    registerGame0.setDescription("hi!");
    registerGame0.setSport("hi!");
    registerGame0.setDate("");
    java.lang.String str17 = registerGame0.getLocal();
    java.lang.String str18 = registerGame0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test159"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setAddress("");
    registerUser0.setPhone("");
    java.lang.String str7 = registerUser0.getAddress();
    java.lang.String str8 = registerUser0.getPassword();
    registerUser0.setAddress("");
    registerUser0.setEmail("hi!");
    registerUser0.setName("hi!");
    java.lang.String str15 = registerUser0.getName();
    java.lang.String str16 = registerUser0.getPassword();
    registerUser0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test160"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setEmail("");
    registerUser0.setPhone("");
    java.lang.String str10 = registerUser0.getPassword();
    registerUser0.setPhone("");
    java.lang.String str13 = registerUser0.getPassword();
    registerUser0.setEmail("");
    java.lang.String str16 = registerUser0.getEmail();
    registerUser0.setEmail("");
    java.lang.String str19 = registerUser0.getPhone();
    java.lang.String str20 = registerUser0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test161"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    registerUser0.setPassword("");
    registerUser0.setName("");
    java.lang.String str9 = registerUser0.getPhone();
    java.lang.String str10 = registerUser0.getAddress();
    java.lang.String str11 = registerUser0.getAddress();
    registerUser0.setPassword("hi!");
    registerUser0.setName("");
    java.lang.String str16 = registerUser0.getPassword();
    java.lang.String str17 = registerUser0.getName();
    java.lang.String str18 = registerUser0.getPassword();
    java.lang.String str19 = registerUser0.getName();
    registerUser0.setEmail("");
    java.lang.String str22 = registerUser0.getAddress();
    java.lang.String str23 = registerUser0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test162"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    ratingParameters0.setAbility((int)(byte)-1);
    ratingParameters0.setFairPlay((int)(byte)1);
    ratingParameters0.setAbility((int)(short)100);
    ratingParameters0.setAbility((int)(byte)1);
    int i13 = ratingParameters0.getFairPlay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test163"); }

    br.edu.ufcg.es.model.DTO.SearchDTO searchDTO1 = new br.edu.ufcg.es.model.DTO.SearchDTO("");
    searchDTO1.setName("hi!");
    searchDTO1.setName("");
    searchDTO1.setName("");
    searchDTO1.setName("");
    java.lang.String str10 = searchDTO1.getName();
    java.lang.String str11 = searchDTO1.getName();
    searchDTO1.setName("");
    java.lang.String str14 = searchDTO1.getName();
    java.lang.String str15 = searchDTO1.getName();
    searchDTO1.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test164"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)(-1L));
    java.lang.String str3 = loginDTO2.getToken();
    java.lang.Long long4 = loginDTO2.getUserId();
    loginDTO2.setToken("");
    loginDTO2.setUserId((java.lang.Long)1L);
    java.lang.Long long9 = loginDTO2.getUserId();
    loginDTO2.setUserId((java.lang.Long)0L);
    loginDTO2.setUserId((java.lang.Long)10L);
    java.lang.Long long14 = loginDTO2.getUserId();
    java.lang.String str15 = loginDTO2.getToken();
    java.lang.String str16 = loginDTO2.getToken();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L)+ "'", long4.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L+ "'", long9.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L+ "'", long14.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test165"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("hi!", (java.lang.Long)100L);
    loginDTO2.setUserId((java.lang.Long)(-1L));
    loginDTO2.setToken("hi!");
    java.lang.String str7 = loginDTO2.getToken();
    java.lang.Long long8 = loginDTO2.getUserId();
    loginDTO2.setToken("");
    loginDTO2.setToken("");
    java.lang.String str13 = loginDTO2.getToken();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L)+ "'", long8.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test166"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getEmail();
    registerUser0.setPassword("");
    registerUser0.setAddress("");
    registerUser0.setName("");
    registerUser0.setPhone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test167"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getAddress();
    registerUser0.setAddress("");
    registerUser0.setEmail("hi!");
    registerUser0.setAddress("hi!");
    registerUser0.setAddress("");
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    java.lang.String str20 = registerUser0.getAddress();
    registerUser0.setPhone("hi!");
    registerUser0.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test168"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    registerGame0.setDate("");
    java.lang.String str4 = registerGame0.getDate();
    registerGame0.setDescription("");
    registerGame0.setDate("");
    java.lang.String str9 = registerGame0.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test169"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    java.lang.Long long3 = loginDTO2.getUserId();
    loginDTO2.setUserId((java.lang.Long)0L);
    java.lang.Long long6 = loginDTO2.getUserId();
    loginDTO2.setToken("hi!");
    java.lang.Long long9 = loginDTO2.getUserId();
    loginDTO2.setUserId((java.lang.Long)0L);
    java.lang.Long long12 = loginDTO2.getUserId();
    java.lang.Long long13 = loginDTO2.getUserId();
    loginDTO2.setToken("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L+ "'", long3.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L+ "'", long6.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L+ "'", long9.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L+ "'", long12.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L+ "'", long13.equals(0L));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test170"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getDate();
    registerGame0.setDate("");
    java.lang.String str6 = registerGame0.getLocal();
    java.lang.String str7 = registerGame0.getName();
    java.lang.String str8 = registerGame0.getName();
    java.lang.String str9 = registerGame0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test171"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO0 = new br.edu.ufcg.es.model.DTO.LoginDTO();
    loginDTO0.setUserId((java.lang.Long)100L);
    loginDTO0.setUserId((java.lang.Long)(-1L));
    java.lang.Long long5 = loginDTO0.getUserId();
    loginDTO0.setUserId((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L)+ "'", long5.equals((-1L)));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test172"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("hi!", (java.lang.Long)1L);
    loginDTO2.setToken("");
    loginDTO2.setToken("");
    loginDTO2.setUserId((java.lang.Long)0L);
    loginDTO2.setUserId((java.lang.Long)0L);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test173"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    java.lang.String str3 = loginDTO2.getToken();
    loginDTO2.setUserId((java.lang.Long)10L);
    java.lang.Long long6 = loginDTO2.getUserId();
    loginDTO2.setUserId((java.lang.Long)100L);
    loginDTO2.setUserId((java.lang.Long)100L);
    loginDTO2.setToken("");
    java.lang.Long long13 = loginDTO2.getUserId();
    loginDTO2.setToken("");
    java.lang.Long long16 = loginDTO2.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L+ "'", long6.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L+ "'", long13.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L+ "'", long16.equals(100L));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test174"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setEmail("");
    java.lang.String str8 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setAddress("");
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str17 = registerUser0.getEmail();
    java.lang.String str18 = registerUser0.getPhone();
    registerUser0.setName("hi!");
    java.lang.String str21 = registerUser0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test175"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    java.lang.String str6 = registerUser0.getPassword();
    java.lang.String str7 = registerUser0.getPhone();
    registerUser0.setName("hi!");
    java.lang.String str10 = registerUser0.getName();
    java.lang.String str11 = registerUser0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test176"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    java.lang.String str1 = registerUser0.getName();
    java.lang.String str2 = registerUser0.getAddress();
    registerUser0.setPhone("");
    registerUser0.setPassword("hi!");
    registerUser0.setPassword("");
    registerUser0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test177"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    java.lang.String str3 = registerGame0.getSport();
    registerGame0.setDescription("hi!");
    registerGame0.setDescription("hi!");
    java.lang.String str8 = registerGame0.getDescription();
    registerGame0.setDescription("");
    registerGame0.setLocal("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test178"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    java.lang.String str5 = registerGame0.getDescription();
    java.lang.String str6 = registerGame0.getDate();
    registerGame0.setLocal("hi!");
    java.lang.String str9 = registerGame0.getDate();
    java.lang.String str10 = registerGame0.getSport();
    registerGame0.setDescription("");
    java.lang.String str13 = registerGame0.getDate();
    registerGame0.setDescription("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test179"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    java.lang.String str5 = authDTO0.getPassword();
    java.lang.String str6 = authDTO0.getEmail();
    java.lang.String str7 = authDTO0.getEmail();
    java.lang.String str8 = authDTO0.getEmail();
    authDTO0.setPassword("hi!");
    java.lang.String str11 = authDTO0.getPassword();
    java.lang.String str12 = authDTO0.getPassword();
    java.lang.String str13 = authDTO0.getEmail();
    java.lang.String str14 = authDTO0.getPassword();
    authDTO0.setEmail("hi!");
    java.lang.String str17 = authDTO0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test180"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    registerUser0.setPassword("");
    registerUser0.setEmail("");
    registerUser0.setPhone("");
    registerUser0.setPhone("");
    java.lang.String str14 = registerUser0.getName();
    java.lang.String str15 = registerUser0.getName();
    registerUser0.setPhone("hi!");
    java.lang.String str18 = registerUser0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test181"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    registerGame0.setLocal("");
    java.lang.String str5 = registerGame0.getLocal();
    registerGame0.setName("");
    registerGame0.setLocal("hi!");
    registerGame0.setDescription("");
    registerGame0.setSport("hi!");
    registerGame0.setDate("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test182"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    java.lang.String str3 = registerGame0.getSport();
    java.lang.String str4 = registerGame0.getLocal();
    registerGame0.setDescription("hi!");
    registerGame0.setDate("");
    java.lang.String str9 = registerGame0.getDescription();
    java.lang.String str10 = registerGame0.getSport();
    java.lang.String str11 = registerGame0.getDescription();
    java.lang.String str12 = registerGame0.getName();
    registerGame0.setDate("");
    registerGame0.setDescription("hi!");
    java.lang.String str17 = registerGame0.getDate();
    registerGame0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test183"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getName();
    registerGame0.setLocal("");
    registerGame0.setName("");
    java.lang.String str7 = registerGame0.getDate();
    java.lang.String str8 = registerGame0.getDescription();
    java.lang.String str9 = registerGame0.getName();
    java.lang.String str10 = registerGame0.getSport();
    java.lang.String str11 = registerGame0.getSport();
    java.lang.String str12 = registerGame0.getDescription();
    java.lang.String str13 = registerGame0.getLocal();
    java.lang.String str14 = registerGame0.getDescription();
    java.lang.String str15 = registerGame0.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test184"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("");
    java.lang.String str7 = authDTO0.getPassword();
    java.lang.String str8 = authDTO0.getEmail();
    authDTO0.setPassword("hi!");
    java.lang.String str11 = authDTO0.getEmail();
    java.lang.String str12 = authDTO0.getEmail();
    java.lang.String str13 = authDTO0.getPassword();
    java.lang.String str14 = authDTO0.getPassword();
    java.lang.String str15 = authDTO0.getPassword();
    authDTO0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test185"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    registerGame0.setDate("hi!");
    java.lang.String str7 = registerGame0.getDate();
    java.lang.String str8 = registerGame0.getLocal();
    registerGame0.setDescription("hi!");
    registerGame0.setLocal("hi!");
    registerGame0.setSport("hi!");
    java.lang.String str15 = registerGame0.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test186"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    java.lang.String str5 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    authDTO0.setEmail("");
    authDTO0.setEmail("");
    java.lang.String str12 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    java.lang.String str15 = authDTO0.getPassword();
    authDTO0.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test187"); }

    br.edu.ufcg.es.model.DTO.SearchDTO searchDTO1 = new br.edu.ufcg.es.model.DTO.SearchDTO("");
    java.lang.String str2 = searchDTO1.getName();
    searchDTO1.setName("");
    searchDTO1.setName("hi!");
    java.lang.String str7 = searchDTO1.getName();
    searchDTO1.setName("");
    searchDTO1.setName("hi!");
    java.lang.String str12 = searchDTO1.getName();
    java.lang.String str13 = searchDTO1.getName();
    searchDTO1.setName("");
    searchDTO1.setName("hi!");
    searchDTO1.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test188"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    ratingParameters0.setAbility(0);
    ratingParameters0.setFairPlay(0);
    int i9 = ratingParameters0.getFairPlay();
    int i10 = ratingParameters0.getFairPlay();
    int i11 = ratingParameters0.getFairPlay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test189"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    java.lang.String str3 = registerGame0.getSport();
    registerGame0.setDescription("");
    java.lang.String str6 = registerGame0.getSport();
    java.lang.String str7 = registerGame0.getLocal();
    registerGame0.setDate("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test190"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getAddress();
    registerUser0.setAddress("");
    registerUser0.setAddress("");
    registerUser0.setPhone("");
    java.lang.String str14 = registerUser0.getPassword();
    java.lang.String str15 = registerUser0.getEmail();
    java.lang.String str16 = registerUser0.getPhone();
    registerUser0.setAddress("");
    java.lang.String str19 = registerUser0.getPassword();
    registerUser0.setPassword("hi!");
    java.lang.String str22 = registerUser0.getEmail();
    registerUser0.setAddress("");
    java.lang.String str25 = registerUser0.getPhone();
    registerUser0.setPassword("");
    registerUser0.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test191"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getDate();
    java.lang.String str2 = registerGame0.getName();
    java.lang.String str3 = registerGame0.getSport();
    java.lang.String str4 = registerGame0.getSport();
    java.lang.String str5 = registerGame0.getDate();
    java.lang.String str6 = registerGame0.getDate();
    registerGame0.setLocal("hi!");
    registerGame0.setDescription("hi!");
    java.lang.String str11 = registerGame0.getName();
    java.lang.String str12 = registerGame0.getLocal();
    registerGame0.setSport("");
    java.lang.String str15 = registerGame0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test192"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("");
    java.lang.String str5 = authDTO0.getPassword();
    java.lang.String str6 = authDTO0.getPassword();
    authDTO0.setPassword("");
    java.lang.String str9 = authDTO0.getEmail();
    authDTO0.setPassword("");
    authDTO0.setPassword("");
    java.lang.String str14 = authDTO0.getEmail();
    authDTO0.setEmail("");
    authDTO0.setEmail("");
    java.lang.String str19 = authDTO0.getEmail();
    authDTO0.setEmail("");
    java.lang.String str22 = authDTO0.getEmail();
    authDTO0.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test193"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    ratingParameters0.setAbility((int)(byte)-1);
    int i7 = ratingParameters0.getFairPlay();
    int i8 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay((int)(byte)1);
    ratingParameters0.setAbility((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test194"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    java.lang.String str3 = registerUser0.getEmail();
    registerUser0.setPassword("");
    registerUser0.setPassword("hi!");
    java.lang.String str8 = registerUser0.getName();
    java.lang.String str9 = registerUser0.getName();
    registerUser0.setPhone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test195"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    java.lang.String str5 = authDTO0.getPassword();
    java.lang.String str6 = authDTO0.getEmail();
    java.lang.String str7 = authDTO0.getEmail();
    java.lang.String str8 = authDTO0.getPassword();
    authDTO0.setEmail("");
    java.lang.String str11 = authDTO0.getPassword();
    java.lang.String str12 = authDTO0.getEmail();
    java.lang.String str13 = authDTO0.getEmail();
    authDTO0.setPassword("hi!");
    java.lang.String str16 = authDTO0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test196"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getEmail();
    java.lang.String str5 = registerUser0.getName();
    registerUser0.setName("");
    registerUser0.setPhone("");
    java.lang.String str10 = registerUser0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test197"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setEmail("");
    java.lang.String str8 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setName("hi!");
    registerUser0.setAddress("hi!");
    registerUser0.setAddress("hi!");
    java.lang.String str17 = registerUser0.getPassword();
    registerUser0.setPhone("hi!");
    registerUser0.setPassword("");
    registerUser0.setPassword("");
    java.lang.String str24 = registerUser0.getName();
    java.lang.String str25 = registerUser0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test198"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setAddress("");
    java.lang.String str5 = registerUser0.getAddress();
    registerUser0.setName("hi!");
    registerUser0.setAddress("hi!");
    registerUser0.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test199"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    loginDTO2.setUserId((java.lang.Long)(-1L));
    java.lang.String str5 = loginDTO2.getToken();
    loginDTO2.setUserId((java.lang.Long)1L);
    java.lang.Long long8 = loginDTO2.getUserId();
    loginDTO2.setUserId((java.lang.Long)(-1L));
    loginDTO2.setToken("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L+ "'", long8.equals(1L));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test200"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setPassword("");
    registerUser0.setEmail("");
    registerUser0.setName("");
    java.lang.String str12 = registerUser0.getName();
    registerUser0.setAddress("hi!");
    java.lang.String str15 = registerUser0.getAddress();
    java.lang.String str16 = registerUser0.getAddress();
    java.lang.String str17 = registerUser0.getEmail();
    java.lang.String str18 = registerUser0.getName();
    registerUser0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test201"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    int i3 = ratingParameters0.getFairPlay();
    int i4 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay(32);
    ratingParameters0.setFairPlay(1);
    ratingParameters0.setFairPlay((int)(byte)1);
    ratingParameters0.setAbility((-1));
    int i13 = ratingParameters0.getAbility();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test202"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getName();
    java.lang.String str4 = registerGame0.getDescription();
    java.lang.String str5 = registerGame0.getSport();
    registerGame0.setDate("hi!");
    registerGame0.setSport("");
    java.lang.String str10 = registerGame0.getDate();
    java.lang.String str11 = registerGame0.getLocal();
    java.lang.String str12 = registerGame0.getName();
    java.lang.String str13 = registerGame0.getSport();
    java.lang.String str14 = registerGame0.getDate();
    java.lang.String str15 = registerGame0.getLocal();
    java.lang.String str16 = registerGame0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test203"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("hi!", (java.lang.Long)1L);
    loginDTO2.setToken("");
    loginDTO2.setToken("");
    loginDTO2.setUserId((java.lang.Long)0L);
    loginDTO2.setToken("hi!");
    java.lang.String str11 = loginDTO2.getToken();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test204"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    int i3 = ratingParameters0.getFairPlay();
    int i4 = ratingParameters0.getFairPlay();
    ratingParameters0.setAbility((int)(byte)-1);
    ratingParameters0.setAbility((int)(byte)10);
    int i9 = ratingParameters0.getAbility();
    ratingParameters0.setAbility((int)(byte)-1);
    int i12 = ratingParameters0.getAbility();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test205"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getName();
    registerGame0.setSport("");
    registerGame0.setDescription("hi!");
    registerGame0.setDate("");
    registerGame0.setDate("");
    java.lang.String str12 = registerGame0.getLocal();
    java.lang.String str13 = registerGame0.getDescription();
    java.lang.String str14 = registerGame0.getDescription();
    registerGame0.setLocal("");
    registerGame0.setLocal("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test206"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    registerUser0.setPassword("");
    java.lang.String str8 = registerUser0.getAddress();
    java.lang.String str9 = registerUser0.getAddress();
    java.lang.String str10 = registerUser0.getAddress();
    java.lang.String str11 = registerUser0.getPhone();
    registerUser0.setName("");
    registerUser0.setAddress("");
    java.lang.String str16 = registerUser0.getPhone();
    registerUser0.setPhone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test207"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getName();
    java.lang.String str3 = registerGame0.getDescription();
    registerGame0.setDate("");
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    java.lang.String str10 = registerGame0.getSport();
    java.lang.String str11 = registerGame0.getLocal();
    registerGame0.setLocal("");
    java.lang.String str14 = registerGame0.getSport();
    java.lang.String str15 = registerGame0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test208"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    java.lang.String str3 = registerGame0.getDescription();
    java.lang.String str4 = registerGame0.getDate();
    registerGame0.setDescription("hi!");
    java.lang.String str7 = registerGame0.getDescription();
    registerGame0.setDate("hi!");
    java.lang.String str10 = registerGame0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test209"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setEmail("");
    java.lang.String str3 = registerUser0.getAddress();
    java.lang.String str4 = registerUser0.getName();
    registerUser0.setAddress("");
    registerUser0.setAddress("hi!");
    registerUser0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test210"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    registerUser0.setPassword("");
    java.lang.String str7 = registerUser0.getPassword();
    registerUser0.setName("hi!");
    registerUser0.setName("hi!");
    java.lang.String str12 = registerUser0.getPhone();
    java.lang.String str13 = registerUser0.getName();
    java.lang.String str14 = registerUser0.getEmail();
    registerUser0.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test211"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    registerUser0.setPassword("");
    registerUser0.setAddress("hi!");
    java.lang.String str9 = registerUser0.getName();
    registerUser0.setPassword("");
    registerUser0.setName("");
    java.lang.String str14 = registerUser0.getPassword();
    registerUser0.setPhone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test212"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("");
    java.lang.String str5 = authDTO0.getPassword();
    java.lang.String str6 = authDTO0.getPassword();
    java.lang.String str7 = authDTO0.getPassword();
    java.lang.String str8 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    authDTO0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test213"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    java.lang.String str3 = registerGame0.getSport();
    java.lang.String str4 = registerGame0.getLocal();
    registerGame0.setDescription("");
    registerGame0.setSport("hi!");
    registerGame0.setLocal("hi!");
    registerGame0.setDescription("hi!");
    registerGame0.setDescription("");
    java.lang.String str15 = registerGame0.getLocal();
    registerGame0.setName("");
    java.lang.String str18 = registerGame0.getDate();
    java.lang.String str19 = registerGame0.getSport();
    java.lang.String str20 = registerGame0.getName();
    java.lang.String str21 = registerGame0.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test214"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    registerGame0.setLocal("");
    java.lang.String str5 = registerGame0.getLocal();
    registerGame0.setDate("hi!");
    java.lang.String str8 = registerGame0.getSport();
    registerGame0.setName("hi!");
    java.lang.String str11 = registerGame0.getName();
    registerGame0.setSport("");
    registerGame0.setDate("");
    java.lang.String str16 = registerGame0.getDescription();
    registerGame0.setSport("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test215"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getAddress();
    registerUser0.setAddress("");
    registerUser0.setAddress("");
    registerUser0.setPhone("");
    registerUser0.setEmail("");
    registerUser0.setPassword("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test216"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO2 = new br.edu.ufcg.es.model.DTO.AuthDTO("hi!", "");
    java.lang.String str3 = authDTO2.getPassword();
    authDTO2.setEmail("hi!");
    authDTO2.setEmail("hi!");
    authDTO2.setPassword("");
    authDTO2.setEmail("");
    java.lang.String str12 = authDTO2.getPassword();
    java.lang.String str13 = authDTO2.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test217"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    java.lang.String str6 = registerUser0.getPassword();
    registerUser0.setAddress("hi!");
    java.lang.String str9 = registerUser0.getPhone();
    java.lang.String str10 = registerUser0.getAddress();
    registerUser0.setPhone("hi!");
    java.lang.String str13 = registerUser0.getAddress();
    java.lang.String str14 = registerUser0.getEmail();
    registerUser0.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test218"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    java.lang.String str3 = loginDTO2.getToken();
    loginDTO2.setUserId((java.lang.Long)10L);
    java.lang.Long long6 = loginDTO2.getUserId();
    loginDTO2.setToken("");
    loginDTO2.setToken("hi!");
    loginDTO2.setToken("hi!");
    loginDTO2.setUserId((java.lang.Long)0L);
    loginDTO2.setUserId((java.lang.Long)100L);
    java.lang.Long long17 = loginDTO2.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L+ "'", long6.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L+ "'", long17.equals(100L));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test219"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setPassword("");
    registerUser0.setEmail("");
    registerUser0.setAddress("hi!");
    registerUser0.setPhone("hi!");
    registerUser0.setName("hi!");
    java.lang.String str16 = registerUser0.getPhone();
    java.lang.String str17 = registerUser0.getEmail();
    java.lang.String str18 = registerUser0.getAddress();
    registerUser0.setPhone("");
    java.lang.String str21 = registerUser0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test220"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    java.lang.String str6 = registerUser0.getEmail();
    registerUser0.setEmail("hi!");
    registerUser0.setPassword("");
    java.lang.String str11 = registerUser0.getEmail();
    registerUser0.setPassword("hi!");
    registerUser0.setPassword("");
    java.lang.String str16 = registerUser0.getPhone();
    java.lang.String str17 = registerUser0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test221"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    java.lang.String str3 = registerGame0.getLocal();
    registerGame0.setDescription("");
    registerGame0.setDate("");
    java.lang.String str8 = registerGame0.getDate();
    java.lang.String str9 = registerGame0.getLocal();
    java.lang.String str10 = registerGame0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test222"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    java.lang.String str6 = registerUser0.getPassword();
    registerUser0.setAddress("hi!");
    java.lang.String str9 = registerUser0.getPhone();
    java.lang.String str10 = registerUser0.getAddress();
    registerUser0.setPassword("");
    registerUser0.setPassword("hi!");
    java.lang.String str15 = registerUser0.getEmail();
    java.lang.String str16 = registerUser0.getAddress();
    registerUser0.setName("");
    registerUser0.setAddress("hi!");
    java.lang.String str21 = registerUser0.getAddress();
    java.lang.String str22 = registerUser0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test223"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    registerGame0.setDate("");
    registerGame0.setDescription("hi!");
    registerGame0.setSport("hi!");
    java.lang.String str9 = registerGame0.getSport();
    registerGame0.setDescription("");
    registerGame0.setDescription("");
    registerGame0.setDescription("");
    java.lang.String str16 = registerGame0.getName();
    registerGame0.setDate("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test224"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO2 = new br.edu.ufcg.es.model.DTO.AuthDTO("hi!", "");
    java.lang.String str3 = authDTO2.getEmail();
    authDTO2.setEmail("hi!");
    authDTO2.setEmail("hi!");
    authDTO2.setPassword("hi!");
    authDTO2.setPassword("hi!");
    authDTO2.setEmail("");
    java.lang.String str14 = authDTO2.getEmail();
    java.lang.String str15 = authDTO2.getEmail();
    authDTO2.setPassword("hi!");
    java.lang.String str18 = authDTO2.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test225"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    registerGame0.setDate("");
    registerGame0.setDescription("hi!");
    registerGame0.setLocal("");
    registerGame0.setLocal("");
    java.lang.String str11 = registerGame0.getSport();
    java.lang.String str12 = registerGame0.getName();
    registerGame0.setDate("");
    registerGame0.setLocal("hi!");
    registerGame0.setSport("hi!");
    java.lang.String str19 = registerGame0.getDate();
    registerGame0.setName("hi!");
    java.lang.String str22 = registerGame0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test226"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    java.lang.String str3 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    java.lang.String str6 = authDTO0.getEmail();
    java.lang.String str7 = authDTO0.getPassword();
    java.lang.String str8 = authDTO0.getEmail();
    java.lang.String str9 = authDTO0.getPassword();
    authDTO0.setEmail("hi!");
    java.lang.String str12 = authDTO0.getPassword();
    authDTO0.setEmail("hi!");
    java.lang.String str15 = authDTO0.getEmail();
    authDTO0.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test227"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    int i3 = ratingParameters0.getAbility();
    ratingParameters0.setAbility((int)' ');
    int i6 = ratingParameters0.getAbility();
    int i7 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay((int)'4');
    int i10 = ratingParameters0.getFairPlay();
    int i11 = ratingParameters0.getAbility();
    int i12 = ratingParameters0.getFairPlay();
    ratingParameters0.setAbility((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test228"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getDate();
    registerGame0.setDate("");
    java.lang.String str6 = registerGame0.getLocal();
    registerGame0.setDate("hi!");
    registerGame0.setSport("hi!");
    registerGame0.setSport("");
    registerGame0.setName("");
    java.lang.String str15 = registerGame0.getDate();
    java.lang.String str16 = registerGame0.getLocal();
    registerGame0.setName("hi!");
    registerGame0.setDescription("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test229"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO2 = new br.edu.ufcg.es.model.DTO.AuthDTO("hi!", "");
    authDTO2.setEmail("hi!");
    java.lang.String str5 = authDTO2.getPassword();
    java.lang.String str6 = authDTO2.getPassword();
    authDTO2.setPassword("hi!");
    authDTO2.setPassword("");
    java.lang.String str11 = authDTO2.getEmail();
    java.lang.String str12 = authDTO2.getPassword();
    authDTO2.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test230"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    java.lang.String str5 = authDTO0.getPassword();
    java.lang.String str6 = authDTO0.getEmail();
    java.lang.String str7 = authDTO0.getEmail();
    java.lang.String str8 = authDTO0.getEmail();
    authDTO0.setPassword("hi!");
    java.lang.String str11 = authDTO0.getEmail();
    authDTO0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test231"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    loginDTO2.setUserId((java.lang.Long)(-1L));
    java.lang.Long long5 = loginDTO2.getUserId();
    loginDTO2.setUserId((java.lang.Long)0L);
    java.lang.String str8 = loginDTO2.getToken();
    java.lang.Long long9 = loginDTO2.getUserId();
    loginDTO2.setToken("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L)+ "'", long5.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L+ "'", long9.equals(0L));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test232"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setPassword("");
    registerUser0.setPhone("hi!");
    java.lang.String str10 = registerUser0.getPhone();
    java.lang.String str11 = registerUser0.getPhone();
    registerUser0.setPassword("");
    registerUser0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test233"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setEmail("");
    java.lang.String str8 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setPassword("hi!");
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    registerUser0.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test234"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getName();
    registerGame0.setLocal("hi!");
    java.lang.String str6 = registerGame0.getLocal();
    java.lang.String str7 = registerGame0.getSport();
    java.lang.String str8 = registerGame0.getSport();
    java.lang.String str9 = registerGame0.getLocal();
    java.lang.String str10 = registerGame0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test235"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    ratingParameters0.setFairPlay((int)(short)100);
    ratingParameters0.setFairPlay((int)(byte)1);
    ratingParameters0.setFairPlay((int)(short)0);
    int i9 = ratingParameters0.getFairPlay();
    int i10 = ratingParameters0.getAbility();
    int i11 = ratingParameters0.getFairPlay();
    ratingParameters0.setAbility((int)'4');
    int i14 = ratingParameters0.getFairPlay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test236"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    java.lang.String str3 = registerGame0.getLocal();
    registerGame0.setDescription("");
    java.lang.String str6 = registerGame0.getLocal();
    java.lang.String str7 = registerGame0.getDescription();
    java.lang.String str8 = registerGame0.getDate();
    registerGame0.setLocal("hi!");
    registerGame0.setDescription("");
    java.lang.String str13 = registerGame0.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test237"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("");
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("");
    java.lang.String str9 = authDTO0.getPassword();
    authDTO0.setEmail("");
    authDTO0.setPassword("hi!");
    java.lang.String str14 = authDTO0.getEmail();
    java.lang.String str15 = authDTO0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test238"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)10L);
    loginDTO2.setUserId((java.lang.Long)1L);
    loginDTO2.setToken("hi!");
    loginDTO2.setUserId((java.lang.Long)1L);
    loginDTO2.setToken("");
    loginDTO2.setToken("");
    java.lang.String str13 = loginDTO2.getToken();
    loginDTO2.setToken("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test239"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getName();
    java.lang.String str4 = registerGame0.getDescription();
    java.lang.String str5 = registerGame0.getSport();
    registerGame0.setDate("hi!");
    registerGame0.setSport("");
    java.lang.String str10 = registerGame0.getDate();
    registerGame0.setLocal("hi!");
    java.lang.String str13 = registerGame0.getSport();
    registerGame0.setDate("hi!");
    registerGame0.setDate("hi!");
    registerGame0.setSport("");
    java.lang.String str20 = registerGame0.getName();
    registerGame0.setSport("");
    java.lang.String str23 = registerGame0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test240"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setEmail("");
    registerUser0.setPhone("");
    java.lang.String str10 = registerUser0.getPassword();
    java.lang.String str11 = registerUser0.getEmail();
    registerUser0.setName("hi!");
    java.lang.String str14 = registerUser0.getPhone();
    java.lang.String str15 = registerUser0.getAddress();
    java.lang.String str16 = registerUser0.getPhone();
    registerUser0.setPassword("");
    java.lang.String str19 = registerUser0.getAddress();
    java.lang.String str20 = registerUser0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test241"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    java.lang.String str5 = authDTO0.getPassword();
    java.lang.String str6 = authDTO0.getEmail();
    java.lang.String str7 = authDTO0.getEmail();
    java.lang.String str8 = authDTO0.getEmail();
    java.lang.String str9 = authDTO0.getPassword();
    java.lang.String str10 = authDTO0.getEmail();
    java.lang.String str11 = authDTO0.getEmail();
    java.lang.String str12 = authDTO0.getEmail();
    java.lang.String str13 = authDTO0.getPassword();
    authDTO0.setEmail("hi!");
    java.lang.String str16 = authDTO0.getPassword();
    java.lang.String str17 = authDTO0.getEmail();
    authDTO0.setPassword("");
    authDTO0.setEmail("hi!");
    java.lang.String str22 = authDTO0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test242"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    java.lang.String str5 = registerGame0.getDescription();
    java.lang.String str6 = registerGame0.getDescription();
    registerGame0.setName("");
    registerGame0.setSport("hi!");
    java.lang.String str11 = registerGame0.getDescription();
    java.lang.String str12 = registerGame0.getLocal();
    java.lang.String str13 = registerGame0.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test243"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setPassword("hi!");
    authDTO0.setEmail("hi!");
    authDTO0.setEmail("");
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("");
    authDTO0.setPassword("");
    authDTO0.setEmail("hi!");

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test244"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    registerUser0.setPassword("");
    registerUser0.setName("");
    java.lang.String str9 = registerUser0.getPhone();
    java.lang.String str10 = registerUser0.getName();
    java.lang.String str11 = registerUser0.getPassword();
    registerUser0.setPassword("hi!");
    java.lang.String str14 = registerUser0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test245"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setPassword("hi!");
    java.lang.String str8 = registerUser0.getName();
    registerUser0.setName("");
    registerUser0.setEmail("hi!");
    java.lang.String str13 = registerUser0.getPassword();
    java.lang.String str14 = registerUser0.getName();
    registerUser0.setAddress("");
    java.lang.String str17 = registerUser0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test246"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    java.lang.String str3 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("hi!");
    authDTO0.setEmail("");
    java.lang.String str12 = authDTO0.getPassword();
    java.lang.String str13 = authDTO0.getPassword();
    java.lang.String str14 = authDTO0.getEmail();
    authDTO0.setPassword("");
    authDTO0.setPassword("");
    java.lang.String str19 = authDTO0.getEmail();
    authDTO0.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test247"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getName();
    registerGame0.setDescription("hi!");
    registerGame0.setSport("");
    java.lang.String str8 = registerGame0.getDescription();
    java.lang.String str9 = registerGame0.getLocal();
    java.lang.String str10 = registerGame0.getDescription();
    registerGame0.setSport("");
    registerGame0.setName("");
    registerGame0.setLocal("");
    registerGame0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test248"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDate("");
    registerGame0.setName("hi!");
    java.lang.String str7 = registerGame0.getLocal();
    java.lang.String str8 = registerGame0.getName();
    registerGame0.setDate("");
    java.lang.String str11 = registerGame0.getName();
    java.lang.String str12 = registerGame0.getDescription();
    registerGame0.setName("");
    java.lang.String str15 = registerGame0.getDescription();
    java.lang.String str16 = registerGame0.getSport();
    registerGame0.setDescription("");
    registerGame0.setSport("");
    java.lang.String str21 = registerGame0.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test249"); }

    br.edu.ufcg.es.model.DTO.SearchDTO searchDTO0 = new br.edu.ufcg.es.model.DTO.SearchDTO();
    java.lang.String str1 = searchDTO0.getName();
    java.lang.String str2 = searchDTO0.getName();
    java.lang.String str3 = searchDTO0.getName();
    java.lang.String str4 = searchDTO0.getName();
    searchDTO0.setName("hi!");
    java.lang.String str7 = searchDTO0.getName();
    java.lang.String str8 = searchDTO0.getName();
    searchDTO0.setName("");
    searchDTO0.setName("hi!");
    searchDTO0.setName("hi!");
    java.lang.String str15 = searchDTO0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test250"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    registerGame0.setDate("hi!");
    registerGame0.setDate("hi!");
    registerGame0.setName("hi!");
    registerGame0.setDescription("");
    java.lang.String str11 = registerGame0.getName();
    registerGame0.setLocal("");
    registerGame0.setLocal("hi!");
    registerGame0.setDescription("");
    java.lang.String str18 = registerGame0.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test251"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    ratingParameters0.setFairPlay((int)(short)100);
    int i5 = ratingParameters0.getFairPlay();
    int i6 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay(1);
    ratingParameters0.setFairPlay((-1));
    ratingParameters0.setFairPlay((int)(byte)1);
    ratingParameters0.setAbility(0);
    ratingParameters0.setFairPlay(0);
    ratingParameters0.setAbility((int)(byte)0);
    int i19 = ratingParameters0.getAbility();
    int i20 = ratingParameters0.getAbility();
    ratingParameters0.setAbility(0);
    ratingParameters0.setAbility(10);
    ratingParameters0.setAbility(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test252"); }

    br.edu.ufcg.es.model.DTO.SearchDTO searchDTO0 = new br.edu.ufcg.es.model.DTO.SearchDTO();
    java.lang.String str1 = searchDTO0.getName();
    java.lang.String str2 = searchDTO0.getName();
    java.lang.String str3 = searchDTO0.getName();
    java.lang.String str4 = searchDTO0.getName();
    searchDTO0.setName("hi!");
    searchDTO0.setName("");
    searchDTO0.setName("");
    searchDTO0.setName("");
    java.lang.String str13 = searchDTO0.getName();
    searchDTO0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test253"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("hi!", (java.lang.Long)0L);
    loginDTO2.setUserId((java.lang.Long)100L);
    loginDTO2.setUserId((java.lang.Long)0L);
    loginDTO2.setToken("hi!");
    loginDTO2.setToken("hi!");
    loginDTO2.setUserId((java.lang.Long)0L);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test254"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    java.lang.String str5 = registerGame0.getDescription();
    java.lang.String str6 = registerGame0.getDate();
    registerGame0.setLocal("hi!");
    registerGame0.setDescription("");
    java.lang.String str11 = registerGame0.getDescription();
    registerGame0.setSport("hi!");
    java.lang.String str14 = registerGame0.getName();
    java.lang.String str15 = registerGame0.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test255"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getDate();
    registerGame0.setDate("");
    registerGame0.setName("");
    registerGame0.setName("hi!");
    java.lang.String str10 = registerGame0.getDescription();
    registerGame0.setDate("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test256"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)(-1L));
    java.lang.String str3 = loginDTO2.getToken();
    loginDTO2.setToken("");
    loginDTO2.setUserId((java.lang.Long)0L);
    loginDTO2.setUserId((java.lang.Long)(-1L));
    java.lang.String str10 = loginDTO2.getToken();
    java.lang.Long long11 = loginDTO2.getUserId();
    java.lang.String str12 = loginDTO2.getToken();
    java.lang.Long long13 = loginDTO2.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L)+ "'", long11.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L)+ "'", long13.equals((-1L)));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test257"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setPassword("");
    java.lang.String str8 = registerUser0.getName();
    registerUser0.setAddress("hi!");
    java.lang.String str11 = registerUser0.getAddress();
    registerUser0.setName("hi!");
    java.lang.String str14 = registerUser0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test258"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setEmail("hi!");
    java.lang.String str8 = registerUser0.getEmail();
    registerUser0.setPassword("hi!");
    registerUser0.setName("");
    registerUser0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test259"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    int i3 = ratingParameters0.getFairPlay();
    int i4 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay(52);
    ratingParameters0.setFairPlay(0);
    ratingParameters0.setFairPlay((int)(short)0);
    int i11 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay(35);
    int i14 = ratingParameters0.getAbility();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test260"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    int i3 = ratingParameters0.getFairPlay();
    int i4 = ratingParameters0.getAbility();
    ratingParameters0.setAbility((int)(byte)10);
    ratingParameters0.setAbility((int)'#');
    int i9 = ratingParameters0.getAbility();
    ratingParameters0.setAbility((int)'#');
    ratingParameters0.setFairPlay((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test261"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getDate();
    registerGame0.setDescription("");
    java.lang.String str6 = registerGame0.getSport();
    java.lang.String str7 = registerGame0.getSport();
    java.lang.String str8 = registerGame0.getName();
    registerGame0.setSport("");
    registerGame0.setDescription("hi!");
    registerGame0.setDescription("");
    registerGame0.setDescription("hi!");
    java.lang.String str17 = registerGame0.getDescription();
    java.lang.String str18 = registerGame0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test262"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO2 = new br.edu.ufcg.es.model.DTO.AuthDTO("hi!", "");
    java.lang.String str3 = authDTO2.getEmail();
    authDTO2.setEmail("");
    authDTO2.setEmail("");
    java.lang.String str8 = authDTO2.getPassword();
    authDTO2.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test263"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    java.lang.Long long3 = loginDTO2.getUserId();
    java.lang.String str4 = loginDTO2.getToken();
    java.lang.String str5 = loginDTO2.getToken();
    loginDTO2.setToken("hi!");
    java.lang.String str8 = loginDTO2.getToken();
    java.lang.String str9 = loginDTO2.getToken();
    java.lang.String str10 = loginDTO2.getToken();
    loginDTO2.setUserId((java.lang.Long)1L);
    loginDTO2.setUserId((java.lang.Long)1L);
    java.lang.String str15 = loginDTO2.getToken();
    loginDTO2.setToken("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L+ "'", long3.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test264"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    java.lang.String str6 = registerUser0.getName();
    java.lang.String str7 = registerUser0.getPassword();
    registerUser0.setName("");
    java.lang.String str10 = registerUser0.getName();
    registerUser0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test265"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPhone();
    java.lang.String str5 = registerUser0.getAddress();
    registerUser0.setAddress("hi!");
    registerUser0.setPassword("hi!");
    java.lang.String str10 = registerUser0.getPassword();
    registerUser0.setPassword("hi!");
    registerUser0.setPhone("");
    registerUser0.setName("");
    java.lang.String str17 = registerUser0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test266"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    ratingParameters0.setAbility((int)(byte)-1);
    int i7 = ratingParameters0.getFairPlay();
    int i8 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay((int)(byte)1);
    ratingParameters0.setAbility((int)' ');
    int i13 = ratingParameters0.getAbility();
    ratingParameters0.setAbility(100);
    ratingParameters0.setAbility((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 32);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test267"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    java.lang.String str6 = registerUser0.getEmail();
    registerUser0.setName("hi!");
    java.lang.String str9 = registerUser0.getPassword();
    registerUser0.setPassword("hi!");
    registerUser0.setName("");
    java.lang.String str14 = registerUser0.getName();
    java.lang.String str15 = registerUser0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test268"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setEmail("");
    registerUser0.setName("hi!");
    java.lang.String str10 = registerUser0.getPhone();
    registerUser0.setPhone("");
    java.lang.String str13 = registerUser0.getPhone();
    java.lang.String str14 = registerUser0.getName();
    java.lang.String str15 = registerUser0.getName();
    registerUser0.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test269"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    registerGame0.setSport("hi!");
    java.lang.String str5 = registerGame0.getSport();
    registerGame0.setLocal("");
    registerGame0.setDescription("hi!");
    java.lang.String str10 = registerGame0.getName();
    registerGame0.setDate("hi!");
    registerGame0.setSport("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test270"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setPassword("");
    java.lang.String str8 = registerUser0.getEmail();
    registerUser0.setPhone("hi!");
    java.lang.String str11 = registerUser0.getAddress();
    registerUser0.setAddress("hi!");
    java.lang.String str14 = registerUser0.getPhone();
    registerUser0.setName("hi!");
    java.lang.String str17 = registerUser0.getAddress();
    java.lang.String str18 = registerUser0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test271"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getDescription();
    java.lang.String str2 = registerGame0.getName();
    java.lang.String str3 = registerGame0.getSport();
    registerGame0.setLocal("");
    registerGame0.setSport("");
    registerGame0.setLocal("hi!");
    registerGame0.setName("hi!");
    registerGame0.setLocal("");
    java.lang.String str14 = registerGame0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test272"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getName();
    java.lang.String str4 = registerGame0.getDescription();
    java.lang.String str5 = registerGame0.getSport();
    registerGame0.setDate("hi!");
    registerGame0.setSport("");
    java.lang.String str10 = registerGame0.getDate();
    registerGame0.setLocal("hi!");
    java.lang.String str13 = registerGame0.getSport();
    registerGame0.setDate("hi!");
    java.lang.String str16 = registerGame0.getSport();
    registerGame0.setDescription("");
    registerGame0.setLocal("");
    java.lang.String str21 = registerGame0.getName();
    registerGame0.setDate("hi!");
    registerGame0.setLocal("hi!");
    java.lang.String str26 = registerGame0.getName();
    java.lang.String str27 = registerGame0.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test273"); }

    br.edu.ufcg.es.model.DTO.SearchDTO searchDTO1 = new br.edu.ufcg.es.model.DTO.SearchDTO("");
    searchDTO1.setName("");
    java.lang.String str4 = searchDTO1.getName();
    searchDTO1.setName("");
    searchDTO1.setName("");
    searchDTO1.setName("hi!");
    java.lang.String str11 = searchDTO1.getName();
    java.lang.String str12 = searchDTO1.getName();
    java.lang.String str13 = searchDTO1.getName();
    searchDTO1.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test274"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO2 = new br.edu.ufcg.es.model.DTO.AuthDTO("hi!", "");
    java.lang.String str3 = authDTO2.getPassword();
    authDTO2.setPassword("");
    java.lang.String str6 = authDTO2.getPassword();
    java.lang.String str7 = authDTO2.getEmail();
    java.lang.String str8 = authDTO2.getPassword();
    java.lang.String str9 = authDTO2.getEmail();
    authDTO2.setPassword("hi!");
    java.lang.String str12 = authDTO2.getEmail();
    authDTO2.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test275"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setEmail("");
    java.lang.String str8 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setName("hi!");
    registerUser0.setPhone("hi!");
    registerUser0.setEmail("");
    registerUser0.setPassword("hi!");
    java.lang.String str19 = registerUser0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test276"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    ratingParameters0.setFairPlay((int)(short)100);
    int i5 = ratingParameters0.getFairPlay();
    int i6 = ratingParameters0.getAbility();
    int i7 = ratingParameters0.getFairPlay();
    int i8 = ratingParameters0.getFairPlay();
    ratingParameters0.setAbility((int)'a');
    ratingParameters0.setAbility(52);
    ratingParameters0.setFairPlay(100);
    ratingParameters0.setAbility(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test277"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    ratingParameters0.setFairPlay((int)(short)100);
    int i5 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay((int)'a');
    int i8 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay(0);
    ratingParameters0.setAbility(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test278"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setAddress("hi!");
    registerUser0.setName("hi!");
    java.lang.String str8 = registerUser0.getPassword();
    registerUser0.setAddress("");
    registerUser0.setPassword("hi!");
    registerUser0.setPassword("");
    registerUser0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test279"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    java.lang.String str5 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    authDTO0.setEmail("hi!");
    authDTO0.setEmail("");
    java.lang.String str12 = authDTO0.getPassword();
    java.lang.String str13 = authDTO0.getPassword();
    java.lang.String str14 = authDTO0.getEmail();
    authDTO0.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test280"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)(-1L));
    loginDTO2.setToken("hi!");
    loginDTO2.setUserId((java.lang.Long)(-1L));
    java.lang.String str7 = loginDTO2.getToken();
    java.lang.Long long8 = loginDTO2.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L)+ "'", long8.equals((-1L)));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test281"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    ratingParameters0.setAbility((int)(byte)-1);
    ratingParameters0.setAbility((int)'a');
    ratingParameters0.setFairPlay((int)(short)-1);
    int i11 = ratingParameters0.getFairPlay();
    int i12 = ratingParameters0.getFairPlay();
    int i13 = ratingParameters0.getFairPlay();
    int i14 = ratingParameters0.getAbility();
    ratingParameters0.setAbility(1);
    ratingParameters0.setFairPlay(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 97);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test282"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    java.lang.String str5 = registerGame0.getDescription();
    java.lang.String str6 = registerGame0.getDate();
    java.lang.String str7 = registerGame0.getLocal();
    java.lang.String str8 = registerGame0.getName();
    registerGame0.setSport("hi!");
    registerGame0.setName("hi!");
    java.lang.String str13 = registerGame0.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test283"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getDate();
    java.lang.String str2 = registerGame0.getName();
    registerGame0.setSport("hi!");
    registerGame0.setDate("");
    java.lang.String str7 = registerGame0.getDate();
    java.lang.String str8 = registerGame0.getDate();
    java.lang.String str9 = registerGame0.getSport();
    registerGame0.setLocal("");
    registerGame0.setDescription("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test284"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPassword("hi!");
    registerUser0.setPhone("");
    java.lang.String str9 = registerUser0.getAddress();
    java.lang.String str10 = registerUser0.getPassword();
    registerUser0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test285"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    java.lang.String str3 = registerGame0.getDescription();
    registerGame0.setDate("hi!");
    java.lang.String str6 = registerGame0.getDescription();
    java.lang.String str7 = registerGame0.getSport();
    java.lang.String str8 = registerGame0.getDescription();
    registerGame0.setDescription("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test286"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getName();
    java.lang.String str4 = registerGame0.getDescription();
    java.lang.String str5 = registerGame0.getSport();
    registerGame0.setDate("hi!");
    registerGame0.setLocal("hi!");
    java.lang.String str10 = registerGame0.getName();
    java.lang.String str11 = registerGame0.getName();
    java.lang.String str12 = registerGame0.getName();
    registerGame0.setSport("hi!");
    java.lang.String str15 = registerGame0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test287"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    java.lang.String str3 = registerGame0.getDate();
    java.lang.String str4 = registerGame0.getDate();
    java.lang.String str5 = registerGame0.getDate();
    registerGame0.setName("hi!");
    java.lang.String str8 = registerGame0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test288"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setPassword("");
    registerUser0.setEmail("");
    registerUser0.setName("hi!");
    registerUser0.setPhone("");
    registerUser0.setPhone("");
    registerUser0.setAddress("");
    registerUser0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test289"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    java.lang.String str5 = registerGame0.getDescription();
    java.lang.String str6 = registerGame0.getDate();
    registerGame0.setLocal("hi!");
    registerGame0.setDescription("");
    registerGame0.setName("");
    java.lang.String str13 = registerGame0.getName();
    java.lang.String str14 = registerGame0.getLocal();
    java.lang.String str15 = registerGame0.getLocal();
    registerGame0.setDescription("");
    registerGame0.setName("");
    registerGame0.setDate("hi!");
    registerGame0.setDate("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test290"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getName();
    java.lang.String str3 = registerGame0.getDescription();
    registerGame0.setDate("");
    registerGame0.setSport("hi!");
    registerGame0.setSport("");
    java.lang.String str10 = registerGame0.getLocal();
    java.lang.String str11 = registerGame0.getDescription();
    java.lang.String str12 = registerGame0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test291"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO0 = new br.edu.ufcg.es.model.DTO.LoginDTO();
    java.lang.String str1 = loginDTO0.getToken();
    java.lang.Long long2 = loginDTO0.getUserId();
    java.lang.String str3 = loginDTO0.getToken();
    loginDTO0.setToken("");
    loginDTO0.setToken("");
    java.lang.String str8 = loginDTO0.getToken();
    loginDTO0.setUserId((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test292"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getDescription();
    registerGame0.setLocal("");
    java.lang.String str6 = registerGame0.getDescription();
    registerGame0.setDate("hi!");
    java.lang.String str9 = registerGame0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test293"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getName();
    java.lang.String str4 = registerGame0.getDescription();
    java.lang.String str5 = registerGame0.getSport();
    registerGame0.setDate("hi!");
    registerGame0.setSport("");
    java.lang.String str10 = registerGame0.getSport();
    registerGame0.setSport("hi!");
    registerGame0.setSport("");
    registerGame0.setName("hi!");
    registerGame0.setDate("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test294"); }

    br.edu.ufcg.es.model.DTO.SearchDTO searchDTO1 = new br.edu.ufcg.es.model.DTO.SearchDTO("");
    searchDTO1.setName("hi!");
    searchDTO1.setName("");
    searchDTO1.setName("hi!");
    searchDTO1.setName("hi!");
    java.lang.String str10 = searchDTO1.getName();
    java.lang.String str11 = searchDTO1.getName();
    java.lang.String str12 = searchDTO1.getName();
    searchDTO1.setName("hi!");
    java.lang.String str15 = searchDTO1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test295"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    registerGame0.setLocal("");
    java.lang.String str5 = registerGame0.getLocal();
    registerGame0.setName("");
    registerGame0.setName("");
    java.lang.String str10 = registerGame0.getName();
    java.lang.String str11 = registerGame0.getDate();
    java.lang.String str12 = registerGame0.getDate();
    java.lang.String str13 = registerGame0.getLocal();
    java.lang.String str14 = registerGame0.getDescription();
    java.lang.String str15 = registerGame0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test296"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    registerGame0.setLocal("");
    java.lang.String str5 = registerGame0.getLocal();
    registerGame0.setDescription("hi!");
    java.lang.String str8 = registerGame0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test297"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    java.lang.String str3 = registerGame0.getDate();
    java.lang.String str4 = registerGame0.getName();
    registerGame0.setDate("hi!");
    java.lang.String str7 = registerGame0.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test298"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    java.lang.String str5 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    authDTO0.setEmail("");
    authDTO0.setEmail("");
    java.lang.String str12 = authDTO0.getPassword();
    java.lang.String str13 = authDTO0.getEmail();
    java.lang.String str14 = authDTO0.getPassword();
    authDTO0.setEmail("");
    java.lang.String str17 = authDTO0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test299"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setEmail("");
    java.lang.String str3 = registerUser0.getAddress();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPhone();
    registerUser0.setPhone("");
    java.lang.String str8 = registerUser0.getEmail();
    java.lang.String str9 = registerUser0.getPhone();
    registerUser0.setPhone("hi!");
    registerUser0.setPhone("hi!");
    java.lang.String str14 = registerUser0.getName();
    registerUser0.setPassword("hi!");
    registerUser0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test300"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    java.lang.String str3 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    java.lang.String str6 = authDTO0.getEmail();
    java.lang.String str7 = authDTO0.getPassword();
    authDTO0.setEmail("");
    java.lang.String str10 = authDTO0.getEmail();
    java.lang.String str11 = authDTO0.getEmail();
    java.lang.String str12 = authDTO0.getPassword();
    java.lang.String str13 = authDTO0.getEmail();
    java.lang.String str14 = authDTO0.getPassword();
    java.lang.String str15 = authDTO0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test301"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    java.lang.String str5 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    authDTO0.setEmail("");
    authDTO0.setEmail("");
    java.lang.String str12 = authDTO0.getPassword();
    java.lang.String str13 = authDTO0.getEmail();
    authDTO0.setEmail("");
    authDTO0.setPassword("");
    java.lang.String str18 = authDTO0.getEmail();
    authDTO0.setEmail("hi!");
    java.lang.String str21 = authDTO0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test302"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setAddress("hi!");
    java.lang.String str8 = registerUser0.getPassword();
    registerUser0.setEmail("hi!");
    java.lang.String str11 = registerUser0.getAddress();
    java.lang.String str12 = registerUser0.getEmail();
    registerUser0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test303"); }

    br.edu.ufcg.es.model.DTO.SearchDTO searchDTO1 = new br.edu.ufcg.es.model.DTO.SearchDTO("");
    searchDTO1.setName("");
    searchDTO1.setName("hi!");
    java.lang.String str6 = searchDTO1.getName();
    searchDTO1.setName("hi!");
    searchDTO1.setName("hi!");
    java.lang.String str11 = searchDTO1.getName();
    searchDTO1.setName("");
    searchDTO1.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test304"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setEmail("");
    java.lang.String str8 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setName("hi!");
    registerUser0.setPhone("hi!");
    registerUser0.setEmail("");
    registerUser0.setAddress("hi!");
    java.lang.String str19 = registerUser0.getEmail();
    registerUser0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test305"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    java.lang.String str5 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    authDTO0.setEmail("hi!");
    authDTO0.setEmail("");
    java.lang.String str12 = authDTO0.getPassword();
    java.lang.String str13 = authDTO0.getPassword();
    java.lang.String str14 = authDTO0.getPassword();
    authDTO0.setEmail("hi!");
    authDTO0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test306"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getEmail();
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setEmail("hi!");
    java.lang.String str8 = registerUser0.getEmail();
    registerUser0.setPhone("hi!");
    java.lang.String str11 = registerUser0.getEmail();
    registerUser0.setName("");
    java.lang.String str14 = registerUser0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test307"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("");
    java.lang.String str5 = authDTO0.getEmail();
    authDTO0.setPassword("hi!");
    java.lang.String str8 = authDTO0.getPassword();
    authDTO0.setEmail("hi!");
    java.lang.String str11 = authDTO0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test308"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    ratingParameters0.setAbility(0);
    int i7 = ratingParameters0.getFairPlay();
    int i8 = ratingParameters0.getAbility();
    int i9 = ratingParameters0.getFairPlay();
    int i10 = ratingParameters0.getAbility();
    int i11 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay((int)'#');
    int i14 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay(97);
    int i17 = ratingParameters0.getAbility();
    ratingParameters0.setAbility((int)(byte)-1);
    ratingParameters0.setAbility((-1));
    ratingParameters0.setFairPlay(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test309"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    java.lang.String str6 = registerUser0.getPassword();
    registerUser0.setPassword("");
    registerUser0.setPassword("");
    java.lang.String str11 = registerUser0.getAddress();
    java.lang.String str12 = registerUser0.getPassword();
    registerUser0.setEmail("hi!");
    registerUser0.setPhone("");
    java.lang.String str17 = registerUser0.getName();
    registerUser0.setEmail("hi!");
    java.lang.String str20 = registerUser0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test310"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO2 = new br.edu.ufcg.es.model.DTO.AuthDTO("hi!", "");
    java.lang.String str3 = authDTO2.getEmail();
    authDTO2.setEmail("hi!");
    authDTO2.setEmail("hi!");
    authDTO2.setPassword("hi!");
    authDTO2.setPassword("hi!");
    java.lang.String str12 = authDTO2.getPassword();
    java.lang.String str13 = authDTO2.getPassword();
    authDTO2.setEmail("hi!");
    authDTO2.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test311"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    ratingParameters0.setFairPlay((int)(short)100);
    int i5 = ratingParameters0.getFairPlay();
    int i6 = ratingParameters0.getAbility();
    ratingParameters0.setAbility((int)(byte)1);
    ratingParameters0.setAbility(32);
    ratingParameters0.setFairPlay((int)(byte)1);
    int i13 = ratingParameters0.getAbility();
    int i14 = ratingParameters0.getFairPlay();
    ratingParameters0.setAbility(52);
    ratingParameters0.setFairPlay(32);
    int i19 = ratingParameters0.getFairPlay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 32);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test312"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("hi!", (java.lang.Long)0L);
    java.lang.Long long3 = loginDTO2.getUserId();
    java.lang.Long long4 = loginDTO2.getUserId();
    loginDTO2.setToken("");
    loginDTO2.setUserId((java.lang.Long)100L);
    loginDTO2.setUserId((java.lang.Long)0L);
    java.lang.String str11 = loginDTO2.getToken();
    loginDTO2.setToken("hi!");
    loginDTO2.setUserId((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L+ "'", long3.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L+ "'", long4.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test313"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("");
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    java.lang.String str11 = authDTO0.getEmail();
    authDTO0.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test314"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    registerGame0.setName("hi!");
    registerGame0.setDate("");
    java.lang.String str7 = registerGame0.getSport();
    registerGame0.setName("");
    java.lang.String str10 = registerGame0.getDate();
    registerGame0.setSport("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test315"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setEmail("");
    java.lang.String str8 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setName("hi!");
    registerUser0.setAddress("hi!");
    registerUser0.setAddress("hi!");
    java.lang.String str17 = registerUser0.getName();
    java.lang.String str18 = registerUser0.getPhone();
    registerUser0.setPassword("");
    java.lang.String str21 = registerUser0.getPhone();
    registerUser0.setPhone("hi!");
    java.lang.String str24 = registerUser0.getPassword();
    registerUser0.setName("");
    registerUser0.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test316"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    java.lang.String str5 = registerGame0.getDescription();
    java.lang.String str6 = registerGame0.getDate();
    registerGame0.setLocal("hi!");
    registerGame0.setDescription("");
    registerGame0.setName("");
    java.lang.String str13 = registerGame0.getName();
    registerGame0.setLocal("hi!");
    registerGame0.setName("hi!");
    java.lang.String str18 = registerGame0.getDescription();
    registerGame0.setSport("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test317"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    java.lang.String str5 = authDTO0.getPassword();
    java.lang.String str6 = authDTO0.getEmail();
    authDTO0.setEmail("");
    authDTO0.setEmail("");
    authDTO0.setEmail("");
    java.lang.String str13 = authDTO0.getPassword();
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    java.lang.String str18 = authDTO0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test318"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    loginDTO2.setUserId((java.lang.Long)(-1L));
    loginDTO2.setToken("hi!");
    loginDTO2.setUserId((java.lang.Long)100L);
    loginDTO2.setUserId((java.lang.Long)1L);
    java.lang.String str11 = loginDTO2.getToken();
    loginDTO2.setToken("hi!");
    loginDTO2.setToken("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test319"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setPhone("");
    registerUser0.setEmail("hi!");
    registerUser0.setAddress("hi!");
    java.lang.String str12 = registerUser0.getPassword();
    registerUser0.setName("");
    registerUser0.setPhone("hi!");
    registerUser0.setEmail("hi!");
    java.lang.String str19 = registerUser0.getPassword();
    registerUser0.setPhone("");
    registerUser0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test320"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    java.lang.String str5 = authDTO0.getPassword();
    java.lang.String str6 = authDTO0.getEmail();
    java.lang.String str7 = authDTO0.getEmail();
    java.lang.String str8 = authDTO0.getPassword();
    authDTO0.setEmail("");
    java.lang.String str11 = authDTO0.getPassword();
    java.lang.String str12 = authDTO0.getEmail();
    java.lang.String str13 = authDTO0.getEmail();
    authDTO0.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test321"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    java.lang.String str5 = registerGame0.getDate();
    java.lang.String str6 = registerGame0.getDate();
    java.lang.String str7 = registerGame0.getSport();
    java.lang.String str8 = registerGame0.getSport();
    java.lang.String str9 = registerGame0.getLocal();
    java.lang.String str10 = registerGame0.getName();
    java.lang.String str11 = registerGame0.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test322"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getLocal();
    java.lang.String str4 = registerGame0.getDate();
    java.lang.String str5 = registerGame0.getSport();
    java.lang.String str6 = registerGame0.getSport();
    registerGame0.setLocal("hi!");
    java.lang.String str9 = registerGame0.getDate();
    java.lang.String str10 = registerGame0.getDate();
    java.lang.String str11 = registerGame0.getName();
    registerGame0.setDescription("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test323"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    java.lang.String str3 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    authDTO0.setEmail("hi!");
    java.lang.String str8 = authDTO0.getPassword();
    authDTO0.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test324"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("hi!", (java.lang.Long)0L);
    java.lang.Long long3 = loginDTO2.getUserId();
    java.lang.Long long4 = loginDTO2.getUserId();
    loginDTO2.setToken("");
    loginDTO2.setToken("hi!");
    loginDTO2.setUserId((java.lang.Long)0L);
    java.lang.Long long11 = loginDTO2.getUserId();
    loginDTO2.setUserId((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L+ "'", long3.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L+ "'", long4.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L+ "'", long11.equals(0L));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test325"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getAddress();
    registerUser0.setAddress("");
    registerUser0.setAddress("");
    java.lang.String str12 = registerUser0.getPhone();
    java.lang.String str13 = registerUser0.getPassword();
    registerUser0.setEmail("hi!");
    java.lang.String str16 = registerUser0.getPhone();
    java.lang.String str17 = registerUser0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test326"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setName("hi!");
    registerUser0.setPassword("");
    registerUser0.setEmail("");
    registerUser0.setName("hi!");
    java.lang.String str14 = registerUser0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test327"); }

    br.edu.ufcg.es.model.DTO.SearchDTO searchDTO0 = new br.edu.ufcg.es.model.DTO.SearchDTO();
    java.lang.String str1 = searchDTO0.getName();
    java.lang.String str2 = searchDTO0.getName();
    searchDTO0.setName("");
    java.lang.String str5 = searchDTO0.getName();
    searchDTO0.setName("hi!");
    searchDTO0.setName("");
    java.lang.String str10 = searchDTO0.getName();
    searchDTO0.setName("hi!");
    searchDTO0.setName("");
    java.lang.String str15 = searchDTO0.getName();
    java.lang.String str16 = searchDTO0.getName();
    searchDTO0.setName("");
    searchDTO0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test328"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    ratingParameters0.setFairPlay((int)(byte)1);
    ratingParameters0.setAbility(0);
    ratingParameters0.setAbility((int)(byte)0);
    int i11 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay(52);
    ratingParameters0.setAbility((int)'4');
    int i16 = ratingParameters0.getFairPlay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 52);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test329"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    java.lang.String str3 = authDTO0.getPassword();
    authDTO0.setEmail("");
    authDTO0.setPassword("");
    java.lang.String str8 = authDTO0.getPassword();
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("");
    java.lang.String str13 = authDTO0.getEmail();
    authDTO0.setPassword("hi!");
    java.lang.String str16 = authDTO0.getPassword();
    authDTO0.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test330"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    java.lang.String str3 = loginDTO2.getToken();
    loginDTO2.setUserId((java.lang.Long)10L);
    java.lang.Long long6 = loginDTO2.getUserId();
    loginDTO2.setToken("hi!");
    loginDTO2.setUserId((java.lang.Long)1L);
    loginDTO2.setToken("hi!");
    java.lang.Long long13 = loginDTO2.getUserId();
    loginDTO2.setToken("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L+ "'", long6.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L+ "'", long13.equals(1L));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test331"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getAddress();
    java.lang.String str8 = registerUser0.getPhone();
    java.lang.String str9 = registerUser0.getPassword();
    registerUser0.setName("hi!");
    java.lang.String str12 = registerUser0.getPassword();
    java.lang.String str13 = registerUser0.getEmail();
    java.lang.String str14 = registerUser0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test332"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO2 = new br.edu.ufcg.es.model.DTO.AuthDTO("hi!", "");
    java.lang.String str3 = authDTO2.getEmail();
    authDTO2.setEmail("hi!");
    authDTO2.setPassword("hi!");
    authDTO2.setPassword("");
    authDTO2.setPassword("hi!");
    authDTO2.setPassword("hi!");
    authDTO2.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test333"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getAddress();
    registerUser0.setAddress("");
    registerUser0.setAddress("");
    java.lang.String str12 = registerUser0.getEmail();
    java.lang.String str13 = registerUser0.getAddress();
    java.lang.String str14 = registerUser0.getEmail();
    java.lang.String str15 = registerUser0.getPassword();
    registerUser0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test334"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    int i3 = ratingParameters0.getFairPlay();
    int i4 = ratingParameters0.getAbility();
    int i5 = ratingParameters0.getAbility();
    int i6 = ratingParameters0.getAbility();
    int i7 = ratingParameters0.getAbility();
    ratingParameters0.setAbility((int)(byte)-1);
    ratingParameters0.setAbility((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test335"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    java.lang.String str3 = registerUser0.getEmail();
    registerUser0.setEmail("");
    java.lang.String str6 = registerUser0.getEmail();
    registerUser0.setPassword("");
    java.lang.String str9 = registerUser0.getEmail();
    java.lang.String str10 = registerUser0.getPassword();
    registerUser0.setPassword("hi!");
    java.lang.String str13 = registerUser0.getPhone();
    java.lang.String str14 = registerUser0.getPhone();
    registerUser0.setPhone("hi!");
    registerUser0.setPassword("hi!");
    java.lang.String str19 = registerUser0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test336"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    java.lang.String str6 = registerUser0.getPassword();
    registerUser0.setPassword("");
    registerUser0.setPassword("");
    java.lang.String str11 = registerUser0.getAddress();
    java.lang.String str12 = registerUser0.getPassword();
    registerUser0.setEmail("hi!");
    registerUser0.setName("hi!");
    registerUser0.setEmail("hi!");
    java.lang.String str19 = registerUser0.getEmail();
    java.lang.String str20 = registerUser0.getEmail();
    registerUser0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test337"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    loginDTO2.setUserId((java.lang.Long)(-1L));
    java.lang.String str5 = loginDTO2.getToken();
    java.lang.String str6 = loginDTO2.getToken();
    loginDTO2.setToken("");
    java.lang.String str9 = loginDTO2.getToken();
    loginDTO2.setToken("hi!");
    loginDTO2.setUserId((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test338"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO2 = new br.edu.ufcg.es.model.DTO.AuthDTO("hi!", "");
    java.lang.String str3 = authDTO2.getPassword();
    authDTO2.setEmail("hi!");
    authDTO2.setEmail("");
    authDTO2.setPassword("");
    java.lang.String str10 = authDTO2.getEmail();
    authDTO2.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test339"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    java.lang.String str6 = registerUser0.getEmail();
    java.lang.String str7 = registerUser0.getName();
    registerUser0.setPhone("");
    registerUser0.setEmail("");
    registerUser0.setName("");
    java.lang.String str14 = registerUser0.getPassword();
    java.lang.String str15 = registerUser0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test340"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getDate();
    registerGame0.setDescription("");
    java.lang.String str6 = registerGame0.getSport();
    java.lang.String str7 = registerGame0.getSport();
    java.lang.String str8 = registerGame0.getName();
    registerGame0.setSport("");
    registerGame0.setDescription("hi!");
    registerGame0.setDescription("");
    registerGame0.setDescription("hi!");
    registerGame0.setDescription("hi!");
    registerGame0.setDate("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test341"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("hi!", (java.lang.Long)100L);
    loginDTO2.setUserId((java.lang.Long)(-1L));
    loginDTO2.setToken("hi!");
    java.lang.String str7 = loginDTO2.getToken();
    java.lang.String str8 = loginDTO2.getToken();
    loginDTO2.setToken("");
    java.lang.String str11 = loginDTO2.getToken();
    loginDTO2.setUserId((java.lang.Long)100L);
    loginDTO2.setUserId((java.lang.Long)0L);
    java.lang.Long long16 = loginDTO2.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L+ "'", long16.equals(0L));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test342"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setPhone("");
    registerUser0.setName("");
    registerUser0.setName("hi!");
    registerUser0.setEmail("");
    registerUser0.setAddress("");
    java.lang.String str16 = registerUser0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test343"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setPassword("hi!");
    java.lang.String str8 = registerUser0.getEmail();
    java.lang.String str9 = registerUser0.getPhone();
    registerUser0.setPhone("hi!");
    registerUser0.setPhone("hi!");
    registerUser0.setName("hi!");
    java.lang.String str16 = registerUser0.getEmail();
    registerUser0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test344"); }

    br.edu.ufcg.es.model.DTO.SearchDTO searchDTO1 = new br.edu.ufcg.es.model.DTO.SearchDTO("");
    searchDTO1.setName("hi!");
    searchDTO1.setName("");
    searchDTO1.setName("");
    searchDTO1.setName("");
    java.lang.String str10 = searchDTO1.getName();
    searchDTO1.setName("");
    searchDTO1.setName("");
    searchDTO1.setName("");
    searchDTO1.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test345"); }

    br.edu.ufcg.es.model.DTO.SearchDTO searchDTO1 = new br.edu.ufcg.es.model.DTO.SearchDTO("hi!");
    java.lang.String str2 = searchDTO1.getName();
    searchDTO1.setName("");
    java.lang.String str5 = searchDTO1.getName();
    java.lang.String str6 = searchDTO1.getName();
    searchDTO1.setName("");
    searchDTO1.setName("hi!");
    searchDTO1.setName("hi!");
    searchDTO1.setName("");
    searchDTO1.setName("hi!");
    java.lang.String str17 = searchDTO1.getName();
    searchDTO1.setName("hi!");
    searchDTO1.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test346"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    ratingParameters0.setAbility((int)(byte)-1);
    int i7 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay((int)'4');
    int i10 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay(0);
    int i13 = ratingParameters0.getFairPlay();
    int i14 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay((int)(byte)10);
    int i17 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test347"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    ratingParameters0.setAbility((int)(byte)-1);
    int i7 = ratingParameters0.getFairPlay();
    int i8 = ratingParameters0.getFairPlay();
    int i9 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay((int)'a');
    ratingParameters0.setFairPlay(0);
    ratingParameters0.setAbility((-1));
    int i16 = ratingParameters0.getAbility();
    int i17 = ratingParameters0.getAbility();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test348"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getName();
    registerGame0.setSport("");
    registerGame0.setDescription("hi!");
    registerGame0.setDate("");
    registerGame0.setDate("");
    java.lang.String str12 = registerGame0.getLocal();
    java.lang.String str13 = registerGame0.getDescription();
    java.lang.String str14 = registerGame0.getName();
    java.lang.String str15 = registerGame0.getSport();
    java.lang.String str16 = registerGame0.getDescription();
    java.lang.String str17 = registerGame0.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test349"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setAddress("");
    java.lang.String str5 = registerUser0.getAddress();
    registerUser0.setName("hi!");
    java.lang.String str8 = registerUser0.getName();
    java.lang.String str9 = registerUser0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test350"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getName();
    registerGame0.setLocal("");
    java.lang.String str5 = registerGame0.getDate();
    registerGame0.setName("hi!");
    registerGame0.setDescription("");
    java.lang.String str10 = registerGame0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test351"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getAddress();
    registerUser0.setAddress("");
    registerUser0.setAddress("");
    registerUser0.setPhone("");
    java.lang.String str14 = registerUser0.getPassword();
    java.lang.String str15 = registerUser0.getEmail();
    java.lang.String str16 = registerUser0.getPhone();
    registerUser0.setAddress("");
    java.lang.String str19 = registerUser0.getPassword();
    registerUser0.setPassword("hi!");
    java.lang.String str22 = registerUser0.getEmail();
    registerUser0.setPhone("hi!");
    java.lang.String str25 = registerUser0.getEmail();
    registerUser0.setName("hi!");
    java.lang.String str28 = registerUser0.getPassword();
    registerUser0.setPhone("hi!");
    registerUser0.setPhone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test352"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO0 = new br.edu.ufcg.es.model.DTO.LoginDTO();
    loginDTO0.setUserId((java.lang.Long)100L);
    loginDTO0.setToken("");
    java.lang.String str5 = loginDTO0.getToken();
    loginDTO0.setToken("");
    loginDTO0.setToken("");
    loginDTO0.setUserId((java.lang.Long)1L);
    java.lang.Long long12 = loginDTO0.getUserId();
    loginDTO0.setToken("");
    java.lang.String str15 = loginDTO0.getToken();
    loginDTO0.setToken("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L+ "'", long12.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test353"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getName();
    registerGame0.setLocal("");
    registerGame0.setName("");
    registerGame0.setLocal("");
    registerGame0.setDate("");
    registerGame0.setDate("hi!");
    registerGame0.setLocal("");
    registerGame0.setDate("");
    java.lang.String str17 = registerGame0.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test354"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    java.lang.String str6 = registerUser0.getPhone();
    java.lang.String str7 = registerUser0.getAddress();
    java.lang.String str8 = registerUser0.getEmail();
    java.lang.String str9 = registerUser0.getAddress();
    registerUser0.setName("hi!");
    java.lang.String str12 = registerUser0.getAddress();
    registerUser0.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test355"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPassword("hi!");
    registerUser0.setAddress("hi!");
    java.lang.String str9 = registerUser0.getPhone();
    java.lang.String str10 = registerUser0.getPassword();
    java.lang.String str11 = registerUser0.getEmail();
    registerUser0.setPhone("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test356"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getName();
    java.lang.String str4 = registerGame0.getDescription();
    java.lang.String str5 = registerGame0.getSport();
    registerGame0.setDate("hi!");
    registerGame0.setSport("");
    java.lang.String str10 = registerGame0.getSport();
    registerGame0.setSport("hi!");
    java.lang.String str13 = registerGame0.getName();
    java.lang.String str14 = registerGame0.getDescription();
    registerGame0.setLocal("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test357"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setEmail("");
    registerUser0.setName("hi!");
    java.lang.String str10 = registerUser0.getPhone();
    registerUser0.setPhone("");
    java.lang.String str13 = registerUser0.getPhone();
    registerUser0.setPassword("hi!");
    java.lang.String str16 = registerUser0.getEmail();
    registerUser0.setPassword("");
    java.lang.String str19 = registerUser0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test358"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getDate();
    registerGame0.setDate("");
    java.lang.String str6 = registerGame0.getLocal();
    registerGame0.setDate("hi!");
    registerGame0.setSport("hi!");
    registerGame0.setSport("");
    registerGame0.setDescription("hi!");
    java.lang.String str15 = registerGame0.getName();
    java.lang.String str16 = registerGame0.getLocal();
    java.lang.String str17 = registerGame0.getDescription();
    registerGame0.setSport("");
    java.lang.String str20 = registerGame0.getDescription();
    registerGame0.setLocal("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test359"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getDate();
    registerGame0.setDate("");
    java.lang.String str6 = registerGame0.getLocal();
    registerGame0.setDate("hi!");
    registerGame0.setSport("hi!");
    registerGame0.setSport("");
    java.lang.String str13 = registerGame0.getDate();
    registerGame0.setLocal("");
    java.lang.String str16 = registerGame0.getLocal();
    registerGame0.setSport("hi!");
    registerGame0.setName("");
    registerGame0.setLocal("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test360"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getDescription();
    registerGame0.setName("hi!");
    registerGame0.setDate("");
    java.lang.String str6 = registerGame0.getSport();
    registerGame0.setLocal("");
    registerGame0.setDescription("");
    registerGame0.setDescription("");
    java.lang.String str13 = registerGame0.getDescription();
    java.lang.String str14 = registerGame0.getDescription();
    registerGame0.setLocal("");
    java.lang.String str17 = registerGame0.getName();
    java.lang.String str18 = registerGame0.getDate();
    registerGame0.setName("");
    registerGame0.setDescription("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test361"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    ratingParameters0.setAbility(0);
    int i7 = ratingParameters0.getAbility();
    ratingParameters0.setAbility((int)(byte)10);
    int i10 = ratingParameters0.getFairPlay();
    ratingParameters0.setAbility((int)(byte)1);
    ratingParameters0.setFairPlay(100);
    ratingParameters0.setAbility(97);
    int i17 = ratingParameters0.getAbility();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 97);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test362"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setName("hi!");
    registerUser0.setPassword("");
    registerUser0.setAddress("");
    registerUser0.setEmail("hi!");
    registerUser0.setEmail("");
    java.lang.String str16 = registerUser0.getPassword();
    java.lang.String str17 = registerUser0.getAddress();
    java.lang.String str18 = registerUser0.getPhone();
    java.lang.String str19 = registerUser0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test363"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    java.lang.String str3 = registerUser0.getEmail();
    registerUser0.setPhone("");
    registerUser0.setAddress("");
    java.lang.String str8 = registerUser0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test364"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    java.lang.String str6 = registerUser0.getPassword();
    registerUser0.setPassword("");
    registerUser0.setPassword("hi!");
    java.lang.String str11 = registerUser0.getPhone();
    java.lang.String str12 = registerUser0.getPhone();
    java.lang.String str13 = registerUser0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test365"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDate("");
    registerGame0.setName("hi!");
    java.lang.String str7 = registerGame0.getName();
    java.lang.String str8 = registerGame0.getDate();
    registerGame0.setDescription("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test366"); }

    br.edu.ufcg.es.model.DTO.SearchDTO searchDTO1 = new br.edu.ufcg.es.model.DTO.SearchDTO("");
    java.lang.String str2 = searchDTO1.getName();
    java.lang.String str3 = searchDTO1.getName();
    searchDTO1.setName("hi!");
    searchDTO1.setName("");
    searchDTO1.setName("");
    searchDTO1.setName("hi!");
    searchDTO1.setName("hi!");
    searchDTO1.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test367"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setPhone("");
    registerUser0.setName("");
    registerUser0.setName("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    registerUser0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test368"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    registerGame0.setDate("");
    registerGame0.setDescription("hi!");
    registerGame0.setDescription("hi!");
    registerGame0.setDescription("");
    registerGame0.setName("");
    registerGame0.setDate("");
    java.lang.String str15 = registerGame0.getName();
    registerGame0.setSport("hi!");
    registerGame0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test369"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPhone();
    java.lang.String str5 = registerUser0.getAddress();
    registerUser0.setAddress("hi!");
    registerUser0.setPassword("");
    java.lang.String str10 = registerUser0.getName();
    java.lang.String str11 = registerUser0.getPassword();
    registerUser0.setAddress("");
    registerUser0.setName("");
    registerUser0.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test370"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    registerUser0.setPassword("");
    registerUser0.setName("");
    registerUser0.setPassword("hi!");
    java.lang.String str11 = registerUser0.getPassword();
    java.lang.String str12 = registerUser0.getPhone();
    java.lang.String str13 = registerUser0.getAddress();
    registerUser0.setPhone("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test371"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    registerGame0.setDate("");
    java.lang.String str7 = registerGame0.getSport();
    registerGame0.setDescription("hi!");
    java.lang.String str10 = registerGame0.getSport();
    registerGame0.setDescription("");
    java.lang.String str13 = registerGame0.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test372"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setPassword("hi!");
    registerUser0.setName("hi!");
    java.lang.String str10 = registerUser0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test373"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    loginDTO2.setUserId((java.lang.Long)(-1L));
    java.lang.Long long5 = loginDTO2.getUserId();
    loginDTO2.setToken("hi!");
    loginDTO2.setUserId((java.lang.Long)10L);
    loginDTO2.setUserId((java.lang.Long)(-1L));
    loginDTO2.setToken("hi!");
    loginDTO2.setToken("");
    loginDTO2.setUserId((java.lang.Long)(-1L));
    loginDTO2.setToken("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L)+ "'", long5.equals((-1L)));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test374"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)-1);
    ratingParameters0.setFairPlay((int)(byte)1);
    ratingParameters0.setFairPlay((int)' ');
    ratingParameters0.setFairPlay(35);
    int i9 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay((int)(byte)100);
    ratingParameters0.setFairPlay((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test375"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setEmail("");
    java.lang.String str8 = registerUser0.getName();
    java.lang.String str9 = registerUser0.getName();
    java.lang.String str10 = registerUser0.getEmail();
    registerUser0.setName("hi!");
    registerUser0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test376"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getName();
    java.lang.String str3 = registerGame0.getDescription();
    registerGame0.setDate("");
    java.lang.String str6 = registerGame0.getName();
    registerGame0.setSport("hi!");
    java.lang.String str9 = registerGame0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test377"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    java.lang.String str3 = registerGame0.getLocal();
    registerGame0.setDescription("");
    java.lang.String str6 = registerGame0.getName();
    java.lang.String str7 = registerGame0.getName();
    java.lang.String str8 = registerGame0.getDescription();
    java.lang.String str9 = registerGame0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test378"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    ratingParameters0.setFairPlay((int)(short)100);
    int i5 = ratingParameters0.getFairPlay();
    ratingParameters0.setAbility(10);
    ratingParameters0.setAbility((int)' ');
    ratingParameters0.setFairPlay(10);
    ratingParameters0.setFairPlay(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test379"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    java.lang.String str5 = registerGame0.getDescription();
    java.lang.String str6 = registerGame0.getDate();
    registerGame0.setLocal("hi!");
    registerGame0.setDescription("hi!");
    registerGame0.setName("");
    java.lang.String str13 = registerGame0.getDescription();
    java.lang.String str14 = registerGame0.getDescription();
    registerGame0.setDate("");
    registerGame0.setSport("");
    java.lang.String str19 = registerGame0.getLocal();
    java.lang.String str20 = registerGame0.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test380"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    ratingParameters0.setAbility((int)(byte)-1);
    int i7 = ratingParameters0.getFairPlay();
    int i8 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay((int)'4');
    ratingParameters0.setFairPlay((int)(byte)100);
    int i13 = ratingParameters0.getFairPlay();
    int i14 = ratingParameters0.getFairPlay();
    ratingParameters0.setAbility((int)(byte)-1);
    ratingParameters0.setAbility((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test381"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    java.lang.String str5 = registerGame0.getDescription();
    java.lang.String str6 = registerGame0.getDate();
    java.lang.String str7 = registerGame0.getDescription();
    java.lang.String str8 = registerGame0.getLocal();
    registerGame0.setLocal("");
    java.lang.String str11 = registerGame0.getDescription();
    registerGame0.setName("hi!");
    java.lang.String str14 = registerGame0.getLocal();
    java.lang.String str15 = registerGame0.getLocal();
    registerGame0.setSport("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test382"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPassword("hi!");
    registerUser0.setName("");
    java.lang.String str9 = registerUser0.getPhone();
    registerUser0.setName("hi!");
    registerUser0.setPhone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test383"); }

    br.edu.ufcg.es.model.DTO.SearchDTO searchDTO0 = new br.edu.ufcg.es.model.DTO.SearchDTO();
    java.lang.String str1 = searchDTO0.getName();
    java.lang.String str2 = searchDTO0.getName();
    java.lang.String str3 = searchDTO0.getName();
    java.lang.String str4 = searchDTO0.getName();
    searchDTO0.setName("hi!");
    java.lang.String str7 = searchDTO0.getName();
    java.lang.String str8 = searchDTO0.getName();
    java.lang.String str9 = searchDTO0.getName();
    java.lang.String str10 = searchDTO0.getName();
    java.lang.String str11 = searchDTO0.getName();
    searchDTO0.setName("hi!");
    searchDTO0.setName("hi!");
    searchDTO0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test384"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setPhone("");
    registerUser0.setEmail("hi!");
    registerUser0.setAddress("hi!");
    java.lang.String str12 = registerUser0.getPassword();
    registerUser0.setName("hi!");
    java.lang.String str15 = registerUser0.getPhone();
    java.lang.String str16 = registerUser0.getName();
    registerUser0.setPassword("hi!");
    java.lang.String str19 = registerUser0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test385"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getName();
    registerGame0.setLocal("");
    registerGame0.setName("");
    registerGame0.setLocal("");
    registerGame0.setDate("");
    registerGame0.setDate("");
    java.lang.String str13 = registerGame0.getName();
    java.lang.String str14 = registerGame0.getSport();
    java.lang.String str15 = registerGame0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test386"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getEmail();
    java.lang.String str5 = registerUser0.getName();
    registerUser0.setAddress("");
    java.lang.String str8 = registerUser0.getEmail();
    java.lang.String str9 = registerUser0.getEmail();
    java.lang.String str10 = registerUser0.getName();
    java.lang.String str11 = registerUser0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test387"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setName("hi!");
    java.lang.String str7 = registerUser0.getAddress();
    registerUser0.setPassword("hi!");
    registerUser0.setEmail("");
    java.lang.String str12 = registerUser0.getEmail();
    java.lang.String str13 = registerUser0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test388"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    java.lang.String str5 = registerGame0.getDescription();
    java.lang.String str6 = registerGame0.getDate();
    registerGame0.setLocal("hi!");
    registerGame0.setDate("hi!");
    java.lang.String str11 = registerGame0.getDescription();
    registerGame0.setName("hi!");
    registerGame0.setLocal("hi!");
    registerGame0.setSport("");
    registerGame0.setLocal("");
    java.lang.String str20 = registerGame0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test389"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    java.lang.String str3 = loginDTO2.getToken();
    loginDTO2.setUserId((java.lang.Long)10L);
    java.lang.Long long6 = loginDTO2.getUserId();
    loginDTO2.setUserId((java.lang.Long)100L);
    loginDTO2.setUserId((java.lang.Long)100L);
    java.lang.Long long11 = loginDTO2.getUserId();
    loginDTO2.setToken("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L+ "'", long6.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L+ "'", long11.equals(100L));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test390"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    registerUser0.setPassword("");
    registerUser0.setName("");
    java.lang.String str9 = registerUser0.getPhone();
    java.lang.String str10 = registerUser0.getAddress();
    java.lang.String str11 = registerUser0.getAddress();
    java.lang.String str12 = registerUser0.getName();
    registerUser0.setPhone("hi!");
    java.lang.String str15 = registerUser0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test391"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setPassword("");
    registerUser0.setPhone("hi!");
    registerUser0.setEmail("hi!");
    java.lang.String str12 = registerUser0.getEmail();
    java.lang.String str13 = registerUser0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test392"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    registerUser0.setPassword("");
    registerUser0.setName("");
    java.lang.String str9 = registerUser0.getPhone();
    registerUser0.setPassword("hi!");
    java.lang.String str12 = registerUser0.getName();
    registerUser0.setPassword("");
    java.lang.String str15 = registerUser0.getName();
    registerUser0.setPassword("");
    registerUser0.setAddress("");
    registerUser0.setName("");
    java.lang.String str22 = registerUser0.getAddress();
    registerUser0.setPassword("");
    java.lang.String str25 = registerUser0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test393"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    int i5 = ratingParameters0.getFairPlay();
    int i6 = ratingParameters0.getAbility();
    ratingParameters0.setAbility(35);
    int i9 = ratingParameters0.getFairPlay();
    int i10 = ratingParameters0.getFairPlay();
    ratingParameters0.setAbility((int)(short)0);
    int i13 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test394"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    java.lang.String str6 = registerUser0.getPhone();
    registerUser0.setEmail("");
    java.lang.String str9 = registerUser0.getName();
    java.lang.String str10 = registerUser0.getPhone();
    registerUser0.setAddress("");
    java.lang.String str13 = registerUser0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test395"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    java.lang.String str6 = registerUser0.getEmail();
    java.lang.String str7 = registerUser0.getName();
    java.lang.String str8 = registerUser0.getPhone();
    registerUser0.setAddress("");
    registerUser0.setAddress("hi!");
    registerUser0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test396"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("hi!", (java.lang.Long)100L);
    loginDTO2.setUserId((java.lang.Long)(-1L));
    loginDTO2.setToken("hi!");
    java.lang.String str7 = loginDTO2.getToken();
    java.lang.String str8 = loginDTO2.getToken();
    java.lang.Long long9 = loginDTO2.getUserId();
    loginDTO2.setUserId((java.lang.Long)100L);
    java.lang.Long long12 = loginDTO2.getUserId();
    java.lang.String str13 = loginDTO2.getToken();
    loginDTO2.setToken("hi!");
    java.lang.Long long16 = loginDTO2.getUserId();
    loginDTO2.setToken("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L)+ "'", long9.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L+ "'", long12.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L+ "'", long16.equals(100L));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test397"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("hi!", (java.lang.Long)100L);
    loginDTO2.setToken("");
    java.lang.String str5 = loginDTO2.getToken();
    loginDTO2.setToken("");
    loginDTO2.setToken("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test398"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setEmail("");
    registerUser0.setPassword("hi!");
    java.lang.String str10 = registerUser0.getAddress();
    java.lang.String str11 = registerUser0.getPassword();
    java.lang.String str12 = registerUser0.getPhone();
    java.lang.String str13 = registerUser0.getName();
    java.lang.String str14 = registerUser0.getEmail();
    registerUser0.setName("hi!");
    registerUser0.setName("hi!");
    java.lang.String str19 = registerUser0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test399"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO2 = new br.edu.ufcg.es.model.DTO.AuthDTO("hi!", "");
    authDTO2.setEmail("hi!");
    authDTO2.setPassword("hi!");
    authDTO2.setEmail("hi!");
    authDTO2.setEmail("hi!");
    java.lang.String str11 = authDTO2.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test400"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("");
    java.lang.String str5 = authDTO0.getPassword();
    authDTO0.setPassword("");
    java.lang.String str8 = authDTO0.getPassword();
    java.lang.String str9 = authDTO0.getEmail();
    java.lang.String str10 = authDTO0.getEmail();
    java.lang.String str11 = authDTO0.getEmail();
    authDTO0.setEmail("");
    java.lang.String str14 = authDTO0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test401"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    registerUser0.setPassword("");
    java.lang.String str8 = registerUser0.getName();
    registerUser0.setPassword("");
    registerUser0.setName("hi!");
    java.lang.String str13 = registerUser0.getPhone();
    registerUser0.setName("hi!");
    registerUser0.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test402"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    java.lang.String str6 = registerUser0.getPassword();
    registerUser0.setAddress("hi!");
    registerUser0.setPhone("");
    java.lang.String str11 = registerUser0.getPhone();
    java.lang.String str12 = registerUser0.getPhone();
    registerUser0.setPhone("");
    registerUser0.setEmail("");
    java.lang.String str17 = registerUser0.getEmail();
    registerUser0.setPhone("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test403"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getName();
    registerGame0.setDescription("hi!");
    java.lang.String str6 = registerGame0.getName();
    java.lang.String str7 = registerGame0.getDate();
    java.lang.String str8 = registerGame0.getDescription();
    java.lang.String str9 = registerGame0.getDescription();
    java.lang.String str10 = registerGame0.getLocal();
    java.lang.String str11 = registerGame0.getLocal();
    java.lang.String str12 = registerGame0.getDate();
    java.lang.String str13 = registerGame0.getSport();
    java.lang.String str14 = registerGame0.getName();
    java.lang.String str15 = registerGame0.getLocal();
    java.lang.String str16 = registerGame0.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test404"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    java.lang.String str5 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    java.lang.String str8 = authDTO0.getPassword();
    java.lang.String str9 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    java.lang.String str12 = authDTO0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test405"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    registerUser0.setPassword("");
    registerUser0.setPhone("hi!");
    registerUser0.setPhone("");
    java.lang.String str11 = registerUser0.getName();
    registerUser0.setName("hi!");
    registerUser0.setPassword("hi!");
    registerUser0.setName("hi!");
    registerUser0.setEmail("hi!");
    registerUser0.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test406"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    java.lang.String str6 = registerUser0.getEmail();
    registerUser0.setAddress("hi!");
    java.lang.String str9 = registerUser0.getPhone();
    java.lang.String str10 = registerUser0.getEmail();
    registerUser0.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test407"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setPhone("");
    registerUser0.setPhone("");
    java.lang.String str10 = registerUser0.getPhone();
    java.lang.String str11 = registerUser0.getPassword();
    java.lang.String str12 = registerUser0.getAddress();
    registerUser0.setPhone("hi!");
    java.lang.String str15 = registerUser0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test408"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setEmail("");
    java.lang.String str8 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setAddress("");
    registerUser0.setPhone("");
    java.lang.String str15 = registerUser0.getPassword();
    java.lang.String str16 = registerUser0.getPhone();
    java.lang.String str17 = registerUser0.getPhone();
    java.lang.String str18 = registerUser0.getEmail();
    java.lang.String str19 = registerUser0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test409"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    registerUser0.setPassword("");
    registerUser0.setName("");
    registerUser0.setPassword("hi!");
    java.lang.String str11 = registerUser0.getEmail();
    registerUser0.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test410"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("hi!");
    authDTO0.setEmail("hi!");
    authDTO0.setEmail("");
    java.lang.String str7 = authDTO0.getPassword();
    authDTO0.setPassword("");
    authDTO0.setPassword("");
    java.lang.String str12 = authDTO0.getEmail();
    java.lang.String str13 = authDTO0.getEmail();
    java.lang.String str14 = authDTO0.getPassword();
    java.lang.String str15 = authDTO0.getPassword();
    java.lang.String str16 = authDTO0.getEmail();
    authDTO0.setPassword("hi!");
    java.lang.String str19 = authDTO0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test411"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    java.lang.String str3 = registerGame0.getDescription();
    registerGame0.setDate("hi!");
    java.lang.String str6 = registerGame0.getDate();
    registerGame0.setSport("");
    java.lang.String str9 = registerGame0.getLocal();
    java.lang.String str10 = registerGame0.getLocal();
    java.lang.String str11 = registerGame0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test412"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO2 = new br.edu.ufcg.es.model.DTO.AuthDTO("hi!", "");
    authDTO2.setEmail("hi!");
    java.lang.String str5 = authDTO2.getPassword();
    java.lang.String str6 = authDTO2.getPassword();
    authDTO2.setEmail("");
    java.lang.String str9 = authDTO2.getPassword();
    authDTO2.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test413"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    java.lang.String str6 = registerUser0.getEmail();
    java.lang.String str7 = registerUser0.getEmail();
    registerUser0.setPhone("");
    java.lang.String str10 = registerUser0.getName();
    registerUser0.setPassword("hi!");
    registerUser0.setName("");
    java.lang.String str15 = registerUser0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test414"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    java.lang.String str5 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    authDTO0.setEmail("");
    authDTO0.setEmail("");
    java.lang.String str12 = authDTO0.getPassword();
    java.lang.String str13 = authDTO0.getEmail();
    java.lang.String str14 = authDTO0.getPassword();
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("");
    authDTO0.setEmail("hi!");
    java.lang.String str21 = authDTO0.getPassword();
    java.lang.String str22 = authDTO0.getPassword();
    authDTO0.setPassword("");
    java.lang.String str25 = authDTO0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test415"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setAddress("hi!");
    java.lang.String str8 = registerUser0.getEmail();
    java.lang.String str9 = registerUser0.getAddress();
    registerUser0.setEmail("hi!");
    registerUser0.setPhone("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test416"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    java.lang.String str5 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    authDTO0.setEmail("");
    authDTO0.setEmail("");
    java.lang.String str12 = authDTO0.getPassword();
    java.lang.String str13 = authDTO0.getEmail();
    authDTO0.setEmail("");
    java.lang.String str16 = authDTO0.getPassword();
    java.lang.String str17 = authDTO0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test417"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("hi!");
    authDTO0.setEmail("hi!");
    authDTO0.setEmail("");
    java.lang.String str7 = authDTO0.getPassword();
    java.lang.String str8 = authDTO0.getPassword();
    java.lang.String str9 = authDTO0.getPassword();
    authDTO0.setPassword("");
    authDTO0.setPassword("hi!");
    authDTO0.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test418"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    java.lang.String str3 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    java.lang.String str6 = authDTO0.getEmail();
    java.lang.String str7 = authDTO0.getPassword();
    authDTO0.setEmail("");
    java.lang.String str10 = authDTO0.getEmail();
    java.lang.String str11 = authDTO0.getPassword();
    java.lang.String str12 = authDTO0.getPassword();
    java.lang.String str13 = authDTO0.getPassword();
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("hi!");
    authDTO0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test419"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getDescription();
    registerGame0.setName("hi!");
    registerGame0.setDate("");
    registerGame0.setDate("hi!");
    java.lang.String str8 = registerGame0.getName();
    registerGame0.setSport("hi!");
    java.lang.String str11 = registerGame0.getDate();
    registerGame0.setSport("");
    java.lang.String str14 = registerGame0.getLocal();
    java.lang.String str15 = registerGame0.getSport();
    java.lang.String str16 = registerGame0.getDescription();
    registerGame0.setLocal("hi!");
    registerGame0.setDescription("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test420"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getDescription();
    registerGame0.setLocal("");
    registerGame0.setName("hi!");
    java.lang.String str8 = registerGame0.getDate();
    registerGame0.setLocal("hi!");
    registerGame0.setDescription("hi!");
    registerGame0.setDate("hi!");
    java.lang.String str15 = registerGame0.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test421"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    ratingParameters0.setFairPlay((int)(short)100);
    int i5 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay((int)'a');
    int i8 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay((int)'#');
    int i11 = ratingParameters0.getFairPlay();
    int i12 = ratingParameters0.getAbility();
    int i13 = ratingParameters0.getAbility();
    int i14 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay((int)(byte)-1);
    ratingParameters0.setFairPlay(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 35);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test422"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getDate();
    java.lang.String str2 = registerGame0.getName();
    java.lang.String str3 = registerGame0.getSport();
    java.lang.String str4 = registerGame0.getSport();
    java.lang.String str5 = registerGame0.getDate();
    java.lang.String str6 = registerGame0.getDate();
    registerGame0.setDate("hi!");
    java.lang.String str9 = registerGame0.getLocal();
    java.lang.String str10 = registerGame0.getDescription();
    java.lang.String str11 = registerGame0.getSport();
    java.lang.String str12 = registerGame0.getLocal();
    java.lang.String str13 = registerGame0.getName();
    java.lang.String str14 = registerGame0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test423"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    ratingParameters0.setAbility(0);
    ratingParameters0.setFairPlay(0);
    ratingParameters0.setFairPlay((int)(byte)-1);
    int i11 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay((int)(byte)1);
    ratingParameters0.setFairPlay((-1));
    int i16 = ratingParameters0.getAbility();
    int i17 = ratingParameters0.getFairPlay();
    ratingParameters0.setFairPlay(1);
    ratingParameters0.setAbility((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test424"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getName();
    registerGame0.setSport("");
    registerGame0.setDescription("hi!");
    registerGame0.setDate("");
    registerGame0.setDate("");
    java.lang.String str12 = registerGame0.getLocal();
    java.lang.String str13 = registerGame0.getDescription();
    registerGame0.setSport("");
    java.lang.String str16 = registerGame0.getDate();
    registerGame0.setDescription("");
    registerGame0.setDescription("hi!");
    registerGame0.setDescription("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test425"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    java.lang.String str5 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    java.lang.String str8 = authDTO0.getPassword();
    java.lang.String str9 = authDTO0.getPassword();
    java.lang.String str10 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test426"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setAddress("hi!");
    registerUser0.setPassword("");
    java.lang.String str10 = registerUser0.getEmail();
    java.lang.String str11 = registerUser0.getEmail();
    registerUser0.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test427"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    ratingParameters0.setAbility(0);
    int i7 = ratingParameters0.getAbility();
    int i8 = ratingParameters0.getAbility();
    int i9 = ratingParameters0.getAbility();
    int i10 = ratingParameters0.getAbility();
    ratingParameters0.setAbility(32);
    int i13 = ratingParameters0.getFairPlay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test428"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    int i5 = ratingParameters0.getFairPlay();
    int i6 = ratingParameters0.getAbility();
    ratingParameters0.setAbility(35);
    int i9 = ratingParameters0.getFairPlay();
    int i10 = ratingParameters0.getAbility();
    ratingParameters0.setAbility((int)(byte)10);
    ratingParameters0.setFairPlay((int)(short)-1);
    ratingParameters0.setAbility(1);
    ratingParameters0.setAbility(97);
    int i19 = ratingParameters0.getAbility();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 97);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test429"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    java.lang.String str6 = registerUser0.getEmail();
    registerUser0.setEmail("hi!");
    registerUser0.setPassword("");
    java.lang.String str11 = registerUser0.getAddress();
    java.lang.String str12 = registerUser0.getName();
    registerUser0.setPhone("hi!");
    java.lang.String str15 = registerUser0.getPassword();
    registerUser0.setPhone("");
    registerUser0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test430"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getDate();
    java.lang.String str3 = registerGame0.getDate();
    java.lang.String str4 = registerGame0.getDate();
    registerGame0.setDescription("hi!");
    java.lang.String str7 = registerGame0.getName();
    java.lang.String str8 = registerGame0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test431"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPhone();
    java.lang.String str5 = registerUser0.getAddress();
    registerUser0.setPhone("");
    registerUser0.setName("");
    registerUser0.setEmail("hi!");
    registerUser0.setPhone("");
    java.lang.String str14 = registerUser0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test432"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    java.lang.String str6 = registerUser0.getPhone();
    java.lang.String str7 = registerUser0.getPassword();
    java.lang.String str8 = registerUser0.getPassword();
    java.lang.String str9 = registerUser0.getEmail();
    registerUser0.setAddress("");
    registerUser0.setPhone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test433"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO0 = new br.edu.ufcg.es.model.DTO.LoginDTO();
    java.lang.Long long1 = loginDTO0.getUserId();
    loginDTO0.setUserId((java.lang.Long)(-1L));
    loginDTO0.setUserId((java.lang.Long)100L);
    java.lang.String str6 = loginDTO0.getToken();
    loginDTO0.setUserId((java.lang.Long)0L);
    java.lang.String str9 = loginDTO0.getToken();
    loginDTO0.setToken("hi!");
    loginDTO0.setToken("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test434"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    registerUser0.setPassword("");
    registerUser0.setName("");
    java.lang.String str9 = registerUser0.getPhone();
    java.lang.String str10 = registerUser0.getAddress();
    java.lang.String str11 = registerUser0.getAddress();
    java.lang.String str12 = registerUser0.getPassword();
    java.lang.String str13 = registerUser0.getEmail();
    registerUser0.setName("hi!");
    registerUser0.setEmail("hi!");
    java.lang.String str18 = registerUser0.getAddress();
    java.lang.String str19 = registerUser0.getPassword();
    registerUser0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test435"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("hi!", (java.lang.Long)0L);
    java.lang.Long long3 = loginDTO2.getUserId();
    java.lang.Long long4 = loginDTO2.getUserId();
    loginDTO2.setToken("");
    loginDTO2.setUserId((java.lang.Long)1L);
    java.lang.Long long9 = loginDTO2.getUserId();
    loginDTO2.setToken("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L+ "'", long3.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L+ "'", long4.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L+ "'", long9.equals(1L));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test436"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setPassword("");
    registerUser0.setName("");
    java.lang.String str10 = registerUser0.getEmail();
    registerUser0.setPhone("");
    java.lang.String str13 = registerUser0.getPhone();
    registerUser0.setEmail("");
    java.lang.String str16 = registerUser0.getPhone();
    java.lang.String str17 = registerUser0.getPassword();
    java.lang.String str18 = registerUser0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test437"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getName();
    java.lang.String str4 = registerGame0.getDescription();
    java.lang.String str5 = registerGame0.getSport();
    registerGame0.setDate("hi!");
    registerGame0.setSport("");
    java.lang.String str10 = registerGame0.getDate();
    java.lang.String str11 = registerGame0.getLocal();
    registerGame0.setName("hi!");
    java.lang.String str14 = registerGame0.getDescription();
    java.lang.String str15 = registerGame0.getSport();
    java.lang.String str16 = registerGame0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test438"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    java.lang.String str3 = registerUser0.getEmail();
    registerUser0.setEmail("");
    java.lang.String str6 = registerUser0.getEmail();
    java.lang.String str7 = registerUser0.getEmail();
    registerUser0.setEmail("");
    registerUser0.setName("hi!");
    java.lang.String str12 = registerUser0.getPassword();
    java.lang.String str13 = registerUser0.getPassword();
    java.lang.String str14 = registerUser0.getPassword();
    java.lang.String str15 = registerUser0.getPassword();
    java.lang.String str16 = registerUser0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test439"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    java.lang.String str3 = registerGame0.getSport();
    java.lang.String str4 = registerGame0.getLocal();
    registerGame0.setLocal("");
    registerGame0.setLocal("");
    registerGame0.setDate("hi!");
    java.lang.String str11 = registerGame0.getDate();
    registerGame0.setDate("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test440"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO0 = new br.edu.ufcg.es.model.DTO.LoginDTO();
    java.lang.Long long1 = loginDTO0.getUserId();
    loginDTO0.setUserId((java.lang.Long)(-1L));
    loginDTO0.setUserId((java.lang.Long)100L);
    java.lang.String str6 = loginDTO0.getToken();
    loginDTO0.setUserId((java.lang.Long)0L);
    java.lang.String str9 = loginDTO0.getToken();
    java.lang.String str10 = loginDTO0.getToken();
    java.lang.String str11 = loginDTO0.getToken();
    loginDTO0.setToken("");
    loginDTO0.setToken("");
    java.lang.Long long16 = loginDTO0.getUserId();
    java.lang.String str17 = loginDTO0.getToken();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L+ "'", long16.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test441"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    java.lang.String str3 = registerGame0.getDescription();
    registerGame0.setDate("hi!");
    registerGame0.setName("hi!");
    registerGame0.setLocal("hi!");
    registerGame0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test442"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("");
    java.lang.String str5 = authDTO0.getPassword();
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("hi!");
    java.lang.String str10 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    authDTO0.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test443"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    java.lang.String str6 = registerUser0.getPhone();
    java.lang.String str7 = registerUser0.getPassword();
    registerUser0.setPassword("hi!");
    java.lang.String str10 = registerUser0.getPassword();
    registerUser0.setPassword("");
    registerUser0.setEmail("hi!");
    registerUser0.setAddress("");
    java.lang.String str17 = registerUser0.getEmail();
    registerUser0.setAddress("");
    java.lang.String str20 = registerUser0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test444"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    java.lang.String str3 = registerGame0.getDate();
    java.lang.String str4 = registerGame0.getName();
    registerGame0.setDate("hi!");
    registerGame0.setSport("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test445"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("");
    java.lang.String str5 = authDTO0.getPassword();
    java.lang.String str6 = authDTO0.getPassword();
    java.lang.String str7 = authDTO0.getPassword();
    java.lang.String str8 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    authDTO0.setPassword("");
    java.lang.String str13 = authDTO0.getEmail();
    java.lang.String str14 = authDTO0.getPassword();
    authDTO0.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test446"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getAddress();
    registerUser0.setAddress("");
    registerUser0.setAddress("");
    java.lang.String str12 = registerUser0.getPhone();
    registerUser0.setPassword("");
    java.lang.String str15 = registerUser0.getPhone();
    registerUser0.setEmail("");
    java.lang.String str18 = registerUser0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test447"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getAddress();
    registerUser0.setAddress("");
    registerUser0.setEmail("hi!");
    java.lang.String str12 = registerUser0.getEmail();
    java.lang.String str13 = registerUser0.getAddress();
    registerUser0.setEmail("");
    java.lang.String str16 = registerUser0.getPassword();
    java.lang.String str17 = registerUser0.getEmail();
    registerUser0.setPassword("hi!");
    registerUser0.setName("");
    registerUser0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test448"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    java.lang.String str6 = registerUser0.getName();
    java.lang.String str7 = registerUser0.getPassword();
    java.lang.String str8 = registerUser0.getAddress();
    java.lang.String str9 = registerUser0.getAddress();
    java.lang.String str10 = registerUser0.getEmail();
    java.lang.String str11 = registerUser0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test449"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getAddress();
    registerUser0.setAddress("");
    registerUser0.setAddress("");
    registerUser0.setEmail("hi!");
    java.lang.String str14 = registerUser0.getEmail();
    java.lang.String str15 = registerUser0.getPhone();
    java.lang.String str16 = registerUser0.getName();
    java.lang.String str17 = registerUser0.getAddress();
    java.lang.String str18 = registerUser0.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test450"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    registerUser0.setPassword("");
    java.lang.String str7 = registerUser0.getEmail();
    java.lang.String str8 = registerUser0.getPhone();
    java.lang.String str9 = registerUser0.getAddress();
    registerUser0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test451"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setEmail("");
    java.lang.String str8 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setAddress("");
    registerUser0.setPhone("hi!");
    java.lang.String str15 = registerUser0.getEmail();
    registerUser0.setPassword("hi!");
    java.lang.String str18 = registerUser0.getAddress();
    java.lang.String str19 = registerUser0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test452"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    ratingParameters0.setAbility((int)(short)10);
    int i5 = ratingParameters0.getFairPlay();
    int i6 = ratingParameters0.getAbility();
    int i7 = ratingParameters0.getAbility();
    int i8 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay((int)(short)1);
    int i11 = ratingParameters0.getFairPlay();
    int i12 = ratingParameters0.getAbility();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test453"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    loginDTO2.setUserId((java.lang.Long)(-1L));
    java.lang.Long long5 = loginDTO2.getUserId();
    loginDTO2.setToken("hi!");
    loginDTO2.setUserId((java.lang.Long)10L);
    loginDTO2.setUserId((java.lang.Long)(-1L));
    loginDTO2.setToken("");
    loginDTO2.setUserId((java.lang.Long)10L);
    java.lang.Long long16 = loginDTO2.getUserId();
    java.lang.String str17 = loginDTO2.getToken();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L)+ "'", long5.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L+ "'", long16.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test454"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    java.lang.String str6 = registerUser0.getEmail();
    registerUser0.setEmail("hi!");
    registerUser0.setPhone("hi!");
    java.lang.String str11 = registerUser0.getName();
    java.lang.String str12 = registerUser0.getPassword();
    java.lang.String str13 = registerUser0.getEmail();
    registerUser0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test455"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getName();
    java.lang.String str4 = registerGame0.getDescription();
    java.lang.String str5 = registerGame0.getSport();
    registerGame0.setDate("hi!");
    registerGame0.setSport("");
    java.lang.String str10 = registerGame0.getDate();
    java.lang.String str11 = registerGame0.getLocal();
    registerGame0.setLocal("");
    registerGame0.setDate("");
    registerGame0.setName("");
    registerGame0.setDescription("hi!");
    java.lang.String str20 = registerGame0.getDate();
    java.lang.String str21 = registerGame0.getLocal();
    registerGame0.setDescription("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test456"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setEmail("");
    registerUser0.setPhone("");
    java.lang.String str10 = registerUser0.getPassword();
    registerUser0.setPhone("");
    java.lang.String str13 = registerUser0.getAddress();
    java.lang.String str14 = registerUser0.getAddress();
    registerUser0.setPassword("hi!");
    java.lang.String str17 = registerUser0.getName();
    registerUser0.setName("");
    java.lang.String str20 = registerUser0.getPassword();
    java.lang.String str21 = registerUser0.getPassword();
    registerUser0.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test457"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    registerUser0.setEmail("hi!");
    registerUser0.setEmail("");
    registerUser0.setPassword("hi!");
    java.lang.String str10 = registerUser0.getAddress();
    java.lang.String str11 = registerUser0.getPassword();
    java.lang.String str12 = registerUser0.getPhone();
    java.lang.String str13 = registerUser0.getName();
    java.lang.String str14 = registerUser0.getEmail();
    registerUser0.setName("hi!");
    java.lang.String str17 = registerUser0.getPassword();
    java.lang.String str18 = registerUser0.getAddress();
    registerUser0.setName("hi!");
    registerUser0.setPhone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test458"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    registerUser0.setPassword("");
    registerUser0.setName("");
    java.lang.String str9 = registerUser0.getPhone();
    registerUser0.setPassword("hi!");
    registerUser0.setAddress("");
    java.lang.String str14 = registerUser0.getName();
    java.lang.String str15 = registerUser0.getEmail();
    registerUser0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test459"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getAddress();
    registerUser0.setAddress("");
    registerUser0.setAddress("");
    registerUser0.setPassword("");
    java.lang.String str14 = registerUser0.getPhone();
    registerUser0.setPhone("");
    java.lang.String str17 = registerUser0.getPhone();
    registerUser0.setName("");
    registerUser0.setPhone("");
    java.lang.String str22 = registerUser0.getName();
    java.lang.String str23 = registerUser0.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test460"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getAddress();
    registerUser0.setAddress("");
    registerUser0.setAddress("");
    java.lang.String str12 = registerUser0.getPhone();
    registerUser0.setPhone("hi!");
    registerUser0.setAddress("");
    registerUser0.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test461"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO2 = new br.edu.ufcg.es.model.DTO.AuthDTO("", "hi!");
    authDTO2.setEmail("");
    authDTO2.setEmail("hi!");
    authDTO2.setEmail("");
    authDTO2.setEmail("");
    java.lang.String str11 = authDTO2.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test462"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility(100);
    ratingParameters0.setFairPlay((int)(short)100);
    int i5 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay((int)'a');
    int i8 = ratingParameters0.getFairPlay();
    int i9 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay(0);
    int i12 = ratingParameters0.getFairPlay();
    int i13 = ratingParameters0.getFairPlay();
    ratingParameters0.setAbility((int)(byte)100);
    ratingParameters0.setFairPlay(97);
    ratingParameters0.setAbility(35);
    int i20 = ratingParameters0.getAbility();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 35);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test463"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)0L);
    loginDTO2.setToken("hi!");
    loginDTO2.setToken("");
    java.lang.String str7 = loginDTO2.getToken();
    loginDTO2.setUserId((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test464"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    ratingParameters0.setAbility(0);
    int i7 = ratingParameters0.getFairPlay();
    int i8 = ratingParameters0.getAbility();
    ratingParameters0.setAbility((int)(byte)-1);
    int i11 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay((int)(short)-1);
    ratingParameters0.setAbility((int)(byte)10);
    ratingParameters0.setAbility(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test465"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getName();
    java.lang.String str4 = registerGame0.getDescription();
    java.lang.String str5 = registerGame0.getSport();
    registerGame0.setDate("hi!");
    registerGame0.setSport("");
    java.lang.String str10 = registerGame0.getDate();
    registerGame0.setLocal("hi!");
    java.lang.String str13 = registerGame0.getSport();
    java.lang.String str14 = registerGame0.getName();
    registerGame0.setLocal("");
    java.lang.String str17 = registerGame0.getSport();
    java.lang.String str18 = registerGame0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test466"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getName();
    registerGame0.setSport("");
    registerGame0.setName("");
    registerGame0.setName("");
    registerGame0.setDescription("");
    registerGame0.setSport("");
    java.lang.String str14 = registerGame0.getSport();
    registerGame0.setDescription("hi!");
    registerGame0.setSport("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test467"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    ratingParameters0.setFairPlay((int)(byte)1);
    ratingParameters0.setFairPlay((int)(short)10);
    ratingParameters0.setAbility((int)(byte)-1);
    ratingParameters0.setFairPlay((int)(byte)1);
    int i13 = ratingParameters0.getFairPlay();
    int i14 = ratingParameters0.getAbility();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test468"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getName();
    registerGame0.setLocal("");
    registerGame0.setName("");
    java.lang.String str7 = registerGame0.getDate();
    java.lang.String str8 = registerGame0.getDescription();
    java.lang.String str9 = registerGame0.getName();
    java.lang.String str10 = registerGame0.getSport();
    registerGame0.setDate("");
    java.lang.String str13 = registerGame0.getLocal();
    java.lang.String str14 = registerGame0.getDate();
    registerGame0.setSport("");
    registerGame0.setLocal("hi!");
    registerGame0.setSport("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test469"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("hi!");
    java.lang.String str5 = authDTO0.getPassword();
    authDTO0.setPassword("");
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("hi!");
    authDTO0.setEmail("");
    authDTO0.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test470"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDate("");
    java.lang.String str5 = registerGame0.getSport();
    java.lang.String str6 = registerGame0.getDescription();
    java.lang.String str7 = registerGame0.getName();
    registerGame0.setSport("");
    java.lang.String str10 = registerGame0.getDate();
    java.lang.String str11 = registerGame0.getSport();
    java.lang.String str12 = registerGame0.getSport();
    java.lang.String str13 = registerGame0.getDescription();
    registerGame0.setDescription("");
    java.lang.String str16 = registerGame0.getDate();
    registerGame0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test471"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getLocal();
    registerGame0.setDescription("hi!");
    java.lang.String str6 = registerGame0.getSport();
    registerGame0.setName("hi!");
    java.lang.String str9 = registerGame0.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test472"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    java.lang.String str3 = loginDTO2.getToken();
    loginDTO2.setUserId((java.lang.Long)10L);
    java.lang.Long long6 = loginDTO2.getUserId();
    java.lang.String str7 = loginDTO2.getToken();
    loginDTO2.setToken("");
    java.lang.String str10 = loginDTO2.getToken();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L+ "'", long6.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test473"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getName();
    registerUser0.setEmail("hi!");
    java.lang.String str10 = registerUser0.getPhone();
    java.lang.String str11 = registerUser0.getName();
    java.lang.String str12 = registerUser0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test474"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getDescription();
    java.lang.String str4 = registerGame0.getSport();
    java.lang.String str5 = registerGame0.getName();
    registerGame0.setSport("hi!");
    java.lang.String str8 = registerGame0.getName();
    java.lang.String str9 = registerGame0.getName();
    java.lang.String str10 = registerGame0.getDescription();
    registerGame0.setLocal("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test475"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setEmail("");
    java.lang.String str3 = registerUser0.getAddress();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPhone();
    registerUser0.setPhone("");
    java.lang.String str8 = registerUser0.getEmail();
    java.lang.String str9 = registerUser0.getPhone();
    registerUser0.setPhone("hi!");
    java.lang.String str12 = registerUser0.getEmail();
    registerUser0.setPhone("");
    registerUser0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test476"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    registerUser0.setPhone("hi!");
    java.lang.String str7 = registerUser0.getAddress();
    registerUser0.setAddress("");
    registerUser0.setAddress("");
    registerUser0.setPassword("");
    java.lang.String str14 = registerUser0.getPassword();
    registerUser0.setEmail("");
    registerUser0.setName("hi!");
    registerUser0.setAddress("hi!");
    registerUser0.setPhone("");
    java.lang.String str23 = registerUser0.getPassword();
    java.lang.String str24 = registerUser0.getAddress();
    registerUser0.setPassword("");
    registerUser0.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test477"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO0 = new br.edu.ufcg.es.model.DTO.LoginDTO();
    java.lang.Long long1 = loginDTO0.getUserId();
    java.lang.Long long2 = loginDTO0.getUserId();
    loginDTO0.setToken("");
    loginDTO0.setUserId((java.lang.Long)1L);
    java.lang.Long long7 = loginDTO0.getUserId();
    loginDTO0.setToken("");
    java.lang.Long long10 = loginDTO0.getUserId();
    java.lang.Long long11 = loginDTO0.getUserId();
    java.lang.Long long12 = loginDTO0.getUserId();
    loginDTO0.setUserId((java.lang.Long)0L);
    loginDTO0.setUserId((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L+ "'", long7.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L+ "'", long10.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L+ "'", long11.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L+ "'", long12.equals(1L));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test478"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    loginDTO2.setUserId((java.lang.Long)(-1L));
    java.lang.Long long5 = loginDTO2.getUserId();
    loginDTO2.setToken("hi!");
    java.lang.String str8 = loginDTO2.getToken();
    loginDTO2.setUserId((java.lang.Long)100L);
    loginDTO2.setUserId((java.lang.Long)10L);
    java.lang.Long long13 = loginDTO2.getUserId();
    loginDTO2.setToken("hi!");
    java.lang.Long long16 = loginDTO2.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L)+ "'", long5.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L+ "'", long13.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L+ "'", long16.equals(10L));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test479"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    java.lang.String str3 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("");
    authDTO0.setPassword("");
    java.lang.String str12 = authDTO0.getPassword();
    java.lang.String str13 = authDTO0.getEmail();
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("hi!");
    java.lang.String str18 = authDTO0.getPassword();
    java.lang.String str19 = authDTO0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test480"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("");
    authDTO0.setEmail("hi!");
    authDTO0.setPassword("");
    java.lang.String str9 = authDTO0.getPassword();
    java.lang.String str10 = authDTO0.getPassword();
    java.lang.String str11 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    authDTO0.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test481"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getDate();
    java.lang.String str2 = registerGame0.getName();
    registerGame0.setLocal("");
    java.lang.String str5 = registerGame0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test482"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getDate();
    registerGame0.setDescription("");
    java.lang.String str6 = registerGame0.getSport();
    java.lang.String str7 = registerGame0.getSport();
    registerGame0.setName("hi!");
    registerGame0.setDescription("");
    java.lang.String str12 = registerGame0.getLocal();
    java.lang.String str13 = registerGame0.getSport();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test483"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDate("");
    java.lang.String str5 = registerGame0.getSport();
    java.lang.String str6 = registerGame0.getDescription();
    java.lang.String str7 = registerGame0.getName();
    registerGame0.setSport("");
    java.lang.String str10 = registerGame0.getName();
    java.lang.String str11 = registerGame0.getSport();
    java.lang.String str12 = registerGame0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test484"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(byte)1);
    ratingParameters0.setAbility((int)(byte)1);
    ratingParameters0.setAbility((int)(short)100);
    int i7 = ratingParameters0.getAbility();
    int i8 = ratingParameters0.getFairPlay();
    ratingParameters0.setAbility((int)(short)10);
    int i11 = ratingParameters0.getAbility();
    ratingParameters0.setAbility(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test485"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    java.lang.String str3 = registerUser0.getPhone();
    java.lang.String str4 = registerUser0.getPassword();
    java.lang.String str5 = registerUser0.getPassword();
    java.lang.String str6 = registerUser0.getEmail();
    registerUser0.setAddress("");
    registerUser0.setPhone("");
    java.lang.String str11 = registerUser0.getPhone();
    java.lang.String str12 = registerUser0.getPassword();
    registerUser0.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test486"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setAddress("hi!");
    registerUser0.setEmail("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setName("hi!");
    registerUser0.setPassword("");
    registerUser0.setAddress("");
    registerUser0.setEmail("hi!");
    java.lang.String str14 = registerUser0.getPassword();
    registerUser0.setName("");
    java.lang.String str17 = registerUser0.getEmail();
    registerUser0.setName("hi!");
    java.lang.String str20 = registerUser0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test487"); }

    br.edu.ufcg.es.model.DTO.RegisterUser registerUser0 = new br.edu.ufcg.es.model.DTO.RegisterUser();
    registerUser0.setPhone("");
    registerUser0.setPassword("");
    java.lang.String str5 = registerUser0.getEmail();
    registerUser0.setPassword("");
    registerUser0.setEmail("");
    registerUser0.setName("");
    java.lang.String str12 = registerUser0.getAddress();
    registerUser0.setPhone("");
    registerUser0.setAddress("");
    registerUser0.setEmail("hi!");
    java.lang.String str19 = registerUser0.getEmail();
    java.lang.String str20 = registerUser0.getPhone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test488"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getName();
    registerGame0.setLocal("");
    registerGame0.setName("");
    java.lang.String str7 = registerGame0.getDate();
    java.lang.String str8 = registerGame0.getDescription();
    java.lang.String str9 = registerGame0.getName();
    java.lang.String str10 = registerGame0.getSport();
    registerGame0.setDate("");
    registerGame0.setSport("hi!");
    registerGame0.setSport("hi!");
    java.lang.String str17 = registerGame0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test489"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    java.lang.String str2 = registerGame0.getName();
    java.lang.String str3 = registerGame0.getDescription();
    java.lang.String str4 = registerGame0.getDescription();
    java.lang.String str5 = registerGame0.getDescription();
    registerGame0.setSport("");
    java.lang.String str8 = registerGame0.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test490"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    java.lang.String str3 = authDTO0.getPassword();
    authDTO0.setPassword("hi!");
    java.lang.String str6 = authDTO0.getEmail();
    java.lang.String str7 = authDTO0.getPassword();
    java.lang.String str8 = authDTO0.getEmail();
    java.lang.String str9 = authDTO0.getPassword();
    authDTO0.setEmail("hi!");
    java.lang.String str12 = authDTO0.getPassword();
    java.lang.String str13 = authDTO0.getEmail();
    authDTO0.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test491"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setFairPlay((int)'#');
    int i5 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay(1);
    int i8 = ratingParameters0.getAbility();
    int i9 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay((-1));
    ratingParameters0.setAbility(0);
    ratingParameters0.setAbility((int)(short)10);
    ratingParameters0.setAbility(32);
    int i18 = ratingParameters0.getAbility();
    ratingParameters0.setFairPlay((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 32);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test492"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    registerGame0.setDate("hi!");
    java.lang.String str7 = registerGame0.getDate();
    registerGame0.setDate("hi!");
    java.lang.String str10 = registerGame0.getLocal();
    java.lang.String str11 = registerGame0.getDescription();
    registerGame0.setDate("hi!");
    registerGame0.setSport("hi!");
    registerGame0.setLocal("");
    registerGame0.setDate("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test493"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("hi!", (java.lang.Long)100L);
    loginDTO2.setUserId((java.lang.Long)(-1L));
    loginDTO2.setToken("hi!");
    java.lang.String str7 = loginDTO2.getToken();
    loginDTO2.setToken("hi!");
    java.lang.Long long10 = loginDTO2.getUserId();
    loginDTO2.setToken("");
    loginDTO2.setToken("");
    java.lang.Long long15 = loginDTO2.getUserId();
    java.lang.Long long16 = loginDTO2.getUserId();
    loginDTO2.setToken("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L)+ "'", long10.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L)+ "'", long15.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L)+ "'", long16.equals((-1L)));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test494"); }

    br.edu.ufcg.es.model.DTO.AuthDTO authDTO0 = new br.edu.ufcg.es.model.DTO.AuthDTO();
    authDTO0.setEmail("");
    java.lang.String str3 = authDTO0.getPassword();
    authDTO0.setEmail("");
    java.lang.String str6 = authDTO0.getEmail();
    java.lang.String str7 = authDTO0.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test495"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setDate("");
    java.lang.String str3 = registerGame0.getSport();
    registerGame0.setDescription("hi!");
    registerGame0.setDescription("hi!");
    java.lang.String str8 = registerGame0.getName();
    registerGame0.setDate("hi!");
    registerGame0.setName("");
    registerGame0.setSport("");
    java.lang.String str15 = registerGame0.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test496"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    registerGame0.setDescription("");
    java.lang.String str5 = registerGame0.getDescription();
    java.lang.String str6 = registerGame0.getDate();
    registerGame0.setLocal("hi!");
    registerGame0.setDescription("");
    registerGame0.setName("");
    registerGame0.setName("");
    registerGame0.setName("hi!");
    java.lang.String str17 = registerGame0.getLocal();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test497"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    registerGame0.setSport("hi!");
    java.lang.String str3 = registerGame0.getName();
    java.lang.String str4 = registerGame0.getDescription();
    java.lang.String str5 = registerGame0.getSport();
    registerGame0.setDate("hi!");
    registerGame0.setLocal("hi!");
    registerGame0.setLocal("");
    registerGame0.setDescription("");
    java.lang.String str14 = registerGame0.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test498"); }

    br.edu.ufcg.es.model.DTO.LoginDTO loginDTO2 = new br.edu.ufcg.es.model.DTO.LoginDTO("", (java.lang.Long)1L);
    loginDTO2.setUserId((java.lang.Long)(-1L));
    java.lang.Long long5 = loginDTO2.getUserId();
    loginDTO2.setToken("hi!");
    loginDTO2.setUserId((java.lang.Long)10L);
    loginDTO2.setUserId((java.lang.Long)(-1L));
    loginDTO2.setToken("");
    java.lang.Long long14 = loginDTO2.getUserId();
    loginDTO2.setUserId((java.lang.Long)100L);
    loginDTO2.setToken("");
    loginDTO2.setUserId((java.lang.Long)10L);
    java.lang.String str21 = loginDTO2.getToken();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L)+ "'", long5.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L)+ "'", long14.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test499"); }

    br.edu.ufcg.es.model.DTO.RatingParameters ratingParameters0 = new br.edu.ufcg.es.model.DTO.RatingParameters();
    int i1 = ratingParameters0.getAbility();
    int i2 = ratingParameters0.getAbility();
    ratingParameters0.setAbility((int)'a');
    ratingParameters0.setFairPlay(35);
    int i7 = ratingParameters0.getFairPlay();
    ratingParameters0.setAbility((int)' ');
    ratingParameters0.setFairPlay((int)'4');
    ratingParameters0.setAbility((int)(short)0);
    ratingParameters0.setFairPlay((-1));
    int i16 = ratingParameters0.getAbility();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test500"); }

    br.edu.ufcg.es.model.DTO.RegisterGame registerGame0 = new br.edu.ufcg.es.model.DTO.RegisterGame();
    java.lang.String str1 = registerGame0.getName();
    registerGame0.setDate("");
    java.lang.String str4 = registerGame0.getDate();
    registerGame0.setLocal("");
    java.lang.String str7 = registerGame0.getName();
    java.lang.String str8 = registerGame0.getDescription();
    registerGame0.setSport("");
    registerGame0.setLocal("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

}
