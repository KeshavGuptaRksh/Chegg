class Vehichle:
    def __init__(self,color,year) :
        self.color=color
        self.year=year

class Car(Vehichle):
    def __init__(self, color, year,model,seats):
        super().__init__(color, year)
        self.model=model
        self.seats=seats

    def car_info(self):
        print('Car name : ',self.model)
        print('Manufacturing Year : ',self.year)
        print('Color available : ',self.color)
        print('Passenger Capacity : ',self.seats)


class Bike(Vehichle):
    def __init__(self, color, year,model,seats):
        super().__init__(color, year)
        self.model=model
        self.seats=seats

    def bike_info(self):
        print('Bike name : ',self.model)
        print('Manufacturing Year : ',self.year)
        print('Color available : ',self.color)
        print('Passenger Capacity : ',self.seats)

def main():
    car=Car('White',2019,'Audi A6',5)
    car.car_info()

    bike=Bike('Red','2022','Ducati 900',2)
    bike.bike_info()

if __name__=='__main__':
    main()