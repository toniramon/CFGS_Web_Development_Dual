"""
Now that we have a Block let's move on to something slightly more complex a Sphere.

#Arguments for the constructor

radius -> integer or float (do not round it)
mass -> integer or float (do not round it)
#Methods to be defined

get_radius()       =>  radius of the Sphere (do not round it)
get_mass()         =>  mass of the Sphere (do not round it)
get_volume()       =>  volume of the Sphere (rounded to 5 place after the decimal)
get_surface_area() =>  surface area of the Sphere (rounded to 5 place after the decimal)
get_density()      =>  density of the Sphere (rounded to 5 place after the decimal)
##Example

ball = Sphere(2,50)
ball.get_radius() ->       2
ball.get_mass() ->         50
ball.get_volume() ->       33.51032
ball.get_surface_area() -> 50.26548
ball.get_density() ->      1.49208
Any feedback would be much appreciated
"""

import math
class Sphere(object):
	# Good Luck!
    def __init__(self, radius, mass):
        self.radius = radius
        self.mass = mass
    
    def get_radius(self):
        return self.radius
    def get_mass(self):
        return self.mass
    def get_volume(self):
        return round(math.pi * self.radius * self.radius * self.radius * 4/3, 5)
    def get_surface_area(self):
        surface_area = round(4 * math.pi * self.radius * self.radius, 5)
        return surface_area
    def get_density(self):
        return round(self.mass / (math.pi * self.radius * self.radius * self.radius * 4/3),5)
    