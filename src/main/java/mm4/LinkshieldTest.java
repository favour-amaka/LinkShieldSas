package com.mm4

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.app.Assertions.assertTrue;

public class LinkshieldTest{
	@Test
	void testHomepageContent(){
		LinkshieldUI ui = new LinkShieldUI();
		String html = ui.home(null);

 		assertTrue(html.contains("LinkShield Live!"), "The UI tittle is missing!");
	}
}