package iut.tdd;

import junit.framework.Assert;
import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero () {
		
		Assert.assertEquals("zéro", Convert.num2text("0"));
	}
	@Test
	public void test_num2text_un () {
	
		Assert.assertEquals("un", Convert.num2text("1"));
	}
	@Test
	public void test_num2text_deux () {

		Assert.assertEquals("deux", Convert.num2text("2"));
	}
	@Test
	public void test_num2text_trois () {
		Assert.assertEquals("trois", Convert.num2text("3"));
	}
	@Test
	public void test_num2text_quatre () {
		Assert.assertEquals("quatre", Convert.num2text("4"));
	}
	@Test
	public void test_num2text_cinq () {
		Assert.assertEquals("cinq", Convert.num2text("5"));
	}
	@Test
	public void test_num2text_six () {
		// Given
		String input = "6";
		String expected = "six";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_sept () {
		// Given
		String input = "7";
		String expected = "sept";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_huit () {
		// Given
		String input = "8";
		String expected = "huit";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_neuf () {
		// Given
		String input = "9";
		String expected = "neuf";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_dix () {
		// Given
		String input = "10";
		String expected = "dix";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}@Test
	public void test_num2text_onze () {
		// Given
		String input = "11";
		String expected = "onze";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_douze () {
		// Given
		String input = "12";
		String expected = "douze";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_treize () {
		// Given
		String input = "13";
		String expected = "treize";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_quatorze () {
		// Given
		String input = "14";
		String expected = "quatorze";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_quinze () {
		// Given
		String input = "15";
		String expected = "quinze";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_seize () {
		// Given
		String input = "16";
		String expected = "seize";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_vingt () {
		// Given
		String input = "20";
		String expected = "vingt";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_trente () {
		// Given
		String input = "30";
		String expected = "trente";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_quarante () {
		// Given
		String input = "40";
		String expected = "quarante";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_cinquante () {
		// Given
		String input = "50";
		String expected = "cinquante";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_soixante () {
		// Given
		String input = "60";
		String expected = "soixante";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_cent () {
		// Given
		String input = "100";
		String expected = "cent";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_mille () {
		// Given
		String input = "1000";
		String expected = "mille";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_million () {
		// Given
		String input = "000000";
		String expected = "million";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_milliard () {
		// Given
		String input = "000000000";
		String expected = "milliard";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_dix_sept () {
		// Given
		String input = "17";
		String expected = "dix-sept";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_num2text_75 () {
		// Given
		String input = "78";
		String expected = "soixante-dix-huit";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
}
