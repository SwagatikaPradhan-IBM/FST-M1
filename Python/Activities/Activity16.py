class Car:

    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " is moving")

    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped")

car1 = Car("Hyundai", "Creta", "2023", "Manual", "White")
car2 = Car("Maruti", "GrandVitara", "2023", "Manual", "Red")
car3 = Car("Skoda", "Kushaq", "2023", "Automatic", "Black")

car1.accelerate()
car1.stop()
car2.accelerate()
car2.stop()
car3.accelerate()
car3.stop()