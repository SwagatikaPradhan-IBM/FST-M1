from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:

    driver.get("https://www.training-support.net/selenium/target-practice")

    print("Title of Target Practice page: ", driver.title)

    third_header = driver.find_element(By.XPATH, "//h3[@id='third-header']").text
    print(third_header)

    fifth_header_color=driver.find_element(By.XPATH, "//h5[text()='Fifth header']")\
        .value_of_css_property("color")
    print(fifth_header_color)

    violet_classes = driver.find_element(By.CSS_SELECTOR, ".ui.violet.button")\
        .get_attribute("class")
    print(violet_classes)

    grey_text = driver.find_element(By.CSS_SELECTOR, ".ui.grey.button").text
    print(grey_text)

    driver.close()

