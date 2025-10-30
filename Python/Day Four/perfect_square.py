def perfect_square(test_list):
	i = 1
	for num in test_list:
		if num == i*i:
			return True
		else:
			return False
	i = i + 1

test_list = [4, 9, 25, 49]
print(perfect_square(test_list))