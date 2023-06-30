from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:

    driver.get("https://training-support.net/selenium/login-form")

    print("Title of Login page: ", driver.title)

    driver.find_element(By.XPATH, "//input[@id='username']").send_keys("admin")

    driver.find_element(By.XPATH, "//input[@id='password']").send_keys("password")

    driver.find_element(By.XPATH, "//button[text()='Log in']").click()
    expected = driver\
        .find_element(By.XPATH, "//div[@id='action-confirmation']")\
        .text
    print(expected)

    driver.close()

