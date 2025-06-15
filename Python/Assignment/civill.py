import math

# Dictionaries for each quadrant
quadrant = {1: {}, 2: {}, 3: {}, 4: {}}
sumx = 0
sumy = 0

tot = int(input("Enter the total number of forces: "))

# Input
for i in range(tot):
    quad = int(input("\nEnter the quadrant (1-4): "))
    if quad not in quadrant:
        print("Invalid quadrant. Skipping.")
        continue
    angle = float(input("Enter the angle wrt x-axis in degrees: "))
    force = float(input("Enter the magnitude of the force: "))

    # Adjust angle based on quadrant
    if quad == 1:
        angle = angle
    elif quad == 2:
        angle = 180 - angle
    elif quad == 3:
        angle = 180 + angle
    elif quad == 4:
        angle = 360 - angle

    quadrant[quad][force] = angle

# Calculation
for i in range(1, 5):
    forces = list(quadrant[i].keys())
    angles = list(quadrant[i].values())
    for j in range(len(forces)):
        x = forces[j] * math.cos(math.radians(angles[j]))
        y = forces[j] * math.sin(math.radians(angles[j]))
        sumx += x
        sumy += y

# Output
print("\nThe forces and their respective angles entered are:")
print("Quadrant 1:", quadrant[1])
print("Quadrant 2:", quadrant[2])
print("Quadrant 3:", quadrant[3])
print("Quadrant 4:", quadrant[4])

print(f"\nThe sum of all the components along X axis is: {sumx:.2f}")
print(f"The sum of all the components along Y axis is: {sumy:.2f}")
