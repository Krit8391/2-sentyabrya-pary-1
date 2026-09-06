class Figure:
    def __init__(self, coords: tuple[int, int], width: int, color: str) -> None:
        self.coords = coords
        self.width = width 
        self.color = color

    def draw(self) -> None:
        print('Рисуется фигура')

class Line(Figure):
    def __init__(self, coords: tuple[int, int], width: int, color: str, length: int) -> None:
        super().__init__(coords, width, color)
        self.length = length

    def draw(self) -> None:
        print('Рисуется линия')

class Rect(Figure):
    def __init__(self, coords: tuple[int, int], width: int, color: str, height: int) -> None:
        super().__init__(coords, width, color) 
        self.height = height

    def draw(self) -> None:
        print('Рисуется прямоугольник')

class Ellipse(Figure): 
    def __init__(self, coords: tuple[int, int], width: int, color: str, radius: float) -> None:
        super().__init__(coords, width, color)
        self.radius = radius

    def draw(self) -> None:
        print('Рисуется эллипс')

class Triangle(Figure):
    def __init__(self, coords: tuple[int, int], width: int, color: str) -> None:
        super().__init__(coords, width, color)

    def draw(self) -> None:
        print('Рисуется треугольник')

figures = []

figures.append(Line((8, 9), 10, 'Синий', 25))
figures.append(Rect((2, 2), 5, 'Красный', 10))
figures.append(Ellipse((1, 1), 7, 'Фиолетовый <3', 11))
figures.append(Triangle((4, 7), 9, 'Розовый'))

for figure in figures:
    figure.draw()