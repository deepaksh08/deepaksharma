package stepdefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;

public class BbbStepDefination {

//	WebDriver driver;
//	Base base;
//
//	public BbbStepDefination(Base base) {
//		this.base = base;
//	}
	
	
		Hooks hook = new Hooks();
		WebDriver driver = hook.setDriver();
	

	@And("user Search for {string} on site")
	public void user_search_for_on_site(String string, io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps();
		String sku = data.get(0).get("SingleSkuItem");
//		base.getDriver().findElement(By.xpath("//*[@id='searchInput']")).sendKeys(sku);
//		base.getDriver().findElement(By.xpath("//*[@data-locator='search_icon']")).click();

	}

	@And("user navigates to PDP page and add item to cart")
	public void user_navigates_to_pdp_page_and_add_item_to_cart() {
//		base.getDriver().findElement(By.xpath("//*[@id='atc-cta']")).click();

	}

}
