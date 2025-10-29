def unique_numbers(nums):
	my_unique_number = []
	for count in nums:
		nums.append(count++2)
		count = count + 2

	return my_unique_number
nums =  [1,22,3,2]
print(unique_numbers(nums))

