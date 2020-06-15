package com.demoworkshop.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoworkshop.qa.TestBase;

public class DemoWorkShop_Computers_Page extends TestBase{
	
	public static final Logger log = Logger.getLogger(DemoWorkShop_Books_Page.class.getName());
	
		@FindBy(xpath= "//ul[@class='top-menu']//a[contains(text(),'Computers')]") //e1
		WebElement Computers_Page;
	
		@FindBy(xpath = "//h1[contains(text(),'Computers')]")//e2
		WebElement Verify_Computers_Page;

		@FindBy(id="products-orderby")//e3
		WebElement Select_Products_Sort_By;
	
		@FindBy(id="products-pagesize")//e4
		WebElement Select_Display_products_PageSize;

		@FindBy(id="products-viewmode")//e5
		WebElement Select_View_As_Products;
	
		@FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Desktops')]")//e6
		WebElement Computing_Desktop_Link;
		
		@FindBy(xpath = "//h1[contains(text(),'Computers')]")//e7
		WebElement Verify_Computing_Desktop_Link_Page;
	
		@FindBy(xpath = "//input [@name ='product_attribute_72_5_18']")//e8
		WebElement Build_your_own_cheap_computer_Processor_RadioButton;
		
		@FindBy(xpath = "//input [@name ='product_attribute_72_6_19']")//e9
		WebElement Build_your_own_cheap_computer_Ram_RadioButton;
		
		@FindBy(xpath = "//input [@name ='product_attribute_72_3_20']")//e10
		WebElement Build_your_own_cheap_computer_HDD_RadioButton;
		
		@FindBy(xpath = "//input [@name ='product_attribute_72_8_30']")//e11
		WebElement Build_your_own_cheap_computer_Processor_CheckBoxButton;
		
		@FindBy(id = "addtocart_72_EnteredQuantity")//e12
		WebElement Add_Quantity_Build_your_own_cheap_computer_Processor;
	
		@FindBy(id = "add-to-cart-button-72")//e13
		WebElement Add_To_Cart_Botton_Build_your_own_cheap_computer_Processor;
	
		@FindBy(xpath = "//a[contains(text(),'Build your own computer')]")//e14
		WebElement Build_your_own_computer;

		@FindBy(xpath = "//label[contains(text(),'Processor')]")//e15
		WebElement Build_your_own_cheap_computer_Processor_DropDown;
		
		@FindBy(xpath = "//label[contains(text(),'RAM')]")//e16
		WebElement Build_your_own_computer_Ram_DropDown;
		
		@FindBy(xpath = "//input[@ name=\"product_attribute_16_3_6\"]")//e17
		WebElement Build_your_own_computer_HDD_RadioButton;
		
		@FindBy(xpath = "//input[@name=\"product_attribute_16_4_7\"]")//e18
		WebElement Build_your_own_computer_OS_RadioButton;
		
		@FindBy(xpath = "//input[@name=\"product_attribute_16_8_8\"]")//e19
		WebElement Build_your_own_computer_Processor_CheckBox;
		
		@FindBy(id = "addtocart_16_EnteredQuantity")//e20
		WebElement Add_Quantity_Build_your_own_computer;
	
		@FindBy(id = "add-to-cart-button-16")//e21
		WebElement Add_To_Cart_Botton_Build_your_own_computer;
	
		@FindBy(xpath = "//a[contains(text(),'Build your own expensive computer')]")//e22
		WebElement Buildyour_own_expensive_computer_Link;	

		@FindBy(xpath = "//input[@name=\"product_attribute_74_5_26\"]")//e23
		WebElement Buildyour_own_expensive_computer_Processor_RadioButton;
		
		@FindBy(xpath = "//input[@name=\"product_attribute_74_6_27\"]")//e24
		WebElement Buildyour_own_expensive_computer_Ram_RadioButton;
		
		@FindBy(xpath = "//input[@name=\"product_attribute_74_3_28\"]")//e25
		WebElement Buildyour_own_expensive_computer_HDD_RadioButton;
		
