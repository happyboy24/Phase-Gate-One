import random

print("WELCOME TO SIMPLE ARITHMETIC APPP")
scores = 0

for count in range(1, 11):
		first_number = random.randint(0, 50)
		second_number = random.randint(0, 20)
print(f" Question: what is", first_number, -  second_number)


for attempt in range(1, 9):
		Answer = int(input("your answer: "))
		if Answer == first_number - second_number:
			print("correct answer")
			print(f" Question: what is", first_number, -  second_number)


			scores =  scores + 1
		break

		if Answer != first_number - second_number:

			print("incorrect answer")