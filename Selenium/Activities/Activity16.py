import win32clipboard
from selenium import webdriver
from selenium.webdriver import ActionChains, Keys
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.firefox import GeckoDriverManager

service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    wait = WebDriverWait(driver, 10)
    driver.get("https://www.training-support.net/selenium/dynamic-attributes")

    print("Title of Dynamic Attributes page: ", driver.title)

    username = driver.find_element(By.XPATH, "//input[contains(@class, '-username')]")
    password = driver.find_element(By.XPATH, "//input[contains(@class, '-password')]")
    confirm_password = driver.find_element(By.XPATH,
                "//label[contains(text(), 'Confirm Password')]//following::input")
    email = driver.find_element(By.XPATH, "//input[contains(@class, 'email-')]")

    username.send_keys("First")
    password.send_keys("Password")
    confirm_password.send_keys("Password")
    email.send_keys("first_user@gmail.com")

    driver.find_element(By.XPATH, "//button[text()='Sign Up']").click()

    wait.until(expected_conditions
               .visibility_of_element_located((By.ID, "action-confirmation")))

    message = driver.find_element(By.ID, "action-confirmation").text
    print("SignUp message: ", message)


driver.close()

