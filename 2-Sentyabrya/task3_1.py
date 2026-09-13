class Car:
    def __init__(self) -> None:
        self._engine_temperature = 20
    
    def start_engine(self) -> None:
        self._engine_temperature = 90
        print('Двигатель прогрет :3')

    def drive(self) -> None:
        if self._engine_temperature >= 90:
            print('Поехали!')

car = Car()

print(car._engine_temperature) # Выведет, но так делать не принято ^^

car.drive() # Ничего не выведет

car.start_engine()
car.drive()