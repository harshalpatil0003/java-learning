package Popup;

import java.util.Base64;

import UtilityClass.BaseClass;

public class JsAlerts extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		preCondition("firefox", "https://demowebshop.tricentis.com/");
		login();
	}
}
