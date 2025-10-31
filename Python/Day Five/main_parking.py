import select
from mini_parking_function import *

spaces_left = 20
current_filled_slots = 1
car_activity = 0

def main():
	
	print(" ")

print(f" *** Welcome to {parking_lot_name} *** ")
print(f"Total capacity: {total_space} spaces.")

spaces_left, parking_lot_name = parked_car(current_filled_slots)
current_filled_slots = int(input("Driver enter the number of lot you be taking : "))
if type(spaces_left) == str:
        print(f"Parking failed: {spaces}")
else:

	print("\n--- Car Parked ---")
car_activity += 1
print(f"Activity {car_activity}: Car successfully parked.")
print(f"Current parked cars: {current_filled_slots}. Remaining spaces: {spaces_left}")
current_filled_slots += 1

select = input(print("Do you want to park another car (yes/no)"))
if select == "yes": 
       current_filled_slots = int(input("Driver enter the number of lot you be taking : "))
if type(spaces_left) == str:
        print(f"Parking failed: {spaces}")
else:

	print("\n--- Car Parked ---")
car_activity += 1
print(f"Activity {car_activity}: Car successfully parked.")
print(f"Current parked cars: {current_filled_slots}. Remaining spaces: {spaces_left}")
current_filled_slots += 1


        
      
if select == "no":
       current_filled_slots = input(print("Do you want to leave the lot(yes/no)"))
if select == "yes":
		if type(spaces_left) == str:
        		print(f"Leaving failed (Error state): {spaces_left}")
else:
			print("\n--- car Returned ---")
car_activity += 1
print(f"Activity {car_activity}: Car successfully returned.")
print(f"Current parked cars: {current_filled_slots}. Remaining spaces: {spaces_left}")
current_filled_slots -= 1
		


print("invalid input")







