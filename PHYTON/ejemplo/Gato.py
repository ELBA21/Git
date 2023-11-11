class Gato:
    # atributos
    #metodos

    def __init__(self, name, sex, age, weight, color, texture):
        self.__name = name
        self.sex = sex
        self.age = age
        self.weight = weight
        self.color = color
        self.texture = texture

    def eat(self):
        print(self.__name + " esta comiendo...")

    def move(self):
        print(self.__name + " esta caminando...")

    def meow(self):
        print(self.__name + " esta maullando...")

    def purr(self):
        print(self.__name + " esta ronrroneando...")

    def hunt_mice(self):
        print(self.__name + " esta cazando ratones...")