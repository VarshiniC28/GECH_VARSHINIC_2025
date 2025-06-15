# This is a program which gives the resultant, and the direction of the resultant, of a system of concurrent forces 

import math # Importing math module for functions like sqrt, radians, degrees, cos, sin, atan

# Declaring required dictionaries
first = []
sec = []
third = []
four = []

# Declaring required global variables
sumx = 0
sumy = 0

quadrant = {1: first, 2: sec, 3: third, 4: four}

total = int(input("Enter the total no of forces in the system : "))

# Input
for i in range(0, total):
    quad = int(input("Enter the quadrant (in numbers) of " + str(i + 1) + " force : "))
    angle = float(input("Enter the angle at which the " + str(i + 1) + " force is acting wrt x axis in degrees : "))
    force = float(input("Enter the magnitude of the " + str(i + 1) + " force : "))

    # Converting angles to the required form for calculations 
    if quad == 1:
        angle = angle
    elif quad == 2:
        angle = 180 - angle
    elif quad == 3:
        angle = angle - 180
    elif quad == 4:
        angle = 360 - angle
        
    quadrant[quad].append((force, angle))

# Calculating the sum of X and Y components 
for i in range(1, 5): # To iterate over all the quadrants

    for force,angle in quadrant[i]: # To iterate over the forces and angles in the quadrant
        x = force * math.cos(math.radians(angle))
        y = force * math.sin(math.radians(angle))
        
        # Adding or subtracting the components based on the quandrant in which lies
        if (i == 1) :
            sumx += x
            sumy += y
        elif(i == 2) :
            sumx -= x
            sumy += y
        elif(i == 3) :
            sumx -= x
            sumy -= y
        elif (i == 4) :
            sumx += x
            sumy -= y

rsumx = round(sumx, 5)
rsumy = round(sumy, 5)

# Calculating the magnitude and direction of the resultant
resultant = math.sqrt((rsumx)**2 + (rsumy)**2)
resangle = math.atan(abs(rsumy)/abs(rsumx))
resangle = math.degrees(resangle)

# Determining the sign of the angle of the resultant wrt X axis 
if(rsumx < 0 and rsumy < 0) :
    resangle = resangle + 180
elif(rsumx < 0 and rsumy > 0) :
    resangle = 180 - resangle
elif(rsumx > 0 and rsumy < 0) :
    resangle = 360 - resangle

# Printing the given information by the user 
print("The forces and their respective angles (1st quadrant) entered are : ",end = "")
print(first)
print("The forces and their respective angles (2nd quadrant) entered are : ",end = "")
print(sec)
print("The forces and their respective angles (3rd quadrant) entered are : ",end = "")
print(third)
print("The forces and their respective angles (4th quadrant) entered are : ",end = "")
print(four)

# Printing the Results
print("The sum of all the components along X axis is : " + str(rsumx))
print("The sum of all the components along y axis is : " + str(rsumy))
print("The Resultant of the given force system is : " + str(resultant))
print("The direction of the resultant of the given force system with respect to positive x axis in degree is : " + str(resangle))