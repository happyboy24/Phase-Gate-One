total_space = 20
parking_lot_name = "Okirishi Street Parking Lot"

def parked_car(number_of_slot_filled):
	
	if type(number_of_slot_filled) == int:
		#if number_of_slot_filled == 0:
			#return 0

		if number_of_slot_filled < 0:
        		return "Error: The number of filled slot cannot be negative."

		elif number_of_slot_filled > total_space:
        		return "Error: Cannot have more than 20 cars in the lot."

		#elif number_of_slot_filled > 0:
			#return 1
		#else: 
			#return TypeError ("Invalid input!")

	spaces_left = total_space - number_of_slot_filled

	return spaces_left, parking_lot_name
	






#def parked_cars(number_of_slot_empty):
	
	#if type(number_of_slot_empty) == int:
		#if number_of_slot_empty == 0:
			#return 0
	#elif number_of_slot_empty > 0:
		#return 1
	#else: 
		#return ValueError("Invalid input!")	 
			

	

