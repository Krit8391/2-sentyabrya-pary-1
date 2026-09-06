import math 
import random

class Figure:
    def __init__(self, coords: tuple[int, int], width: int, color: str) -> None:
        self._coords = coords
        self.width = width 
        self.color = color

    def get_coords(self) -> tuple[int, int]:
        return self._coords

    def set_coords(self, coords: tuple[int, int]) -> None:
        self._coords = coords

class Circle(Figure): 
    def __init__(self, coords: tuple[int, int], width: int, color: str, radius: float) -> None:
        super().__init__(coords, width, color)
        self.radius = radius

    def calculate_area(self) -> float:
        return math.pi * (self.radius ** 2)

class Square(Figure):
    def __init__(self, coords: tuple[int, int], width: int, color: str, side: float) -> None:
        super().__init__(coords, width, color)
        self.side = side

    def calculate_area(self) -> float:
        return self.side ** 2

figures = []

figures.append(Circle((1, 1), 10, 'Красный', 5))
figures.append(Circle((2, 5), 13, 'Хакки', 8))
figures.append(Square((5, 5), 2, 'Синий', 4))
figures.append(Square((1, 8), 3, 'Фиолетовый', 7))
figures.append(Square((6, 5), 6, 'Серый', 10))

for figure in figures:
    print(f'Площадь: {figure.calculate_area()}')