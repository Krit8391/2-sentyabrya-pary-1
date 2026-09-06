class Cat:
    def __init__(self, breed: str, name: str, age: int) -> None:
        self.breed = breed
        self.name = name
        self.age = age

cat1 = Cat('Сиамский', 'Барск', 7)
cat2 = Cat('Британский', 'Сема', 2)
cat3 = Cat('Сфинкс', 'Виталя', 12)

for cat in [cat1, cat2, cat3]:
    print(f'Порода: {cat.breed}, Имя: {cat.name}, Возраст: {cat.age}') 