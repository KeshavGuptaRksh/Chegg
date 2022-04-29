from cmath import rect


class Shape:
    def __init__(self,color,filled):
        self.color=color
        self.filled=filled

#Circle class inheriting Shape class
class Circle(Shape):
    def __init__(self, color, filled,radius):
        super().__init__(color, filled)
        self.radius=radius
    
    #calculate area of circle
    def area(self):
        a=3.14*self.radius**2
        print('Area of Circle : ',a)
    
    #clalculate circumference of circle
    def circumference(self):
        c=2*3.14*self.radius
        print('Circumference of Circle : ',c)


#Rectangle class is also a child class of Shape class
class Rectangle(Shape):
    def __init__(self, color, filled,length,width):
        super().__init__(color, filled)
        self.length=length
        self.width=width

#calculate area of rectangle
    def area(self):
        a=self.length*self.width
        print('Area of Rectangle : ',a)
    
    #calculate perimeter of rectangle
    def perimeter(self):
        p=2*(self.length+self.width)
        print('Perimeter of rectangle : ',p)


#Defining the main method
def main():
    #Object of Circle class
    circle=Circle("green",True,5)
    circle.area()
    circle.circumference()

    #Object of rectangle class
    rect=Rectangle('Red',False,5,3)
    rect.area()
    rect.perimeter()

#call main function
if __name__=="__main__":
    main()