		@FindBy(xpath = "//input[@name=\"product_attribute_74_8_29\"]")//e26
		WebElement Buildyour_own_expensive_computer_Software_CheckBoxButton;
		
		@FindBy(id = "addtocart_74_EnteredQuantity")//e27
		WebElement Add_Quantity_Buildyour_own_expensive_computer;
	
		@FindBy(id = "add-to-cart-button-74")//e28
		WebElement Add_To_Cart_Botton_Buildyour_own_expensive_computer;
		
		@FindBy(xpath = "//a[contains(text(),'Desktop PC with CDRW')]")//e29
		WebElement Desktop_PC_with_CDRW_Link;
		
		@FindBy(xpath = "//h1[contains(text(),'Desktop PC with CDRW')]")//e30
		WebElement Verify_Desktop_PC_with_CDRW_Link_Page;
		
		@FindBy(xpath = "//a[contains(text(),'Elite Desktop PC')]")//e31
		WebElement Elite_Desktop_PC_Link;
		
		@FindBy(xpath = "//h1[contains(text(),'Elite Desktop PC')]")//e32
		WebElement Verify_Elite_Desktop_PC_Link_Page;
		
		@FindBy(xpath = "//a[contains(text(),'Simple Computer')]")//e33
		WebElement Simple_Computer_Link;
		
		@FindBy(xpath = "//label[contains(text(),'Processor')]")//e34
		WebElement Simple_Computer_Processor_RadioButton;
		
		@FindBy(xpath = "//input[@name=\"product_attribute_74_6_27\"]")//e35
		WebElement Simple_Computer_Ram_RadioButton;
		
		@FindBy(xpath = "//input[@name=\"product_attribute_74_3_28\"]")//e36
		WebElement Simple_Computer_HDD_RadioButton;
		
		@FindBy(xpath = "//input[@name=\"product_attribute_74_8_29\"]")//e37
		WebElement Simple_Computer_Software_CheckBoxButton;
		
		@FindBy(id = "addtocart_74_EnteredQuantity")//e38
		WebElement Add_Quantity_Simple_Computer;
	
		@FindBy(id = "add-to-cart-button-74")//e39
		WebElement Add_To_Cart_Botton_Simple_Computer;
		
		@FindBy(xpath= "//h2[@class='title']//a[contains(text(),'Notebooks')]") //e40
		WebElement NoteBook_Link;
	
		@FindBy(xpath = "//h1[contains(text(),'Notebooks')]")//e41
		WebElement Verify_NoteBook_Link_Page;
		
		@FindBy(xpath = "//a[contains(text(),'14.1-inch Laptop')]")//e42
		WebElement NoteBook_14_1_inch_Laptop_Link;
		
		@FindBy(id = "addtocart_31_EnteredQuantity")//e43
		WebElement Add_Quantity_NoteBook_14_1_inch_Laptop_Link;
	
		@FindBy(id = "add-to-cart-button-31")//e44
		WebElement Add_To_Cart_Botton_NoteBook_14_1_inch_Laptop_Link;
		
		
		
	

	public DemoWorkShop_Computers_Page() {
		
		PageFactory.initElements(driver, this);
	}

	public void Click_Computers_Page_Link(String strComputersExp) {
		
		log("Clicking on Apparel_And_Shoes_Link");
		Computers_Page.click();	//e1  
	
		log("Verifying the Apparel_And_Shoes_Page is displayed");
		String strComputersAct = Verify_Computers_Page.getText();	//E2
		System.out.println(strComputersAct);
		if(strComputersExp.equalsIgnoreCase(strComputersAct)){
			log("Jewelry page is displayed with expected :" + strComputersExp + " is matched with Actual value : " + strComputersAct);
		}else {
			log("Jewelry page is not displayed with expected :" + strComputersExp + " is not matched with Actual value : " + strComputersAct);
		}	
		System.out.println("***************************************************");		
	}



}
