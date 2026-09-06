class Figure:
    def __init__(self, coords: tuple[int], width: int, color: str) -> None:
        self.coords = coords
        self.width = width 
        self.color = color

class Line(Figure):
    def __init__(self, coords: tuple[int], width: int, color: str, length: int) -> None:
        super().__init__(coords, width, color)
        self.length = length

class Rect(Figure):
    def __init__(self, coords: tuple[int], width: int, color: str, height: int) -> None:
        super().__init__(coords, width, color) 
        self.height = height

class Ellipse(Figure): 
    def __init__(self, coords: tuple[int], width: int, color: str, radius: float) -> None:
        super().__init__(coords, width, color)
        self.radius = radius