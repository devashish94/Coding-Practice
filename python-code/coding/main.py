class Solution:
    def maxStrength(self, nums):
        save = []
        self.generate(0, nums, 1, save)
        return max(save)

    def generate(self, i, input_array, product, save):
        if i == len(input_array):
            print(product)
            save.append(product)
            return
        self.generate(i + 1, input_array, product, save)
        print(f'i: {i}, value: {input_array[i]}')
        self.generate(i + 1, input_array, product * input_array[i], save)


arr = [0,-1]
print(f'answer: {Solution().maxStrength(arr)}')