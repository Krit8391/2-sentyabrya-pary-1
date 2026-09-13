class Graph:
    def __init__(self, x: int, y: int, scale: float) -> None:
        self._x = x
        self._y = y
        self._scale = scale

    def move(self, dx: int, dy: int) -> None:
        self._x = dx 
        self._y = dy

    def change_scale(self, factor: float) -> None:
        self._scale = factor

    def __str__(self) -> str:
        return f'X: {self._x}, Y: {self._y}, Scale: {self._scale}'

graph1 = Graph(1, 1, 1.5)
graph2 = Graph(2, 3, 1.1)
graph3 = Graph(5, 9, 1.0)

graph1.move(5, 7)
graph2.change_scale(1.5)

for graph in [graph1, graph2, graph3]:
    print(graph)