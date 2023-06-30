import win32clipboard
from selenium import webdriver
from selenium.webdriver import ActionChains, Keys
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    actions = ActionChains(driver)
    driver.get("https://www.training-support.net/selenium/input-events")

    print("Title of Input Events page: ", driver.title)

    actions.send_keys("S")
    actions.key_down(Keys.CONTROL)
    actions.send_keys("a")
    actions.send_keys("c")
    actions.key_up(Keys.CONTROL)
    actions.perform()

    win32clipboard.OpenClipboard()
    data = win32clipboard.GetClipboardData()
    win32clipboard.CloseClipboard()
    print(data)

    driver.close()

