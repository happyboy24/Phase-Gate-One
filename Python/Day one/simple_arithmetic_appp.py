import random

print("WELCOME TO SIMPLE ARITHMETIC APPP")
scores = 0

for count in range(1, 11):
		first_number = random.randint(0, 20)
		second_number = random.randint(0, first_number)
print(f" Question: what is (first_number) - (second_number)?")


for attempt in range(1, 3):
		Answer = int(input("your answer: "))
		if Answer == first_number - second_number:
			print("correct answer")
			scores =  score + 1
		break

		elif 

print("incorrect answer")