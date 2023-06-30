import win32clipboard
from selenium import webdriver
from selenium.webdriver import ActionChains, Keys
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    actions = ActionChains(driver)
    driver.get("https://www.training-support.net/selenium/drag-drop")

    print("Title of Drag & Drop page: ", driver.title)

    football = driver.find_element(By.ID, "draggable")

    dropzone1 = driver.find_element(By.ID, "droppable")
    dropzone2 = driver.find_element(By.ID, "dropzone2")

    actions.drag_and_drop(football, dropzone1).perform()
    if(dropzone1.text.find("Dropped!")):
        print("Football was dropped in dropzone1")

    actions.drag_and_drop(football, dropzone2).perform()
    if(dropzone2.text.find("Dropped!")):
        print("Football was dropped in dropzone2")
    driver.close()

